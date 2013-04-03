package org.jsonclipse.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.jsonclipse.services.JsonGrammarAccess;

@SuppressWarnings("all")
public class JsonSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JsonGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Value_FalseKeyword_0_or_NullKeyword_1_or_TrueKeyword_2;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JsonGrammarAccess) access;
		match_Value_FalseKeyword_0_or_NullKeyword_1_or_TrueKeyword_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueAccess().getFalseKeyword_0()), new TokenAlias(false, false, grammarAccess.getValueAccess().getNullKeyword_1()), new TokenAlias(false, false, grammarAccess.getValueAccess().getTrueKeyword_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getARRAY_ENDRule())
			return getARRAY_ENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getARRAY_STARTRule())
			return getARRAY_STARTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNAME_SEPRule())
			return getNAME_SEPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOBJECT_ENDRule())
			return getOBJECT_ENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOBJECT_STARTRule())
			return getOBJECT_STARTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVALUE_SEPRule())
			return getVALUE_SEPToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ARRAY_END:
	 *     "]";
	 */
	protected String getARRAY_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal ARRAY_START:
	 *     "[";
	 */
	protected String getARRAY_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal NAME_SEP:
	 *     ":";
	 */
	protected String getNAME_SEPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal OBJECT_END:
	 *     "}";
	 */
	protected String getOBJECT_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal OBJECT_START:
	 *     "{";
	 */
	protected String getOBJECT_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal VALUE_SEP:
	 *     ",";
	 */
	protected String getVALUE_SEPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Value_FalseKeyword_0_or_NullKeyword_1_or_TrueKeyword_2.equals(syntax))
				emit_Value_FalseKeyword_0_or_NullKeyword_1_or_TrueKeyword_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'false' | 'null' | 'true'
	 */
	protected void emit_Value_FalseKeyword_0_or_NullKeyword_1_or_TrueKeyword_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
