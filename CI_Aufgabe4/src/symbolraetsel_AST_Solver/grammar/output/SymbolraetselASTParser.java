// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g 2013-12-16 17:15:54

package symbolraetsel_AST_Solver.grammar.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SymbolraetselASTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "START", "EQUALS", "BLOCK", "SYMBOL", "PLUS", "MINUS", "NEWLINE", "WS"
    };
    public static final int EOF=-1;
    public static final int START=4;
    public static final int EQUALS=5;
    public static final int BLOCK=6;
    public static final int SYMBOL=7;
    public static final int PLUS=8;
    public static final int MINUS=9;
    public static final int NEWLINE=10;
    public static final int WS=11;

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
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:24:1: start : c00= sym c01= arith c02= sym c03= EQUALS c04= sym a00= arith a02= arith a03= arith c10= sym c11= arith c12= sym c13= EQUALS c14= sym e00= EQUALS e02= EQUALS e04= EQUALS c20= sym c21= arith c22= sym c23= EQUALS c24= sym EOF -> ^( START ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24) ) ;
    public final SymbolraetselASTParser.start_return start() throws RecognitionException {
        SymbolraetselASTParser.start_return retval = new SymbolraetselASTParser.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c03=null;
        Token c13=null;
        Token e00=null;
        Token e02=null;
        Token e04=null;
        Token c23=null;
        Token EOF1=null;
        SymbolraetselASTParser.sym_return c00 = null;

        SymbolraetselASTParser.arith_return c01 = null;

        SymbolraetselASTParser.sym_return c02 = null;

        SymbolraetselASTParser.sym_return c04 = null;

        SymbolraetselASTParser.arith_return a00 = null;

        SymbolraetselASTParser.arith_return a02 = null;

        SymbolraetselASTParser.arith_return a03 = null;

        SymbolraetselASTParser.sym_return c10 = null;

        SymbolraetselASTParser.arith_return c11 = null;

        SymbolraetselASTParser.sym_return c12 = null;

        SymbolraetselASTParser.sym_return c14 = null;

        SymbolraetselASTParser.sym_return c20 = null;

        SymbolraetselASTParser.arith_return c21 = null;

        SymbolraetselASTParser.sym_return c22 = null;

        SymbolraetselASTParser.sym_return c24 = null;


        CommonTree c03_tree=null;
        CommonTree c13_tree=null;
        CommonTree e00_tree=null;
        CommonTree e02_tree=null;
        CommonTree e04_tree=null;
        CommonTree c23_tree=null;
        CommonTree EOF1_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_arith=new RewriteRuleSubtreeStream(adaptor,"rule arith");
        RewriteRuleSubtreeStream stream_sym=new RewriteRuleSubtreeStream(adaptor,"rule sym");
        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:24:6: (c00= sym c01= arith c02= sym c03= EQUALS c04= sym a00= arith a02= arith a03= arith c10= sym c11= arith c12= sym c13= EQUALS c14= sym e00= EQUALS e02= EQUALS e04= EQUALS c20= sym c21= arith c22= sym c23= EQUALS c24= sym EOF -> ^( START ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24) ) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:24:8: c00= sym c01= arith c02= sym c03= EQUALS c04= sym a00= arith a02= arith a03= arith c10= sym c11= arith c12= sym c13= EQUALS c14= sym e00= EQUALS e02= EQUALS e04= EQUALS c20= sym c21= arith c22= sym c23= EQUALS c24= sym EOF
            {
            pushFollow(FOLLOW_sym_in_start67);
            c00=sym();

            state._fsp--;

            stream_sym.add(c00.getTree());
            pushFollow(FOLLOW_arith_in_start71);
            c01=arith();

            state._fsp--;

            stream_arith.add(c01.getTree());
            pushFollow(FOLLOW_sym_in_start75);
            c02=sym();

            state._fsp--;

            stream_sym.add(c02.getTree());
            c03=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start79);  
            stream_EQUALS.add(c03);

            pushFollow(FOLLOW_sym_in_start83);
            c04=sym();

            state._fsp--;

            stream_sym.add(c04.getTree());
            pushFollow(FOLLOW_arith_in_start88);
            a00=arith();

            state._fsp--;

            stream_arith.add(a00.getTree());
            pushFollow(FOLLOW_arith_in_start93);
            a02=arith();

            state._fsp--;

            stream_arith.add(a02.getTree());
            pushFollow(FOLLOW_arith_in_start103);
            a03=arith();

            state._fsp--;

            stream_arith.add(a03.getTree());
            pushFollow(FOLLOW_sym_in_start108);
            c10=sym();

            state._fsp--;

            stream_sym.add(c10.getTree());
            pushFollow(FOLLOW_arith_in_start112);
            c11=arith();

            state._fsp--;

            stream_arith.add(c11.getTree());
            pushFollow(FOLLOW_sym_in_start117);
            c12=sym();

            state._fsp--;

            stream_sym.add(c12.getTree());
            c13=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start121);  
            stream_EQUALS.add(c13);

            pushFollow(FOLLOW_sym_in_start125);
            c14=sym();

            state._fsp--;

            stream_sym.add(c14.getTree());
            e00=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start130);  
            stream_EQUALS.add(e00);

            e02=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start135);  
            stream_EQUALS.add(e02);

            e04=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start140);  
            stream_EQUALS.add(e04);

            pushFollow(FOLLOW_sym_in_start145);
            c20=sym();

            state._fsp--;

            stream_sym.add(c20.getTree());
            pushFollow(FOLLOW_arith_in_start149);
            c21=arith();

            state._fsp--;

            stream_arith.add(c21.getTree());
            pushFollow(FOLLOW_sym_in_start153);
            c22=sym();

            state._fsp--;

            stream_sym.add(c22.getTree());
            c23=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start157);  
            stream_EQUALS.add(c23);

            pushFollow(FOLLOW_sym_in_start161);
            c24=sym();

            state._fsp--;

            stream_sym.add(c24.getTree());
            EOF1=(Token)match(input,EOF,FOLLOW_EOF_in_start163);  
            stream_EOF.add(EOF1);



            // AST REWRITE
            // elements: c12, c12, c04, a03, c02, e00, c03, c14, c10, c21, c00, c24, a00, c11, a02, e04, c14, c22, c04, c22, c20, c10, c13, c01, c00, e02, c24, c02, c20, c23
            // token labels: e04, c03, c13, e00, e02, c23
            // rule labels: retval, a00, a02, a03, c22, c04, c21, c20, c02, c11, c01, c10, c00, c12, c24, c14
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_e04=new RewriteRuleTokenStream(adaptor,"token e04",e04);
            RewriteRuleTokenStream stream_c03=new RewriteRuleTokenStream(adaptor,"token c03",c03);
            RewriteRuleTokenStream stream_c13=new RewriteRuleTokenStream(adaptor,"token c13",c13);
            RewriteRuleTokenStream stream_e00=new RewriteRuleTokenStream(adaptor,"token e00",e00);
            RewriteRuleTokenStream stream_e02=new RewriteRuleTokenStream(adaptor,"token e02",e02);
            RewriteRuleTokenStream stream_c23=new RewriteRuleTokenStream(adaptor,"token c23",c23);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a00=new RewriteRuleSubtreeStream(adaptor,"rule a00",a00!=null?a00.tree:null);
            RewriteRuleSubtreeStream stream_a02=new RewriteRuleSubtreeStream(adaptor,"rule a02",a02!=null?a02.tree:null);
            RewriteRuleSubtreeStream stream_a03=new RewriteRuleSubtreeStream(adaptor,"rule a03",a03!=null?a03.tree:null);
            RewriteRuleSubtreeStream stream_c22=new RewriteRuleSubtreeStream(adaptor,"rule c22",c22!=null?c22.tree:null);
            RewriteRuleSubtreeStream stream_c04=new RewriteRuleSubtreeStream(adaptor,"rule c04",c04!=null?c04.tree:null);
            RewriteRuleSubtreeStream stream_c21=new RewriteRuleSubtreeStream(adaptor,"rule c21",c21!=null?c21.tree:null);
            RewriteRuleSubtreeStream stream_c20=new RewriteRuleSubtreeStream(adaptor,"rule c20",c20!=null?c20.tree:null);
            RewriteRuleSubtreeStream stream_c02=new RewriteRuleSubtreeStream(adaptor,"rule c02",c02!=null?c02.tree:null);
            RewriteRuleSubtreeStream stream_c11=new RewriteRuleSubtreeStream(adaptor,"rule c11",c11!=null?c11.tree:null);
            RewriteRuleSubtreeStream stream_c01=new RewriteRuleSubtreeStream(adaptor,"rule c01",c01!=null?c01.tree:null);
            RewriteRuleSubtreeStream stream_c10=new RewriteRuleSubtreeStream(adaptor,"rule c10",c10!=null?c10.tree:null);
            RewriteRuleSubtreeStream stream_c00=new RewriteRuleSubtreeStream(adaptor,"rule c00",c00!=null?c00.tree:null);
            RewriteRuleSubtreeStream stream_c12=new RewriteRuleSubtreeStream(adaptor,"rule c12",c12!=null?c12.tree:null);
            RewriteRuleSubtreeStream stream_c24=new RewriteRuleSubtreeStream(adaptor,"rule c24",c24!=null?c24.tree:null);
            RewriteRuleSubtreeStream stream_c14=new RewriteRuleSubtreeStream(adaptor,"rule c14",c14!=null?c14.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 29:2: -> ^( START ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24) )
            {
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:30:2: ^( START ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(START, "START"), root_1);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:31:3: ^( $c03 ^( $c01 $c00 $c02) $c04)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_c03.nextNode(), root_2);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:31:10: ^( $c01 $c00 $c02)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_c01.nextNode(), root_3);

                adaptor.addChild(root_3, stream_c00.nextTree());
                adaptor.addChild(root_3, stream_c02.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_c04.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:32:3: ^( $c13 ^( $c11 $c10 $c12) $c14)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_c13.nextNode(), root_2);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:32:10: ^( $c11 $c10 $c12)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_c11.nextNode(), root_3);

                adaptor.addChild(root_3, stream_c10.nextTree());
                adaptor.addChild(root_3, stream_c12.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_c14.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:33:3: ^( $c23 ^( $c21 $c20 $c22) $c24)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_c23.nextNode(), root_2);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:33:10: ^( $c21 $c20 $c22)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_c21.nextNode(), root_3);

                adaptor.addChild(root_3, stream_c20.nextTree());
                adaptor.addChild(root_3, stream_c22.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_c24.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:35:3: ^( $e00 ^( $a00 $c00 $c10) $c20)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_e00.nextNode(), root_2);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:35:10: ^( $a00 $c00 $c10)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_a00.nextNode(), root_3);

                adaptor.addChild(root_3, stream_c00.nextTree());
                adaptor.addChild(root_3, stream_c10.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_c20.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:36:3: ^( $e02 ^( $a02 $c02 $c12) $c22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_e02.nextNode(), root_2);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:36:10: ^( $a02 $c02 $c12)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_a02.nextNode(), root_3);

                adaptor.addChild(root_3, stream_c02.nextTree());
                adaptor.addChild(root_3, stream_c12.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_c22.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:37:3: ^( $e04 ^( $a03 $c04 $c14) $c24)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_e04.nextNode(), root_2);

                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:37:10: ^( $a03 $c04 $c14)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_a03.nextNode(), root_3);

                adaptor.addChild(root_3, stream_c04.nextTree());
                adaptor.addChild(root_3, stream_c14.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_c24.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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

    public static class sym_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sym"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:41:1: sym : ( SYMBOL )+ -> ^( BLOCK ( SYMBOL )+ ) ;
    public final SymbolraetselASTParser.sym_return sym() throws RecognitionException {
        SymbolraetselASTParser.sym_return retval = new SymbolraetselASTParser.sym_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYMBOL2=null;

        CommonTree SYMBOL2_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:42:2: ( ( SYMBOL )+ -> ^( BLOCK ( SYMBOL )+ ) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:42:4: ( SYMBOL )+
            {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:42:4: ( SYMBOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SYMBOL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:42:4: SYMBOL
            	    {
            	    SYMBOL2=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_sym321);  
            	    stream_SYMBOL.add(SYMBOL2);


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



            // AST REWRITE
            // elements: SYMBOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 42:12: -> ^( BLOCK ( SYMBOL )+ )
            {
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:42:15: ^( BLOCK ( SYMBOL )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                if ( !(stream_SYMBOL.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_SYMBOL.hasNext() ) {
                    adaptor.addChild(root_1, stream_SYMBOL.nextNode());

                }
                stream_SYMBOL.reset();

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
    // $ANTLR end "sym"

    public static class arith_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:45:1: arith : ( PLUS | MINUS ) ;
    public final SymbolraetselASTParser.arith_return arith() throws RecognitionException {
        SymbolraetselASTParser.arith_return retval = new SymbolraetselASTParser.arith_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:45:6: ( ( PLUS | MINUS ) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:45:8: ( PLUS | MINUS )
            {
            root_0 = (CommonTree)adaptor.nil();

            set3=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set3));
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


 

    public static final BitSet FOLLOW_sym_in_start67 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_arith_in_start71 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_sym_in_start75 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start79 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_sym_in_start83 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_arith_in_start88 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_arith_in_start93 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_arith_in_start103 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_sym_in_start108 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_arith_in_start112 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_sym_in_start117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start121 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_sym_in_start125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start140 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_sym_in_start145 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_arith_in_start149 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_sym_in_start153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_start157 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_sym_in_start161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_sym321 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_arith340 = new BitSet(new long[]{0x0000000000000002L});

}