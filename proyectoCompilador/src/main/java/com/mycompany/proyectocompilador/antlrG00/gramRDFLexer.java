package com.mycompany.proyectocompilador.antlrG00;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramRDFLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public gramRDFLexer() {} 
	public gramRDFLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramRDFLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return ".\\gramRDF.g"; }

	// $ANTLR start "CERRAR"
	public final void mCERRAR() throws RecognitionException {
		try {
			int _type = CERRAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:53:7: ( 'cerrar' )
			// .\\gramRDF.g:53:9: 'cerrar'
			{
			match("cerrar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CERRAR"

	// $ANTLR start "NUMERICO"
	public final void mNUMERICO() throws RecognitionException {
		try {
			int _type = NUMERICO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:54:9: ( 'numeros' )
			// .\\gramRDF.g:54:11: 'numeros'
			{
			match("numeros"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERICO"

	// $ANTLR start "ALFABETICO"
	public final void mALFABETICO() throws RecognitionException {
		try {
			int _type = ALFABETICO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:55:11: ( 'letras' )
			// .\\gramRDF.g:55:13: 'letras'
			{
			match("letras"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALFABETICO"

	// $ANTLR start "FECHA"
	public final void mFECHA() throws RecognitionException {
		try {
			int _type = FECHA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:56:6: ( 'fecha' )
			// .\\gramRDF.g:56:8: 'fecha'
			{
			match("fecha"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FECHA"

	// $ANTLR start "TABLA"
	public final void mTABLA() throws RecognitionException {
		try {
			int _type = TABLA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:57:6: ( 'tabla' )
			// .\\gramRDF.g:57:8: 'tabla'
			{
			match("tabla"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TABLA"

	// $ANTLR start "INICIO"
	public final void mINICIO() throws RecognitionException {
		try {
			int _type = INICIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:58:7: ( 'inicio' )
			// .\\gramRDF.g:58:9: 'inicio'
			{
			match("inicio"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INICIO"

	// $ANTLR start "FIN"
	public final void mFIN() throws RecognitionException {
		try {
			int _type = FIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:59:4: ( 'fin' )
			// .\\gramRDF.g:59:6: 'fin'
			{
			match("fin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN"

	// $ANTLR start "CREAR"
	public final void mCREAR() throws RecognitionException {
		try {
			int _type = CREAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:60:6: ( 'crear' )
			// .\\gramRDF.g:60:8: 'crear'
			{
			match("crear"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREAR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:61:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// .\\gramRDF.g:61:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// .\\gramRDF.g:61:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\gramRDF.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\gramRDF.g:62:3: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// .\\gramRDF.g:62:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// .\\gramRDF.g:62:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// .\\gramRDF.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// .\\gramRDF.g:1:8: ( CERRAR | NUMERICO | ALFABETICO | FECHA | TABLA | INICIO | FIN | CREAR | ID | WS )
		int alt3=10;
		switch ( input.LA(1) ) {
		case 'c':
			{
			switch ( input.LA(2) ) {
			case 'e':
				{
				int LA3_9 = input.LA(3);
				if ( (LA3_9=='r') ) {
					int LA3_17 = input.LA(4);
					if ( (LA3_17=='r') ) {
						int LA3_25 = input.LA(5);
						if ( (LA3_25=='a') ) {
							int LA3_33 = input.LA(6);
							if ( (LA3_33=='r') ) {
								int LA3_40 = input.LA(7);
								if ( ((LA3_40 >= '0' && LA3_40 <= '9')||(LA3_40 >= 'A' && LA3_40 <= 'Z')||LA3_40=='_'||(LA3_40 >= 'a' && LA3_40 <= 'z')) ) {
									alt3=9;
								}

								else {
									alt3=1;
								}

							}

							else {
								alt3=9;
							}

						}

						else {
							alt3=9;
						}

					}

					else {
						alt3=9;
					}

				}

				else {
					alt3=9;
				}

				}
				break;
			case 'r':
				{
				int LA3_10 = input.LA(3);
				if ( (LA3_10=='e') ) {
					int LA3_18 = input.LA(4);
					if ( (LA3_18=='a') ) {
						int LA3_26 = input.LA(5);
						if ( (LA3_26=='r') ) {
							int LA3_34 = input.LA(6);
							if ( ((LA3_34 >= '0' && LA3_34 <= '9')||(LA3_34 >= 'A' && LA3_34 <= 'Z')||LA3_34=='_'||(LA3_34 >= 'a' && LA3_34 <= 'z')) ) {
								alt3=9;
							}

							else {
								alt3=8;
							}

						}

						else {
							alt3=9;
						}

					}

					else {
						alt3=9;
					}

				}

				else {
					alt3=9;
				}

				}
				break;
			default:
				alt3=9;
			}
			}
			break;
		case 'n':
			{
			int LA3_2 = input.LA(2);
			if ( (LA3_2=='u') ) {
				int LA3_11 = input.LA(3);
				if ( (LA3_11=='m') ) {
					int LA3_19 = input.LA(4);
					if ( (LA3_19=='e') ) {
						int LA3_27 = input.LA(5);
						if ( (LA3_27=='r') ) {
							int LA3_35 = input.LA(6);
							if ( (LA3_35=='o') ) {
								int LA3_42 = input.LA(7);
								if ( (LA3_42=='s') ) {
									int LA3_48 = input.LA(8);
									if ( ((LA3_48 >= '0' && LA3_48 <= '9')||(LA3_48 >= 'A' && LA3_48 <= 'Z')||LA3_48=='_'||(LA3_48 >= 'a' && LA3_48 <= 'z')) ) {
										alt3=9;
									}

									else {
										alt3=2;
									}

								}

								else {
									alt3=9;
								}

							}

							else {
								alt3=9;
							}

						}

						else {
							alt3=9;
						}

					}

					else {
						alt3=9;
					}

				}

				else {
					alt3=9;
				}

			}

			else {
				alt3=9;
			}

			}
			break;
		case 'l':
			{
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='e') ) {
				int LA3_12 = input.LA(3);
				if ( (LA3_12=='t') ) {
					int LA3_20 = input.LA(4);
					if ( (LA3_20=='r') ) {
						int LA3_28 = input.LA(5);
						if ( (LA3_28=='a') ) {
							int LA3_36 = input.LA(6);
							if ( (LA3_36=='s') ) {
								int LA3_43 = input.LA(7);
								if ( ((LA3_43 >= '0' && LA3_43 <= '9')||(LA3_43 >= 'A' && LA3_43 <= 'Z')||LA3_43=='_'||(LA3_43 >= 'a' && LA3_43 <= 'z')) ) {
									alt3=9;
								}

								else {
									alt3=3;
								}

							}

							else {
								alt3=9;
							}

						}

						else {
							alt3=9;
						}

					}

					else {
						alt3=9;
					}

				}

				else {
					alt3=9;
				}

			}

			else {
				alt3=9;
			}

			}
			break;
		case 'f':
			{
			switch ( input.LA(2) ) {
			case 'e':
				{
				int LA3_13 = input.LA(3);
				if ( (LA3_13=='c') ) {
					int LA3_21 = input.LA(4);
					if ( (LA3_21=='h') ) {
						int LA3_29 = input.LA(5);
						if ( (LA3_29=='a') ) {
							int LA3_37 = input.LA(6);
							if ( ((LA3_37 >= '0' && LA3_37 <= '9')||(LA3_37 >= 'A' && LA3_37 <= 'Z')||LA3_37=='_'||(LA3_37 >= 'a' && LA3_37 <= 'z')) ) {
								alt3=9;
							}

							else {
								alt3=4;
							}

						}

						else {
							alt3=9;
						}

					}

					else {
						alt3=9;
					}

				}

				else {
					alt3=9;
				}

				}
				break;
			case 'i':
				{
				int LA3_14 = input.LA(3);
				if ( (LA3_14=='n') ) {
					int LA3_22 = input.LA(4);
					if ( ((LA3_22 >= '0' && LA3_22 <= '9')||(LA3_22 >= 'A' && LA3_22 <= 'Z')||LA3_22=='_'||(LA3_22 >= 'a' && LA3_22 <= 'z')) ) {
						alt3=9;
					}

					else {
						alt3=7;
					}

				}

				else {
					alt3=9;
				}

				}
				break;
			default:
				alt3=9;
			}
			}
			break;
		case 't':
			{
			int LA3_5 = input.LA(2);
			if ( (LA3_5=='a') ) {
				int LA3_15 = input.LA(3);
				if ( (LA3_15=='b') ) {
					int LA3_23 = input.LA(4);
					if ( (LA3_23=='l') ) {
						int LA3_31 = input.LA(5);
						if ( (LA3_31=='a') ) {
							int LA3_38 = input.LA(6);
							if ( ((LA3_38 >= '0' && LA3_38 <= '9')||(LA3_38 >= 'A' && LA3_38 <= 'Z')||LA3_38=='_'||(LA3_38 >= 'a' && LA3_38 <= 'z')) ) {
								alt3=9;
							}

							else {
								alt3=5;
							}

						}

						else {
							alt3=9;
						}

					}

					else {
						alt3=9;
					}

				}

				else {
					alt3=9;
				}

			}

			else {
				alt3=9;
			}

			}
			break;
		case 'i':
			{
			int LA3_6 = input.LA(2);
			if ( (LA3_6=='n') ) {
				int LA3_16 = input.LA(3);
				if ( (LA3_16=='i') ) {
					int LA3_24 = input.LA(4);
					if ( (LA3_24=='c') ) {
						int LA3_32 = input.LA(5);
						if ( (LA3_32=='i') ) {
							int LA3_39 = input.LA(6);
							if ( (LA3_39=='o') ) {
								int LA3_46 = input.LA(7);
								if ( ((LA3_46 >= '0' && LA3_46 <= '9')||(LA3_46 >= 'A' && LA3_46 <= 'Z')||LA3_46=='_'||(LA3_46 >= 'a' && LA3_46 <= 'z')) ) {
									alt3=9;
								}

								else {
									alt3=6;
								}

							}

							else {
								alt3=9;
							}

						}

						else {
							alt3=9;
						}

					}

					else {
						alt3=9;
					}

				}

				else {
					alt3=9;
				}

			}

			else {
				alt3=9;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'm':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=9;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=10;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// .\\gramRDF.g:1:10: CERRAR
				{
				mCERRAR(); 

				}
				break;
			case 2 :
				// .\\gramRDF.g:1:17: NUMERICO
				{
				mNUMERICO(); 

				}
				break;
			case 3 :
				// .\\gramRDF.g:1:26: ALFABETICO
				{
				mALFABETICO(); 

				}
				break;
			case 4 :
				// .\\gramRDF.g:1:37: FECHA
				{
				mFECHA(); 

				}
				break;
			case 5 :
				// .\\gramRDF.g:1:43: TABLA
				{
				mTABLA(); 

				}
				break;
			case 6 :
				// .\\gramRDF.g:1:49: INICIO
				{
				mINICIO(); 

				}
				break;
			case 7 :
				// .\\gramRDF.g:1:56: FIN
				{
				mFIN(); 

				}
				break;
			case 8 :
				// .\\gramRDF.g:1:60: CREAR
				{
				mCREAR(); 

				}
				break;
			case 9 :
				// .\\gramRDF.g:1:66: ID
				{
				mID(); 

				}
				break;
			case 10 :
				// .\\gramRDF.g:1:69: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
