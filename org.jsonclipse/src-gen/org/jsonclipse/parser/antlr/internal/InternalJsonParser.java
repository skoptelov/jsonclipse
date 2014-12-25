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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_OBJECT_START", "RULE_VALUE_SEP", "RULE_OBJECT_END", "RULE_NAME_SEP", "RULE_ARRAY_START", "RULE_ARRAY_END", "RULE_DIGIT", "RULE_HEX", "RULE_E", "RULE_EXPONENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'null'", "'true'"
    };
    public static final int RULE_ID=17;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_FLOAT=5;
    public static final int RULE_SL_COMMENT=19;
    public static final int EOF=-1;
    public static final int RULE_OBJECT_END=9;
    public static final int RULE_ARRAY_START=11;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_ARRAY_END=12;
    public static final int RULE_STRING=4;
    public static final int RULE_HEX=14;
    public static final int RULE_E=15;
    public static final int RULE_EXPONENT=16;
    public static final int RULE_OBJECT_START=7;
    public static final int RULE_VALUE_SEP=8;
    public static final int RULE_INT=6;
    public static final int RULE_WS=20;
    public static final int RULE_DIGIT=13;
    public static final int RULE_NAME_SEP=10;

    // delegates
    // delegators


        public InternalJsonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonParser.tokenNames; }
    public String getGrammarFileName() { return "../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:76:1: ruleModel returns [EObject current=null] : ( (lv_root_0_0= ruleValue ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_root_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:79:28: ( ( (lv_root_0_0= ruleValue ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:80:1: ( (lv_root_0_0= ruleValue ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:80:1: ( (lv_root_0_0= ruleValue ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:81:1: (lv_root_0_0= ruleValue )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:81:1: (lv_root_0_0= ruleValue )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:82:3: lv_root_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getRootValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleModel130);
            lv_root_0_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"root",
                    		lv_root_0_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleValue"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:106:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:107:2: (iv_ruleValue= ruleValue EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:108:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue165);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:115:1: ruleValue returns [EObject current=null] : (otherlv_0= 'false' | otherlv_1= 'null' | otherlv_2= 'true' | ( (lv_objectValue_3_0= ruleObject ) ) | ( (lv_arrayValue_4_0= ruleArray ) ) | ( (lv_numberValue_5_0= ruleNumber ) ) | ( (lv_stringValue_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_stringValue_6_0=null;
        EObject lv_objectValue_3_0 = null;

        EObject lv_arrayValue_4_0 = null;

        AntlrDatatypeRuleToken lv_numberValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:118:28: ( (otherlv_0= 'false' | otherlv_1= 'null' | otherlv_2= 'true' | ( (lv_objectValue_3_0= ruleObject ) ) | ( (lv_arrayValue_4_0= ruleArray ) ) | ( (lv_numberValue_5_0= ruleNumber ) ) | ( (lv_stringValue_6_0= RULE_STRING ) ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:119:1: (otherlv_0= 'false' | otherlv_1= 'null' | otherlv_2= 'true' | ( (lv_objectValue_3_0= ruleObject ) ) | ( (lv_arrayValue_4_0= ruleArray ) ) | ( (lv_numberValue_5_0= ruleNumber ) ) | ( (lv_stringValue_6_0= RULE_STRING ) ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:119:1: (otherlv_0= 'false' | otherlv_1= 'null' | otherlv_2= 'true' | ( (lv_objectValue_3_0= ruleObject ) ) | ( (lv_arrayValue_4_0= ruleArray ) ) | ( (lv_numberValue_5_0= ruleNumber ) ) | ( (lv_stringValue_6_0= RULE_STRING ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case RULE_OBJECT_START:
                {
                alt1=4;
                }
                break;
            case RULE_ARRAY_START:
                {
                alt1=5;
                }
                break;
            case RULE_FLOAT:
            case RULE_INT:
                {
                alt1=6;
                }
                break;
            case RULE_STRING:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:119:3: otherlv_0= 'false'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleValue212); 

                        	newLeafNode(otherlv_0, grammarAccess.getValueAccess().getFalseKeyword_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:124:7: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleValue230); 

                        	newLeafNode(otherlv_1, grammarAccess.getValueAccess().getNullKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:129:7: otherlv_2= 'true'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleValue248); 

                        	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getTrueKeyword_2());
                        

                    }
                    break;
                case 4 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:134:6: ( (lv_objectValue_3_0= ruleObject ) )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:134:6: ( (lv_objectValue_3_0= ruleObject ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:135:1: (lv_objectValue_3_0= ruleObject )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:135:1: (lv_objectValue_3_0= ruleObject )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:136:3: lv_objectValue_3_0= ruleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getObjectValueObjectParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObject_in_ruleValue275);
                    lv_objectValue_3_0=ruleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"objectValue",
                            		lv_objectValue_3_0, 
                            		"Object");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:153:6: ( (lv_arrayValue_4_0= ruleArray ) )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:153:6: ( (lv_arrayValue_4_0= ruleArray ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:154:1: (lv_arrayValue_4_0= ruleArray )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:154:1: (lv_arrayValue_4_0= ruleArray )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:155:3: lv_arrayValue_4_0= ruleArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getArrayValueArrayParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArray_in_ruleValue302);
                    lv_arrayValue_4_0=ruleArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"arrayValue",
                            		lv_arrayValue_4_0, 
                            		"Array");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:172:6: ( (lv_numberValue_5_0= ruleNumber ) )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:172:6: ( (lv_numberValue_5_0= ruleNumber ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:173:1: (lv_numberValue_5_0= ruleNumber )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:173:1: (lv_numberValue_5_0= ruleNumber )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:174:3: lv_numberValue_5_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getNumberValueNumberParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleValue329);
                    lv_numberValue_5_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"numberValue",
                            		lv_numberValue_5_0, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:191:6: ( (lv_stringValue_6_0= RULE_STRING ) )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:191:6: ( (lv_stringValue_6_0= RULE_STRING ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:192:1: (lv_stringValue_6_0= RULE_STRING )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:192:1: (lv_stringValue_6_0= RULE_STRING )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:193:3: lv_stringValue_6_0= RULE_STRING
                    {
                    lv_stringValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue352); 

                    			newLeafNode(lv_stringValue_6_0, grammarAccess.getValueAccess().getStringValueSTRINGTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringValue",
                            		lv_stringValue_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleNumber"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:217:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:218:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:219:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber394);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:226:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:229:28: ( (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:1: (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:1: (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_FLOAT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:6: this_FLOAT_0= RULE_FLOAT
                    {
                    this_FLOAT_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleNumber445); 

                    		current.merge(this_FLOAT_0);
                        
                     
                        newLeafNode(this_FLOAT_0, grammarAccess.getNumberAccess().getFLOATTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:238:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber471); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleObject"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:253:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:254:2: (iv_ruleObject= ruleObject EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:255:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject516);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:262:1: ruleObject returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token this_VALUE_SEP_2=null;
        Token this_OBJECT_END_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:265:28: ( (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:266:1: (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:266:1: (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:266:2: this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_RULE_OBJECT_START_in_ruleObject562); 
             
                newLeafNode(this_OBJECT_START_0, grammarAccess.getObjectAccess().getOBJECT_STARTTerminalRuleCall_0()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:270:1: ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:270:2: ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )*
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:270:2: ( (lv_properties_1_0= ruleObjectProperty ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:271:1: (lv_properties_1_0= ruleObjectProperty )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:271:1: (lv_properties_1_0= ruleObjectProperty )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:272:3: lv_properties_1_0= ruleObjectProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObjectProperty_in_ruleObject583);
                    lv_properties_1_0=ruleObjectProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"properties",
                            		lv_properties_1_0, 
                            		"ObjectProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:288:2: (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_VALUE_SEP) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:288:3: this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) )
                    	    {
                    	    this_VALUE_SEP_2=(Token)match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_ruleObject595); 
                    	     
                    	        newLeafNode(this_VALUE_SEP_2, grammarAccess.getObjectAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
                    	        
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:292:1: ( (lv_properties_3_0= ruleObjectProperty ) )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:293:1: (lv_properties_3_0= ruleObjectProperty )
                    	    {
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:293:1: (lv_properties_3_0= ruleObjectProperty )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:294:3: lv_properties_3_0= ruleObjectProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleObjectProperty_in_ruleObject615);
                    	    lv_properties_3_0=ruleObjectProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_3_0, 
                    	            		"ObjectProperty");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            this_OBJECT_END_4=(Token)match(input,RULE_OBJECT_END,FOLLOW_RULE_OBJECT_END_in_ruleObject630); 
             
                newLeafNode(this_OBJECT_END_4, grammarAccess.getObjectAccess().getOBJECT_ENDTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleObjectProperty"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:322:1: entryRuleObjectProperty returns [EObject current=null] : iv_ruleObjectProperty= ruleObjectProperty EOF ;
    public final EObject entryRuleObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperty = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:323:2: (iv_ruleObjectProperty= ruleObjectProperty EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:324:2: iv_ruleObjectProperty= ruleObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyRule()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty665);
            iv_ruleObjectProperty=ruleObjectProperty();

            state._fsp--;

             current =iv_ruleObjectProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectProperty675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectProperty"


    // $ANTLR start "ruleObjectProperty"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:331:1: ruleObjectProperty returns [EObject current=null] : ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) ) ;
    public final EObject ruleObjectProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propName_0_0=null;
        Token this_NAME_SEP_1=null;
        EObject lv_propValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:334:28: ( ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:335:1: ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:335:1: ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:335:2: ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:335:2: ( (lv_propName_0_0= RULE_STRING ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:336:1: (lv_propName_0_0= RULE_STRING )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:336:1: (lv_propName_0_0= RULE_STRING )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:337:3: lv_propName_0_0= RULE_STRING
            {
            lv_propName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObjectProperty717); 

            			newLeafNode(lv_propName_0_0, grammarAccess.getObjectPropertyAccess().getPropNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propName",
                    		lv_propName_0_0, 
                    		"STRING");
            	    

            }


            }

            this_NAME_SEP_1=(Token)match(input,RULE_NAME_SEP,FOLLOW_RULE_NAME_SEP_in_ruleObjectProperty733); 
             
                newLeafNode(this_NAME_SEP_1, grammarAccess.getObjectPropertyAccess().getNAME_SEPTerminalRuleCall_1()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:357:1: ( (lv_propValue_2_0= ruleValue ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:358:1: (lv_propValue_2_0= ruleValue )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:358:1: (lv_propValue_2_0= ruleValue )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:359:3: lv_propValue_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleObjectProperty753);
            lv_propValue_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"propValue",
                    		lv_propValue_2_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectProperty"


    // $ANTLR start "entryRuleArray"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:383:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:384:2: (iv_ruleArray= ruleArray EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:385:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray789);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray799); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:392:1: ruleArray returns [EObject current=null] : (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token this_ARRAY_START_0=null;
        Token this_VALUE_SEP_2=null;
        Token this_ARRAY_END_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:395:28: ( (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:396:1: (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:396:1: (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:396:2: this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END
            {
            this_ARRAY_START_0=(Token)match(input,RULE_ARRAY_START,FOLLOW_RULE_ARRAY_START_in_ruleArray835); 
             
                newLeafNode(this_ARRAY_START_0, grammarAccess.getArrayAccess().getARRAY_STARTTerminalRuleCall_0()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:400:1: ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_OBJECT_START)||LA6_0==RULE_ARRAY_START||(LA6_0>=22 && LA6_0<=24)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:400:2: ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )*
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:400:2: ( (lv_elements_1_0= ruleValue ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:401:1: (lv_elements_1_0= ruleValue )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:401:1: (lv_elements_1_0= ruleValue )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:402:3: lv_elements_1_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray856);
                    lv_elements_1_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_1_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:418:2: (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_VALUE_SEP) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:418:3: this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) )
                    	    {
                    	    this_VALUE_SEP_2=(Token)match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_ruleArray868); 
                    	     
                    	        newLeafNode(this_VALUE_SEP_2, grammarAccess.getArrayAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
                    	        
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:422:1: ( (lv_elements_3_0= ruleValue ) )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:423:1: (lv_elements_3_0= ruleValue )
                    	    {
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:423:1: (lv_elements_3_0= ruleValue )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:424:3: lv_elements_3_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleArray888);
                    	    lv_elements_3_0=ruleValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArrayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"Value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            this_ARRAY_END_4=(Token)match(input,RULE_ARRAY_END,FOLLOW_RULE_ARRAY_END_in_ruleArray903); 
             
                newLeafNode(this_ARRAY_END_4, grammarAccess.getArrayAccess().getARRAY_ENDTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleValue212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValue230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValue248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleValue275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleValue329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleNumber445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_START_in_ruleObject562 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_ruleObject583 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_ruleObject595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_ruleObject615 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_OBJECT_END_in_ruleObject630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectProperty675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjectProperty717 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_NAME_SEP_in_ruleObjectProperty733 = new BitSet(new long[]{0x0000000001C008F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleObjectProperty753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_START_in_ruleArray835 = new BitSet(new long[]{0x0000000001C018F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray856 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_ruleArray868 = new BitSet(new long[]{0x0000000001C008F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray888 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RULE_ARRAY_END_in_ruleArray903 = new BitSet(new long[]{0x0000000000000002L});

}