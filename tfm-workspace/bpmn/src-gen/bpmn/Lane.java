/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Lane#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends Swimlane {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link bpmn.BPMNElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see bpmn.BpmnPackage#getLane_Elements()
	 * @model
	 * @generated
	 */
	EList<BPMNElement> getElements();

} // Lane
