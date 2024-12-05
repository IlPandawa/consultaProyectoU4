package com.mycompany.proyectocompilador.antlrG00;
 
    import java.util.HashMap;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AOptimizadorParser extends Parser {
    
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
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SEMICOLON", "WS", "'*'", 
		"'+'", "'-'"
	};
	public static final int EOF=-1;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
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
	public static final int RETURN=19;
	public static final int SEMICOLON=20;
	public static final int WS=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AOptimizadorParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AOptimizadorParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AOptimizadorParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\AOptimizador.g"; }


	    HashMap<String, Integer> TSG = new HashMap<>();
	    HashMap<String, Integer> TSL = new HashMap<>();
	    ArrayList<String> listaMetodos = new ArrayList<>();
	    HashMap<String, Integer> contadorMetodos = new HashMap<>();
	    
	    public void contarMetodos(){
	        System.out.println("Llamadas a métodos");
	        for (String elemento : listaMetodos) {
	            contadorMetodos.put(elemento, contadorMetodos.getOrDefault(elemento, 0) + 1);
	        }
	    }
	    
	    public void imprimirMetodos(){
	        for (String clave : contadorMetodos.keySet()) {
	            if(contadorMetodos.get(clave) == 1){
	                System.out.println(clave + " llamado: " + contadorMetodos.get(clave) + " veces" + " , es optimizable");
                        salida.append(clave + " llamado: " + contadorMetodos.get(clave) + " veces" + " , es optimizable \n");
                    }
	            else{
	                System.out.println(clave + " llamado: " + contadorMetodos.get(clave) + " veces");
                        salida.append(clave + " llamado: " + contadorMetodos.get(clave) + " veces \n");
	            }
	        }
	    }
	   

	    // Resto de las funciones auxiliares sin cambios
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
	            System.err.println("Error redeclarando: " + id);
                    salida.append("Error redeclarando: " + id+ "\n");
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
	            System.err.println("Error redeclarando: " + id);
                    salida.append("Error redeclarando: " + id + "\n");
	        }
	    }

	    public int buscarID(String id) {
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

	    public void error(String msg) {
	        System.out.println("ERROR: " + msg);
                salida.append("ERROR: " + msg + "\n");
	    }



	// $ANTLR start "start"
	// .\\AOptimizador.g:81:1: start : ( class_def )+ ;
	public final void start() throws RecognitionException {
		try {
			// .\\AOptimizador.g:81:6: ( ( class_def )+ )
			// .\\AOptimizador.g:81:8: ( class_def )+
			{
			// .\\AOptimizador.g:81:8: ( class_def )+
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
					// .\\AOptimizador.g:81:8: class_def
					{
					pushFollow(FOLLOW_class_def_in_start21);
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

			contarMetodos(); imprimirMetodos();
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
	// .\\AOptimizador.g:83:1: class_def : ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR ;
	public final void class_def() throws RecognitionException {
		Token ID1=null;

		try {
			// .\\AOptimizador.g:83:10: ( ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR )
			// .\\AOptimizador.g:83:12: ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR
			{
			// .\\AOptimizador.g:83:12: ( access_mod )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// .\\AOptimizador.g:83:13: access_mod
					{
					pushFollow(FOLLOW_access_mod_in_class_def32);
					access_mod();
					state._fsp--;

					}
					break;

			}

			match(input,CLASS,FOLLOW_CLASS_in_class_def36); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_class_def38); 

			    toTSG((ID1!=null?ID1.getText():null), "class");

			match(input,OP_CUR_BR,FOLLOW_OP_CUR_BR_in_class_def42); 
			// .\\AOptimizador.g:85:13: ( member )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOUBLE||LA3_0==INT||(LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// .\\AOptimizador.g:85:14: member
					{
					pushFollow(FOLLOW_member_in_class_def45);
					member();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,CL_CUR_BR,FOLLOW_CL_CUR_BR_in_class_def49); 
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
	// .\\AOptimizador.g:87:1: member : ( attribute | method );
	public final void member() throws RecognitionException {
		try {
			// .\\AOptimizador.g:87:7: ( attribute | method )
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
					// .\\AOptimizador.g:87:9: attribute
					{
					pushFollow(FOLLOW_attribute_in_member56);
					attribute();
					state._fsp--;

					}
					break;
				case 2 :
					// .\\AOptimizador.g:87:21: method
					{
					pushFollow(FOLLOW_method_in_member60);
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
	// .\\AOptimizador.g:89:1: attribute : ( access_mod )? type t1= ID ( COMMA t2= ID )* SEMICOLON ;
	public final void attribute() throws RecognitionException {
		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope type2 =null;

		try {
			// .\\AOptimizador.g:89:10: ( ( access_mod )? type t1= ID ( COMMA t2= ID )* SEMICOLON )
			// .\\AOptimizador.g:89:12: ( access_mod )? type t1= ID ( COMMA t2= ID )* SEMICOLON
			{
			// .\\AOptimizador.g:89:12: ( access_mod )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= PRIVATE && LA5_0 <= PUBLIC)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// .\\AOptimizador.g:89:13: access_mod
					{
					pushFollow(FOLLOW_access_mod_in_attribute68);
					access_mod();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_type_in_attribute72);
			type2=type();
			state._fsp--;

			t1=(Token)match(input,ID,FOLLOW_ID_in_attribute76); 

			    toTSG((t1!=null?t1.getText():null), (type2!=null?input.toString(type2.start,type2.stop):null));

			// .\\AOptimizador.g:91:3: ( COMMA t2= ID )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// .\\AOptimizador.g:91:4: COMMA t2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_attribute81); 
					t2=(Token)match(input,ID,FOLLOW_ID_in_attribute85); 

					    toTSG((t2!=null?t2.getText():null), (type2!=null?input.toString(type2.start,type2.stop):null));

					}
					break;

				default :
					break loop6;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_attribute91); 
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
	// .\\AOptimizador.g:95:1: method : ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* ( RETURN expr SEMICOLON )? CL_CUR_BR ;
	public final void method() throws RecognitionException {
		Token ID3=null;
		ParserRuleReturnScope type4 =null;

		try {
			// .\\AOptimizador.g:95:7: ( ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* ( RETURN expr SEMICOLON )? CL_CUR_BR )
			// .\\AOptimizador.g:95:9: ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* ( RETURN expr SEMICOLON )? CL_CUR_BR
			{
			// .\\AOptimizador.g:95:9: ( access_mod )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= PRIVATE && LA7_0 <= PUBLIC)) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// .\\AOptimizador.g:95:10: access_mod
					{
					pushFollow(FOLLOW_access_mod_in_method99);
					access_mod();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_type_in_method103);
			type4=type();
			state._fsp--;

			ID3=(Token)match(input,ID,FOLLOW_ID_in_method105); 

			    toTSG((ID3!=null?ID3.getText():null), (type4!=null?input.toString(type4.start,type4.stop):null));
			   

			match(input,OP_PARENT,FOLLOW_OP_PARENT_in_method109); 
			// .\\AOptimizador.g:98:13: ( args_decl )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==DOUBLE||LA8_0==INT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// .\\AOptimizador.g:98:13: args_decl
					{
					pushFollow(FOLLOW_args_decl_in_method111);
					args_decl();
					state._fsp--;

					}
					break;

			}

			match(input,CL_PARENT,FOLLOW_CL_PARENT_in_method114); 
			match(input,OP_CUR_BR,FOLLOW_OP_CUR_BR_in_method116); 
			// .\\AOptimizador.g:98:44: ( sentence )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DOUBLE||(LA9_0 >= ID && LA9_0 <= INT)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// .\\AOptimizador.g:98:44: sentence
					{
					pushFollow(FOLLOW_sentence_in_method118);
					sentence();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			// .\\AOptimizador.g:98:54: ( RETURN expr SEMICOLON )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==RETURN) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// .\\AOptimizador.g:98:55: RETURN expr SEMICOLON
					{
					match(input,RETURN,FOLLOW_RETURN_in_method122); 
					pushFollow(FOLLOW_expr_in_method124);
					expr();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method126); 
					}
					break;

			}

			match(input,CL_CUR_BR,FOLLOW_CL_CUR_BR_in_method130); 
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
	// .\\AOptimizador.g:100:1: sentence : ( local_decl | assign );
	public final void sentence() throws RecognitionException {
		try {
			// .\\AOptimizador.g:100:9: ( local_decl | assign )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DOUBLE||LA11_0==INT) ) {
				alt11=1;
			}
			else if ( (LA11_0==ID) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// .\\AOptimizador.g:100:11: local_decl
					{
					pushFollow(FOLLOW_local_decl_in_sentence137);
					local_decl();
					state._fsp--;

					}
					break;
				case 2 :
					// .\\AOptimizador.g:100:24: assign
					{
					pushFollow(FOLLOW_assign_in_sentence141);
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
	// .\\AOptimizador.g:102:1: assign : ID EQ expr SEMICOLON ;
	public final void assign() throws RecognitionException {
		try {
			// .\\AOptimizador.g:102:7: ( ID EQ expr SEMICOLON )
			// .\\AOptimizador.g:102:9: ID EQ expr SEMICOLON
			{
			match(input,ID,FOLLOW_ID_in_assign148); 
			match(input,EQ,FOLLOW_EQ_in_assign150); 
			pushFollow(FOLLOW_expr_in_assign152);
			expr();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign154); 
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
	// .\\AOptimizador.g:104:1: expr returns [int type] : m1= multExpr ( ( '+' | '-' ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int type = 0;


		int m1 =0;
		int m2 =0;

		try {
			// .\\AOptimizador.g:104:23: (m1= multExpr ( ( '+' | '-' ) m2= multExpr )* )
			// .\\AOptimizador.g:105:5: m1= multExpr ( ( '+' | '-' ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr170);
			m1=multExpr();
			state._fsp--;

			type = m1;
			               
			// .\\AOptimizador.g:107:5: ( ( '+' | '-' ) m2= multExpr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= 23 && LA12_0 <= 24)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// .\\AOptimizador.g:107:6: ( '+' | '-' ) m2= multExpr
					{
					if ( (input.LA(1) >= 23 && input.LA(1) <= 24) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr190);
					m2=multExpr();
					state._fsp--;

					}
					break;

				default :
					break loop12;
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



	// $ANTLR start "multExpr"
	// .\\AOptimizador.g:110:1: multExpr returns [int type] : a1= atom ( '*' a2= atom )* ;
	public final int multExpr() throws RecognitionException {
		int type = 0;


		int a1 =0;
		int a2 =0;

		try {
			// .\\AOptimizador.g:110:27: (a1= atom ( '*' a2= atom )* )
			// .\\AOptimizador.g:111:5: a1= atom ( '*' a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr226);
			a1=atom();
			state._fsp--;

			type = a1;
			// .\\AOptimizador.g:112:5: ( '*' a2= atom )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==22) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// .\\AOptimizador.g:112:6: '*' a2= atom
					{
					match(input,22,FOLLOW_22_in_multExpr236); 
					pushFollow(FOLLOW_atom_in_multExpr240);
					a2=atom();
					state._fsp--;

					}
					break;

				default :
					break loop13;
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
	// $ANTLR end "multExpr"



	// $ANTLR start "method_call"
	// .\\AOptimizador.g:114:1: method_call : ID OP_PARENT ( args_decl )? CL_PARENT ;
	public final void method_call() throws RecognitionException {
		try {
			// .\\AOptimizador.g:114:12: ( ID OP_PARENT ( args_decl )? CL_PARENT )
			// .\\AOptimizador.g:114:14: ID OP_PARENT ( args_decl )? CL_PARENT
			{
			match(input,ID,FOLLOW_ID_in_method_call249); 

			    
			   

			match(input,OP_PARENT,FOLLOW_OP_PARENT_in_method_call253); 
			// .\\AOptimizador.g:117:13: ( args_decl )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==DOUBLE||LA14_0==INT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// .\\AOptimizador.g:117:13: args_decl
					{
					pushFollow(FOLLOW_args_decl_in_method_call255);
					args_decl();
					state._fsp--;

					}
					break;

			}

			match(input,CL_PARENT,FOLLOW_CL_PARENT_in_method_call258); 
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
	// $ANTLR end "method_call"



	// $ANTLR start "atom"
	// .\\AOptimizador.g:119:1: atom returns [int type] : ( ID | CINT | CDOUBLE | ID OP_PARENT ( expr ( COMMA expr )* )? CL_PARENT | OP_PARENT expr CL_PARENT );
	public final int atom() throws RecognitionException {
		int type = 0;


		Token ID5=null;
		Token ID6=null;
		int expr7 =0;

		try {
			// .\\AOptimizador.g:119:23: ( ID | CINT | CDOUBLE | ID OP_PARENT ( expr ( COMMA expr )* )? CL_PARENT | OP_PARENT expr CL_PARENT )
			int alt17=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA17_1 = input.LA(2);
				if ( (LA17_1==OP_PARENT) ) {
					alt17=4;
				}
				else if ( ((LA17_1 >= CL_PARENT && LA17_1 <= COMMA)||LA17_1==SEMICOLON||(LA17_1 >= 22 && LA17_1 <= 24)) ) {
					alt17=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CINT:
				{
				alt17=2;
				}
				break;
			case CDOUBLE:
				{
				alt17=3;
				}
				break;
			case OP_PARENT:
				{
				alt17=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// .\\AOptimizador.g:120:5: ID
					{
					ID5=(Token)match(input,ID,FOLLOW_ID_in_atom272); 

					        type = buscarID((ID5!=null?ID5.getText():null));
					    
					}
					break;
				case 2 :
					// .\\AOptimizador.g:123:7: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom282); 
					type = 1;
					}
					break;
				case 3 :
					// .\\AOptimizador.g:124:7: CDOUBLE
					{
					match(input,CDOUBLE,FOLLOW_CDOUBLE_in_atom292); 
					type = 2;
					}
					break;
				case 4 :
					// .\\AOptimizador.g:125:7: ID OP_PARENT ( expr ( COMMA expr )* )? CL_PARENT
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_atom302); 
					match(input,OP_PARENT,FOLLOW_OP_PARENT_in_atom304); 
					// .\\AOptimizador.g:125:20: ( expr ( COMMA expr )* )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( ((LA16_0 >= CDOUBLE && LA16_0 <= CINT)||LA16_0==ID||LA16_0==OP_PARENT) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// .\\AOptimizador.g:125:21: expr ( COMMA expr )*
							{
							pushFollow(FOLLOW_expr_in_atom307);
							expr();
							state._fsp--;

							// .\\AOptimizador.g:125:26: ( COMMA expr )*
							loop15:
							while (true) {
								int alt15=2;
								int LA15_0 = input.LA(1);
								if ( (LA15_0==COMMA) ) {
									alt15=1;
								}

								switch (alt15) {
								case 1 :
									// .\\AOptimizador.g:125:27: COMMA expr
									{
									match(input,COMMA,FOLLOW_COMMA_in_atom310); 
									pushFollow(FOLLOW_expr_in_atom312);
									expr();
									state._fsp--;

									}
									break;

								default :
									break loop15;
								}
							}

							}
							break;

					}

					match(input,CL_PARENT,FOLLOW_CL_PARENT_in_atom318); 

					        type = 1; // Asumimos que los métodos retornan int
					        listaMetodos.add((ID6!=null?ID6.getText():null));
					    
					}
					break;
				case 5 :
					// .\\AOptimizador.g:129:7: OP_PARENT expr CL_PARENT
					{
					match(input,OP_PARENT,FOLLOW_OP_PARENT_in_atom328); 
					pushFollow(FOLLOW_expr_in_atom330);
					expr7=expr();
					state._fsp--;

					match(input,CL_PARENT,FOLLOW_CL_PARENT_in_atom332); 
					type = expr7;
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
		return type;
	}
	// $ANTLR end "atom"



	// $ANTLR start "local_decl"
	// .\\AOptimizador.g:132:1: local_decl : type i1= ID ( COMMA i2= ID )* SEMICOLON ;
	public final void local_decl() throws RecognitionException {
		Token i1=null;
		Token i2=null;
		ParserRuleReturnScope type8 =null;

		try {
			// .\\AOptimizador.g:132:11: ( type i1= ID ( COMMA i2= ID )* SEMICOLON )
			// .\\AOptimizador.g:132:13: type i1= ID ( COMMA i2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_type_in_local_decl342);
			type8=type();
			state._fsp--;

			i1=(Token)match(input,ID,FOLLOW_ID_in_local_decl346); 

			    toTSL((i1!=null?i1.getText():null), (type8!=null?input.toString(type8.start,type8.stop):null));

			// .\\AOptimizador.g:134:3: ( COMMA i2= ID )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// .\\AOptimizador.g:134:4: COMMA i2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_local_decl351); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_local_decl355); 

					    toTSL((i2!=null?i2.getText():null), (type8!=null?input.toString(type8.start,type8.stop):null));

					}
					break;

				default :
					break loop18;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_local_decl361); 
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
	// .\\AOptimizador.g:138:1: args_decl : t1= type i1= ID ( COMMA t2= type i2= ID )* ;
	public final void args_decl() throws RecognitionException {
		Token i1=null;
		Token i2=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// .\\AOptimizador.g:138:10: (t1= type i1= ID ( COMMA t2= type i2= ID )* )
			// .\\AOptimizador.g:138:12: t1= type i1= ID ( COMMA t2= type i2= ID )*
			{
			pushFollow(FOLLOW_type_in_args_decl370);
			t1=type();
			state._fsp--;

			i1=(Token)match(input,ID,FOLLOW_ID_in_args_decl374); 

			    toTSL((i1!=null?i1.getText():null), (t1!=null?input.toString(t1.start,t1.stop):null));

			// .\\AOptimizador.g:140:3: ( COMMA t2= type i2= ID )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// .\\AOptimizador.g:140:4: COMMA t2= type i2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_args_decl379); 
					pushFollow(FOLLOW_type_in_args_decl383);
					t2=type();
					state._fsp--;

					i2=(Token)match(input,ID,FOLLOW_ID_in_args_decl387); 

					    toTSL((i2!=null?i2.getText():null), (t2!=null?input.toString(t2.start,t2.stop):null));

					}
					break;

				default :
					break loop19;
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
	// .\\AOptimizador.g:144:1: access_mod : ( PRIVATE | PROTECTED | PUBLIC );
	public final void access_mod() throws RecognitionException {
		try {
			// .\\AOptimizador.g:144:11: ( PRIVATE | PROTECTED | PUBLIC )
			// .\\AOptimizador.g:
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
	// .\\AOptimizador.g:145:1: type : ( INT | DOUBLE );
	public final AOptimizadorParser.type_return type() throws RecognitionException {
		AOptimizadorParser.type_return retval = new AOptimizadorParser.type_return();
		retval.start = input.LT(1);

		try {
			// .\\AOptimizador.g:145:5: ( INT | DOUBLE )
			// .\\AOptimizador.g:
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



	public static final BitSet FOLLOW_class_def_in_start21 = new BitSet(new long[]{0x0000000000070042L});
	public static final BitSet FOLLOW_access_mod_in_class_def32 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLASS_in_class_def36 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_class_def38 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OP_CUR_BR_in_class_def42 = new BitSet(new long[]{0x0000000000072480L});
	public static final BitSet FOLLOW_member_in_class_def45 = new BitSet(new long[]{0x0000000000072480L});
	public static final BitSet FOLLOW_CL_CUR_BR_in_class_def49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribute_in_member56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_member60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_access_mod_in_attribute68 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_type_in_attribute72 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_attribute76 = new BitSet(new long[]{0x0000000000100200L});
	public static final BitSet FOLLOW_COMMA_in_attribute81 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_attribute85 = new BitSet(new long[]{0x0000000000100200L});
	public static final BitSet FOLLOW_SEMICOLON_in_attribute91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_access_mod_in_method99 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_type_in_method103 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_method105 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OP_PARENT_in_method109 = new BitSet(new long[]{0x0000000000002500L});
	public static final BitSet FOLLOW_args_decl_in_method111 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_PARENT_in_method114 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OP_CUR_BR_in_method116 = new BitSet(new long[]{0x0000000000083480L});
	public static final BitSet FOLLOW_sentence_in_method118 = new BitSet(new long[]{0x0000000000083480L});
	public static final BitSet FOLLOW_RETURN_in_method122 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_expr_in_method124 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_SEMICOLON_in_method126 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CL_CUR_BR_in_method130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_decl_in_sentence137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_sentence141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign148 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_assign150 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_expr_in_assign152 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assign154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr170 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_set_in_expr180 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_multExpr_in_expr190 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_atom_in_multExpr226 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_multExpr236 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_atom_in_multExpr240 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ID_in_method_call249 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OP_PARENT_in_method_call253 = new BitSet(new long[]{0x0000000000002500L});
	public static final BitSet FOLLOW_args_decl_in_method_call255 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_PARENT_in_method_call258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CINT_in_atom282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CDOUBLE_in_atom292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom302 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OP_PARENT_in_atom304 = new BitSet(new long[]{0x0000000000009130L});
	public static final BitSet FOLLOW_expr_in_atom307 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_COMMA_in_atom310 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_expr_in_atom312 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_CL_PARENT_in_atom318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_PARENT_in_atom328 = new BitSet(new long[]{0x0000000000009030L});
	public static final BitSet FOLLOW_expr_in_atom330 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_PARENT_in_atom332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_local_decl342 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_local_decl346 = new BitSet(new long[]{0x0000000000100200L});
	public static final BitSet FOLLOW_COMMA_in_local_decl351 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_local_decl355 = new BitSet(new long[]{0x0000000000100200L});
	public static final BitSet FOLLOW_SEMICOLON_in_local_decl361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_args_decl370 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_args_decl374 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_args_decl379 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_type_in_args_decl383 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_args_decl387 = new BitSet(new long[]{0x0000000000000202L});
}
