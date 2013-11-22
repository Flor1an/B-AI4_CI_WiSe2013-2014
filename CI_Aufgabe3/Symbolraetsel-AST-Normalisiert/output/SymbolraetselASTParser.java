// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g 2013-11-22 22:00:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class SymbolraetselASTParser extends DebugParser {
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "start", "arith"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public SymbolraetselASTParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public SymbolraetselASTParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public SymbolraetselASTParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return SymbolraetselASTParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:12:1: start : c00= LETTER c01= arith c02= LETTER c03= EQUALS c04= LETTER a00= arith a02= arith a03= arith c10= LETTER c11= arith c12= LETTER c13= EQUALS c14= LETTER e00= EQUALS e02= EQUALS e04= EQUALS c20= LETTER c21= arith c22= LETTER c23= EQUALS c24= LETTER -> ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24) ;
    public final SymbolraetselASTParser.start_return start() throws RecognitionException {
        SymbolraetselASTParser.start_return retval = new SymbolraetselASTParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

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
        SymbolraetselASTParser.arith_return c01 = null;

        SymbolraetselASTParser.arith_return a00 = null;

        SymbolraetselASTParser.arith_return a02 = null;

        SymbolraetselASTParser.arith_return a03 = null;

        SymbolraetselASTParser.arith_return c11 = null;

        SymbolraetselASTParser.arith_return c21 = null;


        Object c00_tree=null;
        Object c02_tree=null;
        Object c03_tree=null;
        Object c04_tree=null;
        Object c10_tree=null;
        Object c12_tree=null;
        Object c13_tree=null;
        Object c14_tree=null;
        Object e00_tree=null;
        Object e02_tree=null;
        Object e04_tree=null;
        Object c20_tree=null;
        Object c22_tree=null;
        Object c23_tree=null;
        Object c24_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_LETTER=new RewriteRuleTokenStream(adaptor,"token LETTER");
        RewriteRuleSubtreeStream stream_arith=new RewriteRuleSubtreeStream(adaptor,"rule arith");
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:12:6: (c00= LETTER c01= arith c02= LETTER c03= EQUALS c04= LETTER a00= arith a02= arith a03= arith c10= LETTER c11= arith c12= LETTER c13= EQUALS c14= LETTER e00= EQUALS e02= EQUALS e04= EQUALS c20= LETTER c21= arith c22= LETTER c23= EQUALS c24= LETTER -> ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24) )
            dbg.enterAlt(1);

            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:12:8: c00= LETTER c01= arith c02= LETTER c03= EQUALS c04= LETTER a00= arith a02= arith a03= arith c10= LETTER c11= arith c12= LETTER c13= EQUALS c14= LETTER e00= EQUALS e02= EQUALS e04= EQUALS c20= LETTER c21= arith c22= LETTER c23= EQUALS c24= LETTER
            {
            dbg.location(12,11);
            c00=(Token)match(input,LETTER,FOLLOW_LETTER_in_start38);  
            stream_LETTER.add(c00);

            dbg.location(12,22);
            pushFollow(FOLLOW_arith_in_start42);
            c01=arith();

            state._fsp--;

            stream_arith.add(c01.getTree());
            dbg.location(12,32);
            c02=(Token)match(input,LETTER,FOLLOW_LETTER_in_start46);  
            stream_LETTER.add(c02);

            dbg.location(12,43);
            c03=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start50);  
            stream_EQUALS.add(c03);

            dbg.location(12,54);
            c04=(Token)match(input,LETTER,FOLLOW_LETTER_in_start54);  
            stream_LETTER.add(c04);

            dbg.location(13,5);
            pushFollow(FOLLOW_arith_in_start59);
            a00=arith();

            state._fsp--;

            stream_arith.add(a00.getTree());
            dbg.location(13,16);
            pushFollow(FOLLOW_arith_in_start64);
            a02=arith();

            state._fsp--;

            stream_arith.add(a02.getTree());
            dbg.location(13,32);
            pushFollow(FOLLOW_arith_in_start74);
            a03=arith();

            state._fsp--;

            stream_arith.add(a03.getTree());
            dbg.location(14,5);
            c10=(Token)match(input,LETTER,FOLLOW_LETTER_in_start79);  
            stream_LETTER.add(c10);

            dbg.location(14,16);
            pushFollow(FOLLOW_arith_in_start83);
            c11=arith();

            state._fsp--;

            stream_arith.add(c11.getTree());
            dbg.location(14,27);
            c12=(Token)match(input,LETTER,FOLLOW_LETTER_in_start88);  
            stream_LETTER.add(c12);

            dbg.location(14,38);
            c13=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start92);  
            stream_EQUALS.add(c13);

            dbg.location(14,49);
            c14=(Token)match(input,LETTER,FOLLOW_LETTER_in_start96);  
            stream_LETTER.add(c14);

            dbg.location(15,5);
            e00=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start101);  
            stream_EQUALS.add(e00);

            dbg.location(15,17);
            e02=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start106);  
            stream_EQUALS.add(e02);

            dbg.location(15,29);
            e04=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start111);  
            stream_EQUALS.add(e04);

            dbg.location(16,5);
            c20=(Token)match(input,LETTER,FOLLOW_LETTER_in_start116);  
            stream_LETTER.add(c20);

            dbg.location(16,16);
            pushFollow(FOLLOW_arith_in_start120);
            c21=arith();

            state._fsp--;

            stream_arith.add(c21.getTree());
            dbg.location(16,26);
            c22=(Token)match(input,LETTER,FOLLOW_LETTER_in_start124);  
            stream_LETTER.add(c22);

            dbg.location(16,37);
            c23=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start128);  
            stream_EQUALS.add(c23);

            dbg.location(16,48);
            c24=(Token)match(input,LETTER,FOLLOW_LETTER_in_start132);  
            stream_LETTER.add(c24);



            // AST REWRITE
            // elements: c13, c24, c10, e00, a02, a00, c10, e02, c04, c23, c04, c20, c14, c03, c14, c12, c22, c00, c24, e04, c21, c12, c22, c02, c00, c11, c02, c01, c20, a03
            // token labels: e04, e00, e02, c04, c22, c03, c02, c20, c10, c00, c13, c12, c24, c23, c14
            // rule labels: a00, retval, a02, a03, c21, c11, c01
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_e04=new RewriteRuleTokenStream(adaptor,"token e04",e04);
            RewriteRuleTokenStream stream_e00=new RewriteRuleTokenStream(adaptor,"token e00",e00);
            RewriteRuleTokenStream stream_e02=new RewriteRuleTokenStream(adaptor,"token e02",e02);
            RewriteRuleTokenStream stream_c04=new RewriteRuleTokenStream(adaptor,"token c04",c04);
            RewriteRuleTokenStream stream_c22=new RewriteRuleTokenStream(adaptor,"token c22",c22);
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

            root_0 = (Object)adaptor.nil();
            // 17:2: -> ^( $c03 ^( $c01 $c00 $c02) $c04) ^( $c13 ^( $c11 $c10 $c12) $c14) ^( $c23 ^( $c21 $c20 $c22) $c24) ^( $e00 ^( $a00 $c00 $c10) $c20) ^( $e02 ^( $a02 $c02 $c12) $c22) ^( $e04 ^( $a03 $c04 $c14) $c24)
            {
                dbg.location(18,2);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:18:2: ^( $c03 ^( $c01 $c00 $c02) $c04)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(18,4);
                root_1 = (Object)adaptor.becomeRoot(stream_c03.nextNode(), root_1);

                dbg.location(18,9);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:18:9: ^( $c01 $c00 $c02)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(18,11);
                root_2 = (Object)adaptor.becomeRoot(stream_c01.nextNode(), root_2);

                dbg.location(18,16);
                adaptor.addChild(root_2, stream_c00.nextNode());
                dbg.location(18,21);
                adaptor.addChild(root_2, stream_c02.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(18,27);
                adaptor.addChild(root_1, stream_c04.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(19,2);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:19:2: ^( $c13 ^( $c11 $c10 $c12) $c14)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(19,4);
                root_1 = (Object)adaptor.becomeRoot(stream_c13.nextNode(), root_1);

                dbg.location(19,9);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:19:9: ^( $c11 $c10 $c12)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(19,11);
                root_2 = (Object)adaptor.becomeRoot(stream_c11.nextNode(), root_2);

                dbg.location(19,16);
                adaptor.addChild(root_2, stream_c10.nextNode());
                dbg.location(19,21);
                adaptor.addChild(root_2, stream_c12.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(19,27);
                adaptor.addChild(root_1, stream_c14.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(20,2);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:20:2: ^( $c23 ^( $c21 $c20 $c22) $c24)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(20,4);
                root_1 = (Object)adaptor.becomeRoot(stream_c23.nextNode(), root_1);

                dbg.location(20,9);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:20:9: ^( $c21 $c20 $c22)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(20,11);
                root_2 = (Object)adaptor.becomeRoot(stream_c21.nextNode(), root_2);

                dbg.location(20,16);
                adaptor.addChild(root_2, stream_c20.nextNode());
                dbg.location(20,21);
                adaptor.addChild(root_2, stream_c22.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(20,27);
                adaptor.addChild(root_1, stream_c24.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(22,2);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:22:2: ^( $e00 ^( $a00 $c00 $c10) $c20)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,4);
                root_1 = (Object)adaptor.becomeRoot(stream_e00.nextNode(), root_1);

                dbg.location(22,9);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:22:9: ^( $a00 $c00 $c10)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(22,11);
                root_2 = (Object)adaptor.becomeRoot(stream_a00.nextNode(), root_2);

                dbg.location(22,16);
                adaptor.addChild(root_2, stream_c00.nextNode());
                dbg.location(22,21);
                adaptor.addChild(root_2, stream_c10.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(22,27);
                adaptor.addChild(root_1, stream_c20.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(23,2);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:23:2: ^( $e02 ^( $a02 $c02 $c12) $c22)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(23,4);
                root_1 = (Object)adaptor.becomeRoot(stream_e02.nextNode(), root_1);

                dbg.location(23,9);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:23:9: ^( $a02 $c02 $c12)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(23,11);
                root_2 = (Object)adaptor.becomeRoot(stream_a02.nextNode(), root_2);

                dbg.location(23,16);
                adaptor.addChild(root_2, stream_c02.nextNode());
                dbg.location(23,21);
                adaptor.addChild(root_2, stream_c12.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(23,27);
                adaptor.addChild(root_1, stream_c22.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(24,2);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:24:2: ^( $e04 ^( $a03 $c04 $c14) $c24)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(24,4);
                root_1 = (Object)adaptor.becomeRoot(stream_e04.nextNode(), root_1);

                dbg.location(24,9);
                // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:24:9: ^( $a03 $c04 $c14)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(24,11);
                root_2 = (Object)adaptor.becomeRoot(stream_a03.nextNode(), root_2);

                dbg.location(24,16);
                adaptor.addChild(root_2, stream_c04.nextNode());
                dbg.location(24,21);
                adaptor.addChild(root_2, stream_c14.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(24,27);
                adaptor.addChild(root_1, stream_c24.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(24, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"

    public static class arith_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith"
    // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:30:1: arith : ( PLUS | MINUS );
    public final SymbolraetselASTParser.arith_return arith() throws RecognitionException {
        SymbolraetselASTParser.arith_return retval = new SymbolraetselASTParser.arith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set1=null;

        Object set1_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:30:6: ( PLUS | MINUS )
            dbg.enterAlt(1);

            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselAST.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(30,6);
            set1=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set1));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(30, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arith"

    // Delegated rules


 

    public static final BitSet FOLLOW_LETTER_in_start38 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start46 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start54 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start59 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start64 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start74 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start79 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start83 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start88 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start92 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start96 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start101 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start106 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start111 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start116 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_arith_in_start120 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start124 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_start132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_arith0 = new BitSet(new long[]{0x0000000000000002L});

}