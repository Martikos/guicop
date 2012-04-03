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

public class specParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OPERATOR", "PROPERTY", "INT", "ID", "WS", "TAB", "NEWLINE", "'rectangle'", "'line'", "'triangle'", "'ellipse'", "'polygon'", "'text'", "'textrect'", "'polyline'", "'.'", "','", "';'", "'='", "'('", "')'", "'\\\"'", "'{'", "'}'", "'variables'", "'properties'", "'constraints'"
    };
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int WS=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int NEWLINE=10;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int PROPERTY=5;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;

    // delegates
    // delegators


        public specParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public specParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return specParser.tokenNames; }
    public String getGrammarFileName() { return "/home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g"; }


    public static class shape_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shape"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:48:1: shape : ( 'rectangle' | 'line' | 'triangle' | 'ellipse' | 'polygon' | 'text' | 'textrect' | 'polyline' );
    public final specParser.shape_return shape() throws RecognitionException {
        specParser.shape_return retval = new specParser.shape_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set1=null;

        Object set1_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:48:7: ( 'rectangle' | 'line' | 'triangle' | 'ellipse' | 'polygon' | 'text' | 'textrect' | 'polyline' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:
            {
            root_0 = (Object)adaptor.nil();

            set1=(Token)input.LT(1);
            if ( (input.LA(1)>=11 && input.LA(1)<=18) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set1));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "shape"

    public static class membervariableaccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "membervariableaccess"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:88:1: membervariableaccess : ( ID '.' ID ) ;
    public final specParser.membervariableaccess_return membervariableaccess() throws RecognitionException {
        specParser.membervariableaccess_return retval = new specParser.membervariableaccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID2=null;
        Token char_literal3=null;
        Token ID4=null;

        Object ID2_tree=null;
        Object char_literal3_tree=null;
        Object ID4_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:89:2: ( ( ID '.' ID ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:89:4: ( ID '.' ID )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:89:4: ( ID '.' ID )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:89:5: ID '.' ID
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_membervariableaccess327);
            ID2_tree = (Object)adaptor.create(ID2);
            adaptor.addChild(root_0, ID2_tree);

            char_literal3=(Token)match(input,19,FOLLOW_19_in_membervariableaccess329);
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            root_0 = (Object)adaptor.becomeRoot(char_literal3_tree, root_0);

            ID4=(Token)match(input,ID,FOLLOW_ID_in_membervariableaccess332);
            ID4_tree = (Object)adaptor.create(ID4);
            adaptor.addChild(root_0, ID4_tree);


            }


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
    // $ANTLR end "membervariableaccess"

    public static class variablesdecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variablesdecl"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:92:1: variablesdecl : ( NEWLINE TAB TAB shape WS ID ( ',' WS ID )* ';' ) ;
    public final specParser.variablesdecl_return variablesdecl() throws RecognitionException {
        specParser.variablesdecl_return retval = new specParser.variablesdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE5=null;
        Token TAB6=null;
        Token TAB7=null;
        Token WS9=null;
        Token ID10=null;
        Token char_literal11=null;
        Token WS12=null;
        Token ID13=null;
        Token char_literal14=null;
        specParser.shape_return shape8 = null;


        Object NEWLINE5_tree=null;
        Object TAB6_tree=null;
        Object TAB7_tree=null;
        Object WS9_tree=null;
        Object ID10_tree=null;
        Object char_literal11_tree=null;
        Object WS12_tree=null;
        Object ID13_tree=null;
        Object char_literal14_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:93:2: ( ( NEWLINE TAB TAB shape WS ID ( ',' WS ID )* ';' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:93:4: ( NEWLINE TAB TAB shape WS ID ( ',' WS ID )* ';' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:93:4: ( NEWLINE TAB TAB shape WS ID ( ',' WS ID )* ';' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:93:5: NEWLINE TAB TAB shape WS ID ( ',' WS ID )* ';'
            {
            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variablesdecl345);
            TAB6=(Token)match(input,TAB,FOLLOW_TAB_in_variablesdecl348);
            TAB7=(Token)match(input,TAB,FOLLOW_TAB_in_variablesdecl351);
            pushFollow(FOLLOW_shape_in_variablesdecl354);
            shape8=shape();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(shape8.getTree(), root_0);
            WS9=(Token)match(input,WS,FOLLOW_WS_in_variablesdecl357);
            ID10=(Token)match(input,ID,FOLLOW_ID_in_variablesdecl360);
            ID10_tree = (Object)adaptor.create(ID10);
            adaptor.addChild(root_0, ID10_tree);

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:93:38: ( ',' WS ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:93:39: ',' WS ID
            	    {
            	    char_literal11=(Token)match(input,20,FOLLOW_20_in_variablesdecl363);
            	    WS12=(Token)match(input,WS,FOLLOW_WS_in_variablesdecl366);
            	    ID13=(Token)match(input,ID,FOLLOW_ID_in_variablesdecl369);
            	    ID13_tree = (Object)adaptor.create(ID13);
            	    adaptor.addChild(root_0, ID13_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal14=(Token)match(input,21,FOLLOW_21_in_variablesdecl372);

            }


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
    // $ANTLR end "variablesdecl"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:95:1: expression : membervariableaccess ( OPERATOR membervariableaccess )* ;
    public final specParser.expression_return expression() throws RecognitionException {
        specParser.expression_return retval = new specParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERATOR16=null;
        specParser.membervariableaccess_return membervariableaccess15 = null;

        specParser.membervariableaccess_return membervariableaccess17 = null;


        Object OPERATOR16_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:96:2: ( membervariableaccess ( OPERATOR membervariableaccess )* )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:96:4: membervariableaccess ( OPERATOR membervariableaccess )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_membervariableaccess_in_expression383);
            membervariableaccess15=membervariableaccess();

            state._fsp--;

            adaptor.addChild(root_0, membervariableaccess15.getTree());
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:96:25: ( OPERATOR membervariableaccess )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OPERATOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:96:26: OPERATOR membervariableaccess
            	    {
            	    OPERATOR16=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_expression386);
            	    OPERATOR16_tree = (Object)adaptor.create(OPERATOR16);
            	    root_0 = (Object)adaptor.becomeRoot(OPERATOR16_tree, root_0);

            	    pushFollow(FOLLOW_membervariableaccess_in_expression389);
            	    membervariableaccess17=membervariableaccess();

            	    state._fsp--;

            	    adaptor.addChild(root_0, membervariableaccess17.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "expression"

    public static class propertiesdecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertiesdecl"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:98:1: propertiesdecl : ( TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE ) ;
    public final specParser.propertiesdecl_return propertiesdecl() throws RecognitionException {
        specParser.propertiesdecl_return retval = new specParser.propertiesdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAB18=null;
        Token TAB19=null;
        Token PROPERTY20=null;
        Token WS21=null;
        Token char_literal22=null;
        Token WS23=null;
        Token char_literal25=null;
        Token NEWLINE26=null;
        specParser.expression_return expression24 = null;


        Object TAB18_tree=null;
        Object TAB19_tree=null;
        Object PROPERTY20_tree=null;
        Object WS21_tree=null;
        Object char_literal22_tree=null;
        Object WS23_tree=null;
        Object char_literal25_tree=null;
        Object NEWLINE26_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:99:2: ( ( TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:99:4: ( TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:99:4: ( TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:99:5: TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE
            {
            TAB18=(Token)match(input,TAB,FOLLOW_TAB_in_propertiesdecl402);
            TAB19=(Token)match(input,TAB,FOLLOW_TAB_in_propertiesdecl405);
            PROPERTY20=(Token)match(input,PROPERTY,FOLLOW_PROPERTY_in_propertiesdecl408);
            PROPERTY20_tree = (Object)adaptor.create(PROPERTY20);
            root_0 = (Object)adaptor.becomeRoot(PROPERTY20_tree, root_0);

            WS21=(Token)match(input,WS,FOLLOW_WS_in_propertiesdecl411);
            char_literal22=(Token)match(input,22,FOLLOW_22_in_propertiesdecl414);
            WS23=(Token)match(input,WS,FOLLOW_WS_in_propertiesdecl417);
            pushFollow(FOLLOW_expression_in_propertiesdecl420);
            expression24=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression24.getTree());
            char_literal25=(Token)match(input,21,FOLLOW_21_in_propertiesdecl422);
            NEWLINE26=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_propertiesdecl425);

            }


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
    // $ANTLR end "propertiesdecl"

    public static class constraintsdecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintsdecl"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:101:1: constraintsdecl : ( '(' constraintsdecl WS OPERATOR WS constraintsdecl ')' | membervariableaccess | ID | INT | '\\\"' ( ID | INT ) '\\\"' );
    public final specParser.constraintsdecl_return constraintsdecl() throws RecognitionException {
        specParser.constraintsdecl_return retval = new specParser.constraintsdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal27=null;
        Token WS29=null;
        Token OPERATOR30=null;
        Token WS31=null;
        Token char_literal33=null;
        Token ID35=null;
        Token INT36=null;
        Token char_literal37=null;
        Token set38=null;
        Token char_literal39=null;
        specParser.constraintsdecl_return constraintsdecl28 = null;

        specParser.constraintsdecl_return constraintsdecl32 = null;

        specParser.membervariableaccess_return membervariableaccess34 = null;


        Object char_literal27_tree=null;
        Object WS29_tree=null;
        Object OPERATOR30_tree=null;
        Object WS31_tree=null;
        Object char_literal33_tree=null;
        Object ID35_tree=null;
        Object INT36_tree=null;
        Object char_literal37_tree=null;
        Object set38_tree=null;
        Object char_literal39_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:2: ( '(' constraintsdecl WS OPERATOR WS constraintsdecl ')' | membervariableaccess | ID | INT | '\\\"' ( ID | INT ) '\\\"' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==19) ) {
                    alt3=2;
                }
                else if ( (LA3_2==WS||LA3_2==21||LA3_2==24) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:4: '(' constraintsdecl WS OPERATOR WS constraintsdecl ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal27=(Token)match(input,23,FOLLOW_23_in_constraintsdecl436);
                    pushFollow(FOLLOW_constraintsdecl_in_constraintsdecl439);
                    constraintsdecl28=constraintsdecl();

                    state._fsp--;

                    adaptor.addChild(root_0, constraintsdecl28.getTree());
                    WS29=(Token)match(input,WS,FOLLOW_WS_in_constraintsdecl441);
                    OPERATOR30=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_constraintsdecl444);
                    OPERATOR30_tree = (Object)adaptor.create(OPERATOR30);
                    root_0 = (Object)adaptor.becomeRoot(OPERATOR30_tree, root_0);

                    WS31=(Token)match(input,WS,FOLLOW_WS_in_constraintsdecl447);
                    pushFollow(FOLLOW_constraintsdecl_in_constraintsdecl450);
                    constraintsdecl32=constraintsdecl();

                    state._fsp--;

                    adaptor.addChild(root_0, constraintsdecl32.getTree());
                    char_literal33=(Token)match(input,24,FOLLOW_24_in_constraintsdecl452);

                    }
                    break;
                case 2 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:103:4: membervariableaccess
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_membervariableaccess_in_constraintsdecl458);
                    membervariableaccess34=membervariableaccess();

                    state._fsp--;

                    adaptor.addChild(root_0, membervariableaccess34.getTree());

                    }
                    break;
                case 3 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:104:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID35=(Token)match(input,ID,FOLLOW_ID_in_constraintsdecl463);
                    ID35_tree = (Object)adaptor.create(ID35);
                    adaptor.addChild(root_0, ID35_tree);


                    }
                    break;
                case 4 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:105:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT36=(Token)match(input,INT,FOLLOW_INT_in_constraintsdecl468);
                    INT36_tree = (Object)adaptor.create(INT36);
                    adaptor.addChild(root_0, INT36_tree);


                    }
                    break;
                case 5 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:106:4: '\\\"' ( ID | INT ) '\\\"'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal37=(Token)match(input,25,FOLLOW_25_in_constraintsdecl473);
                    char_literal37_tree = (Object)adaptor.create(char_literal37);
                    adaptor.addChild(root_0, char_literal37_tree);

                    set38=(Token)input.LT(1);
                    if ( (input.LA(1)>=INT && input.LA(1)<=ID) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set38));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    char_literal39=(Token)match(input,25,FOLLOW_25_in_constraintsdecl481);
                    char_literal39_tree = (Object)adaptor.create(char_literal39);
                    adaptor.addChild(root_0, char_literal39_tree);


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
    // $ANTLR end "constraintsdecl"

    public static class specobjects_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "specobjects"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:111:1: specobjects : specobject ( ( NEWLINE )* specobject )* ( ( NEWLINE )* ) ;
    public final specParser.specobjects_return specobjects() throws RecognitionException {
        specParser.specobjects_return retval = new specParser.specobjects_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE41=null;
        Token NEWLINE43=null;
        specParser.specobject_return specobject40 = null;

        specParser.specobject_return specobject42 = null;


        Object NEWLINE41_tree=null;
        Object NEWLINE43_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:2: ( specobject ( ( NEWLINE )* specobject )* ( ( NEWLINE )* ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:4: specobject ( ( NEWLINE )* specobject )* ( ( NEWLINE )* )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_specobject_in_specobjects496);
            specobject40=specobject();

            state._fsp--;

            adaptor.addChild(root_0, specobject40.getTree());
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:15: ( ( NEWLINE )* specobject )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:16: ( NEWLINE )* specobject
            	    {
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:23: ( NEWLINE )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==NEWLINE) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:23: NEWLINE
            	    	    {
            	    	    NEWLINE41=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobjects499);

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_specobject_in_specobjects503);
            	    specobject42=specobject();

            	    state._fsp--;

            	    adaptor.addChild(root_0, specobject42.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:39: ( ( NEWLINE )* )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:40: ( NEWLINE )*
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:47: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:112:47: NEWLINE
            	    {
            	    NEWLINE43=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobjects508);

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


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
    // $ANTLR end "specobjects"

    public static class specobject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "specobject"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:115:1: specobject : ( ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}' ) ;
    public final specParser.specobject_return specobject() throws RecognitionException {
        specParser.specobject_return retval = new specParser.specobject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID44=null;
        Token WS45=null;
        Token char_literal46=null;
        Token WS47=null;
        Token char_literal48=null;
        Token NEWLINE49=null;
        Token NEWLINE51=null;
        Token NEWLINE53=null;
        Token NEWLINE55=null;
        Token char_literal56=null;
        specParser.variables_return variables50 = null;

        specParser.properties_return properties52 = null;

        specParser.constraints_return constraints54 = null;


        Object ID44_tree=null;
        Object WS45_tree=null;
        Object char_literal46_tree=null;
        Object WS47_tree=null;
        Object char_literal48_tree=null;
        Object NEWLINE49_tree=null;
        Object NEWLINE51_tree=null;
        Object NEWLINE53_tree=null;
        Object NEWLINE55_tree=null;
        Object char_literal56_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:116:2: ( ( ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:116:4: ( ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:116:4: ( ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:116:5: ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}'
            {
            ID44=(Token)match(input,ID,FOLLOW_ID_in_specobject523);
            ID44_tree = (Object)adaptor.create(ID44);
            root_0 = (Object)adaptor.becomeRoot(ID44_tree, root_0);

            WS45=(Token)match(input,WS,FOLLOW_WS_in_specobject526);
            char_literal46=(Token)match(input,22,FOLLOW_22_in_specobject529);
            WS47=(Token)match(input,WS,FOLLOW_WS_in_specobject532);
            char_literal48=(Token)match(input,26,FOLLOW_26_in_specobject535);
            NEWLINE49=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobject540);
            pushFollow(FOLLOW_variables_in_specobject546);
            variables50=variables();

            state._fsp--;

            adaptor.addChild(root_0, variables50.getTree());
            NEWLINE51=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobject551);
            pushFollow(FOLLOW_properties_in_specobject557);
            properties52=properties();

            state._fsp--;

            adaptor.addChild(root_0, properties52.getTree());
            NEWLINE53=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobject562);
            pushFollow(FOLLOW_constraints_in_specobject568);
            constraints54=constraints();

            state._fsp--;

            adaptor.addChild(root_0, constraints54.getTree());
            NEWLINE55=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobject573);
            char_literal56=(Token)match(input,27,FOLLOW_27_in_specobject578);

            }


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
    // $ANTLR end "specobject"

    public static class variables_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variables"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:127:1: variables : ( TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}' ) ;
    public final specParser.variables_return variables() throws RecognitionException {
        specParser.variables_return retval = new specParser.variables_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAB57=null;
        Token string_literal58=null;
        Token WS59=null;
        Token char_literal60=null;
        Token NEWLINE62=null;
        Token TAB63=null;
        Token char_literal64=null;
        specParser.variablesdecl_return variablesdecl61 = null;


        Object TAB57_tree=null;
        Object string_literal58_tree=null;
        Object WS59_tree=null;
        Object char_literal60_tree=null;
        Object NEWLINE62_tree=null;
        Object TAB63_tree=null;
        Object char_literal64_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:128:2: ( ( TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:128:4: ( TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:128:4: ( TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:128:5: TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}'
            {
            TAB57=(Token)match(input,TAB,FOLLOW_TAB_in_variables592);
            string_literal58=(Token)match(input,28,FOLLOW_28_in_variables595);
            string_literal58_tree = (Object)adaptor.create(string_literal58);
            root_0 = (Object)adaptor.becomeRoot(string_literal58_tree, root_0);

            WS59=(Token)match(input,WS,FOLLOW_WS_in_variables598);
            char_literal60=(Token)match(input,26,FOLLOW_26_in_variables601);
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:129:4: ( variablesdecl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NEWLINE) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==TAB) ) {
                        int LA7_2 = input.LA(3);

                        if ( (LA7_2==TAB) ) {
                            alt7=1;
                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:129:4: variablesdecl
            	    {
            	    pushFollow(FOLLOW_variablesdecl_in_variables607);
            	    variablesdecl61=variablesdecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variablesdecl61.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            NEWLINE62=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variables613);
            TAB63=(Token)match(input,TAB,FOLLOW_TAB_in_variables618);
            char_literal64=(Token)match(input,27,FOLLOW_27_in_variables621);

            }


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
    // $ANTLR end "variables"

    public static class properties_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "properties"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:133:1: properties : ( TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}' ) ;
    public final specParser.properties_return properties() throws RecognitionException {
        specParser.properties_return retval = new specParser.properties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAB65=null;
        Token string_literal66=null;
        Token WS67=null;
        Token char_literal68=null;
        Token NEWLINE69=null;
        Token TAB71=null;
        Token char_literal72=null;
        specParser.propertiesdecl_return propertiesdecl70 = null;


        Object TAB65_tree=null;
        Object string_literal66_tree=null;
        Object WS67_tree=null;
        Object char_literal68_tree=null;
        Object NEWLINE69_tree=null;
        Object TAB71_tree=null;
        Object char_literal72_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:134:2: ( ( TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:134:4: ( TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:134:4: ( TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:134:5: TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}'
            {
            TAB65=(Token)match(input,TAB,FOLLOW_TAB_in_properties634);
            string_literal66=(Token)match(input,29,FOLLOW_29_in_properties637);
            string_literal66_tree = (Object)adaptor.create(string_literal66);
            root_0 = (Object)adaptor.becomeRoot(string_literal66_tree, root_0);

            WS67=(Token)match(input,WS,FOLLOW_WS_in_properties640);
            char_literal68=(Token)match(input,26,FOLLOW_26_in_properties643);
            NEWLINE69=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_properties649);
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:136:4: ( propertiesdecl )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==TAB) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==TAB) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:136:4: propertiesdecl
            	    {
            	    pushFollow(FOLLOW_propertiesdecl_in_properties655);
            	    propertiesdecl70=propertiesdecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, propertiesdecl70.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            TAB71=(Token)match(input,TAB,FOLLOW_TAB_in_properties661);
            char_literal72=(Token)match(input,27,FOLLOW_27_in_properties664);

            }


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

    public static class constraints_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraints"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:140:1: constraints : ( TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}' ) ;
    public final specParser.constraints_return constraints() throws RecognitionException {
        specParser.constraints_return retval = new specParser.constraints_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAB73=null;
        Token string_literal74=null;
        Token WS75=null;
        Token char_literal76=null;
        Token NEWLINE77=null;
        Token TAB78=null;
        Token TAB79=null;
        Token char_literal81=null;
        Token NEWLINE82=null;
        Token TAB83=null;
        Token char_literal84=null;
        specParser.constraintsdecl_return constraintsdecl80 = null;


        Object TAB73_tree=null;
        Object string_literal74_tree=null;
        Object WS75_tree=null;
        Object char_literal76_tree=null;
        Object NEWLINE77_tree=null;
        Object TAB78_tree=null;
        Object TAB79_tree=null;
        Object char_literal81_tree=null;
        Object NEWLINE82_tree=null;
        Object TAB83_tree=null;
        Object char_literal84_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:141:2: ( ( TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:141:4: ( TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:141:4: ( TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:141:5: TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}'
            {
            TAB73=(Token)match(input,TAB,FOLLOW_TAB_in_constraints677);
            string_literal74=(Token)match(input,30,FOLLOW_30_in_constraints680);
            string_literal74_tree = (Object)adaptor.create(string_literal74);
            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);

            WS75=(Token)match(input,WS,FOLLOW_WS_in_constraints683);
            char_literal76=(Token)match(input,26,FOLLOW_26_in_constraints686);
            NEWLINE77=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_constraints692);
            TAB78=(Token)match(input,TAB,FOLLOW_TAB_in_constraints698);
            TAB79=(Token)match(input,TAB,FOLLOW_TAB_in_constraints701);
            pushFollow(FOLLOW_constraintsdecl_in_constraints704);
            constraintsdecl80=constraintsdecl();

            state._fsp--;

            adaptor.addChild(root_0, constraintsdecl80.getTree());
            char_literal81=(Token)match(input,21,FOLLOW_21_in_constraints706);
            NEWLINE82=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_constraints712);
            TAB83=(Token)match(input,TAB,FOLLOW_TAB_in_constraints717);
            char_literal84=(Token)match(input,27,FOLLOW_27_in_constraints720);

            }


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
    // $ANTLR end "constraints"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff";
    static final String DFA5_eofS =
        "\2\2\2\uffff";
    static final String DFA5_minS =
        "\2\7\2\uffff";
    static final String DFA5_maxS =
        "\2\12\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\2\uffff\1\1",
            "\1\3\2\uffff\1\1",
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
            return "()* loopback of 112:15: ( ( NEWLINE )* specobject )*";
        }
    }


    public static final BitSet FOLLOW_set_in_shape0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_membervariableaccess327 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_membervariableaccess329 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_membervariableaccess332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variablesdecl345 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_variablesdecl348 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_variablesdecl351 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_shape_in_variablesdecl354 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_variablesdecl357 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_variablesdecl360 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_variablesdecl363 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_variablesdecl366 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_variablesdecl369 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_variablesdecl372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_membervariableaccess_in_expression383 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_OPERATOR_in_expression386 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_membervariableaccess_in_expression389 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_TAB_in_propertiesdecl402 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_propertiesdecl405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_PROPERTY_in_propertiesdecl408 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_propertiesdecl411 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_propertiesdecl414 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_propertiesdecl417 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_expression_in_propertiesdecl420 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_propertiesdecl422 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_propertiesdecl425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_constraintsdecl436 = new BitSet(new long[]{0x00000000028000C0L});
    public static final BitSet FOLLOW_constraintsdecl_in_constraintsdecl439 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_constraintsdecl441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OPERATOR_in_constraintsdecl444 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_constraintsdecl447 = new BitSet(new long[]{0x00000000028000C0L});
    public static final BitSet FOLLOW_constraintsdecl_in_constraintsdecl450 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_constraintsdecl452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_membervariableaccess_in_constraintsdecl458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constraintsdecl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_constraintsdecl468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_constraintsdecl473 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_constraintsdecl475 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_constraintsdecl481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specobject_in_specobjects496 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_NEWLINE_in_specobjects499 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_specobject_in_specobjects503 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_NEWLINE_in_specobjects508 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_specobject523 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_specobject526 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_specobject529 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_specobject532 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_specobject535 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_specobject540 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_variables_in_specobject546 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_specobject551 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_properties_in_specobject557 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_specobject562 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_constraints_in_specobject568 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_specobject573 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_specobject578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAB_in_variables592 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_variables595 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_variables598 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_variables601 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_variablesdecl_in_variables607 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_variables613 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_variables618 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_variables621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAB_in_properties634 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_properties637 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_properties640 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_properties643 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_properties649 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_propertiesdecl_in_properties655 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_properties661 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_properties664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAB_in_constraints677 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_constraints680 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_constraints683 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_constraints686 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_constraints692 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_constraints698 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_constraints701 = new BitSet(new long[]{0x00000000028000C0L});
    public static final BitSet FOLLOW_constraintsdecl_in_constraints704 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_constraints706 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_constraints712 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_constraints717 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_constraints720 = new BitSet(new long[]{0x0000000000000002L});

}