package com.mycompany.proyectocompilador.antlrG00;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class T2Parser extends Parser {

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
    public static final String[] tokenNames = new String[]{
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALFABETICO", "CERRAR", "CREAR",
        "FECHA", "FIN", "ID", "INICIO", "NUMERICO", "TABLA", "USAR", "WS"
    };
    public static final int EOF = -1;
    public static final int ALFABETICO = 4;
    public static final int CERRAR = 5;
    public static final int CREAR = 6;
    public static final int FECHA = 7;
    public static final int FIN = 8;
    public static final int ID = 9;
    public static final int INICIO = 10;
    public static final int NUMERICO = 11;
    public static final int TABLA = 12;
    public static final int USAR = 13;
    public static final int WS = 14;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[]{};
    }

    // delegators
    public T2Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public T2Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String[] getTokenNames() {
        return T2Parser.tokenNames;
    }

    @Override
    public String getGrammarFileName() {
        return ".\\T2.g";
    }

    // $ANTLR start "inicio"
    // .\\T2.g:3:1: inicio : creacion usar ( tabla )+ cerrar ;
    public final void inicio() throws RecognitionException {
        try {
            // .\\T2.g:3:7: ( creacion usar ( tabla )+ cerrar )
            // .\\T2.g:3:9: creacion usar ( tabla )+ cerrar
            {
                pushFollow(FOLLOW_creacion_in_inicio9);
                creacion();
                state._fsp--;

                pushFollow(FOLLOW_usar_in_inicio11);
                usar();
                state._fsp--;

                // .\\T2.g:3:23: ( tabla )+
                int cnt1 = 0;
                loop1:
                while (true) {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == TABLA)) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                        case 1: // .\\T2.g:3:23: tabla
                        {
                            pushFollow(FOLLOW_tabla_in_inicio13);
                            tabla();
                            state._fsp--;

                        }
                        break;

                        default:
                            if (cnt1 >= 1) {
                                break loop1;
                            }
                            EarlyExitException eee = new EarlyExitException(1, input);
                            throw eee;
                    }
                    cnt1++;
                }

                pushFollow(FOLLOW_cerrar_in_inicio16);
                cerrar();
                state._fsp--;

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "inicio"

    // $ANTLR start "creacion"
    // .\\T2.g:5:1: creacion : CREAR ID ;
    public final void creacion() throws RecognitionException {
        Token ID1 = null;

        try {
            // .\\T2.g:5:9: ( CREAR ID )
            // .\\T2.g:6:2: CREAR ID
            {
                match(input, CREAR, FOLLOW_CREAR_in_creacion24);
                ID1 = (Token) match(input, ID, FOLLOW_ID_in_creacion26);
                System.out.println("CREATE DATABASE " + (ID1 != null ? ID1.getText() : null));
                salida.append("CREATE DATABASE " + (ID1 != null ? ID1.getText() : null));
                
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "creacion"

    // $ANTLR start "usar"
    // .\\T2.g:9:1: usar : USAR ID ;
    public final void usar() throws RecognitionException {
        Token ID2 = null;

        try {
            // .\\T2.g:9:5: ( USAR ID )
            // .\\T2.g:9:7: USAR ID
            {
                match(input, USAR, FOLLOW_USAR_in_usar35);
                ID2 = (Token) match(input, ID, FOLLOW_ID_in_usar37);
                System.out.println("USE DATABASE " + (ID2 != null ? ID2.getText() : null));
                salida.append("\nUSE DATABASE " + (ID2 != null ? ID2.getText() : null));
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "usar"

    // $ANTLR start "tabla"
    // .\\T2.g:13:1: tabla : TABLA ID INICIO ( campo )+ FIN ;
    public final void tabla() throws RecognitionException {
        Token ID3 = null;

        try {
            // .\\T2.g:13:6: ( TABLA ID INICIO ( campo )+ FIN )
            // .\\T2.g:14:2: TABLA ID INICIO ( campo )+ FIN
            {
                match(input, TABLA, FOLLOW_TABLA_in_tabla49);
                ID3 = (Token) match(input, ID, FOLLOW_ID_in_tabla51);
                match(input, INICIO, FOLLOW_INICIO_in_tabla53);

                //código para generar SQL
                System.out.println("CREATE TABLE " + (ID3 != null ? ID3.getText() : null));
                System.out.println(" (" + (ID3 != null ? ID3.getText() : null) + "_key INTEGER AUTOINCREMENT NOT NULL");
                salida.append("\nCREATE TABLE " + (ID3 != null ? ID3.getText() : null));
                salida.append("\n (" + (ID3 != null ? ID3.getText() : null) + "_key INTEGER AUTOINCREMENT NOT NULL");

                // .\\T2.g:21:22: ( campo )+
                int cnt2 = 0;
                loop2:
                while (true) {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == ID)) {
                        alt2 = 1;
                    }

                    switch (alt2) {
                        case 1: // .\\T2.g:21:22: campo
                        {
                            pushFollow(FOLLOW_campo_in_tabla57);
                            campo();
                            state._fsp--;

                        }
                        break;

                        default:
                            if (cnt2 >= 1) {
                                break loop2;
                            }
                            EarlyExitException eee = new EarlyExitException(2, input);
                            throw eee;
                    }
                    cnt2++;
                }

                match(input, FIN, FOLLOW_FIN_in_tabla60);

                System.out.println("   );   ");
                salida.append("\n   );   ");
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "tabla"

    // $ANTLR start "campo"
    // .\\T2.g:25:1: campo : ID (t= NUMERICO |t= ALFABETICO |t= FECHA ) ;
    public final void campo() throws RecognitionException {
        Token t = null;
        Token ID4 = null;

        try {
            // .\\T2.g:25:6: ( ID (t= NUMERICO |t= ALFABETICO |t= FECHA ) )
            // .\\T2.g:26:2: ID (t= NUMERICO |t= ALFABETICO |t= FECHA )
            {
                ID4 = (Token) match(input, ID, FOLLOW_ID_in_campo70);
                // .\\T2.g:26:5: (t= NUMERICO |t= ALFABETICO |t= FECHA )
                int alt3 = 3;
                switch (input.LA(1)) {
                    case NUMERICO: {
                        alt3 = 1;
                    }
                    break;
                    case ALFABETICO: {
                        alt3 = 2;
                    }
                    break;
                    case FECHA: {
                        alt3 = 3;
                    }
                    break;
                    default:
                        NoViableAltException nvae
                                = new NoViableAltException("", 3, 0, input);
                        throw nvae;
                }
                switch (alt3) {
                    case 1: // .\\T2.g:26:6: t= NUMERICO
                    {
                        t = (Token) match(input, NUMERICO, FOLLOW_NUMERICO_in_campo77);
                    }
                    break;
                    case 2: // .\\T2.g:26:21: t= ALFABETICO
                    {
                        t = (Token) match(input, ALFABETICO, FOLLOW_ALFABETICO_in_campo85);
                    }
                    break;
                    case 3: // .\\T2.g:26:38: t= FECHA
                    {
                        t = (Token) match(input, FECHA, FOLLOW_FECHA_in_campo93);
                    }
                    break;

                }

                //aquí hay que agregar código para generar SQL
                if (((t != null ? t.getText() : null)).compareTo("letras") == 0) {
                    System.out.println("\n, " + (ID4 != null ? ID4.getText() : null) + " VARCHAR(300)");
                    salida.append("\n, " + (ID4 != null ? ID4.getText() : null) + " VARCHAR(300)");
                } else if (((t != null ? t.getText() : null)).compareTo("numeros") == 0) {
                    System.out.println("\n, " + (ID4 != null ? ID4.getText() : null) + " INTEGER");
                    salida.append("\n, " + (ID4 != null ? ID4.getText() : null) + " INTEGER");
                } else if (((t != null ? t.getText() : null)).compareTo("fecha") == 0) {
                    System.out.println(", " + (ID4 != null ? ID4.getText() : null) + " DATE");
                    salida.append("\n, " + (ID4 != null ? ID4.getText() : null) + " DATE");
                } else {
                    System.out.println(", " + (ID4 != null ? ID4.getText() : null) + " " + (t != null ? t.getText() : null));
                    salida.append("\n, " + (ID4 != null ? ID4.getText() : null) + " " + (t != null ? t.getText() : null));
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "campo"

    // $ANTLR start "cerrar"
    // .\\T2.g:37:1: cerrar : CERRAR ;
    public final void cerrar() throws RecognitionException {
        try {
            // .\\T2.g:37:7: ( CERRAR )
            // .\\T2.g:37:9: CERRAR
            {
                match(input, CERRAR, FOLLOW_CERRAR_in_cerrar103);
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "cerrar"

    // Delegated rules
    public static final BitSet FOLLOW_creacion_in_inicio9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_usar_in_inicio11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_tabla_in_inicio13 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_cerrar_in_inicio16 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREAR_in_creacion24 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_creacion26 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USAR_in_usar35 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_usar37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLA_in_tabla49 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_tabla51 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INICIO_in_tabla53 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_campo_in_tabla57 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_FIN_in_tabla60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_campo70 = new BitSet(new long[]{0x0000000000000890L});
    public static final BitSet FOLLOW_NUMERICO_in_campo77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALFABETICO_in_campo85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FECHA_in_campo93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CERRAR_in_cerrar103 = new BitSet(new long[]{0x0000000000000002L});
}
