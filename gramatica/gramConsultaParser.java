// $ANTLR 3.5.2 gramConsulta.g 2024-12-04 18:12:26

    import java.util.HashMap;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramConsultaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "LITERAL", "WS", "'anioEdicion'", 
		"'apellidos'", "'autor'", "'codigoLibro'", "'codigoUsuario'", "'domicilio'", 
		"'editorial'", "'estado'", "'fechaDevolucion'", "'fechaMaxima'", "'fechaNacimiento'", 
		"'fechaSalida'", "'genero'", "'municipio'", "'noIdentificacion'", "'nombre'", 
		"'nombreLibro'", "'numeroPaginas'", "'numeroPedido'", "'paisAutor'", "'precioLibro'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
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
	public static final int ID=4;
	public static final int LITERAL=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public gramConsultaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramConsultaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return gramConsultaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "gramConsulta.g"; }


	    HashMap<String, String> variables = new HashMap<String, String>();
	    ArrayList<String> tripletas = new ArrayList<String>();
	    
	    private String generateJavaCode() {
	        StringBuilder code = new StringBuilder();
	        
	        // Imports necesarios
	        code.append("import com.hp.hpl.jena.query.*;\n");
	        code.append("import com.hp.hpl.jena.rdf.model.*;\n");
	        code.append("import com.hp.hpl.jena.util.FileManager;\n\n");
	        
	        // Clase principal
	        code.append("public class ConsultaBiblioteca {\n");
	        code.append("    private static final String MY_RDF_FILE = \"biblioteca.rdf\";\n\n");
	        code.append("    public static void main(String[] args) {\n");
	        code.append("        Model grafo = ModelFactory.createDefaultModel();\n");
	        code.append("        FileManager.get().readModel(grafo, MY_RDF_FILE);\n\n");
	        
	        // Construcción de la consulta SPARQL
	        code.append("        String queryString = \"base <http://www.proyecto.com/biblioteca#>\" +\n");
	        code.append("            \"PREFIX biblioteca: <http://www.proyecto.com/biblioteca#> \" +\n");
	        code.append("            \"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \" +\n");
	        code.append("            \"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> \" +\n");
	        code.append("            \"SELECT * \" +\n");
	        code.append("            \"WHERE { \" +\n");
	        
	        // Agregar tripletas
	        for(int i = 0; i < tripletas.size(); i++) {
	            code.append("            \"" + tripletas.get(i) + " \" +\n");
	        }
	        
	        code.append("            \"} \";\n\n");
	        
	        // Ejecución de la consulta
	        code.append("        Query consulta = QueryFactory.create(queryString);\n");
	        code.append("        QueryExecution consultaEj = QueryExecutionFactory.create(consulta, grafo);\n");
	        code.append("        ResultSet resultados = consultaEj.execSelect();\n");
	        code.append("        ResultSetFormatter.out(System.out, resultados);\n");
	        code.append("        consultaEj.close();\n");
	        code.append("    }\n");
	        code.append("}\n");
	        
	        return code.toString();
	    }



	// $ANTLR start "inicio"
	// gramConsulta.g:60:1: inicio : ( tripleta )+ EOF ;
	public final void inicio() throws RecognitionException {
		try {
			// gramConsulta.g:60:7: ( ( tripleta )+ EOF )
			// gramConsulta.g:60:9: ( tripleta )+ EOF
			{
			// gramConsulta.g:60:9: ( tripleta )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// gramConsulta.g:60:10: tripleta
					{
					pushFollow(FOLLOW_tripleta_in_inicio36);
					tripleta();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_inicio40); 

			            System.out.println(generateJavaCode());
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inicio"



	// $ANTLR start "tripleta"
	// gramConsulta.g:65:1: tripleta : var1= ID pred= predicado (var2= ID |lit= LITERAL ) ;
	public final void tripleta() throws RecognitionException {
		Token var1=null;
		Token var2=null;
		Token lit=null;
		ParserRuleReturnScope pred =null;

		try {
			// gramConsulta.g:65:9: (var1= ID pred= predicado (var2= ID |lit= LITERAL ) )
			// gramConsulta.g:66:2: var1= ID pred= predicado (var2= ID |lit= LITERAL )
			{
			var1=(Token)match(input,ID,FOLLOW_ID_in_tripleta55); 
			pushFollow(FOLLOW_predicado_in_tripleta61);
			pred=predicado();
			state._fsp--;

			// gramConsulta.g:66:29: (var2= ID |lit= LITERAL )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID) ) {
				alt2=1;
			}
			else if ( (LA2_0==LITERAL) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// gramConsulta.g:66:30: var2= ID
					{
					var2=(Token)match(input,ID,FOLLOW_ID_in_tripleta68); 
					}
					break;
				case 2 :
					// gramConsulta.g:66:42: lit= LITERAL
					{
					lit=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_tripleta76); 
					}
					break;

			}


			            String sujeto = variables.containsKey((var1!=null?var1.getText():null)) ? 
			                           variables.get((var1!=null?var1.getText():null)) : 
			                           "?" + (var1!=null?var1.getText():null);
			            
			            String objeto = var2 != null ? 
			                          (variables.containsKey((var2!=null?var2.getText():null)) ? 
			                           variables.get((var2!=null?var2.getText():null)) : 
			                           "?" + (var2!=null?var2.getText():null)) :
			                          (lit!=null?lit.getText():null);
			                          
			            tripletas.add(sujeto + " biblioteca:" + (pred!=null?input.toString(pred.start,pred.stop):null) + " " + objeto + " .");
			            
			            if(var2 != null) {
			                variables.put((var2!=null?var2.getText():null), "?" + (var2!=null?var2.getText():null));
			            }
			            variables.put((var1!=null?var1.getText():null), "?" + (var1!=null?var1.getText():null));
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tripleta"


	public static class predicado_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "predicado"
	// gramConsulta.g:86:1: predicado : ( 'nombreLibro' | 'editorial' | 'autor' | 'genero' | 'paisAutor' | 'numeroPaginas' | 'anioEdicion' | 'precioLibro' | 'codigoLibro' | 'nombre' | 'apellidos' | 'noIdentificacion' | 'domicilio' | 'estado' | 'municipio' | 'fechaNacimiento' | 'codigoUsuario' | 'numeroPedido' | 'fechaSalida' | 'fechaMaxima' | 'fechaDevolucion' );
	public final gramConsultaParser.predicado_return predicado() throws RecognitionException {
		gramConsultaParser.predicado_return retval = new gramConsultaParser.predicado_return();
		retval.start = input.LT(1);

		try {
			// gramConsulta.g:86:10: ( 'nombreLibro' | 'editorial' | 'autor' | 'genero' | 'paisAutor' | 'numeroPaginas' | 'anioEdicion' | 'precioLibro' | 'codigoLibro' | 'nombre' | 'apellidos' | 'noIdentificacion' | 'domicilio' | 'estado' | 'municipio' | 'fechaNacimiento' | 'codigoUsuario' | 'numeroPedido' | 'fechaSalida' | 'fechaMaxima' | 'fechaDevolucion' )
			// gramConsulta.g:
			{
			if ( (input.LA(1) >= 7 && input.LA(1) <= 27) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicado"

	// Delegated rules



	public static final BitSet FOLLOW_tripleta_in_inicio36 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOF_in_inicio40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_tripleta55 = new BitSet(new long[]{0x000000000FFFFF80L});
	public static final BitSet FOLLOW_predicado_in_tripleta61 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_ID_in_tripleta68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_tripleta76 = new BitSet(new long[]{0x0000000000000002L});
}
