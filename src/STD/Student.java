/**
 */
package STD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link STD.Student#getName <em>Name</em>}</li>
 *   <li>{@link STD.Student#getRollNo <em>Roll No</em>}</li>
 *   <li>{@link STD.Student#getStandard <em>Standard</em>}</li>
 * </ul>
 *
 * @see STD.STDPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see STD.STDPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link STD.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Roll No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll No</em>' attribute.
	 * @see #setRollNo(int)
	 * @see STD.STDPackage#getStudent_RollNo()
	 * @model
	 * @generated
	 */
	int getRollNo();

	/**
	 * Sets the value of the '{@link STD.Student#getRollNo <em>Roll No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll No</em>' attribute.
	 * @see #getRollNo()
	 * @generated
	 */
	void setRollNo(int value);

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' attribute.
	 * @see #setStandard(String)
	 * @see STD.STDPackage#getStudent_Standard()
	 * @model
	 * @generated
	 */
	String getStandard();

	/**
	 * Sets the value of the '{@link STD.Student#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' attribute.
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(String value);

} // Student
