package symbolraetsel_AST_Normalisiert;

import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import symbolraetsel_AST_Normalisiert.output.*;

public class run {
	public static void main(String[] args) {
		try {
			//Following according to: http://www.antlr.org/wiki/display/ANTLR3/Simple+tree-based+interpeter
			
			ANTLRFileStream input = new ANTLRFileStream("teil1/symbolraetsel_AST_Normalisiert/input.txt");
	        SymbolraetselASTLexer lexer = new SymbolraetselASTLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        SymbolraetselASTParser parser = new SymbolraetselASTParser(tokens);
	        CommonTree t  = (CommonTree) parser.start().getTree(); //t = nuil ... pourquoi?????

	        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	        SymbolraetselASTNormalizer normalizer = new SymbolraetselASTNormalizer(nodes);
	        normalizer.start();
			

		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}
