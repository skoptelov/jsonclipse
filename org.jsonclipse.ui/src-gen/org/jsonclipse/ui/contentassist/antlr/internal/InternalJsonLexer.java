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
    public static final int RULE_ID=18;
    public static final int RULE_ZERO=6;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_PLUS=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=21;
    public static final int RULE_OBJECT_END=12;
    public static final int RULE_ARRAY_START=15;
    public static final int RULE_ML_COMMENT=20;
    public static final int RULE_ARRAY_END=16;
    public static final int RULE_MINUS=5;
    public static final int RULE_STRING=17;
    public static final int RULE_E=7;
    public static final int RULE_DOT=9;
    public static final int RULE_VALUE_SEP=13;
    public static final int RULE_OBJECT_START=11;
    public static final int RULE_INT=19;
    public static final int RULE_DIGIT19=10;
    public static final int RULE_WS=22;
    public static final int RULE_DIGIT=8;
    public static final int RULE_NAME_SEP=14;

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

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_ARRAY_START"
    public final void mRULE_ARRAY_START() throws RecognitionException {
        try {
            int _type = RULE_ARRAY_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1454:18: ( '[' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1454:20: '['
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1456:16: ( ']' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1456:18: ']'
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1458:19: ( '{' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1458:21: '{'
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1460:17: ( '}' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1460:19: '}'
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1462:15: ( ':' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1462:17: ':'
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1464:16: ( ',' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1464:18: ','
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

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1466:12: ( '-' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1466:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1468:11: ( '-' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1468:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_ZERO"
    public final void mRULE_ZERO() throws RecognitionException {
        try {
            int _type = RULE_ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1470:11: ( '0' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1470:13: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ZERO"

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            int _type = RULE_E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1472:8: ( ( 'e' | 'E' ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1472:10: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_DIGIT19"
    public final void mRULE_DIGIT19() throws RecognitionException {
        try {
            int _type = RULE_DIGIT19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1474:14: ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1474:16: ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
            {
            if ( (input.LA(1)>='1' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT19"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1476:12: ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '0' ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1476:14: ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '0' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1478:10: ( '.' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1478:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1480:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1480:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1480:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1480:11: '^'
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

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1480:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1482:10: ( ( '0' .. '9' )+ )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1482:12: ( '0' .. '9' )+
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1482:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1482:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1484:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1486:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1486:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1486:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1486:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1488:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1488:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1488:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1488:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1488:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1488:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1488:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1488:41: '\\r'
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1490:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1490:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1490:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1492:16: ( . )
            // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1492:18: .
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
        // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:8: ( T__24 | T__25 | T__26 | RULE_ARRAY_START | RULE_ARRAY_END | RULE_OBJECT_START | RULE_OBJECT_END | RULE_NAME_SEP | RULE_VALUE_SEP | RULE_MINUS | RULE_PLUS | RULE_ZERO | RULE_E | RULE_DIGIT19 | RULE_DIGIT | RULE_DOT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=23;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:22: T__26
                {
                mT__26(); 

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
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:123: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 11 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:134: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 12 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:144: RULE_ZERO
                {
                mRULE_ZERO(); 

                }
                break;
            case 13 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:154: RULE_E
                {
                mRULE_E(); 

                }
                break;
            case 14 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:161: RULE_DIGIT19
                {
                mRULE_DIGIT19(); 

                }
                break;
            case 15 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:174: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 16 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:185: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 17 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:194: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:202: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:211: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:223: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:239: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:255: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../org.jsonclipse.ui/src-gen/org/jsonclipse/ui/contentassist/antlr/internal/InternalJson.g:1:263: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\27\7\uffff\1\41\1\43\1\44\1\uffff\1\25\1\uffff\3\25"+
        "\2\uffff\1\27\1\uffff\2\27\20\uffff\4\27\1\61\1\62\1\63\3\uffff";
    static final String DFA12_eofS =
        "\64\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\165\1\162\7\uffff\3\60\1\uffff\1\101\1\uffff\2\0\1"+
        "\52\2\uffff\1\154\1\uffff\1\154\1\165\20\uffff\1\163\1\154\2\145"+
        "\3\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\141\1\165\1\162\7\uffff\1\71\1\172\1\71\1\uffff\1\172"+
        "\1\uffff\2\uffff\1\57\2\uffff\1\154\1\uffff\1\154\1\165\20\uffff"+
        "\1\163\1\154\2\145\3\172\3\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\3\uffff\1\20\1\uffff\1"+
        "\21\3\uffff\1\26\1\27\1\uffff\1\21\2\uffff\1\4\1\5\1\6\1\7\1\10"+
        "\1\11\1\12\1\14\1\22\1\15\1\16\1\20\1\23\1\24\1\25\1\26\7\uffff"+
        "\1\2\1\3\1\1";
    static final String DFA12_specialS =
        "\1\2\20\uffff\1\0\1\1\41\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\4\25\1"+
            "\11\1\12\1\16\1\23\1\13\11\15\1\10\6\25\4\20\1\14\25\20\1\4"+
            "\1\25\1\5\1\17\1\20\1\25\4\20\1\14\1\1\7\20\1\2\5\20\1\3\6\20"+
            "\1\6\1\25\1\7\uff82\25",
            "\1\26",
            "\1\30",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\42",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\46",
            "\0\46",
            "\1\47\4\uffff\1\50",
            "",
            "",
            "\1\52",
            "",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | RULE_ARRAY_START | RULE_ARRAY_END | RULE_OBJECT_START | RULE_OBJECT_END | RULE_NAME_SEP | RULE_VALUE_SEP | RULE_MINUS | RULE_PLUS | RULE_ZERO | RULE_E | RULE_DIGIT19 | RULE_DIGIT | RULE_DOT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 38;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 38;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='f') ) {s = 1;}

                        else if ( (LA12_0=='n') ) {s = 2;}

                        else if ( (LA12_0=='t') ) {s = 3;}

                        else if ( (LA12_0=='[') ) {s = 4;}

                        else if ( (LA12_0==']') ) {s = 5;}

                        else if ( (LA12_0=='{') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0==':') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0=='-') ) {s = 10;}

                        else if ( (LA12_0=='0') ) {s = 11;}

                        else if ( (LA12_0=='E'||LA12_0=='e') ) {s = 12;}

                        else if ( ((LA12_0>='1' && LA12_0<='9')) ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='d')||(LA12_0>='g' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 16;}

                        else if ( (LA12_0=='\"') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( (LA12_0=='/') ) {s = 19;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 20;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}