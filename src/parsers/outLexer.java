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

public class outLexer extends Lexer {
    public static final int DEF=5;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int INT=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__19=19;
    public static final int QUOTE=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int NEWLINE=6;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int STRING=8;

    // delegates
    // delegators

    public outLexer() {;}
    public outLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public outLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/elm/sandbox/aub/fyp/guicop-specification-language/out.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:3:6: ( 'rectangle' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:3:8: 'rectangle'
            {
            match("rectangle");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:4:7: ( '(' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:4:9: '('
            {
            match('(');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:5:7: ( ',' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:5:9: ','
            {
            match(',');

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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:6:7: ( ')' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:6:9: ')'
            {
            match(')');

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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:7:7: ( ';' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:7:9: ';'
            {
            match(';');

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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:8:7: ( 'line' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:8:9: 'line'
            {
            match("line");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:9:7: ( 'ellipse' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:9:9: 'ellipse'
            {
            match("ellipse");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:10:7: ( 'polygon' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:10:9: 'polygon'
            {
            match("polygon");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:11:7: ( 'triangle' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:11:9: 'triangle'
            {
            match("triangle");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:12:7: ( 'arc' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:12:9: 'arc'
            {
            match("arc");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:13:7: ( 'text' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:13:9: 'text'
            {
            match("text");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:14:7: ( 'textrect' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:14:9: 'textrect'
            {
            match("textrect");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:15:7: ( 'point' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:15:9: 'point'
            {
            match("point");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:16:7: ( 'pixmap' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:16:9: 'pixmap'
            {
            match("pixmap");


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
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:17:7: ( 'pixmaprect' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:17:9: 'pixmaprect'
            {
            match("pixmaprect");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:25:5: ( ( '0' .. '9' )+ )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:25:7: ( '0' .. '9' )+
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:25:7: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:25:7: '0' .. '9'
            	    {
            	    matchRange('0','9');

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:26:6: ( QUOTE STRING QUOTE )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:26:8: QUOTE STRING QUOTE
            {
            mQUOTE();
            mSTRING();
            mQUOTE();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:27:9: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | ' ' | ':' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '.' | '±' | '+' | '-' | '_' | '×' | '\\\\' | '/' | '=' | '÷' )* )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:27:11: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | ' ' | ':' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '.' | '±' | '+' | '-' | '_' | '×' | '\\\\' | '/' | '=' | '÷' )*
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:27:11: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | ' ' | ':' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '.' | '±' | '+' | '-' | '_' | '×' | '\\\\' | '/' | '=' | '÷' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=' ' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='&')||(LA2_0>='*' && LA2_0<='+')||(LA2_0>='-' && LA2_0<=':')||LA2_0=='='||(LA2_0>='@' && LA2_0<='Z')||LA2_0=='\\'||(LA2_0>='^' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='z')||LA2_0=='\u00B1'||LA2_0=='\u00D7'||LA2_0=='\u00F7') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<=':')||input.LA(1)=='='||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B1'||input.LA(1)=='\u00D7'||input.LA(1)=='\u00F7' ) {
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
    // $ANTLR end "STRING"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:29:2: ( '\"' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:29:4: '\"'
            {
            match('\"');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:31:8: ( ( ( ( '\\r' )? ) '\\n' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:31:9: ( ( ( '\\r' )? ) '\\n' )
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:31:9: ( ( ( '\\r' )? ) '\\n' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:31:10: ( ( '\\r' )? ) '\\n'
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:31:10: ( ( '\\r' )? )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:31:11: ( '\\r' )?
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:31:11: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:31:11: '\\r'
                    {
                    match('\r');

                    }
                    break;

            }


            }

            match('\n');

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | INT | DEF | STRING | QUOTE | NEWLINE )
        int alt4=20;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:10: T__9
                {
                mT__9();

                }
                break;
            case 2 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:15: T__10
                {
                mT__10();

                }
                break;
            case 3 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:21: T__11
                {
                mT__11();

                }
                break;
            case 4 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:27: T__12
                {
                mT__12();

                }
                break;
            case 5 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:33: T__13
                {
                mT__13();

                }
                break;
            case 6 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:39: T__14
                {
                mT__14();

                }
                break;
            case 7 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:45: T__15
                {
                mT__15();

                }
                break;
            case 8 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:51: T__16
                {
                mT__16();

                }
                break;
            case 9 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:57: T__17
                {
                mT__17();

                }
                break;
            case 10 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:63: T__18
                {
                mT__18();

                }
                break;
            case 11 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:69: T__19
                {
                mT__19();

                }
                break;
            case 12 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:75: T__20
                {
                mT__20();

                }
                break;
            case 13 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:81: T__21
                {
                mT__21();

                }
                break;
            case 14 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:87: T__22
                {
                mT__22();

                }
                break;
            case 15 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:93: T__23
                {
                mT__23();

                }
                break;
            case 16 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:99: INT
                {
                mINT();

                }
                break;
            case 17 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:103: DEF
                {
                mDEF();

                }
                break;
            case 18 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:107: STRING
                {
                mSTRING();

                }
                break;
            case 19 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:114: QUOTE
                {
                mQUOTE();

                }
                break;
            case 20 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:1:120: NEWLINE
                {
                mNEWLINE();

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\2\15\4\uffff\5\15\1\27\1\30\2\uffff\10\15\3\uffff\10\15\1\53\1"+
        "\15\1\55\5\15\1\64\1\uffff\1\15\1\uffff\2\15\1\70\3\15\1\uffff\3"+
        "\15\1\uffff\1\100\3\15\1\104\1\105\1\15\1\uffff\3\15\2\uffff\1\15"+
        "\1\113\1\114\1\115\1\15\3\uffff\1\117\1\uffff";
    static final String DFA4_eofS =
        "\120\uffff";
    static final String DFA4_minS =
        "\1\12\1\145\4\uffff\1\151\1\154\1\151\1\145\1\162\2\40\2\uffff\1"+
        "\143\1\156\1\154\1\151\1\170\1\151\1\170\1\143\3\uffff\1\164\1\145"+
        "\1\151\1\171\1\156\1\155\1\141\1\164\1\40\1\141\1\40\1\160\1\147"+
        "\1\164\1\141\1\156\1\40\1\uffff\1\156\1\uffff\1\163\1\157\1\40\1"+
        "\160\1\147\1\145\1\uffff\1\147\1\145\1\156\1\uffff\1\40\1\154\1"+
        "\143\1\154\2\40\1\145\1\uffff\1\145\1\164\1\145\2\uffff\1\143\3"+
        "\40\1\164\3\uffff\1\40\1\uffff";
    static final String DFA4_maxS =
        "\1\164\1\145\4\uffff\1\151\1\154\1\157\2\162\2\u00f7\2\uffff\1\143"+
        "\1\156\2\154\1\170\1\151\1\170\1\143\3\uffff\1\164\1\145\1\151\1"+
        "\171\1\156\1\155\1\141\1\164\1\u00f7\1\141\1\u00f7\1\160\1\147\1"+
        "\164\1\141\1\156\1\u00f7\1\uffff\1\156\1\uffff\1\163\1\157\1\u00f7"+
        "\1\160\1\147\1\145\1\uffff\1\147\1\145\1\156\1\uffff\1\u00f7\1\154"+
        "\1\143\1\154\2\u00f7\1\145\1\uffff\1\145\1\164\1\145\2\uffff\1\143"+
        "\3\u00f7\1\164\3\uffff\1\u00f7\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\7\uffff\1\22\1\24\10\uffff\1\20\1\23\1"+
        "\21\21\uffff\1\12\1\uffff\1\6\6\uffff\1\13\3\uffff\1\15\7\uffff"+
        "\1\16\3\uffff\1\7\1\10\5\uffff\1\11\1\14\1\1\1\uffff\1\17";
    static final String DFA4_specialS =
        "\120\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\16\2\uffff\1\16\24\uffff\1\14\5\uffff\1\2\1\4\2\uffff\1\3"+
            "\3\uffff\12\13\1\uffff\1\5\45\uffff\1\12\3\uffff\1\7\6\uffff"+
            "\1\6\3\uffff\1\10\1\uffff\1\1\1\uffff\1\11",
            "\1\17",
            "",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
            "\1\23\5\uffff\1\22",
            "\1\25\14\uffff\1\24",
            "\1\26",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\3\15\12\13\1\15\2\uffff"+
            "\1\15\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15"+
            "\66\uffff\1\15\45\uffff\1\15\37\uffff\1\15",
            "\7\31\3\uffff\2\31\1\uffff\16\31\2\uffff\1\31\2\uffff\33\31"+
            "\1\uffff\1\31\1\uffff\2\31\1\uffff\32\31\66\uffff\1\31\45\uffff"+
            "\1\31\37\uffff\1\31",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\36\2\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            "\1\54",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\21\15\1\63"+
            "\10\15\66\uffff\1\15\45\uffff\1\15\37\uffff\1\15",
            "",
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\21\15\1\77"+
            "\10\15\66\uffff\1\15\45\uffff\1\15\37\uffff\1\15",
            "\1\101",
            "\1\102",
            "\1\103",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "\1\112",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            "\1\116",
            "",
            "",
            "",
            "\2\15\1\uffff\4\15\3\uffff\2\15\1\uffff\16\15\2\uffff\1\15"+
            "\2\uffff\33\15\1\uffff\1\15\1\uffff\2\15\1\uffff\32\15\66\uffff"+
            "\1\15\45\uffff\1\15\37\uffff\1\15",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | INT | DEF | STRING | QUOTE | NEWLINE );";
        }
    }


}