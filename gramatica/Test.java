import org.antlr.runtime.*;

public class Test {
    public static void main(String[] args) throws Exception {
        
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        gramConsultaLexer lexer = new gramConsultaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramConsultaParser parser = new gramConsultaParser(tokens);
        parser.inicio();
    }
}
