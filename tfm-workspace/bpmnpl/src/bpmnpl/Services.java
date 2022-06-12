package bpmnpl;

import org.eclipse.emf.ecore.EObject;

import bpmn.Annotation;
import bpmn.Lane;
import bpmn.Pool;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public String getPoolName(Pool self) {
       
      return "Pool: " + self.getName();
    }
    
    public String getLaneName(Lane self) {
    	
    	return "Lane: " + self.getName();
    }
    
    public boolean isAnnotation(EObject self, EObject source, EObject target) {
    	
    	if (source instanceof Annotation || target instanceof Annotation) {
    		System.out.println("ESTO FUNCAAAA");
    		return true;
    		
    	}
    	else
    		return false;
    }
}
