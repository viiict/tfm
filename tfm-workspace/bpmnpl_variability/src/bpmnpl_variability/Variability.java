/**
 */
package bpmnpl_variability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmnpl_variability.Variability#getBpmn <em>Bpmn</em>}</li>
 *   <li>{@link bpmnpl_variability.Variability#getFeaturemodel <em>Featuremodel</em>}</li>
 *   <li>{@link bpmnpl_variability.Variability#getPresencecondition <em>Presencecondition</em>}</li>
 * </ul>
 *
 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getVariability()
 * @model
 * @generated
 */
public interface Variability extends EObject {
	/**
	 * Returns the value of the '<em><b>Bpmn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpmn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn</em>' containment reference.
	 * @see #setBpmn(FileURI)
	 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getVariability_Bpmn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileURI getBpmn();

	/**
	 * Sets the value of the '{@link bpmnpl_variability.Variability#getBpmn <em>Bpmn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn</em>' containment reference.
	 * @see #getBpmn()
	 * @generated
	 */
	void setBpmn(FileURI value);

	/**
	 * Returns the value of the '<em><b>Featuremodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuremodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuremodel</em>' containment reference.
	 * @see #setFeaturemodel(FileURI)
	 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getVariability_Featuremodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileURI getFeaturemodel();

	/**
	 * Sets the value of the '{@link bpmnpl_variability.Variability#getFeaturemodel <em>Featuremodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuremodel</em>' containment reference.
	 * @see #getFeaturemodel()
	 * @generated
	 */
	void setFeaturemodel(FileURI value);

	/**
	 * Returns the value of the '<em><b>Presencecondition</b></em>' containment reference list.
	 * The list contents are of type {@link bpmnpl_variability.PresenceCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presencecondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presencecondition</em>' containment reference list.
	 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getVariability_Presencecondition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<PresenceCondition> getPresencecondition();

} // Variability
