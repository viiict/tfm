/**
 */
package bpmn.impl;

import bpmn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnFactoryImpl extends EFactoryImpl implements BpmnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpmnFactory init() {
		try {
			BpmnFactory theBpmnFactory = (BpmnFactory) EPackage.Registry.INSTANCE.getEFactory(BpmnPackage.eNS_URI);
			if (theBpmnFactory != null) {
				return theBpmnFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpmnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM:
			return createBusinessProcessDiagram();
		case BpmnPackage.LANE:
			return createLane();
		case BpmnPackage.POOL:
			return createPool();
		case BpmnPackage.EVENT:
			return createEvent();
		case BpmnPackage.START_EVENT:
			return createStartEvent();
		case BpmnPackage.END_EVENT:
			return createEndEvent();
		case BpmnPackage.INTERMEDIATE_EVENT:
			return createIntermediateEvent();
		case BpmnPackage.TIMER_EVENT:
			return createTimerEvent();
		case BpmnPackage.ERROR_EVENT:
			return createErrorEvent();
		case BpmnPackage.ACTIVITY:
			return createActivity();
		case BpmnPackage.NORMAL_TASK:
			return createNormalTask();
		case BpmnPackage.USER_TASK:
			return createUserTask();
		case BpmnPackage.MANUAL_TASK:
			return createManualTask();
		case BpmnPackage.SERVICE_TASK:
			return createServiceTask();
		case BpmnPackage.MSG_RECEIVE_TASK:
			return createMsgReceiveTask();
		case BpmnPackage.MSG_SEND_TASK:
			return createMsgSendTask();
		case BpmnPackage.SCRIPT_TASK:
			return createScriptTask();
		case BpmnPackage.BUSINESS_RULE_TASK:
			return createBusinessRuleTask();
		case BpmnPackage.FLOW:
			return createFlow();
		case BpmnPackage.SEQUENCE_FLOW:
			return createSequenceFlow();
		case BpmnPackage.MESSAGE_FLOW:
			return createMessageFlow();
		case BpmnPackage.ASSOCIATION:
			return createAssociation();
		case BpmnPackage.GATEWAY:
			return createGateway();
		case BpmnPackage.EXCLUSIVE_GATEWAY:
			return createExclusiveGateway();
		case BpmnPackage.INCLUSIVE_GATEWAY:
			return createInclusiveGateway();
		case BpmnPackage.PARALLEL_GATEWAY:
			return createParallelGateway();
		case BpmnPackage.ARTIFACT:
			return createArtifact();
		case BpmnPackage.ANNOTATION:
			return createAnnotation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessProcessDiagram createBusinessProcessDiagram() {
		BusinessProcessDiagramImpl businessProcessDiagram = new BusinessProcessDiagramImpl();
		return businessProcessDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateEvent createIntermediateEvent() {
		IntermediateEventImpl intermediateEvent = new IntermediateEventImpl();
		return intermediateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimerEvent createTimerEvent() {
		TimerEventImpl timerEvent = new TimerEventImpl();
		return timerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorEvent createErrorEvent() {
		ErrorEventImpl errorEvent = new ErrorEventImpl();
		return errorEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalTask createNormalTask() {
		NormalTaskImpl normalTask = new NormalTaskImpl();
		return normalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManualTask createManualTask() {
		ManualTaskImpl manualTask = new ManualTaskImpl();
		return manualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceTask createServiceTask() {
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgReceiveTask createMsgReceiveTask() {
		MsgReceiveTaskImpl msgReceiveTask = new MsgReceiveTaskImpl();
		return msgReceiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgSendTask createMsgSendTask() {
		MsgSendTaskImpl msgSendTask = new MsgSendTaskImpl();
		return msgSendTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptTask createScriptTask() {
		ScriptTaskImpl scriptTask = new ScriptTaskImpl();
		return scriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessRuleTask createBusinessRuleTask() {
		BusinessRuleTaskImpl businessRuleTask = new BusinessRuleTaskImpl();
		return businessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageFlow createMessageFlow() {
		MessageFlowImpl messageFlow = new MessageFlowImpl();
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusiveGateway createExclusiveGateway() {
		ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InclusiveGateway createInclusiveGateway() {
		InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
		return inclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelGateway createParallelGateway() {
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpmnPackage getBpmnPackage() {
		return (BpmnPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpmnPackage getPackage() {
		return BpmnPackage.eINSTANCE;
	}

} //BpmnFactoryImpl
