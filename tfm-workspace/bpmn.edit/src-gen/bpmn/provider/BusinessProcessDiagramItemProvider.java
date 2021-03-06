/**
 */
package bpmn.provider;

import bpmn.BpmnFactory;
import bpmn.BpmnPackage;
import bpmn.BusinessProcessDiagram;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bpmn.BusinessProcessDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessProcessDiagramItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__POOLS);
			childrenFeatures.add(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BusinessProcessDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessProcessDiagram"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BusinessProcessDiagram_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BusinessProcessDiagram.class)) {
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__POOLS:
		case BpmnPackage.BUSINESS_PROCESS_DIAGRAM__ELEMENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__POOLS,
				BpmnFactory.eINSTANCE.createPool()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createLane()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createPool()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createTimerEvent()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createErrorEvent()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createNormalTask()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createMsgReceiveTask()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createMsgSendTask()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createFlow()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createGateway()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				BpmnFactory.eINSTANCE.createAnnotation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__POOLS
				|| childFeature == BpmnPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BpmnEditPlugin.INSTANCE;
	}

}
