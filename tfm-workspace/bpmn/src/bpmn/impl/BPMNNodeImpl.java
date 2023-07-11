/**
 */
package bpmn.impl;

import bpmn.BPMNNode;
import bpmn.BpmnPackage;
import bpmn.Flow;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.BPMNNodeImpl#getIn <em>In</em>}</li>
 *   <li>{@link bpmn.impl.BPMNNodeImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNNodeImpl extends BPMNElementImpl implements BPMNNode {
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.BPMN_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getIn() {
		if (in == null) {
			in = new EObjectWithInverseResolvingEList<Flow>(Flow.class, this, BpmnPackage.BPMN_NODE__IN,
					BpmnPackage.FLOW__OUT);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getOut() {
		if (out == null) {
			out = new EObjectWithInverseResolvingEList<Flow>(Flow.class, this, BpmnPackage.BPMN_NODE__OUT,
					BpmnPackage.FLOW__IN);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BpmnPackage.BPMN_NODE__IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIn()).basicAdd(otherEnd, msgs);
		case BpmnPackage.BPMN_NODE__OUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOut()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BpmnPackage.BPMN_NODE__IN:
			return ((InternalEList<?>) getIn()).basicRemove(otherEnd, msgs);
		case BpmnPackage.BPMN_NODE__OUT:
			return ((InternalEList<?>) getOut()).basicRemove(otherEnd, msgs);
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
		case BpmnPackage.BPMN_NODE__IN:
			return getIn();
		case BpmnPackage.BPMN_NODE__OUT:
			return getOut();
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
		case BpmnPackage.BPMN_NODE__IN:
			getIn().clear();
			getIn().addAll((Collection<? extends Flow>) newValue);
			return;
		case BpmnPackage.BPMN_NODE__OUT:
			getOut().clear();
			getOut().addAll((Collection<? extends Flow>) newValue);
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
		case BpmnPackage.BPMN_NODE__IN:
			getIn().clear();
			return;
		case BpmnPackage.BPMN_NODE__OUT:
			getOut().clear();
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
		case BpmnPackage.BPMN_NODE__IN:
			return in != null && !in.isEmpty();
		case BpmnPackage.BPMN_NODE__OUT:
			return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BPMNNodeImpl
