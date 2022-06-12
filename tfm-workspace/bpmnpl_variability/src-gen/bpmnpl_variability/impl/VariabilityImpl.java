/**
 */
package bpmnpl_variability.impl;

import bpmnpl_variability.Bpmnpl_variabilityPackage;
import bpmnpl_variability.FileURI;
import bpmnpl_variability.PresenceCondition;
import bpmnpl_variability.Variability;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmnpl_variability.impl.VariabilityImpl#getBpmn <em>Bpmn</em>}</li>
 *   <li>{@link bpmnpl_variability.impl.VariabilityImpl#getFeaturemodel <em>Featuremodel</em>}</li>
 *   <li>{@link bpmnpl_variability.impl.VariabilityImpl#getPresencecondition <em>Presencecondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariabilityImpl extends MinimalEObjectImpl.Container implements Variability {
	/**
	 * The cached value of the '{@link #getBpmn() <em>Bpmn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmn()
	 * @generated
	 * @ordered
	 */
	protected FileURI bpmn;

	/**
	 * The cached value of the '{@link #getFeaturemodel() <em>Featuremodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturemodel()
	 * @generated
	 * @ordered
	 */
	protected FileURI featuremodel;

	/**
	 * The cached value of the '{@link #getPresencecondition() <em>Presencecondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresencecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<PresenceCondition> presencecondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmnpl_variabilityPackage.Literals.VARIABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileURI getBpmn() {
		return bpmn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBpmn(FileURI newBpmn, NotificationChain msgs) {
		FileURI oldBpmn = bpmn;
		bpmn = newBpmn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Bpmnpl_variabilityPackage.VARIABILITY__BPMN, oldBpmn, newBpmn);
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
	@Override
	public void setBpmn(FileURI newBpmn) {
		if (newBpmn != bpmn) {
			NotificationChain msgs = null;
			if (bpmn != null)
				msgs = ((InternalEObject) bpmn).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Bpmnpl_variabilityPackage.VARIABILITY__BPMN, null, msgs);
			if (newBpmn != null)
				msgs = ((InternalEObject) newBpmn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Bpmnpl_variabilityPackage.VARIABILITY__BPMN, null, msgs);
			msgs = basicSetBpmn(newBpmn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmnpl_variabilityPackage.VARIABILITY__BPMN, newBpmn,
					newBpmn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileURI getFeaturemodel() {
		return featuremodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturemodel(FileURI newFeaturemodel, NotificationChain msgs) {
		FileURI oldFeaturemodel = featuremodel;
		featuremodel = newFeaturemodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL, oldFeaturemodel, newFeaturemodel);
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
	@Override
	public void setFeaturemodel(FileURI newFeaturemodel) {
		if (newFeaturemodel != featuremodel) {
			NotificationChain msgs = null;
			if (featuremodel != null)
				msgs = ((InternalEObject) featuremodel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL, null, msgs);
			if (newFeaturemodel != null)
				msgs = ((InternalEObject) newFeaturemodel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL, null, msgs);
			msgs = basicSetFeaturemodel(newFeaturemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL,
					newFeaturemodel, newFeaturemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PresenceCondition> getPresencecondition() {
		if (presencecondition == null) {
			presencecondition = new EObjectContainmentEList<PresenceCondition>(PresenceCondition.class, this,
					Bpmnpl_variabilityPackage.VARIABILITY__PRESENCECONDITION);
		}
		return presencecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmnpl_variabilityPackage.VARIABILITY__BPMN:
			return basicSetBpmn(null, msgs);
		case Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL:
			return basicSetFeaturemodel(null, msgs);
		case Bpmnpl_variabilityPackage.VARIABILITY__PRESENCECONDITION:
			return ((InternalEList<?>) getPresencecondition()).basicRemove(otherEnd, msgs);
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
		case Bpmnpl_variabilityPackage.VARIABILITY__BPMN:
			return getBpmn();
		case Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL:
			return getFeaturemodel();
		case Bpmnpl_variabilityPackage.VARIABILITY__PRESENCECONDITION:
			return getPresencecondition();
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
		case Bpmnpl_variabilityPackage.VARIABILITY__BPMN:
			setBpmn((FileURI) newValue);
			return;
		case Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL:
			setFeaturemodel((FileURI) newValue);
			return;
		case Bpmnpl_variabilityPackage.VARIABILITY__PRESENCECONDITION:
			getPresencecondition().clear();
			getPresencecondition().addAll((Collection<? extends PresenceCondition>) newValue);
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
		case Bpmnpl_variabilityPackage.VARIABILITY__BPMN:
			setBpmn((FileURI) null);
			return;
		case Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL:
			setFeaturemodel((FileURI) null);
			return;
		case Bpmnpl_variabilityPackage.VARIABILITY__PRESENCECONDITION:
			getPresencecondition().clear();
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
		case Bpmnpl_variabilityPackage.VARIABILITY__BPMN:
			return bpmn != null;
		case Bpmnpl_variabilityPackage.VARIABILITY__FEATUREMODEL:
			return featuremodel != null;
		case Bpmnpl_variabilityPackage.VARIABILITY__PRESENCECONDITION:
			return presencecondition != null && !presencecondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariabilityImpl
