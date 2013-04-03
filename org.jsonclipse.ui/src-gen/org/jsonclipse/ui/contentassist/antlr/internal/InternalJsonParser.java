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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_OBJECT_START", "RULE_OBJECT_END", "RULE_VALUE_SEP", "RULE_NAME_SEP", "RULE_ARRAY_START", "RULE_ARRAY_END", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'null'", "'true'", "'e'", "'E'", "'+'", "'-'", "'.'"
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
    public static final int RULE_OBJECT_END=6;
    public static final int RULE_ARRAY_START=9;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_ARRAY_END=10;
    public static final int T__19=19;
    public static final int RULE_STRING=11;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_OBJECT_START=5;
    public static final int RULE_VALUE_SEP=7;
    public static final int RULE_INT=4;
    public static final int RULE_WS=15;
    public static final int RULE_NAME_SEP=8;

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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:125:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:129:2: ( ( ( rule__Number__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:130:1: ( ( rule__Number__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:130:1: ( ( rule__Number__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:131:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:132:1: ( rule__Number__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:132:2: rule__Number__Group__0
            {
            pushFollow(FOLLOW_rule__Number__Group__0_in_ruleNumber214);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

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
            case 23:
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
                    match(input,17,FOLLOW_17_in_rule__Value__Alternatives431); 
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
                    match(input,18,FOLLOW_18_in_rule__Value__Alternatives451); 
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
                    match(input,19,FOLLOW_19_in_rule__Value__Alternatives471); 
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


    // $ANTLR start "rule__Number__Alternatives_3_0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:286:1: rule__Number__Alternatives_3_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Number__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:290:1: ( ( 'e' ) | ( 'E' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:291:1: ( 'e' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:291:1: ( 'e' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:292:1: 'e'
                    {
                     before(grammarAccess.getNumberAccess().getEKeyword_3_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__Number__Alternatives_3_0578); 
                     after(grammarAccess.getNumberAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:299:6: ( 'E' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:299:6: ( 'E' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:300:1: 'E'
                    {
                     before(grammarAccess.getNumberAccess().getEKeyword_3_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__Number__Alternatives_3_0598); 
                     after(grammarAccess.getNumberAccess().getEKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Number__Alternatives_3_0"


    // $ANTLR start "rule__Number__Alternatives_3_1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:312:1: rule__Number__Alternatives_3_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Number__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:316:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:317:1: ( '+' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:317:1: ( '+' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:318:1: '+'
                    {
                     before(grammarAccess.getNumberAccess().getPlusSignKeyword_3_1_0()); 
                    match(input,22,FOLLOW_22_in_rule__Number__Alternatives_3_1633); 
                     after(grammarAccess.getNumberAccess().getPlusSignKeyword_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:325:6: ( '-' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:325:6: ( '-' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:326:1: '-'
                    {
                     before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_3_1_1()); 
                    match(input,23,FOLLOW_23_in_rule__Number__Alternatives_3_1653); 
                     after(grammarAccess.getNumberAccess().getHyphenMinusKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Number__Alternatives_3_1"


    // $ANTLR start "rule__Number__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:340:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:344:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:345:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__0685);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__1_in_rule__Number__Group__0688);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:352:1: rule__Number__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:356:1: ( ( ( '-' )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:357:1: ( ( '-' )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:357:1: ( ( '-' )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:358:1: ( '-' )?
            {
             before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:359:1: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:360:2: '-'
                    {
                    match(input,23,FOLLOW_23_in_rule__Number__Group__0__Impl717); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:371:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:375:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:376:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__1750);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__2_in_rule__Number__Group__1753);
            rule__Number__Group__2();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:383:1: rule__Number__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:387:1: ( ( RULE_INT ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:388:1: ( RULE_INT )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:388:1: ( RULE_INT )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:389:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Group__1__Impl780); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__2"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:400:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:404:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:405:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_rule__Number__Group__2__Impl_in_rule__Number__Group__2809);
            rule__Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__3_in_rule__Number__Group__2812);
            rule__Number__Group__3();

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
    // $ANTLR end "rule__Number__Group__2"


    // $ANTLR start "rule__Number__Group__2__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:412:1: rule__Number__Group__2__Impl : ( ( rule__Number__Group_2__0 )? ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:416:1: ( ( ( rule__Number__Group_2__0 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:417:1: ( ( rule__Number__Group_2__0 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:417:1: ( ( rule__Number__Group_2__0 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:418:1: ( rule__Number__Group_2__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_2()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:419:1: ( rule__Number__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:419:2: rule__Number__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_2__0_in_rule__Number__Group__2__Impl839);
                    rule__Number__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Number__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__3"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:429:1: rule__Number__Group__3 : rule__Number__Group__3__Impl ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:433:1: ( rule__Number__Group__3__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:434:2: rule__Number__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group__3__Impl_in_rule__Number__Group__3870);
            rule__Number__Group__3__Impl();

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
    // $ANTLR end "rule__Number__Group__3"


    // $ANTLR start "rule__Number__Group__3__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:440:1: rule__Number__Group__3__Impl : ( ( rule__Number__Group_3__0 )? ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:444:1: ( ( ( rule__Number__Group_3__0 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:445:1: ( ( rule__Number__Group_3__0 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:445:1: ( ( rule__Number__Group_3__0 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:446:1: ( rule__Number__Group_3__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_3()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:447:1: ( rule__Number__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:447:2: rule__Number__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_3__0_in_rule__Number__Group__3__Impl897);
                    rule__Number__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Number__Group__3__Impl"


    // $ANTLR start "rule__Number__Group_2__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:465:1: rule__Number__Group_2__0 : rule__Number__Group_2__0__Impl rule__Number__Group_2__1 ;
    public final void rule__Number__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:469:1: ( rule__Number__Group_2__0__Impl rule__Number__Group_2__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:470:2: rule__Number__Group_2__0__Impl rule__Number__Group_2__1
            {
            pushFollow(FOLLOW_rule__Number__Group_2__0__Impl_in_rule__Number__Group_2__0936);
            rule__Number__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_2__1_in_rule__Number__Group_2__0939);
            rule__Number__Group_2__1();

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
    // $ANTLR end "rule__Number__Group_2__0"


    // $ANTLR start "rule__Number__Group_2__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:477:1: rule__Number__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:481:1: ( ( '.' ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:482:1: ( '.' )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:482:1: ( '.' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:483:1: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Number__Group_2__0__Impl967); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__Number__Group_2__0__Impl"


    // $ANTLR start "rule__Number__Group_2__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:496:1: rule__Number__Group_2__1 : rule__Number__Group_2__1__Impl ;
    public final void rule__Number__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:500:1: ( rule__Number__Group_2__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:501:2: rule__Number__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_2__1__Impl_in_rule__Number__Group_2__1998);
            rule__Number__Group_2__1__Impl();

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
    // $ANTLR end "rule__Number__Group_2__1"


    // $ANTLR start "rule__Number__Group_2__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:507:1: rule__Number__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:511:1: ( ( RULE_INT ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:512:1: ( RULE_INT )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:512:1: ( RULE_INT )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:513:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Group_2__1__Impl1025); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__Number__Group_2__1__Impl"


    // $ANTLR start "rule__Number__Group_3__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:528:1: rule__Number__Group_3__0 : rule__Number__Group_3__0__Impl rule__Number__Group_3__1 ;
    public final void rule__Number__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:532:1: ( rule__Number__Group_3__0__Impl rule__Number__Group_3__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:533:2: rule__Number__Group_3__0__Impl rule__Number__Group_3__1
            {
            pushFollow(FOLLOW_rule__Number__Group_3__0__Impl_in_rule__Number__Group_3__01058);
            rule__Number__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_3__1_in_rule__Number__Group_3__01061);
            rule__Number__Group_3__1();

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
    // $ANTLR end "rule__Number__Group_3__0"


    // $ANTLR start "rule__Number__Group_3__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:540:1: rule__Number__Group_3__0__Impl : ( ( rule__Number__Alternatives_3_0 ) ) ;
    public final void rule__Number__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:544:1: ( ( ( rule__Number__Alternatives_3_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:545:1: ( ( rule__Number__Alternatives_3_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:545:1: ( ( rule__Number__Alternatives_3_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:546:1: ( rule__Number__Alternatives_3_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_3_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:547:1: ( rule__Number__Alternatives_3_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:547:2: rule__Number__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_3_0_in_rule__Number__Group_3__0__Impl1088);
            rule__Number__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_3_0()); 

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
    // $ANTLR end "rule__Number__Group_3__0__Impl"


    // $ANTLR start "rule__Number__Group_3__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:557:1: rule__Number__Group_3__1 : rule__Number__Group_3__1__Impl rule__Number__Group_3__2 ;
    public final void rule__Number__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:561:1: ( rule__Number__Group_3__1__Impl rule__Number__Group_3__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:562:2: rule__Number__Group_3__1__Impl rule__Number__Group_3__2
            {
            pushFollow(FOLLOW_rule__Number__Group_3__1__Impl_in_rule__Number__Group_3__11118);
            rule__Number__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_3__2_in_rule__Number__Group_3__11121);
            rule__Number__Group_3__2();

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
    // $ANTLR end "rule__Number__Group_3__1"


    // $ANTLR start "rule__Number__Group_3__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:569:1: rule__Number__Group_3__1__Impl : ( ( rule__Number__Alternatives_3_1 )? ) ;
    public final void rule__Number__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:573:1: ( ( ( rule__Number__Alternatives_3_1 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:574:1: ( ( rule__Number__Alternatives_3_1 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:574:1: ( ( rule__Number__Alternatives_3_1 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:575:1: ( rule__Number__Alternatives_3_1 )?
            {
             before(grammarAccess.getNumberAccess().getAlternatives_3_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:576:1: ( rule__Number__Alternatives_3_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=23)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:576:2: rule__Number__Alternatives_3_1
                    {
                    pushFollow(FOLLOW_rule__Number__Alternatives_3_1_in_rule__Number__Group_3__1__Impl1148);
                    rule__Number__Alternatives_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getAlternatives_3_1()); 

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
    // $ANTLR end "rule__Number__Group_3__1__Impl"


    // $ANTLR start "rule__Number__Group_3__2"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:586:1: rule__Number__Group_3__2 : rule__Number__Group_3__2__Impl ;
    public final void rule__Number__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:590:1: ( rule__Number__Group_3__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:591:2: rule__Number__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_3__2__Impl_in_rule__Number__Group_3__21179);
            rule__Number__Group_3__2__Impl();

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
    // $ANTLR end "rule__Number__Group_3__2"


    // $ANTLR start "rule__Number__Group_3__2__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:597:1: rule__Number__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:601:1: ( ( RULE_INT ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:602:1: ( RULE_INT )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:602:1: ( RULE_INT )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:603:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_3_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Group_3__2__Impl1206); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_3_2()); 

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
    // $ANTLR end "rule__Number__Group_3__2__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:620:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:624:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:625:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__01241);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__1_in_rule__Object__Group__01244);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:632:1: rule__Object__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:636:1: ( ( RULE_OBJECT_START ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:637:1: ( RULE_OBJECT_START )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:637:1: ( RULE_OBJECT_START )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:638:1: RULE_OBJECT_START
            {
             before(grammarAccess.getObjectAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_RULE_OBJECT_START_in_rule__Object__Group__0__Impl1271); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:649:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:653:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:654:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__11300);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__2_in_rule__Object__Group__11303);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:661:1: rule__Object__Group__1__Impl : ( ( rule__Object__Group_1__0 )? ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:665:1: ( ( ( rule__Object__Group_1__0 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:666:1: ( ( rule__Object__Group_1__0 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:666:1: ( ( rule__Object__Group_1__0 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:667:1: ( rule__Object__Group_1__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:668:1: ( rule__Object__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:668:2: rule__Object__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Object__Group_1__0_in_rule__Object__Group__1__Impl1330);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:678:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:682:1: ( rule__Object__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:683:2: rule__Object__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__21361);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:689:1: rule__Object__Group__2__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:693:1: ( ( RULE_OBJECT_END ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:694:1: ( RULE_OBJECT_END )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:694:1: ( RULE_OBJECT_END )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:695:1: RULE_OBJECT_END
            {
             before(grammarAccess.getObjectAccess().getOBJECT_ENDTerminalRuleCall_2()); 
            match(input,RULE_OBJECT_END,FOLLOW_RULE_OBJECT_END_in_rule__Object__Group__2__Impl1388); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:712:1: rule__Object__Group_1__0 : rule__Object__Group_1__0__Impl rule__Object__Group_1__1 ;
    public final void rule__Object__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:716:1: ( rule__Object__Group_1__0__Impl rule__Object__Group_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:717:2: rule__Object__Group_1__0__Impl rule__Object__Group_1__1
            {
            pushFollow(FOLLOW_rule__Object__Group_1__0__Impl_in_rule__Object__Group_1__01423);
            rule__Object__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_1__1_in_rule__Object__Group_1__01426);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:724:1: rule__Object__Group_1__0__Impl : ( ( rule__Object__PropertiesAssignment_1_0 ) ) ;
    public final void rule__Object__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:728:1: ( ( ( rule__Object__PropertiesAssignment_1_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:729:1: ( ( rule__Object__PropertiesAssignment_1_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:729:1: ( ( rule__Object__PropertiesAssignment_1_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:730:1: ( rule__Object__PropertiesAssignment_1_0 )
            {
             before(grammarAccess.getObjectAccess().getPropertiesAssignment_1_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:731:1: ( rule__Object__PropertiesAssignment_1_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:731:2: rule__Object__PropertiesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Object__PropertiesAssignment_1_0_in_rule__Object__Group_1__0__Impl1453);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:741:1: rule__Object__Group_1__1 : rule__Object__Group_1__1__Impl ;
    public final void rule__Object__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:745:1: ( rule__Object__Group_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:746:2: rule__Object__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_1__1__Impl_in_rule__Object__Group_1__11483);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:752:1: rule__Object__Group_1__1__Impl : ( ( rule__Object__Group_1_1__0 )* ) ;
    public final void rule__Object__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:756:1: ( ( ( rule__Object__Group_1_1__0 )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:757:1: ( ( rule__Object__Group_1_1__0 )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:757:1: ( ( rule__Object__Group_1_1__0 )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:758:1: ( rule__Object__Group_1_1__0 )*
            {
             before(grammarAccess.getObjectAccess().getGroup_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:759:1: ( rule__Object__Group_1_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_VALUE_SEP) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:759:2: rule__Object__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Object__Group_1_1__0_in_rule__Object__Group_1__1__Impl1510);
            	    rule__Object__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:773:1: rule__Object__Group_1_1__0 : rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1 ;
    public final void rule__Object__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:777:1: ( rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:778:2: rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Object__Group_1_1__0__Impl_in_rule__Object__Group_1_1__01545);
            rule__Object__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_1_1__1_in_rule__Object__Group_1_1__01548);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:785:1: rule__Object__Group_1_1__0__Impl : ( RULE_VALUE_SEP ) ;
    public final void rule__Object__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:789:1: ( ( RULE_VALUE_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:790:1: ( RULE_VALUE_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:790:1: ( RULE_VALUE_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:791:1: RULE_VALUE_SEP
            {
             before(grammarAccess.getObjectAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
            match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_rule__Object__Group_1_1__0__Impl1575); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:802:1: rule__Object__Group_1_1__1 : rule__Object__Group_1_1__1__Impl ;
    public final void rule__Object__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:806:1: ( rule__Object__Group_1_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:807:2: rule__Object__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_1_1__1__Impl_in_rule__Object__Group_1_1__11604);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:813:1: rule__Object__Group_1_1__1__Impl : ( ( rule__Object__PropertiesAssignment_1_1_1 ) ) ;
    public final void rule__Object__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:817:1: ( ( ( rule__Object__PropertiesAssignment_1_1_1 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:818:1: ( ( rule__Object__PropertiesAssignment_1_1_1 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:818:1: ( ( rule__Object__PropertiesAssignment_1_1_1 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:819:1: ( rule__Object__PropertiesAssignment_1_1_1 )
            {
             before(grammarAccess.getObjectAccess().getPropertiesAssignment_1_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:820:1: ( rule__Object__PropertiesAssignment_1_1_1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:820:2: rule__Object__PropertiesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Object__PropertiesAssignment_1_1_1_in_rule__Object__Group_1_1__1__Impl1631);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:834:1: rule__ObjectProperty__Group__0 : rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 ;
    public final void rule__ObjectProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:838:1: ( rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:839:2: rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__0__Impl_in_rule__ObjectProperty__Group__01665);
            rule__ObjectProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectProperty__Group__1_in_rule__ObjectProperty__Group__01668);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:846:1: rule__ObjectProperty__Group__0__Impl : ( ( rule__ObjectProperty__PropNameAssignment_0 ) ) ;
    public final void rule__ObjectProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:850:1: ( ( ( rule__ObjectProperty__PropNameAssignment_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:851:1: ( ( rule__ObjectProperty__PropNameAssignment_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:851:1: ( ( rule__ObjectProperty__PropNameAssignment_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:852:1: ( rule__ObjectProperty__PropNameAssignment_0 )
            {
             before(grammarAccess.getObjectPropertyAccess().getPropNameAssignment_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:853:1: ( rule__ObjectProperty__PropNameAssignment_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:853:2: rule__ObjectProperty__PropNameAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectProperty__PropNameAssignment_0_in_rule__ObjectProperty__Group__0__Impl1695);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:863:1: rule__ObjectProperty__Group__1 : rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 ;
    public final void rule__ObjectProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:867:1: ( rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:868:2: rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__1__Impl_in_rule__ObjectProperty__Group__11725);
            rule__ObjectProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectProperty__Group__2_in_rule__ObjectProperty__Group__11728);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:875:1: rule__ObjectProperty__Group__1__Impl : ( RULE_NAME_SEP ) ;
    public final void rule__ObjectProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:879:1: ( ( RULE_NAME_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:880:1: ( RULE_NAME_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:880:1: ( RULE_NAME_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:881:1: RULE_NAME_SEP
            {
             before(grammarAccess.getObjectPropertyAccess().getNAME_SEPTerminalRuleCall_1()); 
            match(input,RULE_NAME_SEP,FOLLOW_RULE_NAME_SEP_in_rule__ObjectProperty__Group__1__Impl1755); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:892:1: rule__ObjectProperty__Group__2 : rule__ObjectProperty__Group__2__Impl ;
    public final void rule__ObjectProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:896:1: ( rule__ObjectProperty__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:897:2: rule__ObjectProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__2__Impl_in_rule__ObjectProperty__Group__21784);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:903:1: rule__ObjectProperty__Group__2__Impl : ( ( rule__ObjectProperty__PropValueAssignment_2 ) ) ;
    public final void rule__ObjectProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:907:1: ( ( ( rule__ObjectProperty__PropValueAssignment_2 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:908:1: ( ( rule__ObjectProperty__PropValueAssignment_2 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:908:1: ( ( rule__ObjectProperty__PropValueAssignment_2 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:909:1: ( rule__ObjectProperty__PropValueAssignment_2 )
            {
             before(grammarAccess.getObjectPropertyAccess().getPropValueAssignment_2()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:910:1: ( rule__ObjectProperty__PropValueAssignment_2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:910:2: rule__ObjectProperty__PropValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ObjectProperty__PropValueAssignment_2_in_rule__ObjectProperty__Group__2__Impl1811);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:926:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:930:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:931:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__01847);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__01850);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:938:1: rule__Array__Group__0__Impl : ( RULE_ARRAY_START ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:942:1: ( ( RULE_ARRAY_START ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:943:1: ( RULE_ARRAY_START )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:943:1: ( RULE_ARRAY_START )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:944:1: RULE_ARRAY_START
            {
             before(grammarAccess.getArrayAccess().getARRAY_STARTTerminalRuleCall_0()); 
            match(input,RULE_ARRAY_START,FOLLOW_RULE_ARRAY_START_in_rule__Array__Group__0__Impl1877); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:955:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:959:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:960:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__11906);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__11909);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:967:1: rule__Array__Group__1__Impl : ( ( rule__Array__Group_1__0 )? ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:971:1: ( ( ( rule__Array__Group_1__0 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:972:1: ( ( rule__Array__Group_1__0 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:972:1: ( ( rule__Array__Group_1__0 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:973:1: ( rule__Array__Group_1__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:974:1: ( rule__Array__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_OBJECT_START)||LA10_0==RULE_ARRAY_START||LA10_0==RULE_STRING||(LA10_0>=17 && LA10_0<=19)||LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:974:2: rule__Array__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Array__Group_1__0_in_rule__Array__Group__1__Impl1936);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:984:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:988:1: ( rule__Array__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:989:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__21967);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:995:1: rule__Array__Group__2__Impl : ( RULE_ARRAY_END ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:999:1: ( ( RULE_ARRAY_END ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1000:1: ( RULE_ARRAY_END )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1000:1: ( RULE_ARRAY_END )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1001:1: RULE_ARRAY_END
            {
             before(grammarAccess.getArrayAccess().getARRAY_ENDTerminalRuleCall_2()); 
            match(input,RULE_ARRAY_END,FOLLOW_RULE_ARRAY_END_in_rule__Array__Group__2__Impl1994); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1018:1: rule__Array__Group_1__0 : rule__Array__Group_1__0__Impl rule__Array__Group_1__1 ;
    public final void rule__Array__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1022:1: ( rule__Array__Group_1__0__Impl rule__Array__Group_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:2: rule__Array__Group_1__0__Impl rule__Array__Group_1__1
            {
            pushFollow(FOLLOW_rule__Array__Group_1__0__Impl_in_rule__Array__Group_1__02029);
            rule__Array__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_1__1_in_rule__Array__Group_1__02032);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1030:1: rule__Array__Group_1__0__Impl : ( ( rule__Array__ElementsAssignment_1_0 ) ) ;
    public final void rule__Array__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1034:1: ( ( ( rule__Array__ElementsAssignment_1_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1035:1: ( ( rule__Array__ElementsAssignment_1_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1035:1: ( ( rule__Array__ElementsAssignment_1_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1036:1: ( rule__Array__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getArrayAccess().getElementsAssignment_1_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1037:1: ( rule__Array__ElementsAssignment_1_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1037:2: rule__Array__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Array__ElementsAssignment_1_0_in_rule__Array__Group_1__0__Impl2059);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1047:1: rule__Array__Group_1__1 : rule__Array__Group_1__1__Impl ;
    public final void rule__Array__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1051:1: ( rule__Array__Group_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1052:2: rule__Array__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_1__1__Impl_in_rule__Array__Group_1__12089);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1058:1: rule__Array__Group_1__1__Impl : ( ( rule__Array__Group_1_1__0 )* ) ;
    public final void rule__Array__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1062:1: ( ( ( rule__Array__Group_1_1__0 )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1063:1: ( ( rule__Array__Group_1_1__0 )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1063:1: ( ( rule__Array__Group_1_1__0 )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1064:1: ( rule__Array__Group_1_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1065:1: ( rule__Array__Group_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_VALUE_SEP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1065:2: rule__Array__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_1_1__0_in_rule__Array__Group_1__1__Impl2116);
            	    rule__Array__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1079:1: rule__Array__Group_1_1__0 : rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 ;
    public final void rule__Array__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1083:1: ( rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1084:2: rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Array__Group_1_1__0__Impl_in_rule__Array__Group_1_1__02151);
            rule__Array__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_1_1__1_in_rule__Array__Group_1_1__02154);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1091:1: rule__Array__Group_1_1__0__Impl : ( RULE_VALUE_SEP ) ;
    public final void rule__Array__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1095:1: ( ( RULE_VALUE_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1096:1: ( RULE_VALUE_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1096:1: ( RULE_VALUE_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1097:1: RULE_VALUE_SEP
            {
             before(grammarAccess.getArrayAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
            match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_rule__Array__Group_1_1__0__Impl2181); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1108:1: rule__Array__Group_1_1__1 : rule__Array__Group_1_1__1__Impl ;
    public final void rule__Array__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1112:1: ( rule__Array__Group_1_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1113:2: rule__Array__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_1_1__1__Impl_in_rule__Array__Group_1_1__12210);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1119:1: rule__Array__Group_1_1__1__Impl : ( ( rule__Array__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Array__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1123:1: ( ( ( rule__Array__ElementsAssignment_1_1_1 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1124:1: ( ( rule__Array__ElementsAssignment_1_1_1 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1124:1: ( ( rule__Array__ElementsAssignment_1_1_1 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1125:1: ( rule__Array__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getArrayAccess().getElementsAssignment_1_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1126:1: ( rule__Array__ElementsAssignment_1_1_1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1126:2: rule__Array__ElementsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Array__ElementsAssignment_1_1_1_in_rule__Array__Group_1_1__1__Impl2237);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1141:1: rule__Model__RootAssignment : ( ruleValue ) ;
    public final void rule__Model__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1145:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1146:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1146:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1147:1: ruleValue
            {
             before(grammarAccess.getModelAccess().getRootValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Model__RootAssignment2276);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1156:1: rule__Value__ObjectValueAssignment_3 : ( ruleObject ) ;
    public final void rule__Value__ObjectValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1160:1: ( ( ruleObject ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1161:1: ( ruleObject )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1161:1: ( ruleObject )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1162:1: ruleObject
            {
             before(grammarAccess.getValueAccess().getObjectValueObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObject_in_rule__Value__ObjectValueAssignment_32307);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1171:1: rule__Value__ArrayValueAssignment_4 : ( ruleArray ) ;
    public final void rule__Value__ArrayValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1175:1: ( ( ruleArray ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1176:1: ( ruleArray )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1176:1: ( ruleArray )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1177:1: ruleArray
            {
             before(grammarAccess.getValueAccess().getArrayValueArrayParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArray_in_rule__Value__ArrayValueAssignment_42338);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1186:1: rule__Value__NumberValueAssignment_5 : ( ruleNumber ) ;
    public final void rule__Value__NumberValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1190:1: ( ( ruleNumber ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1191:1: ( ruleNumber )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1191:1: ( ruleNumber )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1192:1: ruleNumber
            {
             before(grammarAccess.getValueAccess().getNumberValueNumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Value__NumberValueAssignment_52369);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1201:1: rule__Value__StringValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Value__StringValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1205:1: ( ( RULE_STRING ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1206:1: ( RULE_STRING )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1206:1: ( RULE_STRING )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1207:1: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getStringValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__StringValueAssignment_62400); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1216:1: rule__Object__PropertiesAssignment_1_0 : ( ruleObjectProperty ) ;
    public final void rule__Object__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1220:1: ( ( ruleObjectProperty ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1221:1: ( ruleObjectProperty )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1221:1: ( ruleObjectProperty )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1222:1: ruleObjectProperty
            {
             before(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_02431);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1231:1: rule__Object__PropertiesAssignment_1_1_1 : ( ruleObjectProperty ) ;
    public final void rule__Object__PropertiesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1235:1: ( ( ruleObjectProperty ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1236:1: ( ruleObjectProperty )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1236:1: ( ruleObjectProperty )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1237:1: ruleObjectProperty
            {
             before(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_1_12462);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1246:1: rule__ObjectProperty__PropNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ObjectProperty__PropNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1250:1: ( ( RULE_STRING ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1251:1: ( RULE_STRING )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1251:1: ( RULE_STRING )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1252:1: RULE_STRING
            {
             before(grammarAccess.getObjectPropertyAccess().getPropNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ObjectProperty__PropNameAssignment_02493); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1261:1: rule__ObjectProperty__PropValueAssignment_2 : ( ruleValue ) ;
    public final void rule__ObjectProperty__PropValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1265:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1266:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1266:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1267:1: ruleValue
            {
             before(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__ObjectProperty__PropValueAssignment_22524);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1276:1: rule__Array__ElementsAssignment_1_0 : ( ruleValue ) ;
    public final void rule__Array__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1280:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1281:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1281:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1282:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_02555);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1291:1: rule__Array__ElementsAssignment_1_1_1 : ( ruleValue ) ;
    public final void rule__Array__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1295:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1296:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1296:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1297:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_1_12586);
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
    public static final BitSet FOLLOW_rule__Number__Group__0_in_ruleNumber214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0_in_ruleObject274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectProperty308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__0_in_ruleObjectProperty334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Value__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Value__Alternatives451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Value__Alternatives471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ObjectValueAssignment_3_in_rule__Value__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ArrayValueAssignment_4_in_rule__Value__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__NumberValueAssignment_5_in_rule__Value__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__StringValueAssignment_6_in_rule__Value__Alternatives544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Number__Alternatives_3_0578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Number__Alternatives_3_0598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Number__Alternatives_3_1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Number__Alternatives_3_1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__0685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__0688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Number__Group__0__Impl717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__1750 = new BitSet(new long[]{0x0000000001300000L});
    public static final BitSet FOLLOW_rule__Number__Group__2_in_rule__Number__Group__1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Group__1__Impl780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__2__Impl_in_rule__Number__Group__2809 = new BitSet(new long[]{0x0000000001300000L});
    public static final BitSet FOLLOW_rule__Number__Group__3_in_rule__Number__Group__2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_2__0_in_rule__Number__Group__2__Impl839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__3__Impl_in_rule__Number__Group__3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__0_in_rule__Number__Group__3__Impl897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_2__0__Impl_in_rule__Number__Group_2__0936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Number__Group_2__1_in_rule__Number__Group_2__0939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Number__Group_2__0__Impl967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_2__1__Impl_in_rule__Number__Group_2__1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Group_2__1__Impl1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__0__Impl_in_rule__Number__Group_3__01058 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_rule__Number__Group_3__1_in_rule__Number__Group_3__01061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_3_0_in_rule__Number__Group_3__0__Impl1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__1__Impl_in_rule__Number__Group_3__11118 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_rule__Number__Group_3__2_in_rule__Number__Group_3__11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_3_1_in_rule__Number__Group_3__1__Impl1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__2__Impl_in_rule__Number__Group_3__21179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Group_3__2__Impl1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__01241 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Object__Group__1_in_rule__Object__Group__01244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_START_in_rule__Object__Group__0__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__11300 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Object__Group__2_in_rule__Object__Group__11303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__0_in_rule__Object__Group__1__Impl1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__21361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_END_in_rule__Object__Group__2__Impl1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__0__Impl_in_rule__Object__Group_1__01423 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Object__Group_1__1_in_rule__Object__Group_1__01426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__PropertiesAssignment_1_0_in_rule__Object__Group_1__0__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__1__Impl_in_rule__Object__Group_1__11483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__0_in_rule__Object__Group_1__1__Impl1510 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__0__Impl_in_rule__Object__Group_1_1__01545 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__1_in_rule__Object__Group_1_1__01548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_rule__Object__Group_1_1__0__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__1__Impl_in_rule__Object__Group_1_1__11604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__PropertiesAssignment_1_1_1_in_rule__Object__Group_1_1__1__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__0__Impl_in_rule__ObjectProperty__Group__01665 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__1_in_rule__ObjectProperty__Group__01668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__PropNameAssignment_0_in_rule__ObjectProperty__Group__0__Impl1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__1__Impl_in_rule__ObjectProperty__Group__11725 = new BitSet(new long[]{0x00000000008E0A30L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__2_in_rule__ObjectProperty__Group__11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_SEP_in_rule__ObjectProperty__Group__1__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__2__Impl_in_rule__ObjectProperty__Group__21784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__PropValueAssignment_2_in_rule__ObjectProperty__Group__2__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__01847 = new BitSet(new long[]{0x00000000008E0E30L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__01850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_START_in_rule__Array__Group__0__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__11906 = new BitSet(new long[]{0x00000000008E0E30L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__11909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__0_in_rule__Array__Group__1__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__21967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_END_in_rule__Array__Group__2__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__0__Impl_in_rule__Array__Group_1__02029 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Array__Group_1__1_in_rule__Array__Group_1__02032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ElementsAssignment_1_0_in_rule__Array__Group_1__0__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__1__Impl_in_rule__Array__Group_1__12089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__0_in_rule__Array__Group_1__1__Impl2116 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__0__Impl_in_rule__Array__Group_1_1__02151 = new BitSet(new long[]{0x00000000008E0A30L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__1_in_rule__Array__Group_1_1__02154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_rule__Array__Group_1_1__0__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__1__Impl_in_rule__Array__Group_1_1__12210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ElementsAssignment_1_1_1_in_rule__Array__Group_1_1__1__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Model__RootAssignment2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__Value__ObjectValueAssignment_32307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__ArrayValueAssignment_42338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Value__NumberValueAssignment_52369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__StringValueAssignment_62400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_02431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_1_12462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ObjectProperty__PropNameAssignment_02493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ObjectProperty__PropValueAssignment_22524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_02555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_1_12586 = new BitSet(new long[]{0x0000000000000002L});

}