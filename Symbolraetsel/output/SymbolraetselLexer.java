// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g 2013-10-16 13:50:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SymbolraetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int SPACE=4;
    public static final int LINEBREAK=5;
    public static final int LETTER=6;
    public static final int ARITMETIC_SIGN=7;
    public static final int EQUALS_SIGN=8;

    // delegates
    // delegators

    public SymbolraetselLexer() {;} 
    public SymbolraetselLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g"; }

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:3:10: ( ' ' )
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:3:12: ' '
            {
            match(' '); 
            _channel=HIDDEN;

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
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:4:12: ( ( '\\r' )? '\\n' )
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:4:14: ( '\\r' )? '\\n'
            {
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:4:14: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:4:14: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

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
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:5:10: ( 'A' .. 'Z' )
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:5:12: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ARITMETIC_SIGN"
    public final void mARITMETIC_SIGN() throws RecognitionException {
        try {
            int _type = ARITMETIC_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:6:16: ( '+' | '-' )
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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
    // $ANTLR end "ARITMETIC_SIGN"

    // $ANTLR start "EQUALS_SIGN"
    public final void mEQUALS_SIGN() throws RecognitionException {
        try {
            int _type = EQUALS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:7:14: ( '=' )
            // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:7:16: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS_SIGN"

    public void mTokens() throws RecognitionException {
        // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:1:8: ( SPACE | LINEBREAK | LETTER | ARITMETIC_SIGN | EQUALS_SIGN )
        int alt2=5;
        switch ( input.LA(1) ) {
        case ' ':
            {
            alt2=1;
            }
            break;
        case '\n':
        case '\r':
            {
            alt2=2;
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
            alt2=3;
            }
            break;
        case '+':
        case '-':
            {
            alt2=4;
            }
            break;
        case '=':
            {
            alt2=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;
        }

        switch (alt2) {
            case 1 :
                // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:1:10: SPACE
                {
                mSPACE(); 

                }
                break;
            case 2 :
                // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:1:16: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 3 :
                // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:1:26: LETTER
                {
                mLETTER(); 

                }
                break;
            case 4 :
                // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:1:33: ARITMETIC_SIGN
                {
                mARITMETIC_SIGN(); 

                }
                break;
            case 5 :
                // /Users/michaseverin/Code/CI-P1/Symbolraetsel/Symbolraetsel.g:1:48: EQUALS_SIGN
                {
                mEQUALS_SIGN(); 

                }
                break;

        }

    }


 

}