import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SymbolraetselLexer lex = new SymbolraetselLexer(new ANTLRFileStream("/Users/michaseverin/Code/CI-P1/Symbolraetsel/input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SymbolraetselParser g = new SymbolraetselParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}