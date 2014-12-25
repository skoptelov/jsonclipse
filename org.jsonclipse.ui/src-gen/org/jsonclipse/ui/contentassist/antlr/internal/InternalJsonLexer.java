package org.jsonclipse.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonLexer extends Lexer {
    public static final int RULE_ID=17;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_FLOAT=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_OBJECT_END=7;
    public static final int RULE_ARRAY_START=10;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_ARRAY_END=11;
    public static final int RULE_STRING=12;
    public static final int RULE_HEX=14;
    public static final int RULE_E=15;
    public static final int RULE_EXPONENT=16;
    public static final int RULE_VALUE_SEP=8;
    public static final int RULE_OBJECT_START=6;
    public static final int RULE_INT=5;
    public static final int RULE_WS=20;
    public static final int RULE_DIGIT=13;
    public static final int RULE_NAME_SEP=9;

    // delegates
    // delegators

    public InternalJsonLexer() {;} 
    public InternalJsonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJsonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:11:7: ( 'false' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:11:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:12:7: ( 'null' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:12:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:13:7: ( 'true' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:13:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_ARRAY_START"
    public final void mRULE_ARRAY_START() throws RecognitionException {
        try {
            int _type = RULE_ARRAY_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:997:18: ( '[' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:997:20: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARRAY_START"

    // $ANTLR start "RULE_ARRAY_END"
    public final void mRULE_ARRAY_END() throws RecognitionException {
        try {
            int _type = RULE_ARRAY_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:999:16: ( ']' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:999:18: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARRAY_END"

    // $ANTLR start "RULE_OBJECT_START"
    public final void mRULE_OBJECT_START() throws RecognitionException {
        try {
            int _type = RULE_OBJECT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1001:19: ( '{' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1001:21: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OBJECT_START"

    // $ANTLR start "RULE_OBJECT_END"
    public final void mRULE_OBJECT_END() throws RecognitionException {
        try {
            int _type = RULE_OBJECT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1003:17: ( '}' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1003:19: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OBJECT_END"

    // $ANTLR start "RULE_NAME_SEP"
    public final void mRULE_NAME_SEP() throws RecognitionException {
        try {
            int _type = RULE_NAME_SEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1005:15: ( ':' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1005:17: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME_SEP"

    // $ANTLR start "RULE_VALUE_SEP"
    public final void mRULE_VALUE_SEP() throws RecognitionException {
        try {
            int _type = RULE_VALUE_SEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1007:16: ( ',' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1007:18: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALUE_SEP"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1009:21: ( '0' .. '9' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1009:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1011:19: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1011:21: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1013:17: ( ( 'e' | 'E' ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1013:19: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1015:24: ( RULE_E ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1015:26: RULE_E ( '+' | '-' )? ( RULE_DIGIT )+
            {
            mRULE_E(); 
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1015:33: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1015:44: ( RULE_DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1015:44: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:12: ( ( RULE_INT RULE_EXPONENT | RULE_INT '.' ( RULE_DIGIT )* ( RULE_EXPONENT )? ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:14: ( RULE_INT RULE_EXPONENT | RULE_INT '.' ( RULE_DIGIT )* ( RULE_EXPONENT )? )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:14: ( RULE_INT RULE_EXPONENT | RULE_INT '.' ( RULE_DIGIT )* ( RULE_EXPONENT )? )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:15: RULE_INT RULE_EXPONENT
                    {
                    mRULE_INT(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:38: RULE_INT '.' ( RULE_DIGIT )* ( RULE_EXPONENT )?
                    {
                    mRULE_INT(); 
                    match('.'); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:51: ( RULE_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:51: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:63: ( RULE_EXPONENT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1017:63: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1019:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1019:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1019:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1019:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1019:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1021:10: ( ( '0' .. '9' )+ )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1021:12: ( '0' .. '9' )+
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1021:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1021:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1023:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1025:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1025:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1025:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1025:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1027:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1029:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1029:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1029:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1031:16: ( . )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1031:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:8: ( T__22 | T__23 | T__24 | RULE_ARRAY_START | RULE_ARRAY_END | RULE_OBJECT_START | RULE_OBJECT_END | RULE_NAME_SEP | RULE_VALUE_SEP | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=17;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:28: RULE_ARRAY_START
                {
                mRULE_ARRAY_START(); 

                }
                break;
            case 5 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:45: RULE_ARRAY_END
                {
                mRULE_ARRAY_END(); 

                }
                break;
            case 6 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:60: RULE_OBJECT_START
                {
                mRULE_OBJECT_START(); 

                }
                break;
            case 7 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:78: RULE_OBJECT_END
                {
                mRULE_OBJECT_END(); 

                }
                break;
            case 8 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:94: RULE_NAME_SEP
                {
                mRULE_NAME_SEP(); 

                }
                break;
            case 9 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:108: RULE_VALUE_SEP
                {
                mRULE_VALUE_SEP(); 

                }
                break;
            case 10 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:123: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 11 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:134: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:142: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:151: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:163: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:179: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:195: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:203: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA5_eotS =
        "\4\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1017:14: ( RULE_INT RULE_EXPONENT | RULE_INT '.' ( RULE_DIGIT )* ( RULE_EXPONENT )? )";
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\3\23\6\uffff\1\34\1\21\1\uffff\3\21\2\uffff\1\23\1\uffff"+
        "\2\23\10\uffff\1\34\4\uffff\4\23\1\52\1\53\1\54\3\uffff";
    static final String DFA17_eofS =
        "\55\uffff";
    static final String DFA17_minS =
        "\1\0\1\141\1\165\1\162\6\uffff\1\56\1\101\1\uffff\2\0\1\52\2\uffff"+
        "\1\154\1\uffff\1\154\1\165\10\uffff\1\56\4\uffff\1\163\1\154\2\145"+
        "\3\60\3\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\141\1\165\1\162\6\uffff\1\145\1\172\1\uffff\2\uffff\1"+
        "\57\2\uffff\1\154\1\uffff\1\154\1\165\10\uffff\1\145\4\uffff\1\163"+
        "\1\154\2\145\3\172\3\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\13\3\uffff\1\20\1\21"+
        "\1\uffff\1\13\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\14\1\12\1\uffff"+
        "\1\15\1\16\1\17\1\20\7\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\1\2\14\uffff\1\1\1\0\36\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\4\21\1"+
            "\11\2\21\1\17\12\12\1\10\6\21\32\14\1\4\1\21\1\5\1\13\1\14\1"+
            "\21\5\14\1\1\7\14\1\2\5\14\1\3\6\14\1\6\1\21\1\7\uff82\21",
            "\1\22",
            "\1\24",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\1\uffff\12\36\13\uffff\1\35\37\uffff\1\35",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\0\37",
            "\0\37",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "\1\43",
            "",
            "\1\44",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\1\uffff\12\36\13\uffff\1\35\37\uffff\1\35",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | RULE_ARRAY_START | RULE_ARRAY_END | RULE_OBJECT_START | RULE_OBJECT_END | RULE_NAME_SEP | RULE_VALUE_SEP | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_14 = input.LA(1);

                        s = -1;
                        if ( ((LA17_14>='\u0000' && LA17_14<='\uFFFF')) ) {s = 31;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_13 = input.LA(1);

                        s = -1;
                        if ( ((LA17_13>='\u0000' && LA17_13<='\uFFFF')) ) {s = 31;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='f') ) {s = 1;}

                        else if ( (LA17_0=='n') ) {s = 2;}

                        else if ( (LA17_0=='t') ) {s = 3;}

                        else if ( (LA17_0=='[') ) {s = 4;}

                        else if ( (LA17_0==']') ) {s = 5;}

                        else if ( (LA17_0=='{') ) {s = 6;}

                        else if ( (LA17_0=='}') ) {s = 7;}

                        else if ( (LA17_0==':') ) {s = 8;}

                        else if ( (LA17_0==',') ) {s = 9;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 10;}

                        else if ( (LA17_0=='^') ) {s = 11;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='m')||(LA17_0>='o' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 12;}

                        else if ( (LA17_0=='\"') ) {s = 13;}

                        else if ( (LA17_0=='\'') ) {s = 14;}

                        else if ( (LA17_0=='/') ) {s = 15;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 16;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='+')||(LA17_0>='-' && LA17_0<='.')||(LA17_0>=';' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}