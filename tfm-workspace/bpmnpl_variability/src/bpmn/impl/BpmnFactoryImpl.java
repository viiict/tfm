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
		case BpmnPackage.BPMN_NODE:
			return createBPMNNode();
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
		case BpmnPackage.ACTIVITY:
			return createActivity();
		case BpmnPackage.TASK:
			return createTask();
		case BpmnPackage.FLOW:
			return createFlow();
		case BpmnPackage.SEQUENCE_FLOW:
			return createSequenceFlow();
		case BpmnPackage.ASSOCIATION:
			return createAssociation();
		case BpmnPackage.GATEWAY:
			return createGateway();
		case BpmnPackage.XOR_GATEWAY:
			return createXORGateway();
		case BpmnPackage.OR_GATEWAY:
			return createORGateway();
		case BpmnPackage.AND_GATEWAY:
			return createANDGateway();
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
	public BusinessProcessDiagram createBusinessProcessDiagram() {
		BusinessProcessDiagramImpl businessProcessDiagram = new BusinessProcessDiagramImpl();
		return businessProcessDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNNode createBPMNNode() {
		BPMNNodeImpl bpmnNode = new BPMNNodeImpl();
		return bpmnNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEvent createIntermediateEvent() {
		IntermediateEventImpl intermediateEvent = new IntermediateEventImpl();
		return intermediateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XORGateway createXORGateway() {
		XORGatewayImpl xorGateway = new XORGatewayImpl();
		return xorGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORGateway createORGateway() {
		ORGatewayImpl orGateway = new ORGatewayImpl();
		return orGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDGateway createANDGateway() {
		ANDGatewayImpl andGateway = new ANDGatewayImpl();
		return andGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
