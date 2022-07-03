/**
 */
package tqlModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tqlModel.TqlModelPackage
 * @generated
 */
public interface TqlModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TqlModelFactory eINSTANCE = tqlModel.impl.TqlModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>parameter Expression</em>'.
	 * @generated
	 */
	parameterExpression createparameterExpression();

	/**
	 * Returns a new object of class '<em>String Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Constant Expression</em>'.
	 * @generated
	 */
	StringConstantExpression createStringConstantExpression();

	/**
	 * Returns a new object of class '<em>Boolean Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Constant Expression</em>'.
	 * @generated
	 */
	BooleanConstantExpression createBooleanConstantExpression();

	/**
	 * Returns a new object of class '<em>Integer Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Constant Expression</em>'.
	 * @generated
	 */
	IntegerConstantExpression createIntegerConstantExpression();

	/**
	 * Returns a new object of class '<em>Mapping Source Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Source Table</em>'.
	 * @generated
	 */
	MappingSourceTable createMappingSourceTable();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>In Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Expression</em>'.
	 * @generated
	 */
	InExpression createInExpression();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Conditional Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Statement</em>'.
	 * @generated
	 */
	ConditionalStatement createConditionalStatement();

	/**
	 * Returns a new object of class '<em>Parse Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parse Expression</em>'.
	 * @generated
	 */
	ParseExpression createParseExpression();

	/**
	 * Returns a new object of class '<em>Float Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Constant Expression</em>'.
	 * @generated
	 */
	FloatConstantExpression createFloatConstantExpression();

	/**
	 * Returns a new object of class '<em>Mapping Target Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Target Table</em>'.
	 * @generated
	 */
	MappingTargetTable createMappingTargetTable();

	/**
	 * Returns a new object of class '<em>Mapping Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Field</em>'.
	 * @generated
	 */
	MappingField createMappingField();

	/**
	 * Returns a new object of class '<em>Binary Operation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Operation Expression</em>'.
	 * @generated
	 */
	BinaryOperationExpression createBinaryOperationExpression();

	/**
	 * Returns a new object of class '<em>Table Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Field</em>'.
	 * @generated
	 */
	TableField createTableField();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Boolean Operation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Operation Expression</em>'.
	 * @generated
	 */
	BooleanOperationExpression createBooleanOperationExpression();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Transformation Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Call</em>'.
	 * @generated
	 */
	TransformationCall createTransformationCall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TqlModelPackage getTqlModelPackage();

} //TqlModelFactory
