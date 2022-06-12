/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Annotation#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Artifact {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * The default value is <code>"add descrpition..."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see bpmn.BpmnPackage#getAnnotation_Desc()
	 * @model default="add descrpition..." required="true"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link bpmn.Annotation#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

} // Annotation
