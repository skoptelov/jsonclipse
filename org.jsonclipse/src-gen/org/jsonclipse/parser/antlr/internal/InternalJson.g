/*
* generated by Xtext
*/
grammar InternalJson;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.jsonclipse.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.jsonclipse.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.jsonclipse.services.JsonGrammarAccess;

}

@parser::members {

 	private JsonGrammarAccess grammarAccess;
 	
    public InternalJsonParser(TokenStream input, JsonGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected JsonGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getRootValueParserRuleCall_0()); 
	    }
		lv_root_0_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"root",
        		lv_root_0_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='false' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getValueAccess().getFalseKeyword_0());
    }

    |	otherlv_1='null' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getValueAccess().getNullKeyword_1());
    }

    |	otherlv_2='true' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getTrueKeyword_2());
    }

    |(
(
		{ 
	        newCompositeNode(grammarAccess.getValueAccess().getObjectValueObjectParserRuleCall_3_0()); 
	    }
		lv_objectValue_3_0=ruleObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValueRule());
	        }
       		set(
       			$current, 
       			"objectValue",
        		lv_objectValue_3_0, 
        		"Object");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getValueAccess().getArrayValueArrayParserRuleCall_4_0()); 
	    }
		lv_arrayValue_4_0=ruleArray		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValueRule());
	        }
       		set(
       			$current, 
       			"arrayValue",
        		lv_arrayValue_4_0, 
        		"Array");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getValueAccess().getNumberValueNumberParserRuleCall_5_0()); 
	    }
		lv_numberValue_5_0=ruleNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValueRule());
	        }
       		set(
       			$current, 
       			"numberValue",
        		lv_numberValue_5_0, 
        		"Number");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		lv_stringValue_6_0=RULE_STRING
		{
			newLeafNode(lv_stringValue_6_0, grammarAccess.getValueAccess().getStringValueSTRINGTerminalRuleCall_6_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"stringValue",
        		lv_stringValue_6_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleNumber
entryRuleNumber returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberRule()); } 
	 iv_ruleNumber=ruleNumber 
	 { $current=$iv_ruleNumber.current.getText(); }  
	 EOF 
;

// Rule Number
ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_2_0()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getNumberAccess().getINTTerminalRuleCall_2_1()); 
    }
)?((
	kw='e' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_3_0_0()); 
    }

    |
	kw='E' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_3_0_1()); 
    }
)(
	kw='+' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_3_1_0()); 
    }

    |
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_3_1_1()); 
    }
)?    this_INT_8=RULE_INT    {
		$current.merge(this_INT_8);
    }

    { 
    newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_3_2()); 
    }
)?)
    ;





// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	 iv_ruleObject=ruleObject 
	 { $current=$iv_ruleObject.current; } 
	 EOF 
;

// Rule Object
ruleObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_OBJECT_START_0=RULE_OBJECT_START
    { 
    newLeafNode(this_OBJECT_START_0, grammarAccess.getObjectAccess().getOBJECT_STARTTerminalRuleCall_0()); 
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_0_0()); 
	    }
		lv_properties_1_0=ruleObjectProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjectRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_1_0, 
        		"ObjectProperty");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_VALUE_SEP_2=RULE_VALUE_SEP
    { 
    newLeafNode(this_VALUE_SEP_2, grammarAccess.getObjectAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_1_1_0()); 
	    }
		lv_properties_3_0=ruleObjectProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjectRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_3_0, 
        		"ObjectProperty");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?this_OBJECT_END_4=RULE_OBJECT_END
    { 
    newLeafNode(this_OBJECT_END_4, grammarAccess.getObjectAccess().getOBJECT_ENDTerminalRuleCall_2()); 
    }
)
;





// Entry rule entryRuleObjectProperty
entryRuleObjectProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getObjectPropertyRule()); }
	 iv_ruleObjectProperty=ruleObjectProperty 
	 { $current=$iv_ruleObjectProperty.current; } 
	 EOF 
;

// Rule ObjectProperty
ruleObjectProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_propName_0_0=RULE_STRING
		{
			newLeafNode(lv_propName_0_0, grammarAccess.getObjectPropertyAccess().getPropNameSTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getObjectPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"propName",
        		lv_propName_0_0, 
        		"STRING");
	    }

)
)this_NAME_SEP_1=RULE_NAME_SEP
    { 
    newLeafNode(this_NAME_SEP_1, grammarAccess.getObjectPropertyAccess().getNAME_SEPTerminalRuleCall_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0()); 
	    }
		lv_propValue_2_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
	        }
       		set(
       			$current, 
       			"propValue",
        		lv_propValue_2_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleArray
entryRuleArray returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getArrayRule()); }
	 iv_ruleArray=ruleArray 
	 { $current=$iv_ruleArray.current; } 
	 EOF 
;

// Rule Array
ruleArray returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_ARRAY_START_0=RULE_ARRAY_START
    { 
    newLeafNode(this_ARRAY_START_0, grammarAccess.getArrayAccess().getARRAY_STARTTerminalRuleCall_0()); 
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_0_0()); 
	    }
		lv_elements_1_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArrayRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_1_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_VALUE_SEP_2=RULE_VALUE_SEP
    { 
    newLeafNode(this_VALUE_SEP_2, grammarAccess.getArrayAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_1_1_0()); 
	    }
		lv_elements_3_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArrayRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_3_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?this_ARRAY_END_4=RULE_ARRAY_END
    { 
    newLeafNode(this_ARRAY_END_4, grammarAccess.getArrayAccess().getARRAY_ENDTerminalRuleCall_2()); 
    }
)
;





RULE_ARRAY_START : '[';

RULE_ARRAY_END : ']';

RULE_OBJECT_START : '{';

RULE_OBJECT_END : '}';

RULE_NAME_SEP : ':';

RULE_VALUE_SEP : ',';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


