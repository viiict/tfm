/**
 */
package bpmn.util;

import bpmn.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bpmn.BpmnPackage
 * @generated
 */
public class BpmnSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpmnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnSwitch() {
		if (modelPackage == null) {
			modelPackage = BpmnPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM: {
			BusinessProcessDiagram businessProcessDiagram = (BusinessProcessDiagram) theEObject;
			T result = caseBusinessProcessDiagram(businessProcessDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.BPMN_ELEMENT: {
			BPMNElement bpmnElement = (BPMNElement) theEObject;
			T result = caseBPMNElement(bpmnElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.BPMN_NODE: {
			BPMNNode bpmnNode = (BPMNNode) theEObject;
			T result = caseBPMNNode(bpmnNode);
			if (result == null)
				result = caseBPMNElement(bpmnNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.SWIMLANE: {
			Swimlane swimlane = (Swimlane) theEObject;
			T result = caseSwimlane(swimlane);
			if (result == null)
				result = caseBPMNElement(swimlane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.LANE: {
			Lane lane = (Lane) theEObject;
			T result = caseLane(lane);
			if (result == null)
				result = caseSwimlane(lane);
			if (result == null)
				result = caseBPMNElement(lane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.POOL: {
			Pool pool = (Pool) theEObject;
			T result = casePool(pool);
			if (result == null)
				result = caseSwimlane(pool);
			if (result == null)
				result = caseBPMNElement(pool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseBPMNNode(event);
			if (result == null)
				result = caseBPMNElement(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.START_EVENT: {
			StartEvent startEvent = (StartEvent) theEObject;
			T result = caseStartEvent(startEvent);
			if (result == null)
				result = caseEvent(startEvent);
			if (result == null)
				result = caseBPMNNode(startEvent);
			if (result == null)
				result = caseBPMNElement(startEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.END_EVENT: {
			EndEvent endEvent = (EndEvent) theEObject;
			T result = caseEndEvent(endEvent);
			if (result == null)
				result = caseEvent(endEvent);
			if (result == null)
				result = caseBPMNNode(endEvent);
			if (result == null)
				result = caseBPMNElement(endEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.INTERMEDIATE_EVENT: {
			IntermediateEvent intermediateEvent = (IntermediateEvent) theEObject;
			T result = caseIntermediateEvent(intermediateEvent);
			if (result == null)
				result = caseEvent(intermediateEvent);
			if (result == null)
				result = caseBPMNNode(intermediateEvent);
			if (result == null)
				result = caseBPMNElement(intermediateEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseBPMNNode(activity);
			if (result == null)
				result = caseBPMNElement(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = caseActivity(task);
			if (result == null)
				result = caseBPMNNode(task);
			if (result == null)
				result = caseBPMNElement(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.FLOW: {
			Flow flow = (Flow) theEObject;
			T result = caseFlow(flow);
			if (result == null)
				result = caseBPMNElement(flow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.SEQUENCE_FLOW: {
			SequenceFlow sequenceFlow = (SequenceFlow) theEObject;
			T result = caseSequenceFlow(sequenceFlow);
			if (result == null)
				result = caseFlow(sequenceFlow);
			if (result == null)
				result = caseBPMNElement(sequenceFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.ASSOCIATION: {
			Association association = (Association) theEObject;
			T result = caseAssociation(association);
			if (result == null)
				result = caseFlow(association);
			if (result == null)
				result = caseBPMNElement(association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.GATEWAY: {
			Gateway gateway = (Gateway) theEObject;
			T result = caseGateway(gateway);
			if (result == null)
				result = caseBPMNNode(gateway);
			if (result == null)
				result = caseBPMNElement(gateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.XOR_GATEWAY: {
			XORGateway xorGateway = (XORGateway) theEObject;
			T result = caseXORGateway(xorGateway);
			if (result == null)
				result = caseGateway(xorGateway);
			if (result == null)
				result = caseBPMNNode(xorGateway);
			if (result == null)
				result = caseBPMNElement(xorGateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.OR_GATEWAY: {
			ORGateway orGateway = (ORGateway) theEObject;
			T result = caseORGateway(orGateway);
			if (result == null)
				result = caseGateway(orGateway);
			if (result == null)
				result = caseBPMNNode(orGateway);
			if (result == null)
				result = caseBPMNElement(orGateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.AND_GATEWAY: {
			ANDGateway andGateway = (ANDGateway) theEObject;
			T result = caseANDGateway(andGateway);
			if (result == null)
				result = caseGateway(andGateway);
			if (result == null)
				result = caseBPMNNode(andGateway);
			if (result == null)
				result = caseBPMNElement(andGateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.ARTIFACT: {
			Artifact artifact = (Artifact) theEObject;
			T result = caseArtifact(artifact);
			if (result == null)
				result = caseBPMNNode(artifact);
			if (result == null)
				result = caseBPMNElement(artifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.ANNOTATION: {
			Annotation annotation = (Annotation) theEObject;
			T result = caseAnnotation(annotation);
			if (result == null)
				result = caseArtifact(annotation);
			if (result == null)
				result = caseBPMNNode(annotation);
			if (result == null)
				result = caseBPMNElement(annotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcessDiagram(BusinessProcessDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPMN Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNElement(BPMNElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPMN Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNNode(BPMNNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swimlane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swimlane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwimlane(Swimlane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePool(Pool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvent(StartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent(EndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateEvent(IntermediateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlow(SequenceFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XOR Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XOR Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXORGateway(XORGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORGateway(ORGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDGateway(ANDGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BpmnSwitch
