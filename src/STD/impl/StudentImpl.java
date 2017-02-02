/**
 */
package STD.impl;

import STD.STDPackage;
import STD.Student;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link STD.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link STD.impl.StudentImpl#getRollNo <em>Roll No</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRollNo() <em>Roll No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollNo()
	 * @generated
	 * @ordered
	 */
	protected static final int ROLL_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRollNo() <em>Roll No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollNo()
	 * @generated
	 * @ordered
	 */
	protected int rollNo = ROLL_NO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STDPackage.Literals.STUDENT;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STDPackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollNo(int newRollNo) {
		int oldRollNo = rollNo;
		rollNo = newRollNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STDPackage.STUDENT__ROLL_NO, oldRollNo, rollNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case STDPackage.STUDENT__NAME:
				return getName();
			case STDPackage.STUDENT__ROLL_NO:
				return getRollNo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case STDPackage.STUDENT__NAME:
				setName((String)newValue);
				return;
			case STDPackage.STUDENT__ROLL_NO:
				setRollNo((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case STDPackage.STUDENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case STDPackage.STUDENT__ROLL_NO:
				setRollNo(ROLL_NO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case STDPackage.STUDENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case STDPackage.STUDENT__ROLL_NO:
				return rollNo != ROLL_NO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", RollNo: ");
		result.append(rollNo);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
