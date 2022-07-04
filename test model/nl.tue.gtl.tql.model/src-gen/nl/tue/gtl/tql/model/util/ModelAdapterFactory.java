/**
 */
package nl.tue.gtl.tql.model.util;

import nl.tue.gtl.tql.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.tue.gtl.tql.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch<Adapter> modelSwitch = new ModelSwitch<Adapter>() {
		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseColumn(Column object) {
			return createColumnAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseSourceTable(SourceTable object) {
			return createSourceTableAdapter();
		}

		@Override
		public Adapter caseTargetTable(TargetTable object) {
			return createTargetTableAdapter();
		}

		@Override
		public Adapter caseMapping(Mapping object) {
			return createMappingAdapter();
		}

		@Override
		public Adapter caseMappedColumn(MappedColumn object) {
			return createMappedColumnAdapter();
		}

		@Override
		public Adapter caseTransformation(Transformation object) {
			return createTransformationAdapter();
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
		public Adapter caseCallParameter(CallParameter object) {
			return createCallParameterAdapter();
		}

		@Override
		public Adapter caseConstant(Constant object) {
			return createConstantAdapter();
		}

		@Override
		public Adapter caseStringConstant(StringConstant object) {
			return createStringConstantAdapter();
		}

		@Override
		public Adapter caseIntegerConstant(IntegerConstant object) {
			return createIntegerConstantAdapter();
		}

		@Override
		public Adapter caseFloatConstant(FloatConstant object) {
			return createFloatConstantAdapter();
		}

		@Override
		public Adapter caseDateConstant(DateConstant object) {
			return createDateConstantAdapter();
		}

		@Override
		public Adapter caseNullConstant(NullConstant object) {
			return createNullConstantAdapter();
		}

		@Override
		public Adapter caseSetConstant(SetConstant object) {
			return createSetConstantAdapter();
		}

		@Override
		public Adapter caseConstantCallParameter(ConstantCallParameter object) {
			return createConstantCallParameterAdapter();
		}

		@Override
		public Adapter caseReferenceCallParameter(ReferenceCallParameter object) {
			return createReferenceCallParameterAdapter();
		}

		@Override
		public Adapter caseBooleanConstant(BooleanConstant object) {
			return createBooleanConstantAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseParameterExpression(ParameterExpression object) {
			return createParameterExpressionAdapter();
		}

		@Override
		public Adapter caseColumnExpression(ColumnExpression object) {
			return createColumnExpressionAdapter();
		}

		@Override
		public Adapter caseBinaryOperatorExpression(BinaryOperatorExpression object) {
			return createBinaryOperatorExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.SourceTable <em>Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.SourceTable
	 * @generated
	 */
	public Adapter createSourceTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.TargetTable <em>Target Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.TargetTable
	 * @generated
	 */
	public Adapter createTargetTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.MappedColumn <em>Mapped Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.MappedColumn
	 * @generated
	 */
	public Adapter createMappedColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.TransformationCall <em>Transformation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.TransformationCall
	 * @generated
	 */
	public Adapter createTransformationCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.CallParameter <em>Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.CallParameter
	 * @generated
	 */
	public Adapter createCallParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.IntegerConstant
	 * @generated
	 */
	public Adapter createIntegerConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.FloatConstant <em>Float Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.FloatConstant
	 * @generated
	 */
	public Adapter createFloatConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.DateConstant <em>Date Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.DateConstant
	 * @generated
	 */
	public Adapter createDateConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.NullConstant <em>Null Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.NullConstant
	 * @generated
	 */
	public Adapter createNullConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.SetConstant <em>Set Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.SetConstant
	 * @generated
	 */
	public Adapter createSetConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.ConstantCallParameter <em>Constant Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.ConstantCallParameter
	 * @generated
	 */
	public Adapter createConstantCallParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.ReferenceCallParameter <em>Reference Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.ReferenceCallParameter
	 * @generated
	 */
	public Adapter createReferenceCallParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.BooleanConstant
	 * @generated
	 */
	public Adapter createBooleanConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.ParameterExpression <em>Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.ParameterExpression
	 * @generated
	 */
	public Adapter createParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.ColumnExpression <em>Column Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.ColumnExpression
	 * @generated
	 */
	public Adapter createColumnExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.gtl.tql.model.BinaryOperatorExpression <em>Binary Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.gtl.tql.model.BinaryOperatorExpression
	 * @generated
	 */
	public Adapter createBinaryOperatorExpressionAdapter() {
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

} //ModelAdapterFactory
