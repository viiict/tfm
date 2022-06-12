/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swimlane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Swimlane#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getSwimlane()
 * @model abstract="true"
 * @generated
 */
public interface Swimlane extends BPMNElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bpmn.BpmnPackage#getSwimlane_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn.Swimlane#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Swimlane
