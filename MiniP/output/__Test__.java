import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MiniPLexer lex = new MiniPLexer(new ANTLRFileStream("/Users/michaseverin/Code/CI-P1/MiniP/input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MiniPParser g = new MiniPParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}