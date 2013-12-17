// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g 2013-12-17 18:43:04

package symbolraetsel_AST_Solver.grammar.output;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class SymbolraetselASTNormalizer extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "START", "EQUALS", "BLOCK", "SYMBOL", "PLUS", "MINUS", "NEWLINE", "WS", "ADDITION"
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
    public static final int ADDITION=12;

    // delegates
    // delegators


        public SymbolraetselASTNormalizer(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public SymbolraetselASTNormalizer(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SymbolraetselASTNormalizer.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:19:1: start : ^( START ( redraw )+ ) ;
    public final SymbolraetselASTNormalizer.start_return start() throws RecognitionException {
        SymbolraetselASTNormalizer.start_return retval = new SymbolraetselASTNormalizer.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree START1=null;
        SymbolraetselASTNormalizer.redraw_return redraw2 = null;


        CommonTree START1_tree=null;

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:19:7: ( ^( START ( redraw )+ ) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:19:9: ^( START ( redraw )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            START1=(CommonTree)match(input,START,FOLLOW_START_in_start69); 
            START1_tree = (CommonTree)adaptor.dupNode(START1);

            root_1 = (CommonTree)adaptor.becomeRoot(START1_tree, root_1);



            match(input, Token.DOWN, null); 
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:19:17: ( redraw )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==EQUALS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:19:17: redraw
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_redraw_in_start71);
            	    redraw2=redraw();

            	    state._fsp--;

            	    adaptor.addChild(root_1, redraw2.getTree());

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


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
        return retval;
    }
    // $ANTLR end "start"

    public static class redraw_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "redraw"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:21:1: redraw : ( ^( EQUALS ^( PLUS a= num b= num ) c= num ) -> ^( EQUALS ^( ADDITION $a $b) $c) | ^( EQUALS ^( MINUS a= num b= num ) c= num ) -> ^( EQUALS ^( ADDITION $c $b) $a) );
    public final SymbolraetselASTNormalizer.redraw_return redraw() throws RecognitionException {
        SymbolraetselASTNormalizer.redraw_return retval = new SymbolraetselASTNormalizer.redraw_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS3=null;
        CommonTree PLUS4=null;
        CommonTree EQUALS5=null;
        CommonTree MINUS6=null;
        SymbolraetselASTNormalizer.num_return a = null;

        SymbolraetselASTNormalizer.num_return b = null;

        SymbolraetselASTNormalizer.num_return c = null;


        CommonTree EQUALS3_tree=null;
        CommonTree PLUS4_tree=null;
        CommonTree EQUALS5_tree=null;
        CommonTree MINUS6_tree=null;
        RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_num=new RewriteRuleSubtreeStream(adaptor,"rule num");
        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:21:7: ( ^( EQUALS ^( PLUS a= num b= num ) c= num ) -> ^( EQUALS ^( ADDITION $a $b) $c) | ^( EQUALS ^( MINUS a= num b= num ) c= num ) -> ^( EQUALS ^( ADDITION $c $b) $a) )
            int alt2=2;
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

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:21:10: ^( EQUALS ^( PLUS a= num b= num ) c= num )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUALS3=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_redraw82);  
                    stream_EQUALS.add(EQUALS3);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS4=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_redraw85);  
                    stream_PLUS.add(PLUS4);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_num_in_redraw89);
                    a=num();

                    state._fsp--;

                    stream_num.add(a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_num_in_redraw93);
                    b=num();

                    state._fsp--;

                    stream_num.add(b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_num_in_redraw98);
                    c=num();

                    state._fsp--;

                    stream_num.add(c.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: c, EQUALS, a, b
                    // token labels: 
                    // rule labels: retval, b, c, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 22:4: -> ^( EQUALS ^( ADDITION $a $b) $c)
                    {
                        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:22:7: ^( EQUALS ^( ADDITION $a $b) $c)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_EQUALS.nextNode(), root_1);

                        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:22:16: ^( ADDITION $a $b)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADDITION, "ADDITION"), root_2);

                        adaptor.addChild(root_2, stream_a.nextTree());
                        adaptor.addChild(root_2, stream_b.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:23:3: ^( EQUALS ^( MINUS a= num b= num ) c= num )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUALS5=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_redraw126);  
                    stream_EQUALS.add(EQUALS5);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS6=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_redraw129);  
                    stream_MINUS.add(MINUS6);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_num_in_redraw133);
                    a=num();

                    state._fsp--;

                    stream_num.add(a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_num_in_redraw137);
                    b=num();

                    state._fsp--;

                    stream_num.add(b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_num_in_redraw142);
                    c=num();

                    state._fsp--;

                    stream_num.add(c.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: b, a, c, EQUALS
                    // token labels: 
                    // rule labels: retval, b, c, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 24:3: -> ^( EQUALS ^( ADDITION $c $b) $a)
                    {
                        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:24:6: ^( EQUALS ^( ADDITION $c $b) $a)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_EQUALS.nextNode(), root_1);

                        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:24:15: ^( ADDITION $c $b)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADDITION, "ADDITION"), root_2);

                        adaptor.addChild(root_2, stream_c.nextTree());
                        adaptor.addChild(root_2, stream_b.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_a.nextTree());

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
        return retval;
    }
    // $ANTLR end "redraw"

    public static class num_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "num"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:27:1: num : ^( BLOCK ( SYMBOL )+ ) ;
    public final SymbolraetselASTNormalizer.num_return num() throws RecognitionException {
        SymbolraetselASTNormalizer.num_return retval = new SymbolraetselASTNormalizer.num_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK7=null;
        CommonTree SYMBOL8=null;

        CommonTree BLOCK7_tree=null;
        CommonTree SYMBOL8_tree=null;

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:27:5: ( ^( BLOCK ( SYMBOL )+ ) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:27:7: ^( BLOCK ( SYMBOL )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            BLOCK7=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_num174); 
            BLOCK7_tree = (CommonTree)adaptor.dupNode(BLOCK7);

            root_1 = (CommonTree)adaptor.becomeRoot(BLOCK7_tree, root_1);



            match(input, Token.DOWN, null); 
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:27:15: ( SYMBOL )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==SYMBOL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTNormalizer.g:27:15: SYMBOL
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SYMBOL8=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_num176); 
            	    SYMBOL8_tree = (CommonTree)adaptor.dupNode(SYMBOL8);

            	    adaptor.addChild(root_1, SYMBOL8_tree);


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


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
        return retval;
    }
    // $ANTLR end "num"

    // Delegated rules


 

    public static final BitSet FOLLOW_START_in_start69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_redraw_in_start71 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_EQUALS_in_redraw82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_redraw85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_num_in_redraw89 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_num_in_redraw93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_num_in_redraw98 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_redraw126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_redraw129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_num_in_redraw133 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_num_in_redraw137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_num_in_redraw142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_num174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_num176 = new BitSet(new long[]{0x0000000000000088L});

}