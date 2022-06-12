/**
 */
package bpmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.BPMNElement#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getBPMNElement()
 * @model abstract="true"
 * @generated
 */
public interface BPMNElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see bpmn.BpmnPackage#getBPMNElement_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link bpmn.BPMNElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // BPMNElement
