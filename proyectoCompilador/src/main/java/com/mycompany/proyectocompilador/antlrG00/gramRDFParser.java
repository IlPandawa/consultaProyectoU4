package com.mycompany.proyectocompilador.antlrG00;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramRDFParser extends Parser {
     private javax.swing.JTextArea salida;

    public void setSalida(javax.swing.JTextArea _salida) {
        salida = _salida;
    }
    public int i;

    public boolean isSalidaVacio() {
    if (salida != null) {
        String texto = salida.getText().trim();
        System.out.println("Texto actual del JTextArea: '" + texto + "'"); // Imprimir el texto para depurar
        return texto.isEmpty();
    }
    return true; // Si el JTextArea es null, se considera vacío
}

public javax.swing.JTextArea getSalida() {
    return salida;
}
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALFABETICO", "CERRAR", "CREAR", 
		"FECHA", "FIN", "ID", "INICIO", "NUMERICO", "TABLA", "WS"
	};
	public static final int EOF=-1;
	public static final int ALFABETICO=4;
	public static final int CERRAR=5;
	public static final int CREAR=6;
	public static final int FECHA=7;
	public static final int FIN=8;
	public static final int ID=9;
	public static final int INICIO=10;
	public static final int NUMERICO=11;
	public static final int TABLA=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public gramRDFParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramRDFParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return gramRDFParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\gramRDF.g"; }



	// $ANTLR start "inicio"
	// .\\gramRDF.g:3:1: inicio : creacion ( clase )+ cerrar ;
	public final void inicio() throws RecognitionException {
		try {
			// .\\gramRDF.g:3:7: ( creacion ( clase )+ cerrar )
			// .\\gramRDF.g:3:9: creacion ( clase )+ cerrar
			{
			pushFollow(FOLLOW_creacion_in_inicio9);
			creacion();
			state._fsp--;

			// .\\gramRDF.g:3:18: ( clase )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==TABLA) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\gramRDF.g:3:18: clase
					{
					pushFollow(FOLLOW_clase_in_inicio11);
					clase();
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

			pushFollow(FOLLOW_cerrar_in_inicio14);
			cerrar();
			state._fsp--;

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



	// $ANTLR start "creacion"
	// .\\gramRDF.g:5:1: creacion : CREAR ID ;
	public final void creacion() throws RecognitionException {
		Token ID1=null;

		try {
			// .\\gramRDF.g:5:9: ( CREAR ID )
			// .\\gramRDF.g:6:5: CREAR ID
			{
			match(input,CREAR,FOLLOW_CREAR_in_creacion26); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_creacion28); 

			        System.out.println("<?xml version=\"1.0\"?>");
			        System.out.println();
			        System.out.println("<!DOCTYPE rdf:RDF [<!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\">]>");
			        System.out.println();
			        System.out.println("<rdf:RDF ");
			        System.out.println("     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"");
			        System.out.println("     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"");
			        System.out.println("     xmlns:"+(ID1!=null?ID1.getText():null)+"=\"http://www.proyecto.com/"+(ID1!=null?ID1.getText():null)+"#\"");
			        System.out.println("     xml:base=\"http://www.proyecto.com/"+(ID1!=null?ID1.getText():null)+"#\">");
			        System.out.println();
			        System.out.println("<!-- Clases de la biblioteca -->");
                                
                                salida.append("<?xml version=\"1.0\"?>\n");
                                salida.append("<!DOCTYPE rdf:RDF [<!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\">]>\n");
                                salida.append("<rdf:RDF \n");
                                salida.append("     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n");
                                salida.append("     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n");
                                salida.append("     xmlns:"+(ID1!=null?ID1.getText():null)+"=\"http://www.proyecto.com/"+(ID1!=null?ID1.getText():null)+"#\"");
                                salida.append("     xml:base=\"http://www.proyecto.com/"+(ID1!=null?ID1.getText():null)+"#\">\n");
                                salida.append("<!-- Clases de la biblioteca -->\n");
                                salida.append("");
                                salida.append("\n");
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
	// $ANTLR end "creacion"



	// $ANTLR start "clase"
	// .\\gramRDF.g:20:1: clase : TABLA ID inicioPropiedad finPropiedad ;
	public final void clase() throws RecognitionException {
		Token ID2=null;

		try {
			// .\\gramRDF.g:20:6: ( TABLA ID inicioPropiedad finPropiedad )
			// .\\gramRDF.g:21:5: TABLA ID inicioPropiedad finPropiedad
			{
			match(input,TABLA,FOLLOW_TABLA_in_clase41); 
			ID2=(Token)match(input,ID,FOLLOW_ID_in_clase43); 
			pushFollow(FOLLOW_inicioPropiedad_in_clase45);
			inicioPropiedad();
			state._fsp--;

			pushFollow(FOLLOW_finPropiedad_in_clase47);
			finPropiedad();
			state._fsp--;


			        System.out.println("<rdfs:Class rdf:about=\"http://www.proyecto.com/biblioteca#"+(ID2!=null?ID2.getText():null)+"\"/>");
                                salida.append("<rdfs:Class rdf:about=\"http://www.proyecto.com/biblioteca#"+(ID2!=null?ID2.getText():null)+"\"/>\n");
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
	// $ANTLR end "clase"



	// $ANTLR start "inicioPropiedad"
	// .\\gramRDF.g:25:1: inicioPropiedad : INICIO ( propiedad )+ ;
	public final void inicioPropiedad() throws RecognitionException {
		try {
			// .\\gramRDF.g:25:16: ( INICIO ( propiedad )+ )
			// .\\gramRDF.g:26:5: INICIO ( propiedad )+
			{
			match(input,INICIO,FOLLOW_INICIO_in_inicioPropiedad60); 
			// .\\gramRDF.g:26:12: ( propiedad )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// .\\gramRDF.g:26:13: propiedad
					{
					pushFollow(FOLLOW_propiedad_in_inicioPropiedad63);
					propiedad();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

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
	// $ANTLR end "inicioPropiedad"



	// $ANTLR start "propiedad"
	// .\\gramRDF.g:28:1: propiedad : ID t= ( NUMERICO | ALFABETICO | FECHA ) ;
	public final void propiedad() throws RecognitionException {
		Token t=null;
		Token ID3=null;

		try {
			// .\\gramRDF.g:28:10: ( ID t= ( NUMERICO | ALFABETICO | FECHA ) )
			// .\\gramRDF.g:29:5: ID t= ( NUMERICO | ALFABETICO | FECHA )
			{
			ID3=(Token)match(input,ID,FOLLOW_ID_in_propiedad76); 
			t=input.LT(1);
			if ( input.LA(1)==ALFABETICO||input.LA(1)==FECHA||input.LA(1)==NUMERICO ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			        System.out.println("<!-- Propiedad: "+(ID3!=null?ID3.getText():null)+" -->");
			        System.out.println("<rdf:Property rdf:about=\"#"+(ID3!=null?ID3.getText():null)+"\">");
			        System.out.println("    <rdfs:domain rdf:resource=\"#"+ID3.getText()+"\"/>");
                                
                                salida.append("\n");
                                salida.append("<!-- Propiedad: "+(ID3!=null?ID3.getText():null)+" -->\n");
                                salida.append("<rdf:Property rdf:about=\"#"+(ID3!=null?ID3.getText():null)+"\">\n");

			        if ((t!=null?t.getText():null).equals("numeros")) {
			            System.out.println("    <rdfs:range rdf:resource=\"&xsd;integer\"/>");
                                    salida.append("    <rdfs:range rdf:resource=\"&xsd;integer\"/>\n");
			        } else if ((t!=null?t.getText():null).equals("letras")) {
			            System.out.println("    <rdfs:range rdf:resource=\"&xsd;string\"/>");
                                    salida.append("    <rdfs:range rdf:resource=\"&xsd;string\"/>\n");
			        } else if ((t!=null?t.getText():null).equals("fecha")) {
			            System.out.println("    <rdfs:range rdf:resource=\"&xsd;date\"/>");
                                    salida.append("    <rdfs:range rdf:resource=\"&xsd;date\"/>\n");
			        }

			        System.out.println("</rdf:Property>");
                                salida.append("</rdf:Property>\n");
			    
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
	// $ANTLR end "propiedad"



	// $ANTLR start "finPropiedad"
	// .\\gramRDF.g:45:1: finPropiedad : FIN ;
	public final void finPropiedad() throws RecognitionException {
		try {
			// .\\gramRDF.g:45:13: ( FIN )
			// .\\gramRDF.g:45:15: FIN
			{
			match(input,FIN,FOLLOW_FIN_in_finPropiedad95); 
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
	// $ANTLR end "finPropiedad"



	// $ANTLR start "cerrar"
	// .\\gramRDF.g:47:1: cerrar : CERRAR ;
	public final void cerrar() throws RecognitionException {
		try {
			// .\\gramRDF.g:47:7: ( CERRAR )
			// .\\gramRDF.g:48:5: CERRAR
			{
			match(input,CERRAR,FOLLOW_CERRAR_in_cerrar106); 

			        System.out.println("</rdf:RDF>");
                                salida.append("</rdf:RDF>\n");
			    
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
	// $ANTLR end "cerrar"

	// Delegated rules



	public static final BitSet FOLLOW_creacion_in_inicio9 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_clase_in_inicio11 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_cerrar_in_inicio14 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREAR_in_creacion26 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_creacion28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLA_in_clase41 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_clase43 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_inicioPropiedad_in_clase45 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_finPropiedad_in_clase47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INICIO_in_inicioPropiedad60 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_propiedad_in_inicioPropiedad63 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ID_in_propiedad76 = new BitSet(new long[]{0x0000000000000890L});
	public static final BitSet FOLLOW_set_in_propiedad80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIN_in_finPropiedad95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CERRAR_in_cerrar106 = new BitSet(new long[]{0x0000000000000002L});
}
