// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g 2013-10-16 13:50:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class SymbolraetselParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SPACE", "LINEBREAK", "LETTER", "ARITMETIC_SIGN", "EQUALS_SIGN"
    };
    public static final int EOF=-1;
    public static final int SPACE=4;
    public static final int LINEBREAK=5;
    public static final int LETTER=6;
    public static final int ARITMETIC_SIGN=7;
    public static final int EQUALS_SIGN=8;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "third_row", "first_row", "second_row", "buschstaben", 
        "expression", "start", "fourth_row", "fifth_row"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public SymbolraetselParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public SymbolraetselParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public SymbolraetselParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return SymbolraetselParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g"; }



    // $ANTLR start "buschstaben"
    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:9:1: buschstaben : ( LETTER )+ ;
    public final void buschstaben() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "buschstaben");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:9:13: ( ( LETTER )+ )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:9:15: ( LETTER )+
            {
            dbg.location(9,15);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:9:15: ( LETTER )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==LETTER) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:9:15: LETTER
            	    {
            	    dbg.location(9,15);
            	    match(input,LETTER,FOLLOW_LETTER_in_buschstaben62); 

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(9, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "buschstaben");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "buschstaben"


    // $ANTLR start "expression"
    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:1: expression : buschstaben ( SPACE )? ARITMETIC_SIGN ( SPACE )? buschstaben ( SPACE )? EQUALS_SIGN ( SPACE )? buschstaben ;
    public final void expression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:13: ( buschstaben ( SPACE )? ARITMETIC_SIGN ( SPACE )? buschstaben ( SPACE )? EQUALS_SIGN ( SPACE )? buschstaben )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:15: buschstaben ( SPACE )? ARITMETIC_SIGN ( SPACE )? buschstaben ( SPACE )? EQUALS_SIGN ( SPACE )? buschstaben
            {
            dbg.location(10,15);
            pushFollow(FOLLOW_buschstaben_in_expression71);
            buschstaben();

            state._fsp--;

            dbg.location(10,27);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:27: ( SPACE )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==SPACE) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:27: SPACE
                    {
                    dbg.location(10,27);
                    match(input,SPACE,FOLLOW_SPACE_in_expression73); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(10,34);
            match(input,ARITMETIC_SIGN,FOLLOW_ARITMETIC_SIGN_in_expression76); 
            dbg.location(10,49);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:49: ( SPACE )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==SPACE) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:49: SPACE
                    {
                    dbg.location(10,49);
                    match(input,SPACE,FOLLOW_SPACE_in_expression78); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(10,56);
            pushFollow(FOLLOW_buschstaben_in_expression81);
            buschstaben();

            state._fsp--;

            dbg.location(10,68);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:68: ( SPACE )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==SPACE) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:68: SPACE
                    {
                    dbg.location(10,68);
                    match(input,SPACE,FOLLOW_SPACE_in_expression83); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(10,75);
            match(input,EQUALS_SIGN,FOLLOW_EQUALS_SIGN_in_expression86); 
            dbg.location(10,87);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:87: ( SPACE )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==SPACE) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:10:87: SPACE
                    {
                    dbg.location(10,87);
                    match(input,SPACE,FOLLOW_SPACE_in_expression88); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(10,94);
            pushFollow(FOLLOW_buschstaben_in_expression91);
            buschstaben();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(10, 105);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "first_row"
    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:12:1: first_row : expression LINEBREAK ;
    public final void first_row() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "first_row");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:12:13: ( expression LINEBREAK )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:12:15: expression LINEBREAK
            {
            dbg.location(12,15);
            pushFollow(FOLLOW_expression_in_first_row101);
            expression();

            state._fsp--;

            dbg.location(12,26);
            match(input,LINEBREAK,FOLLOW_LINEBREAK_in_first_row103); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(12, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "first_row");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "first_row"


    // $ANTLR start "second_row"
    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:13:1: second_row : ARITMETIC_SIGN ( SPACE )? ARITMETIC_SIGN ( SPACE )? ARITMETIC_SIGN LINEBREAK ;
    public final void second_row() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "second_row");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:13:13: ( ARITMETIC_SIGN ( SPACE )? ARITMETIC_SIGN ( SPACE )? ARITMETIC_SIGN LINEBREAK )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:13:15: ARITMETIC_SIGN ( SPACE )? ARITMETIC_SIGN ( SPACE )? ARITMETIC_SIGN LINEBREAK
            {
            dbg.location(13,15);
            match(input,ARITMETIC_SIGN,FOLLOW_ARITMETIC_SIGN_in_second_row111); 
            dbg.location(13,30);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:13:30: ( SPACE )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==SPACE) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:13:30: SPACE
                    {
                    dbg.location(13,30);
                    match(input,SPACE,FOLLOW_SPACE_in_second_row113); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(13,37);
            match(input,ARITMETIC_SIGN,FOLLOW_ARITMETIC_SIGN_in_second_row116); 
            dbg.location(13,52);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:13:52: ( SPACE )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==SPACE) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:13:52: SPACE
                    {
                    dbg.location(13,52);
                    match(input,SPACE,FOLLOW_SPACE_in_second_row118); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(13,59);
            match(input,ARITMETIC_SIGN,FOLLOW_ARITMETIC_SIGN_in_second_row121); 
            dbg.location(13,74);
            match(input,LINEBREAK,FOLLOW_LINEBREAK_in_second_row123); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(13, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "second_row");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "second_row"


    // $ANTLR start "third_row"
    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:14:1: third_row : expression LINEBREAK ;
    public final void third_row() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "third_row");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:14:12: ( expression LINEBREAK )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:14:14: expression LINEBREAK
            {
            dbg.location(14,14);
            pushFollow(FOLLOW_expression_in_third_row131);
            expression();

            state._fsp--;

            dbg.location(14,25);
            match(input,LINEBREAK,FOLLOW_LINEBREAK_in_third_row133); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(14, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "third_row");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "third_row"


    // $ANTLR start "fourth_row"
    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:15:1: fourth_row : EQUALS_SIGN ( SPACE )? EQUALS_SIGN ( SPACE )? EQUALS_SIGN LINEBREAK ;
    public final void fourth_row() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "fourth_row");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:15:13: ( EQUALS_SIGN ( SPACE )? EQUALS_SIGN ( SPACE )? EQUALS_SIGN LINEBREAK )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:15:15: EQUALS_SIGN ( SPACE )? EQUALS_SIGN ( SPACE )? EQUALS_SIGN LINEBREAK
            {
            dbg.location(15,15);
            match(input,EQUALS_SIGN,FOLLOW_EQUALS_SIGN_in_fourth_row141); 
            dbg.location(15,27);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:15:27: ( SPACE )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==SPACE) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:15:27: SPACE
                    {
                    dbg.location(15,27);
                    match(input,SPACE,FOLLOW_SPACE_in_fourth_row143); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(15,34);
            match(input,EQUALS_SIGN,FOLLOW_EQUALS_SIGN_in_fourth_row146); 
            dbg.location(15,46);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:15:46: ( SPACE )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==SPACE) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:15:46: SPACE
                    {
                    dbg.location(15,46);
                    match(input,SPACE,FOLLOW_SPACE_in_fourth_row148); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(15,53);
            match(input,EQUALS_SIGN,FOLLOW_EQUALS_SIGN_in_fourth_row151); 
            dbg.location(15,65);
            match(input,LINEBREAK,FOLLOW_LINEBREAK_in_fourth_row153); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(15, 74);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fourth_row");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fourth_row"


    // $ANTLR start "fifth_row"
    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:16:1: fifth_row : expression ( LINEBREAK )? ;
    public final void fifth_row() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "fifth_row");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:16:12: ( expression ( LINEBREAK )? )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:16:14: expression ( LINEBREAK )?
            {
            dbg.location(16,14);
            pushFollow(FOLLOW_expression_in_fifth_row161);
            expression();

            state._fsp--;

            dbg.location(16,25);
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:16:25: ( LINEBREAK )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==LINEBREAK) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:16:25: LINEBREAK
                    {
                    dbg.location(16,25);
                    match(input,LINEBREAK,FOLLOW_LINEBREAK_in_fifth_row163); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(16, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fifth_row");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fifth_row"


    // $ANTLR start "start"
    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:18:1: start : first_row second_row third_row fourth_row fifth_row ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:18:10: ( first_row second_row third_row fourth_row fifth_row )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:18:12: first_row second_row third_row fourth_row fifth_row
            {
            dbg.location(18,12);
            pushFollow(FOLLOW_first_row_in_start175);
            first_row();

            state._fsp--;

            dbg.location(18,22);
            pushFollow(FOLLOW_second_row_in_start177);
            second_row();

            state._fsp--;

            dbg.location(18,33);
            pushFollow(FOLLOW_third_row_in_start179);
            third_row();

            state._fsp--;

            dbg.location(18,43);
            pushFollow(FOLLOW_fourth_row_in_start181);
            fourth_row();

            state._fsp--;

            dbg.location(18,54);
            pushFollow(FOLLOW_fifth_row_in_start183);
            fifth_row();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(18, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start"

    // Delegated rules


 

    public static final BitSet FOLLOW_LETTER_in_buschstaben62 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_buschstaben_in_expression71 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_SPACE_in_expression73 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARITMETIC_SIGN_in_expression76 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_SPACE_in_expression78 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_buschstaben_in_expression81 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_SPACE_in_expression83 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_SIGN_in_expression86 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_SPACE_in_expression88 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_buschstaben_in_expression91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_first_row101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LINEBREAK_in_first_row103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITMETIC_SIGN_in_second_row111 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_SPACE_in_second_row113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARITMETIC_SIGN_in_second_row116 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_SPACE_in_second_row118 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARITMETIC_SIGN_in_second_row121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LINEBREAK_in_second_row123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_third_row131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LINEBREAK_in_third_row133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_SIGN_in_fourth_row141 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_SPACE_in_fourth_row143 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_SIGN_in_fourth_row146 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_SPACE_in_fourth_row148 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_SIGN_in_fourth_row151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LINEBREAK_in_fourth_row153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_fifth_row161 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_LINEBREAK_in_fifth_row163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_first_row_in_start175 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_second_row_in_start177 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_third_row_in_start179 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_fourth_row_in_start181 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_fifth_row_in_start183 = new BitSet(new long[]{0x0000000000000002L});

}