import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class main {
	public static void main(String[] args) {
		
		//reads input commands line by line, or from file if 
		//redirection is used
		List<String> lines = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
		   String line = scanner.nextLine();
		   lines.add(line);
		}
		scanner.close();
		
		//this for loop iterates through the list of commands
		//and checks if they are valid
		//if invalid, the number of errors will be > 0
		for (String line : lines) {
			CharStream charStream = CharStreams.fromString(line);
			pa2Lexer lexer = new pa2Lexer(charStream);
			lexer.removeErrorListeners(); // disable lexer warnings
			CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
			pa2Parser parser = new pa2Parser(commonTokenStream);
			parser.removeErrorListeners(); // disable parser warnings
			
			ParseTree parseTree = parser.program(); // program() auto-created from program parser rule
			String output = parseTree.toStringTree(parser);
			int numErrors = parser.getNumberOfSyntaxErrors();
			System.out.println(output); // the parse tree's flat structure format
			System.out.println(numErrors); // the number of syntax errors generated from the parser
		}
		
		
	}
}
