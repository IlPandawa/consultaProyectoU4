// $ANTLR 3.5.2 .\\gramConsulta.g 2024-12-04 19:06:17

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
	@Override public String getGrammarFileName() { return ".\\gramConsulta.g"; }


	    HashMap<String, String> variables = new HashMap<String, String>();
	    ArrayList<String> tripletas = new ArrayList<String>();
	    
	    private String generateJavaCode() {
	        StringBuilder code = new StringBuilder();
	        
	        // Imports
	        code.append("package classG00; \n\n");
	        code.append("import com.hp.hpl.jena.query.Query; \n");
	        code.append("import com.hp.hpl.jena.query.QueryExecution; \n");
	        code.append("import com.hp.hpl.jena.query.QueryExecutionFactory; \n");
	        code.append("import com.hp.hpl.jena.query.QueryFactory; \n");
	        code.append("import com.hp.hpl.jena.query.ResultSet; \n");
	        code.append("import com.hp.hpl.jena.query.ResultSetFormatter; \n");
	        code.append("import com.hp.hpl.jena.rdf.model.Model; \n");
	        code.append("import com.hp.hpl.jena.rdf.model.ModelFactory; \n");
	        code.append("import com.hp.hpl.jena.util.FileManager; \n");
	        
	        code.append("public class ConsultaBiblioteca {\n");
	        code.append("    private static final String MY_RDF_FILE = \"biblioteca.rdf\";\n\n");
	        code.append("    public static void main(String[] args) {\n");
	        code.append("        Model grafo = ModelFactory.createDefaultModel();\n");
	        code.append("        FileManager.get().readModel(grafo, MY_RDF_FILE);\n\n");
	        
	        // consulta tripletas
	        code.append("        String queryString = \"base <http://www.proyecto.com/biblioteca#>\" +\n");
	        code.append("            \"PREFIX biblioteca: <http://www.proyecto.com/biblioteca#> \" +\n");
	        code.append("            \"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \" +\n");
	        code.append("            \"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> \" +\n");
	        code.append("            \"SELECT * \" +\n");
	        code.append("            \"WHERE { \" +\n");
	        
	        // agrega la consulta
	        for(int i = 0; i < tripletas.size(); i++) {
	            code.append("            \"" + tripletas.get(i) + " \" +\n");
	        }
	        code.append("            \"} \";\n\n");

	        code.append("        Query consulta = QueryFactory.create(queryString);\n");
	        code.append("        QueryExecution consultaEj = QueryExecutionFactory.create(consulta, grafo);\n");
	        code.append("        ResultSet resultados = consultaEj.execSelect();\n");
	        code.append("        ResultSetFormatter.out(System.out, resultados);\n");
	        code.append("        consultaEj.close();\n");
	        code.append("    }\n");
	        code.append("}\n");
	        
	        //regresa el codigo java generado
	        return code.toString();
	    }



	// $ANTLR start "inicio"
	// .\\gramConsulta.g:64:1: inicio : ( tripleta )+ EOF ;
	public final void inicio() throws RecognitionException {
		try {
			// .\\gramConsulta.g:64:7: ( ( tripleta )+ EOF )
			// .\\gramConsulta.g:64:9: ( tripleta )+ EOF
			{
			// .\\gramConsulta.g:64:9: ( tripleta )+
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
					// .\\gramConsulta.g:64:10: tripleta
					{
					pushFollow(FOLLOW_tripleta_in_inicio35);
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

			match(input,EOF,FOLLOW_EOF_in_inicio39); 

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
	// .\\gramConsulta.g:69:1: tripleta : var1= ID pred= predicado (var2= ID |lit= LITERAL ) ;
	public final void tripleta() throws RecognitionException {
		Token var1=null;
		Token var2=null;
		Token lit=null;
		ParserRuleReturnScope pred =null;

		try {
			// .\\gramConsulta.g:69:9: (var1= ID pred= predicado (var2= ID |lit= LITERAL ) )
			// .\\gramConsulta.g:70:2: var1= ID pred= predicado (var2= ID |lit= LITERAL )
			{
			var1=(Token)match(input,ID,FOLLOW_ID_in_tripleta54); 
			pushFollow(FOLLOW_predicado_in_tripleta60);
			pred=predicado();
			state._fsp--;

			// .\\gramConsulta.g:70:29: (var2= ID |lit= LITERAL )
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
					// .\\gramConsulta.g:70:30: var2= ID
					{
					var2=(Token)match(input,ID,FOLLOW_ID_in_tripleta67); 
					}
					break;
				case 2 :
					// .\\gramConsulta.g:70:42: lit= LITERAL
					{
					lit=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_tripleta75); 
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
	// .\\gramConsulta.g:90:1: predicado : ( 'codigoLibro' 'nombreLibro' | 'editorial' | 'autor' | 'genero' | 'paisAutor' | 'numeroPaginas' | 'anioEdicion' | 'precioLibro' | 'nombre' | 'apellidos' | 'noIdentificacion' | 'domicilio' | 'estado' | 'municipio' | 'fechaNacimiento' | 'codigoUsuario' | 'numeroPedido' | 'fechaSalida' | 'fechaMaxima' | 'fechaDevolucion' );
	public final gramConsultaParser.predicado_return predicado() throws RecognitionException {
		gramConsultaParser.predicado_return retval = new gramConsultaParser.predicado_return();
		retval.start = input.LT(1);

		try {
			// .\\gramConsulta.g:90:10: ( 'codigoLibro' 'nombreLibro' | 'editorial' | 'autor' | 'genero' | 'paisAutor' | 'numeroPaginas' | 'anioEdicion' | 'precioLibro' | 'nombre' | 'apellidos' | 'noIdentificacion' | 'domicilio' | 'estado' | 'municipio' | 'fechaNacimiento' | 'codigoUsuario' | 'numeroPedido' | 'fechaSalida' | 'fechaMaxima' | 'fechaDevolucion' )
			int alt3=20;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt3=1;
				}
				break;
			case 13:
				{
				alt3=2;
				}
				break;
			case 9:
				{
				alt3=3;
				}
				break;
			case 19:
				{
				alt3=4;
				}
				break;
			case 26:
				{
				alt3=5;
				}
				break;
			case 24:
				{
				alt3=6;
				}
				break;
			case 7:
				{
				alt3=7;
				}
				break;
			case 27:
				{
				alt3=8;
				}
				break;
			case 22:
				{
				alt3=9;
				}
				break;
			case 8:
				{
				alt3=10;
				}
				break;
			case 21:
				{
				alt3=11;
				}
				break;
			case 12:
				{
				alt3=12;
				}
				break;
			case 14:
				{
				alt3=13;
				}
				break;
			case 20:
				{
				alt3=14;
				}
				break;
			case 17:
				{
				alt3=15;
				}
				break;
			case 11:
				{
				alt3=16;
				}
				break;
			case 25:
				{
				alt3=17;
				}
				break;
			case 18:
				{
				alt3=18;
				}
				break;
			case 16:
				{
				alt3=19;
				}
				break;
			case 15:
				{
				alt3=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// .\\gramConsulta.g:91:2: 'codigoLibro' 'nombreLibro'
					{
					match(input,10,FOLLOW_10_in_predicado87); 
					match(input,23,FOLLOW_23_in_predicado88); 
					}
					break;
				case 2 :
					// .\\gramConsulta.g:91:30: 'editorial'
					{
					match(input,13,FOLLOW_13_in_predicado91); 
					}
					break;
				case 3 :
					// .\\gramConsulta.g:91:43: 'autor'
					{
					match(input,9,FOLLOW_9_in_predicado94); 
					}
					break;
				case 4 :
					// .\\gramConsulta.g:91:52: 'genero'
					{
					match(input,19,FOLLOW_19_in_predicado97); 
					}
					break;
				case 5 :
					// .\\gramConsulta.g:91:62: 'paisAutor'
					{
					match(input,26,FOLLOW_26_in_predicado100); 
					}
					break;
				case 6 :
					// .\\gramConsulta.g:91:75: 'numeroPaginas'
					{
					match(input,24,FOLLOW_24_in_predicado103); 
					}
					break;
				case 7 :
					// .\\gramConsulta.g:91:92: 'anioEdicion'
					{
					match(input,7,FOLLOW_7_in_predicado106); 
					}
					break;
				case 8 :
					// .\\gramConsulta.g:91:107: 'precioLibro'
					{
					match(input,27,FOLLOW_27_in_predicado109); 
					/* LIBRO */
					}
					break;
				case 9 :
					// .\\gramConsulta.g:92:4: 'nombre'
					{
					match(input,22,FOLLOW_22_in_predicado116); 
					}
					break;
				case 10 :
					// .\\gramConsulta.g:92:14: 'apellidos'
					{
					match(input,8,FOLLOW_8_in_predicado119); 
					}
					break;
				case 11 :
					// .\\gramConsulta.g:92:27: 'noIdentificacion'
					{
					match(input,21,FOLLOW_21_in_predicado122); 
					}
					break;
				case 12 :
					// .\\gramConsulta.g:92:47: 'domicilio'
					{
					match(input,12,FOLLOW_12_in_predicado125); 
					}
					break;
				case 13 :
					// .\\gramConsulta.g:92:60: 'estado'
					{
					match(input,14,FOLLOW_14_in_predicado128); 
					}
					break;
				case 14 :
					// .\\gramConsulta.g:92:70: 'municipio'
					{
					match(input,20,FOLLOW_20_in_predicado131); 
					}
					break;
				case 15 :
					// .\\gramConsulta.g:92:83: 'fechaNacimiento'
					{
					match(input,17,FOLLOW_17_in_predicado134); 
					/* USUARIO */
					}
					break;
				case 16 :
					// .\\gramConsulta.g:93:4: 'codigoUsuario'
					{
					match(input,11,FOLLOW_11_in_predicado141); 
					}
					break;
				case 17 :
					// .\\gramConsulta.g:93:21: 'numeroPedido'
					{
					match(input,25,FOLLOW_25_in_predicado144); 
					}
					break;
				case 18 :
					// .\\gramConsulta.g:93:37: 'fechaSalida'
					{
					match(input,18,FOLLOW_18_in_predicado147); 
					}
					break;
				case 19 :
					// .\\gramConsulta.g:93:52: 'fechaMaxima'
					{
					match(input,16,FOLLOW_16_in_predicado150); 
					}
					break;
				case 20 :
					// .\\gramConsulta.g:93:67: 'fechaDevolucion'
					{
					match(input,15,FOLLOW_15_in_predicado153); 
					/* PRESTAMO */
					}
					break;

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



	public static final BitSet FOLLOW_tripleta_in_inicio35 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOF_in_inicio39 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_tripleta54 = new BitSet(new long[]{0x000000000F7FFF80L});
	public static final BitSet FOLLOW_predicado_in_tripleta60 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_ID_in_tripleta67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_tripleta75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_predicado87 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_predicado88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_predicado91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_predicado94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_predicado97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_predicado100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_predicado103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_predicado106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_predicado109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_predicado116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_predicado119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_predicado122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_predicado125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_predicado128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_predicado131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_predicado134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_predicado141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_predicado144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_predicado147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_predicado150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_predicado153 = new BitSet(new long[]{0x0000000000000002L});
}
