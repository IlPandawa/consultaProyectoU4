package com.mycompany.proyectocompilador.antlrG00;

// $ANTLR 3.5.2 .\\biblioteca.g 2024-11-15 12:45:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class bibliotecaParser extends Parser {
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "DATE", "DOUBLE", "INT", 
		"STRING", "WS", "'Libros'", "'Prestamos'", "'Usuarios'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int COMMA=4;
	public static final int DATE=5;
	public static final int DOUBLE=6;
	public static final int INT=7;
	public static final int STRING=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public bibliotecaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public bibliotecaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return bibliotecaParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\biblioteca.g"; }



	// $ANTLR start "inicio"
	// .\\biblioteca.g:3:1: inicio : ( seccion )+ ;
	public final void inicio() throws RecognitionException {
		try {
			// .\\biblioteca.g:3:7: ( ( seccion )+ )
			// .\\biblioteca.g:3:9: ( seccion )+
			{
			// .\\biblioteca.g:3:9: ( seccion )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 10 && LA1_0 <= 12)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\biblioteca.g:3:9: seccion
					{
					pushFollow(FOLLOW_seccion_in_inicio9);
					seccion();
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



	// $ANTLR start "seccion"
	// .\\biblioteca.g:6:1: seccion : ( 'Libros' ( registrosLibros )? ( WS )? | 'Usuarios' ( registrosUsuarios )? ( WS )? | 'Prestamos' ( registrosPrestamos )? ( WS )? );
	public final void seccion() throws RecognitionException {
		try {
			// .\\biblioteca.g:7:5: ( 'Libros' ( registrosLibros )? ( WS )? | 'Usuarios' ( registrosUsuarios )? ( WS )? | 'Prestamos' ( registrosPrestamos )? ( WS )? )
			int alt8=3;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt8=1;
				}
				break;
			case 12:
				{
				alt8=2;
				}
				break;
			case 11:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// .\\biblioteca.g:7:7: 'Libros' ( registrosLibros )? ( WS )?
					{
					match(input,10,FOLLOW_10_in_seccion23); 
					// .\\biblioteca.g:7:16: ( registrosLibros )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==INT) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// .\\biblioteca.g:7:16: registrosLibros
							{
							pushFollow(FOLLOW_registrosLibros_in_seccion25);
							registrosLibros();
							state._fsp--;

							}
							break;

					}

					// .\\biblioteca.g:7:34: ( WS )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==WS) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// .\\biblioteca.g:7:34: WS
							{
							match(input,WS,FOLLOW_WS_in_seccion29); 
							}
							break;

					}

					}
					break;
				case 2 :
					// .\\biblioteca.g:8:7: 'Usuarios' ( registrosUsuarios )? ( WS )?
					{
					match(input,12,FOLLOW_12_in_seccion38); 
					// .\\biblioteca.g:8:18: ( registrosUsuarios )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==INT) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// .\\biblioteca.g:8:18: registrosUsuarios
							{
							pushFollow(FOLLOW_registrosUsuarios_in_seccion40);
							registrosUsuarios();
							state._fsp--;

							}
							break;

					}

					// .\\biblioteca.g:8:38: ( WS )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==WS) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// .\\biblioteca.g:8:38: WS
							{
							match(input,WS,FOLLOW_WS_in_seccion44); 
							}
							break;

					}

					}
					break;
				case 3 :
					// .\\biblioteca.g:9:7: 'Prestamos' ( registrosPrestamos )? ( WS )?
					{
					match(input,11,FOLLOW_11_in_seccion53); 
					// .\\biblioteca.g:9:20: ( registrosPrestamos )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==INT) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// .\\biblioteca.g:9:20: registrosPrestamos
							{
							pushFollow(FOLLOW_registrosPrestamos_in_seccion56);
							registrosPrestamos();
							state._fsp--;

							}
							break;

					}

					// .\\biblioteca.g:9:41: ( WS )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==WS) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// .\\biblioteca.g:9:41: WS
							{
							match(input,WS,FOLLOW_WS_in_seccion60); 
							}
							break;

					}

					}
					break;

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
	// $ANTLR end "seccion"



	// $ANTLR start "registrosLibros"
	// .\\biblioteca.g:13:1: registrosLibros : ( libro )+ ;
	public final void registrosLibros() throws RecognitionException {
		try {
			// .\\biblioteca.g:13:16: ( ( libro )+ )
			// .\\biblioteca.g:13:18: ( libro )+
			{
			// .\\biblioteca.g:13:18: ( libro )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==INT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// .\\biblioteca.g:13:19: libro
					{
					pushFollow(FOLLOW_libro_in_registrosLibros75);
					libro();
					state._fsp--;

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
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
	// $ANTLR end "registrosLibros"



	// $ANTLR start "libro"
	// .\\biblioteca.g:15:1: libro : id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE ;
	public final void libro() throws RecognitionException {
		Token id=null;
		Token nombre=null;
		Token editorial=null;
		Token autor=null;
		Token genero=null;
		Token paisAutor=null;
		Token numeroPaginas=null;
		Token anioEdicion=null;
		Token precio=null;

		try {
			// .\\biblioteca.g:16:5: (id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE )
			// .\\biblioteca.g:16:7: id= INT COMMA nombre= STRING COMMA editorial= STRING COMMA autor= STRING COMMA genero= STRING COMMA paisAutor= STRING COMMA numeroPaginas= INT COMMA anioEdicion= DATE COMMA precio= DOUBLE
			{
			id=(Token)match(input,INT,FOLLOW_INT_in_libro91); 
			match(input,COMMA,FOLLOW_COMMA_in_libro93); 
			nombre=(Token)match(input,STRING,FOLLOW_STRING_in_libro103); 
			match(input,COMMA,FOLLOW_COMMA_in_libro105); 
			editorial=(Token)match(input,STRING,FOLLOW_STRING_in_libro115); 
			match(input,COMMA,FOLLOW_COMMA_in_libro117); 
			autor=(Token)match(input,STRING,FOLLOW_STRING_in_libro127); 
			match(input,COMMA,FOLLOW_COMMA_in_libro129); 
			genero=(Token)match(input,STRING,FOLLOW_STRING_in_libro139); 
			match(input,COMMA,FOLLOW_COMMA_in_libro141); 
			paisAutor=(Token)match(input,STRING,FOLLOW_STRING_in_libro151); 
			match(input,COMMA,FOLLOW_COMMA_in_libro153); 
			numeroPaginas=(Token)match(input,INT,FOLLOW_INT_in_libro163); 
			match(input,COMMA,FOLLOW_COMMA_in_libro165); 
			anioEdicion=(Token)match(input,DATE,FOLLOW_DATE_in_libro175); 
			match(input,COMMA,FOLLOW_COMMA_in_libro177); 
			precio=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_libro187); 

			        // Generar RDF para el libro
			        System.out.println("<!-- Instancia libro -->");
			        System.out.println("<rdf:Description rdf:about=\"#codigoLibro "+(id!=null?id.getText():null)+"\">");
			        System.out.println("  <rdf:type rdf:resource=\"#Libro\" />");
			        System.out.println("  <biblioteca:nombreLibro>"+(nombre!=null?nombre.getText():null)+"</biblioteca:nombreLibro>");
			        System.out.println("  <biblioteca:editorial>"+(editorial!=null?editorial.getText():null)+"</biblioteca:editorial>");
			        System.out.println("  <biblioteca:autor>"+(autor!=null?autor.getText():null)+"</biblioteca:autor>");
			        System.out.println("  <biblioteca:genero>"+(genero!=null?genero.getText():null)+"</biblioteca:genero>");
			        System.out.println("  <biblioteca:paisAutor>"+(paisAutor!=null?paisAutor.getText():null)+"</biblioteca:paisAutor>");
			        System.out.println("  <biblioteca:numeroPaginas>"+(numeroPaginas!=null?numeroPaginas.getText():null)+"</biblioteca:numeroPaginas>");
			        System.out.println("  <biblioteca:anioEdicion>"+(anioEdicion!=null?anioEdicion.getText():null)+"</biblioteca:anioEdicion>");
			        System.out.println("  <biblioteca:precioLibro>"+(precio!=null?precio.getText():null)+"</biblioteca:precioLibro>");
			        System.out.println("</rdf:Description>\n");
                                // Generar RDF para el libro
salida.append("<!-- Instancia libro -->\n");
salida.append("<rdf:Description rdf:about=\"#codigoLibro " + (id != null ? id.getText() : "") + "\">\n");
salida.append("  <rdf:type rdf:resource=\"#Libro\" />\n");
salida.append("  <biblioteca:nombreLibro>" + (nombre != null ? nombre.getText() : "") + "</biblioteca:nombreLibro>\n");
salida.append("  <biblioteca:editorial>" + (editorial != null ? editorial.getText() : "") + "</biblioteca:editorial>\n");
salida.append("  <biblioteca:autor>" + (autor != null ? autor.getText() : "") + "</biblioteca:autor>\n");
salida.append("  <biblioteca:genero>" + (genero != null ? genero.getText() : "") + "</biblioteca:genero>\n");
salida.append("  <biblioteca:paisAutor>" + (paisAutor != null ? paisAutor.getText() : "") + "</biblioteca:paisAutor>\n");
salida.append("  <biblioteca:numeroPaginas>" + (numeroPaginas != null ? numeroPaginas.getText() : "") + "</biblioteca:numeroPaginas>\n");
salida.append("  <biblioteca:anioEdicion>" + (anioEdicion != null ? anioEdicion.getText() : "") + "</biblioteca:anioEdicion>\n");
salida.append("  <biblioteca:precioLibro>" + (precio != null ? precio.getText() : "") + "</biblioteca:precioLibro>\n");
salida.append("</rdf:Description>\n\n");

			    
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
	// $ANTLR end "libro"



	// $ANTLR start "registrosUsuarios"
	// .\\biblioteca.g:42:1: registrosUsuarios : ( usuario )+ ;
	public final void registrosUsuarios() throws RecognitionException {
		try {
			// .\\biblioteca.g:42:18: ( ( usuario )+ )
			// .\\biblioteca.g:42:20: ( usuario )+
			{
			// .\\biblioteca.g:42:20: ( usuario )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==INT) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// .\\biblioteca.g:42:21: usuario
					{
					pushFollow(FOLLOW_usuario_in_registrosUsuarios202);
					usuario();
					state._fsp--;

					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
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
	// $ANTLR end "registrosUsuarios"



	// $ANTLR start "usuario"
	// .\\biblioteca.g:44:1: usuario : id= INT COMMA nombre= STRING COMMA apellido= STRING COMMA ine= INT COMMA domicilio= STRING COMMA estado= STRING COMMA municipio= STRING COMMA nacimiento= DATE ;
	public final void usuario() throws RecognitionException {
		Token id=null;
		Token nombre=null;
		Token apellido=null;
		Token ine=null;
		Token domicilio=null;
		Token estado=null;
		Token municipio=null;
		Token nacimiento=null;

		try {
			// .\\biblioteca.g:44:8: (id= INT COMMA nombre= STRING COMMA apellido= STRING COMMA ine= INT COMMA domicilio= STRING COMMA estado= STRING COMMA municipio= STRING COMMA nacimiento= DATE )
			// .\\biblioteca.g:45:7: id= INT COMMA nombre= STRING COMMA apellido= STRING COMMA ine= INT COMMA domicilio= STRING COMMA estado= STRING COMMA municipio= STRING COMMA nacimiento= DATE
			{
			id=(Token)match(input,INT,FOLLOW_INT_in_usuario220); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario222); 
			nombre=(Token)match(input,STRING,FOLLOW_STRING_in_usuario232); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario234); 
			apellido=(Token)match(input,STRING,FOLLOW_STRING_in_usuario244); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario246); 
			ine=(Token)match(input,INT,FOLLOW_INT_in_usuario256); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario258); 
			domicilio=(Token)match(input,STRING,FOLLOW_STRING_in_usuario268); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario270); 
			estado=(Token)match(input,STRING,FOLLOW_STRING_in_usuario280); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario282); 
			municipio=(Token)match(input,STRING,FOLLOW_STRING_in_usuario292); 
			match(input,COMMA,FOLLOW_COMMA_in_usuario294); 
			nacimiento=(Token)match(input,DATE,FOLLOW_DATE_in_usuario304); 

			        // Generar RDF para el usuario
			        System.out.println("<!-- Instancia usuario -->");
			        System.out.println("<rdf:Description rdf:about=\"#"+(id!=null?id.getText():null)+"\">");
			        System.out.println("  <rdf:type rdf:resource=\"#Usuario\" />");
			        System.out.println("  <biblioteca:nombre>"+(nombre!=null?nombre.getText():null)+"</biblioteca:nombre>");
			        System.out.println("  <biblioteca:apellidos>"+(apellido!=null?apellido.getText():null)+"</biblioteca:apellidos>");
			        System.out.println("  <biblioteca:noIdentificacion>"+(ine!=null?ine.getText():null)+"</biblioteca:noIdentificacion>");
			        System.out.println("  <biblioteca:domicilio>"+(domicilio!=null?domicilio.getText():null)+"</biblioteca:domicilio>");
			        System.out.println("  <biblioteca:estado>"+(estado!=null?estado.getText():null)+"</biblioteca:estado>");
			        System.out.println("  <biblioteca:municipio>"+(municipio!=null?municipio.getText():null)+"</biblioteca:municipio>");
			        System.out.println("  <biblioteca:nacimiento>"+(nacimiento!=null?nacimiento.getText():null)+"</biblioteca:nacimiento>");
			        System.out.println("</rdf:Description>\n");
                                // Generar RDF para el usuario
salida.append("<!-- Instancia usuario -->\n");
salida.append("<rdf:Description rdf:about=\"#" + (id != null ? id.getText() : "") + "\">\n");
salida.append("  <rdf:type rdf:resource=\"#Usuario\" />\n");
salida.append("  <biblioteca:nombre>" + (nombre != null ? nombre.getText() : "") + "</biblioteca:nombre>\n");
salida.append("  <biblioteca:apellidos>" + (apellido != null ? apellido.getText() : "") + "</biblioteca:apellidos>\n");
salida.append("  <biblioteca:noIdentificacion>" + (ine != null ? ine.getText() : "") + "</biblioteca:noIdentificacion>\n");
salida.append("  <biblioteca:domicilio>" + (domicilio != null ? domicilio.getText() : "") + "</biblioteca:domicilio>\n");
salida.append("  <biblioteca:estado>" + (estado != null ? estado.getText() : "") + "</biblioteca:estado>\n");
salida.append("  <biblioteca:municipio>" + (municipio != null ? municipio.getText() : "") + "</biblioteca:municipio>\n");
salida.append("  <biblioteca:nacimiento>" + (nacimiento != null ? nacimiento.getText() : "") + "</biblioteca:nacimiento>\n");
salida.append("</rdf:Description>\n\n");

			    
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
	// $ANTLR end "usuario"



	// $ANTLR start "registrosPrestamos"
	// .\\biblioteca.g:69:1: registrosPrestamos : ( prestamo )+ ;
	public final void registrosPrestamos() throws RecognitionException {
		try {
			// .\\biblioteca.g:69:19: ( ( prestamo )+ )
			// .\\biblioteca.g:69:21: ( prestamo )+
			{
			// .\\biblioteca.g:69:21: ( prestamo )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==INT) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// .\\biblioteca.g:69:22: prestamo
					{
					pushFollow(FOLLOW_prestamo_in_registrosPrestamos319);
					prestamo();
					state._fsp--;

					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
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
	// $ANTLR end "registrosPrestamos"



	// $ANTLR start "prestamo"
	// .\\biblioteca.g:71:1: prestamo : numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE ;
	public final void prestamo() throws RecognitionException {
		Token numeroPedido=null;
		Token codigoLibro=null;
		Token codigoUsuario=null;
		Token fechaSalida=null;
		Token fechaMaxima=null;
		Token fechaDevolucion=null;

		try {
			// .\\biblioteca.g:71:9: (numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE )
			// .\\biblioteca.g:72:7: numeroPedido= INT COMMA codigoLibro= INT COMMA codigoUsuario= INT COMMA fechaSalida= DATE COMMA fechaMaxima= DATE COMMA fechaDevolucion= DATE
			{
			numeroPedido=(Token)match(input,INT,FOLLOW_INT_in_prestamo336); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo338); 
			codigoLibro=(Token)match(input,INT,FOLLOW_INT_in_prestamo348); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo350); 
			codigoUsuario=(Token)match(input,INT,FOLLOW_INT_in_prestamo360); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo362); 
			fechaSalida=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo372); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo374); 
			fechaMaxima=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo384); 
			match(input,COMMA,FOLLOW_COMMA_in_prestamo386); 
			fechaDevolucion=(Token)match(input,DATE,FOLLOW_DATE_in_prestamo396); 

			        // Generar RDF para el préstamo
			        System.out.println("<!-- Instancia prestamo -->");
			        System.out.println("<rdf:Description rdf:about=\"#numeroPedido "+(codigoLibro!=null?codigoLibro.getText():null)+"\">");
			        System.out.println("  <rdf:type rdf:resource=\"#Prestamo\" />");
			        System.out.println("  <biblioteca:codigoLibro>"+(codigoLibro!=null?codigoLibro.getText():null)+"</biblioteca:codigoLibro>");
			        System.out.println("  <biblioteca:codigoUsuario>"+(codigoUsuario!=null?codigoUsuario.getText():null)+"</biblioteca:codigoUsuario>");
			        System.out.println("  <biblioteca:fechaSalida>"+(fechaSalida!=null?fechaSalida.getText():null)+"</biblioteca:fechaSalida>");
			        System.out.println("  <biblioteca:fechaMaxima>"+(fechaMaxima!=null?fechaMaxima.getText():null)+"</biblioteca:fechaMaxima>");
			        System.out.println("  <biblioteca:fechaDevolucion>"+(fechaDevolucion!=null?fechaDevolucion.getText():null)+"</biblioteca:fechaDevolucion>");
			        System.out.println("</rdf:Description>\n");
			    
                                // Generar RDF para el préstamo
salida.append("<!-- Instancia prestamo -->\n");
salida.append("<rdf:Description rdf:about=\"#numeroPedido " + (codigoLibro != null ? codigoLibro.getText() : "") + "\">\n");
salida.append("  <rdf:type rdf:resource=\"#Prestamo\" />\n");
salida.append("  <biblioteca:codigoLibro>" + (codigoLibro != null ? codigoLibro.getText() : "") + "</biblioteca:codigoLibro>\n");
salida.append("  <biblioteca:codigoUsuario>" + (codigoUsuario != null ? codigoUsuario.getText() : "") + "</biblioteca:codigoUsuario>\n");
salida.append("  <biblioteca:fechaSalida>" + (fechaSalida != null ? fechaSalida.getText() : "") + "</biblioteca:fechaSalida>\n");
salida.append("  <biblioteca:fechaMaxima>" + (fechaMaxima != null ? fechaMaxima.getText() : "") + "</biblioteca:fechaMaxima>\n");
salida.append("  <biblioteca:fechaDevolucion>" + (fechaDevolucion != null ? fechaDevolucion.getText() : "") + "</biblioteca:fechaDevolucion>\n");
salida.append("</rdf:Description>\n\n");

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
	// $ANTLR end "prestamo"

	// Delegated rules



	public static final BitSet FOLLOW_seccion_in_inicio9 = new BitSet(new long[]{0x0000000000001C02L});
	public static final BitSet FOLLOW_10_in_seccion23 = new BitSet(new long[]{0x0000000000000282L});
	public static final BitSet FOLLOW_registrosLibros_in_seccion25 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_WS_in_seccion29 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_seccion38 = new BitSet(new long[]{0x0000000000000282L});
	public static final BitSet FOLLOW_registrosUsuarios_in_seccion40 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_WS_in_seccion44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_seccion53 = new BitSet(new long[]{0x0000000000000282L});
	public static final BitSet FOLLOW_registrosPrestamos_in_seccion56 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_WS_in_seccion60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_libro_in_registrosLibros75 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_libro91 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro93 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro103 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro105 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro115 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro117 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro127 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro129 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro139 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro141 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_libro151 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro153 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_libro163 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro165 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_libro175 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_libro177 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DOUBLE_in_libro187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usuario_in_registrosUsuarios202 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_usuario220 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario222 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario232 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario234 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario244 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario246 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_usuario256 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario258 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario268 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario270 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario280 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario282 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_usuario292 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_usuario294 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_usuario304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prestamo_in_registrosPrestamos319 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_prestamo336 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo338 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_prestamo348 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo350 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_prestamo360 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo362 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo372 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo374 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo384 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_prestamo386 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_in_prestamo396 = new BitSet(new long[]{0x0000000000000002L});
}
