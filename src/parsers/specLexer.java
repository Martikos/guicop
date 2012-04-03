/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package parsers;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class specLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int OPERATOR=4;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int TAB=9;
    public static final int INT=6;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int WS=8;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int NEWLINE=10;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int PROPERTY=5;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;

    // delegates
    // delegators

    public specLexer() {;}
    public specLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public specLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:3:7: ( 'rectangle' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:3:9: 'rectangle'
            {
            match("rectangle");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:4:7: ( 'triangle' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:4:9: 'triangle'
            {
            match("triangle");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:5:7: ( 'ellipse' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:5:9: 'ellipse'
            {
            match("ellipse");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:6:7: ( 'polygon' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:6:9: 'polygon'
            {
            match("polygon");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:7:7: ( 'text' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:7:9: 'text'
            {
            match("text");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:8:7: ( 'textrect' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:8:9: 'textrect'
            {
            match("textrect");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:9:7: ( 'polyline' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:9:9: 'polyline'
            {
            match("polyline");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:10:7: ( '.' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:10:9: '.'
            {
            match('.');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:11:7: ( ',' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:11:9: ','
            {
            match(',');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:12:7: ( ';' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:12:9: ';'
            {
            match(';');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:13:7: ( '=' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:13:9: '='
            {
            match('=');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:14:7: ( '(' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:14:9: '('
            {
            match('(');

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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:15:7: ( ')' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:15:9: ')'
            {
            match(')');

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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:16:7: ( '\\\"' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:16:9: '\\\"'
            {
            match('\"');

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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:17:7: ( '{' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:17:9: '{'
            {
            match('{');

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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:18:7: ( '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:18:9: '}'
            {
            match('}');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:19:7: ( 'variables' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:19:9: 'variables'
            {
            match("variables");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:20:7: ( 'properties' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:20:9: 'properties'
            {
            match("properties");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:21:7: ( 'constraints' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:21:9: 'constraints'
            {
            match("constraints");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:12:9: ( 'leftto' | 'rightto' | 'above' | 'below' | 'contains' | 'over' | 'smaller' | 'leftaligned' | 'rightaligned' | 'topaligned' | 'bottomaligned' | 'textsubstring' | 'textsmaller' | 'textconcatenate' | 'and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '==' | '.' )
            int alt1=23;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:14:3: 'leftto'
                    {
                    match("leftto");


                    }
                    break;
                case 2 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:15:4: 'rightto'
                    {
                    match("rightto");


                    }
                    break;
                case 3 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:16:4: 'above'
                    {
                    match("above");


                    }
                    break;
                case 4 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:17:4: 'below'
                    {
                    match("below");


                    }
                    break;
                case 5 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:18:4: 'contains'
                    {
                    match("contains");


                    }
                    break;
                case 6 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:19:4: 'over'
                    {
                    match("over");


                    }
                    break;
                case 7 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:20:4: 'smaller'
                    {
                    match("smaller");


                    }
                    break;
                case 8 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:21:4: 'leftaligned'
                    {
                    match("leftaligned");


                    }
                    break;
                case 9 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:22:4: 'rightaligned'
                    {
                    match("rightaligned");


                    }
                    break;
                case 10 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:23:4: 'topaligned'
                    {
                    match("topaligned");


                    }
                    break;
                case 11 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:24:4: 'bottomaligned'
                    {
                    match("bottomaligned");


                    }
                    break;
                case 12 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:27:4: 'textsubstring'
                    {
                    match("textsubstring");


                    }
                    break;
                case 13 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:28:4: 'textsmaller'
                    {
                    match("textsmaller");


                    }
                    break;
                case 14 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:29:4: 'textconcatenate'
                    {
                    match("textconcatenate");


                    }
                    break;
                case 15 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:32:4: 'and'
                    {
                    match("and");


                    }
                    break;
                case 16 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:33:4: 'or'
                    {
                    match("or");


                    }
                    break;
                case 17 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:34:4: 'xor'
                    {
                    match("xor");


                    }
                    break;
                case 18 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:37:4: '+'
                    {
                    match('+');

                    }
                    break;
                case 19 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:38:4: '-'
                    {
                    match('-');

                    }
                    break;
                case 20 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:39:4: '*'
                    {
                    match('*');

                    }
                    break;
                case 21 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:40:4: '/'
                    {
                    match('/');

                    }
                    break;
                case 22 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:43:4: '=='
                    {
                    match("==");


                    }
                    break;
                case 23 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:44:4: '.'
                    {
                    match('.');

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "PROPERTY"
    public final void mPROPERTY() throws RecognitionException {
        try {
            int _type = PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:57:9: ( 'X' | 'Y' | 'WIDTH' | 'HEIGHT' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'X':
                {
                alt2=1;
                }
                break;
            case 'Y':
                {
                alt2=2;
                }
                break;
            case 'W':
                {
                alt2=3;
                }
                break;
            case 'H':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:57:11: 'X'
                    {
                    match('X');

                    }
                    break;
                case 2 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:58:4: 'Y'
                    {
                    match('Y');

                    }
                    break;
                case 3 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:59:4: 'WIDTH'
                    {
                    match("WIDTH");


                    }
                    break;
                case 4 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:60:4: 'HEIGHT'
                    {
                    match("HEIGHT");


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROPERTY"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:65:5: ( ( '1' .. '9' )+ )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:65:7: ( '1' .. '9' )+
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:65:7: ( '1' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:65:8: '1' .. '9'
            	    {
            	    matchRange('1','9');

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
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:69:4: ( ( 'a' .. 'z' | '\\_' ) ( 'a' .. 'z' | '0' .. '9' | '\\_' )* )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:69:6: ( 'a' .. 'z' | '\\_' ) ( 'a' .. 'z' | '0' .. '9' | '\\_' )*
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:69:22: ( 'a' .. 'z' | '0' .. '9' | '\\_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:73:4: ( ' ' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:73:6: ' '
            {
            match(' ');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "TAB"
    public final void mTAB() throws RecognitionException {
        try {
            int _type = TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:76:5: ( '\\t' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:76:7: '\\t'
            {
            match('\t');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAB"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:79:9: ( '\\n' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:79:11: '\\n'
            {
            match('\n');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | OPERATOR | PROPERTY | INT | ID | WS | TAB | NEWLINE )
        int alt5=26;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:10: T__11
                {
                mT__11();

                }
                break;
            case 2 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:16: T__12
                {
                mT__12();

                }
                break;
            case 3 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:22: T__13
                {
                mT__13();

                }
                break;
            case 4 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:28: T__14
                {
                mT__14();

                }
                break;
            case 5 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:34: T__15
                {
                mT__15();

                }
                break;
            case 6 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:40: T__16
                {
                mT__16();

                }
                break;
            case 7 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:46: T__17
                {
                mT__17();

                }
                break;
            case 8 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:52: T__18
                {
                mT__18();

                }
                break;
            case 9 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:58: T__19
                {
                mT__19();

                }
                break;
            case 10 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:64: T__20
                {
                mT__20();

                }
                break;
            case 11 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:70: T__21
                {
                mT__21();

                }
                break;
            case 12 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:76: T__22
                {
                mT__22();

                }
                break;
            case 13 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:82: T__23
                {
                mT__23();

                }
                break;
            case 14 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:88: T__24
                {
                mT__24();

                }
                break;
            case 15 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:94: T__25
                {
                mT__25();

                }
                break;
            case 16 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:100: T__26
                {
                mT__26();

                }
                break;
            case 17 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:106: T__27
                {
                mT__27();

                }
                break;
            case 18 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:112: T__28
                {
                mT__28();

                }
                break;
            case 19 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:118: T__29
                {
                mT__29();

                }
                break;
            case 20 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:124: OPERATOR
                {
                mOPERATOR();

                }
                break;
            case 21 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:133: PROPERTY
                {
                mPROPERTY();

                }
                break;
            case 22 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:142: INT
                {
                mINT();

                }
                break;
            case 23 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:146: ID
                {
                mID();

                }
                break;
            case 24 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:149: WS
                {
                mWS();

                }
                break;
            case 25 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:152: TAB
                {
                mTAB();

                }
                break;
            case 26 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:156: NEWLINE
                {
                mNEWLINE();

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA1_eotS =
        "\51\uffff";
    static final String DFA1_eofS =
        "\51\uffff";
    static final String DFA1_minS =
        "\1\52\1\145\1\151\1\142\1\145\1\uffff\1\162\1\uffff\1\145\7\uffff"+
        "\1\146\1\147\7\uffff\1\170\1\164\1\150\1\164\1\141\1\164\1\143\2"+
        "\uffff\1\141\1\155\5\uffff";
    static final String DFA1_maxS =
        "\1\170\1\145\1\151\1\156\1\157\1\uffff\1\166\1\uffff\1\157\7\uffff"+
        "\1\146\1\147\7\uffff\1\170\1\164\1\150\3\164\1\163\2\uffff\1\164"+
        "\1\165\5\uffff";
    static final String DFA1_acceptS =
        "\5\uffff\1\5\1\uffff\1\7\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1"+
        "\27\2\uffff\1\3\1\17\1\4\1\13\1\6\1\20\1\12\7\uffff\1\1\1\10\2\uffff"+
        "\1\16\1\2\1\11\1\14\1\15";
    static final String DFA1_specialS =
        "\51\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\14\1\12\1\uffff\1\13\1\17\1\15\15\uffff\1\16\43\uffff\1\3"+
            "\1\4\1\5\10\uffff\1\1\2\uffff\1\6\2\uffff\1\2\1\7\1\10\3\uffff"+
            "\1\11",
            "\1\20",
            "\1\21",
            "\1\22\13\uffff\1\23",
            "\1\24\11\uffff\1\25",
            "",
            "\1\27\3\uffff\1\26",
            "",
            "\1\31\11\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\41\22\uffff\1\40",
            "\1\42",
            "\1\44\17\uffff\1\43",
            "",
            "",
            "\1\46\22\uffff\1\45",
            "\1\50\7\uffff\1\47",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "12:1: OPERATOR : ( 'leftto' | 'rightto' | 'above' | 'below' | 'contains' | 'over' | 'smaller' | 'leftaligned' | 'rightaligned' | 'topaligned' | 'bottomaligned' | 'textsubstring' | 'textsmaller' | 'textconcatenate' | 'and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '==' | '.' );";
        }
    }
    static final String DFA5_eotS =
        "\1\uffff\4\31\3\uffff\1\46\5\uffff\10\31\7\uffff\10\31\2\uffff\10"+
        "\31\1\26\16\31\1\26\4\31\1\26\3\31\1\133\13\31\1\26\7\31\1\uffff"+
        "\12\31\2\26\22\31\1\26\4\31\1\26\7\31\1\u0099\1\u009a\7\31\1\26"+
        "\2\31\1\u00a4\1\u00a5\4\31\2\uffff\1\u00aa\3\31\1\26\2\31\1\u00b0"+
        "\1\31\2\uffff\4\31\1\uffff\1\31\1\u00b7\3\31\1\uffff\4\31\1\26\1"+
        "\u00bf\1\uffff\5\31\1\26\1\31\1\uffff\1\u00c6\1\26\1\31\1\26\2\31"+
        "\1\uffff\1\31\1\26\1\31\1\26\1\31\1\26";
    static final String DFA5_eofS =
        "\u00cd\uffff";
    static final String DFA5_minS =
        "\1\11\2\145\1\154\1\157\3\uffff\1\75\5\uffff\1\141\1\157\1\145\1"+
        "\142\1\145\1\162\1\155\1\157\7\uffff\1\143\1\147\1\151\1\170\1\160"+
        "\2\154\1\157\2\uffff\1\162\1\156\1\146\1\157\1\144\1\154\1\164\1"+
        "\145\1\60\1\141\1\162\1\164\1\150\1\141\1\164\1\141\1\151\1\171"+
        "\1\160\1\151\1\163\1\164\1\166\1\60\1\157\1\164\1\162\1\154\1\60"+
        "\1\141\1\164\1\156\1\60\1\154\1\160\1\147\1\145\1\141\1\164\2\141"+
        "\1\145\1\167\1\157\1\60\1\154\1\156\1\141\1\147\1\145\1\155\1\157"+
        "\1\uffff\1\151\1\163\1\157\1\151\1\162\1\142\1\162\1\151\1\157\1"+
        "\154\2\60\1\155\1\145\1\147\1\157\2\154\1\143\1\142\1\141\1\156"+
        "\1\147\1\145\2\156\1\164\1\154\1\141\1\156\1\60\1\151\1\141\1\162"+
        "\1\154\1\60\1\151\1\145\1\164\1\163\1\154\1\143\1\156\2\60\1\145"+
        "\1\151\1\145\1\151\1\163\1\147\1\154\1\60\1\145\1\147\2\60\1\164"+
        "\1\154\1\141\1\145\2\uffff\1\60\1\145\1\163\1\156\1\60\1\156\1\151"+
        "\1\60\1\156\2\uffff\1\162\1\145\1\164\1\144\1\uffff\1\163\1\60\1"+
        "\164\1\145\1\147\1\uffff\1\145\1\151\1\162\1\145\2\60\1\uffff\1"+
        "\163\1\144\1\156\1\144\1\156\1\60\1\156\1\uffff\2\60\1\145\1\60"+
        "\1\147\1\141\1\uffff\1\144\1\60\1\164\1\60\1\145\1\60";
    static final String DFA5_maxS =
        "\1\175\1\151\1\162\1\154\1\162\3\uffff\1\75\5\uffff\1\141\1\157"+
        "\1\145\1\156\1\157\1\166\1\155\1\157\7\uffff\1\143\1\147\1\151\1"+
        "\170\1\160\2\154\1\157\2\uffff\1\162\1\156\1\146\1\157\1\144\1\154"+
        "\1\164\1\145\1\172\1\141\1\162\1\164\1\150\1\141\1\164\1\141\1\151"+
        "\1\171\1\160\1\151\2\164\1\166\1\172\1\157\1\164\1\162\1\154\1\172"+
        "\1\141\1\164\1\156\1\172\1\154\1\160\1\154\1\145\1\141\1\164\1\141"+
        "\1\164\1\145\1\167\1\157\1\172\1\154\1\156\1\164\1\147\1\145\1\165"+
        "\1\157\1\uffff\1\151\1\163\1\157\1\151\1\162\1\142\1\162\1\151\1"+
        "\157\1\154\2\172\1\155\1\145\1\147\1\157\2\154\1\143\1\142\1\141"+
        "\1\156\1\147\1\145\2\156\1\164\1\154\1\141\1\156\1\172\1\151\1\141"+
        "\1\162\1\154\1\172\1\151\1\145\1\164\1\163\1\154\1\143\1\156\2\172"+
        "\1\145\1\151\1\145\1\151\1\163\1\147\1\154\1\172\1\145\1\147\2\172"+
        "\1\164\1\154\1\141\1\145\2\uffff\1\172\1\145\1\163\1\156\1\172\1"+
        "\156\1\151\1\172\1\156\2\uffff\1\162\1\145\1\164\1\144\1\uffff\1"+
        "\163\1\172\1\164\1\145\1\147\1\uffff\1\145\1\151\1\162\1\145\2\172"+
        "\1\uffff\1\163\1\144\1\156\1\144\1\156\1\172\1\156\1\uffff\2\172"+
        "\1\145\1\172\1\147\1\141\1\uffff\1\144\1\172\1\164\1\172\1\145\1"+
        "\172";
    static final String DFA5_acceptS =
        "\5\uffff\1\10\1\11\1\12\1\uffff\1\14\1\15\1\16\1\17\1\20\10\uffff"+
        "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\10\uffff\1\10\1\13\64\uffff"+
        "\1\5\75\uffff\1\3\1\4\11\uffff\1\2\1\6\4\uffff\1\7\5\uffff\1\1\6"+
        "\uffff\1\21\7\uffff\1\22\6\uffff\1\23\6\uffff";
    static final String DFA5_specialS =
        "\u00cd\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\33\1\34\25\uffff\1\32\1\uffff\1\13\5\uffff\1\11\1\12\2\26"+
            "\1\6\1\26\1\5\1\26\1\uffff\11\30\1\uffff\1\7\1\uffff\1\10\12"+
            "\uffff\1\27\16\uffff\3\27\5\uffff\1\31\1\uffff\1\21\1\22\1\17"+
            "\1\31\1\3\6\31\1\20\2\31\1\23\1\4\1\31\1\1\1\24\1\2\1\31\1\16"+
            "\1\31\1\25\2\31\1\14\1\uffff\1\15",
            "\1\35\3\uffff\1\36",
            "\1\40\11\uffff\1\41\2\uffff\1\37",
            "\1\42",
            "\1\43\2\uffff\1\44",
            "",
            "",
            "",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\13\uffff\1\53",
            "\1\54\11\uffff\1\55",
            "\1\57\3\uffff\1\56",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\1\116",
            "\1\117",
            "\1\120",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\31\45\uffff\1\31\1\uffff\2\31\1\132\16\31\1\130\1\131\7"+
            "\31",
            "\1\134",
            "\1\135",
            "\1\136\4\uffff\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\145\22\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\151",
            "\1\152",
            "\1\154\22\uffff\1\153",
            "\1\155",
            "\1\156",
            "\1\160\7\uffff\1\157",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00a2",
            "\1\u00a3",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00ae",
            "\1\u00af",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00c5",
            "",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00c7",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00cb",
            "\12\31\45\uffff\1\31\1\uffff\32\31",
            "\1\u00cc",
            "\12\31\45\uffff\1\31\1\uffff\32\31"
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | OPERATOR | PROPERTY | INT | ID | WS | TAB | NEWLINE );";
        }
    }


}