/**
 */
package tqlModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tqlModel.TqlModelPackage#getBinaryFunction()
 * @model
 * @generated
 */
public enum BinaryFunction implements Enumerator {
	/**
	 * The '<em><b>Mult</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULT_VALUE
	 * @generated
	 * @ordered
	 */
	MULT(0, "mult", "mult"),

	/**
	 * The '<em><b>Sum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM_VALUE
	 * @generated
	 * @ordered
	 */
	SUM(1, "sum", "sum"),

	/**
	 * The '<em><b>Divide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	DIVIDE(2, "divide", "divide"),

	/**
	 * The '<em><b>Concat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCAT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCAT(3, "concat", "concat"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(4, "equal", "equal"),

	/**
	 * The '<em><b>Notequal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOTEQUAL(6, "notequal", "notequal"),

	/**
	 * The '<em><b>Smaller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLER_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLER(7, "smaller", "smaller"),

	/**
	 * The '<em><b>Greater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(7, "greater", "greater"),

	/**
	 * The '<em><b>Or</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(8, "or", "or"),

	/**
	 * The '<em><b>And</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(9, "and", "and");

	/**
	 * The '<em><b>Mult</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULT
	 * @model name="mult"
	 * @generated
	 * @ordered
	 */
	public static final int MULT_VALUE = 0;

	/**
	 * The '<em><b>Sum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM
	 * @model name="sum"
	 * @generated
	 * @ordered
	 */
	public static final int SUM_VALUE = 1;

	/**
	 * The '<em><b>Divide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDE
	 * @model name="divide"
	 * @generated
	 * @ordered
	 */
	public static final int DIVIDE_VALUE = 2;

	/**
	 * The '<em><b>Concat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCAT
	 * @model name="concat"
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT_VALUE = 3;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 4;

	/**
	 * The '<em><b>Notequal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEQUAL
	 * @model name="notequal"
	 * @generated
	 * @ordered
	 */
	public static final int NOTEQUAL_VALUE = 6;

	/**
	 * The '<em><b>Smaller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLER
	 * @model name="smaller"
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_VALUE = 7;

	/**
	 * The '<em><b>Greater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model name="greater"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 7;

	/**
	 * The '<em><b>Or</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model name="or"
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 8;

	/**
	 * The '<em><b>And</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model name="and"
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 9;

	/**
	 * An array of all the '<em><b>Binary Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BinaryFunction[] VALUES_ARRAY = new BinaryFunction[] { MULT, SUM, DIVIDE, CONCAT, EQUAL,
			NOTEQUAL, SMALLER, GREATER, OR, AND, };

	/**
	 * A public read-only list of all the '<em><b>Binary Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BinaryFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryFunction get(int value) {
		switch (value) {
		case MULT_VALUE:
			return MULT;
		case SUM_VALUE:
			return SUM;
		case DIVIDE_VALUE:
			return DIVIDE;
		case CONCAT_VALUE:
			return CONCAT;
		case EQUAL_VALUE:
			return EQUAL;
		case NOTEQUAL_VALUE:
			return NOTEQUAL;
		case SMALLER_VALUE:
			return SMALLER;
		case OR_VALUE:
			return OR;
		case AND_VALUE:
			return AND;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BinaryFunction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //BinaryFunction
