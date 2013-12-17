// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g 2013-12-17 18:37:23

package symbolraetsel_AST_Solver.grammar.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SymbolraetselASTLexer extends Lexer {
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

    public SymbolraetselASTLexer() {;} 
    public SymbolraetselASTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselASTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g"; }

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:46:7: ( '=' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:46:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:47:5: ( '+' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:47:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:48:6: ( '-' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:48:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:49:7: ( 'A' .. 'Z' | 'a' .. 'z' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SYMBOL"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:8: ( ( ( ( '\\r' )? '\\n' ) | '\\r' ) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:10: ( ( ( '\\r' )? '\\n' ) | '\\r' )
            {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:10: ( ( ( '\\r' )? '\\n' ) | '\\r' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else if ( (LA2_0=='\n') ) {
                alt2=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:11: ( ( '\\r' )? '\\n' )
                    {
                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:11: ( ( '\\r' )? '\\n' )
                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:12: ( '\\r' )? '\\n'
                    {
                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:12: ( '\\r' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='\r') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:12: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:50:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:51:3: ( ( ' ' | '\\t' | '\\n' ) )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:51:5: ( ' ' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:1:8: ( EQUALS | PLUS | MINUS | SYMBOL | NEWLINE | WS )
        int alt3=6;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt3=1;
            }
            break;
        case '+':
            {
            alt3=2;
            }
            break;
        case '-':
            {
            alt3=3;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=4;
            }
            break;
        case '\r':
            {
            alt3=5;
            }
            break;
        case '\n':
            {
            alt3=5;
            }
            break;
        case '\t':
        case ' ':
            {
            alt3=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:1:10: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 2 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:1:17: PLUS
                {
                mPLUS(); 

                }
                break;
            case 3 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:1:22: MINUS
                {
                mMINUS(); 

                }
                break;
            case 4 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:1:28: SYMBOL
                {
                mSYMBOL(); 

                }
                break;
            case 5 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:1:35: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 6 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe4\\src\\symbolraetsel_AST_Solver\\grammar\\SymbolraetselAST.g:1:43: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}