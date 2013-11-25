// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g 2013-11-25 12:59:40
 package symbolraetsel_AST_Normalisiert.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SymbolraetselASTLexer extends Lexer {
    public static final int EOF=-1;
    public static final int PLUS=4;
    public static final int MINUS=5;
    public static final int LETTER=6;
    public static final int EQUALS=7;
    public static final int SPACE=8;
    public static final int LINEBREAK=9;

    // delegates
    // delegators

    public SymbolraetselASTLexer() {;} 
    public SymbolraetselASTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselASTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g"; }

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:34:7: ( ' ' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:34:8: ' '
            {
            match(' '); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:35:10: ( ( '\\r' )? '\\n' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:35:12: ( '\\r' )? '\\n'
            {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:35:12: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:35:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:36:7: ( ( 'A' .. 'Z' )+ )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:36:9: ( 'A' .. 'Z' )+
            {
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:36:9: ( 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:36:9: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:38:5: ( '+' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:38:7: '+'
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
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:39:6: ( '-' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:39:8: '-'
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

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:40:7: ( '=' )
            // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:40:9: '='
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

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:1:8: ( SPACE | LINEBREAK | LETTER | PLUS | MINUS | EQUALS )
        int alt3=6;
        switch ( input.LA(1) ) {
        case ' ':
            {
            alt3=1;
            }
            break;
        case '\n':
        case '\r':
            {
            alt3=2;
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
            {
            alt3=3;
            }
            break;
        case '+':
            {
            alt3=4;
            }
            break;
        case '-':
            {
            alt3=5;
            }
            break;
        case '=':
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
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:1:10: SPACE
                {
                mSPACE(); 

                }
                break;
            case 2 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:1:16: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 3 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:1:26: LETTER
                {
                mLETTER(); 

                }
                break;
            case 4 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:1:33: PLUS
                {
                mPLUS(); 

                }
                break;
            case 5 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:1:38: MINUS
                {
                mMINUS(); 

                }
                break;
            case 6 :
                // C:\\Users\\Florian\\Dropbox\\Git\\CI_WiSe2013-2014\\CI_Aufgabe3\\teil1\\symbolraetsel_AST_Normalisiert\\SymbolraetselAST.g:1:44: EQUALS
                {
                mEQUALS(); 

                }
                break;

        }

    }


 

}