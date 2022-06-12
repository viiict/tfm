/**
 */
package bpmn.provider;

import bpmn.util.BpmnAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnItemProviderAdapterFactory extends BpmnAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.BusinessProcessDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessDiagramItemProvider businessProcessDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.BusinessProcessDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessProcessDiagramAdapter() {
		if (businessProcessDiagramItemProvider == null) {
			businessProcessDiagramItemProvider = new BusinessProcessDiagramItemProvider(this);
		}

		return businessProcessDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Lane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneItemProvider laneItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLaneAdapter() {
		if (laneItemProvider == null) {
			laneItemProvider = new LaneItemProvider(this);
		}

		return laneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Pool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolItemProvider poolItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPoolAdapter() {
		if (poolItemProvider == null) {
			poolItemProvider = new PoolItemProvider(this);
		}

		return poolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.StartEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartEventItemProvider startEventItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.StartEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartEventAdapter() {
		if (startEventItemProvider == null) {
			startEventItemProvider = new StartEventItemProvider(this);
		}

		return startEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.EndEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventItemProvider endEventItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.EndEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndEventAdapter() {
		if (endEventItemProvider == null) {
			endEventItemProvider = new EndEventItemProvider(this);
		}

		return endEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.IntermediateEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateEventItemProvider intermediateEventItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.IntermediateEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntermediateEventAdapter() {
		if (intermediateEventItemProvider == null) {
			intermediateEventItemProvider = new IntermediateEventItemProvider(this);
		}

		return intermediateEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.TimerEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerEventItemProvider timerEventItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.TimerEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimerEventAdapter() {
		if (timerEventItemProvider == null) {
			timerEventItemProvider = new TimerEventItemProvider(this);
		}

		return timerEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.ErrorEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorEventItemProvider errorEventItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.ErrorEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createErrorEventAdapter() {
		if (errorEventItemProvider == null) {
			errorEventItemProvider = new ErrorEventItemProvider(this);
		}

		return errorEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.NormalTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalTaskItemProvider normalTaskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.NormalTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNormalTaskAdapter() {
		if (normalTaskItemProvider == null) {
			normalTaskItemProvider = new NormalTaskItemProvider(this);
		}

		return normalTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.UserTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTaskItemProvider userTaskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.UserTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserTaskAdapter() {
		if (userTaskItemProvider == null) {
			userTaskItemProvider = new UserTaskItemProvider(this);
		}

		return userTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.ManualTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualTaskItemProvider manualTaskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.ManualTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManualTaskAdapter() {
		if (manualTaskItemProvider == null) {
			manualTaskItemProvider = new ManualTaskItemProvider(this);
		}

		return manualTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.ServiceTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTaskItemProvider serviceTaskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.ServiceTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceTaskAdapter() {
		if (serviceTaskItemProvider == null) {
			serviceTaskItemProvider = new ServiceTaskItemProvider(this);
		}

		return serviceTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.MsgReceiveTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgReceiveTaskItemProvider msgReceiveTaskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.MsgReceiveTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMsgReceiveTaskAdapter() {
		if (msgReceiveTaskItemProvider == null) {
			msgReceiveTaskItemProvider = new MsgReceiveTaskItemProvider(this);
		}

		return msgReceiveTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.MsgSendTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgSendTaskItemProvider msgSendTaskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.MsgSendTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMsgSendTaskAdapter() {
		if (msgSendTaskItemProvider == null) {
			msgSendTaskItemProvider = new MsgSendTaskItemProvider(this);
		}

		return msgSendTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.ScriptTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTaskItemProvider scriptTaskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.ScriptTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptTaskAdapter() {
		if (scriptTaskItemProvider == null) {
			scriptTaskItemProvider = new ScriptTaskItemProvider(this);
		}

		return scriptTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.BusinessRuleTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRuleTaskItemProvider businessRuleTaskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.BusinessRuleTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessRuleTaskAdapter() {
		if (businessRuleTaskItemProvider == null) {
			businessRuleTaskItemProvider = new BusinessRuleTaskItemProvider(this);
		}

		return businessRuleTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Flow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowItemProvider flowItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowAdapter() {
		if (flowItemProvider == null) {
			flowItemProvider = new FlowItemProvider(this);
		}

		return flowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.SequenceFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowItemProvider sequenceFlowItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.SequenceFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceFlowAdapter() {
		if (sequenceFlowItemProvider == null) {
			sequenceFlowItemProvider = new SequenceFlowItemProvider(this);
		}

		return sequenceFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.MessageFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFlowItemProvider messageFlowItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageFlowAdapter() {
		if (messageFlowItemProvider == null) {
			messageFlowItemProvider = new MessageFlowItemProvider(this);
		}

		return messageFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Gateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayItemProvider gatewayItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Gateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGatewayAdapter() {
		if (gatewayItemProvider == null) {
			gatewayItemProvider = new GatewayItemProvider(this);
		}

		return gatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.ExclusiveGateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveGatewayItemProvider exclusiveGatewayItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.ExclusiveGateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExclusiveGatewayAdapter() {
		if (exclusiveGatewayItemProvider == null) {
			exclusiveGatewayItemProvider = new ExclusiveGatewayItemProvider(this);
		}

		return exclusiveGatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.InclusiveGateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusiveGatewayItemProvider inclusiveGatewayItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.InclusiveGateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInclusiveGatewayAdapter() {
		if (inclusiveGatewayItemProvider == null) {
			inclusiveGatewayItemProvider = new InclusiveGatewayItemProvider(this);
		}

		return inclusiveGatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.ParallelGateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelGatewayItemProvider parallelGatewayItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.ParallelGateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelGatewayAdapter() {
		if (parallelGatewayItemProvider == null) {
			parallelGatewayItemProvider = new ParallelGatewayItemProvider(this);
		}

		return parallelGatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Artifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactItemProvider artifactItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactAdapter() {
		if (artifactItemProvider == null) {
			artifactItemProvider = new ArtifactItemProvider(this);
		}

		return artifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (businessProcessDiagramItemProvider != null)
			businessProcessDiagramItemProvider.dispose();
		if (laneItemProvider != null)
			laneItemProvider.dispose();
		if (poolItemProvider != null)
			poolItemProvider.dispose();
		if (eventItemProvider != null)
			eventItemProvider.dispose();
		if (startEventItemProvider != null)
			startEventItemProvider.dispose();
		if (endEventItemProvider != null)
			endEventItemProvider.dispose();
		if (intermediateEventItemProvider != null)
			intermediateEventItemProvider.dispose();
		if (timerEventItemProvider != null)
			timerEventItemProvider.dispose();
		if (errorEventItemProvider != null)
			errorEventItemProvider.dispose();
		if (activityItemProvider != null)
			activityItemProvider.dispose();
		if (normalTaskItemProvider != null)
			normalTaskItemProvider.dispose();
		if (userTaskItemProvider != null)
			userTaskItemProvider.dispose();
		if (manualTaskItemProvider != null)
			manualTaskItemProvider.dispose();
		if (serviceTaskItemProvider != null)
			serviceTaskItemProvider.dispose();
		if (msgReceiveTaskItemProvider != null)
			msgReceiveTaskItemProvider.dispose();
		if (msgSendTaskItemProvider != null)
			msgSendTaskItemProvider.dispose();
		if (scriptTaskItemProvider != null)
			scriptTaskItemProvider.dispose();
		if (businessRuleTaskItemProvider != null)
			businessRuleTaskItemProvider.dispose();
		if (flowItemProvider != null)
			flowItemProvider.dispose();
		if (sequenceFlowItemProvider != null)
			sequenceFlowItemProvider.dispose();
		if (messageFlowItemProvider != null)
			messageFlowItemProvider.dispose();
		if (associationItemProvider != null)
			associationItemProvider.dispose();
		if (gatewayItemProvider != null)
			gatewayItemProvider.dispose();
		if (exclusiveGatewayItemProvider != null)
			exclusiveGatewayItemProvider.dispose();
		if (inclusiveGatewayItemProvider != null)
			inclusiveGatewayItemProvider.dispose();
		if (parallelGatewayItemProvider != null)
			parallelGatewayItemProvider.dispose();
		if (artifactItemProvider != null)
			artifactItemProvider.dispose();
		if (annotationItemProvider != null)
			annotationItemProvider.dispose();
	}

}
