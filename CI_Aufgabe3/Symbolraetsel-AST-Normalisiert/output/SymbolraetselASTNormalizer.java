// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g 2013-11-22 21:58:14

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class SymbolraetselASTNormalizer extends TreeParser {
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
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g"; }


    public static class start_return extends TreeRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:15:1: start : ( redraw )+ ;
    public final SymbolraetselASTNormalizer.start_return start() throws RecognitionException {
        SymbolraetselASTNormalizer.start_return retval = new SymbolraetselASTNormalizer.start_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Tree _first_0 = null;
        Tree _last = null;

        SymbolraetselASTNormalizer.redraw_return redraw1 = null;



        try {
            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:15:7: ( ( redraw )+ )
            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:15:9: ( redraw )+
            {
            root_0 = (Tree)adaptor.nil();

            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:15:9: ( redraw )+
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
            	    // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:15:9: redraw
            	    {
            	    _last = (Tree)input.LT(1);
            	    pushFollow(FOLLOW_redraw_in_start57);
            	    redraw1=redraw();

            	    state._fsp--;

            	    adaptor.addChild(root_0, redraw1.getTree());

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

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);

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
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "redraw"
    // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:17:1: redraw : ( ^( EQUALS ^( PLUS a= LETTER b= LETTER ) c= LETTER ) -> ^( EQUALS ^( ADDITION $a $b) $c) | ^( EQUALS ^( MINUS a= LETTER b= LETTER ) c= LETTER ) -> ^( EQUALS ^( ADDITION $c $b) $a) );
    public final SymbolraetselASTNormalizer.redraw_return redraw() throws RecognitionException {
        SymbolraetselASTNormalizer.redraw_return retval = new SymbolraetselASTNormalizer.redraw_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Tree _first_0 = null;
        Tree _last = null;

        Tree a=null;
        Tree b=null;
        Tree c=null;
        Tree EQUALS2=null;
        Tree PLUS3=null;
        Tree EQUALS4=null;
        Tree MINUS5=null;

        Tree a_tree=null;
        Tree b_tree=null;
        Tree c_tree=null;
        Tree EQUALS2_tree=null;
        Tree PLUS3_tree=null;
        Tree EQUALS4_tree=null;
        Tree MINUS5_tree=null;
        RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleNodeStream stream_LETTER=new RewriteRuleNodeStream(adaptor,"token LETTER");

        try {
            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:17:7: ( ^( EQUALS ^( PLUS a= LETTER b= LETTER ) c= LETTER ) -> ^( EQUALS ^( ADDITION $a $b) $c) | ^( EQUALS ^( MINUS a= LETTER b= LETTER ) c= LETTER ) -> ^( EQUALS ^( ADDITION $c $b) $a) )
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
                    // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:17:10: ^( EQUALS ^( PLUS a= LETTER b= LETTER ) c= LETTER )
                    {
                    _last = (Tree)input.LT(1);
                    {
                    Tree _save_last_1 = _last;
                    Tree _first_1 = null;
                    Tree root_1 = (Tree)adaptor.nil();_last = (Tree)input.LT(1);
                    EQUALS2=(Tree)match(input,EQUALS,FOLLOW_EQUALS_in_redraw67);  
                    stream_EQUALS.add(EQUALS2);



                    match(input, Token.DOWN, null); 
                    _last = (Tree)input.LT(1);
                    {
                    Tree _save_last_2 = _last;
                    Tree _first_2 = null;
                    Tree root_2 = (Tree)adaptor.nil();_last = (Tree)input.LT(1);
                    PLUS3=(Tree)match(input,PLUS,FOLLOW_PLUS_in_redraw70);  
                    stream_PLUS.add(PLUS3);



                    match(input, Token.DOWN, null); 
                    _last = (Tree)input.LT(1);
                    a=(Tree)match(input,LETTER,FOLLOW_LETTER_in_redraw74);  
                    stream_LETTER.add(a);

                    _last = (Tree)input.LT(1);
                    b=(Tree)match(input,LETTER,FOLLOW_LETTER_in_redraw78);  
                    stream_LETTER.add(b);


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Tree)input.LT(1);
                    c=(Tree)match(input,LETTER,FOLLOW_LETTER_in_redraw83);  
                    stream_LETTER.add(c);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: c, b, a, EQUALS
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

                    root_0 = (Tree)adaptor.nil();
                    // 18:4: -> ^( EQUALS ^( ADDITION $a $b) $c)
                    {
                        // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:18:7: ^( EQUALS ^( ADDITION $a $b) $c)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_EQUALS.nextNode(), root_1);

                        // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:18:16: ^( ADDITION $a $b)
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ADDITION, "ADDITION"), root_2);

                        adaptor.addChild(root_2, stream_a.nextNode());
                        adaptor.addChild(root_2, stream_b.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_c.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:19:3: ^( EQUALS ^( MINUS a= LETTER b= LETTER ) c= LETTER )
                    {
                    _last = (Tree)input.LT(1);
                    {
                    Tree _save_last_1 = _last;
                    Tree _first_1 = null;
                    Tree root_1 = (Tree)adaptor.nil();_last = (Tree)input.LT(1);
                    EQUALS4=(Tree)match(input,EQUALS,FOLLOW_EQUALS_in_redraw111);  
                    stream_EQUALS.add(EQUALS4);



                    match(input, Token.DOWN, null); 
                    _last = (Tree)input.LT(1);
                    {
                    Tree _save_last_2 = _last;
                    Tree _first_2 = null;
                    Tree root_2 = (Tree)adaptor.nil();_last = (Tree)input.LT(1);
                    MINUS5=(Tree)match(input,MINUS,FOLLOW_MINUS_in_redraw114);  
                    stream_MINUS.add(MINUS5);



                    match(input, Token.DOWN, null); 
                    _last = (Tree)input.LT(1);
                    a=(Tree)match(input,LETTER,FOLLOW_LETTER_in_redraw118);  
                    stream_LETTER.add(a);

                    _last = (Tree)input.LT(1);
                    b=(Tree)match(input,LETTER,FOLLOW_LETTER_in_redraw122);  
                    stream_LETTER.add(b);


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Tree)input.LT(1);
                    c=(Tree)match(input,LETTER,FOLLOW_LETTER_in_redraw127);  
                    stream_LETTER.add(c);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a, c, b, EQUALS
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

                    root_0 = (Tree)adaptor.nil();
                    // 20:3: -> ^( EQUALS ^( ADDITION $c $b) $a)
                    {
                        // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:20:6: ^( EQUALS ^( ADDITION $c $b) $a)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_EQUALS.nextNode(), root_1);

                        // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:20:15: ^( ADDITION $c $b)
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ADDITION, "ADDITION"), root_2);

                        adaptor.addChild(root_2, stream_c.nextNode());
                        adaptor.addChild(root_2, stream_b.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_a.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);

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

    public static class arith_return extends TreeRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith"
    // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:22:1: arith : ( PLUS | MINUS );
    public final SymbolraetselASTNormalizer.arith_return arith() throws RecognitionException {
        SymbolraetselASTNormalizer.arith_return retval = new SymbolraetselASTNormalizer.arith_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Tree _first_0 = null;
        Tree _last = null;

        Tree set6=null;

        Tree set6_tree=null;

        try {
            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:22:8: ( PLUS | MINUS )
            // C:\\Users\\Florian\\Dropbox\\Antlr\\Praktikum3\\Symbolraetsel-AST-Normalisiert\\SymbolraetselASTNormalizer.g:
            {
            root_0 = (Tree)adaptor.nil();

            _last = (Tree)input.LT(1);
            set6=(Tree)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();

                set6_tree = (Tree)adaptor.dupNode(set6);

                adaptor.addChild(root_0, set6_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arith"

    // Delegated rules


 

    public static final BitSet FOLLOW_redraw_in_start57 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_EQUALS_in_redraw67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_redraw70 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_redraw74 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_redraw78 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_redraw83 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_redraw111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_redraw114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_redraw118 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_redraw122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_redraw127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_arith0 = new BitSet(new long[]{0x0000000000000002L});

}