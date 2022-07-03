/**
 */
package tqlModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tqlModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tqlModel.TqlModelPackage
 * @generated
 */
public class TqlModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TqlModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TqlModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TqlModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TqlModelSwitch<Adapter> modelSwitch = new TqlModelSwitch<Adapter>() {
		@Override
		public Adapter caseparameterExpression(parameterExpression object) {
			return createparameterExpressionAdapter();
		}

		@Override
		public Adapter caseStringConstantExpression(StringConstantExpression object) {
			return createStringConstantExpressionAdapter();
		}

		@Override
		public Adapter caseBooleanConstantExpression(BooleanConstantExpression object) {
			return createBooleanConstantExpressionAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseIntegerConstantExpression(IntegerConstantExpression object) {
			return createIntegerConstantExpressionAdapter();
		}

		@Override
		public Adapter caseMappingSourceTable(MappingSourceTable object) {
			return createMappingSourceTableAdapter();
		}

		@Override
		public Adapter caseMapping(Mapping object) {
			return createMappingAdapter();
		}

		@Override
		public Adapter caseInExpression(InExpression object) {
			return createInExpressionAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseConditionalStatement(ConditionalStatement object) {
			return createConditionalStatementAdapter();
		}

		@Override
		public Adapter caseParseExpression(ParseExpression object) {
			return createParseExpressionAdapter();
		}

		@Override
		public Adapter caseFloatConstantExpression(FloatConstantExpression object) {
			return createFloatConstantExpressionAdapter();
		}

		@Override
		public Adapter caseConstantExpression(ConstantExpression object) {
			return createConstantExpressionAdapter();
		}

		@Override
		public Adapter caseMappingTargetTable(MappingTargetTable object) {
			return createMappingTargetTableAdapter();
		}

		@Override
		public Adapter caseMappingField(MappingField object) {
			return createMappingFieldAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseBinaryOperationExpression(BinaryOperationExpression object) {
			return createBinaryOperationExpressionAdapter();
		}

		@Override
		public Adapter caseTableField(TableField object) {
			return createTableFieldAdapter();
		}

		@Override
		public Adapter caseTransformation(Transformation object) {
			return createTransformationAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseBooleanOperationExpression(BooleanOperationExpression object) {
			return createBooleanOperationExpressionAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseTransformationCall(TransformationCall object) {
			return createTransformationCallAdapter();
		}

		@Override
		public Adapter caseOperationExpression(OperationExpression object) {
			return createOperationExpressionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.parameterExpression <em>parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.parameterExpression
	 * @generated
	 */
	public Adapter createparameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.StringConstantExpression <em>String Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.StringConstantExpression
	 * @generated
	 */
	public Adapter createStringConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.BooleanConstantExpression <em>Boolean Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.BooleanConstantExpression
	 * @generated
	 */
	public Adapter createBooleanConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.IntegerConstantExpression <em>Integer Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.IntegerConstantExpression
	 * @generated
	 */
	public Adapter createIntegerConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.MappingSourceTable <em>Mapping Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.MappingSourceTable
	 * @generated
	 */
	public Adapter createMappingSourceTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.InExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.InExpression
	 * @generated
	 */
	public Adapter createInExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.ConditionalStatement
	 * @generated
	 */
	public Adapter createConditionalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.ParseExpression <em>Parse Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.ParseExpression
	 * @generated
	 */
	public Adapter createParseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.FloatConstantExpression <em>Float Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.FloatConstantExpression
	 * @generated
	 */
	public Adapter createFloatConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.ConstantExpression
	 * @generated
	 */
	public Adapter createConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.MappingTargetTable <em>Mapping Target Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.MappingTargetTable
	 * @generated
	 */
	public Adapter createMappingTargetTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.MappingField <em>Mapping Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.MappingField
	 * @generated
	 */
	public Adapter createMappingFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.BinaryOperationExpression <em>Binary Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.BinaryOperationExpression
	 * @generated
	 */
	public Adapter createBinaryOperationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.TableField <em>Table Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.TableField
	 * @generated
	 */
	public Adapter createTableFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.BooleanOperationExpression <em>Boolean Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.BooleanOperationExpression
	 * @generated
	 */
	public Adapter createBooleanOperationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.TransformationCall <em>Transformation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.TransformationCall
	 * @generated
	 */
	public Adapter createTransformationCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tqlModel.OperationExpression <em>Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tqlModel.OperationExpression
	 * @generated
	 */
	public Adapter createOperationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TqlModelAdapterFactory
