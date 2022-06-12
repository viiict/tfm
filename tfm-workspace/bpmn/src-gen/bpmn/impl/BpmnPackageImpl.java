/**
 */
package bpmn.impl;

import bpmn.Activity;
import bpmn.Annotation;
import bpmn.Artifact;
import bpmn.Association;
import bpmn.BPMNElement;
import bpmn.BpmnFactory;
import bpmn.BpmnPackage;
import bpmn.BusinessProcessDiagram;
import bpmn.BusinessRuleTask;
import bpmn.EndEvent;
import bpmn.ErrorEvent;
import bpmn.Event;
import bpmn.ExclusiveGateway;
import bpmn.Flow;
import bpmn.Gateway;
import bpmn.InclusiveGateway;
import bpmn.IntermediateEvent;
import bpmn.Lane;
import bpmn.ManualTask;
import bpmn.MessageFlow;
import bpmn.MsgReceiveTask;
import bpmn.MsgSendTask;
import bpmn.NormalTask;
import bpmn.ParallelGateway;
import bpmn.Pool;
import bpmn.ScriptTask;
import bpmn.SequenceFlow;
import bpmn.ServiceTask;
import bpmn.StartEvent;
import bpmn.Swimlane;
import bpmn.TimerEvent;
import bpmn.UserTask;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnPackageImpl extends EPackageImpl implements BpmnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swimlaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msgReceiveTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msgSendTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRuleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bpmn.BpmnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BpmnPackageImpl() {
		super(eNS_URI, BpmnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BpmnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BpmnPackage init() {
		if (isInited)
			return (BpmnPackage) EPackage.Registry.INSTANCE.getEPackage(BpmnPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBpmnPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BpmnPackageImpl theBpmnPackage = registeredBpmnPackage instanceof BpmnPackageImpl
				? (BpmnPackageImpl) registeredBpmnPackage
				: new BpmnPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBpmnPackage.createPackageContents();

		// Initialize created meta-data
		theBpmnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBpmnPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BpmnPackage.eNS_URI, theBpmnPackage);
		return theBpmnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessProcessDiagram() {
		return businessProcessDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessProcessDiagram_Pools() {
		return (EReference) businessProcessDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessProcessDiagram_Elements() {
		return (EReference) businessProcessDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNElement() {
		return bpmnElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNElement_ID() {
		return (EAttribute) bpmnElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwimlane() {
		return swimlaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwimlane_Name() {
		return (EAttribute) swimlaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_Elements() {
		return (EReference) laneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPool_Lanes() {
		return (EReference) poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartEvent_Message() {
		return (EAttribute) startEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndEvent_Message() {
		return (EAttribute) endEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermediateEvent() {
		return intermediateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimerEvent() {
		return timerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErrorEvent() {
		return errorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Description() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalTask() {
		return normalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManualTask() {
		return manualTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceTask() {
		return serviceTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMsgReceiveTask() {
		return msgReceiveTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMsgSendTask() {
		return msgSendTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptTask() {
		return scriptTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessRuleTask() {
		return businessRuleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_In() {
		return (EReference) flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Out() {
		return (EReference) flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceFlow() {
		return sequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageFlow() {
		return messageFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExclusiveGateway() {
		return exclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInclusiveGateway() {
		return inclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelGateway() {
		return parallelGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Desc() {
		return (EAttribute) annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpmnFactory getBpmnFactory() {
		return (BpmnFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		businessProcessDiagramEClass = createEClass(BUSINESS_PROCESS_DIAGRAM);
		createEReference(businessProcessDiagramEClass, BUSINESS_PROCESS_DIAGRAM__POOLS);
		createEReference(businessProcessDiagramEClass, BUSINESS_PROCESS_DIAGRAM__ELEMENTS);

		bpmnElementEClass = createEClass(BPMN_ELEMENT);
		createEAttribute(bpmnElementEClass, BPMN_ELEMENT__ID);

		swimlaneEClass = createEClass(SWIMLANE);
		createEAttribute(swimlaneEClass, SWIMLANE__NAME);

		laneEClass = createEClass(LANE);
		createEReference(laneEClass, LANE__ELEMENTS);

		poolEClass = createEClass(POOL);
		createEReference(poolEClass, POOL__LANES);

		eventEClass = createEClass(EVENT);

		startEventEClass = createEClass(START_EVENT);
		createEAttribute(startEventEClass, START_EVENT__MESSAGE);

		endEventEClass = createEClass(END_EVENT);
		createEAttribute(endEventEClass, END_EVENT__MESSAGE);

		intermediateEventEClass = createEClass(INTERMEDIATE_EVENT);

		timerEventEClass = createEClass(TIMER_EVENT);

		errorEventEClass = createEClass(ERROR_EVENT);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__DESCRIPTION);

		normalTaskEClass = createEClass(NORMAL_TASK);

		userTaskEClass = createEClass(USER_TASK);

		manualTaskEClass = createEClass(MANUAL_TASK);

		serviceTaskEClass = createEClass(SERVICE_TASK);

		msgReceiveTaskEClass = createEClass(MSG_RECEIVE_TASK);

		msgSendTaskEClass = createEClass(MSG_SEND_TASK);

		scriptTaskEClass = createEClass(SCRIPT_TASK);

		businessRuleTaskEClass = createEClass(BUSINESS_RULE_TASK);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__IN);
		createEReference(flowEClass, FLOW__OUT);

		sequenceFlowEClass = createEClass(SEQUENCE_FLOW);

		messageFlowEClass = createEClass(MESSAGE_FLOW);

		associationEClass = createEClass(ASSOCIATION);

		gatewayEClass = createEClass(GATEWAY);

		exclusiveGatewayEClass = createEClass(EXCLUSIVE_GATEWAY);

		inclusiveGatewayEClass = createEClass(INCLUSIVE_GATEWAY);

		parallelGatewayEClass = createEClass(PARALLEL_GATEWAY);

		artifactEClass = createEClass(ARTIFACT);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__DESC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		swimlaneEClass.getESuperTypes().add(this.getBPMNElement());
		laneEClass.getESuperTypes().add(this.getSwimlane());
		poolEClass.getESuperTypes().add(this.getSwimlane());
		eventEClass.getESuperTypes().add(this.getBPMNElement());
		startEventEClass.getESuperTypes().add(this.getEvent());
		endEventEClass.getESuperTypes().add(this.getEvent());
		intermediateEventEClass.getESuperTypes().add(this.getEvent());
		timerEventEClass.getESuperTypes().add(this.getEvent());
		errorEventEClass.getESuperTypes().add(this.getEvent());
		activityEClass.getESuperTypes().add(this.getBPMNElement());
		normalTaskEClass.getESuperTypes().add(this.getActivity());
		userTaskEClass.getESuperTypes().add(this.getActivity());
		manualTaskEClass.getESuperTypes().add(this.getActivity());
		serviceTaskEClass.getESuperTypes().add(this.getActivity());
		msgReceiveTaskEClass.getESuperTypes().add(this.getActivity());
		msgSendTaskEClass.getESuperTypes().add(this.getActivity());
		scriptTaskEClass.getESuperTypes().add(this.getActivity());
		businessRuleTaskEClass.getESuperTypes().add(this.getActivity());
		flowEClass.getESuperTypes().add(this.getBPMNElement());
		sequenceFlowEClass.getESuperTypes().add(this.getFlow());
		messageFlowEClass.getESuperTypes().add(this.getFlow());
		associationEClass.getESuperTypes().add(this.getFlow());
		gatewayEClass.getESuperTypes().add(this.getBPMNElement());
		exclusiveGatewayEClass.getESuperTypes().add(this.getGateway());
		inclusiveGatewayEClass.getESuperTypes().add(this.getGateway());
		parallelGatewayEClass.getESuperTypes().add(this.getGateway());
		artifactEClass.getESuperTypes().add(this.getBPMNElement());
		annotationEClass.getESuperTypes().add(this.getArtifact());

		// Initialize classes, features, and operations; add parameters
		initEClass(businessProcessDiagramEClass, BusinessProcessDiagram.class, "BusinessProcessDiagram", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessProcessDiagram_Pools(), this.getPool(), null, "pools", null, 1, -1,
				BusinessProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessDiagram_Elements(), this.getBPMNElement(), null, "elements", null, 0, -1,
				BusinessProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnElementEClass, BPMNElement.class, "BPMNElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPMNElement_ID(), ecorePackage.getEString(), "ID", null, 1, 1, BPMNElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swimlaneEClass, Swimlane.class, "Swimlane", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwimlane_Name(), ecorePackage.getEString(), "name", null, 1, 1, Swimlane.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLane_Elements(), this.getBPMNElement(), null, "elements", null, 0, -1, Lane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPool_Lanes(), this.getLane(), null, "lanes", null, 1, -1, Pool.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartEvent_Message(), ecorePackage.getEBoolean(), "message", "false", 1, 1, StartEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndEvent_Message(), ecorePackage.getEBoolean(), "message", "false", 1, 1, EndEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateEventEClass, IntermediateEvent.class, "IntermediateEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timerEventEClass, TimerEvent.class, "TimerEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorEventEClass, ErrorEvent.class, "ErrorEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Description(), ecorePackage.getEString(), "description", null, 1, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalTaskEClass, NormalTask.class, "NormalTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualTaskEClass, ManualTask.class, "ManualTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceTaskEClass, ServiceTask.class, "ServiceTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(msgReceiveTaskEClass, MsgReceiveTask.class, "MsgReceiveTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(msgSendTaskEClass, MsgSendTask.class, "MsgSendTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptTaskEClass, ScriptTask.class, "ScriptTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessRuleTaskEClass, BusinessRuleTask.class, "BusinessRuleTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_In(), this.getBPMNElement(), null, "in", null, 1, 1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFlow_Out(), this.getBPMNElement(), null, "out", null, 1, 1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(sequenceFlowEClass, SequenceFlow.class, "SequenceFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageFlowEClass, MessageFlow.class, "MessageFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveGatewayEClass, ExclusiveGateway.class, "ExclusiveGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(inclusiveGatewayEClass, InclusiveGateway.class, "InclusiveGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelGatewayEClass, ParallelGateway.class, "ParallelGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Desc(), ecorePackage.getEString(), "desc", "add descrpition...", 1, 1,
				Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BpmnPackageImpl
