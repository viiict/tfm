/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.StartEvent#isMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getStartEvent()
 * @model
 * @generated
 */
public interface StartEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(boolean)
	 * @see bpmn.BpmnPackage#getStartEvent_Message()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMessage();

	/**
	 * Sets the value of the '{@link bpmn.StartEvent#isMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #isMessage()
	 * @generated
	 */
	void setMessage(boolean value);

} // StartEvent
