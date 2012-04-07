// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g 2012-04-07 03:35:41
package parsers;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class specParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OPERATOR", "PROPERTY", "INT", "ID", "WS", "TAB", "NEWLINE", "'.'", "','", "';'", "'='", "'('", "')'", "'\\\"'", "'{'", "'}'", "'variables'", "'properties'", "'constraints'"
    };
    public static final int T__22=22;
    public static final int OPERATOR=4;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int TAB=9;
    public static final int INT=6;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int WS=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int NEWLINE=10;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int PROPERTY=5;
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


    public static class membervariableaccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "membervariableaccess"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:78:1: membervariableaccess : ( ID '.' ID ) ;
    public final specParser.membervariableaccess_return membervariableaccess() throws RecognitionException {
        specParser.membervariableaccess_return retval = new specParser.membervariableaccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID1=null;
        Token char_literal2=null;
        Token ID3=null;

        Object ID1_tree=null;
        Object char_literal2_tree=null;
        Object ID3_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:79:2: ( ( ID '.' ID ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:79:4: ( ID '.' ID )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:79:4: ( ID '.' ID )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:79:5: ID '.' ID
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_membervariableaccess282);
            ID1_tree = (Object)adaptor.create(ID1);
            adaptor.addChild(root_0, ID1_tree);

            char_literal2=(Token)match(input,11,FOLLOW_11_in_membervariableaccess284);
            char_literal2_tree = (Object)adaptor.create(char_literal2);
            root_0 = (Object)adaptor.becomeRoot(char_literal2_tree, root_0);

            ID3=(Token)match(input,ID,FOLLOW_ID_in_membervariableaccess287);
            ID3_tree = (Object)adaptor.create(ID3);
            adaptor.addChild(root_0, ID3_tree);


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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:82:1: variablesdecl : ( NEWLINE TAB TAB ID WS ID ( ',' WS ID )* ';' ) ;
    public final specParser.variablesdecl_return variablesdecl() throws RecognitionException {
        specParser.variablesdecl_return retval = new specParser.variablesdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE4=null;
        Token TAB5=null;
        Token TAB6=null;
        Token ID7=null;
        Token WS8=null;
        Token ID9=null;
        Token char_literal10=null;
        Token WS11=null;
        Token ID12=null;
        Token char_literal13=null;

        Object NEWLINE4_tree=null;
        Object TAB5_tree=null;
        Object TAB6_tree=null;
        Object ID7_tree=null;
        Object WS8_tree=null;
        Object ID9_tree=null;
        Object char_literal10_tree=null;
        Object WS11_tree=null;
        Object ID12_tree=null;
        Object char_literal13_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:83:2: ( ( NEWLINE TAB TAB ID WS ID ( ',' WS ID )* ';' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:83:4: ( NEWLINE TAB TAB ID WS ID ( ',' WS ID )* ';' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:83:4: ( NEWLINE TAB TAB ID WS ID ( ',' WS ID )* ';' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:83:5: NEWLINE TAB TAB ID WS ID ( ',' WS ID )* ';'
            {
            NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variablesdecl300);
            TAB5=(Token)match(input,TAB,FOLLOW_TAB_in_variablesdecl303);
            TAB6=(Token)match(input,TAB,FOLLOW_TAB_in_variablesdecl306);
            ID7=(Token)match(input,ID,FOLLOW_ID_in_variablesdecl309);
            ID7_tree = (Object)adaptor.create(ID7);
            root_0 = (Object)adaptor.becomeRoot(ID7_tree, root_0);

            WS8=(Token)match(input,WS,FOLLOW_WS_in_variablesdecl312);
            ID9=(Token)match(input,ID,FOLLOW_ID_in_variablesdecl315);
            ID9_tree = (Object)adaptor.create(ID9);
            adaptor.addChild(root_0, ID9_tree);

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:83:35: ( ',' WS ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:83:36: ',' WS ID
            	    {
            	    char_literal10=(Token)match(input,12,FOLLOW_12_in_variablesdecl318);
            	    WS11=(Token)match(input,WS,FOLLOW_WS_in_variablesdecl321);
            	    ID12=(Token)match(input,ID,FOLLOW_ID_in_variablesdecl324);
            	    ID12_tree = (Object)adaptor.create(ID12);
            	    adaptor.addChild(root_0, ID12_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal13=(Token)match(input,13,FOLLOW_13_in_variablesdecl327);

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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:85:1: expression : membervariableaccess ( OPERATOR membervariableaccess )* ;
    public final specParser.expression_return expression() throws RecognitionException {
        specParser.expression_return retval = new specParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERATOR15=null;
        specParser.membervariableaccess_return membervariableaccess14 = null;

        specParser.membervariableaccess_return membervariableaccess16 = null;


        Object OPERATOR15_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:86:2: ( membervariableaccess ( OPERATOR membervariableaccess )* )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:86:4: membervariableaccess ( OPERATOR membervariableaccess )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_membervariableaccess_in_expression338);
            membervariableaccess14=membervariableaccess();

            state._fsp--;

            adaptor.addChild(root_0, membervariableaccess14.getTree());
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:86:25: ( OPERATOR membervariableaccess )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OPERATOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:86:26: OPERATOR membervariableaccess
            	    {
            	    OPERATOR15=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_expression341);
            	    OPERATOR15_tree = (Object)adaptor.create(OPERATOR15);
            	    root_0 = (Object)adaptor.becomeRoot(OPERATOR15_tree, root_0);

            	    pushFollow(FOLLOW_membervariableaccess_in_expression344);
            	    membervariableaccess16=membervariableaccess();

            	    state._fsp--;

            	    adaptor.addChild(root_0, membervariableaccess16.getTree());

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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:88:1: propertiesdecl : ( TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE ) ;
    public final specParser.propertiesdecl_return propertiesdecl() throws RecognitionException {
        specParser.propertiesdecl_return retval = new specParser.propertiesdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAB17=null;
        Token TAB18=null;
        Token PROPERTY19=null;
        Token WS20=null;
        Token char_literal21=null;
        Token WS22=null;
        Token char_literal24=null;
        Token NEWLINE25=null;
        specParser.expression_return expression23 = null;


        Object TAB17_tree=null;
        Object TAB18_tree=null;
        Object PROPERTY19_tree=null;
        Object WS20_tree=null;
        Object char_literal21_tree=null;
        Object WS22_tree=null;
        Object char_literal24_tree=null;
        Object NEWLINE25_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:89:2: ( ( TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:89:4: ( TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:89:4: ( TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:89:5: TAB TAB PROPERTY WS '=' WS expression ';' NEWLINE
            {
            TAB17=(Token)match(input,TAB,FOLLOW_TAB_in_propertiesdecl357);
            TAB18=(Token)match(input,TAB,FOLLOW_TAB_in_propertiesdecl360);
            PROPERTY19=(Token)match(input,PROPERTY,FOLLOW_PROPERTY_in_propertiesdecl363);
            PROPERTY19_tree = (Object)adaptor.create(PROPERTY19);
            root_0 = (Object)adaptor.becomeRoot(PROPERTY19_tree, root_0);

            WS20=(Token)match(input,WS,FOLLOW_WS_in_propertiesdecl366);
            char_literal21=(Token)match(input,14,FOLLOW_14_in_propertiesdecl369);
            WS22=(Token)match(input,WS,FOLLOW_WS_in_propertiesdecl372);
            pushFollow(FOLLOW_expression_in_propertiesdecl375);
            expression23=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression23.getTree());
            char_literal24=(Token)match(input,13,FOLLOW_13_in_propertiesdecl377);
            NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_propertiesdecl380);

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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:91:1: constraintsdecl : ( '(' constraintsdecl WS OPERATOR WS constraintsdecl ')' | membervariableaccess | ID | INT | '\\\"' ( ID | INT ) '\\\"' );
    public final specParser.constraintsdecl_return constraintsdecl() throws RecognitionException {
        specParser.constraintsdecl_return retval = new specParser.constraintsdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        Token WS28=null;
        Token OPERATOR29=null;
        Token WS30=null;
        Token char_literal32=null;
        Token ID34=null;
        Token INT35=null;
        Token char_literal36=null;
        Token set37=null;
        Token char_literal38=null;
        specParser.constraintsdecl_return constraintsdecl27 = null;

        specParser.constraintsdecl_return constraintsdecl31 = null;

        specParser.membervariableaccess_return membervariableaccess33 = null;


        Object char_literal26_tree=null;
        Object WS28_tree=null;
        Object OPERATOR29_tree=null;
        Object WS30_tree=null;
        Object char_literal32_tree=null;
        Object ID34_tree=null;
        Object INT35_tree=null;
        Object char_literal36_tree=null;
        Object set37_tree=null;
        Object char_literal38_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:92:2: ( '(' constraintsdecl WS OPERATOR WS constraintsdecl ')' | membervariableaccess | ID | INT | '\\\"' ( ID | INT ) '\\\"' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==11) ) {
                    alt3=2;
                }
                else if ( (LA3_2==WS||LA3_2==13||LA3_2==16) ) {
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
            case 17:
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
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:92:4: '(' constraintsdecl WS OPERATOR WS constraintsdecl ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)match(input,15,FOLLOW_15_in_constraintsdecl391);
                    pushFollow(FOLLOW_constraintsdecl_in_constraintsdecl394);
                    constraintsdecl27=constraintsdecl();

                    state._fsp--;

                    adaptor.addChild(root_0, constraintsdecl27.getTree());
                    WS28=(Token)match(input,WS,FOLLOW_WS_in_constraintsdecl396);
                    OPERATOR29=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_constraintsdecl399);
                    OPERATOR29_tree = (Object)adaptor.create(OPERATOR29);
                    root_0 = (Object)adaptor.becomeRoot(OPERATOR29_tree, root_0);

                    WS30=(Token)match(input,WS,FOLLOW_WS_in_constraintsdecl402);
                    pushFollow(FOLLOW_constraintsdecl_in_constraintsdecl405);
                    constraintsdecl31=constraintsdecl();

                    state._fsp--;

                    adaptor.addChild(root_0, constraintsdecl31.getTree());
                    char_literal32=(Token)match(input,16,FOLLOW_16_in_constraintsdecl407);

                    }
                    break;
                case 2 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:93:4: membervariableaccess
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_membervariableaccess_in_constraintsdecl413);
                    membervariableaccess33=membervariableaccess();

                    state._fsp--;

                    adaptor.addChild(root_0, membervariableaccess33.getTree());

                    }
                    break;
                case 3 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:94:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID34=(Token)match(input,ID,FOLLOW_ID_in_constraintsdecl418);
                    ID34_tree = (Object)adaptor.create(ID34);
                    adaptor.addChild(root_0, ID34_tree);


                    }
                    break;
                case 4 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:95:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT35=(Token)match(input,INT,FOLLOW_INT_in_constraintsdecl423);
                    INT35_tree = (Object)adaptor.create(INT35);
                    adaptor.addChild(root_0, INT35_tree);


                    }
                    break;
                case 5 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:96:4: '\\\"' ( ID | INT ) '\\\"'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal36=(Token)match(input,17,FOLLOW_17_in_constraintsdecl428);
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);

                    set37=(Token)input.LT(1);
                    if ( (input.LA(1)>=INT && input.LA(1)<=ID) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set37));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    char_literal38=(Token)match(input,17,FOLLOW_17_in_constraintsdecl436);
                    char_literal38_tree = (Object)adaptor.create(char_literal38);
                    adaptor.addChild(root_0, char_literal38_tree);


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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:101:1: specobjects : specobject ( ( NEWLINE )* specobject )* ( ( NEWLINE )* ) ;
    public final specParser.specobjects_return specobjects() throws RecognitionException {
        specParser.specobjects_return retval = new specParser.specobjects_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE40=null;
        Token NEWLINE42=null;
        specParser.specobject_return specobject39 = null;

        specParser.specobject_return specobject41 = null;


        Object NEWLINE40_tree=null;
        Object NEWLINE42_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:2: ( specobject ( ( NEWLINE )* specobject )* ( ( NEWLINE )* ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:4: specobject ( ( NEWLINE )* specobject )* ( ( NEWLINE )* )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_specobject_in_specobjects451);
            specobject39=specobject();

            state._fsp--;

            adaptor.addChild(root_0, specobject39.getTree());
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:15: ( ( NEWLINE )* specobject )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:16: ( NEWLINE )* specobject
            	    {
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:23: ( NEWLINE )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==NEWLINE) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:23: NEWLINE
            	    	    {
            	    	    NEWLINE40=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobjects454);

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_specobject_in_specobjects458);
            	    specobject41=specobject();

            	    state._fsp--;

            	    adaptor.addChild(root_0, specobject41.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:39: ( ( NEWLINE )* )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:40: ( NEWLINE )*
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:47: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:102:47: NEWLINE
            	    {
            	    NEWLINE42=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobjects463);

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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:105:1: specobject : ( ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}' ) ;
    public final specParser.specobject_return specobject() throws RecognitionException {
        specParser.specobject_return retval = new specParser.specobject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID43=null;
        Token WS44=null;
        Token char_literal45=null;
        Token WS46=null;
        Token char_literal47=null;
        Token NEWLINE48=null;
        Token NEWLINE50=null;
        Token NEWLINE52=null;
        Token NEWLINE54=null;
        Token char_literal55=null;
        specParser.variables_return variables49 = null;

        specParser.properties_return properties51 = null;

        specParser.constraints_return constraints53 = null;


        Object ID43_tree=null;
        Object WS44_tree=null;
        Object char_literal45_tree=null;
        Object WS46_tree=null;
        Object char_literal47_tree=null;
        Object NEWLINE48_tree=null;
        Object NEWLINE50_tree=null;
        Object NEWLINE52_tree=null;
        Object NEWLINE54_tree=null;
        Object char_literal55_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:106:2: ( ( ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:106:4: ( ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:106:4: ( ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:106:5: ID WS '=' WS '{' NEWLINE variables NEWLINE properties NEWLINE constraints NEWLINE '}'
            {
            ID43=(Token)match(input,ID,FOLLOW_ID_in_specobject478);
            ID43_tree = (Object)adaptor.create(ID43);
            root_0 = (Object)adaptor.becomeRoot(ID43_tree, root_0);

            WS44=(Token)match(input,WS,FOLLOW_WS_in_specobject481);
            char_literal45=(Token)match(input,14,FOLLOW_14_in_specobject484);
            WS46=(Token)match(input,WS,FOLLOW_WS_in_specobject487);
            char_literal47=(Token)match(input,18,FOLLOW_18_in_specobject490);
            NEWLINE48=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobject495);
            pushFollow(FOLLOW_variables_in_specobject501);
            variables49=variables();

            state._fsp--;

            adaptor.addChild(root_0, variables49.getTree());
            NEWLINE50=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobject506);
            pushFollow(FOLLOW_properties_in_specobject512);
            properties51=properties();

            state._fsp--;

            adaptor.addChild(root_0, properties51.getTree());
            NEWLINE52=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobject517);
            pushFollow(FOLLOW_constraints_in_specobject523);
            constraints53=constraints();

            state._fsp--;

            adaptor.addChild(root_0, constraints53.getTree());
            NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_specobject528);
            char_literal55=(Token)match(input,19,FOLLOW_19_in_specobject533);

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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:117:1: variables : ( TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}' ) ;
    public final specParser.variables_return variables() throws RecognitionException {
        specParser.variables_return retval = new specParser.variables_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAB56=null;
        Token string_literal57=null;
        Token WS58=null;
        Token char_literal59=null;
        Token NEWLINE61=null;
        Token TAB62=null;
        Token char_literal63=null;
        specParser.variablesdecl_return variablesdecl60 = null;


        Object TAB56_tree=null;
        Object string_literal57_tree=null;
        Object WS58_tree=null;
        Object char_literal59_tree=null;
        Object NEWLINE61_tree=null;
        Object TAB62_tree=null;
        Object char_literal63_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:118:2: ( ( TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:118:4: ( TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:118:4: ( TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:118:5: TAB 'variables' WS '{' ( variablesdecl )* NEWLINE TAB '}'
            {
            TAB56=(Token)match(input,TAB,FOLLOW_TAB_in_variables547);
            string_literal57=(Token)match(input,20,FOLLOW_20_in_variables550);
            string_literal57_tree = (Object)adaptor.create(string_literal57);
            root_0 = (Object)adaptor.becomeRoot(string_literal57_tree, root_0);

            WS58=(Token)match(input,WS,FOLLOW_WS_in_variables553);
            char_literal59=(Token)match(input,18,FOLLOW_18_in_variables556);
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:119:4: ( variablesdecl )*
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
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:119:4: variablesdecl
            	    {
            	    pushFollow(FOLLOW_variablesdecl_in_variables562);
            	    variablesdecl60=variablesdecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variablesdecl60.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            NEWLINE61=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variables568);
            TAB62=(Token)match(input,TAB,FOLLOW_TAB_in_variables573);
            char_literal63=(Token)match(input,19,FOLLOW_19_in_variables576);

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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:123:1: properties : ( TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}' ) ;
    public final specParser.properties_return properties() throws RecognitionException {
        specParser.properties_return retval = new specParser.properties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAB64=null;
        Token string_literal65=null;
        Token WS66=null;
        Token char_literal67=null;
        Token NEWLINE68=null;
        Token TAB70=null;
        Token char_literal71=null;
        specParser.propertiesdecl_return propertiesdecl69 = null;


        Object TAB64_tree=null;
        Object string_literal65_tree=null;
        Object WS66_tree=null;
        Object char_literal67_tree=null;
        Object NEWLINE68_tree=null;
        Object TAB70_tree=null;
        Object char_literal71_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:124:2: ( ( TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:124:4: ( TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:124:4: ( TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:124:5: TAB 'properties' WS '{' NEWLINE ( propertiesdecl )* TAB '}'
            {
            TAB64=(Token)match(input,TAB,FOLLOW_TAB_in_properties589);
            string_literal65=(Token)match(input,21,FOLLOW_21_in_properties592);
            string_literal65_tree = (Object)adaptor.create(string_literal65);
            root_0 = (Object)adaptor.becomeRoot(string_literal65_tree, root_0);

            WS66=(Token)match(input,WS,FOLLOW_WS_in_properties595);
            char_literal67=(Token)match(input,18,FOLLOW_18_in_properties598);
            NEWLINE68=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_properties604);
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:126:4: ( propertiesdecl )*
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
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:126:4: propertiesdecl
            	    {
            	    pushFollow(FOLLOW_propertiesdecl_in_properties610);
            	    propertiesdecl69=propertiesdecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, propertiesdecl69.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            TAB70=(Token)match(input,TAB,FOLLOW_TAB_in_properties616);
            char_literal71=(Token)match(input,19,FOLLOW_19_in_properties619);

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
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:130:1: constraints : ( TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}' ) ;
    public final specParser.constraints_return constraints() throws RecognitionException {
        specParser.constraints_return retval = new specParser.constraints_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAB72=null;
        Token string_literal73=null;
        Token WS74=null;
        Token char_literal75=null;
        Token NEWLINE76=null;
        Token TAB77=null;
        Token TAB78=null;
        Token char_literal80=null;
        Token NEWLINE81=null;
        Token TAB82=null;
        Token char_literal83=null;
        specParser.constraintsdecl_return constraintsdecl79 = null;


        Object TAB72_tree=null;
        Object string_literal73_tree=null;
        Object WS74_tree=null;
        Object char_literal75_tree=null;
        Object NEWLINE76_tree=null;
        Object TAB77_tree=null;
        Object TAB78_tree=null;
        Object char_literal80_tree=null;
        Object NEWLINE81_tree=null;
        Object TAB82_tree=null;
        Object char_literal83_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:131:2: ( ( TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}' ) )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:131:4: ( TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:131:4: ( TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:131:5: TAB 'constraints' WS '{' NEWLINE TAB TAB constraintsdecl ';' NEWLINE TAB '}'
            {
            TAB72=(Token)match(input,TAB,FOLLOW_TAB_in_constraints632);
            string_literal73=(Token)match(input,22,FOLLOW_22_in_constraints635);
            string_literal73_tree = (Object)adaptor.create(string_literal73);
            root_0 = (Object)adaptor.becomeRoot(string_literal73_tree, root_0);

            WS74=(Token)match(input,WS,FOLLOW_WS_in_constraints638);
            char_literal75=(Token)match(input,18,FOLLOW_18_in_constraints641);
            NEWLINE76=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_constraints647);
            TAB77=(Token)match(input,TAB,FOLLOW_TAB_in_constraints653);
            TAB78=(Token)match(input,TAB,FOLLOW_TAB_in_constraints656);
            pushFollow(FOLLOW_constraintsdecl_in_constraints659);
            constraintsdecl79=constraintsdecl();

            state._fsp--;

            adaptor.addChild(root_0, constraintsdecl79.getTree());
            char_literal80=(Token)match(input,13,FOLLOW_13_in_constraints661);
            NEWLINE81=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_constraints667);
            TAB82=(Token)match(input,TAB,FOLLOW_TAB_in_constraints672);
            char_literal83=(Token)match(input,19,FOLLOW_19_in_constraints675);

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
            return "()* loopback of 102:15: ( ( NEWLINE )* specobject )*";
        }
    }


    public static final BitSet FOLLOW_ID_in_membervariableaccess282 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_membervariableaccess284 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_membervariableaccess287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variablesdecl300 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_variablesdecl303 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_variablesdecl306 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_variablesdecl309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_variablesdecl312 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_variablesdecl315 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_variablesdecl318 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_variablesdecl321 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_variablesdecl324 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_variablesdecl327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_membervariableaccess_in_expression338 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_OPERATOR_in_expression341 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_membervariableaccess_in_expression344 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_TAB_in_propertiesdecl357 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_propertiesdecl360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_PROPERTY_in_propertiesdecl363 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_propertiesdecl366 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_propertiesdecl369 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_propertiesdecl372 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_expression_in_propertiesdecl375 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_propertiesdecl377 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_propertiesdecl380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_constraintsdecl391 = new BitSet(new long[]{0x00000000000280C0L});
    public static final BitSet FOLLOW_constraintsdecl_in_constraintsdecl394 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_constraintsdecl396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OPERATOR_in_constraintsdecl399 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_constraintsdecl402 = new BitSet(new long[]{0x00000000000280C0L});
    public static final BitSet FOLLOW_constraintsdecl_in_constraintsdecl405 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_constraintsdecl407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_membervariableaccess_in_constraintsdecl413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constraintsdecl418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_constraintsdecl423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_constraintsdecl428 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_constraintsdecl430 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_constraintsdecl436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specobject_in_specobjects451 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_NEWLINE_in_specobjects454 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_specobject_in_specobjects458 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_NEWLINE_in_specobjects463 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_specobject478 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_specobject481 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_specobject484 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_specobject487 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_specobject490 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_specobject495 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_variables_in_specobject501 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_specobject506 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_properties_in_specobject512 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_specobject517 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_constraints_in_specobject523 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_specobject528 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_specobject533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAB_in_variables547 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_variables550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_variables553 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_variables556 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_variablesdecl_in_variables562 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_variables568 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_variables573 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_variables576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAB_in_properties589 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_properties592 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_properties595 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_properties598 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_properties604 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_propertiesdecl_in_properties610 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_properties616 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_properties619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAB_in_constraints632 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_constraints635 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_constraints638 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_constraints641 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_constraints647 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_constraints653 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_constraints656 = new BitSet(new long[]{0x00000000000280C0L});
    public static final BitSet FOLLOW_constraintsdecl_in_constraints659 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_constraints661 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_constraints667 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAB_in_constraints672 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_constraints675 = new BitSet(new long[]{0x0000000000000002L});

}