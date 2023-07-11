/**
 */
package bpmnpl_variability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bpmnpl_variability.Bpmnpl_variabilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface Bpmnpl_variabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpmnpl_variability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bpmnpl_variability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmnpl_variability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bpmnpl_variabilityPackage eINSTANCE = bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link bpmnpl_variability.impl.FileURIImpl <em>File URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.impl.FileURIImpl
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getFileURI()
	 * @generated
	 */
	int FILE_URI = 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_URI__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>File URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_URI_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_URI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmnpl_variability.impl.VariabilityImpl <em>Variability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.impl.VariabilityImpl
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getVariability()
	 * @generated
	 */
	int VARIABILITY = 1;

	/**
	 * The feature id for the '<em><b>Bpmn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY__BPMN = 0;

	/**
	 * The feature id for the '<em><b>Featuremodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY__FEATUREMODEL = 1;

	/**
	 * The feature id for the '<em><b>Presencecondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY__PRESENCECONDITION = 2;

	/**
	 * The number of structural features of the '<em>Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmnpl_variability.impl.PresenceConditionImpl <em>Presence Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.impl.PresenceConditionImpl
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getPresenceCondition()
	 * @generated
	 */
	int PRESENCE_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_CONDITION__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_CONDITION__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Presence Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Presence Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmnpl_variability.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.impl.ExpressionImpl
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmnpl_variability.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.impl.FeatureImpl
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnpl_variability.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.impl.UnaryExpressionImpl
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnpl_variability.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.impl.BinaryExpressionImpl
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnpl_variability.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.UnaryOperator
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 7;

	/**
	 * The meta object id for the '{@link bpmnpl_variability.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnpl_variability.BinaryOperator
	 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 8;

	/**
	 * Returns the meta object for class '{@link bpmnpl_variability.FileURI <em>File URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File URI</em>'.
	 * @see bpmnpl_variability.FileURI
	 * @generated
	 */
	EClass getFileURI();

	/**
	 * Returns the meta object for the attribute '{@link bpmnpl_variability.FileURI#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see bpmnpl_variability.FileURI#getImportURI()
	 * @see #getFileURI()
	 * @generated
	 */
	EAttribute getFileURI_ImportURI();

	/**
	 * Returns the meta object for class '{@link bpmnpl_variability.Variability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability</em>'.
	 * @see bpmnpl_variability.Variability
	 * @generated
	 */
	EClass getVariability();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnpl_variability.Variability#getBpmn <em>Bpmn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bpmn</em>'.
	 * @see bpmnpl_variability.Variability#getBpmn()
	 * @see #getVariability()
	 * @generated
	 */
	EReference getVariability_Bpmn();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnpl_variability.Variability#getFeaturemodel <em>Featuremodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Featuremodel</em>'.
	 * @see bpmnpl_variability.Variability#getFeaturemodel()
	 * @see #getVariability()
	 * @generated
	 */
	EReference getVariability_Featuremodel();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmnpl_variability.Variability#getPresencecondition <em>Presencecondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presencecondition</em>'.
	 * @see bpmnpl_variability.Variability#getPresencecondition()
	 * @see #getVariability()
	 * @generated
	 */
	EReference getVariability_Presencecondition();

	/**
	 * Returns the meta object for class '{@link bpmnpl_variability.PresenceCondition <em>Presence Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presence Condition</em>'.
	 * @see bpmnpl_variability.PresenceCondition
	 * @generated
	 */
	EClass getPresenceCondition();

	/**
	 * Returns the meta object for the reference list '{@link bpmnpl_variability.PresenceCondition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see bpmnpl_variability.PresenceCondition#getElements()
	 * @see #getPresenceCondition()
	 * @generated
	 */
	EReference getPresenceCondition_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnpl_variability.PresenceCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see bpmnpl_variability.PresenceCondition#getExpression()
	 * @see #getPresenceCondition()
	 * @generated
	 */
	EReference getPresenceCondition_Expression();

	/**
	 * Returns the meta object for class '{@link bpmnpl_variability.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see bpmnpl_variability.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link bpmnpl_variability.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see bpmnpl_variability.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link bpmnpl_variability.Feature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see bpmnpl_variability.Feature#getFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Feature();

	/**
	 * Returns the meta object for class '{@link bpmnpl_variability.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see bpmnpl_variability.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link bpmnpl_variability.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see bpmnpl_variability.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnpl_variability.UnaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see bpmnpl_variability.UnaryExpression#getRight()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link bpmnpl_variability.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see bpmnpl_variability.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link bpmnpl_variability.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see bpmnpl_variability.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnpl_variability.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see bpmnpl_variability.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnpl_variability.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see bpmnpl_variability.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for enum '{@link bpmnpl_variability.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see bpmnpl_variability.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link bpmnpl_variability.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see bpmnpl_variability.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bpmnpl_variabilityFactory getBpmnpl_variabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bpmnpl_variability.impl.FileURIImpl <em>File URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.impl.FileURIImpl
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getFileURI()
		 * @generated
		 */
		EClass FILE_URI = eINSTANCE.getFileURI();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_URI__IMPORT_URI = eINSTANCE.getFileURI_ImportURI();

		/**
		 * The meta object literal for the '{@link bpmnpl_variability.impl.VariabilityImpl <em>Variability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.impl.VariabilityImpl
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getVariability()
		 * @generated
		 */
		EClass VARIABILITY = eINSTANCE.getVariability();

		/**
		 * The meta object literal for the '<em><b>Bpmn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY__BPMN = eINSTANCE.getVariability_Bpmn();

		/**
		 * The meta object literal for the '<em><b>Featuremodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY__FEATUREMODEL = eINSTANCE.getVariability_Featuremodel();

		/**
		 * The meta object literal for the '<em><b>Presencecondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY__PRESENCECONDITION = eINSTANCE.getVariability_Presencecondition();

		/**
		 * The meta object literal for the '{@link bpmnpl_variability.impl.PresenceConditionImpl <em>Presence Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.impl.PresenceConditionImpl
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getPresenceCondition()
		 * @generated
		 */
		EClass PRESENCE_CONDITION = eINSTANCE.getPresenceCondition();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENCE_CONDITION__ELEMENTS = eINSTANCE.getPresenceCondition_Elements();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENCE_CONDITION__EXPRESSION = eINSTANCE.getPresenceCondition_Expression();

		/**
		 * The meta object literal for the '{@link bpmnpl_variability.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.impl.ExpressionImpl
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link bpmnpl_variability.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.impl.FeatureImpl
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__FEATURE = eINSTANCE.getFeature_Feature();

		/**
		 * The meta object literal for the '{@link bpmnpl_variability.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.impl.UnaryExpressionImpl
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__RIGHT = eINSTANCE.getUnaryExpression_Right();

		/**
		 * The meta object literal for the '{@link bpmnpl_variability.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.impl.BinaryExpressionImpl
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link bpmnpl_variability.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.UnaryOperator
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link bpmnpl_variability.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnpl_variability.BinaryOperator
		 * @see bpmnpl_variability.impl.Bpmnpl_variabilityPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //Bpmnpl_variabilityPackage
