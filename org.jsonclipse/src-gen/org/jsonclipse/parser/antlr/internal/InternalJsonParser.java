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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_MINUS", "RULE_E", "RULE_PLUS", "RULE_DIGIT", "RULE_DOT", "RULE_ZERO", "RULE_DIGIT19", "RULE_OBJECT_START", "RULE_VALUE_SEP", "RULE_OBJECT_END", "RULE_NAME_SEP", "RULE_ARRAY_START", "RULE_ARRAY_END", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'null'", "'true'"
    };
    public static final int RULE_ID=18;
    public static final int RULE_ZERO=10;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_PLUS=7;
    public static final int RULE_SL_COMMENT=21;
    public static final int EOF=-1;
    public static final int RULE_OBJECT_END=14;
    public static final int RULE_ARRAY_START=16;
    public static final int RULE_ML_COMMENT=20;
    public static final int RULE_ARRAY_END=17;
    public static final int RULE_MINUS=5;
    public static final int RULE_STRING=4;
    public static final int RULE_E=6;
    public static final int RULE_DOT=9;
    public static final int RULE_OBJECT_START=12;
    public static final int RULE_VALUE_SEP=13;
    public static final int RULE_INT=19;
    public static final int RULE_DIGIT19=11;
    public static final int RULE_WS=22;
    public static final int RULE_DIGIT=8;
    public static final int RULE_NAME_SEP=15;

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
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
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
            case RULE_MINUS:
            case RULE_ZERO:
            case RULE_DIGIT19:
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
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleValue212); 

                        	newLeafNode(otherlv_0, grammarAccess.getValueAccess().getFalseKeyword_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:124:7: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleValue230); 

                        	newLeafNode(otherlv_1, grammarAccess.getValueAccess().getNullKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:129:7: otherlv_2= 'true'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleValue248); 

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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:226:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MINUS_0= RULE_MINUS )? this_Integer_1= ruleInteger (this_Frac_2= ruleFrac )? (this_Exp_3= ruleExp )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MINUS_0=null;
        AntlrDatatypeRuleToken this_Integer_1 = null;

        AntlrDatatypeRuleToken this_Frac_2 = null;

        AntlrDatatypeRuleToken this_Exp_3 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:229:28: ( ( (this_MINUS_0= RULE_MINUS )? this_Integer_1= ruleInteger (this_Frac_2= ruleFrac )? (this_Exp_3= ruleExp )? ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:1: ( (this_MINUS_0= RULE_MINUS )? this_Integer_1= ruleInteger (this_Frac_2= ruleFrac )? (this_Exp_3= ruleExp )? )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:1: ( (this_MINUS_0= RULE_MINUS )? this_Integer_1= ruleInteger (this_Frac_2= ruleFrac )? (this_Exp_3= ruleExp )? )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:2: (this_MINUS_0= RULE_MINUS )? this_Integer_1= ruleInteger (this_Frac_2= ruleFrac )? (this_Exp_3= ruleExp )?
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:2: (this_MINUS_0= RULE_MINUS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MINUS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:230:7: this_MINUS_0= RULE_MINUS
                    {
                    this_MINUS_0=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleNumber446); 

                    		current.merge(this_MINUS_0);
                        
                     
                        newLeafNode(this_MINUS_0, grammarAccess.getNumberAccess().getMINUSTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleInteger_in_ruleNumber475);
            this_Integer_1=ruleInteger();

            state._fsp--;


            		current.merge(this_Integer_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:248:1: (this_Frac_2= ruleFrac )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:249:5: this_Frac_2= ruleFrac
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getFracParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFrac_in_ruleNumber503);
                    this_Frac_2=ruleFrac();

                    state._fsp--;


                    		current.merge(this_Frac_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:259:3: (this_Exp_3= ruleExp )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_E) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:260:5: this_Exp_3= ruleExp
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getExpParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExp_in_ruleNumber533);
                    this_Exp_3=ruleExp();

                    state._fsp--;


                    		current.merge(this_Exp_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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


    // $ANTLR start "entryRuleExp"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:278:1: entryRuleExp returns [String current=null] : iv_ruleExp= ruleExp EOF ;
    public final String entryRuleExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExp = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:279:2: (iv_ruleExp= ruleExp EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:280:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp581);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp592); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:287:1: ruleExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_0= RULE_E (this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS )? (this_DIGIT_3= RULE_DIGIT )+ ) ;
    public final AntlrDatatypeRuleToken ruleExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_0=null;
        Token this_PLUS_1=null;
        Token this_MINUS_2=null;
        Token this_DIGIT_3=null;

         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:290:28: ( (this_E_0= RULE_E (this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS )? (this_DIGIT_3= RULE_DIGIT )+ ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:291:1: (this_E_0= RULE_E (this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS )? (this_DIGIT_3= RULE_DIGIT )+ )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:291:1: (this_E_0= RULE_E (this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS )? (this_DIGIT_3= RULE_DIGIT )+ )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:291:6: this_E_0= RULE_E (this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS )? (this_DIGIT_3= RULE_DIGIT )+
            {
            this_E_0=(Token)match(input,RULE_E,FOLLOW_RULE_E_in_ruleExp632); 

            		current.merge(this_E_0);
                
             
                newLeafNode(this_E_0, grammarAccess.getExpAccess().getETerminalRuleCall_0()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:298:1: (this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_PLUS) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_MINUS) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:298:6: this_PLUS_1= RULE_PLUS
                    {
                    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleExp653); 

                    		current.merge(this_PLUS_1);
                        
                     
                        newLeafNode(this_PLUS_1, grammarAccess.getExpAccess().getPLUSTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:306:10: this_MINUS_2= RULE_MINUS
                    {
                    this_MINUS_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleExp679); 

                    		current.merge(this_MINUS_2);
                        
                     
                        newLeafNode(this_MINUS_2, grammarAccess.getExpAccess().getMINUSTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }

            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:313:3: (this_DIGIT_3= RULE_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DIGIT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:313:8: this_DIGIT_3= RULE_DIGIT
            	    {
            	    this_DIGIT_3=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleExp702); 

            	    		current.merge(this_DIGIT_3);
            	        
            	     
            	        newLeafNode(this_DIGIT_3, grammarAccess.getExpAccess().getDIGITTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFrac"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:328:1: entryRuleFrac returns [String current=null] : iv_ruleFrac= ruleFrac EOF ;
    public final String entryRuleFrac() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFrac = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:329:2: (iv_ruleFrac= ruleFrac EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:330:2: iv_ruleFrac= ruleFrac EOF
            {
             newCompositeNode(grammarAccess.getFracRule()); 
            pushFollow(FOLLOW_ruleFrac_in_entryRuleFrac750);
            iv_ruleFrac=ruleFrac();

            state._fsp--;

             current =iv_ruleFrac.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrac761); 

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
    // $ANTLR end "entryRuleFrac"


    // $ANTLR start "ruleFrac"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:337:1: ruleFrac returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOT_0= RULE_DOT (this_DIGIT_1= RULE_DIGIT )+ ) ;
    public final AntlrDatatypeRuleToken ruleFrac() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_0=null;
        Token this_DIGIT_1=null;

         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:340:28: ( (this_DOT_0= RULE_DOT (this_DIGIT_1= RULE_DIGIT )+ ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:341:1: (this_DOT_0= RULE_DOT (this_DIGIT_1= RULE_DIGIT )+ )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:341:1: (this_DOT_0= RULE_DOT (this_DIGIT_1= RULE_DIGIT )+ )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:341:6: this_DOT_0= RULE_DOT (this_DIGIT_1= RULE_DIGIT )+
            {
            this_DOT_0=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleFrac801); 

            		current.merge(this_DOT_0);
                
             
                newLeafNode(this_DOT_0, grammarAccess.getFracAccess().getDOTTerminalRuleCall_0()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:348:1: (this_DIGIT_1= RULE_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DIGIT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:348:6: this_DIGIT_1= RULE_DIGIT
            	    {
            	    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleFrac822); 

            	    		current.merge(this_DIGIT_1);
            	        
            	     
            	        newLeafNode(this_DIGIT_1, grammarAccess.getFracAccess().getDIGITTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


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
    // $ANTLR end "ruleFrac"


    // $ANTLR start "entryRuleInteger"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:363:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:364:2: (iv_ruleInteger= ruleInteger EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:365:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger870);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger881); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:372:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ZERO_0= RULE_ZERO | (this_DIGIT19_1= RULE_DIGIT19 (this_DIGIT_2= RULE_DIGIT )* ) ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ZERO_0=null;
        Token this_DIGIT19_1=null;
        Token this_DIGIT_2=null;

         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:375:28: ( (this_ZERO_0= RULE_ZERO | (this_DIGIT19_1= RULE_DIGIT19 (this_DIGIT_2= RULE_DIGIT )* ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:376:1: (this_ZERO_0= RULE_ZERO | (this_DIGIT19_1= RULE_DIGIT19 (this_DIGIT_2= RULE_DIGIT )* ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:376:1: (this_ZERO_0= RULE_ZERO | (this_DIGIT19_1= RULE_DIGIT19 (this_DIGIT_2= RULE_DIGIT )* ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ZERO) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_DIGIT19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:376:6: this_ZERO_0= RULE_ZERO
                    {
                    this_ZERO_0=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleInteger921); 

                    		current.merge(this_ZERO_0);
                        
                     
                        newLeafNode(this_ZERO_0, grammarAccess.getIntegerAccess().getZEROTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:384:6: (this_DIGIT19_1= RULE_DIGIT19 (this_DIGIT_2= RULE_DIGIT )* )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:384:6: (this_DIGIT19_1= RULE_DIGIT19 (this_DIGIT_2= RULE_DIGIT )* )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:384:11: this_DIGIT19_1= RULE_DIGIT19 (this_DIGIT_2= RULE_DIGIT )*
                    {
                    this_DIGIT19_1=(Token)match(input,RULE_DIGIT19,FOLLOW_RULE_DIGIT19_in_ruleInteger948); 

                    		current.merge(this_DIGIT19_1);
                        
                     
                        newLeafNode(this_DIGIT19_1, grammarAccess.getIntegerAccess().getDIGIT19TerminalRuleCall_1_0()); 
                        
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:391:1: (this_DIGIT_2= RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_DIGIT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:391:6: this_DIGIT_2= RULE_DIGIT
                    	    {
                    	    this_DIGIT_2=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleInteger969); 

                    	    		current.merge(this_DIGIT_2);
                    	        
                    	     
                    	        newLeafNode(this_DIGIT_2, grammarAccess.getIntegerAccess().getDIGITTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleObject"
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:406:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:407:2: (iv_ruleObject= ruleObject EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:408:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject1017);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject1027); 

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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:415:1: ruleObject returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token this_VALUE_SEP_2=null;
        Token this_OBJECT_END_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:418:28: ( (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:419:1: (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:419:1: (this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:419:2: this_OBJECT_START_0= RULE_OBJECT_START ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )? this_OBJECT_END_4= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_RULE_OBJECT_START_in_ruleObject1063); 
             
                newLeafNode(this_OBJECT_START_0, grammarAccess.getObjectAccess().getOBJECT_STARTTerminalRuleCall_0()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:423:1: ( ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:423:2: ( (lv_properties_1_0= ruleObjectProperty ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )*
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:423:2: ( (lv_properties_1_0= ruleObjectProperty ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:424:1: (lv_properties_1_0= ruleObjectProperty )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:424:1: (lv_properties_1_0= ruleObjectProperty )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:425:3: lv_properties_1_0= ruleObjectProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObjectProperty_in_ruleObject1084);
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

                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:441:2: (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_VALUE_SEP) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:441:3: this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_properties_3_0= ruleObjectProperty ) )
                    	    {
                    	    this_VALUE_SEP_2=(Token)match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_ruleObject1096); 
                    	     
                    	        newLeafNode(this_VALUE_SEP_2, grammarAccess.getObjectAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
                    	        
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:445:1: ( (lv_properties_3_0= ruleObjectProperty ) )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:446:1: (lv_properties_3_0= ruleObjectProperty )
                    	    {
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:446:1: (lv_properties_3_0= ruleObjectProperty )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:447:3: lv_properties_3_0= ruleObjectProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleObjectProperty_in_ruleObject1116);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            this_OBJECT_END_4=(Token)match(input,RULE_OBJECT_END,FOLLOW_RULE_OBJECT_END_in_ruleObject1131); 
             
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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:475:1: entryRuleObjectProperty returns [EObject current=null] : iv_ruleObjectProperty= ruleObjectProperty EOF ;
    public final EObject entryRuleObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperty = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:476:2: (iv_ruleObjectProperty= ruleObjectProperty EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:477:2: iv_ruleObjectProperty= ruleObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyRule()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty1166);
            iv_ruleObjectProperty=ruleObjectProperty();

            state._fsp--;

             current =iv_ruleObjectProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectProperty1176); 

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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:484:1: ruleObjectProperty returns [EObject current=null] : ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) ) ;
    public final EObject ruleObjectProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propName_0_0=null;
        Token this_NAME_SEP_1=null;
        EObject lv_propValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:487:28: ( ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:488:1: ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:488:1: ( ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:488:2: ( (lv_propName_0_0= RULE_STRING ) ) this_NAME_SEP_1= RULE_NAME_SEP ( (lv_propValue_2_0= ruleValue ) )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:488:2: ( (lv_propName_0_0= RULE_STRING ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:489:1: (lv_propName_0_0= RULE_STRING )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:489:1: (lv_propName_0_0= RULE_STRING )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:490:3: lv_propName_0_0= RULE_STRING
            {
            lv_propName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObjectProperty1218); 

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

            this_NAME_SEP_1=(Token)match(input,RULE_NAME_SEP,FOLLOW_RULE_NAME_SEP_in_ruleObjectProperty1234); 
             
                newLeafNode(this_NAME_SEP_1, grammarAccess.getObjectPropertyAccess().getNAME_SEPTerminalRuleCall_1()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:510:1: ( (lv_propValue_2_0= ruleValue ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:511:1: (lv_propValue_2_0= ruleValue )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:511:1: (lv_propValue_2_0= ruleValue )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:512:3: lv_propValue_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleObjectProperty1254);
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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:536:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:537:2: (iv_ruleArray= ruleArray EOF )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:538:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1290);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1300); 

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
    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:545:1: ruleArray returns [EObject current=null] : (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token this_ARRAY_START_0=null;
        Token this_VALUE_SEP_2=null;
        Token this_ARRAY_END_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:548:28: ( (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END ) )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:549:1: (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END )
            {
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:549:1: (this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END )
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:549:2: this_ARRAY_START_0= RULE_ARRAY_START ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )? this_ARRAY_END_4= RULE_ARRAY_END
            {
            this_ARRAY_START_0=(Token)match(input,RULE_ARRAY_START,FOLLOW_RULE_ARRAY_START_in_ruleArray1336); 
             
                newLeafNode(this_ARRAY_START_0, grammarAccess.getArrayAccess().getARRAY_STARTTerminalRuleCall_0()); 
                
            // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:553:1: ( ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_MINUS)||(LA13_0>=RULE_ZERO && LA13_0<=RULE_OBJECT_START)||LA13_0==RULE_ARRAY_START||(LA13_0>=24 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:553:2: ( (lv_elements_1_0= ruleValue ) ) (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )*
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:553:2: ( (lv_elements_1_0= ruleValue ) )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:554:1: (lv_elements_1_0= ruleValue )
                    {
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:554:1: (lv_elements_1_0= ruleValue )
                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:555:3: lv_elements_1_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray1357);
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

                    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:571:2: (this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_VALUE_SEP) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:571:3: this_VALUE_SEP_2= RULE_VALUE_SEP ( (lv_elements_3_0= ruleValue ) )
                    	    {
                    	    this_VALUE_SEP_2=(Token)match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_ruleArray1369); 
                    	     
                    	        newLeafNode(this_VALUE_SEP_2, grammarAccess.getArrayAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
                    	        
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:575:1: ( (lv_elements_3_0= ruleValue ) )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:576:1: (lv_elements_3_0= ruleValue )
                    	    {
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:576:1: (lv_elements_3_0= ruleValue )
                    	    // ../org.jsonclipse/src-gen/org/jsonclipse/parser/antlr/internal/InternalJson.g:577:3: lv_elements_3_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleArray1389);
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            this_ARRAY_END_4=(Token)match(input,RULE_ARRAY_END,FOLLOW_RULE_ARRAY_END_in_ruleArray1404); 
             
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
    public static final BitSet FOLLOW_24_in_ruleValue212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleValue230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleValue248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleValue275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleValue329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleNumber446 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleNumber475 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_ruleFrac_in_ruleNumber503 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleExp_in_ruleNumber533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_E_in_ruleExp632 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleExp653 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleExp679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleExp702 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleFrac_in_entryRuleFrac750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrac761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleFrac801 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleFrac822 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleInteger921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT19_in_ruleInteger948 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleInteger969 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject1017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_START_in_ruleObject1063 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_ruleObject1084 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_ruleObject1096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_ruleObject1116 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_OBJECT_END_in_ruleObject1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectProperty1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjectProperty1218 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_NAME_SEP_in_ruleObjectProperty1234 = new BitSet(new long[]{0x0000000007011C30L});
    public static final BitSet FOLLOW_ruleValue_in_ruleObjectProperty1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_START_in_ruleArray1336 = new BitSet(new long[]{0x0000000007031C30L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray1357 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_ruleArray1369 = new BitSet(new long[]{0x0000000007011C30L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray1389 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_RULE_ARRAY_END_in_ruleArray1404 = new BitSet(new long[]{0x0000000000000002L});

}