/**
 */
package simplepdl.tests;

import junit.textui.TestRunner;

import simplepdl.SimplepdlFactory;
import simplepdl.UtilisationRessource;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Utilisation Ressource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilisationRessourceTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UtilisationRessourceTest.class);
	}

	/**
	 * Constructs a new Utilisation Ressource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilisationRessourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Utilisation Ressource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UtilisationRessource getFixture() {
		return (UtilisationRessource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplepdlFactory.eINSTANCE.createUtilisationRessource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UtilisationRessourceTest
