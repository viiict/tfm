/**
 */
package bpmn.util;

import bpmn.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bpmn.BpmnPackage
 * @generated
 */
public class BpmnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpmnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BpmnPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpmnSwitch<Adapter> modelSwitch = new BpmnSwitch<Adapter>() {
		@Override
		public Adapter caseBusinessProcessDiagram(BusinessProcessDiagram object) {
			return createBusinessProcessDiagramAdapter();
		}

		@Override
		public Adapter caseBPMNElement(BPMNElement object) {
			return createBPMNElementAdapter();
		}

		@Override
		public Adapter caseSwimlane(Swimlane object) {
			return createSwimlaneAdapter();
		}

		@Override
		public Adapter caseLane(Lane object) {
			return createLaneAdapter();
		}

		@Override
		public Adapter casePool(Pool object) {
			return createPoolAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseStartEvent(StartEvent object) {
			return createStartEventAdapter();
		}

		@Override
		public Adapter caseEndEvent(EndEvent object) {
			return createEndEventAdapter();
		}

		@Override
		public Adapter caseIntermediateEvent(IntermediateEvent object) {
			return createIntermediateEventAdapter();
		}

		@Override
		public Adapter caseTimerEvent(TimerEvent object) {
			return createTimerEventAdapter();
		}

		@Override
		public Adapter caseErrorEvent(ErrorEvent object) {
			return createErrorEventAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseNormalTask(NormalTask object) {
			return createNormalTaskAdapter();
		}

		@Override
		public Adapter caseUserTask(UserTask object) {
			return createUserTaskAdapter();
		}

		@Override
		public Adapter caseManualTask(ManualTask object) {
			return createManualTaskAdapter();
		}

		@Override
		public Adapter caseServiceTask(ServiceTask object) {
			return createServiceTaskAdapter();
		}

		@Override
		public Adapter caseMsgReceiveTask(MsgReceiveTask object) {
			return createMsgReceiveTaskAdapter();
		}

		@Override
		public Adapter caseMsgSendTask(MsgSendTask object) {
			return createMsgSendTaskAdapter();
		}

		@Override
		public Adapter caseScriptTask(ScriptTask object) {
			return createScriptTaskAdapter();
		}

		@Override
		public Adapter caseBusinessRuleTask(BusinessRuleTask object) {
			return createBusinessRuleTaskAdapter();
		}

		@Override
		public Adapter caseFlow(Flow object) {
			return createFlowAdapter();
		}

		@Override
		public Adapter caseSequenceFlow(SequenceFlow object) {
			return createSequenceFlowAdapter();
		}

		@Override
		public Adapter caseMessageFlow(MessageFlow object) {
			return createMessageFlowAdapter();
		}

		@Override
		public Adapter caseAssociation(Association object) {
			return createAssociationAdapter();
		}

		@Override
		public Adapter caseGateway(Gateway object) {
			return createGatewayAdapter();
		}

		@Override
		public Adapter caseExclusiveGateway(ExclusiveGateway object) {
			return createExclusiveGatewayAdapter();
		}

		@Override
		public Adapter caseInclusiveGateway(InclusiveGateway object) {
			return createInclusiveGatewayAdapter();
		}

		@Override
		public Adapter caseParallelGateway(ParallelGateway object) {
			return createParallelGatewayAdapter();
		}

		@Override
		public Adapter caseArtifact(Artifact object) {
			return createArtifactAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.BusinessProcessDiagram <em>Business Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.BusinessProcessDiagram
	 * @generated
	 */
	public Adapter createBusinessProcessDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.BPMNElement <em>BPMN Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.BPMNElement
	 * @generated
	 */
	public Adapter createBPMNElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Swimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Swimlane
	 * @generated
	 */
	public Adapter createSwimlaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Pool
	 * @generated
	 */
	public Adapter createPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.IntermediateEvent
	 * @generated
	 */
	public Adapter createIntermediateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.TimerEvent <em>Timer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.TimerEvent
	 * @generated
	 */
	public Adapter createTimerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.ErrorEvent <em>Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.ErrorEvent
	 * @generated
	 */
	public Adapter createErrorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.NormalTask <em>Normal Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.NormalTask
	 * @generated
	 */
	public Adapter createNormalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.ManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.ManualTask
	 * @generated
	 */
	public Adapter createManualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.ServiceTask
	 * @generated
	 */
	public Adapter createServiceTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.MsgReceiveTask <em>Msg Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.MsgReceiveTask
	 * @generated
	 */
	public Adapter createMsgReceiveTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.MsgSendTask <em>Msg Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.MsgSendTask
	 * @generated
	 */
	public Adapter createMsgSendTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.ScriptTask
	 * @generated
	 */
	public Adapter createScriptTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.BusinessRuleTask <em>Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.BusinessRuleTask
	 * @generated
	 */
	public Adapter createBusinessRuleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.MessageFlow
	 * @generated
	 */
	public Adapter createMessageFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.ExclusiveGateway
	 * @generated
	 */
	public Adapter createExclusiveGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.InclusiveGateway
	 * @generated
	 */
	public Adapter createInclusiveGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.ParallelGateway
	 * @generated
	 */
	public Adapter createParallelGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BpmnAdapterFactory
