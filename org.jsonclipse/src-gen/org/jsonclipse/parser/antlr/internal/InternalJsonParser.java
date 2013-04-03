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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_OBJECT_START", "RULE_VALUE_SEP", "RULE_OBJECT_END", "RULE_NAME_SEP", "RULE_ARRAY_START", "RULE_ARRAY_END", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'null'", "'true'", "'-'", "'.'", "'e'", "'E'", "'+'"
    };
    public static final int RULE_ID=12;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_OBJECT_END=8;
    public static final int RULE_ARRAY_START=10;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_ARRAY_END=11;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_OBJECT_START=6;
    public static final int RULE_VALUE_SEP=7;
    public static final int RULE_INT=5;
    public static final int RULE_WS=15;
    public static final int RULE_NAME_SEP=9;

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
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
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
            case RULE_INT:
            case 20:
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
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleValue212); 

                        	newLeafNode(otherlv_0, grammarAccess.getValueAccess().getFalseKeyword_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:124:7: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleValue230); 

                        	newLeafNode(otherlv_1, grammarAccess.getValueAccess().getNullKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:129:7: otherlv_2= 'true'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleValue248); 

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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:226:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_8= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_8=null;

         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:229:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_8= RULE_INT )? ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_8= RULE_INT )? )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_8= RULE_INT )? )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_8= RULE_INT )?
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:2: (kw= '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:231:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleNumber444); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber461); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:243:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:244:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleNumber480); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber495); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getNumberAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:256:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_8= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=23)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:256:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_8= RULE_INT
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:256:4: (kw= 'e' | kw= 'E' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==22) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==23) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:257:2: kw= 'e'
                            {
                            kw=(Token)match(input,22,FOLLOW_22_in_ruleNumber517); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:264:2: kw= 'E'
                            {
                            kw=(Token)match(input,23,FOLLOW_23_in_ruleNumber536); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:269:2: (kw= '+' | kw= '-' )?
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==24) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==20) ) {
                        alt5=2;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:270:2: kw= '+'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleNumber551); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_3_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:277:2: kw= '-'
                            {
                            kw=(Token)match(input,20,FOLLOW_20_in_ruleNumber570); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_3_1_1()); 
                                

                            }
                            break;

                    }

                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber587); 

                    		current.merge(this_INT_8);
                        
                     
                        newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_3_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleObject"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:297:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:298:2: (iv_ruleObject= ruleObject EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:299:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject634);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject644); 

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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:306:1: ruleObject returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token this_VALUE_SEP_2=null;
        Token this_OBJECT_END_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:309:28: ( (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:310:1: (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:310:1: (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:310:2: this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_RULE_OBJECT_START_in_ruleObject680); 
             
                newLeafNode(this_OBJECT_START_0, grammarAccess.getObjectAccess().getOBJECT_STARTTerminalRuleCall_0()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:314:1: ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:314:2: ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )*
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:314:2: ( (lv_properties_1_0= ruleObjectProperty ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:315:1: (lv_properties_1_0= ruleObjectProperty )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:315:1: (lv_properties_1_0= ruleObjectProperty )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:316:3: lv_properties_1_0= ruleObjectProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObjectProperty_in_ruleObject701);
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

                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:332:2: (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_VALUE_SEP) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:332:3: this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) )
                    	    {
                    	    this_VALUE_SEP_2=(Token)match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_ruleObject713); 
                    	     
                    	        newLeafNode(this_VALUE_SEP_2, grammarAccess.getObjectAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
                    	        
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:336:1: ( (lv_properties_3_0= ruleObjectProperty ) )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:337:1: (lv_properties_3_0= ruleObjectProperty )
                    	    {
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:337:1: (lv_properties_3_0= ruleObjectProperty )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:338:3: lv_properties_3_0= ruleObjectProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleObjectProperty_in_ruleObject733);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            this_OBJECT_END_4=(Token)match(input,RULE_OBJECT_END,FOLLOW_RULE_OBJECT_END_in_ruleObject748); 
             
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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:366:1: entryRuleObjectProperty returns [EObject current=null] : iv_ruleObjectProperty= ruleObjectProperty EOF ;
    public final EObject entryRuleObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperty = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:367:2: (iv_ruleObjectProperty= ruleObjectProperty EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:368:2: iv_ruleObjectProperty= ruleObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyRule()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty783);
            iv_ruleObjectProperty=ruleObjectProperty();

            state._fsp--;

             current =iv_ruleObjectProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectProperty793); 

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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:375:1: ruleObjectProperty returns [EObject current=null] : ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) ) ;
    public final EObject ruleObjectProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propName_0_0=null;
        Token this_NAME_SEP_1=null;
        EObject lv_propValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:378:28: ( ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:379:1: ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:379:1: ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:379:2: ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:379:2: ( (lv_propName_0_0= RULE_STRING ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:380:1: (lv_propName_0_0= RULE_STRING )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:380:1: (lv_propName_0_0= RULE_STRING )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:381:3: lv_propName_0_0= RULE_STRING
            {
            lv_propName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObjectProperty835); 

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

            this_NAME_SEP_1=(Token)match(input,RULE_NAME_SEP,FOLLOW_RULE_NAME_SEP_in_ruleObjectProperty851); 
             
                newLeafNode(this_NAME_SEP_1, grammarAccess.getObjectPropertyAccess().getNAME_SEPTerminalRuleCall_1()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:401:1: ( (lv_propValue_2_0= ruleValue ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:402:1: (lv_propValue_2_0= ruleValue )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:402:1: (lv_propValue_2_0= ruleValue )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:403:3: lv_propValue_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleObjectProperty871);
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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:427:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:428:2: (iv_ruleArray= ruleArray EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:429:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray907);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray917); 

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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:436:1: ruleArray returns [EObject current=null] : (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token this_ARRAY_START_0=null;
        Token this_VALUE_SEP_2=null;
        Token this_ARRAY_END_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:439:28: ( (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:440:1: (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:440:1: (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:440:2: this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END
            {
            this_ARRAY_START_0=(Token)match(input,RULE_ARRAY_START,FOLLOW_RULE_ARRAY_START_in_ruleArray953); 
             
                newLeafNode(this_ARRAY_START_0, grammarAccess.getArrayAccess().getARRAY_STARTTerminalRuleCall_0()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:444:1: ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_OBJECT_START)||LA10_0==RULE_ARRAY_START||(LA10_0>=17 && LA10_0<=20)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:444:2: ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )*
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:444:2: ( (lv_elements_1_0= ruleValue ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:445:1: (lv_elements_1_0= ruleValue )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:445:1: (lv_elements_1_0= ruleValue )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:446:3: lv_elements_1_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray974);
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

                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:462:2: (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_VALUE_SEP) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:462:3: this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) )
                    	    {
                    	    this_VALUE_SEP_2=(Token)match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_ruleArray986); 
                    	     
                    	        newLeafNode(this_VALUE_SEP_2, grammarAccess.getArrayAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
                    	        
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:466:1: ( (lv_elements_3_0= ruleValue ) )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:467:1: (lv_elements_3_0= ruleValue )
                    	    {
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:467:1: (lv_elements_3_0= ruleValue )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:468:3: lv_elements_3_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleArray1006);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            this_ARRAY_END_4=(Token)match(input,RULE_ARRAY_END,FOLLOW_RULE_ARRAY_END_in_ruleArray1021); 
             
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
    public static final BitSet FOLLOW_17_in_ruleValue212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleValue230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleValue248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleValue275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleValue329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNumber444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber461 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_21_in_ruleNumber480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber495 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ruleNumber517 = new BitSet(new long[]{0x0000000001100020L});
    public static final BitSet FOLLOW_23_in_ruleNumber536 = new BitSet(new long[]{0x0000000001100020L});
    public static final BitSet FOLLOW_24_in_ruleNumber551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20_in_ruleNumber570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_START_in_ruleObject680 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_ruleObject701 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_ruleObject713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_ruleObject733 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_OBJECT_END_in_ruleObject748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectProperty793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjectProperty835 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_NAME_SEP_in_ruleObjectProperty851 = new BitSet(new long[]{0x00000000001E0470L});
    public static final BitSet FOLLOW_ruleValue_in_ruleObjectProperty871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_START_in_ruleArray953 = new BitSet(new long[]{0x00000000001E0C70L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray974 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_ruleArray986 = new BitSet(new long[]{0x00000000001E0470L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray1006 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_RULE_ARRAY_END_in_ruleArray1021 = new BitSet(new long[]{0x0000000000000002L});

}