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


import org.antlr.runtime.tree.*;

public class outParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "DEF", "NEWLINE", "QUOTE", "STRING", "'rectangle'", "'('", "','", "')'", "';'", "'line'", "'ellipse'", "'polygon'", "'triangle'", "'arc'", "'text'", "'textrect'", "'point'", "'pixmap'", "'pixmaprect'"
    };
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


        public outParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public outParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return outParser.tokenNames; }
    public String getGrammarFileName() { return "/home/elm/sandbox/aub/fyp/guicop-specification-language/out.g"; }


    public static class properties_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "properties"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:7:1: properties : ( ( 'rectangle' '(' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'line' '(' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'ellipse' '(' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'polygon' '(' INT ',' INT ( ',' INT ',' INT )* ')' ';' ) | ( 'triangle' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'arc' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'text' '(' INT ',' INT ',' DEF ')' ';' ) | ( 'textrect' '(' INT ',' INT ',' INT ',' INT ',' DEF ')' ';' ) | ( 'point' '(' INT ',' INT ')' ';' ) | ( 'pixmap' '(' INT ',' INT ')' ';' ) | ( 'pixmaprect' '(' INT ',' INT ',' INT ',' INT ')' ';' ) | NEWLINE );
    public final outParser.properties_return properties() throws RecognitionException {
        outParser.properties_return retval = new outParser.properties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token char_literal2=null;
        Token INT3=null;
        Token char_literal4=null;
        Token INT5=null;
        Token char_literal6=null;
        Token INT7=null;
        Token char_literal8=null;
        Token INT9=null;
        Token char_literal10=null;
        Token char_literal11=null;
        Token string_literal12=null;
        Token char_literal13=null;
        Token INT14=null;
        Token char_literal15=null;
        Token INT16=null;
        Token char_literal17=null;
        Token INT18=null;
        Token char_literal19=null;
        Token INT20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token string_literal23=null;
        Token char_literal24=null;
        Token INT25=null;
        Token char_literal26=null;
        Token INT27=null;
        Token char_literal28=null;
        Token INT29=null;
        Token char_literal30=null;
        Token INT31=null;
        Token char_literal32=null;
        Token char_literal33=null;
        Token string_literal34=null;
        Token char_literal35=null;
        Token INT36=null;
        Token char_literal37=null;
        Token INT38=null;
        Token char_literal39=null;
        Token INT40=null;
        Token char_literal41=null;
        Token INT42=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token string_literal45=null;
        Token char_literal46=null;
        Token INT47=null;
        Token char_literal48=null;
        Token INT49=null;
        Token char_literal50=null;
        Token INT51=null;
        Token char_literal52=null;
        Token INT53=null;
        Token char_literal54=null;
        Token INT55=null;
        Token char_literal56=null;
        Token INT57=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token string_literal60=null;
        Token char_literal61=null;
        Token INT62=null;
        Token char_literal63=null;
        Token INT64=null;
        Token char_literal65=null;
        Token INT66=null;
        Token char_literal67=null;
        Token INT68=null;
        Token char_literal69=null;
        Token INT70=null;
        Token char_literal71=null;
        Token INT72=null;
        Token char_literal73=null;
        Token char_literal74=null;
        Token string_literal75=null;
        Token char_literal76=null;
        Token INT77=null;
        Token char_literal78=null;
        Token INT79=null;
        Token char_literal80=null;
        Token DEF81=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token string_literal84=null;
        Token char_literal85=null;
        Token INT86=null;
        Token char_literal87=null;
        Token INT88=null;
        Token char_literal89=null;
        Token INT90=null;
        Token char_literal91=null;
        Token INT92=null;
        Token char_literal93=null;
        Token DEF94=null;
        Token char_literal95=null;
        Token char_literal96=null;
        Token string_literal97=null;
        Token char_literal98=null;
        Token INT99=null;
        Token char_literal100=null;
        Token INT101=null;
        Token char_literal102=null;
        Token char_literal103=null;
        Token string_literal104=null;
        Token char_literal105=null;
        Token INT106=null;
        Token char_literal107=null;
        Token INT108=null;
        Token char_literal109=null;
        Token char_literal110=null;
        Token string_literal111=null;
        Token char_literal112=null;
        Token INT113=null;
        Token char_literal114=null;
        Token INT115=null;
        Token char_literal116=null;
        Token INT117=null;
        Token char_literal118=null;
        Token INT119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token NEWLINE122=null;

        Object string_literal1_tree=null;
        Object char_literal2_tree=null;
        Object INT3_tree=null;
        Object char_literal4_tree=null;
        Object INT5_tree=null;
        Object char_literal6_tree=null;
        Object INT7_tree=null;
        Object char_literal8_tree=null;
        Object INT9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal11_tree=null;
        Object string_literal12_tree=null;
        Object char_literal13_tree=null;
        Object INT14_tree=null;
        Object char_literal15_tree=null;
        Object INT16_tree=null;
        Object char_literal17_tree=null;
        Object INT18_tree=null;
        Object char_literal19_tree=null;
        Object INT20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal22_tree=null;
        Object string_literal23_tree=null;
        Object char_literal24_tree=null;
        Object INT25_tree=null;
        Object char_literal26_tree=null;
        Object INT27_tree=null;
        Object char_literal28_tree=null;
        Object INT29_tree=null;
        Object char_literal30_tree=null;
        Object INT31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal33_tree=null;
        Object string_literal34_tree=null;
        Object char_literal35_tree=null;
        Object INT36_tree=null;
        Object char_literal37_tree=null;
        Object INT38_tree=null;
        Object char_literal39_tree=null;
        Object INT40_tree=null;
        Object char_literal41_tree=null;
        Object INT42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;
        Object string_literal45_tree=null;
        Object char_literal46_tree=null;
        Object INT47_tree=null;
        Object char_literal48_tree=null;
        Object INT49_tree=null;
        Object char_literal50_tree=null;
        Object INT51_tree=null;
        Object char_literal52_tree=null;
        Object INT53_tree=null;
        Object char_literal54_tree=null;
        Object INT55_tree=null;
        Object char_literal56_tree=null;
        Object INT57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object string_literal60_tree=null;
        Object char_literal61_tree=null;
        Object INT62_tree=null;
        Object char_literal63_tree=null;
        Object INT64_tree=null;
        Object char_literal65_tree=null;
        Object INT66_tree=null;
        Object char_literal67_tree=null;
        Object INT68_tree=null;
        Object char_literal69_tree=null;
        Object INT70_tree=null;
        Object char_literal71_tree=null;
        Object INT72_tree=null;
        Object char_literal73_tree=null;
        Object char_literal74_tree=null;
        Object string_literal75_tree=null;
        Object char_literal76_tree=null;
        Object INT77_tree=null;
        Object char_literal78_tree=null;
        Object INT79_tree=null;
        Object char_literal80_tree=null;
        Object DEF81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        Object string_literal84_tree=null;
        Object char_literal85_tree=null;
        Object INT86_tree=null;
        Object char_literal87_tree=null;
        Object INT88_tree=null;
        Object char_literal89_tree=null;
        Object INT90_tree=null;
        Object char_literal91_tree=null;
        Object INT92_tree=null;
        Object char_literal93_tree=null;
        Object DEF94_tree=null;
        Object char_literal95_tree=null;
        Object char_literal96_tree=null;
        Object string_literal97_tree=null;
        Object char_literal98_tree=null;
        Object INT99_tree=null;
        Object char_literal100_tree=null;
        Object INT101_tree=null;
        Object char_literal102_tree=null;
        Object char_literal103_tree=null;
        Object string_literal104_tree=null;
        Object char_literal105_tree=null;
        Object INT106_tree=null;
        Object char_literal107_tree=null;
        Object INT108_tree=null;
        Object char_literal109_tree=null;
        Object char_literal110_tree=null;
        Object string_literal111_tree=null;
        Object char_literal112_tree=null;
        Object INT113_tree=null;
        Object char_literal114_tree=null;
        Object INT115_tree=null;
        Object char_literal116_tree=null;
        Object INT117_tree=null;
        Object char_literal118_tree=null;
        Object INT119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal121_tree=null;
        Object NEWLINE122_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:8:2: ( ( 'rectangle' '(' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'line' '(' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'ellipse' '(' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'polygon' '(' INT ',' INT ( ',' INT ',' INT )* ')' ';' ) | ( 'triangle' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'arc' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';' ) | ( 'text' '(' INT ',' INT ',' DEF ')' ';' ) | ( 'textrect' '(' INT ',' INT ',' INT ',' INT ',' DEF ')' ';' ) | ( 'point' '(' INT ',' INT ')' ';' ) | ( 'pixmap' '(' INT ',' INT ')' ';' ) | ( 'pixmaprect' '(' INT ',' INT ',' INT ',' INT ')' ';' ) | NEWLINE )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            case 20:
                {
                alt2=8;
                }
                break;
            case 21:
                {
                alt2=9;
                }
                break;
            case 22:
                {
                alt2=10;
                }
                break;
            case 23:
                {
                alt2=11;
                }
                break;
            case NEWLINE:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:8:4: ( 'rectangle' '(' INT ',' INT ',' INT ',' INT ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:8:4: ( 'rectangle' '(' INT ',' INT ',' INT ',' INT ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:8:5: 'rectangle' '(' INT ',' INT ',' INT ',' INT ')' ';'
                    {
                    string_literal1=(Token)match(input,9,FOLLOW_9_in_properties26);
                    string_literal1_tree = (Object)adaptor.create(string_literal1);
                    root_0 = (Object)adaptor.becomeRoot(string_literal1_tree, root_0);

                    char_literal2=(Token)match(input,10,FOLLOW_10_in_properties29);
                    INT3=(Token)match(input,INT,FOLLOW_INT_in_properties32);
                    INT3_tree = (Object)adaptor.create(INT3);
                    adaptor.addChild(root_0, INT3_tree);

                    char_literal4=(Token)match(input,11,FOLLOW_11_in_properties34);
                    INT5=(Token)match(input,INT,FOLLOW_INT_in_properties37);
                    INT5_tree = (Object)adaptor.create(INT5);
                    adaptor.addChild(root_0, INT5_tree);

                    char_literal6=(Token)match(input,11,FOLLOW_11_in_properties39);
                    INT7=(Token)match(input,INT,FOLLOW_INT_in_properties42);
                    INT7_tree = (Object)adaptor.create(INT7);
                    adaptor.addChild(root_0, INT7_tree);

                    char_literal8=(Token)match(input,11,FOLLOW_11_in_properties44);
                    INT9=(Token)match(input,INT,FOLLOW_INT_in_properties47);
                    INT9_tree = (Object)adaptor.create(INT9);
                    adaptor.addChild(root_0, INT9_tree);

                    char_literal10=(Token)match(input,12,FOLLOW_12_in_properties49);
                    char_literal11=(Token)match(input,13,FOLLOW_13_in_properties52);

                    }


                    }
                    break;
                case 2 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:9:4: ( 'line' '(' INT ',' INT ',' INT ',' INT ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:9:4: ( 'line' '(' INT ',' INT ',' INT ',' INT ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:9:5: 'line' '(' INT ',' INT ',' INT ',' INT ')' ';'
                    {
                    string_literal12=(Token)match(input,14,FOLLOW_14_in_properties60);
                    string_literal12_tree = (Object)adaptor.create(string_literal12);
                    root_0 = (Object)adaptor.becomeRoot(string_literal12_tree, root_0);

                    char_literal13=(Token)match(input,10,FOLLOW_10_in_properties63);
                    INT14=(Token)match(input,INT,FOLLOW_INT_in_properties66);
                    INT14_tree = (Object)adaptor.create(INT14);
                    adaptor.addChild(root_0, INT14_tree);

                    char_literal15=(Token)match(input,11,FOLLOW_11_in_properties68);
                    INT16=(Token)match(input,INT,FOLLOW_INT_in_properties71);
                    INT16_tree = (Object)adaptor.create(INT16);
                    adaptor.addChild(root_0, INT16_tree);

                    char_literal17=(Token)match(input,11,FOLLOW_11_in_properties73);
                    INT18=(Token)match(input,INT,FOLLOW_INT_in_properties76);
                    INT18_tree = (Object)adaptor.create(INT18);
                    adaptor.addChild(root_0, INT18_tree);

                    char_literal19=(Token)match(input,11,FOLLOW_11_in_properties78);
                    INT20=(Token)match(input,INT,FOLLOW_INT_in_properties81);
                    INT20_tree = (Object)adaptor.create(INT20);
                    adaptor.addChild(root_0, INT20_tree);

                    char_literal21=(Token)match(input,12,FOLLOW_12_in_properties83);
                    char_literal22=(Token)match(input,13,FOLLOW_13_in_properties86);

                    }


                    }
                    break;
                case 3 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:10:4: ( 'ellipse' '(' INT ',' INT ',' INT ',' INT ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:10:4: ( 'ellipse' '(' INT ',' INT ',' INT ',' INT ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:10:5: 'ellipse' '(' INT ',' INT ',' INT ',' INT ')' ';'
                    {
                    string_literal23=(Token)match(input,15,FOLLOW_15_in_properties94);
                    string_literal23_tree = (Object)adaptor.create(string_literal23);
                    root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);

                    char_literal24=(Token)match(input,10,FOLLOW_10_in_properties97);
                    INT25=(Token)match(input,INT,FOLLOW_INT_in_properties100);
                    INT25_tree = (Object)adaptor.create(INT25);
                    adaptor.addChild(root_0, INT25_tree);

                    char_literal26=(Token)match(input,11,FOLLOW_11_in_properties102);
                    INT27=(Token)match(input,INT,FOLLOW_INT_in_properties105);
                    INT27_tree = (Object)adaptor.create(INT27);
                    adaptor.addChild(root_0, INT27_tree);

                    char_literal28=(Token)match(input,11,FOLLOW_11_in_properties107);
                    INT29=(Token)match(input,INT,FOLLOW_INT_in_properties110);
                    INT29_tree = (Object)adaptor.create(INT29);
                    adaptor.addChild(root_0, INT29_tree);

                    char_literal30=(Token)match(input,11,FOLLOW_11_in_properties112);
                    INT31=(Token)match(input,INT,FOLLOW_INT_in_properties115);
                    INT31_tree = (Object)adaptor.create(INT31);
                    adaptor.addChild(root_0, INT31_tree);

                    char_literal32=(Token)match(input,12,FOLLOW_12_in_properties117);
                    char_literal33=(Token)match(input,13,FOLLOW_13_in_properties120);

                    }


                    }
                    break;
                case 4 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:11:4: ( 'polygon' '(' INT ',' INT ( ',' INT ',' INT )* ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:11:4: ( 'polygon' '(' INT ',' INT ( ',' INT ',' INT )* ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:11:5: 'polygon' '(' INT ',' INT ( ',' INT ',' INT )* ')' ';'
                    {
                    string_literal34=(Token)match(input,16,FOLLOW_16_in_properties128);
                    string_literal34_tree = (Object)adaptor.create(string_literal34);
                    root_0 = (Object)adaptor.becomeRoot(string_literal34_tree, root_0);

                    char_literal35=(Token)match(input,10,FOLLOW_10_in_properties131);
                    INT36=(Token)match(input,INT,FOLLOW_INT_in_properties134);
                    INT36_tree = (Object)adaptor.create(INT36);
                    adaptor.addChild(root_0, INT36_tree);

                    char_literal37=(Token)match(input,11,FOLLOW_11_in_properties136);
                    INT38=(Token)match(input,INT,FOLLOW_INT_in_properties139);
                    INT38_tree = (Object)adaptor.create(INT38);
                    adaptor.addChild(root_0, INT38_tree);

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:11:34: ( ',' INT ',' INT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:11:35: ',' INT ',' INT
                    	    {
                    	    char_literal39=(Token)match(input,11,FOLLOW_11_in_properties142);
                    	    INT40=(Token)match(input,INT,FOLLOW_INT_in_properties145);
                    	    INT40_tree = (Object)adaptor.create(INT40);
                    	    adaptor.addChild(root_0, INT40_tree);

                    	    char_literal41=(Token)match(input,11,FOLLOW_11_in_properties147);
                    	    INT42=(Token)match(input,INT,FOLLOW_INT_in_properties150);
                    	    INT42_tree = (Object)adaptor.create(INT42);
                    	    adaptor.addChild(root_0, INT42_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    char_literal43=(Token)match(input,12,FOLLOW_12_in_properties154);
                    char_literal44=(Token)match(input,13,FOLLOW_13_in_properties157);

                    }


                    }
                    break;
                case 5 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:12:4: ( 'triangle' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:12:4: ( 'triangle' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:12:5: 'triangle' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';'
                    {
                    string_literal45=(Token)match(input,17,FOLLOW_17_in_properties165);
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    root_0 = (Object)adaptor.becomeRoot(string_literal45_tree, root_0);

                    char_literal46=(Token)match(input,10,FOLLOW_10_in_properties168);
                    INT47=(Token)match(input,INT,FOLLOW_INT_in_properties171);
                    INT47_tree = (Object)adaptor.create(INT47);
                    adaptor.addChild(root_0, INT47_tree);

                    char_literal48=(Token)match(input,11,FOLLOW_11_in_properties173);
                    INT49=(Token)match(input,INT,FOLLOW_INT_in_properties176);
                    INT49_tree = (Object)adaptor.create(INT49);
                    adaptor.addChild(root_0, INT49_tree);

                    char_literal50=(Token)match(input,11,FOLLOW_11_in_properties178);
                    INT51=(Token)match(input,INT,FOLLOW_INT_in_properties181);
                    INT51_tree = (Object)adaptor.create(INT51);
                    adaptor.addChild(root_0, INT51_tree);

                    char_literal52=(Token)match(input,11,FOLLOW_11_in_properties183);
                    INT53=(Token)match(input,INT,FOLLOW_INT_in_properties186);
                    INT53_tree = (Object)adaptor.create(INT53);
                    adaptor.addChild(root_0, INT53_tree);

                    char_literal54=(Token)match(input,11,FOLLOW_11_in_properties188);
                    INT55=(Token)match(input,INT,FOLLOW_INT_in_properties191);
                    INT55_tree = (Object)adaptor.create(INT55);
                    adaptor.addChild(root_0, INT55_tree);

                    char_literal56=(Token)match(input,11,FOLLOW_11_in_properties193);
                    INT57=(Token)match(input,INT,FOLLOW_INT_in_properties196);
                    INT57_tree = (Object)adaptor.create(INT57);
                    adaptor.addChild(root_0, INT57_tree);

                    char_literal58=(Token)match(input,12,FOLLOW_12_in_properties198);
                    char_literal59=(Token)match(input,13,FOLLOW_13_in_properties201);

                    }


                    }
                    break;
                case 6 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:13:4: ( 'arc' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:13:4: ( 'arc' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:13:5: 'arc' '(' INT ',' INT ',' INT ',' INT ',' INT ',' INT ')' ';'
                    {
                    string_literal60=(Token)match(input,18,FOLLOW_18_in_properties209);
                    string_literal60_tree = (Object)adaptor.create(string_literal60);
                    root_0 = (Object)adaptor.becomeRoot(string_literal60_tree, root_0);

                    char_literal61=(Token)match(input,10,FOLLOW_10_in_properties212);
                    INT62=(Token)match(input,INT,FOLLOW_INT_in_properties215);
                    INT62_tree = (Object)adaptor.create(INT62);
                    adaptor.addChild(root_0, INT62_tree);

                    char_literal63=(Token)match(input,11,FOLLOW_11_in_properties217);
                    INT64=(Token)match(input,INT,FOLLOW_INT_in_properties220);
                    INT64_tree = (Object)adaptor.create(INT64);
                    adaptor.addChild(root_0, INT64_tree);

                    char_literal65=(Token)match(input,11,FOLLOW_11_in_properties222);
                    INT66=(Token)match(input,INT,FOLLOW_INT_in_properties225);
                    INT66_tree = (Object)adaptor.create(INT66);
                    adaptor.addChild(root_0, INT66_tree);

                    char_literal67=(Token)match(input,11,FOLLOW_11_in_properties227);
                    INT68=(Token)match(input,INT,FOLLOW_INT_in_properties230);
                    INT68_tree = (Object)adaptor.create(INT68);
                    adaptor.addChild(root_0, INT68_tree);

                    char_literal69=(Token)match(input,11,FOLLOW_11_in_properties232);
                    INT70=(Token)match(input,INT,FOLLOW_INT_in_properties235);
                    INT70_tree = (Object)adaptor.create(INT70);
                    adaptor.addChild(root_0, INT70_tree);

                    char_literal71=(Token)match(input,11,FOLLOW_11_in_properties237);
                    INT72=(Token)match(input,INT,FOLLOW_INT_in_properties240);
                    INT72_tree = (Object)adaptor.create(INT72);
                    adaptor.addChild(root_0, INT72_tree);

                    char_literal73=(Token)match(input,12,FOLLOW_12_in_properties242);
                    char_literal74=(Token)match(input,13,FOLLOW_13_in_properties245);

                    }


                    }
                    break;
                case 7 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:14:4: ( 'text' '(' INT ',' INT ',' DEF ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:14:4: ( 'text' '(' INT ',' INT ',' DEF ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:14:5: 'text' '(' INT ',' INT ',' DEF ')' ';'
                    {
                    string_literal75=(Token)match(input,19,FOLLOW_19_in_properties253);
                    string_literal75_tree = (Object)adaptor.create(string_literal75);
                    root_0 = (Object)adaptor.becomeRoot(string_literal75_tree, root_0);

                    char_literal76=(Token)match(input,10,FOLLOW_10_in_properties256);
                    INT77=(Token)match(input,INT,FOLLOW_INT_in_properties259);
                    INT77_tree = (Object)adaptor.create(INT77);
                    adaptor.addChild(root_0, INT77_tree);

                    char_literal78=(Token)match(input,11,FOLLOW_11_in_properties261);
                    INT79=(Token)match(input,INT,FOLLOW_INT_in_properties264);
                    INT79_tree = (Object)adaptor.create(INT79);
                    adaptor.addChild(root_0, INT79_tree);

                    char_literal80=(Token)match(input,11,FOLLOW_11_in_properties266);
                    DEF81=(Token)match(input,DEF,FOLLOW_DEF_in_properties270);
                    DEF81_tree = (Object)adaptor.create(DEF81);
                    adaptor.addChild(root_0, DEF81_tree);

                    char_literal82=(Token)match(input,12,FOLLOW_12_in_properties272);
                    char_literal83=(Token)match(input,13,FOLLOW_13_in_properties275);

                    }


                    }
                    break;
                case 8 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:15:4: ( 'textrect' '(' INT ',' INT ',' INT ',' INT ',' DEF ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:15:4: ( 'textrect' '(' INT ',' INT ',' INT ',' INT ',' DEF ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:15:5: 'textrect' '(' INT ',' INT ',' INT ',' INT ',' DEF ')' ';'
                    {
                    string_literal84=(Token)match(input,20,FOLLOW_20_in_properties283);
                    string_literal84_tree = (Object)adaptor.create(string_literal84);
                    root_0 = (Object)adaptor.becomeRoot(string_literal84_tree, root_0);

                    char_literal85=(Token)match(input,10,FOLLOW_10_in_properties286);
                    INT86=(Token)match(input,INT,FOLLOW_INT_in_properties289);
                    INT86_tree = (Object)adaptor.create(INT86);
                    adaptor.addChild(root_0, INT86_tree);

                    char_literal87=(Token)match(input,11,FOLLOW_11_in_properties291);
                    INT88=(Token)match(input,INT,FOLLOW_INT_in_properties294);
                    INT88_tree = (Object)adaptor.create(INT88);
                    adaptor.addChild(root_0, INT88_tree);

                    char_literal89=(Token)match(input,11,FOLLOW_11_in_properties296);
                    INT90=(Token)match(input,INT,FOLLOW_INT_in_properties299);
                    INT90_tree = (Object)adaptor.create(INT90);
                    adaptor.addChild(root_0, INT90_tree);

                    char_literal91=(Token)match(input,11,FOLLOW_11_in_properties301);
                    INT92=(Token)match(input,INT,FOLLOW_INT_in_properties304);
                    INT92_tree = (Object)adaptor.create(INT92);
                    adaptor.addChild(root_0, INT92_tree);

                    char_literal93=(Token)match(input,11,FOLLOW_11_in_properties306);
                    DEF94=(Token)match(input,DEF,FOLLOW_DEF_in_properties310);
                    DEF94_tree = (Object)adaptor.create(DEF94);
                    adaptor.addChild(root_0, DEF94_tree);

                    char_literal95=(Token)match(input,12,FOLLOW_12_in_properties312);
                    char_literal96=(Token)match(input,13,FOLLOW_13_in_properties315);

                    }


                    }
                    break;
                case 9 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:16:4: ( 'point' '(' INT ',' INT ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:16:4: ( 'point' '(' INT ',' INT ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:16:5: 'point' '(' INT ',' INT ')' ';'
                    {
                    string_literal97=(Token)match(input,21,FOLLOW_21_in_properties323);
                    string_literal97_tree = (Object)adaptor.create(string_literal97);
                    root_0 = (Object)adaptor.becomeRoot(string_literal97_tree, root_0);

                    char_literal98=(Token)match(input,10,FOLLOW_10_in_properties326);
                    INT99=(Token)match(input,INT,FOLLOW_INT_in_properties329);
                    INT99_tree = (Object)adaptor.create(INT99);
                    adaptor.addChild(root_0, INT99_tree);

                    char_literal100=(Token)match(input,11,FOLLOW_11_in_properties331);
                    INT101=(Token)match(input,INT,FOLLOW_INT_in_properties334);
                    INT101_tree = (Object)adaptor.create(INT101);
                    adaptor.addChild(root_0, INT101_tree);

                    char_literal102=(Token)match(input,12,FOLLOW_12_in_properties336);
                    char_literal103=(Token)match(input,13,FOLLOW_13_in_properties339);

                    }


                    }
                    break;
                case 10 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:17:4: ( 'pixmap' '(' INT ',' INT ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:17:4: ( 'pixmap' '(' INT ',' INT ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:17:5: 'pixmap' '(' INT ',' INT ')' ';'
                    {
                    string_literal104=(Token)match(input,22,FOLLOW_22_in_properties347);
                    string_literal104_tree = (Object)adaptor.create(string_literal104);
                    root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);

                    char_literal105=(Token)match(input,10,FOLLOW_10_in_properties350);
                    INT106=(Token)match(input,INT,FOLLOW_INT_in_properties353);
                    INT106_tree = (Object)adaptor.create(INT106);
                    adaptor.addChild(root_0, INT106_tree);

                    char_literal107=(Token)match(input,11,FOLLOW_11_in_properties355);
                    INT108=(Token)match(input,INT,FOLLOW_INT_in_properties358);
                    INT108_tree = (Object)adaptor.create(INT108);
                    adaptor.addChild(root_0, INT108_tree);

                    char_literal109=(Token)match(input,12,FOLLOW_12_in_properties360);
                    char_literal110=(Token)match(input,13,FOLLOW_13_in_properties363);

                    }


                    }
                    break;
                case 11 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:18:4: ( 'pixmaprect' '(' INT ',' INT ',' INT ',' INT ')' ';' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:18:4: ( 'pixmaprect' '(' INT ',' INT ',' INT ',' INT ')' ';' )
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:18:5: 'pixmaprect' '(' INT ',' INT ',' INT ',' INT ')' ';'
                    {
                    string_literal111=(Token)match(input,23,FOLLOW_23_in_properties371);
                    string_literal111_tree = (Object)adaptor.create(string_literal111);
                    root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);

                    char_literal112=(Token)match(input,10,FOLLOW_10_in_properties374);
                    INT113=(Token)match(input,INT,FOLLOW_INT_in_properties377);
                    INT113_tree = (Object)adaptor.create(INT113);
                    adaptor.addChild(root_0, INT113_tree);

                    char_literal114=(Token)match(input,11,FOLLOW_11_in_properties379);
                    INT115=(Token)match(input,INT,FOLLOW_INT_in_properties382);
                    INT115_tree = (Object)adaptor.create(INT115);
                    adaptor.addChild(root_0, INT115_tree);

                    char_literal116=(Token)match(input,11,FOLLOW_11_in_properties384);
                    INT117=(Token)match(input,INT,FOLLOW_INT_in_properties387);
                    INT117_tree = (Object)adaptor.create(INT117);
                    adaptor.addChild(root_0, INT117_tree);

                    char_literal118=(Token)match(input,11,FOLLOW_11_in_properties389);
                    INT119=(Token)match(input,INT,FOLLOW_INT_in_properties392);
                    INT119_tree = (Object)adaptor.create(INT119);
                    adaptor.addChild(root_0, INT119_tree);

                    char_literal120=(Token)match(input,12,FOLLOW_12_in_properties394);
                    char_literal121=(Token)match(input,13,FOLLOW_13_in_properties397);

                    }


                    }
                    break;
                case 12 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:19:4: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE122=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_properties404);

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "properties"

    public static class listofproperties_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listofproperties"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:22:1: listofproperties : ( properties )* ;
    public final outParser.listofproperties_return listofproperties() throws RecognitionException {
        outParser.listofproperties_return retval = new outParser.listofproperties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        outParser.properties_return properties123 = null;



        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:23:2: ( ( properties )* )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:23:4: ( properties )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:23:4: ( properties )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE||LA3_0==9||(LA3_0>=14 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/out.g:23:5: properties
            	    {
            	    pushFollow(FOLLOW_properties_in_listofproperties419);
            	    properties123=properties();

            	    state._fsp--;

            	    adaptor.addChild(root_0, properties123.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listofproperties"

    // Delegated rules




    public static final BitSet FOLLOW_9_in_properties26 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties32 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties34 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties37 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties42 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties47 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties49 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_properties60 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties63 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties66 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties71 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties73 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties76 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties78 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties81 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties83 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_properties94 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties97 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties100 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties105 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties110 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties115 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties117 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_properties128 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties134 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties139 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_properties142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties145 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties150 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_properties154 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_properties165 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties186 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties191 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties196 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_properties209 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties215 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties220 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties225 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties230 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties235 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties240 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties242 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_properties253 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties259 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties264 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DEF_in_properties270 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties272 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_properties283 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties294 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties299 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties304 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DEF_in_properties310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties312 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_properties323 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties329 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties334 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties336 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_properties347 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties353 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties358 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties360 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_properties371 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_properties374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties377 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties382 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties387 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_properties389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_properties392 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_properties394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_properties397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_properties404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_properties_in_listofproperties419 = new BitSet(new long[]{0x0000000000FFC242L});

}