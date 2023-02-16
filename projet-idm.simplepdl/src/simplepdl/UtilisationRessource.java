/**
 */
package simplepdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilisation Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.UtilisationRessource#getQuantiteUtilisee <em>Quantite Utilisee</em>}</li>
 *   <li>{@link simplepdl.UtilisationRessource#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.UtilisationRessource#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getUtilisationRessource()
 * @model
 * @generated
 */
public interface UtilisationRessource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Quantite Utilisee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Utilisee</em>' attribute.
	 * @see #setQuantiteUtilisee(int)
	 * @see simplepdl.SimplepdlPackage#getUtilisationRessource_QuantiteUtilisee()
	 * @model required="true"
	 * @generated
	 */
	int getQuantiteUtilisee();

	/**
	 * Sets the value of the '{@link simplepdl.UtilisationRessource#getQuantiteUtilisee <em>Quantite Utilisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Utilisee</em>' attribute.
	 * @see #getQuantiteUtilisee()
	 * @generated
	 */
	void setQuantiteUtilisee(int value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getUtilisationRessource_Ressource()
	 * @model required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.UtilisationRessource#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Workdefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workdefinition</em>' reference.
	 * @see #setWorkdefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getUtilisationRessource_Workdefinition()
	 * @model required="true"
	 * @generated
	 */
	WorkDefinition getWorkdefinition();

	/**
	 * Sets the value of the '{@link simplepdl.UtilisationRessource#getWorkdefinition <em>Workdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workdefinition</em>' reference.
	 * @see #getWorkdefinition()
	 * @generated
	 */
	void setWorkdefinition(WorkDefinition value);

} // UtilisationRessource
