/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.UtilisationRessource;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilisation Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.UtilisationRessourceImpl#getQuantiteUtilisee <em>Quantite Utilisee</em>}</li>
 *   <li>{@link simplepdl.impl.UtilisationRessourceImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.impl.UtilisationRessourceImpl#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilisationRessourceImpl extends ProcessElementImpl implements UtilisationRessource {
	/**
	 * The default value of the '{@link #getQuantiteUtilisee() <em>Quantite Utilisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteUtilisee()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITE_UTILISEE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantiteUtilisee() <em>Quantite Utilisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteUtilisee()
	 * @generated
	 * @ordered
	 */
	protected int quantiteUtilisee = QUANTITE_UTILISEE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * The cached value of the '{@link #getWorkdefinition() <em>Workdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkdefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workdefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilisationRessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.UTILISATION_RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantiteUtilisee() {
		return quantiteUtilisee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantiteUtilisee(int newQuantiteUtilisee) {
		int oldQuantiteUtilisee = quantiteUtilisee;
		quantiteUtilisee = newQuantiteUtilisee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_UTILISEE, oldQuantiteUtilisee, quantiteUtilisee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressource getRessource() {
		if (ressource != null && ressource.eIsProxy()) {
			InternalEObject oldRessource = (InternalEObject)ressource;
			ressource = (Ressource)eResolveProxy(oldRessource);
			if (ressource != oldRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE, oldRessource, ressource));
			}
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRessource(Ressource newRessource) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE, oldRessource, ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getWorkdefinition() {
		if (workdefinition != null && workdefinition.eIsProxy()) {
			InternalEObject oldWorkdefinition = (InternalEObject)workdefinition;
			workdefinition = (WorkDefinition)eResolveProxy(oldWorkdefinition);
			if (workdefinition != oldWorkdefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.UTILISATION_RESSOURCE__WORKDEFINITION, oldWorkdefinition, workdefinition));
			}
		}
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkdefinition() {
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkdefinition(WorkDefinition newWorkdefinition) {
		WorkDefinition oldWorkdefinition = workdefinition;
		workdefinition = newWorkdefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.UTILISATION_RESSOURCE__WORKDEFINITION, oldWorkdefinition, workdefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_UTILISEE:
				return getQuantiteUtilisee();
			case SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE:
				if (resolve) return getRessource();
				return basicGetRessource();
			case SimplepdlPackage.UTILISATION_RESSOURCE__WORKDEFINITION:
				if (resolve) return getWorkdefinition();
				return basicGetWorkdefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_UTILISEE:
				setQuantiteUtilisee((Integer)newValue);
				return;
			case SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
			case SimplepdlPackage.UTILISATION_RESSOURCE__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)newValue);
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
			case SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_UTILISEE:
				setQuantiteUtilisee(QUANTITE_UTILISEE_EDEFAULT);
				return;
			case SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE:
				setRessource((Ressource)null);
				return;
			case SimplepdlPackage.UTILISATION_RESSOURCE__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)null);
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
			case SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_UTILISEE:
				return quantiteUtilisee != QUANTITE_UTILISEE_EDEFAULT;
			case SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE:
				return ressource != null;
			case SimplepdlPackage.UTILISATION_RESSOURCE__WORKDEFINITION:
				return workdefinition != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantiteUtilisee: ");
		result.append(quantiteUtilisee);
		result.append(')');
		return result.toString();
	}

} //UtilisationRessourceImpl
