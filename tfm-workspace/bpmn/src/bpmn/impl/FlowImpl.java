/**
 */
package bpmn.impl;

import bpmn.BPMNNode;
import bpmn.BpmnPackage;
import bpmn.Flow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.FlowImpl#getIn <em>In</em>}</li>
 *   <li>{@link bpmn.impl.FlowImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends BPMNElementImpl implements Flow {
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected BPMNNode in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected BPMNNode out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNNode getIn() {
		if (in != null && in.eIsProxy()) {
			InternalEObject oldIn = (InternalEObject) in;
			in = (BPMNNode) eResolveProxy(oldIn);
			if (in != oldIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.FLOW__IN, oldIn, in));
			}
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNNode basicGetIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(BPMNNode newIn, NotificationChain msgs) {
		BPMNNode oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.FLOW__IN, oldIn,
					newIn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(BPMNNode newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject) in).eInverseRemove(this, BpmnPackage.BPMN_NODE__OUT, BPMNNode.class, msgs);
			if (newIn != null)
				msgs = ((InternalEObject) newIn).eInverseAdd(this, BpmnPackage.BPMN_NODE__OUT, BPMNNode.class, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.FLOW__IN, newIn, newIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNNode getOut() {
		if (out != null && out.eIsProxy()) {
			InternalEObject oldOut = (InternalEObject) out;
			out = (BPMNNode) eResolveProxy(oldOut);
			if (out != oldOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.FLOW__OUT, oldOut, out));
			}
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNNode basicGetOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOut(BPMNNode newOut, NotificationChain msgs) {
		BPMNNode oldOut = out;
		out = newOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.FLOW__OUT,
					oldOut, newOut);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(BPMNNode newOut) {
		if (newOut != out) {
			NotificationChain msgs = null;
			if (out != null)
				msgs = ((InternalEObject) out).eInverseRemove(this, BpmnPackage.BPMN_NODE__IN, BPMNNode.class, msgs);
			if (newOut != null)
				msgs = ((InternalEObject) newOut).eInverseAdd(this, BpmnPackage.BPMN_NODE__IN, BPMNNode.class, msgs);
			msgs = basicSetOut(newOut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.FLOW__OUT, newOut, newOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BpmnPackage.FLOW__IN:
			if (in != null)
				msgs = ((InternalEObject) in).eInverseRemove(this, BpmnPackage.BPMN_NODE__OUT, BPMNNode.class, msgs);
			return basicSetIn((BPMNNode) otherEnd, msgs);
		case BpmnPackage.FLOW__OUT:
			if (out != null)
				msgs = ((InternalEObject) out).eInverseRemove(this, BpmnPackage.BPMN_NODE__IN, BPMNNode.class, msgs);
			return basicSetOut((BPMNNode) otherEnd, msgs);
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
		case BpmnPackage.FLOW__IN:
			return basicSetIn(null, msgs);
		case BpmnPackage.FLOW__OUT:
			return basicSetOut(null, msgs);
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
		case BpmnPackage.FLOW__IN:
			if (resolve)
				return getIn();
			return basicGetIn();
		case BpmnPackage.FLOW__OUT:
			if (resolve)
				return getOut();
			return basicGetOut();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BpmnPackage.FLOW__IN:
			setIn((BPMNNode) newValue);
			return;
		case BpmnPackage.FLOW__OUT:
			setOut((BPMNNode) newValue);
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
		case BpmnPackage.FLOW__IN:
			setIn((BPMNNode) null);
			return;
		case BpmnPackage.FLOW__OUT:
			setOut((BPMNNode) null);
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
		case BpmnPackage.FLOW__IN:
			return in != null;
		case BpmnPackage.FLOW__OUT:
			return out != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowImpl
