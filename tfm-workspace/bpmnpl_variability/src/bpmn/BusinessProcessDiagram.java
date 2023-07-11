/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.BusinessProcessDiagram#getPools <em>Pools</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getBusinessProcessDiagram()
 * @model
 * @generated
 */
public interface BusinessProcessDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Pools</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Pool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pools</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getBusinessProcessDiagram_Pools()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pool> getPools();

} // BusinessProcessDiagram
