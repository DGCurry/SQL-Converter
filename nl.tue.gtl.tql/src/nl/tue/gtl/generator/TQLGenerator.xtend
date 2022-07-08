/*
 * generated by Xtext 2.27.0
 */
package nl.tue.gtl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import nl.tue.gtl.tql.model.TargetTable
import nl.tue.gtl.tql.model.Parameter
import nl.tue.gtl.tql.model.TransformationCall
import java.util.HashMap
import nl.tue.gtl.tql.model.Constant
import nl.tue.gtl.tql.model.BooleanConstant
import nl.tue.gtl.tql.model.FloatConstant
import nl.tue.gtl.tql.model.IntegerConstant
import nl.tue.gtl.tql.model.StringConstant
import nl.tue.gtl.tql.model.DateConstant
import nl.tue.gtl.tql.model.NullConstant
import nl.tue.gtl.tql.model.SetConstant
import nl.tue.gtl.tql.model.CallParameter
import nl.tue.gtl.tql.model.ConstantCallParameter
import nl.tue.gtl.tql.model.ReferenceCallParameter
import nl.tue.gtl.tql.model.Mapping
import nl.tue.gtl.tql.model.Transformation
import nl.tue.gtl.tql.model.Expression
import nl.tue.gtl.tql.model.ParameterExpression
import nl.tue.gtl.tql.model.SelfExpression
import nl.tue.gtl.tql.model.Operator
import nl.tue.gtl.tql.model.BinaryOperatorExpression
import nl.tue.gtl.tql.model.MappedColumn
import nl.tue.gtl.domainmodel.Add_Expression
import nl.tue.gtl.domainmodel.And_Expression
import nl.tue.gtl.domainmodel.Or_Expression
import nl.tue.gtl.domainmodel.Equals_Expression
import nl.tue.gtl.domainmodel.NotEquals_Expression
import nl.tue.gtl.domainmodel.Less_Expression
import nl.tue.gtl.domainmodel.Greater_Expression
import nl.tue.gtl.domainmodel.Multiply_Expression
import nl.tue.gtl.domainmodel.Divide_Expression
import nl.tue.gtl.domainmodel.Subtract_Expression
import nl.tue.gtl.tql.model.Statement
import nl.tue.gtl.tql.model.ConditionalExpression

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TQLGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('Create_Target.sql', getTargetTables(resource))
		fsa.generateFile('Select.sql', getSelectQueries(resource))
		fsa.generateFile('Transfer.sql', getInsertQueries(resource))
	}
	
	def getTargetTables(Resource resource) {
		var tableGenerator = new TargetTableGenerator()
		return '''
		«FOR table : resource.allContents.filter(TargetTable).toIterable()»
			 «tableGenerator.mapTargetTableToTable(table)»
			 
			 
		«ENDFOR»
		'''
	}
	
	def getSelectQueries(Resource resource) {
		return '''
		«FOR mapping : resource.allContents.filter(Mapping).toIterable()»
			 «mapMappingToSelect(mapping)»
			 
			 
		«ENDFOR»
		'''
	}
	
	def getInsertQueries(Resource resource) {
		return '''
		«FOR mapping : resource.allContents.filter(Mapping).toIterable()»
			 «mapMappingToInsert(mapping)»
			 
			 
		«ENDFOR»
		'''
	}
	
	def mapMappingToSelect(Mapping mapping) {
		var simpleReferenceDict = new HashMap<String, CharSequence>();
		for (sourceColumn : mapping.source.columns) {
			simpleReferenceDict.put(sourceColumn.name, sourceColumn.name)
		}
		
		return '''
		SELECT 
			«mapping.mappedColumns.map[mapMappedColumnSource].join(',\n')»
		FROM [«mapping.source.name»]
		«IF mapping.where != null»
		WHERE «resolveExpression(mapping.where, null, simpleReferenceDict)»
		«ENDIF»
		'''
	}
	
	def mapMappingToInsert(Mapping mapping) {
		var simpleReferenceDict = new HashMap<String, CharSequence>();
		for (sourceColumn : mapping.source.columns) {
			simpleReferenceDict.put(sourceColumn.name, sourceColumn.name)
		}
		
		return '''
		INSERT INTO [«mapping.target.name»] («mapping.mappedColumns.map[target.name].join(', ')»)
		SELECT 
			«mapping.mappedColumns.map[mapMappedColumnSource].join(',\n')»
		FROM [«mapping.source.name»]
		«IF mapping.where != null»
		WHERE «resolveExpression(mapping.where, null, simpleReferenceDict)»
		«ENDIF»
		'''
	}
	
	def mapMappedColumnSource(MappedColumn mappedColumn) {
		var selfReference = mappedColumn.source.name
		for (transformationCall : mappedColumn.transformationCalls) {
			selfReference = unzipTransformationCall(transformationCall, selfReference).toString()
		}
		return '''«selfReference» AS «mappedColumn.target.name»''';
	}
	
	// Self gewoon mee geven aan de volgende transfomration call zo is het eerst de column naam daarna is self het return statement van de eerste call
	def unzipTransformationCall(TransformationCall transformationCall, CharSequence selfReference) {
		var referenceDict = mapParameterAndParameterCall(transformationCall)
		return resolveStatement(transformationCall.transformation.body, selfReference, referenceDict)
	}
	
	def CharSequence resolveStatement(Statement statement, CharSequence selfReference, HashMap<String, CharSequence> referenceDict) {
		switch (statement) {
			Expression: resolveExpression(statement, selfReference, referenceDict)
			ConditionalExpression: resolveConditionalExpression(statement, selfReference, referenceDict)
		}
	}
	
	def CharSequence resolveConditionalExpression(ConditionalExpression expression, CharSequence selfReference, HashMap<String, CharSequence> referenceDict) {
		'''
		CASE WHEN «resolveExpression(expression.ifExpression, selfReference, referenceDict)» THEN
			«resolveStatement(expression.ifBody, selfReference, referenceDict)»
		ELSE
			«resolveStatement(expression.elseBody, selfReference, referenceDict)»
		END
		'''
	}
	
	def CharSequence resolveExpression(Expression expression, CharSequence selfReference, HashMap<String, CharSequence> referenceDict) {
		switch (expression) {
			ParameterExpression : '''«referenceDict.get(expression.parameter.name)»'''
			Constant : mapConstant(expression)
			SelfExpression : selfReference
			And_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			Or_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			Equals_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»''' 
			NotEquals_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			Less_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			Greater_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			Multiply_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			Divide_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			Add_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			Subtract_Expression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
			BinaryOperatorExpression : '''«resolveExpression(expression.left, selfReference, referenceDict)» «getOperator(expression.operator)» «resolveExpression(expression.right, selfReference, referenceDict)»'''
		}
	}
	
	def getOperator(Operator operator) {
		switch (operator) {
			case ADD: '''+'''
			case AND: '''AND'''
			case DIVIDE: '''/'''
			case EQUALS: '''='''
			case GREATER: '''>'''
			case LESS: '''<'''
			case MULTIPLY: '''*'''
			case NOT_EQUALS: '''<>'''
			case OR: '''OR'''
			case SUBTRACT: '''-'''
		}
	}
	
	def mapParameterAndParameterCall(TransformationCall transformationCall) {
		var callParameters = transformationCall.callParameters;
		var parameters = transformationCall.transformation.parameters;
		var parameterDict = new HashMap<String, CharSequence>();
		
		for (i : 0 ..< callParameters.length) {
			parameterDict.put(parameters.get(i).name, mapParameter(callParameters.get(i)))
		}
		
		return parameterDict
	}
	
	def mapParameter(CallParameter callParameter) {
		switch (callParameter) {
			ConstantCallParameter : mapConstant(callParameter.parameter)
			ReferenceCallParameter : callParameter.reference.name
		}
	}
	
	def CharSequence mapConstant(Constant constant) {
		switch (constant) {
			BooleanConstant : '''«constant.value»'''
			FloatConstant : '''«constant.value»'''
			IntegerConstant : '''«constant.value»'''
			StringConstant : '''N'«constant.value»' '''
			DateConstant : '''N'«constant.value»' '''
			NullConstant : '''NULL'''
			SetConstant : ''' [ «constant.values.map[mapConstant].join(', ')» ] '''
			default : '''NULL'''
		}
	}
}
