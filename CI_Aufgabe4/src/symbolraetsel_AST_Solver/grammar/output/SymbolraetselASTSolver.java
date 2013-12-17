// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g 2013-12-17 18:35:39

package symbolraetsel_AST_Solver.grammar.output;

import java.util.Set;
import java.util.HashSet;
import java.lang.Character;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class SymbolraetselASTSolver extends TreeParser {
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


        public SymbolraetselASTSolver(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public SymbolraetselASTSolver(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("SymbolraetselASTSolverTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return SymbolraetselASTSolver.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g"; }


    Set<Character> symbols = new HashSet<Character>();


    public static class start_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "start"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:27:1: start : ^( START (constraints+= constraint )* ) -> sums(symbols=symbolscons=$constraints);
    public final SymbolraetselASTSolver.start_return start() throws RecognitionException {
        SymbolraetselASTSolver.start_return retval = new SymbolraetselASTSolver.start_return();
        retval.start = input.LT(1);

        List list_constraints=null;
        RuleReturnScope constraints = null;
        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:27:7: ( ^( START (constraints+= constraint )* ) -> sums(symbols=symbolscons=$constraints))
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:28:2: ^( START (constraints+= constraint )* )
            {
            match(input,START,FOLLOW_START_in_start71); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:28:21: (constraints+= constraint )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==EQUALS) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:28:21: constraints+= constraint
                	    {
                	    pushFollow(FOLLOW_constraint_in_start75);
                	    constraints=constraint();

                	    state._fsp--;

                	    if (list_constraints==null) list_constraints=new ArrayList();
                	    list_constraints.add(constraints.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 29:2: -> sums(symbols=symbolscons=$constraints)
            {
                retval.st = templateLib.getInstanceOf("sums",
              new STAttrMap().put("symbols", symbols).put("cons", list_constraints));
            }


            }

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

    public static class constraint_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraint"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:31:1: constraint : ^( EQUALS ^( ADDITION n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
    public final SymbolraetselASTSolver.constraint_return constraint() throws RecognitionException {
        SymbolraetselASTSolver.constraint_return retval = new SymbolraetselASTSolver.constraint_return();
        retval.start = input.LT(1);

        SymbolraetselASTSolver.number_return n1 = null;

        SymbolraetselASTSolver.number_return n2 = null;

        SymbolraetselASTSolver.number_return n3 = null;


        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:38:3: ( ^( EQUALS ^( ADDITION n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:39:2: ^( EQUALS ^( ADDITION n1= number n2= number ) n3= number )
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_constraint107); 

            match(input, Token.DOWN, null); 
            match(input,ADDITION,FOLLOW_ADDITION_in_constraint110); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_constraint114);
            n1=number();

            state._fsp--;

            pushFollow(FOLLOW_number_in_constraint118);
            n2=number();

            state._fsp--;


            match(input, Token.UP, null); 
            pushFollow(FOLLOW_number_in_constraint123);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 40:2: -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",
              new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("number3", (n3!=null?n3.number:null)));
            }


            }


            Constraint constraint = new Constraint();
            constraint.numbers.add((n1!=null?n1.number:null));
            constraint.numbers.add((n2!=null?n2.number:null));
            constraint.numbers.add((n3!=null?n3.number:null));
            constraint.prepare();

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constraint"

    public static class number_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "number"
    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:43:1: number returns [Number number] : ^( BLOCK (syms+= SYMBOL )+ ) ;
    public final SymbolraetselASTSolver.number_return number() throws RecognitionException {
        SymbolraetselASTSolver.number_return retval = new SymbolraetselASTSolver.number_return();
        retval.start = input.LT(1);

        CommonTree syms=null;
        List list_syms=null;

        try {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:49:3: ( ^( BLOCK (syms+= SYMBOL )+ ) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:50:2: ^( BLOCK (syms+= SYMBOL )+ )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_number167); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:50:14: (syms+= SYMBOL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SYMBOL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselASTSolver.g:50:14: syms+= SYMBOL
            	    {
            	    syms=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_number171); 
            	    if (list_syms==null) list_syms=new ArrayList();
            	    list_syms.add(syms);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 

            }


            retval.number = new Number();
            retval.number.setDigits(list_syms);
            //HashSet um alle Smybole zu sammeln
            symbols.addAll(retval.number.getCharacters());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_START_in_start71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_start75 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_EQUALS_in_constraint107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADDITION_in_constraint110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_constraint114 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_constraint118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_constraint123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_number167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_number171 = new BitSet(new long[]{0x0000000000000088L});

}