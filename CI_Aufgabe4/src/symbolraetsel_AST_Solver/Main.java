package symbolraetsel_AST_Solver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

import symbolraetsel_AST_Solver.grammar.output.*;


public class Main {
	private static final String SYMBOLDSL_DIR = ".\\src\\symbolraetsel_AST_Solver\\grammar\\";
	private static final String TEMPLATE_FILE = SYMBOLDSL_DIR + "template.stg";
	private static final String PUZZLE_FILE = SYMBOLDSL_DIR + "Raetsel.txt";
	

	
	public static void main(String[] args) throws IOException, RecognitionException {
		ANTLRFileStream input = new ANTLRFileStream(PUZZLE_FILE,"UTF8");
		
		SymbolraetselASTLexer lexer = new SymbolraetselASTLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SymbolraetselASTParser parser = new SymbolraetselASTParser(tokens);
		SymbolraetselASTParser.start_return parseResult = parser.start();


		CommonTree parserAST = (CommonTree)parseResult.getTree();
		System.out.println("Parse AST:");
		System.out.println(parserAST.toStringTree());
		
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(parserAST);
		
		SymbolraetselASTNormalizer normalizer = new SymbolraetselASTNormalizer(nodes);
		SymbolraetselASTNormalizer.start_return normalizerResult = normalizer.start();
		CommonTree normAST = (CommonTree)normalizerResult.getTree();
	
		System.out.println("\n\nNormaliz AST:");
		System.out.println(normAST.toStringTree() +"\n\n");
		
	
		CommonTreeNodeStream nodesNormAST = new CommonTreeNodeStream(normAST);
		nodesNormAST.setTokenStream(tokens);
		
		SymbolraetselASTSolver solver = new SymbolraetselASTSolver(nodesNormAST);
		InputStream templateIs = new FileInputStream(TEMPLATE_FILE);
		
		InputStreamReader templateReader = new InputStreamReader(templateIs, "ISO-8859-15");
		StringTemplateGroup templates = new StringTemplateGroup(templateReader, AngleBracketTemplateLexer.class);
		solver.setTemplateLib(templates);
		
		SymbolraetselASTSolver.start_return puzzle_return = solver.start();
		String output = puzzle_return.getTemplate().toString();
		System.out.println("\n\nausgabe");
		System.out.println(output);
		
		//Ausgabe in Datei schreiben
		File datei = new File(".\\src\\symbolraetsel_AST_Solver\\ChocoSolver.java");
		FileWriter writer = new FileWriter(datei, false);
		writer.write(output);
		writer.flush();
		writer.close();
		

		//ChocoSolver.main();
	}
}
