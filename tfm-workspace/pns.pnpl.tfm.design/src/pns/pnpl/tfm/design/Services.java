package pns.pnpl.tfm.design;

import org.eclipse.emf.ecore.EObject;

import variability.BinaryExpression;
import variability.Expression;
import variability.Feature;
import variability.UnaryExpression;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
	public String getLabelParentExpression(Expression expression) {
		return getLabelExpression(expression) + ";";
	}
    
	private String getLabelExpression(Expression expression) {
		if (expression instanceof Feature)
			return ((Feature) expression).getFeature();
		else if (expression instanceof UnaryExpression) {
			UnaryExpression unaryExpression = (UnaryExpression) expression;
			return unaryExpression.getOperator().getLiteral().toLowerCase() + " "
					+ getLabelExpression(unaryExpression.getRight());
		} else if (expression instanceof BinaryExpression) {
			BinaryExpression binaryExpression = (BinaryExpression) expression;
			return "(" + getLabelExpression(binaryExpression.getLeft()) + " "
					+ binaryExpression.getOperator().getLiteral().toLowerCase() + " "
					+ getLabelExpression(binaryExpression.getRight()) + ")";
		}
		return "Undefined";
	}
}
