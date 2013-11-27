package symbolraetsel_AST_Normalisiert;

import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import symbolraetsel_AST_Normalisiert.output.*;

public class run {
	public static void main(String[] args) {
		try {
			// Following according to:
			// http://www.antlr.org/wiki/display/ANTLR3/Simple+tree-based+interpeter

			ANTLRFileStream input = new ANTLRFileStream("teil1/symbolraetsel_AST_Normalisiert/input.txt");
			SymbolraetselASTLexer lexer = new SymbolraetselASTLexer(input);
			TokenRewriteStream tokens = new TokenRewriteStream(lexer);
			SymbolraetselASTParser parser = new SymbolraetselASTParser(tokens);
			SymbolraetselASTParser.start_return r1 = parser.start();
			CommonTree t1 = (CommonTree) r1.getTree(); 
			//CommonTree t1  = (CommonTree) parser.prog().getTree();
			System.out.println(t1.toStringTree());

			CommonTreeNodeStream nodes = new CommonTreeNodeStream(t1);
			SymbolraetselASTNormalizer normalizer = new SymbolraetselASTNormalizer(nodes);
			SymbolraetselASTNormalizer.start_return r2 = normalizer.start();
			CommonTree t2 = (CommonTree) r2.getTree();
			System.out.println(t2.toStringTree());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}
