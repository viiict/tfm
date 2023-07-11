package variabilityCalls;


import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.w3c.dom.NodeList;

import bpmn.BPMNElement;
import bpmnpl_variability.Feature;
import bpmnpl_variability.FileURI;
import bpmnpl_variability.PresenceCondition;
import bpmnpl_variability.Variability;
import bpmnpl_variability.impl.Bpmnpl_variabilityFactoryImpl;



public class PresenceConditionCreate  implements IExternalJavaAction {
	
	public static final String BPMNPL_VARIABILITY_EXTENSION = "bpmnpl_variability";
			
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {		
		Object element = parameters.get("element");
		if (element instanceof BPMNElement) {
			BPMNElement BPMNelement = (BPMNElement) element;
			Session currentSession = SessionManager.INSTANCE.getSession(BPMNelement);
			Variability variability = getCreateVariabilityResource(currentSession, BPMNelement);
			String feature = getFeature(BPMNelement);
			// Create Presence Condition
			PresenceCondition pc = createPresenceCondition(BPMNelement,feature);
			variability.getPresencecondition().add(pc);
			try {
				pc.eResource().save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}				
		}		
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	
	public static Variability getCreateVariabilityResource(Session currentSession, EObject element) {
		URI presenceCondURI = element.eResource().getURI().trimFileExtension().appendFileExtension(BPMNPL_VARIABILITY_EXTENSION);
		boolean pcExistResource = currentSession.getTransactionalEditingDomain().getResourceSet().getURIConverter().exists(presenceCondURI, null);		
		if (pcExistResource == false) {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource pcResource = resourceSet.createResource(presenceCondURI);
			// create variability
			Variability variability = createVariability(element.eResource().getURI().lastSegment());
			pcResource.getContents().add(variability);	
			try {
				pcResource.save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}			
			AddSemanticResourceCommand addSemanticResourceCmd = new AddSemanticResourceCommand(currentSession, presenceCondURI, new NullProgressMonitor());
			currentSession.getTransactionalEditingDomain().getCommandStack().execute(addSemanticResourceCmd);
			return variability;
		} else {
			EObject rootEObject = currentSession.getTransactionalEditingDomain().getResourceSet().getResource(presenceCondURI, true).getContents().get(0);
			if (rootEObject instanceof Variability)
				return (Variability) rootEObject;
			else 
				return null;
		}					 
	}
	
	public static Variability createVariability(String pnImportURI) {
		// create variability
		Variability variability = Bpmnpl_variabilityFactoryImpl.eINSTANCE.createVariability();
		// Petrinet FileUri
		FileURI bpmnFileUri = Bpmnpl_variabilityFactoryImpl.eINSTANCE.createFileURI();
		bpmnFileUri.setImportURI(pnImportURI);
		variability.setBpmn(bpmnFileUri);
		// File Uri Feature Model
		FileURI fmFileUri = Bpmnpl_variabilityFactoryImpl.eINSTANCE.createFileURI();
		fmFileUri.setImportURI(FeatureUtils.FILE_URI_FEATURE_MODEL);	
		variability.setFeaturemodel(fmFileUri);
		return variability;
	}
	
	private PresenceCondition createPresenceCondition(BPMNElement eObjectElement, String feature) {
		PresenceCondition pc = Bpmnpl_variabilityFactoryImpl.eINSTANCE.createPresenceCondition();
		pc.getElements().add(eObjectElement);
		Feature featExpression = Bpmnpl_variabilityFactoryImpl.eINSTANCE.createFeature();
		featExpression.setFeature(feature);
		pc.setExpression(featExpression);		
		return pc;
	}
	
	private String getFeature(EObject eObjectElement) {
		NodeList features = FeatureUtils.getFeaturesContainerURI(eObjectElement.eResource().getURI().trimSegments(1));
		if (features != null && features.getLength() > 0) {
		   	return features.item(0).getAttributes().getNamedItem("name").getNodeValue();
		} else
		    return "invalid feature";		
	}
	
}
