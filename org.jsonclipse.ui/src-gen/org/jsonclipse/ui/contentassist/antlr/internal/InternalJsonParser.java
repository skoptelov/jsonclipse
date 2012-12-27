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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PLUS", "RULE_MINUS", "RULE_ZERO", "RULE_E", "RULE_DIGIT", "RULE_DOT", "RULE_DIGIT19", "RULE_OBJECT_START", "RULE_OBJECT_END", "RULE_VALUE_SEP", "RULE_NAME_SEP", "RULE_ARRAY_START", "RULE_ARRAY_END", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'null'", "'true'"
    };
    public static final int RULE_ID=18;
    public static final int RULE_ZERO=6;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_PLUS=4;
    public static final int RULE_SL_COMMENT=21;
    public static final int EOF=-1;
    public static final int RULE_OBJECT_END=12;
    public static final int RULE_ARRAY_START=15;
    public static final int RULE_ML_COMMENT=20;
    public static final int RULE_ARRAY_END=16;
    public static final int RULE_MINUS=5;
    public static final int RULE_STRING=17;
    public static final int RULE_E=7;
    public static final int RULE_DOT=9;
    public static final int RULE_OBJECT_START=11;
    public static final int RULE_VALUE_SEP=13;
    public static final int RULE_INT=19;
    public static final int RULE_DIGIT19=10;
    public static final int RULE_WS=22;
    public static final int RULE_DIGIT=8;
    public static final int RULE_NAME_SEP=14;

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


    // $ANTLR start "entryRuleExp"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:144:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:145:1: ( ruleExp EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:146:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp241);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp248); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:153:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:157:2: ( ( ( rule__Exp__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:158:1: ( ( rule__Exp__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:158:1: ( ( rule__Exp__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:159:1: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:160:1: ( rule__Exp__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:160:2: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_rule__Exp__Group__0_in_ruleExp274);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFrac"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:172:1: entryRuleFrac : ruleFrac EOF ;
    public final void entryRuleFrac() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:173:1: ( ruleFrac EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:174:1: ruleFrac EOF
            {
             before(grammarAccess.getFracRule()); 
            pushFollow(FOLLOW_ruleFrac_in_entryRuleFrac301);
            ruleFrac();

            state._fsp--;

             after(grammarAccess.getFracRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrac308); 

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
    // $ANTLR end "entryRuleFrac"


    // $ANTLR start "ruleFrac"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:181:1: ruleFrac : ( ( rule__Frac__Group__0 ) ) ;
    public final void ruleFrac() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:185:2: ( ( ( rule__Frac__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:186:1: ( ( rule__Frac__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:186:1: ( ( rule__Frac__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:187:1: ( rule__Frac__Group__0 )
            {
             before(grammarAccess.getFracAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:188:1: ( rule__Frac__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:188:2: rule__Frac__Group__0
            {
            pushFollow(FOLLOW_rule__Frac__Group__0_in_ruleFrac334);
            rule__Frac__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFracAccess().getGroup()); 

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
    // $ANTLR end "ruleFrac"


    // $ANTLR start "entryRuleInteger"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:200:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:201:1: ( ruleInteger EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:202:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger361);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger368); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:209:1: ruleInteger : ( ( rule__Integer__Alternatives ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:213:2: ( ( ( rule__Integer__Alternatives ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:214:1: ( ( rule__Integer__Alternatives ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:214:1: ( ( rule__Integer__Alternatives ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:215:1: ( rule__Integer__Alternatives )
            {
             before(grammarAccess.getIntegerAccess().getAlternatives()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:216:1: ( rule__Integer__Alternatives )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:216:2: rule__Integer__Alternatives
            {
            pushFollow(FOLLOW_rule__Integer__Alternatives_in_ruleInteger394);
            rule__Integer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleObject"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:228:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:229:1: ( ruleObject EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:230:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject421);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject428); 

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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:237:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:241:2: ( ( ( rule__Object__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:242:1: ( ( rule__Object__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:242:1: ( ( rule__Object__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:243:1: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:244:1: ( rule__Object__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:244:2: rule__Object__Group__0
            {
            pushFollow(FOLLOW_rule__Object__Group__0_in_ruleObject454);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:256:1: entryRuleObjectProperty : ruleObjectProperty EOF ;
    public final void entryRuleObjectProperty() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:257:1: ( ruleObjectProperty EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:258:1: ruleObjectProperty EOF
            {
             before(grammarAccess.getObjectPropertyRule()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty481);
            ruleObjectProperty();

            state._fsp--;

             after(grammarAccess.getObjectPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectProperty488); 

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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:265:1: ruleObjectProperty : ( ( rule__ObjectProperty__Group__0 ) ) ;
    public final void ruleObjectProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:269:2: ( ( ( rule__ObjectProperty__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:270:1: ( ( rule__ObjectProperty__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:270:1: ( ( rule__ObjectProperty__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:271:1: ( rule__ObjectProperty__Group__0 )
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:272:1: ( rule__ObjectProperty__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:272:2: rule__ObjectProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__0_in_ruleObjectProperty514);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:284:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:285:1: ( ruleArray EOF )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:286:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray541);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray548); 

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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:293:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:297:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:298:1: ( ( rule__Array__Group__0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:298:1: ( ( rule__Array__Group__0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:299:1: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:300:1: ( rule__Array__Group__0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:300:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray574);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:312:1: rule__Value__Alternatives : ( ( 'false' ) | ( 'null' ) | ( 'true' ) | ( ( rule__Value__ObjectValueAssignment_3 ) ) | ( ( rule__Value__ArrayValueAssignment_4 ) ) | ( ( rule__Value__NumberValueAssignment_5 ) ) | ( ( rule__Value__StringValueAssignment_6 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:316:1: ( ( 'false' ) | ( 'null' ) | ( 'true' ) | ( ( rule__Value__ObjectValueAssignment_3 ) ) | ( ( rule__Value__ArrayValueAssignment_4 ) ) | ( ( rule__Value__NumberValueAssignment_5 ) ) | ( ( rule__Value__StringValueAssignment_6 ) ) )
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
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:317:1: ( 'false' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:317:1: ( 'false' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:318:1: 'false'
                    {
                     before(grammarAccess.getValueAccess().getFalseKeyword_0()); 
                    match(input,24,FOLLOW_24_in_rule__Value__Alternatives611); 
                     after(grammarAccess.getValueAccess().getFalseKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:325:6: ( 'null' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:325:6: ( 'null' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:326:1: 'null'
                    {
                     before(grammarAccess.getValueAccess().getNullKeyword_1()); 
                    match(input,25,FOLLOW_25_in_rule__Value__Alternatives631); 
                     after(grammarAccess.getValueAccess().getNullKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:333:6: ( 'true' )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:333:6: ( 'true' )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:334:1: 'true'
                    {
                     before(grammarAccess.getValueAccess().getTrueKeyword_2()); 
                    match(input,26,FOLLOW_26_in_rule__Value__Alternatives651); 
                     after(grammarAccess.getValueAccess().getTrueKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:341:6: ( ( rule__Value__ObjectValueAssignment_3 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:341:6: ( ( rule__Value__ObjectValueAssignment_3 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:342:1: ( rule__Value__ObjectValueAssignment_3 )
                    {
                     before(grammarAccess.getValueAccess().getObjectValueAssignment_3()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:343:1: ( rule__Value__ObjectValueAssignment_3 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:343:2: rule__Value__ObjectValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Value__ObjectValueAssignment_3_in_rule__Value__Alternatives670);
                    rule__Value__ObjectValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getObjectValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:347:6: ( ( rule__Value__ArrayValueAssignment_4 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:347:6: ( ( rule__Value__ArrayValueAssignment_4 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:348:1: ( rule__Value__ArrayValueAssignment_4 )
                    {
                     before(grammarAccess.getValueAccess().getArrayValueAssignment_4()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:349:1: ( rule__Value__ArrayValueAssignment_4 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:349:2: rule__Value__ArrayValueAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Value__ArrayValueAssignment_4_in_rule__Value__Alternatives688);
                    rule__Value__ArrayValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getArrayValueAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:353:6: ( ( rule__Value__NumberValueAssignment_5 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:353:6: ( ( rule__Value__NumberValueAssignment_5 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:354:1: ( rule__Value__NumberValueAssignment_5 )
                    {
                     before(grammarAccess.getValueAccess().getNumberValueAssignment_5()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:355:1: ( rule__Value__NumberValueAssignment_5 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:355:2: rule__Value__NumberValueAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Value__NumberValueAssignment_5_in_rule__Value__Alternatives706);
                    rule__Value__NumberValueAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getNumberValueAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:359:6: ( ( rule__Value__StringValueAssignment_6 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:359:6: ( ( rule__Value__StringValueAssignment_6 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:360:1: ( rule__Value__StringValueAssignment_6 )
                    {
                     before(grammarAccess.getValueAccess().getStringValueAssignment_6()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:361:1: ( rule__Value__StringValueAssignment_6 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:361:2: rule__Value__StringValueAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Value__StringValueAssignment_6_in_rule__Value__Alternatives724);
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


    // $ANTLR start "rule__Exp__Alternatives_1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:370:1: rule__Exp__Alternatives_1 : ( ( RULE_PLUS ) | ( RULE_MINUS ) );
    public final void rule__Exp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:374:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_PLUS) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_MINUS) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:375:1: ( RULE_PLUS )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:375:1: ( RULE_PLUS )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:376:1: RULE_PLUS
                    {
                     before(grammarAccess.getExpAccess().getPLUSTerminalRuleCall_1_0()); 
                    match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__Exp__Alternatives_1757); 
                     after(grammarAccess.getExpAccess().getPLUSTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:381:6: ( RULE_MINUS )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:381:6: ( RULE_MINUS )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:382:1: RULE_MINUS
                    {
                     before(grammarAccess.getExpAccess().getMINUSTerminalRuleCall_1_1()); 
                    match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__Exp__Alternatives_1774); 
                     after(grammarAccess.getExpAccess().getMINUSTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Exp__Alternatives_1"


    // $ANTLR start "rule__Integer__Alternatives"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:392:1: rule__Integer__Alternatives : ( ( RULE_ZERO ) | ( ( rule__Integer__Group_1__0 ) ) );
    public final void rule__Integer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:396:1: ( ( RULE_ZERO ) | ( ( rule__Integer__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ZERO) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_DIGIT19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:397:1: ( RULE_ZERO )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:397:1: ( RULE_ZERO )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:398:1: RULE_ZERO
                    {
                     before(grammarAccess.getIntegerAccess().getZEROTerminalRuleCall_0()); 
                    match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_rule__Integer__Alternatives806); 
                     after(grammarAccess.getIntegerAccess().getZEROTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:403:6: ( ( rule__Integer__Group_1__0 ) )
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:403:6: ( ( rule__Integer__Group_1__0 ) )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:404:1: ( rule__Integer__Group_1__0 )
                    {
                     before(grammarAccess.getIntegerAccess().getGroup_1()); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:405:1: ( rule__Integer__Group_1__0 )
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:405:2: rule__Integer__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Integer__Group_1__0_in_rule__Integer__Alternatives823);
                    rule__Integer__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Integer__Alternatives"


    // $ANTLR start "rule__Number__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:416:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:420:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:421:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__0854);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__1_in_rule__Number__Group__0857);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:428:1: rule__Number__Group__0__Impl : ( ( RULE_MINUS )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:432:1: ( ( ( RULE_MINUS )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:433:1: ( ( RULE_MINUS )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:433:1: ( ( RULE_MINUS )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:434:1: ( RULE_MINUS )?
            {
             before(grammarAccess.getNumberAccess().getMINUSTerminalRuleCall_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:435:1: ( RULE_MINUS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_MINUS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:435:3: RULE_MINUS
                    {
                    match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__Number__Group__0__Impl885); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getMINUSTerminalRuleCall_0()); 

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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:445:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:449:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:450:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__1916);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__2_in_rule__Number__Group__1919);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:457:1: rule__Number__Group__1__Impl : ( ruleInteger ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:461:1: ( ( ruleInteger ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:462:1: ( ruleInteger )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:462:1: ( ruleInteger )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:463:1: ruleInteger
            {
             before(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleInteger_in_rule__Number__Group__1__Impl946);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1()); 

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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:474:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:478:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:479:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_rule__Number__Group__2__Impl_in_rule__Number__Group__2975);
            rule__Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__3_in_rule__Number__Group__2978);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:486:1: rule__Number__Group__2__Impl : ( ( ruleFrac )? ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:490:1: ( ( ( ruleFrac )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:491:1: ( ( ruleFrac )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:491:1: ( ( ruleFrac )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:492:1: ( ruleFrac )?
            {
             before(grammarAccess.getNumberAccess().getFracParserRuleCall_2()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:493:1: ( ruleFrac )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:493:3: ruleFrac
                    {
                    pushFollow(FOLLOW_ruleFrac_in_rule__Number__Group__2__Impl1006);
                    ruleFrac();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getFracParserRuleCall_2()); 

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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:503:1: rule__Number__Group__3 : rule__Number__Group__3__Impl ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:507:1: ( rule__Number__Group__3__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:508:2: rule__Number__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group__3__Impl_in_rule__Number__Group__31037);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:514:1: rule__Number__Group__3__Impl : ( ( ruleExp )? ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:518:1: ( ( ( ruleExp )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:519:1: ( ( ruleExp )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:519:1: ( ( ruleExp )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:520:1: ( ruleExp )?
            {
             before(grammarAccess.getNumberAccess().getExpParserRuleCall_3()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:521:1: ( ruleExp )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_E) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:521:3: ruleExp
                    {
                    pushFollow(FOLLOW_ruleExp_in_rule__Number__Group__3__Impl1065);
                    ruleExp();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getExpParserRuleCall_3()); 

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


    // $ANTLR start "rule__Exp__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:539:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:543:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:544:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_rule__Exp__Group__0__Impl_in_rule__Exp__Group__01104);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp__Group__1_in_rule__Exp__Group__01107);
            rule__Exp__Group__1();

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
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:551:1: rule__Exp__Group__0__Impl : ( RULE_E ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:555:1: ( ( RULE_E ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:556:1: ( RULE_E )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:556:1: ( RULE_E )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:557:1: RULE_E
            {
             before(grammarAccess.getExpAccess().getETerminalRuleCall_0()); 
            match(input,RULE_E,FOLLOW_RULE_E_in_rule__Exp__Group__0__Impl1134); 
             after(grammarAccess.getExpAccess().getETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:568:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl rule__Exp__Group__2 ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:572:1: ( rule__Exp__Group__1__Impl rule__Exp__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:573:2: rule__Exp__Group__1__Impl rule__Exp__Group__2
            {
            pushFollow(FOLLOW_rule__Exp__Group__1__Impl_in_rule__Exp__Group__11163);
            rule__Exp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp__Group__2_in_rule__Exp__Group__11166);
            rule__Exp__Group__2();

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
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:580:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Alternatives_1 )? ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:584:1: ( ( ( rule__Exp__Alternatives_1 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:585:1: ( ( rule__Exp__Alternatives_1 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:585:1: ( ( rule__Exp__Alternatives_1 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:586:1: ( rule__Exp__Alternatives_1 )?
            {
             before(grammarAccess.getExpAccess().getAlternatives_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:587:1: ( rule__Exp__Alternatives_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_PLUS && LA7_0<=RULE_MINUS)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:587:2: rule__Exp__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Exp__Alternatives_1_in_rule__Exp__Group__1__Impl1193);
                    rule__Exp__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group__2"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:597:1: rule__Exp__Group__2 : rule__Exp__Group__2__Impl ;
    public final void rule__Exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:601:1: ( rule__Exp__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:602:2: rule__Exp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp__Group__2__Impl_in_rule__Exp__Group__21224);
            rule__Exp__Group__2__Impl();

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
    // $ANTLR end "rule__Exp__Group__2"


    // $ANTLR start "rule__Exp__Group__2__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:608:1: rule__Exp__Group__2__Impl : ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) ) ;
    public final void rule__Exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:612:1: ( ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:613:1: ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:613:1: ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:614:1: ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:614:1: ( ( RULE_DIGIT ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:615:1: ( RULE_DIGIT )
            {
             before(grammarAccess.getExpAccess().getDIGITTerminalRuleCall_2()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:616:1: ( RULE_DIGIT )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:616:3: RULE_DIGIT
            {
            match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Exp__Group__2__Impl1254); 

            }

             after(grammarAccess.getExpAccess().getDIGITTerminalRuleCall_2()); 

            }

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:619:1: ( ( RULE_DIGIT )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:620:1: ( RULE_DIGIT )*
            {
             before(grammarAccess.getExpAccess().getDIGITTerminalRuleCall_2()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:621:1: ( RULE_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DIGIT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:621:3: RULE_DIGIT
            	    {
            	    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Exp__Group__2__Impl1267); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getDIGITTerminalRuleCall_2()); 

            }


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
    // $ANTLR end "rule__Exp__Group__2__Impl"


    // $ANTLR start "rule__Frac__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:638:1: rule__Frac__Group__0 : rule__Frac__Group__0__Impl rule__Frac__Group__1 ;
    public final void rule__Frac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:642:1: ( rule__Frac__Group__0__Impl rule__Frac__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:643:2: rule__Frac__Group__0__Impl rule__Frac__Group__1
            {
            pushFollow(FOLLOW_rule__Frac__Group__0__Impl_in_rule__Frac__Group__01306);
            rule__Frac__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Frac__Group__1_in_rule__Frac__Group__01309);
            rule__Frac__Group__1();

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
    // $ANTLR end "rule__Frac__Group__0"


    // $ANTLR start "rule__Frac__Group__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:650:1: rule__Frac__Group__0__Impl : ( RULE_DOT ) ;
    public final void rule__Frac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:654:1: ( ( RULE_DOT ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:655:1: ( RULE_DOT )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:655:1: ( RULE_DOT )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:656:1: RULE_DOT
            {
             before(grammarAccess.getFracAccess().getDOTTerminalRuleCall_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__Frac__Group__0__Impl1336); 
             after(grammarAccess.getFracAccess().getDOTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Frac__Group__0__Impl"


    // $ANTLR start "rule__Frac__Group__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:667:1: rule__Frac__Group__1 : rule__Frac__Group__1__Impl ;
    public final void rule__Frac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:671:1: ( rule__Frac__Group__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:672:2: rule__Frac__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Frac__Group__1__Impl_in_rule__Frac__Group__11365);
            rule__Frac__Group__1__Impl();

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
    // $ANTLR end "rule__Frac__Group__1"


    // $ANTLR start "rule__Frac__Group__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:678:1: rule__Frac__Group__1__Impl : ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) ) ;
    public final void rule__Frac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:682:1: ( ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:683:1: ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:683:1: ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:684:1: ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:684:1: ( ( RULE_DIGIT ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:685:1: ( RULE_DIGIT )
            {
             before(grammarAccess.getFracAccess().getDIGITTerminalRuleCall_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:686:1: ( RULE_DIGIT )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:686:3: RULE_DIGIT
            {
            match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Frac__Group__1__Impl1395); 

            }

             after(grammarAccess.getFracAccess().getDIGITTerminalRuleCall_1()); 

            }

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:689:1: ( ( RULE_DIGIT )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:690:1: ( RULE_DIGIT )*
            {
             before(grammarAccess.getFracAccess().getDIGITTerminalRuleCall_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:691:1: ( RULE_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DIGIT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:691:3: RULE_DIGIT
            	    {
            	    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Frac__Group__1__Impl1408); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFracAccess().getDIGITTerminalRuleCall_1()); 

            }


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
    // $ANTLR end "rule__Frac__Group__1__Impl"


    // $ANTLR start "rule__Integer__Group_1__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:706:1: rule__Integer__Group_1__0 : rule__Integer__Group_1__0__Impl rule__Integer__Group_1__1 ;
    public final void rule__Integer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:710:1: ( rule__Integer__Group_1__0__Impl rule__Integer__Group_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:711:2: rule__Integer__Group_1__0__Impl rule__Integer__Group_1__1
            {
            pushFollow(FOLLOW_rule__Integer__Group_1__0__Impl_in_rule__Integer__Group_1__01445);
            rule__Integer__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Integer__Group_1__1_in_rule__Integer__Group_1__01448);
            rule__Integer__Group_1__1();

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
    // $ANTLR end "rule__Integer__Group_1__0"


    // $ANTLR start "rule__Integer__Group_1__0__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:718:1: rule__Integer__Group_1__0__Impl : ( RULE_DIGIT19 ) ;
    public final void rule__Integer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:722:1: ( ( RULE_DIGIT19 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:723:1: ( RULE_DIGIT19 )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:723:1: ( RULE_DIGIT19 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:724:1: RULE_DIGIT19
            {
             before(grammarAccess.getIntegerAccess().getDIGIT19TerminalRuleCall_1_0()); 
            match(input,RULE_DIGIT19,FOLLOW_RULE_DIGIT19_in_rule__Integer__Group_1__0__Impl1475); 
             after(grammarAccess.getIntegerAccess().getDIGIT19TerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Integer__Group_1__0__Impl"


    // $ANTLR start "rule__Integer__Group_1__1"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:735:1: rule__Integer__Group_1__1 : rule__Integer__Group_1__1__Impl ;
    public final void rule__Integer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:739:1: ( rule__Integer__Group_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:740:2: rule__Integer__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group_1__1__Impl_in_rule__Integer__Group_1__11504);
            rule__Integer__Group_1__1__Impl();

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
    // $ANTLR end "rule__Integer__Group_1__1"


    // $ANTLR start "rule__Integer__Group_1__1__Impl"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:746:1: rule__Integer__Group_1__1__Impl : ( ( RULE_DIGIT )* ) ;
    public final void rule__Integer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:750:1: ( ( ( RULE_DIGIT )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:751:1: ( ( RULE_DIGIT )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:751:1: ( ( RULE_DIGIT )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:752:1: ( RULE_DIGIT )*
            {
             before(grammarAccess.getIntegerAccess().getDIGITTerminalRuleCall_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:753:1: ( RULE_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DIGIT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:753:3: RULE_DIGIT
            	    {
            	    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Integer__Group_1__1__Impl1532); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getIntegerAccess().getDIGITTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Integer__Group_1__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:767:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:771:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:772:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__01567);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__1_in_rule__Object__Group__01570);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:779:1: rule__Object__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:783:1: ( ( RULE_OBJECT_START ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:784:1: ( RULE_OBJECT_START )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:784:1: ( RULE_OBJECT_START )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:785:1: RULE_OBJECT_START
            {
             before(grammarAccess.getObjectAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_RULE_OBJECT_START_in_rule__Object__Group__0__Impl1597); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:796:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:800:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:801:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__11626);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__2_in_rule__Object__Group__11629);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:808:1: rule__Object__Group__1__Impl : ( ( rule__Object__Group_1__0 )? ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:812:1: ( ( ( rule__Object__Group_1__0 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:813:1: ( ( rule__Object__Group_1__0 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:813:1: ( ( rule__Object__Group_1__0 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:814:1: ( rule__Object__Group_1__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:815:1: ( rule__Object__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:815:2: rule__Object__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Object__Group_1__0_in_rule__Object__Group__1__Impl1656);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:825:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:829:1: ( rule__Object__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:830:2: rule__Object__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__21687);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:836:1: rule__Object__Group__2__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:840:1: ( ( RULE_OBJECT_END ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:841:1: ( RULE_OBJECT_END )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:841:1: ( RULE_OBJECT_END )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:842:1: RULE_OBJECT_END
            {
             before(grammarAccess.getObjectAccess().getOBJECT_ENDTerminalRuleCall_2()); 
            match(input,RULE_OBJECT_END,FOLLOW_RULE_OBJECT_END_in_rule__Object__Group__2__Impl1714); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:859:1: rule__Object__Group_1__0 : rule__Object__Group_1__0__Impl rule__Object__Group_1__1 ;
    public final void rule__Object__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:863:1: ( rule__Object__Group_1__0__Impl rule__Object__Group_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:864:2: rule__Object__Group_1__0__Impl rule__Object__Group_1__1
            {
            pushFollow(FOLLOW_rule__Object__Group_1__0__Impl_in_rule__Object__Group_1__01749);
            rule__Object__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_1__1_in_rule__Object__Group_1__01752);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:871:1: rule__Object__Group_1__0__Impl : ( ( rule__Object__PropertiesAssignment_1_0 ) ) ;
    public final void rule__Object__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:875:1: ( ( ( rule__Object__PropertiesAssignment_1_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:876:1: ( ( rule__Object__PropertiesAssignment_1_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:876:1: ( ( rule__Object__PropertiesAssignment_1_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:877:1: ( rule__Object__PropertiesAssignment_1_0 )
            {
             before(grammarAccess.getObjectAccess().getPropertiesAssignment_1_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:878:1: ( rule__Object__PropertiesAssignment_1_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:878:2: rule__Object__PropertiesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Object__PropertiesAssignment_1_0_in_rule__Object__Group_1__0__Impl1779);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:888:1: rule__Object__Group_1__1 : rule__Object__Group_1__1__Impl ;
    public final void rule__Object__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:892:1: ( rule__Object__Group_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:893:2: rule__Object__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_1__1__Impl_in_rule__Object__Group_1__11809);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:899:1: rule__Object__Group_1__1__Impl : ( ( rule__Object__Group_1_1__0 )* ) ;
    public final void rule__Object__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:903:1: ( ( ( rule__Object__Group_1_1__0 )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:904:1: ( ( rule__Object__Group_1_1__0 )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:904:1: ( ( rule__Object__Group_1_1__0 )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:905:1: ( rule__Object__Group_1_1__0 )*
            {
             before(grammarAccess.getObjectAccess().getGroup_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:906:1: ( rule__Object__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_VALUE_SEP) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:906:2: rule__Object__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Object__Group_1_1__0_in_rule__Object__Group_1__1__Impl1836);
            	    rule__Object__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:920:1: rule__Object__Group_1_1__0 : rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1 ;
    public final void rule__Object__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:924:1: ( rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:925:2: rule__Object__Group_1_1__0__Impl rule__Object__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Object__Group_1_1__0__Impl_in_rule__Object__Group_1_1__01871);
            rule__Object__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_1_1__1_in_rule__Object__Group_1_1__01874);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:932:1: rule__Object__Group_1_1__0__Impl : ( RULE_VALUE_SEP ) ;
    public final void rule__Object__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:936:1: ( ( RULE_VALUE_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:937:1: ( RULE_VALUE_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:937:1: ( RULE_VALUE_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:938:1: RULE_VALUE_SEP
            {
             before(grammarAccess.getObjectAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
            match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_rule__Object__Group_1_1__0__Impl1901); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:949:1: rule__Object__Group_1_1__1 : rule__Object__Group_1_1__1__Impl ;
    public final void rule__Object__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:953:1: ( rule__Object__Group_1_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:954:2: rule__Object__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_1_1__1__Impl_in_rule__Object__Group_1_1__11930);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:960:1: rule__Object__Group_1_1__1__Impl : ( ( rule__Object__PropertiesAssignment_1_1_1 ) ) ;
    public final void rule__Object__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:964:1: ( ( ( rule__Object__PropertiesAssignment_1_1_1 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:965:1: ( ( rule__Object__PropertiesAssignment_1_1_1 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:965:1: ( ( rule__Object__PropertiesAssignment_1_1_1 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:966:1: ( rule__Object__PropertiesAssignment_1_1_1 )
            {
             before(grammarAccess.getObjectAccess().getPropertiesAssignment_1_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:967:1: ( rule__Object__PropertiesAssignment_1_1_1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:967:2: rule__Object__PropertiesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Object__PropertiesAssignment_1_1_1_in_rule__Object__Group_1_1__1__Impl1957);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:981:1: rule__ObjectProperty__Group__0 : rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 ;
    public final void rule__ObjectProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:985:1: ( rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:986:2: rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__0__Impl_in_rule__ObjectProperty__Group__01991);
            rule__ObjectProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectProperty__Group__1_in_rule__ObjectProperty__Group__01994);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:993:1: rule__ObjectProperty__Group__0__Impl : ( ( rule__ObjectProperty__PropNameAssignment_0 ) ) ;
    public final void rule__ObjectProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:997:1: ( ( ( rule__ObjectProperty__PropNameAssignment_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:998:1: ( ( rule__ObjectProperty__PropNameAssignment_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:998:1: ( ( rule__ObjectProperty__PropNameAssignment_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:999:1: ( rule__ObjectProperty__PropNameAssignment_0 )
            {
             before(grammarAccess.getObjectPropertyAccess().getPropNameAssignment_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1000:1: ( rule__ObjectProperty__PropNameAssignment_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1000:2: rule__ObjectProperty__PropNameAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectProperty__PropNameAssignment_0_in_rule__ObjectProperty__Group__0__Impl2021);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1010:1: rule__ObjectProperty__Group__1 : rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 ;
    public final void rule__ObjectProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1014:1: ( rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1015:2: rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__1__Impl_in_rule__ObjectProperty__Group__12051);
            rule__ObjectProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectProperty__Group__2_in_rule__ObjectProperty__Group__12054);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1022:1: rule__ObjectProperty__Group__1__Impl : ( RULE_NAME_SEP ) ;
    public final void rule__ObjectProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1026:1: ( ( RULE_NAME_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:1: ( RULE_NAME_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:1: ( RULE_NAME_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1028:1: RULE_NAME_SEP
            {
             before(grammarAccess.getObjectPropertyAccess().getNAME_SEPTerminalRuleCall_1()); 
            match(input,RULE_NAME_SEP,FOLLOW_RULE_NAME_SEP_in_rule__ObjectProperty__Group__1__Impl2081); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1039:1: rule__ObjectProperty__Group__2 : rule__ObjectProperty__Group__2__Impl ;
    public final void rule__ObjectProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1043:1: ( rule__ObjectProperty__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1044:2: rule__ObjectProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjectProperty__Group__2__Impl_in_rule__ObjectProperty__Group__22110);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1050:1: rule__ObjectProperty__Group__2__Impl : ( ( rule__ObjectProperty__PropValueAssignment_2 ) ) ;
    public final void rule__ObjectProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1054:1: ( ( ( rule__ObjectProperty__PropValueAssignment_2 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1055:1: ( ( rule__ObjectProperty__PropValueAssignment_2 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1055:1: ( ( rule__ObjectProperty__PropValueAssignment_2 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1056:1: ( rule__ObjectProperty__PropValueAssignment_2 )
            {
             before(grammarAccess.getObjectPropertyAccess().getPropValueAssignment_2()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1057:1: ( rule__ObjectProperty__PropValueAssignment_2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1057:2: rule__ObjectProperty__PropValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ObjectProperty__PropValueAssignment_2_in_rule__ObjectProperty__Group__2__Impl2137);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1073:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1077:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1078:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__02173);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__02176);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1085:1: rule__Array__Group__0__Impl : ( RULE_ARRAY_START ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1089:1: ( ( RULE_ARRAY_START ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1090:1: ( RULE_ARRAY_START )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1090:1: ( RULE_ARRAY_START )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1091:1: RULE_ARRAY_START
            {
             before(grammarAccess.getArrayAccess().getARRAY_STARTTerminalRuleCall_0()); 
            match(input,RULE_ARRAY_START,FOLLOW_RULE_ARRAY_START_in_rule__Array__Group__0__Impl2203); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1102:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1106:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1107:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__12232);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__12235);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1114:1: rule__Array__Group__1__Impl : ( ( rule__Array__Group_1__0 )? ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1118:1: ( ( ( rule__Array__Group_1__0 )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1119:1: ( ( rule__Array__Group_1__0 )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1119:1: ( ( rule__Array__Group_1__0 )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1120:1: ( rule__Array__Group_1__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1121:1: ( rule__Array__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_MINUS && LA13_0<=RULE_ZERO)||(LA13_0>=RULE_DIGIT19 && LA13_0<=RULE_OBJECT_START)||LA13_0==RULE_ARRAY_START||LA13_0==RULE_STRING||(LA13_0>=24 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1121:2: rule__Array__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Array__Group_1__0_in_rule__Array__Group__1__Impl2262);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1131:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1135:1: ( rule__Array__Group__2__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1136:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__22293);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1142:1: rule__Array__Group__2__Impl : ( RULE_ARRAY_END ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1146:1: ( ( RULE_ARRAY_END ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1147:1: ( RULE_ARRAY_END )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1147:1: ( RULE_ARRAY_END )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1148:1: RULE_ARRAY_END
            {
             before(grammarAccess.getArrayAccess().getARRAY_ENDTerminalRuleCall_2()); 
            match(input,RULE_ARRAY_END,FOLLOW_RULE_ARRAY_END_in_rule__Array__Group__2__Impl2320); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1165:1: rule__Array__Group_1__0 : rule__Array__Group_1__0__Impl rule__Array__Group_1__1 ;
    public final void rule__Array__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1169:1: ( rule__Array__Group_1__0__Impl rule__Array__Group_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1170:2: rule__Array__Group_1__0__Impl rule__Array__Group_1__1
            {
            pushFollow(FOLLOW_rule__Array__Group_1__0__Impl_in_rule__Array__Group_1__02355);
            rule__Array__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_1__1_in_rule__Array__Group_1__02358);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1177:1: rule__Array__Group_1__0__Impl : ( ( rule__Array__ElementsAssignment_1_0 ) ) ;
    public final void rule__Array__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1181:1: ( ( ( rule__Array__ElementsAssignment_1_0 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1182:1: ( ( rule__Array__ElementsAssignment_1_0 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1182:1: ( ( rule__Array__ElementsAssignment_1_0 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1183:1: ( rule__Array__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getArrayAccess().getElementsAssignment_1_0()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1184:1: ( rule__Array__ElementsAssignment_1_0 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1184:2: rule__Array__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Array__ElementsAssignment_1_0_in_rule__Array__Group_1__0__Impl2385);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1194:1: rule__Array__Group_1__1 : rule__Array__Group_1__1__Impl ;
    public final void rule__Array__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1198:1: ( rule__Array__Group_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1199:2: rule__Array__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_1__1__Impl_in_rule__Array__Group_1__12415);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1205:1: rule__Array__Group_1__1__Impl : ( ( rule__Array__Group_1_1__0 )* ) ;
    public final void rule__Array__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1209:1: ( ( ( rule__Array__Group_1_1__0 )* ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1210:1: ( ( rule__Array__Group_1_1__0 )* )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1210:1: ( ( rule__Array__Group_1_1__0 )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1211:1: ( rule__Array__Group_1_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1212:1: ( rule__Array__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_VALUE_SEP) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1212:2: rule__Array__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_1_1__0_in_rule__Array__Group_1__1__Impl2442);
            	    rule__Array__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1226:1: rule__Array__Group_1_1__0 : rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 ;
    public final void rule__Array__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1230:1: ( rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1231:2: rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Array__Group_1_1__0__Impl_in_rule__Array__Group_1_1__02477);
            rule__Array__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_1_1__1_in_rule__Array__Group_1_1__02480);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1238:1: rule__Array__Group_1_1__0__Impl : ( RULE_VALUE_SEP ) ;
    public final void rule__Array__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1242:1: ( ( RULE_VALUE_SEP ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1243:1: ( RULE_VALUE_SEP )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1243:1: ( RULE_VALUE_SEP )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1244:1: RULE_VALUE_SEP
            {
             before(grammarAccess.getArrayAccess().getVALUE_SEPTerminalRuleCall_1_1_0()); 
            match(input,RULE_VALUE_SEP,FOLLOW_RULE_VALUE_SEP_in_rule__Array__Group_1_1__0__Impl2507); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1255:1: rule__Array__Group_1_1__1 : rule__Array__Group_1_1__1__Impl ;
    public final void rule__Array__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1259:1: ( rule__Array__Group_1_1__1__Impl )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1260:2: rule__Array__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_1_1__1__Impl_in_rule__Array__Group_1_1__12536);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1266:1: rule__Array__Group_1_1__1__Impl : ( ( rule__Array__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Array__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1270:1: ( ( ( rule__Array__ElementsAssignment_1_1_1 ) ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1271:1: ( ( rule__Array__ElementsAssignment_1_1_1 ) )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1271:1: ( ( rule__Array__ElementsAssignment_1_1_1 ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1272:1: ( rule__Array__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getArrayAccess().getElementsAssignment_1_1_1()); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1273:1: ( rule__Array__ElementsAssignment_1_1_1 )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1273:2: rule__Array__ElementsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Array__ElementsAssignment_1_1_1_in_rule__Array__Group_1_1__1__Impl2563);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1288:1: rule__Model__RootAssignment : ( ruleValue ) ;
    public final void rule__Model__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1292:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1293:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1293:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1294:1: ruleValue
            {
             before(grammarAccess.getModelAccess().getRootValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Model__RootAssignment2602);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1303:1: rule__Value__ObjectValueAssignment_3 : ( ruleObject ) ;
    public final void rule__Value__ObjectValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1307:1: ( ( ruleObject ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1308:1: ( ruleObject )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1308:1: ( ruleObject )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1309:1: ruleObject
            {
             before(grammarAccess.getValueAccess().getObjectValueObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObject_in_rule__Value__ObjectValueAssignment_32633);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1318:1: rule__Value__ArrayValueAssignment_4 : ( ruleArray ) ;
    public final void rule__Value__ArrayValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1322:1: ( ( ruleArray ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1323:1: ( ruleArray )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1323:1: ( ruleArray )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1324:1: ruleArray
            {
             before(grammarAccess.getValueAccess().getArrayValueArrayParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArray_in_rule__Value__ArrayValueAssignment_42664);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1333:1: rule__Value__NumberValueAssignment_5 : ( ruleNumber ) ;
    public final void rule__Value__NumberValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1337:1: ( ( ruleNumber ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1338:1: ( ruleNumber )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1338:1: ( ruleNumber )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1339:1: ruleNumber
            {
             before(grammarAccess.getValueAccess().getNumberValueNumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Value__NumberValueAssignment_52695);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1348:1: rule__Value__StringValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Value__StringValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1352:1: ( ( RULE_STRING ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1353:1: ( RULE_STRING )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1353:1: ( RULE_STRING )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1354:1: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getStringValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__StringValueAssignment_62726); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1363:1: rule__Object__PropertiesAssignment_1_0 : ( ruleObjectProperty ) ;
    public final void rule__Object__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1367:1: ( ( ruleObjectProperty ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1368:1: ( ruleObjectProperty )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1368:1: ( ruleObjectProperty )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1369:1: ruleObjectProperty
            {
             before(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_02757);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1378:1: rule__Object__PropertiesAssignment_1_1_1 : ( ruleObjectProperty ) ;
    public final void rule__Object__PropertiesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1382:1: ( ( ruleObjectProperty ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1383:1: ( ruleObjectProperty )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1383:1: ( ruleObjectProperty )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1384:1: ruleObjectProperty
            {
             before(grammarAccess.getObjectAccess().getPropertiesObjectPropertyParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_1_12788);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1393:1: rule__ObjectProperty__PropNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ObjectProperty__PropNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1397:1: ( ( RULE_STRING ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1398:1: ( RULE_STRING )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1398:1: ( RULE_STRING )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1399:1: RULE_STRING
            {
             before(grammarAccess.getObjectPropertyAccess().getPropNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ObjectProperty__PropNameAssignment_02819); 
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1408:1: rule__ObjectProperty__PropValueAssignment_2 : ( ruleValue ) ;
    public final void rule__ObjectProperty__PropValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1412:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1413:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1413:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1414:1: ruleValue
            {
             before(grammarAccess.getObjectPropertyAccess().getPropValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__ObjectProperty__PropValueAssignment_22850);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1423:1: rule__Array__ElementsAssignment_1_0 : ( ruleValue ) ;
    public final void rule__Array__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1427:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1428:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1428:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1429:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_02881);
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
    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1438:1: rule__Array__ElementsAssignment_1_1_1 : ( ruleValue ) ;
    public final void rule__Array__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1442:1: ( ( ruleValue ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1443:1: ( ruleValue )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1443:1: ( ruleValue )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1444:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getElementsValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_1_12912);
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
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp__Group__0_in_ruleExp274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrac_in_entryRuleFrac301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrac308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Frac__Group__0_in_ruleFrac334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Alternatives_in_ruleInteger394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0_in_ruleObject454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_entryRuleObjectProperty481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectProperty488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__0_in_ruleObjectProperty514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Value__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Value__Alternatives631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Value__Alternatives651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ObjectValueAssignment_3_in_rule__Value__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ArrayValueAssignment_4_in_rule__Value__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__NumberValueAssignment_5_in_rule__Value__Alternatives706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__StringValueAssignment_6_in_rule__Value__Alternatives724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__Exp__Alternatives_1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__Exp__Alternatives_1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ZERO_in_rule__Integer__Alternatives806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__0_in_rule__Integer__Alternatives823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__0854 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__0857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__Number__Group__0__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__1916 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__Number__Group__2_in_rule__Number__Group__1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Number__Group__1__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__2__Impl_in_rule__Number__Group__2975 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__Number__Group__3_in_rule__Number__Group__2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrac_in_rule__Number__Group__2__Impl1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__3__Impl_in_rule__Number__Group__31037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_rule__Number__Group__3__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp__Group__0__Impl_in_rule__Exp__Group__01104 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_rule__Exp__Group__1_in_rule__Exp__Group__01107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_E_in_rule__Exp__Group__0__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp__Group__1__Impl_in_rule__Exp__Group__11163 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_rule__Exp__Group__2_in_rule__Exp__Group__11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp__Alternatives_1_in_rule__Exp__Group__1__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp__Group__2__Impl_in_rule__Exp__Group__21224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Exp__Group__2__Impl1254 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Exp__Group__2__Impl1267 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Frac__Group__0__Impl_in_rule__Frac__Group__01306 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Frac__Group__1_in_rule__Frac__Group__01309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__Frac__Group__0__Impl1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Frac__Group__1__Impl_in_rule__Frac__Group__11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Frac__Group__1__Impl1395 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Frac__Group__1__Impl1408 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__0__Impl_in_rule__Integer__Group_1__01445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__1_in_rule__Integer__Group_1__01448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT19_in_rule__Integer__Group_1__0__Impl1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__1__Impl_in_rule__Integer__Group_1__11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Integer__Group_1__1__Impl1532 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__01567 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Object__Group__1_in_rule__Object__Group__01570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_START_in_rule__Object__Group__0__Impl1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__11626 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Object__Group__2_in_rule__Object__Group__11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__0_in_rule__Object__Group__1__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__21687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBJECT_END_in_rule__Object__Group__2__Impl1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__0__Impl_in_rule__Object__Group_1__01749 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Object__Group_1__1_in_rule__Object__Group_1__01752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__PropertiesAssignment_1_0_in_rule__Object__Group_1__0__Impl1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1__1__Impl_in_rule__Object__Group_1__11809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__0_in_rule__Object__Group_1__1__Impl1836 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__0__Impl_in_rule__Object__Group_1_1__01871 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__1_in_rule__Object__Group_1_1__01874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_rule__Object__Group_1_1__0__Impl1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_1_1__1__Impl_in_rule__Object__Group_1_1__11930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__PropertiesAssignment_1_1_1_in_rule__Object__Group_1_1__1__Impl1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__0__Impl_in_rule__ObjectProperty__Group__01991 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__1_in_rule__ObjectProperty__Group__01994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__PropNameAssignment_0_in_rule__ObjectProperty__Group__0__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__1__Impl_in_rule__ObjectProperty__Group__12051 = new BitSet(new long[]{0x0000000007028C60L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__2_in_rule__ObjectProperty__Group__12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_SEP_in_rule__ObjectProperty__Group__1__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__Group__2__Impl_in_rule__ObjectProperty__Group__22110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectProperty__PropValueAssignment_2_in_rule__ObjectProperty__Group__2__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__02173 = new BitSet(new long[]{0x0000000007038C60L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__02176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_START_in_rule__Array__Group__0__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__12232 = new BitSet(new long[]{0x0000000007038C60L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__12235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__0_in_rule__Array__Group__1__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__22293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_END_in_rule__Array__Group__2__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__0__Impl_in_rule__Array__Group_1__02355 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Array__Group_1__1_in_rule__Array__Group_1__02358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ElementsAssignment_1_0_in_rule__Array__Group_1__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1__1__Impl_in_rule__Array__Group_1__12415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__0_in_rule__Array__Group_1__1__Impl2442 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__0__Impl_in_rule__Array__Group_1_1__02477 = new BitSet(new long[]{0x0000000007028C60L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__1_in_rule__Array__Group_1_1__02480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_SEP_in_rule__Array__Group_1_1__0__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_1_1__1__Impl_in_rule__Array__Group_1_1__12536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ElementsAssignment_1_1_1_in_rule__Array__Group_1_1__1__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Model__RootAssignment2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__Value__ObjectValueAssignment_32633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__ArrayValueAssignment_42664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Value__NumberValueAssignment_52695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__StringValueAssignment_62726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_02757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectProperty_in_rule__Object__PropertiesAssignment_1_1_12788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ObjectProperty__PropNameAssignment_02819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ObjectProperty__PropValueAssignment_22850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_02881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ElementsAssignment_1_1_12912 = new BitSet(new long[]{0x0000000000000002L});

}