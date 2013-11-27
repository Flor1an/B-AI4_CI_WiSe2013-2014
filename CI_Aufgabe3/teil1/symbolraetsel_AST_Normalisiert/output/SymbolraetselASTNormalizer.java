// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g 2013-11-27 12:40:51
 package symbolraetsel_AST_Normalisiert.output;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

public class SymbolraetselASTNormalizer extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "LETTER", "EQUALS", "SPACE", "LINEBREAK", "ADDITION"
    };
    public static final int EOF=-1;
    public static final int PLUS=4;
    public static final int MINUS=5;
    public static final int LETTER=6;
    public static final int EQUALS=7;
    public static final int SPACE=8;
    public static final int LINEBREAK=9;
    public static final int ADDITION=10;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "arith", "redraw", "start"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public SymbolraetselASTNormalizer(TreeNodeStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public SymbolraetselASTNormalizer(TreeNodeStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,input.getTreeAdaptor());
            setDebugListener(proxy);
            setTreeNodeStream(new DebugTreeNodeStream(input,proxy));
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
    public SymbolraetselASTNormalizer(TreeNodeStream input, DebugEventListener dbg) {
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


    public String[] getTokenNames() { return SymbolraetselASTNormalizer.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:18:1: start : ( redraw )+ ;
    public final SymbolraetselASTNormalizer.start_return start() throws RecognitionException {
        SymbolraetselASTNormalizer.start_return retval = new SymbolraetselASTNormalizer.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolraetselASTNormalizer.redraw_return redraw1 = null;



        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:18:7: ( ( redraw )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:18:9: ( redraw )+
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(18,9);
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:18:9: ( redraw )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==EQUALS) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:18:9: redraw
            	    {
            	    dbg.location(18,9);
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_redraw_in_start65);
            	    redraw1=redraw();

            	    state._fsp--;

            	    adaptor.addChild(root_0, redraw1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(18, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"

    public static class redraw_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "redraw"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:20:1: redraw : ( ^( EQUALS ^( PLUS a= LETTER b= LETTER ) c= LETTER ) -> ^( EQUALS ^( ADDITION $a $b) $c) | ^( EQUALS ^( MINUS a= LETTER b= LETTER ) c= LETTER ) -> ^( EQUALS ^( ADDITION $c $b) $a) );
    public final SymbolraetselASTNormalizer.redraw_return redraw() throws RecognitionException {
        SymbolraetselASTNormalizer.redraw_return retval = new SymbolraetselASTNormalizer.redraw_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree a=null;
        CommonTree b=null;
        CommonTree c=null;
        CommonTree EQUALS2=null;
        CommonTree PLUS3=null;
        CommonTree EQUALS4=null;
        CommonTree MINUS5=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree c_tree=null;
        CommonTree EQUALS2_tree=null;
        CommonTree PLUS3_tree=null;
        CommonTree EQUALS4_tree=null;
        CommonTree MINUS5_tree=null;
        RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleNodeStream stream_LETTER=new RewriteRuleNodeStream(adaptor,"token LETTER");

        try { dbg.enterRule(getGrammarFileName(), "redraw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 1);

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:20:7: ( ^( EQUALS ^( PLUS a= LETTER b= LETTER ) c= LETTER ) -> ^( EQUALS ^( ADDITION $a $b) $c) | ^( EQUALS ^( MINUS a= LETTER b= LETTER ) c= LETTER ) -> ^( EQUALS ^( ADDITION $c $b) $a) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==EQUALS) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==PLUS) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==MINUS) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:20:10: ^( EQUALS ^( PLUS a= LETTER b= LETTER ) c= LETTER )
                    {
                    dbg.location(20,10);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();dbg.location(20,12);
                    _last = (CommonTree)input.LT(1);
                    EQUALS2=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_redraw75);  
                    stream_EQUALS.add(EQUALS2);



                    match(input, Token.DOWN, null); 
                    dbg.location(20,19);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();dbg.location(20,21);
                    _last = (CommonTree)input.LT(1);
                    PLUS3=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_redraw78);  
                    stream_PLUS.add(PLUS3);



                    match(input, Token.DOWN, null); 
                    dbg.location(20,27);
                    _last = (CommonTree)input.LT(1);
                    a=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_redraw82);  
                    stream_LETTER.add(a);

                    dbg.location(20,36);
                    _last = (CommonTree)input.LT(1);
                    b=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_redraw86);  
                    stream_LETTER.add(b);


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    dbg.location(20,46);
                    _last = (CommonTree)input.LT(1);
                    c=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_redraw91);  
                    stream_LETTER.add(c);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a, EQUALS, b, c
                    // token labels: b, c, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_b=new RewriteRuleNodeStream(adaptor,"token b",b);
                    RewriteRuleNodeStream stream_c=new RewriteRuleNodeStream(adaptor,"token c",c);
                    RewriteRuleNodeStream stream_a=new RewriteRuleNodeStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 21:4: -> ^( EQUALS ^( ADDITION $a $b) $c)
                    {
                        dbg.location(21,7);
                        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:21:7: ^( EQUALS ^( ADDITION $a $b) $c)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(21,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_EQUALS.nextNode(), root_1);

                        dbg.location(21,16);
                        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:21:16: ^( ADDITION $a $b)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(21,18);
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADDITION, "ADDITION"), root_2);

                        dbg.location(21,27);
                        adaptor.addChild(root_2, stream_a.nextNode());
                        dbg.location(21,30);
                        adaptor.addChild(root_2, stream_b.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(21,34);
                        adaptor.addChild(root_1, stream_c.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:22:3: ^( EQUALS ^( MINUS a= LETTER b= LETTER ) c= LETTER )
                    {
                    dbg.location(22,3);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();dbg.location(22,5);
                    _last = (CommonTree)input.LT(1);
                    EQUALS4=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_redraw119);  
                    stream_EQUALS.add(EQUALS4);



                    match(input, Token.DOWN, null); 
                    dbg.location(22,12);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();dbg.location(22,14);
                    _last = (CommonTree)input.LT(1);
                    MINUS5=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_redraw122);  
                    stream_MINUS.add(MINUS5);



                    match(input, Token.DOWN, null); 
                    dbg.location(22,21);
                    _last = (CommonTree)input.LT(1);
                    a=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_redraw126);  
                    stream_LETTER.add(a);

                    dbg.location(22,30);
                    _last = (CommonTree)input.LT(1);
                    b=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_redraw130);  
                    stream_LETTER.add(b);


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    dbg.location(22,40);
                    _last = (CommonTree)input.LT(1);
                    c=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_redraw135);  
                    stream_LETTER.add(c);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: c, EQUALS, a, b
                    // token labels: b, c, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_b=new RewriteRuleNodeStream(adaptor,"token b",b);
                    RewriteRuleNodeStream stream_c=new RewriteRuleNodeStream(adaptor,"token c",c);
                    RewriteRuleNodeStream stream_a=new RewriteRuleNodeStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 23:3: -> ^( EQUALS ^( ADDITION $c $b) $a)
                    {
                        dbg.location(23,6);
                        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:23:6: ^( EQUALS ^( ADDITION $c $b) $a)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(23,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_EQUALS.nextNode(), root_1);

                        dbg.location(23,15);
                        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:23:15: ^( ADDITION $c $b)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(23,17);
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADDITION, "ADDITION"), root_2);

                        dbg.location(23,26);
                        adaptor.addChild(root_2, stream_c.nextNode());
                        dbg.location(23,29);
                        adaptor.addChild(root_2, stream_b.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(23,33);
                        adaptor.addChild(root_1, stream_a.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(23, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "redraw");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "redraw"

    public static class arith_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:25:1: arith : ( PLUS | MINUS );
    public final SymbolraetselASTNormalizer.arith_return arith() throws RecognitionException {
        SymbolraetselASTNormalizer.arith_return retval = new SymbolraetselASTNormalizer.arith_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set6=null;

        CommonTree set6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 1);

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:25:8: ( PLUS | MINUS )
            dbg.enterAlt(1);

            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselASTNormalizer.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(25,8);
            _last = (CommonTree)input.LT(1);
            set6=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();

                set6_tree = (CommonTree)adaptor.dupNode(set6);

                adaptor.addChild(root_0, set6_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(25, 22);

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


 

    public static final BitSet FOLLOW_redraw_in_start65 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_EQUALS_in_redraw75 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_redraw78 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_redraw82 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_redraw86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_redraw91 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_redraw119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_redraw122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_redraw126 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_redraw130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_redraw135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_arith0 = new BitSet(new long[]{0x0000000000000002L});

}