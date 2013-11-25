// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g 2013-11-25 12:59:39
 package symbolraetsel_AST_Normalisiert.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SymbolraetselASTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "LETTER", "EQUALS", "SPACE", "LINEBREAK"
    };
    public static final int EOF=-1;
    public static final int PLUS=4;
    public static final int MINUS=5;
    public static final int LETTER=6;
    public static final int EQUALS=7;
    public static final int SPACE=8;
    public static final int LINEBREAK=9;

    // delegates
    // delegators


        public SymbolraetselASTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SymbolraetselASTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SymbolraetselASTParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:19:1: start : c00= LETTER c01= arith c02= LETTER c03= EQUALS c04= LETTER a00= arith a02= arith a03= arith c10= LETTER c11= arith c12= LETTER c13= EQUALS c14= LETTER e00= EQUALS e02= EQUALS e04= EQUALS c20= LETTER c21= arith c22= LETTER c23= EQUALS c24= LETTER EOF -> ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24) ;
    public final SymbolraetselASTParser.start_return start() throws RecognitionException {
        SymbolraetselASTParser.start_return retval = new SymbolraetselASTParser.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c00=null;
        Token c02=null;
        Token c03=null;
        Token c04=null;
        Token c10=null;
        Token c12=null;
        Token c13=null;
        Token c14=null;
        Token e00=null;
        Token e02=null;
        Token e04=null;
        Token c20=null;
        Token c22=null;
        Token c23=null;
        Token c24=null;
        Token EOF1=null;
        SymbolraetselASTParser.arith_return c01 = null;

        SymbolraetselASTParser.arith_return a00 = null;

        SymbolraetselASTParser.arith_return a02 = null;

        SymbolraetselASTParser.arith_return a03 = null;

        SymbolraetselASTParser.arith_return c11 = null;

        SymbolraetselASTParser.arith_return c21 = null;


        CommonTree c00_tree=null;
        CommonTree c02_tree=null;
        CommonTree c03_tree=null;
        CommonTree c04_tree=null;
        CommonTree c10_tree=null;
        CommonTree c12_tree=null;
        CommonTree c13_tree=null;
        CommonTree c14_tree=null;
        CommonTree e00_tree=null;
        CommonTree e02_tree=null;
        CommonTree e04_tree=null;
        CommonTree c20_tree=null;
        CommonTree c22_tree=null;
        CommonTree c23_tree=null;
        CommonTree c24_tree=null;
        CommonTree EOF1_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_LETTER=new RewriteRuleTokenStream(adaptor,"token LETTER");
        RewriteRuleSubtreeStream stream_arith=new RewriteRuleSubtreeStream(adaptor,"rule arith");
        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:19:6: (c00= LETTER c01= arith c02= LETTER c03= EQUALS c04= LETTER a00= arith a02= arith a03= arith c10= LETTER c11= arith c12= LETTER c13= EQUALS c14= LETTER e00= EQUALS e02= EQUALS e04= EQUALS c20= LETTER c21= arith c22= LETTER c23= EQUALS c24= LETTER EOF -> ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:19:8: c00= LETTER c01= arith c02= LETTER c03= EQUALS c04= LETTER a00= arith a02= arith a03= arith c10= LETTER c11= arith c12= LETTER c13= EQUALS c14= LETTER e00= EQUALS e02= EQUALS e04= EQUALS c20= LETTER c21= arith c22= LETTER c23= EQUALS c24= LETTER EOF
            {
            c00=(Token)match(input,LETTER,FOLLOW_LETTER_in_start64);  
            stream_LETTER.add(c00);

            pushFollow(FOLLOW_arith_in_start68);
            c01=arith();

            state._fsp--;

            stream_arith.add(c01.getTree());
            c02=(Token)match(input,LETTER,FOLLOW_LETTER_in_start72);  
            stream_LETTER.add(c02);

            c03=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start76);  
            stream_EQUALS.add(c03);

            c04=(Token)match(input,LETTER,FOLLOW_LETTER_in_start80);  
            stream_LETTER.add(c04);

            pushFollow(FOLLOW_arith_in_start85);
            a00=arith();

            state._fsp--;

            stream_arith.add(a00.getTree());
            pushFollow(FOLLOW_arith_in_start90);
            a02=arith();

            state._fsp--;

            stream_arith.add(a02.getTree());
            pushFollow(FOLLOW_arith_in_start100);
            a03=arith();

            state._fsp--;

            stream_arith.add(a03.getTree());
            c10=(Token)match(input,LETTER,FOLLOW_LETTER_in_start105);  
            stream_LETTER.add(c10);

            pushFollow(FOLLOW_arith_in_start109);
            c11=arith();

            state._fsp--;

            stream_arith.add(c11.getTree());
            c12=(Token)match(input,LETTER,FOLLOW_LETTER_in_start114);  
            stream_LETTER.add(c12);

            c13=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start118);  
            stream_EQUALS.add(c13);

            c14=(Token)match(input,LETTER,FOLLOW_LETTER_in_start122);  
            stream_LETTER.add(c14);

            e00=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start127);  
            stream_EQUALS.add(e00);

            e02=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start132);  
            stream_EQUALS.add(e02);

            e04=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start137);  
            stream_EQUALS.add(e04);

            c20=(Token)match(input,LETTER,FOLLOW_LETTER_in_start142);  
            stream_LETTER.add(c20);

            pushFollow(FOLLOW_arith_in_start146);
            c21=arith();

            state._fsp--;

            stream_arith.add(c21.getTree());
            c22=(Token)match(input,LETTER,FOLLOW_LETTER_in_start150);  
            stream_LETTER.add(c22);

            c23=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start154);  
            stream_EQUALS.add(c23);

            c24=(Token)match(input,LETTER,FOLLOW_LETTER_in_start158);  
            stream_LETTER.add(c24);

            EOF1=(Token)match(input,EOF,FOLLOW_EOF_in_start160);  
            stream_EOF.add(EOF1);



            // AST REWRITE
            // elements: c24, c00, c02, c01, c20, a02, c10, c11, c00, c03, c23, c12, e02, c04, c21, a00, c13, c04, c14, c20, c14, e00, c24, c10, c22, c22, c02, e04, a03, c12
            // token labels: e04, e00, e02, c22, c04, c03, c02, c20, c10, c00, c13, c12, c24, c23, c14
            // rule labels: a00, retval, a02, a03, c21, c11, c01
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_e04=new RewriteRuleTokenStream(adaptor,"token e04",e04);
            RewriteRuleTokenStream stream_e00=new RewriteRuleTokenStream(adaptor,"token e00",e00);
            RewriteRuleTokenStream stream_e02=new RewriteRuleTokenStream(adaptor,"token e02",e02);
            RewriteRuleTokenStream stream_c22=new RewriteRuleTokenStream(adaptor,"token c22",c22);
            RewriteRuleTokenStream stream_c04=new RewriteRuleTokenStream(adaptor,"token c04",c04);
            RewriteRuleTokenStream stream_c03=new RewriteRuleTokenStream(adaptor,"token c03",c03);
            RewriteRuleTokenStream stream_c02=new RewriteRuleTokenStream(adaptor,"token c02",c02);
            RewriteRuleTokenStream stream_c20=new RewriteRuleTokenStream(adaptor,"token c20",c20);
            RewriteRuleTokenStream stream_c10=new RewriteRuleTokenStream(adaptor,"token c10",c10);
            RewriteRuleTokenStream stream_c00=new RewriteRuleTokenStream(adaptor,"token c00",c00);
            RewriteRuleTokenStream stream_c13=new RewriteRuleTokenStream(adaptor,"token c13",c13);
            RewriteRuleTokenStream stream_c12=new RewriteRuleTokenStream(adaptor,"token c12",c12);
            RewriteRuleTokenStream stream_c24=new RewriteRuleTokenStream(adaptor,"token c24",c24);
            RewriteRuleTokenStream stream_c23=new RewriteRuleTokenStream(adaptor,"token c23",c23);
            RewriteRuleTokenStream stream_c14=new RewriteRuleTokenStream(adaptor,"token c14",c14);
            RewriteRuleSubtreeStream stream_a00=new RewriteRuleSubtreeStream(adaptor,"rule a00",a00!=null?a00.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a02=new RewriteRuleSubtreeStream(adaptor,"rule a02",a02!=null?a02.tree:null);
            RewriteRuleSubtreeStream stream_a03=new RewriteRuleSubtreeStream(adaptor,"rule a03",a03!=null?a03.tree:null);
            RewriteRuleSubtreeStream stream_c21=new RewriteRuleSubtreeStream(adaptor,"rule c21",c21!=null?c21.tree:null);
            RewriteRuleSubtreeStream stream_c11=new RewriteRuleSubtreeStream(adaptor,"rule c11",c11!=null?c11.tree:null);
            RewriteRuleSubtreeStream stream_c01=new RewriteRuleSubtreeStream(adaptor,"rule c01",c01!=null?c01.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 24:2: -> ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24)
            {
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:25:2: ^( $c03 ^( $c01 $c00 $c02) $c04)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_c03.nextNode(), root_1);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:25:9: ^( $c01 $c00 $c02)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_c01.nextNode(), root_2);

                adaptor.addChild(root_2, stream_c00.nextNode());
                adaptor.addChild(root_2, stream_c02.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_c04.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:26:2: ^( $c13 ^( $c11 $c10 $c12) $c14)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_c13.nextNode(), root_1);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:26:9: ^( $c11 $c10 $c12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_c11.nextNode(), root_2);

                adaptor.addChild(root_2, stream_c10.nextNode());
                adaptor.addChild(root_2, stream_c12.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_c14.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:27:2: ^( $c23 ^( $c21 $c20 $c22) $c24)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_c23.nextNode(), root_1);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:27:9: ^( $c21 $c20 $c22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_c21.nextNode(), root_2);

                adaptor.addChild(root_2, stream_c20.nextNode());
                adaptor.addChild(root_2, stream_c22.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_c24.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:29:2: ^( $e00 ^( $a00 $c00 $c10) $c20)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e00.nextNode(), root_1);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:29:9: ^( $a00 $c00 $c10)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_a00.nextNode(), root_2);

                adaptor.addChild(root_2, stream_c00.nextNode());
                adaptor.addChild(root_2, stream_c10.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_c20.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:30:2: ^( $e02 ^( $a02 $c02 $c12) $c22)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e02.nextNode(), root_1);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:30:9: ^( $a02 $c02 $c12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_a02.nextNode(), root_2);

                adaptor.addChild(root_2, stream_c02.nextNode());
                adaptor.addChild(root_2, stream_c12.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_c22.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:31:2: ^( $e04 ^( $a03 $c04 $c14) $c24)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e04.nextNode(), root_1);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:31:9: ^( $a03 $c04 $c14)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_a03.nextNode(), root_2);

                adaptor.addChild(root_2, stream_c04.nextNode());
                adaptor.addChild(root_2, stream_c14.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_c24.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class arith_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:37:1: arith : ( PLUS | MINUS );
    public final SymbolraetselASTParser.arith_return arith() throws RecognitionException {
        SymbolraetselASTParser.arith_return retval = new SymbolraetselASTParser.arith_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:37:6: ( PLUS | MINUS )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set2=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set2));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arith"

    // Delegated rules


 

    public static final BitSet FOLLOW_LETTER_in_start64 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start68 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start72 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start76 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start80 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start85 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start90 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start100 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start105 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start114 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start118 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start127 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start132 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start137 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start142 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start150 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_arith0 = new BitSet(new long[]{0x0000000000000002L});

}