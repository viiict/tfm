/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.BPMNNode#getIn <em>In</em>}</li>
 *   <li>{@link bpmn.BPMNNode#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getBPMNNode()
 * @model
 * @generated
 */
public interface BPMNNode extends BPMNElement {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Flow}.
	 * It is bidirectional and its opposite is '{@link bpmn.Flow#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see bpmn.BpmnPackage#getBPMNNode_In()
	 * @see bpmn.Flow#getOut
	 * @model opposite="out"
	 * @generated
	 */
	EList<Flow> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Flow}.
	 * It is bidirectional and its opposite is '{@link bpmn.Flow#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see bpmn.BpmnPackage#getBPMNNode_Out()
	 * @see bpmn.Flow#getIn
	 * @model opposite="in"
	 * @generated
	 */
	EList<Flow> getOut();

} // BPMNNode
