/**
 */
package bpmn.impl;

import bpmn.BPMNElement;
import bpmn.BpmnPackage;
import bpmn.BusinessProcessDiagram;
import bpmn.Pool;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.BusinessProcessDiagramImpl#getPools <em>Pools</em>}</li>
 *   <li>{@link bpmn.impl.BusinessProcessDiagramImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessProcessDiagramImpl extends MinimalEObjectImpl.Container implements BusinessProcessDiagram {
	/**
	 * The cached value of the '{@link #getPools() <em>Pools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPools()
	 * @generated
	 * @ordered
	 */
	protected EList<Pool> pools;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BPMNElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pool> getPools() {
		if (pools == null) {
			pools = new EObjectContainmentEList<Pool>(Pool.class, this, BpmnPackage.BUSINESS_PROCESS_DIAGRAM__POOLS);
		}
		return pools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BPMNElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<BPMNElement>(BPMNElement.class, this,
					BpmnPackage.BUSINESS_PROCESS_DIAGRAM__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__POOLS:
			return ((InternalEList<?>) getPools()).basicRemove(otherEnd, msgs);
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__POOLS:
			return getPools();
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__ELEMENTS:
			return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__POOLS:
			getPools().clear();
			getPools().addAll((Collection<? extends Pool>) newValue);
			return;
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends BPMNElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__POOLS:
			getPools().clear();
			return;
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__ELEMENTS:
			getElements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__POOLS:
			return pools != null && !pools.isEmpty();
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__ELEMENTS:
			return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessProcessDiagramImpl
