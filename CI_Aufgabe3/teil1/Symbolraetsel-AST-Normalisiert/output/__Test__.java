import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SymbolraetselASTLexer lex = new SymbolraetselASTLexer(new ANTLRFileStream("C:\\Users\\Florian\\Downloads\\symbolraetsel\\symbolraetsel\\input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SymbolraetselASTParser g = new SymbolraetselASTParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}