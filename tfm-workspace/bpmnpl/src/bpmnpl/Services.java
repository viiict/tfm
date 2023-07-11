package bpmnpl;

import java.net.URL;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

import bpmn.Annotation;
import bpmn.BPMNElement;
import bpmn.Lane;
import bpmn.Pool;
import bpmnpl_variability.BinaryExpression;
import bpmnpl_variability.Expression;
import bpmnpl_variability.Feature;
import bpmnpl_variability.PresenceCondition;
import bpmnpl_variability.UnaryExpression;
import bpmnpl_variability.impl.Bpmnpl_variabilityFactoryImpl;

/**
 * The services class used by VSM.
 */
public class Services extends ClassLoader{
    
	public URL var;
	
	
	public String giveID(BPMNElement self) {
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		return uuid.toString(); 	
	}

	
    public String getPoolName(Pool self) {
      return "Pool: " + self.getName();
    }
    
    public String getLaneName(Lane self) {
    	return "Lane: " + self.getName();
    }
    
    public boolean isAnnotation(EObject self, EObject source, EObject target) {
    	if (source instanceof Annotation || target instanceof Annotation) 
        	return true;
  	
    	else
    		return false;
    }
    
    public String PresenceConditionS(Expression self) {
    	if (self instanceof Feature)
    		return ((Feature) self).getFeature();
    	else if (self instanceof UnaryExpression) {
    		return ((UnaryExpression) self).getOperator().getName() + " ( " +
    				PresenceConditionS(((UnaryExpression) self).getRight()) + " ) ";
    	}
    	else {
    		return " ( " + PresenceConditionS(((BinaryExpression) self).getLeft()) + " ) " +
    				((BinaryExpression) self).getOperator().getName() + " " +
    				" ( " + PresenceConditionS(((BinaryExpression) self).getRight()) + " ) " ;
    	}
    	
    }
     
	private PresenceCondition createPresenceCondition(BPMNElement eObjectElement, String feature) {
		PresenceCondition pc = Bpmnpl_variabilityFactoryImpl.eINSTANCE.createPresenceCondition();
		pc.getElements().add(eObjectElement);
		Feature featExpression = Bpmnpl_variabilityFactoryImpl.eINSTANCE.createFeature();
		featExpression.setFeature(feature);
		pc.setExpression(featExpression);		
		return pc;
	}
}