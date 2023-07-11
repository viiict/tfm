/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Flow#getIn <em>In</em>}</li>
 *   <li>{@link bpmn.Flow#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends BPMNElement {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.BPMNNode#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(BPMNNode)
	 * @see bpmn.BpmnPackage#getFlow_In()
	 * @see bpmn.BPMNNode#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	BPMNNode getIn();

	/**
	 * Sets the value of the '{@link bpmn.Flow#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(BPMNNode value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.BPMNNode#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(BPMNNode)
	 * @see bpmn.BpmnPackage#getFlow_Out()
	 * @see bpmn.BPMNNode#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	BPMNNode getOut();

	/**
	 * Sets the value of the '{@link bpmn.Flow#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(BPMNNode value);

} // Flow
