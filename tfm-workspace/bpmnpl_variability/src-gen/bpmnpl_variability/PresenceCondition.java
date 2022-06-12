/**
 */
package bpmnpl_variability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presence Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmnpl_variability.PresenceCondition#getElements <em>Elements</em>}</li>
 *   <li>{@link bpmnpl_variability.PresenceCondition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getPresenceCondition()
 * @model
 * @generated
 */
public interface PresenceCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getPresenceCondition_Elements()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<EObject> getElements();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getPresenceCondition_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link bpmnpl_variability.PresenceCondition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // PresenceCondition
