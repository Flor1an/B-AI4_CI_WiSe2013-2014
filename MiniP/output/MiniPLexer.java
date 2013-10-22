// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g 2013-10-16 15:32:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MiniPLexer extends Lexer {
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

    public MiniPLexer() {;} 
    public MiniPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/michaseverin/Code/CI-P1/MiniP/MiniP.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:3:7: ( 'program' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:3:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:4:7: ( 'begin' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:4:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:5:7: ( 'end' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:5:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:6:7: ( ',' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:7:7: ( ';' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:7:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:7: ( ':=' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:9:7: ( 'if' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:9:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:10:7: ( 'then' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:10:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:11:7: ( 'else' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:11:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:12:7: ( 'fi' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:12:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:13:7: ( 'while' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:13:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:14:7: ( 'do' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:14:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:7: ( 'od' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:7: ( 'read(' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:9: 'read('
            {
            match("read("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:17:7: ( ')' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:18:7: ( 'println(' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:18:9: 'println('
            {
            match("println("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:19:7: ( '+' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:19:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:20:7: ( '-' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:7: ( '*' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:22:7: ( '/' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:22:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:23:7: ( '(' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:5:9: ( '/*' ( . )* '*/' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:5:11: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:5:16: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:5:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:6:12: ( ( ' ' | '\\r' | '\\n' | '\\t' )+ )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:6:14: ( ' ' | '\\r' | '\\n' | '\\t' )+
            {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:6:14: ( ' ' | '\\r' | '\\n' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:15: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                alt3=1;
            }
            else if ( ((LA3_0>='a' && LA3_0<='z')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:17: ( 'A' .. 'Z' )
                    {
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:17: ( 'A' .. 'Z' )
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:18: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:28: ( 'a' .. 'z' )
                    {
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:28: ( 'a' .. 'z' )
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:8:29: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:9:16: ( ( '0' .. '9' ) )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:9:18: ( '0' .. '9' )
            {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:9:18: ( '0' .. '9' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:9:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:10:21: ( '_' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:10:23: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:11:9: ( ( DIGIT )+ )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:11:11: ( DIGIT )+
            {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:11:11: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:11:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:12:6: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:12:8: ( DIGIT )+ '.' ( DIGIT )+
            {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:12:8: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:12:8: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('.'); 
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:12:19: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:12:19: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:13:8: ( '\"' ( . )* '\"' )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:13:10: '\"' ( . )* '\"'
            {
            match('\"'); 
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:13:14: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\"') ) {
                    alt7=2;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:13:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:14:9: ( 'true' | 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='t') ) {
                alt8=1;
            }
            else if ( (LA8_0=='f') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:14:11: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:14:20: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "COMPARE"
    public final void mCOMPARE() throws RecognitionException {
        try {
            int _type = COMPARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:9: ( ( '<>' | '<' | '<=' | '=>' | '>' ) )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:11: ( '<>' | '<' | '<=' | '=>' | '>' )
            {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:11: ( '<>' | '<' | '<=' | '=>' | '>' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt9=1;
                    }
                    break;
                case '=':
                    {
                    alt9=3;
                    }
                    break;
                default:
                    alt9=2;}

                }
                break;
            case '=':
                {
                alt9=4;
                }
                break;
            case '>':
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:12: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:19: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:25: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:32: '=>'
                    {
                    match("=>"); 


                    }
                    break;
                case 5 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:15:38: '>'
                    {
                    match('>'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPARE"

    // $ANTLR start "DATATYPE"
    public final void mDATATYPE() throws RecognitionException {
        try {
            int _type = DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:10: ( ( 'integer' | 'real' | 'string' | 'boolean' ) )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:12: ( 'integer' | 'real' | 'string' | 'boolean' )
            {
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:12: ( 'integer' | 'real' | 'string' | 'boolean' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt10=1;
                }
                break;
            case 'r':
                {
                alt10=2;
                }
                break;
            case 's':
                {
                alt10=3;
                }
                break;
            case 'b':
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:13: 'integer'
                    {
                    match("integer"); 


                    }
                    break;
                case 2 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:23: 'real'
                    {
                    match("real"); 


                    }
                    break;
                case 3 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:30: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 4 :
                    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:16:39: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATATYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:18:4: ( CHAR ( CHAR | DIGIT | UNDERSCORE )* )
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:18:6: CHAR ( CHAR | DIGIT | UNDERSCORE )*
            {
            mCHAR(); 
            // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:18:11: ( CHAR | DIGIT | UNDERSCORE )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
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
                    alt11=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt11=2;
                    }
                    break;
                case '_':
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:18:12: CHAR
            	    {
            	    mCHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:18:19: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:18:27: UNDERSCORE
            	    {
            	    mUNDERSCORE(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    public void mTokens() throws RecognitionException {
        // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | COMMENT | WHITESPACE | INTEGER | REAL | STRING | BOOLEAN | COMPARE | DATATYPE | ID )
        int alt12=30;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:136: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 23 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:144: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 24 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:155: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 25 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:163: REAL
                {
                mREAL(); 

                }
                break;
            case 26 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:168: STRING
                {
                mSTRING(); 

                }
                break;
            case 27 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:175: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 28 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:183: COMPARE
                {
                mCOMPARE(); 

                }
                break;
            case 29 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:191: DATATYPE
                {
                mDATATYPE(); 

                }
                break;
            case 30 :
                // /Users/michaseverin/Code/CI-P1/MiniP/MiniP.g:1:200: ID
                {
                mID(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\31\3\uffff\7\31\4\uffff\1\52\2\uffff\1\53\2\uffff\1\31"+
        "\1\uffff\5\31\1\64\3\31\1\70\2\31\1\73\1\74\1\31\4\uffff\5\31\1"+
        "\103\1\31\1\uffff\3\31\1\uffff\2\31\2\uffff\6\31\1\uffff\1\121\1"+
        "\31\1\123\1\124\3\31\1\130\3\31\1\134\1\31\1\uffff\1\31\2\uffff"+
        "\1\124\1\137\2\uffff\3\31\1\uffff\2\31\1\uffff\1\130\1\145\1\31"+
        "\2\130\2\uffff";
    static final String DFA12_eofS =
        "\147\uffff";
    static final String DFA12_minS =
        "\1\11\1\162\1\145\1\154\3\uffff\1\146\1\150\1\141\1\150\1\157\1"+
        "\144\1\145\4\uffff\1\52\2\uffff\1\56\2\uffff\1\164\1\uffff\1\151"+
        "\1\147\1\157\1\144\1\163\1\60\1\164\1\145\1\165\1\60\1\154\1\151"+
        "\2\60\1\141\4\uffff\1\162\1\147\1\156\1\151\1\154\1\60\1\145\1\uffff"+
        "\1\145\1\156\1\145\1\uffff\1\163\1\154\2\uffff\1\144\1\151\1\162"+
        "\1\164\1\156\1\145\1\uffff\1\60\1\147\2\60\2\145\1\50\1\60\1\156"+
        "\1\141\1\154\1\60\1\141\1\uffff\1\145\2\uffff\2\60\2\uffff\1\147"+
        "\1\155\1\156\1\uffff\1\156\1\162\1\uffff\2\60\1\50\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\172\1\162\1\157\1\156\3\uffff\1\156\1\162\1\151\1\150\1\157\1"+
        "\144\1\145\4\uffff\1\52\2\uffff\1\71\2\uffff\1\164\1\uffff\1\157"+
        "\1\147\1\157\1\144\1\163\1\172\1\164\1\145\1\165\1\172\1\154\1\151"+
        "\2\172\1\141\4\uffff\1\162\1\147\1\156\1\151\1\154\1\172\1\145\1"+
        "\uffff\1\145\1\156\1\145\1\uffff\1\163\1\154\2\uffff\1\154\1\151"+
        "\1\162\1\164\1\156\1\145\1\uffff\1\172\1\147\2\172\2\145\1\50\1"+
        "\172\1\156\1\141\1\154\1\172\1\141\1\uffff\1\145\2\uffff\2\172\2"+
        "\uffff\1\147\1\155\1\156\1\uffff\1\156\1\162\1\uffff\2\172\1\50"+
        "\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\5\1\6\7\uffff\1\17\1\21\1\22\1\23\1\uffff\1\25\1"+
        "\27\1\uffff\1\32\1\34\1\uffff\1\36\17\uffff\1\26\1\24\1\30\1\31"+
        "\7\uffff\1\7\3\uffff\1\12\2\uffff\1\14\1\15\6\uffff\1\3\15\uffff"+
        "\1\11\1\uffff\1\10\1\33\2\uffff\1\16\1\35\3\uffff\1\2\2\uffff\1"+
        "\13\5\uffff\1\1\1\20";
    static final String DFA12_specialS =
        "\147\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\1\uffff\1\26\5\uffff\1\23\1"+
            "\16\1\21\1\17\1\4\1\20\1\uffff\1\22\12\25\1\6\1\5\3\27\2\uffff"+
            "\32\31\6\uffff\1\31\1\2\1\31\1\13\1\3\1\11\2\31\1\7\5\31\1\14"+
            "\1\1\1\31\1\15\1\30\1\10\2\31\1\12\3\31",
            "\1\32",
            "\1\33\11\uffff\1\34",
            "\1\36\1\uffff\1\35",
            "",
            "",
            "",
            "\1\37\7\uffff\1\40",
            "\1\41\11\uffff\1\42",
            "\1\44\7\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "\1\51",
            "",
            "",
            "\1\54\1\uffff\12\25",
            "",
            "",
            "\1\55",
            "",
            "\1\57\5\uffff\1\56",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\71",
            "\1\72",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\75",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "",
            "",
            "\1\112\7\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\122",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\135",
            "",
            "\1\136",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\146",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | COMMENT | WHITESPACE | INTEGER | REAL | STRING | BOOLEAN | COMPARE | DATATYPE | ID );";
        }
    }
 

}