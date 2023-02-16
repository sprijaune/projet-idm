/**
 */
package simplepdl.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>simplepdl</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplepdlTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SimplepdlTests("simplepdl Tests");
		suite.addTestSuite(WorkDefinitionTest.class);
		suite.addTestSuite(WorkSequenceTest.class);
		suite.addTestSuite(GuidanceTest.class);
		suite.addTestSuite(RessourceTest.class);
		suite.addTestSuite(UtilisationRessourceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplepdlTests(String name) {
		super(name);
	}

} //SimplepdlTests
