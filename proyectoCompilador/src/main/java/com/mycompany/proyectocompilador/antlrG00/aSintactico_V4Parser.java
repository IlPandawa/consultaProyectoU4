package com.mycompany.proyectocompilador.antlrG00;

 //  -------------- importaciones 
        import java.util.HashMap;       


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class aSintactico_V4Parser extends Parser {

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CDOUBLE", "CINT", "CLASS", "CL_CUR_BR", 
		"CL_PARENT", "COMMA", "DOUBLE", "EQ", "ID", "INT", "OP_CUR_BR", "OP_PARENT", 
		"PRIVATE", "PROTECTED", "PUBLIC", "SEMICOLON", "WS", "'*'", "'+'", "'-'"
	};
	public static final int EOF=-1;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int CDOUBLE=4;
	public static final int CINT=5;
	public static final int CLASS=6;
	public static final int CL_CUR_BR=7;
	public static final int CL_PARENT=8;
	public static final int COMMA=9;
	public static final int DOUBLE=10;
	public static final int EQ=11;
	public static final int ID=12;
	public static final int INT=13;
	public static final int OP_CUR_BR=14;
	public static final int OP_PARENT=15;
	public static final int PRIVATE=16;
	public static final int PROTECTED=17;
	public static final int PUBLIC=18;
	public static final int SEMICOLON=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public aSintactico_V4Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public aSintactico_V4Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return aSintactico_V4Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "aSintactico_V4.g"; }


	    HashMap<String, Integer> TSG = new HashMap<>();
	    HashMap<String, Integer> TSL = new HashMap<>();

	    public void toTSG(String id, String tipo) {
	        Integer se_encuentra = TSG.get(id);
	        if (se_encuentra == null) {
	            if (tipo.equals("int")) {
	                TSG.put(id, 1);
	            } else if (tipo.equals("double")) {
	                TSG.put(id, 2);
	            } else if (tipo.equals("class")) {
	                TSG.put(id, 3);
	            }
	        } else {
	           salida.append("Error redeclarando: " + id + "\n");
	        }
	    }

	    public void toTSL(String id, String tipo) {
	        Integer se_encuentra = TSL.get(id);
	        if (se_encuentra == null) {
	            if (tipo.equals("int")) {
	                TSL.put(id, 1);
	            } else if (tipo.equals("double")) {
	                TSL.put(id, 2);
	            }
	        } else {
	            salida.append("Error redeclarando: " + id + "\n");
	        }
	    }

	       /*TAREA: HACER UNA FUNCIÓN QUE BUSQUE UN ID EN LAS TABLAS DE SIMBOLOS*/
	       /*PRIMERO BUSCARLO EN TSL SI NO ESTA BUCAR EN TSG*/
	       /*SI NUNCA ESTUVO REGRESAR 0*/
	    public int buscarID(String id){
	        Integer se_encuentra = TSL.get(id);
	        if (se_encuentra == null) {
	            se_encuentra = TSG.get(id);
	            if (se_encuentra == null) {
	                return 0;
	            } else {
	                return se_encuentra.intValue();
	            }
	        } else {
	            return se_encuentra.intValue();
	        }
	    }

	// método estandar, a partir de ahora los msgs de error del compilador 
	// pasan por aquí
	// similar a una sobrecarga de método
	  public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        salida.append(">>MyCompiler>>  " + hdr + " " + msg + "\n");
	    }

	// método nuestro para pintar un error
	  public void error(String msg){
	             salida.append("ERROR: " + msg + "\n");
	    }

	//método para verificar que dos datos de tipo sean homogéneos

	  public int check(int tipo1, int tipo2, String expr1, String expr2){
	      if(tipo1==tipo2) return tipo1;
	      else{  
	        error(" de tipos en ("+expr1+ " op " + expr2 +")" );
	        return 0;
	      }
	  }

	  
	        /* MÉTODO PARA PURGAR LA TSL*/
	    public void purgarTSL() {
	        TSL.clear();
	    }



	// $ANTLR start "start"
	// aSintactico_V4.g:92:1: start : ( class_def )+ ;
	public final void start() throws RecognitionException {
		try {
			// aSintactico_V4.g:92:6: ( ( class_def )+ )
			// aSintactico_V4.g:92:8: ( class_def )+
			{
			// aSintactico_V4.g:92:8: ( class_def )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CLASS||(LA1_0 >= PRIVATE && LA1_0 <= PUBLIC)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// aSintactico_V4.g:92:8: class_def
					{
					pushFollow(FOLLOW_class_def_in_start25);
					class_def();
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
	// $ANTLR end "start"



	// $ANTLR start "class_def"
	// aSintactico_V4.g:94:1: class_def : ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR ;
	public final void class_def() throws RecognitionException {
		Token ID1=null;

		try {
			// aSintactico_V4.g:94:10: ( ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR )
			// aSintactico_V4.g:94:12: ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR
			{
			// aSintactico_V4.g:94:12: ( access_mod )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// aSintactico_V4.g:94:13: access_mod
					{
					pushFollow(FOLLOW_access_mod_in_class_def34);
					access_mod();
					state._fsp--;

					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_class_def38); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_class_def40); 

			  /*a TSGlobal*/
			  toTSG((ID1!=null?ID1.getText():null),"class");  

			match(input,OP_CUR_BR,FOLLOW_OP_CUR_BR_in_class_def44); 
			// aSintactico_V4.g:97:13: ( member )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOUBLE||LA3_0==INT||(LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// aSintactico_V4.g:97:14: member
					{
					pushFollow(FOLLOW_member_in_class_def47);
					member();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,CL_CUR_BR,FOLLOW_CL_CUR_BR_in_class_def51); 
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
	// $ANTLR end "class_def"



	// $ANTLR start "member"
	// aSintactico_V4.g:99:1: member : ( attribute | method );
	public final void member() throws RecognitionException {
		try {
			// aSintactico_V4.g:99:7: ( attribute | method )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==DOUBLE||LA4_1==INT) ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2==ID) ) {
						int LA4_3 = input.LA(4);
						if ( (LA4_3==COMMA||LA4_3==SEMICOLON) ) {
							alt4=1;
						}
						else if ( (LA4_3==OP_PARENT) ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA4_0==DOUBLE||LA4_0==INT) ) {
				int LA4_2 = input.LA(2);
				if ( (LA4_2==ID) ) {
					int LA4_3 = input.LA(3);
					if ( (LA4_3==COMMA||LA4_3==SEMICOLON) ) {
						alt4=1;
					}
					else if ( (LA4_3==OP_PARENT) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// aSintactico_V4.g:99:9: attribute
					{
					pushFollow(FOLLOW_attribute_in_member58);
					attribute();
					state._fsp--;

					}
					break;
				case 2 :
					// aSintactico_V4.g:99:21: method
					{
					pushFollow(FOLLOW_method_in_member62);
					method();
					state._fsp--;

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
	// $ANTLR end "member"



	// $ANTLR start "attribute"
	// aSintactico_V4.g:102:1: attribute : ( access_mod )? type t1= ID ( COMMA t2= ID )* SEMICOLON ;
	public final void attribute() throws RecognitionException {
		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope type2 =null;

		try {
			// aSintactico_V4.g:102:10: ( ( access_mod )? type t1= ID ( COMMA t2= ID )* SEMICOLON )
			// aSintactico_V4.g:102:12: ( access_mod )? type t1= ID ( COMMA t2= ID )* SEMICOLON
			{
			// aSintactico_V4.g:102:12: ( access_mod )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= PRIVATE && LA5_0 <= PUBLIC)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// aSintactico_V4.g:102:13: access_mod
					{
					pushFollow(FOLLOW_access_mod_in_attribute71);
					access_mod();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_type_in_attribute75);
			type2=type();
			state._fsp--;

			t1=(Token)match(input,ID,FOLLOW_ID_in_attribute81); 

			  /*a TSGlobal*/
			  toTSG((t1!=null?t1.getText():null),(type2!=null?input.toString(type2.start,type2.stop):null));

			// aSintactico_V4.g:105:3: ( COMMA t2= ID )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// aSintactico_V4.g:106:3: COMMA t2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_attribute89); 
					t2=(Token)match(input,ID,FOLLOW_ID_in_attribute95); 

					      /*a TSGlobal*/
					      toTSG((t2!=null?t2.getText():null),(type2!=null?input.toString(type2.start,type2.stop):null));
					    
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_attribute103); 
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
	// $ANTLR end "attribute"



	// $ANTLR start "method"
	// aSintactico_V4.g:113:1: method : ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* CL_CUR_BR ;
	public final void method() throws RecognitionException {
		Token ID3=null;
		ParserRuleReturnScope type4 =null;

		try {
			// aSintactico_V4.g:113:7: ( ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* CL_CUR_BR )
			// aSintactico_V4.g:113:9: ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* CL_CUR_BR
			{
			// aSintactico_V4.g:113:9: ( access_mod )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= PRIVATE && LA7_0 <= PUBLIC)) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// aSintactico_V4.g:113:10: access_mod
					{
					pushFollow(FOLLOW_access_mod_in_method112);
					access_mod();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_type_in_method116);
			type4=type();
			state._fsp--;

			ID3=(Token)match(input,ID,FOLLOW_ID_in_method118); 
			/*a TSGlobal*/
			  toTSG((ID3!=null?ID3.getText():null),(type4!=null?input.toString(type4.start,type4.stop):null));

			match(input,OP_PARENT,FOLLOW_OP_PARENT_in_method122); 
			// aSintactico_V4.g:115:13: ( args_decl )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==DOUBLE||LA8_0==INT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// aSintactico_V4.g:115:13: args_decl
					{
					pushFollow(FOLLOW_args_decl_in_method124);
					args_decl();
					state._fsp--;

					}
					break;

			}

			match(input,CL_PARENT,FOLLOW_CL_PARENT_in_method127); 
			match(input,OP_CUR_BR,FOLLOW_OP_CUR_BR_in_method129); 
			// aSintactico_V4.g:115:44: ( sentence )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DOUBLE||(LA9_0 >= ID && LA9_0 <= INT)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// aSintactico_V4.g:115:44: sentence
					{
					pushFollow(FOLLOW_sentence_in_method131);
					sentence();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			match(input,CL_CUR_BR,FOLLOW_CL_CUR_BR_in_method134); 

			    /*purgar la TSL*/
			  purgarTSL();

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
	// $ANTLR end "method"



	// $ANTLR start "sentence"
	// aSintactico_V4.g:120:1: sentence : ( local_decl | assign );
	public final void sentence() throws RecognitionException {
		try {
			// aSintactico_V4.g:120:9: ( local_decl | assign )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DOUBLE||LA10_0==INT) ) {
				alt10=1;
			}
			else if ( (LA10_0==ID) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// aSintactico_V4.g:120:11: local_decl
					{
					pushFollow(FOLLOW_local_decl_in_sentence143);
					local_decl();
					state._fsp--;

					}
					break;
				case 2 :
					// aSintactico_V4.g:120:24: assign
					{
					pushFollow(FOLLOW_assign_in_sentence147);
					assign();
					state._fsp--;

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
	// $ANTLR end "sentence"



	// $ANTLR start "assign"
	// aSintactico_V4.g:122:1: assign : ID EQ expr SEMICOLON ;
	public final void assign() throws RecognitionException {
		Token ID5=null;
		int expr6 =0;

		try {
			// aSintactico_V4.g:122:7: ( ID EQ expr SEMICOLON )
			// aSintactico_V4.g:123:2: ID EQ expr SEMICOLON
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_assign155); 
			match(input,EQ,FOLLOW_EQ_in_assign157); 
			pushFollow(FOLLOW_expr_in_assign159);
			expr6=expr();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign161); 
			 
			  /*sacar el tipo del ID de las tablas de symb*/
			  /*ver que ID y expr sean del mismo tipo sino*/ 
			  /*marcar error*/
			  int tipoID = buscarID((ID5!=null?ID5.getText():null));
			        if (tipoID == 0) {
			            error("Variable " + (ID5!=null?ID5.getText():null) + " no declarada");
			        } else {
			            // Comparar los tipos del ID y la expresión
			            if (tipoID != expr6) {
			                error("Error de tipos: " + (ID5!=null?ID5.getText():null) + " es de tipo diferente a la expresión.");
			            }
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
	// $ANTLR end "assign"



	// $ANTLR start "expr"
	// aSintactico_V4.g:139:1: expr returns [int type] : m1= multExpr ( ( '+' | '-' ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int type = 0;


		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		try {
			// aSintactico_V4.g:140:19: (m1= multExpr ( ( '+' | '-' ) m2= multExpr )* )
			// aSintactico_V4.g:141:2: m1= multExpr ( ( '+' | '-' ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr180);
			m1=multExpr();
			state._fsp--;

			/*regresar tipo*/
			  type =(m1!=null?((aSintactico_V4Parser.multExpr_return)m1).type:0);  

			// aSintactico_V4.g:143:3: ( ( '+' | '-' ) m2= multExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= 22 && LA11_0 <= 23)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// aSintactico_V4.g:144:3: ( '+' | '-' ) m2= multExpr
					{
					if ( (input.LA(1) >= 22 && input.LA(1) <= 23) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr200);
					m2=multExpr();
					state._fsp--;


					    /*ver que m1 y m2 sean del mismo tipo sino marcar error*/
					    /* y regresar error*/
					    type =check((m1!=null?((aSintactico_V4Parser.multExpr_return)m1).type:0),(m2!=null?((aSintactico_V4Parser.multExpr_return)m2).type:0),(m1!=null?input.toString(m1.start,m1.stop):null),(m2!=null?input.toString(m2.start,m2.stop):null));
					  
					}
					break;

				default :
					break loop11;
				}
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
		return type;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		public int type;
	};


	// $ANTLR start "multExpr"
	// aSintactico_V4.g:152:1: multExpr returns [int type] : a1= atom ( '*' a2= atom )* ;
	public final aSintactico_V4Parser.multExpr_return multExpr() throws RecognitionException {
		aSintactico_V4Parser.multExpr_return retval = new aSintactico_V4Parser.multExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		try {
			// aSintactico_V4.g:153:19: (a1= atom ( '*' a2= atom )* )
			// aSintactico_V4.g:154:2: a1= atom ( '*' a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr223);
			a1=atom();
			state._fsp--;


			  /*regresar el tipo*/
			  retval.type = (a1!=null?((aSintactico_V4Parser.atom_return)a1).type:0);

			// aSintactico_V4.g:157:3: ( '*' a2= atom )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==21) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// aSintactico_V4.g:158:3: '*' a2= atom
					{
					match(input,21,FOLLOW_21_in_multExpr231); 
					pushFollow(FOLLOW_atom_in_multExpr237);
					a2=atom();
					state._fsp--;


					      /*ver que a1 y a2 sean del mismo tipo sino marcar error*/
					      /* y regresar error*/
					      retval.type =check((a1!=null?((aSintactico_V4Parser.atom_return)a1).type:0),(a2!=null?((aSintactico_V4Parser.atom_return)a2).type:0),(a1!=null?input.toString(a1.start,a1.stop):null),(a2!=null?input.toString(a2.start,a2.stop):null));
					    
					}
					break;

				default :
					break loop12;
				}
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
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		public int type;
	};


	// $ANTLR start "atom"
	// aSintactico_V4.g:165:1: atom returns [int type] : ( ID | CINT | CDOUBLE | OP_PARENT expr CL_PARENT );
	public final aSintactico_V4Parser.atom_return atom() throws RecognitionException {
		aSintactico_V4Parser.atom_return retval = new aSintactico_V4Parser.atom_return();
		retval.start = input.LT(1);

		Token ID7=null;
		int expr8 =0;

		try {
			// aSintactico_V4.g:166:19: ( ID | CINT | CDOUBLE | OP_PARENT expr CL_PARENT )
			int alt13=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt13=1;
				}
				break;
			case CINT:
				{
				alt13=2;
				}
				break;
			case CDOUBLE:
				{
				alt13=3;
				}
				break;
			case OP_PARENT:
				{
				alt13=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// aSintactico_V4.g:167:2: ID
					{
					ID7=(Token)match(input,ID,FOLLOW_ID_in_atom255); 

					        // Buscar en la tabla de símbolos local primero, luego en la global.
					        Integer se_encuentra = TSL.get((ID7!=null?ID7.getText():null));
					        if (se_encuentra == null) {
					            se_encuentra = TSG.get((ID7!=null?ID7.getText():null));
					            if (se_encuentra == null) {
					                error("Variable " + (ID7!=null?ID7.getText():null) + " no declarada");
					                retval.type = 0;
					            } else {
					                retval.type = se_encuentra.intValue();  // Si está en la tabla global, regresar su tipo
					            }
					        } else {
					            retval.type = se_encuentra.intValue();  // Si está en la tabla local, regresar su tipo
					        }
					    
					}
					break;
				case 2 :
					// aSintactico_V4.g:182:4: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom262); 

					        retval.type = 1;  // Tipo int
					    
					}
					break;
				case 3 :
					// aSintactico_V4.g:185:4: CDOUBLE
					{
					match(input,CDOUBLE,FOLLOW_CDOUBLE_in_atom269); 

					        retval.type = 2;  // Tipo double
					    
					}
					break;
				case 4 :
					// aSintactico_V4.g:188:4: OP_PARENT expr CL_PARENT
					{
					match(input,OP_PARENT,FOLLOW_OP_PARENT_in_atom276); 
					pushFollow(FOLLOW_expr_in_atom278);
					expr8=expr();
					state._fsp--;


					        retval.type = expr8;  // Regresar el tipo de la expresión
					    
					match(input,CL_PARENT,FOLLOW_CL_PARENT_in_atom282); 
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
	// $ANTLR end "atom"



	// $ANTLR start "local_decl"
	// aSintactico_V4.g:193:1: local_decl : type i1= ID ( COMMA i2= ID )* SEMICOLON ;
	public final void local_decl() throws RecognitionException {
		Token i1=null;
		Token i2=null;
		ParserRuleReturnScope type9 =null;

		try {
			// aSintactico_V4.g:193:11: ( type i1= ID ( COMMA i2= ID )* SEMICOLON )
			// aSintactico_V4.g:194:2: type i1= ID ( COMMA i2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_type_in_local_decl291);
			type9=type();
			state._fsp--;

			i1=(Token)match(input,ID,FOLLOW_ID_in_local_decl297); 

			    /*Hay que agregar a TSL las variables locales*/
			    toTSL((i1!=null?i1.getText():null),(type9!=null?input.toString(type9.start,type9.stop):null));
			  
			// aSintactico_V4.g:197:5: ( COMMA i2= ID )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// aSintactico_V4.g:198:3: COMMA i2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_local_decl305); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_local_decl311); 

					      /*Hay que agregar a TSL las variables locales*/
					        toTSL((i2!=null?i2.getText():null),(type9!=null?input.toString(type9.start,type9.stop):null));
							
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_local_decl319); 
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
	// $ANTLR end "local_decl"



	// $ANTLR start "args_decl"
	// aSintactico_V4.g:204:1: args_decl : t1= type i1= ID ( COMMA t2= type i2= ID )* ;
	public final void args_decl() throws RecognitionException {
		Token i1=null;
		Token i2=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// aSintactico_V4.g:204:10: (t1= type i1= ID ( COMMA t2= type i2= ID )* )
			// aSintactico_V4.g:205:2: t1= type i1= ID ( COMMA t2= type i2= ID )*
			{
			pushFollow(FOLLOW_type_in_args_decl331);
			t1=type();
			state._fsp--;

			i1=(Token)match(input,ID,FOLLOW_ID_in_args_decl337); 

			    toTSL((i1!=null?i1.getText():null),(t1!=null?input.toString(t1.start,t1.stop):null));
			  
			// aSintactico_V4.g:207:5: ( COMMA t2= type i2= ID )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// aSintactico_V4.g:208:3: COMMA t2= type i2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_args_decl345); 
					pushFollow(FOLLOW_type_in_args_decl351);
					t2=type();
					state._fsp--;

					i2=(Token)match(input,ID,FOLLOW_ID_in_args_decl357); 

					      toTSL((i2!=null?i2.getText():null),(t2!=null?input.toString(t2.start,t2.stop):null));  
					    
					}
					break;

				default :
					break loop15;
				}
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
	// $ANTLR end "args_decl"



	// $ANTLR start "access_mod"
	// aSintactico_V4.g:212:1: access_mod : ( PRIVATE | PROTECTED | PUBLIC );
	public final void access_mod() throws RecognitionException {
		try {
			// aSintactico_V4.g:212:11: ( PRIVATE | PROTECTED | PUBLIC )
			// aSintactico_V4.g:
			{
			if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "access_mod"


	public static class type_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "type"
	// aSintactico_V4.g:213:1: type : ( INT | DOUBLE );
	public final aSintactico_V4Parser.type_return type() throws RecognitionException {
		aSintactico_V4Parser.type_return retval = new aSintactico_V4Parser.type_return();
		retval.start = input.LT(1);

		try {
			// aSintactico_V4.g:213:5: ( INT | DOUBLE )
			// aSintactico_V4.g:
			{
			if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
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
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_class_def_in_start25 = new BitSet(new long[]{0x0000000000070042L});
	public static final BitSet FOLLOW_access_mod_in_class_def34 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLASS_in_class_def38 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_class_def40 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OP_CUR_BR_in_class_def44 = new BitSet(new long[]{0x0000000000072480L});
	public static final BitSet FOLLOW_member_in_class_def47 = new BitSet(new long[]{0x0000000000072480L});
	public static final BitSet FOLLOW_CL_CUR_BR_in_class_def51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_in_member58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_member62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_access_mod_in_attribute71 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_type_in_attribute75 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_attribute81 = new BitSet(new long[]{0x0000000000080200L});
	public static final BitSet FOLLOW_COMMA_in_attribute89 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_attribute95 = new BitSet(new long[]{0x0000000000080200L});
	public static final BitSet FOLLOW_SEMICOLON_in_attribute103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_access_mod_in_method112 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_type_in_method116 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_method118 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OP_PARENT_in_method122 = new BitSet(new long[]{0x0000000000002500L});
	public static final BitSet FOLLOW_args_decl_in_method124 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_PARENT_in_method127 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OP_CUR_BR_in_method129 = new BitSet(new long[]{0x0000000000003480L});
	public static final BitSet FOLLOW_sentence_in_method131 = new BitSet(new long[]{0x0000000000003480L});
	public static final BitSet FOLLOW_CL_CUR_BR_in_method134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_decl_in_sentence143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_sentence147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign155 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_assign157 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_expr_in_assign159 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assign161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr180 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_set_in_expr188 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_multExpr_in_expr200 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_atom_in_multExpr223 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr231 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_atom_in_multExpr237 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ID_in_atom255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CINT_in_atom262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CDOUBLE_in_atom269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_PARENT_in_atom276 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_expr_in_atom278 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_PARENT_in_atom282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_local_decl291 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_local_decl297 = new BitSet(new long[]{0x0000000000080200L});
	public static final BitSet FOLLOW_COMMA_in_local_decl305 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_local_decl311 = new BitSet(new long[]{0x0000000000080200L});
	public static final BitSet FOLLOW_SEMICOLON_in_local_decl319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_args_decl331 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_args_decl337 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_args_decl345 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_type_in_args_decl351 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_args_decl357 = new BitSet(new long[]{0x0000000000000202L});
}
