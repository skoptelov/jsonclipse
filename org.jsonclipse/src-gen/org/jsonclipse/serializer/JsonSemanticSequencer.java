package org.jsonclipse.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.jsonclipse.json.Array;
import org.jsonclipse.json.JsonPackage;
import org.jsonclipse.json.Model;
import org.jsonclipse.json.ObjectProperty;
import org.jsonclipse.json.Value;
import org.jsonclipse.services.JsonGrammarAccess;

@SuppressWarnings("all")
public class JsonSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JsonGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JsonPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JsonPackage.ARRAY:
				if(context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.OBJECT:
				if(context == grammarAccess.getObjectRule()) {
					sequence_Object(context, (org.jsonclipse.json.Object) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.OBJECT_PROPERTY:
				if(context == grammarAccess.getObjectPropertyRule()) {
					sequence_ObjectProperty(context, (ObjectProperty) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (elements+=Value elements+=Value*)?
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     root=Value
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.MODEL__ROOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.MODEL__ROOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getRootValueParserRuleCall_0(), semanticObject.getRoot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (propName=STRING propValue=Value)
	 */
	protected void sequence_ObjectProperty(EObject context, ObjectProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.OBJECT_PROPERTY__PROP_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.OBJECT_PROPERTY__PROP_NAME));
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.OBJECT_PROPERTY__PROP_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.OBJECT_PROPERTY__PROP_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectPropertyAccess().getPropNameSTRINGTerminalRuleCall_0_0(), semanticObject.getPropName());
		feeder.accept(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0(), semanticObject.getPropValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (properties+=ObjectProperty properties+=ObjectProperty*)?
	 */
	protected void sequence_Object(EObject context, org.jsonclipse.json.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (objectValue=Object | arrayValue=Array | numberValue=Number | stringValue=STRING)?
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
