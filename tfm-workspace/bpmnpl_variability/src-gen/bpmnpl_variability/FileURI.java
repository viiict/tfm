/**
 */
package bpmnpl_variability;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmnpl_variability.FileURI#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getFileURI()
 * @model
 * @generated
 */
public interface FileURI extends EObject {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see bpmnpl_variability.Bpmnpl_variabilityPackage#getFileURI_ImportURI()
	 * @model required="true"
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link bpmnpl_variability.FileURI#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

} // FileURI
