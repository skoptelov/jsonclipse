package org.jsonclipse.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.jsonclipse.services.JsonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT", "RULE_INT", "RULE_OBJECT_START", "RULE_OBJECT_END", "RULE_VALUE_SEP", "RULE_NAME_SEP", "RULE_ARRAY_START", "RULE_ARRAY_END", "RULE_STRING", "RULE_DIGIT", "RULE_HEX", "RULE_E", "RULE_EXPONENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'null'", "'true'"
    };
    public static final int RULE_ID=17;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_FLOAT=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int EOF=-1;
    public static final int RULE_OBJECT_END=7;
    public static final int RULE_ARRAY_START=10;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_ARRAY_END=11;
    public static final int RULE_STRING=12;
    public static final int RULE_HEX=14;
    public static final int RULE_E=15;
    public static final int RULE_EXPONENT=16;
    public static final int RULE_OBJECT_START=6;
    public static final int RULE_VALUE_SEP=8;
    public static final int RULE_INT=5;
    public static final int RULE_WS=20;
    public static final int RULE_DIGIT=13;
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
    public String getGrammarFileName() { return "../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g"; }


     
     	private JsonGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JsonGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:61:1: ( ruleModel EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:69:1: ruleModel : ( ( rule__Model__RootAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:73:2: ( ( ( rule__Model__RootAssignment ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:74:1: ( ( rule__Model__RootAssignment ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:74:1: ( ( rule__Model__RootAssignment ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:75:1: ( rule__Model__RootAssignment )
            {
             before(grammarAccess.getModelAccess().getRootAssignment()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:76:1: ( rule__Model__RootAssignment )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:76:2: rule__Model__RootAssignment
            {
            pushFollow(FOLLOW_rule__Model__RootAssignment_in_ruleModel94);
            rule__Model__RootAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRootAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleValue"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:88:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:89:1: ( ruleValue EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:90:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue121);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:97:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:101:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:102:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:102:1: ( ( rule__Value__Alternatives ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:103:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:104:1: ( rule__Value__Alternatives )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:104:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue154);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleNumber"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:116:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:117:1: ( ruleNumber EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:118:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber181);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:125:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:129:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:130:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:130:1: ( ( rule__Number__Alternatives ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:131:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:132:1: ( rule__Number__Alternatives )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:132:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber214);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleObject"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:144:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:145:1: ( ruleObject EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:146:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject241);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:153:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:157:2: ( ( ( rule__Object__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:158:1: ( ( rule__Object__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:158:1: ( ( rule__Object__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:159:1: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:160:1: ( rule__Object__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:160:2: rule__Object__Group__0
            {
            pushFollow(FOLLOW_rule__Object__Group__0_in_ruleObject274);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleObjectProperty"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:172:1: entryRuleObjectProperty : ruleObjectProperty EOF ;
    public final void entryRuleObjectProperty() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:173:1: ( ruleObjectProperty EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:174:1: ruleObjectProperty EOF
            {
             before(grammarAccess.getObjectPropertyRule()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty301);
            ruleObjectProperty();

            state._fsp--;

             after(grammarAccess.getObjectPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectProperty308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectProperty"


    // $ANTLR start "ruleObjectProperty"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:181:1: ruleObjectProperty : ( ( rule__ObjectProperty__Group__0 ) ) ;
    public final void ruleObjectProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:185:2: ( ( ( rule__ObjectProperty__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:186:1: ( ( rule__ObjectProperty__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:186:1: ( ( rule__ObjectProperty__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:187:1: ( rule__ObjectProperty__Group__0 )
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:188:1: ( rule__ObjectProperty__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:188:2: rule__ObjectProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__0_in_ruleObjectProperty334);
            rule__ObjectProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectProperty"


    // $ANTLR start "entryRuleArray"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:200:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:201:1: ( ruleArray EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:202:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray361);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:209:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:213:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:214:1: ( ( rule__Array__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:214:1: ( ( rule__Array__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:215:1: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:216:1: ( rule__Array__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:216:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray394);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:228:1: rule__Value__Alternatives : ( ( 'false' ) | ( 'null' ) | ( 'true' ) | ( ( rule__Value__ObjectValueAssignment_3 ) ) | ( ( rule__Value__ArrayValueAssignment_4 ) ) | ( ( rule__Value__NumberValueAssignment_5 ) ) | ( ( rule__Value__StringValueAssignment_6 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:232:1: ( ( 'false' ) | ( 'null' ) | ( 'true' ) | ( ( rule__Value__ObjectValueAssignment_3 ) ) | ( ( rule__Value__ArrayValueAssignment_4 ) ) | ( ( rule__Value__NumberValueAssignment_5 ) ) | ( ( rule__Value__StringValueAssignment_6 ) ) )
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
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:233:1: ( 'false' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:233:1: ( 'false' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:234:1: 'false'
                    {
                     before(grammarAccess.getValueAccess().getFalseKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__Value__Alternatives431); 
                     after(grammarAccess.getValueAccess().getFalseKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:241:6: ( 'null' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:241:6: ( 'null' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:242:1: 'null'
                    {
                     before(grammarAccess.getValueAccess().getNullKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__Value__Alternatives451); 
                     after(grammarAccess.getValueAccess().getNullKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:249:6: ( 'true' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:249:6: ( 'true' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:250:1: 'true'
                    {
                     before(grammarAccess.getValueAccess().getTrueKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__Value__Alternatives471); 
                     after(grammarAccess.getValueAccess().getTrueKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:257:6: ( ( rule__Value__ObjectValueAssignment_3 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:257:6: ( ( rule__Value__ObjectValueAssignment_3 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:258:1: ( rule__Value__ObjectValueAssignment_3 )
                    {
                     before(grammarAccess.getValueAccess().getObjectValueAssignment_3()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:259:1: ( rule__Value__ObjectValueAssignment_3 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:259:2: rule__Value__ObjectValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Value__ObjectValueAssignment_3_in_rule__Value__Alternatives490);
                    rule__Value__ObjectValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getObjectValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:263:6: ( ( rule__Value__ArrayValueAssignment_4 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:263:6: ( ( rule__Value__ArrayValueAssignment_4 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:264:1: ( rule__Value__ArrayValueAssignment_4 )
                    {
                     before(grammarAccess.getValueAccess().getArrayValueAssignment_4()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:265:1: ( rule__Value__ArrayValueAssignment_4 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:265:2: rule__Value__ArrayValueAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Value__ArrayValueAssignment_4_in_rule__Value__Alternatives508);
                    rule__Value__ArrayValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getArrayValueAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:269:6: ( ( rule__Value__NumberValueAssignment_5 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:269:6: ( ( rule__Value__NumberValueAssignment_5 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:270:1: ( rule__Value__NumberValueAssignment_5 )
                    {
                     before(grammarAccess.getValueAccess().getNumberValueAssignment_5()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:271:1: ( rule__Value__NumberValueAssignment_5 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:271:2: rule__Value__NumberValueAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Value__NumberValueAssignment_5_in_rule__Value__Alternatives526);
                    rule__Value__NumberValueAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getNumberValueAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:275:6: ( ( rule__Value__StringValueAssignment_6 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:275:6: ( ( rule__Value__StringValueAssignment_6 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:276:1: ( rule__Value__StringValueAssignment_6 )
                    {
                     before(grammarAccess.getValueAccess().getStringValueAssignment_6()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:277:1: ( rule__Value__StringValueAssignment_6 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:277:2: rule__Value__StringValueAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Value__StringValueAssignment_6_in_rule__Value__Alternatives544);
                    rule__Value__StringValueAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getStringValueAssignment_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:286:1: rule__Number__Alternatives : ( ( RULE_FLOAT ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:290:1: ( ( RULE_FLOAT ) | ( RULE_INT ) )
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
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:291:1: ( RULE_FLOAT )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:291:1: ( RULE_FLOAT )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:292:1: RULE_FLOAT
                    {
                     before(grammarAccess.getNumberAccess().getFLOATTerminalRuleCall_0()); 
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Number__Alternatives577); 
                     after(grammarAccess.getNumberAccess().getFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:297:6: ( RULE_INT )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:297:6: ( RULE_INT )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:298:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives594); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Object__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:310:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:314:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:315:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__0624);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__1_in_rule__Object__Group__0627);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:322:1: rule__Object__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:326:1: ( ( RULE_OBJECT_START ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:327:1: ( RULE_OBJECT_START )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:327:1: ( RULE_OBJECT_START )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:328:1: RULE_OBJECT_START
            {
             before(grammarAccess.getObjectAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_RULE_OBJECT_START_in_rule__Object__Group__0__Impl654); 
             after(grammarAccess.getObjectAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:339:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:343:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:344:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__1683);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__2_in_rule__Object__Group__1686);
            rule__Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:351:1: rule__Object__Group__1__Impl : ( ( rule__Object__Group_1__0 )? ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:355:1: ( ( ( rule__Object__Group_1__0 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:356:1: ( ( rule__Object__Group_1__0 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:356:1: ( ( rule__Object__Group_1__0 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:357:1: ( rule__Object__Group_1__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:358:1: ( rule__Object__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:358:2: rule__Object__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Object__Group_1__0_in_rule__Object__Group__1__Impl713);
                    rule__Object__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:368:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:372:1: ( rule__Object__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:373:2: rule__Object__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__2744);
            rule__Object__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:379:1: rule__Object__Group__2__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:383:1: ( ( RULE_OBJECT_END ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:384:1: ( RULE_OBJECT_END )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:384:1: ( RULE_OBJECT_END )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:385:1: RULE_OBJECT_END
            {
             before(grammarAccess.getObjectAccess().getOBJECT_ENDTerminalRuleCall_2()); 
            match(input,RULE_OBJECT_END,FOLLOW_RULE_OBJECT_END_in_rule__Object__Group__2__Impl771); 
             after(grammarAccess.getObjectAccess().getOBJECT_ENDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group_1__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:402:1: rule__Object__Group_1__0 : rule__Object__Group_1__0__Impl rule__Object__Group_1__1 ;
    public final void rule__Object__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:406:1: ( rule__Object__Group_1__0__Impl rule__Object__Group_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:407:2: rule__Object__Group_1__0__Impl rule__Object__Group_1__1
            {
            pushFollow(FOLLOW_rule__Object__Group_1__0__Impl_in_rule__Object__Group_1__0806);
            rule__Object__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_1__1_in_rule__Object__Group_1__0809);
            rule__Object__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1__0"


    // $ANTLR start "rule__Object__Group_1__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:414:1: rule__Object__Group_1__0__Impl : ( ( rule__Object__PropertiesAssignment_1_0 ) ) ;
    public final void rule__Object__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:418:1: ( ( ( rule__Object__PropertiesAssignment_1_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:419:1: ( ( rule__Object__PropertiesAssignment_1_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:419:1: ( ( rule__Object__PropertiesAssignment_1_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:420:1: ( rule__Object__PropertiesAssignment_1_0 )
            {
             before(grammarAccess.getObjectAccess().getPropertiesAssignment_1_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:421:1: ( rule__Object__PropertiesAssignment_1_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:421:2: rule__Object__PropertiesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Object__PropertiesAssignment_1_0_in_rule__Object__Group_1__0__Impl836);
            rule__Object__PropertiesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getPropertiesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1__0__Impl"


    // $ANTLR start "rule__Object__Group_1__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:431:1: rule__Object__Group_1__1 : rule__Object__Group_1__1__Impl ;
    public final void rule__Object__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:435:1: ( rule__Object__Group_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:436:2: rule__Object__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_1__1__Impl_in_rule__Object__Group_1__1866);
            rule__Object__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1__1"


    // $ANTLR start "rule__Object__Group_1__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:442:1: rule__Object__Group_1__1__Impl : ( ( rule__Object__Group_1_1__0 )* ) ;
    public final void rule__Object__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:446:1: ( ( ( rule__Object__Group_1_1__0 )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:447:1: ( ( rule__Object__Group_1_1__0 )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:447:1: ( ( rule__Object__Group_1_1__0 )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:448:1: ( rule__Object__Group_1_1__0 )*
            {
             before(grammarAccess.getObjectAccess().getGroup_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:449:1: ( rule__Object__Group_1_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_VALUE_SEP) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:449:2: rule__Object__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Object__Group_1_1__0_in_rule__Object__Group_1__1__Impl893);
            	    rule__Object__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1__1__Impl"


    // $ANTLR start "rule__Object__Group_1_1__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:463:1: rule__Object__Group_1_1__0 : rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1 ;
    public final void rule__Object__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:467:1: ( rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:468:2: rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Object__Group_1_1__0__Impl_in_rule__Object__Group_1_1__0928);
            rule__Object__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_1_1__1_in_rule__Object__Group_1_1__0931);
            rule__Object__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1_1__0"


    // $ANTLR start "rule__Object__Group_1_1__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:475:1: rule__Object__Group_1_1__0__Impl : ( RULE_VALUE_SEP ) ;
    public final void rule__Object__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:479:1: ( ( RULE_VALUE_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:480:1: ( RULE_VALUE_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:480:1: ( RULE_VALUE_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:481:1: RULE_VALUE_SEP
            {
             before(grammarAccess.getObjectAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
            match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_rule__Object__Group_1_1__0__Impl958); 
             after(grammarAccess.getObjectAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1_1__0__Impl"


    // $ANTLR start "rule__Object__Group_1_1__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:492:1: rule__Object__Group_1_1__1 : rule__Object__Group_1_1__1__Impl ;
    public final void rule__Object__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:496:1: ( rule__Object__Group_1_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:497:2: rule__Object__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_1_1__1__Impl_in_rule__Object__Group_1_1__1987);
            rule__Object__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1_1__1"


    // $ANTLR start "rule__Object__Group_1_1__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:503:1: rule__Object__Group_1_1__1__Impl : ( ( rule__Object__PropertiesAssignment_1_1_1 ) ) ;
    public final void rule__Object__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:507:1: ( ( ( rule__Object__PropertiesAssignment_1_1_1 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:508:1: ( ( rule__Object__PropertiesAssignment_1_1_1 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:508:1: ( ( rule__Object__PropertiesAssignment_1_1_1 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:509:1: ( rule__Object__PropertiesAssignment_1_1_1 )
            {
             before(grammarAccess.getObjectAccess().getPropertiesAssignment_1_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:510:1: ( rule__Object__PropertiesAssignment_1_1_1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:510:2: rule__Object__PropertiesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Object__PropertiesAssignment_1_1_1_in_rule__Object__Group_1_1__1__Impl1014);
            rule__Object__PropertiesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getPropertiesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_1_1__1__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:524:1: rule__ObjectProperty__Group__0 : rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 ;
    public final void rule__ObjectProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:528:1: ( rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:529:2: rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__0__Impl_in_rule__ObjectProperty__Group__01048);
            rule__ObjectProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectProperty__Group__1_in_rule__ObjectProperty__Group__01051);
            rule__ObjectProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__0"


    // $ANTLR start "rule__ObjectProperty__Group__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:536:1: rule__ObjectProperty__Group__0__Impl : ( ( rule__ObjectProperty__PropNameAssignment_0 ) ) ;
    public final void rule__ObjectProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:540:1: ( ( ( rule__ObjectProperty__PropNameAssignment_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:541:1: ( ( rule__ObjectProperty__PropNameAssignment_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:541:1: ( ( rule__ObjectProperty__PropNameAssignment_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:542:1: ( rule__ObjectProperty__PropNameAssignment_0 )
            {
             before(grammarAccess.getObjectPropertyAccess().getPropNameAssignment_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:543:1: ( rule__ObjectProperty__PropNameAssignment_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:543:2: rule__ObjectProperty__PropNameAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectProperty__PropNameAssignment_0_in_rule__ObjectProperty__Group__0__Impl1078);
            rule__ObjectProperty__PropNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getPropNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__0__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:553:1: rule__ObjectProperty__Group__1 : rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 ;
    public final void rule__ObjectProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:557:1: ( rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:558:2: rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__1__Impl_in_rule__ObjectProperty__Group__11108);
            rule__ObjectProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectProperty__Group__2_in_rule__ObjectProperty__Group__11111);
            rule__ObjectProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__1"


    // $ANTLR start "rule__ObjectProperty__Group__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:565:1: rule__ObjectProperty__Group__1__Impl : ( RULE_NAME_SEP ) ;
    public final void rule__ObjectProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:569:1: ( ( RULE_NAME_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:570:1: ( RULE_NAME_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:570:1: ( RULE_NAME_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:571:1: RULE_NAME_SEP
            {
             before(grammarAccess.getObjectPropertyAccess().getNAME_SEPTerminalRuleCall_1()); 
            match(input,RULE_NAME_SEP,FOLLOW_RULE_NAME_SEP_in_rule__ObjectProperty__Group__1__Impl1138); 
             after(grammarAccess.getObjectPropertyAccess().getNAME_SEPTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__1__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__2"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:582:1: rule__ObjectProperty__Group__2 : rule__ObjectProperty__Group__2__Impl ;
    public final void rule__ObjectProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:586:1: ( rule__ObjectProperty__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:587:2: rule__ObjectProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__2__Impl_in_rule__ObjectProperty__Group__21167);
            rule__ObjectProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__2"


    // $ANTLR start "rule__ObjectProperty__Group__2__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:593:1: rule__ObjectProperty__Group__2__Impl : ( ( rule__ObjectProperty__PropValueAssignment_2 ) ) ;
    public final void rule__ObjectProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:597:1: ( ( ( rule__ObjectProperty__PropValueAssignment_2 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:598:1: ( ( rule__ObjectProperty__PropValueAssignment_2 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:598:1: ( ( rule__ObjectProperty__PropValueAssignment_2 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:599:1: ( rule__ObjectProperty__PropValueAssignment_2 )
            {
             before(grammarAccess.getObjectPropertyAccess().getPropValueAssignment_2()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:600:1: ( rule__ObjectProperty__PropValueAssignment_2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:600:2: rule__ObjectProperty__PropValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ObjectProperty__PropValueAssignment_2_in_rule__ObjectProperty__Group__2__Impl1194);
            rule__ObjectProperty__PropValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getPropValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:616:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:620:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:621:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__01230);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__01233);
            rule__Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:628:1: rule__Array__Group__0__Impl : ( RULE_ARRAY_START ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:632:1: ( ( RULE_ARRAY_START ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:633:1: ( RULE_ARRAY_START )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:633:1: ( RULE_ARRAY_START )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:634:1: RULE_ARRAY_START
            {
             before(grammarAccess.getArrayAccess().getARRAY_STARTTerminalRuleCall_0()); 
            match(input,RULE_ARRAY_START,FOLLOW_RULE_ARRAY_START_in_rule__Array__Group__0__Impl1260); 
             after(grammarAccess.getArrayAccess().getARRAY_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:645:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:649:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:650:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__11289);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__11292);
            rule__Array__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:657:1: rule__Array__Group__1__Impl : ( ( rule__Array__Group_1__0 )? ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:661:1: ( ( ( rule__Array__Group_1__0 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:662:1: ( ( rule__Array__Group_1__0 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:662:1: ( ( rule__Array__Group_1__0 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:663:1: ( rule__Array__Group_1__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:664:1: ( rule__Array__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_FLOAT && LA5_0<=RULE_OBJECT_START)||LA5_0==RULE_ARRAY_START||LA5_0==RULE_STRING||(LA5_0>=22 && LA5_0<=24)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:664:2: rule__Array__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Array__Group_1__0_in_rule__Array__Group__1__Impl1319);
                    rule__Array__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:674:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:678:1: ( rule__Array__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:679:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__21350);
            rule__Array__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:685:1: rule__Array__Group__2__Impl : ( RULE_ARRAY_END ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:689:1: ( ( RULE_ARRAY_END ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:690:1: ( RULE_ARRAY_END )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:690:1: ( RULE_ARRAY_END )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:691:1: RULE_ARRAY_END
            {
             before(grammarAccess.getArrayAccess().getARRAY_ENDTerminalRuleCall_2()); 
            match(input,RULE_ARRAY_END,FOLLOW_RULE_ARRAY_END_in_rule__Array__Group__2__Impl1377); 
             after(grammarAccess.getArrayAccess().getARRAY_ENDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group_1__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:708:1: rule__Array__Group_1__0 : rule__Array__Group_1__0__Impl rule__Array__Group_1__1 ;
    public final void rule__Array__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:712:1: ( rule__Array__Group_1__0__Impl rule__Array__Group_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:713:2: rule__Array__Group_1__0__Impl rule__Array__Group_1__1
            {
            pushFollow(FOLLOW_rule__Array__Group_1__0__Impl_in_rule__Array__Group_1__01412);
            rule__Array__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_1__1_in_rule__Array__Group_1__01415);
            rule__Array__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1__0"


    // $ANTLR start "rule__Array__Group_1__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:720:1: rule__Array__Group_1__0__Impl : ( ( rule__Array__ElementsAssignment_1_0 ) ) ;
    public final void rule__Array__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:724:1: ( ( ( rule__Array__ElementsAssignment_1_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:725:1: ( ( rule__Array__ElementsAssignment_1_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:725:1: ( ( rule__Array__ElementsAssignment_1_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:726:1: ( rule__Array__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getArrayAccess().getElementsAssignment_1_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:727:1: ( rule__Array__ElementsAssignment_1_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:727:2: rule__Array__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Array__ElementsAssignment_1_0_in_rule__Array__Group_1__0__Impl1442);
            rule__Array__ElementsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getElementsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1__0__Impl"


    // $ANTLR start "rule__Array__Group_1__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:737:1: rule__Array__Group_1__1 : rule__Array__Group_1__1__Impl ;
    public final void rule__Array__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:741:1: ( rule__Array__Group_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:742:2: rule__Array__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_1__1__Impl_in_rule__Array__Group_1__11472);
            rule__Array__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1__1"


    // $ANTLR start "rule__Array__Group_1__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:748:1: rule__Array__Group_1__1__Impl : ( ( rule__Array__Group_1_1__0 )* ) ;
    public final void rule__Array__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:752:1: ( ( ( rule__Array__Group_1_1__0 )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:753:1: ( ( rule__Array__Group_1_1__0 )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:753:1: ( ( rule__Array__Group_1_1__0 )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:754:1: ( rule__Array__Group_1_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:755:1: ( rule__Array__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_VALUE_SEP) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:755:2: rule__Array__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_1_1__0_in_rule__Array__Group_1__1__Impl1499);
            	    rule__Array__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1__1__Impl"


    // $ANTLR start "rule__Array__Group_1_1__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:769:1: rule__Array__Group_1_1__0 : rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 ;
    public final void rule__Array__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:773:1: ( rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:774:2: rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Array__Group_1_1__0__Impl_in_rule__Array__Group_1_1__01534);
            rule__Array__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_1_1__1_in_rule__Array__Group_1_1__01537);
            rule__Array__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1_1__0"


    // $ANTLR start "rule__Array__Group_1_1__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:781:1: rule__Array__Group_1_1__0__Impl : ( RULE_VALUE_SEP ) ;
    public final void rule__Array__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:785:1: ( ( RULE_VALUE_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:786:1: ( RULE_VALUE_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:786:1: ( RULE_VALUE_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:787:1: RULE_VALUE_SEP
            {
             before(grammarAccess.getArrayAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
            match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_rule__Array__Group_1_1__0__Impl1564); 
             after(grammarAccess.getArrayAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1_1__0__Impl"


    // $ANTLR start "rule__Array__Group_1_1__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:798:1: rule__Array__Group_1_1__1 : rule__Array__Group_1_1__1__Impl ;
    public final void rule__Array__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:802:1: ( rule__Array__Group_1_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:803:2: rule__Array__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_1_1__1__Impl_in_rule__Array__Group_1_1__11593);
            rule__Array__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1_1__1"


    // $ANTLR start "rule__Array__Group_1_1__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:809:1: rule__Array__Group_1_1__1__Impl : ( ( rule__Array__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Array__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:813:1: ( ( ( rule__Array__ElementsAssignment_1_1_1 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:814:1: ( ( rule__Array__ElementsAssignment_1_1_1 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:814:1: ( ( rule__Array__ElementsAssignment_1_1_1 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:815:1: ( rule__Array__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getArrayAccess().getElementsAssignment_1_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:816:1: ( rule__Array__ElementsAssignment_1_1_1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:816:2: rule__Array__ElementsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Array__ElementsAssignment_1_1_1_in_rule__Array__Group_1_1__1__Impl1620);
            rule__Array__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__RootAssignment"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:831:1: rule__Model__RootAssignment : ( ruleValue ) ;
    public final void rule__Model__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:835:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:836:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:836:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:837:1: ruleValue
            {
             before(grammarAccess.getModelAccess().getRootValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Model__RootAssignment1659);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRootValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RootAssignment"


    // $ANTLR start "rule__Value__ObjectValueAssignment_3"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:846:1: rule__Value__ObjectValueAssignment_3 : ( ruleObject ) ;
    public final void rule__Value__ObjectValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:850:1: ( ( ruleObject ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:851:1: ( ruleObject )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:851:1: ( ruleObject )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:852:1: ruleObject
            {
             before(grammarAccess.getValueAccess().getObjectValueObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObject_in_rule__Value__ObjectValueAssignment_31690);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getValueAccess().getObjectValueObjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ObjectValueAssignment_3"


    // $ANTLR start "rule__Value__ArrayValueAssignment_4"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:861:1: rule__Value__ArrayValueAssignment_4 : ( ruleArray ) ;
    public final void rule__Value__ArrayValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:865:1: ( ( ruleArray ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:866:1: ( ruleArray )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:866:1: ( ruleArray )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:867:1: ruleArray
            {
             before(grammarAccess.getValueAccess().getArrayValueArrayParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArray_in_rule__Value__ArrayValueAssignment_41721);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getValueAccess().getArrayValueArrayParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ArrayValueAssignment_4"


    // $ANTLR start "rule__Value__NumberValueAssignment_5"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:876:1: rule__Value__NumberValueAssignment_5 : ( ruleNumber ) ;
    public final void rule__Value__NumberValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:880:1: ( ( ruleNumber ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:881:1: ( ruleNumber )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:881:1: ( ruleNumber )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:882:1: ruleNumber
            {
             before(grammarAccess.getValueAccess().getNumberValueNumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Value__NumberValueAssignment_51752);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getValueAccess().getNumberValueNumberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__NumberValueAssignment_5"


    // $ANTLR start "rule__Value__StringValueAssignment_6"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:891:1: rule__Value__StringValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Value__StringValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:895:1: ( ( RULE_STRING ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:896:1: ( RULE_STRING )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:896:1: ( RULE_STRING )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:897:1: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getStringValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__StringValueAssignment_61783); 
             after(grammarAccess.getValueAccess().getStringValueSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__StringValueAssignment_6"


    // $ANTLR start "rule__Object__PropertiesAssignment_1_0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:906:1: rule__Object__PropertiesAssignment_1_0 : ( ruleObjectProperty ) ;
    public final void rule__Object__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:910:1: ( ( ruleObjectProperty ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:911:1: ( ruleObjectProperty )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:911:1: ( ruleObjectProperty )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:912:1: ruleObjectProperty
            {
             before(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_01814);
            ruleObjectProperty();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__PropertiesAssignment_1_0"


    // $ANTLR start "rule__Object__PropertiesAssignment_1_1_1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:921:1: rule__Object__PropertiesAssignment_1_1_1 : ( ruleObjectProperty ) ;
    public final void rule__Object__PropertiesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:925:1: ( ( ruleObjectProperty ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:926:1: ( ruleObjectProperty )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:926:1: ( ruleObjectProperty )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:927:1: ruleObjectProperty
            {
             before(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_1_11845);
            ruleObjectProperty();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__PropertiesAssignment_1_1_1"


    // $ANTLR start "rule__ObjectProperty__PropNameAssignment_0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:936:1: rule__ObjectProperty__PropNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ObjectProperty__PropNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:940:1: ( ( RULE_STRING ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:941:1: ( RULE_STRING )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:941:1: ( RULE_STRING )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:942:1: RULE_STRING
            {
             before(grammarAccess.getObjectPropertyAccess().getPropNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ObjectProperty__PropNameAssignment_01876); 
             after(grammarAccess.getObjectPropertyAccess().getPropNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__PropNameAssignment_0"


    // $ANTLR start "rule__ObjectProperty__PropValueAssignment_2"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:951:1: rule__ObjectProperty__PropValueAssignment_2 : ( ruleValue ) ;
    public final void rule__ObjectProperty__PropValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:955:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:956:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:956:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:957:1: ruleValue
            {
             before(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__ObjectProperty__PropValueAssignment_21907);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__PropValueAssignment_2"


    // $ANTLR start "rule__Array__ElementsAssignment_1_0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:966:1: rule__Array__ElementsAssignment_1_0 : ( ruleValue ) ;
    public final void rule__Array__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:970:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:971:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:971:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:972:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_01938);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ElementsAssignment_1_0"


    // $ANTLR start "rule__Array__ElementsAssignment_1_1_1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:981:1: rule__Array__ElementsAssignment_1_1_1 : ( ruleValue ) ;
    public final void rule__Array__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:985:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:986:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:986:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:987:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_1_11969);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ElementsAssignment_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RootAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0_in_ruleObject274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectProperty308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__0_in_ruleObjectProperty334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Value__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Value__Alternatives451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Value__Alternatives471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ObjectValueAssignment_3_in_rule__Value__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ArrayValueAssignment_4_in_rule__Value__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__NumberValueAssignment_5_in_rule__Value__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__StringValueAssignment_6_in_rule__Value__Alternatives544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Number__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__0624 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_rule__Object__Group__1_in_rule__Object__Group__0627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_START_in_rule__Object__Group__0__Impl654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__1683 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_rule__Object__Group__2_in_rule__Object__Group__1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__0_in_rule__Object__Group__1__Impl713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_END_in_rule__Object__Group__2__Impl771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__0__Impl_in_rule__Object__Group_1__0806 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Object__Group_1__1_in_rule__Object__Group_1__0809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__PropertiesAssignment_1_0_in_rule__Object__Group_1__0__Impl836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__1__Impl_in_rule__Object__Group_1__1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__0_in_rule__Object__Group_1__1__Impl893 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__0__Impl_in_rule__Object__Group_1_1__0928 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__1_in_rule__Object__Group_1_1__0931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_rule__Object__Group_1_1__0__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__1__Impl_in_rule__Object__Group_1_1__1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__PropertiesAssignment_1_1_1_in_rule__Object__Group_1_1__1__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__0__Impl_in_rule__ObjectProperty__Group__01048 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__1_in_rule__ObjectProperty__Group__01051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__PropNameAssignment_0_in_rule__ObjectProperty__Group__0__Impl1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__1__Impl_in_rule__ObjectProperty__Group__11108 = new BitSet(new long[]{0x0000000001C01470L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__2_in_rule__ObjectProperty__Group__11111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_SEP_in_rule__ObjectProperty__Group__1__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__2__Impl_in_rule__ObjectProperty__Group__21167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__PropValueAssignment_2_in_rule__ObjectProperty__Group__2__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__01230 = new BitSet(new long[]{0x0000000001C01C70L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__01233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_START_in_rule__Array__Group__0__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__11289 = new BitSet(new long[]{0x0000000001C01C70L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__11292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__0_in_rule__Array__Group__1__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__21350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_END_in_rule__Array__Group__2__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__0__Impl_in_rule__Array__Group_1__01412 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Array__Group_1__1_in_rule__Array__Group_1__01415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ElementsAssignment_1_0_in_rule__Array__Group_1__0__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__1__Impl_in_rule__Array__Group_1__11472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__0_in_rule__Array__Group_1__1__Impl1499 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__0__Impl_in_rule__Array__Group_1_1__01534 = new BitSet(new long[]{0x0000000001C01470L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__1_in_rule__Array__Group_1_1__01537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_rule__Array__Group_1_1__0__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__1__Impl_in_rule__Array__Group_1_1__11593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ElementsAssignment_1_1_1_in_rule__Array__Group_1_1__1__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Model__RootAssignment1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__Value__ObjectValueAssignment_31690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__ArrayValueAssignment_41721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Value__NumberValueAssignment_51752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__StringValueAssignment_61783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_01814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_1_11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ObjectProperty__PropNameAssignment_01876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ObjectProperty__PropValueAssignment_21907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_01938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_1_11969 = new BitSet(new long[]{0x0000000000000002L});

}