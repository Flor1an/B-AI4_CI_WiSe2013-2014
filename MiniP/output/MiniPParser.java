// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g 2013-10-16 15:32:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class MiniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "WHITESPACE", "CHAR", "DIGIT", "UNDERSCORE", "INTEGER", "REAL", "STRING", "BOOLEAN", "COMPARE", "DATATYPE", "ID", "'program'", "'begin'", "'end'", "','", "';'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'read('", "')'", "'println('", "'+'", "'-'", "'*'", "'/'", "'('"
    };
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int COMMENT=4;
    public static final int WHITESPACE=5;
    public static final int CHAR=6;
    public static final int DIGIT=7;
    public static final int UNDERSCORE=8;
    public static final int INTEGER=9;
    public static final int REAL=10;
    public static final int STRING=11;
    public static final int BOOLEAN=12;
    public static final int COMPARE=13;
    public static final int DATATYPE=14;
    public static final int ID=15;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "compareStatement", "konstant", "readStatement", 
        "atom", "printStatement", "factor", "declaration", "whileStatement", 
        "ifStatement", "arithStatement", "program", "assignmentStatement", 
        "statement"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public MiniPParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public MiniPParser(TokenStream input, int port, RecognizerSharedState state) {
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
    public MiniPParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return MiniPParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/michaseverin/Code/CI-P1/MiniP/MiniP.g"; }



    // $ANTLR start "program"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:1: program : 'program' ( declaration )* 'begin' ( statement )+ 'end' ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:9: ( 'program' ( declaration )* 'begin' ( statement )+ 'end' )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:11: 'program' ( declaration )* 'begin' ( statement )+ 'end'
            {
            dbg.location(21,11);
            match(input,16,FOLLOW_16_in_program197); 
            dbg.location(21,21);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:21: ( declaration )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==DATATYPE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:21: declaration
            	    {
            	    dbg.location(21,21);
            	    pushFollow(FOLLOW_declaration_in_program199);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(21,34);
            match(input,17,FOLLOW_17_in_program202); 
            dbg.location(21,43);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:43: ( statement )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMENT||LA2_0==ID||LA2_0==22||LA2_0==26||LA2_0==29||LA2_0==31) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:43: statement
            	    {
            	    dbg.location(21,43);
            	    pushFollow(FOLLOW_statement_in_program205);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(21,54);
            match(input,18,FOLLOW_18_in_program208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(21, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "declaration"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:24:1: declaration : DATATYPE ID ( ',' ID )* ';' ;
    public final void declaration() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:24:13: ( DATATYPE ID ( ',' ID )* ';' )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:24:15: DATATYPE ID ( ',' ID )* ';'
            {
            dbg.location(24,15);
            match(input,DATATYPE,FOLLOW_DATATYPE_in_declaration218); 
            dbg.location(24,25);
            match(input,ID,FOLLOW_ID_in_declaration221); 
            dbg.location(24,28);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:24:28: ( ',' ID )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:24:29: ',' ID
            	    {
            	    dbg.location(24,29);
            	    match(input,19,FOLLOW_19_in_declaration224); 
            	    dbg.location(24,34);
            	    match(input,ID,FOLLOW_ID_in_declaration227); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(24,39);
            match(input,20,FOLLOW_20_in_declaration231); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(24, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "statement"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:1: statement : ( ( ( assignmentStatement | ifStatement | whileStatement | readStatement | printStatement ) ';' | COMMENT ) ) ;
    public final void statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:11: ( ( ( ( assignmentStatement | ifStatement | whileStatement | readStatement | printStatement ) ';' | COMMENT ) ) )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:13: ( ( ( assignmentStatement | ifStatement | whileStatement | readStatement | printStatement ) ';' | COMMENT ) )
            {
            dbg.location(27,13);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:13: ( ( ( assignmentStatement | ifStatement | whileStatement | readStatement | printStatement ) ';' | COMMENT ) )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:14: ( ( assignmentStatement | ifStatement | whileStatement | readStatement | printStatement ) ';' | COMMENT )
            {
            dbg.location(27,14);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:14: ( ( assignmentStatement | ifStatement | whileStatement | readStatement | printStatement ) ';' | COMMENT )
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||LA5_0==22||LA5_0==26||LA5_0==29||LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==COMMENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:15: ( assignmentStatement | ifStatement | whileStatement | readStatement | printStatement ) ';'
                    {
                    dbg.location(27,15);
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:15: ( assignmentStatement | ifStatement | whileStatement | readStatement | printStatement )
                    int alt4=5;
                    try { dbg.enterSubRule(4);
                    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        alt4=1;
                        }
                        break;
                    case 22:
                        {
                        alt4=2;
                        }
                        break;
                    case 26:
                        {
                        alt4=3;
                        }
                        break;
                    case 29:
                        {
                        alt4=4;
                        }
                        break;
                    case 31:
                        {
                        alt4=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(4);}

                    switch (alt4) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:16: assignmentStatement
                            {
                            dbg.location(27,16);
                            pushFollow(FOLLOW_assignmentStatement_in_statement244);
                            assignmentStatement();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:38: ifStatement
                            {
                            dbg.location(27,38);
                            pushFollow(FOLLOW_ifStatement_in_statement248);
                            ifStatement();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:52: whileStatement
                            {
                            dbg.location(27,52);
                            pushFollow(FOLLOW_whileStatement_in_statement252);
                            whileStatement();

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:69: readStatement
                            {
                            dbg.location(27,69);
                            pushFollow(FOLLOW_readStatement_in_statement256);
                            readStatement();

                            state._fsp--;


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:85: printStatement
                            {
                            dbg.location(27,85);
                            pushFollow(FOLLOW_printStatement_in_statement260);
                            printStatement();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(4);}

                    dbg.location(27,101);
                    match(input,20,FOLLOW_20_in_statement263); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:27:107: COMMENT
                    {
                    dbg.location(27,107);
                    match(input,COMMENT,FOLLOW_COMMENT_in_statement267); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(27, 117);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "assignmentStatement"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:30:1: assignmentStatement : ID ':=' ( arithStatement | STRING | compareStatement ) ;
    public final void assignmentStatement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assignmentStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:30:21: ( ID ':=' ( arithStatement | STRING | compareStatement ) )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:30:23: ID ':=' ( arithStatement | STRING | compareStatement )
            {
            dbg.location(30,23);
            match(input,ID,FOLLOW_ID_in_assignmentStatement279); 
            dbg.location(30,27);
            match(input,21,FOLLOW_21_in_assignmentStatement282); 
            dbg.location(30,33);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:30:33: ( arithStatement | STRING | compareStatement )
            int alt6=3;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case 33:
            case 36:
                {
                alt6=1;
                }
                break;
            case INTEGER:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==20||(LA6_2>=32 && LA6_2<=35)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==COMPARE) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case REAL:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==20||(LA6_3>=32 && LA6_3<=35)) ) {
                    alt6=1;
                }
                else if ( (LA6_3==COMPARE) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==COMPARE) ) {
                    alt6=3;
                }
                else if ( (LA6_4==20||(LA6_4>=32 && LA6_4<=35)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5==20) ) {
                    alt6=2;
                }
                else if ( (LA6_5==COMPARE) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case BOOLEAN:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:30:34: arithStatement
                    {
                    dbg.location(30,34);
                    pushFollow(FOLLOW_arithStatement_in_assignmentStatement286);
                    arithStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:30:51: STRING
                    {
                    dbg.location(30,51);
                    match(input,STRING,FOLLOW_STRING_in_assignmentStatement290); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:30:61: compareStatement
                    {
                    dbg.location(30,61);
                    pushFollow(FOLLOW_compareStatement_in_assignmentStatement295);
                    compareStatement();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(30, 78);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignmentStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignmentStatement"


    // $ANTLR start "ifStatement"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:1: ifStatement : 'if' compareStatement 'then' ( statement )+ ( 'else' ( statement )+ )? 'fi' ;
    public final void ifStatement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ifStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:13: ( 'if' compareStatement 'then' ( statement )+ ( 'else' ( statement )+ )? 'fi' )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:15: 'if' compareStatement 'then' ( statement )+ ( 'else' ( statement )+ )? 'fi'
            {
            dbg.location(33,15);
            match(input,22,FOLLOW_22_in_ifStatement305); 
            dbg.location(33,21);
            pushFollow(FOLLOW_compareStatement_in_ifStatement308);
            compareStatement();

            state._fsp--;

            dbg.location(33,39);
            match(input,23,FOLLOW_23_in_ifStatement311); 
            dbg.location(33,47);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:47: ( statement )+
            int cnt7=0;
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMENT||LA7_0==ID||LA7_0==22||LA7_0==26||LA7_0==29||LA7_0==31) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:47: statement
            	    {
            	    dbg.location(33,47);
            	    pushFollow(FOLLOW_statement_in_ifStatement314);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt7++;
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(33,58);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:58: ( 'else' ( statement )+ )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:59: 'else' ( statement )+
                    {
                    dbg.location(33,59);
                    match(input,24,FOLLOW_24_in_ifStatement318); 
                    dbg.location(33,67);
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:67: ( statement )+
                    int cnt8=0;
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMENT||LA8_0==ID||LA8_0==22||LA8_0==26||LA8_0==29||LA8_0==31) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:33:67: statement
                    	    {
                    	    dbg.location(33,67);
                    	    pushFollow(FOLLOW_statement_in_ifStatement321);
                    	    statement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt8++;
                    } while (true);
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(33,80);
            match(input,25,FOLLOW_25_in_ifStatement326); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(33, 84);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "whileStatement"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:36:1: whileStatement : 'while' compareStatement 'do' ( statement )+ 'od' ;
    public final void whileStatement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "whileStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:36:16: ( 'while' compareStatement 'do' ( statement )+ 'od' )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:36:18: 'while' compareStatement 'do' ( statement )+ 'od'
            {
            dbg.location(36,18);
            match(input,26,FOLLOW_26_in_whileStatement335); 
            dbg.location(36,27);
            pushFollow(FOLLOW_compareStatement_in_whileStatement338);
            compareStatement();

            state._fsp--;

            dbg.location(36,45);
            match(input,27,FOLLOW_27_in_whileStatement341); 
            dbg.location(36,51);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:36:51: ( statement )+
            int cnt10=0;
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMENT||LA10_0==ID||LA10_0==22||LA10_0==26||LA10_0==29||LA10_0==31) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:36:51: statement
            	    {
            	    dbg.location(36,51);
            	    pushFollow(FOLLOW_statement_in_whileStatement344);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt10++;
            } while (true);
            } finally {dbg.exitSubRule(10);}

            dbg.location(36,62);
            match(input,28,FOLLOW_28_in_whileStatement347); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(36, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "readStatement"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:39:1: readStatement : 'read(' ID ')' ;
    public final void readStatement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "readStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:39:15: ( 'read(' ID ')' )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:39:17: 'read(' ID ')'
            {
            dbg.location(39,17);
            match(input,29,FOLLOW_29_in_readStatement356); 
            dbg.location(39,25);
            match(input,ID,FOLLOW_ID_in_readStatement358); 
            dbg.location(39,28);
            match(input,30,FOLLOW_30_in_readStatement360); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(39, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "readStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "readStatement"


    // $ANTLR start "printStatement"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:42:1: printStatement : 'println(' ( ID | STRING ) ')' ;
    public final void printStatement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "printStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:42:16: ( 'println(' ( ID | STRING ) ')' )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:42:18: 'println(' ( ID | STRING ) ')'
            {
            dbg.location(42,18);
            match(input,31,FOLLOW_31_in_printStatement369); 
            dbg.location(42,29);
            if ( input.LA(1)==STRING||input.LA(1)==ID ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(42,43);
            match(input,30,FOLLOW_30_in_printStatement379); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(42, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "printStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "printStatement"


    // $ANTLR start "arithStatement"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:46:1: arithStatement : factor ( ( '+' | '-' ) factor )* ;
    public final void arithStatement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arithStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:46:16: ( factor ( ( '+' | '-' ) factor )* )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:46:18: factor ( ( '+' | '-' ) factor )*
            {
            dbg.location(46,18);
            pushFollow(FOLLOW_factor_in_arithStatement389);
            factor();

            state._fsp--;

            dbg.location(46,25);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:46:25: ( ( '+' | '-' ) factor )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=32 && LA11_0<=33)) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:46:26: ( '+' | '-' ) factor
            	    {
            	    dbg.location(46,26);
            	    if ( (input.LA(1)>=32 && input.LA(1)<=33) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(46,36);
            	    pushFollow(FOLLOW_factor_in_arithStatement398);
            	    factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(46, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arithStatement"


    // $ANTLR start "factor"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:47:1: factor : atom ( ( '*' | '/' ) atom )* ;
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:47:7: ( atom ( ( '*' | '/' ) atom )* )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:47:9: atom ( ( '*' | '/' ) atom )*
            {
            dbg.location(47,9);
            pushFollow(FOLLOW_atom_in_factor406);
            atom();

            state._fsp--;

            dbg.location(47,14);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:47:14: ( ( '*' | '/' ) atom )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=34 && LA12_0<=35)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:47:15: ( '*' | '/' ) atom
            	    {
            	    dbg.location(47,15);
            	    if ( (input.LA(1)>=34 && input.LA(1)<=35) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(47,25);
            	    pushFollow(FOLLOW_atom_in_factor415);
            	    atom();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(47, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "atom"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:1: atom : ( '-' )? ( INTEGER | REAL | ID | '(' arithStatement ')' ) ;
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:6: ( ( '-' )? ( INTEGER | REAL | ID | '(' arithStatement ')' ) )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:8: ( '-' )? ( INTEGER | REAL | ID | '(' arithStatement ')' )
            {
            dbg.location(48,8);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:8: ( '-' )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:8: '-'
                    {
                    dbg.location(48,8);
                    match(input,33,FOLLOW_33_in_atom424); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(48,12);
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:12: ( INTEGER | REAL | ID | '(' arithStatement ')' )
            int alt14=4;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt14=1;
                }
                break;
            case REAL:
                {
                alt14=2;
                }
                break;
            case ID:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:13: INTEGER
                    {
                    dbg.location(48,13);
                    match(input,INTEGER,FOLLOW_INTEGER_in_atom427); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:23: REAL
                    {
                    dbg.location(48,23);
                    match(input,REAL,FOLLOW_REAL_in_atom431); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:30: ID
                    {
                    dbg.location(48,30);
                    match(input,ID,FOLLOW_ID_in_atom435); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:48:35: '(' arithStatement ')'
                    {
                    dbg.location(48,35);
                    match(input,36,FOLLOW_36_in_atom439); 
                    dbg.location(48,39);
                    pushFollow(FOLLOW_arithStatement_in_atom441);
                    arithStatement();

                    state._fsp--;

                    dbg.location(48,54);
                    match(input,30,FOLLOW_30_in_atom443); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(48, 58);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"


    // $ANTLR start "compareStatement"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:1: compareStatement : ( BOOLEAN | ( ID COMPARE ID ) | ( konstant COMPARE konstant ) );
    public final void compareStatement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "compareStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:18: ( BOOLEAN | ( ID COMPARE ID ) | ( konstant COMPARE konstant ) )
            int alt15=3;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==20||LA15_1==23||LA15_1==27) ) {
                    alt15=1;
                }
                else if ( (LA15_1==COMPARE) ) {
                    alt15=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt15=2;
                }
                break;
            case INTEGER:
            case REAL:
            case STRING:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:20: BOOLEAN
                    {
                    dbg.location(51,20);
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_compareStatement453); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:30: ( ID COMPARE ID )
                    {
                    dbg.location(51,30);
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:30: ( ID COMPARE ID )
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:31: ID COMPARE ID
                    {
                    dbg.location(51,31);
                    match(input,ID,FOLLOW_ID_in_compareStatement458); 
                    dbg.location(51,35);
                    match(input,COMPARE,FOLLOW_COMPARE_in_compareStatement461); 
                    dbg.location(51,44);
                    match(input,ID,FOLLOW_ID_in_compareStatement464); 

                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:50: ( konstant COMPARE konstant )
                    {
                    dbg.location(51,50);
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:50: ( konstant COMPARE konstant )
                    dbg.enterAlt(1);

                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:51:51: konstant COMPARE konstant
                    {
                    dbg.location(51,51);
                    pushFollow(FOLLOW_konstant_in_compareStatement470);
                    konstant();

                    state._fsp--;

                    dbg.location(51,61);
                    match(input,COMPARE,FOLLOW_COMPARE_in_compareStatement473); 
                    dbg.location(51,70);
                    pushFollow(FOLLOW_konstant_in_compareStatement476);
                    konstant();

                    state._fsp--;


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(51, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compareStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "compareStatement"


    // $ANTLR start "konstant"
    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:52:1: konstant : ( INTEGER | REAL | STRING | BOOLEAN );
    public final void konstant() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "konstant");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:52:10: ( INTEGER | REAL | STRING | BOOLEAN )
            dbg.enterAlt(1);

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:
            {
            dbg.location(52,10);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=BOOLEAN) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(52, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "konstant");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "konstant"

    // Delegated rules


 

    public static final BitSet FOLLOW_16_in_program197 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_declaration_in_program199 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_program202 = new BitSet(new long[]{0x00000000A4408010L});
    public static final BitSet FOLLOW_statement_in_program205 = new BitSet(new long[]{0x00000000A4448010L});
    public static final BitSet FOLLOW_18_in_program208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATATYPE_in_declaration218 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_declaration221 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_declaration224 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_declaration227 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_declaration231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStatement_in_statement244 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ifStatement_in_statement248 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_whileStatement_in_statement252 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_readStatement_in_statement256 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_printStatement_in_statement260 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_statement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentStatement279 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_assignmentStatement282 = new BitSet(new long[]{0x0000001200009E00L});
    public static final BitSet FOLLOW_arithStatement_in_assignmentStatement286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_assignmentStatement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compareStatement_in_assignmentStatement295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ifStatement305 = new BitSet(new long[]{0x0000001200009E00L});
    public static final BitSet FOLLOW_compareStatement_in_ifStatement308 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ifStatement311 = new BitSet(new long[]{0x00000000A4408010L});
    public static final BitSet FOLLOW_statement_in_ifStatement314 = new BitSet(new long[]{0x00000000A7408010L});
    public static final BitSet FOLLOW_24_in_ifStatement318 = new BitSet(new long[]{0x00000000A4408010L});
    public static final BitSet FOLLOW_statement_in_ifStatement321 = new BitSet(new long[]{0x00000000A6408010L});
    public static final BitSet FOLLOW_25_in_ifStatement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_whileStatement335 = new BitSet(new long[]{0x0000001200009E00L});
    public static final BitSet FOLLOW_compareStatement_in_whileStatement338 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_whileStatement341 = new BitSet(new long[]{0x00000000A4408010L});
    public static final BitSet FOLLOW_statement_in_whileStatement344 = new BitSet(new long[]{0x00000000B4408010L});
    public static final BitSet FOLLOW_28_in_whileStatement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_readStatement356 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_readStatement358 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_readStatement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_printStatement369 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_set_in_printStatement371 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_printStatement379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_arithStatement389 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_set_in_arithStatement392 = new BitSet(new long[]{0x0000001200008600L});
    public static final BitSet FOLLOW_factor_in_arithStatement398 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_atom_in_factor406 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_factor409 = new BitSet(new long[]{0x0000001200008600L});
    public static final BitSet FOLLOW_atom_in_factor415 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_33_in_atom424 = new BitSet(new long[]{0x0000001000008600L});
    public static final BitSet FOLLOW_INTEGER_in_atom427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_atom431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_atom439 = new BitSet(new long[]{0x0000001200008600L});
    public static final BitSet FOLLOW_arithStatement_in_atom441 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_atom443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_compareStatement453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_compareStatement458 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMPARE_in_compareStatement461 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_compareStatement464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_konstant_in_compareStatement470 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMPARE_in_compareStatement473 = new BitSet(new long[]{0x0000001200009E00L});
    public static final BitSet FOLLOW_konstant_in_compareStatement476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_konstant0 = new BitSet(new long[]{0x0000000000000002L});

}