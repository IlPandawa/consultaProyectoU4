package com.mycompany.proyectocompilador.antlrG00;// $ANTLR 3.5.2 gramBinding.g 2024-12-02 10:27:00

import java.util.HashMap;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramBindingParser extends Parser {

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CDOUBLE", "CINT", "CLASS", "CL_CUR_BR",
        "CL_PARENT", "COMMA", "DOUBLE", "EQ", "ID", "INT", "OP_CUR_BR", "OP_PARENT",
        "PRIVATE", "PROTECTED", "PUBLIC", "SEMICOLON", "WS", "'*'", "'+'", "'-'",
        "'return'"
    };
    public static final int EOF = -1;
    public static final int T__21 = 21;
    public static final int T__22 = 22;
    public static final int T__23 = 23;
    public static final int T__24 = 24;
    public static final int CDOUBLE = 4;
    public static final int CINT = 5;
    public static final int CLASS = 6;
    public static final int CL_CUR_BR = 7;
    public static final int CL_PARENT = 8;
    public static final int COMMA = 9;
    public static final int DOUBLE = 10;
    public static final int EQ = 11;
    public static final int ID = 12;
    public static final int INT = 13;
    public static final int OP_CUR_BR = 14;
    public static final int OP_PARENT = 15;
    public static final int PRIVATE = 16;
    public static final int PROTECTED = 17;
    public static final int PUBLIC = 18;
    public static final int SEMICOLON = 19;
    public static final int WS = 20;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[]{};
    }

    // delegators
    public gramBindingParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public gramBindingParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String[] getTokenNames() {
        return gramBindingParser.tokenNames;
    }

    @Override
    public String getGrammarFileName() {
        return "gramBinding.g";
    }

    HashMap<String, Integer> TSG = new HashMap<>();
    HashMap<String, Integer> TSL = new HashMap<>();

    public void toTSG(String id, int isStatic) {
        Integer se_encuentra = TSG.get(id);
        if (se_encuentra == null) {
            TSG.put(id, isStatic);
        } else {
            System.err.println("Error redeclarando: " + id);
            salida.append("Error redeclarando: " + id + "\n");
        }
    }

    public void toTSL(String id, int isStatic) {
        Integer se_encuentra = TSL.get(id);
        if (se_encuentra == null) {
            TSL.put(id, isStatic);
        } else {
            System.err.println("Error redeclarando: " + id);
            salida.append("Error redeclarando: " + id  + "\n");
        }
    }

    public void updateSymbol(String id, int isStatic) {
        if (TSL.containsKey(id)) {
            TSL.put(id, isStatic);
        } else if (TSG.containsKey(id)) {
            TSG.put(id, isStatic);
        } else {
            error("Variable " + id + " no declarada");
            salida.append("Variable " + id + " no declarada"  + "\n");
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

    public void purgarTSL() {
        TSL.clear();
    }

    public void error(String msg) {
        System.out.println("ERROR: " + msg);
        salida.append("ERROR: " + msg);
    }

    public int checkReducible(int static1, int static2, String expr1, String expr2) {
        if (static1 == 1 && static2 == 1) {
            System.out.println("La expresión (" + expr1 + " op " + expr2 + ") es reducible");
            salida.append("La expresión (" + expr1 + " op " + expr2 + ") es reducible"  + "\n");
            return 1;
        } else {
            System.out.println("La expresión (" + expr1 + " op " + expr2 + ") no es reducible");
            salida.append("La expresión (" + expr1 + " op " + expr2 + ") no es reducible"  + "\n");
            return 0;
        }
    }

    // $ANTLR start "start"
    // gramBinding.g:72:1: start : ( class_def )+ ;
    public final void start() throws RecognitionException {
        try {
            // gramBinding.g:72:6: ( ( class_def )+ )
            // gramBinding.g:72:8: ( class_def )+
            {
                // gramBinding.g:72:8: ( class_def )+
                int cnt1 = 0;
                loop1:
                while (true) {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == CLASS || (LA1_0 >= PRIVATE && LA1_0 <= PUBLIC))) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                        case 1: // gramBinding.g:72:8: class_def
                        {
                            pushFollow(FOLLOW_class_def_in_start21);
                            class_def();
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

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "start"

    // $ANTLR start "class_def"
    // gramBinding.g:74:1: class_def : ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR ;
    public final void class_def() throws RecognitionException {
        Token ID1 = null;

        try {
            // gramBinding.g:74:10: ( ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR )
            // gramBinding.g:74:12: ( access_mod )? CLASS ID OP_CUR_BR ( member )* CL_CUR_BR
            {
                // gramBinding.g:74:12: ( access_mod )?
                int alt2 = 2;
                int LA2_0 = input.LA(1);
                if (((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC))) {
                    alt2 = 1;
                }
                switch (alt2) {
                    case 1: // gramBinding.g:74:13: access_mod
                    {
                        pushFollow(FOLLOW_access_mod_in_class_def30);
                        access_mod();
                        state._fsp--;

                    }
                    break;

                }

                match(input, CLASS, FOLLOW_CLASS_in_class_def34);
                ID1 = (Token) match(input, ID, FOLLOW_ID_in_class_def36);

                toTSG((ID1 != null ? ID1.getText() : null), 0);

                match(input, OP_CUR_BR, FOLLOW_OP_CUR_BR_in_class_def40);
                // gramBinding.g:76:13: ( member )*
                loop3:
                while (true) {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);
                    if ((LA3_0 == DOUBLE || LA3_0 == INT || (LA3_0 >= PRIVATE && LA3_0 <= PUBLIC))) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                        case 1: // gramBinding.g:76:14: member
                        {
                            pushFollow(FOLLOW_member_in_class_def43);
                            member();
                            state._fsp--;

                        }
                        break;

                        default:
                            break loop3;
                    }
                }

                match(input, CL_CUR_BR, FOLLOW_CL_CUR_BR_in_class_def47);
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "class_def"

    // $ANTLR start "member"
    // gramBinding.g:78:1: member : ( attribute | method );
    public final void member() throws RecognitionException {
        try {
            // gramBinding.g:78:7: ( attribute | method )
            int alt4 = 2;
            int LA4_0 = input.LA(1);
            if (((LA4_0 >= PRIVATE && LA4_0 <= PUBLIC))) {
                int LA4_1 = input.LA(2);
                if ((LA4_1 == DOUBLE || LA4_1 == INT)) {
                    int LA4_2 = input.LA(3);
                    if ((LA4_2 == ID)) {
                        int LA4_3 = input.LA(4);
                        if ((LA4_3 == SEMICOLON)) {
                            alt4 = 1;
                        } else if ((LA4_3 == OP_PARENT)) {
                            alt4 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 4, 3, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    } else {
                        int nvaeMark = input.mark();
                        try {
                            for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                input.consume();
                            }
                            NoViableAltException nvae
                                    = new NoViableAltException("", 4, 2, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                    }

                } else {
                    int nvaeMark = input.mark();
                    try {
                        input.consume();
                        NoViableAltException nvae
                                = new NoViableAltException("", 4, 1, input);
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            } else if ((LA4_0 == DOUBLE || LA4_0 == INT)) {
                int LA4_2 = input.LA(2);
                if ((LA4_2 == ID)) {
                    int LA4_3 = input.LA(3);
                    if ((LA4_3 == SEMICOLON)) {
                        alt4 = 1;
                    } else if ((LA4_3 == OP_PARENT)) {
                        alt4 = 2;
                    } else {
                        int nvaeMark = input.mark();
                        try {
                            for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                input.consume();
                            }
                            NoViableAltException nvae
                                    = new NoViableAltException("", 4, 3, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                    }

                } else {
                    int nvaeMark = input.mark();
                    try {
                        input.consume();
                        NoViableAltException nvae
                                = new NoViableAltException("", 4, 2, input);
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 4, 0, input);
                throw nvae;
            }

            switch (alt4) {
                case 1: // gramBinding.g:78:9: attribute
                {
                    pushFollow(FOLLOW_attribute_in_member54);
                    attribute();
                    state._fsp--;

                }
                break;
                case 2: // gramBinding.g:78:21: method
                {
                    pushFollow(FOLLOW_method_in_member58);
                    method();
                    state._fsp--;

                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "member"

    // $ANTLR start "attribute"
    // gramBinding.g:80:1: attribute : ( access_mod )? type ID SEMICOLON ;
    public final void attribute() throws RecognitionException {
        Token ID2 = null;

        try {
            // gramBinding.g:80:10: ( ( access_mod )? type ID SEMICOLON )
            // gramBinding.g:80:12: ( access_mod )? type ID SEMICOLON
            {
                // gramBinding.g:80:12: ( access_mod )?
                int alt5 = 2;
                int LA5_0 = input.LA(1);
                if (((LA5_0 >= PRIVATE && LA5_0 <= PUBLIC))) {
                    alt5 = 1;
                }
                switch (alt5) {
                    case 1: // gramBinding.g:80:13: access_mod
                    {
                        pushFollow(FOLLOW_access_mod_in_attribute66);
                        access_mod();
                        state._fsp--;

                    }
                    break;

                }

                pushFollow(FOLLOW_type_in_attribute70);
                type();
                state._fsp--;

                ID2 = (Token) match(input, ID, FOLLOW_ID_in_attribute72);
                match(input, SEMICOLON, FOLLOW_SEMICOLON_in_attribute74);

                toTSG((ID2 != null ? ID2.getText() : null), 0);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "attribute"

    // $ANTLR start "method"
    // gramBinding.g:84:1: method : ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* CL_CUR_BR ;
    public final void method() throws RecognitionException {
        Token ID3 = null;

        try {
            // gramBinding.g:84:7: ( ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* CL_CUR_BR )
            // gramBinding.g:84:9: ( access_mod )? type ID OP_PARENT ( args_decl )? CL_PARENT OP_CUR_BR ( sentence )* CL_CUR_BR
            {
                // gramBinding.g:84:9: ( access_mod )?
                int alt6 = 2;
                int LA6_0 = input.LA(1);
                if (((LA6_0 >= PRIVATE && LA6_0 <= PUBLIC))) {
                    alt6 = 1;
                }
                switch (alt6) {
                    case 1: // gramBinding.g:84:10: access_mod
                    {
                        pushFollow(FOLLOW_access_mod_in_method84);
                        access_mod();
                        state._fsp--;

                    }
                    break;

                }

                pushFollow(FOLLOW_type_in_method88);
                type();
                state._fsp--;

                ID3 = (Token) match(input, ID, FOLLOW_ID_in_method90);

                toTSG((ID3 != null ? ID3.getText() : null), 0);

                match(input, OP_PARENT, FOLLOW_OP_PARENT_in_method94);
                // gramBinding.g:86:13: ( args_decl )?
                int alt7 = 2;
                int LA7_0 = input.LA(1);
                if ((LA7_0 == DOUBLE || LA7_0 == INT)) {
                    alt7 = 1;
                }
                switch (alt7) {
                    case 1: // gramBinding.g:86:13: args_decl
                    {
                        pushFollow(FOLLOW_args_decl_in_method96);
                        args_decl();
                        state._fsp--;

                    }
                    break;

                }

                match(input, CL_PARENT, FOLLOW_CL_PARENT_in_method99);
                match(input, OP_CUR_BR, FOLLOW_OP_CUR_BR_in_method101);
                // gramBinding.g:86:44: ( sentence )*
                loop8:
                while (true) {
                    int alt8 = 2;
                    int LA8_0 = input.LA(1);
                    if ((LA8_0 == DOUBLE || (LA8_0 >= ID && LA8_0 <= INT) || LA8_0 == 24)) {
                        alt8 = 1;
                    }

                    switch (alt8) {
                        case 1: // gramBinding.g:86:44: sentence
                        {
                            pushFollow(FOLLOW_sentence_in_method103);
                            sentence();
                            state._fsp--;

                        }
                        break;

                        default:
                            break loop8;
                    }
                }

                match(input, CL_CUR_BR, FOLLOW_CL_CUR_BR_in_method106);

                purgarTSL();

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "method"

    // $ANTLR start "sentence"
    // gramBinding.g:90:1: sentence : ( local_decl | assign | return_stmt );
    public final void sentence() throws RecognitionException {
        try {
            // gramBinding.g:90:9: ( local_decl | assign | return_stmt )
            int alt9 = 3;
            switch (input.LA(1)) {
                case DOUBLE:
                case INT: {
                    alt9 = 1;
                }
                break;
                case ID: {
                    alt9 = 2;
                }
                break;
                case 24: {
                    alt9 = 3;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 9, 0, input);
                    throw nvae;
            }
            switch (alt9) {
                case 1: // gramBinding.g:90:11: local_decl
                {
                    pushFollow(FOLLOW_local_decl_in_sentence115);
                    local_decl();
                    state._fsp--;

                }
                break;
                case 2: // gramBinding.g:90:24: assign
                {
                    pushFollow(FOLLOW_assign_in_sentence119);
                    assign();
                    state._fsp--;

                }
                break;
                case 3: // gramBinding.g:90:33: return_stmt
                {
                    pushFollow(FOLLOW_return_stmt_in_sentence123);
                    return_stmt();
                    state._fsp--;

                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "sentence"

    // $ANTLR start "local_decl"
    // gramBinding.g:92:1: local_decl : type ID ( EQ expr )? SEMICOLON ;
    public final void local_decl() throws RecognitionException {
        Token ID5 = null;
        ParserRuleReturnScope expr4 = null;

        try {
            // gramBinding.g:92:11: ( type ID ( EQ expr )? SEMICOLON )
            // gramBinding.g:92:13: type ID ( EQ expr )? SEMICOLON
            {
                pushFollow(FOLLOW_type_in_local_decl130);
                type();
                state._fsp--;

                ID5 = (Token) match(input, ID, FOLLOW_ID_in_local_decl132);
                // gramBinding.g:92:21: ( EQ expr )?
                int alt10 = 2;
                int LA10_0 = input.LA(1);
                if ((LA10_0 == EQ)) {
                    alt10 = 1;
                }
                switch (alt10) {
                    case 1: // gramBinding.g:92:22: EQ expr
                    {
                        match(input, EQ, FOLLOW_EQ_in_local_decl135);
                        pushFollow(FOLLOW_expr_in_local_decl137);
                        expr4 = expr();
                        state._fsp--;

                    }
                    break;

                }

                match(input, SEMICOLON, FOLLOW_SEMICOLON_in_local_decl141);

                if ((expr4 != null ? input.toString(expr4.start, expr4.stop) : null) != null) {
                    toTSL((ID5 != null ? ID5.getText() : null), (expr4 != null ? ((gramBindingParser.expr_return) expr4).isStatic : 0));
                } else {
                    toTSL((ID5 != null ? ID5.getText() : null), 0);
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "local_decl"

    // $ANTLR start "assign"
    // gramBinding.g:100:1: assign : ID EQ expr SEMICOLON ;
    public final void assign() throws RecognitionException {
        Token ID7 = null;
        ParserRuleReturnScope expr6 = null;

        try {
            // gramBinding.g:100:7: ( ID EQ expr SEMICOLON )
            // gramBinding.g:100:9: ID EQ expr SEMICOLON
            {
                ID7 = (Token) match(input, ID, FOLLOW_ID_in_assign150);
                match(input, EQ, FOLLOW_EQ_in_assign152);
                pushFollow(FOLLOW_expr_in_assign154);
                expr6 = expr();
                state._fsp--;

                match(input, SEMICOLON, FOLLOW_SEMICOLON_in_assign156);

                int exprStatic = (expr6 != null ? ((gramBindingParser.expr_return) expr6).isStatic : 0);

                // actualización de tabla
                updateSymbol((ID7 != null ? ID7.getText() : null), exprStatic);

                if (exprStatic == 1) {
                    System.out.println("La asignación a " + (ID7 != null ? ID7.getText() : null) + " es estática");
                    salida.append("La asignación a " + (ID7 != null ? ID7.getText() : null) + " es estática" + "\n");
                } else {
                    System.out.println("La asignación a " + (ID7 != null ? ID7.getText() : null) + " es dinámica");
                    salida.append("La asignación a " + (ID7 != null ? ID7.getText() : null) + " es dinámica" + "\n");
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "assign"

    // $ANTLR start "return_stmt"
    // gramBinding.g:113:1: return_stmt : 'return' expr SEMICOLON ;
    public final void return_stmt() throws RecognitionException {
        try {
            // gramBinding.g:113:12: ( 'return' expr SEMICOLON )
            // gramBinding.g:113:14: 'return' expr SEMICOLON
            {
                match(input, 24, FOLLOW_24_in_return_stmt165);
                pushFollow(FOLLOW_expr_in_return_stmt167);
                expr();
                state._fsp--;

                match(input, SEMICOLON, FOLLOW_SEMICOLON_in_return_stmt169);
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "return_stmt"

    public static class expr_return extends ParserRuleReturnScope {

        public int isStatic;
    };

    // $ANTLR start "expr"
    // gramBinding.g:115:1: expr returns [int isStatic] : m1= multExpr ( ( '+' | '-' ) m2= multExpr )* ;
    public final gramBindingParser.expr_return expr() throws RecognitionException {
        gramBindingParser.expr_return retval = new gramBindingParser.expr_return();
        retval.start = input.LT(1);

        ParserRuleReturnScope m1 = null;
        ParserRuleReturnScope m2 = null;

        try {
            // gramBinding.g:115:27: (m1= multExpr ( ( '+' | '-' ) m2= multExpr )* )
            // gramBinding.g:116:5: m1= multExpr ( ( '+' | '-' ) m2= multExpr )*
            {
                pushFollow(FOLLOW_multExpr_in_expr187);
                m1 = multExpr();
                state._fsp--;

                retval.isStatic = (m1 != null ? ((gramBindingParser.multExpr_return) m1).isStatic : 0);

                // gramBinding.g:118:7: ( ( '+' | '-' ) m2= multExpr )*
                loop11:
                while (true) {
                    int alt11 = 2;
                    int LA11_0 = input.LA(1);
                    if (((LA11_0 >= 22 && LA11_0 <= 23))) {
                        alt11 = 1;
                    }

                    switch (alt11) {
                        case 1: // gramBinding.g:119:9: ( '+' | '-' ) m2= multExpr
                        {
                            if ((input.LA(1) >= 22 && input.LA(1) <= 23)) {
                                input.consume();
                                state.errorRecovery = false;
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                throw mse;
                            }
                            pushFollow(FOLLOW_multExpr_in_expr213);
                            m2 = multExpr();
                            state._fsp--;

                            retval.isStatic = checkReducible((m1 != null ? ((gramBindingParser.multExpr_return) m1).isStatic : 0), (m2 != null ? ((gramBindingParser.multExpr_return) m2).isStatic : 0), (m1 != null ? input.toString(m1.start, m1.stop) : null), (m2 != null ? input.toString(m2.start, m2.stop) : null));

                        }
                        break;

                        default:
                            break loop11;
                    }
                }

            }

            retval.stop = input.LT(-1);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class multExpr_return extends ParserRuleReturnScope {

        public int isStatic;
    };

    // $ANTLR start "multExpr"
    // gramBinding.g:124:1: multExpr returns [int isStatic] : a1= atom ( '*' a2= atom )* ;
    public final gramBindingParser.multExpr_return multExpr() throws RecognitionException {
        gramBindingParser.multExpr_return retval = new gramBindingParser.multExpr_return();
        retval.start = input.LT(1);

        ParserRuleReturnScope a1 = null;
        ParserRuleReturnScope a2 = null;

        try {
            // gramBinding.g:124:31: (a1= atom ( '*' a2= atom )* )
            // gramBinding.g:125:5: a1= atom ( '*' a2= atom )*
            {
                pushFollow(FOLLOW_atom_in_multExpr240);
                a1 = atom();
                state._fsp--;

                retval.isStatic = (a1 != null ? ((gramBindingParser.atom_return) a1).isStatic : 0);

                // gramBinding.g:127:7: ( '*' a2= atom )*
                loop12:
                while (true) {
                    int alt12 = 2;
                    int LA12_0 = input.LA(1);
                    if ((LA12_0 == 21)) {
                        alt12 = 1;
                    }

                    switch (alt12) {
                        case 1: // gramBinding.g:128:9: '*' a2= atom
                        {
                            match(input, 21, FOLLOW_21_in_multExpr254);
                            pushFollow(FOLLOW_atom_in_multExpr260);
                            a2 = atom();
                            state._fsp--;

                            retval.isStatic = checkReducible((a1 != null ? ((gramBindingParser.atom_return) a1).isStatic : 0), (a2 != null ? ((gramBindingParser.atom_return) a2).isStatic : 0), (a1 != null ? input.toString(a1.start, a1.stop) : null), (a2 != null ? input.toString(a2.start, a2.stop) : null));

                        }
                        break;

                        default:
                            break loop12;
                    }
                }

            }

            retval.stop = input.LT(-1);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class atom_return extends ParserRuleReturnScope {

        public int isStatic;
    };

    // $ANTLR start "atom"
    // gramBinding.g:133:1: atom returns [int isStatic] : ( ID | CINT | CDOUBLE | OP_PARENT expr CL_PARENT );
    public final gramBindingParser.atom_return atom() throws RecognitionException {
        gramBindingParser.atom_return retval = new gramBindingParser.atom_return();
        retval.start = input.LT(1);

        Token ID8 = null;
        Token CINT9 = null;
        Token CDOUBLE10 = null;
        ParserRuleReturnScope expr11 = null;

        try {
            // gramBinding.g:133:27: ( ID | CINT | CDOUBLE | OP_PARENT expr CL_PARENT )
            int alt13 = 4;
            switch (input.LA(1)) {
                case ID: {
                    alt13 = 1;
                }
                break;
                case CINT: {
                    alt13 = 2;
                }
                break;
                case CDOUBLE: {
                    alt13 = 3;
                }
                break;
                case OP_PARENT: {
                    alt13 = 4;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 13, 0, input);
                    throw nvae;
            }
            switch (alt13) {
                case 1: // gramBinding.g:134:5: ID
                {
                    ID8 = (Token) match(input, ID, FOLLOW_ID_in_atom283);

                    retval.isStatic = buscarID((ID8 != null ? ID8.getText() : null));
                    if (retval.isStatic == 1) {
                        System.out.println("Variable " + (ID8 != null ? ID8.getText() : null) + " es estática");
                        salida.append("Variable " + (ID8 != null ? ID8.getText() : null) + " es estática" + "\n");
                    } else {
                        System.out.println("Variable " + (ID8 != null ? ID8.getText() : null) + " es dinámica");
                        salida.append("Variable " + (ID8 != null ? ID8.getText() : null) + " es dinámica" + "\n");
                    }

                }
                break;
                case 2: // gramBinding.g:142:7: CINT
                {
                    CINT9 = (Token) match(input, CINT, FOLLOW_CINT_in_atom293);

                    retval.isStatic = 1;
                    System.out.println("Constante " + (CINT9 != null ? CINT9.getText() : null) + " es estática");
                    salida.append("Constante " + (CINT9 != null ? CINT9.getText() : null) + " es estática" + "\n");

                }
                break;
                case 3: // gramBinding.g:146:7: CDOUBLE
                {
                    CDOUBLE10 = (Token) match(input, CDOUBLE, FOLLOW_CDOUBLE_in_atom303);

                    retval.isStatic = 1;
                    System.out.println("Constante " + (CDOUBLE10 != null ? CDOUBLE10.getText() : null) + " es estática");
                    salida.append("Constante " + (CDOUBLE10 != null ? CDOUBLE10.getText() : null) + " es estática" + "\n");

                }
                break;
                case 4: // gramBinding.g:150:7: OP_PARENT expr CL_PARENT
                {
                    match(input, OP_PARENT, FOLLOW_OP_PARENT_in_atom313);
                    pushFollow(FOLLOW_expr_in_atom315);
                    expr11 = expr();
                    state._fsp--;

                    match(input, CL_PARENT, FOLLOW_CL_PARENT_in_atom317);

                    retval.isStatic = (expr11 != null ? ((gramBindingParser.expr_return) expr11).isStatic : 0);

                }
                break;

            }
            retval.stop = input.LT(-1);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // $ANTLR start "args_decl"
    // gramBinding.g:154:1: args_decl : type t1= ID ( COMMA type t2= ID )* ;
    public final void args_decl() throws RecognitionException {
        Token t1 = null;
        Token t2 = null;

        try {
            // gramBinding.g:154:10: ( type t1= ID ( COMMA type t2= ID )* )
            // gramBinding.g:154:12: type t1= ID ( COMMA type t2= ID )*
            {
                pushFollow(FOLLOW_type_in_args_decl326);
                type();
                state._fsp--;

                t1 = (Token) match(input, ID, FOLLOW_ID_in_args_decl330);

                toTSL((t1 != null ? t1.getText() : null), 0);

                // gramBinding.g:156:3: ( COMMA type t2= ID )*
                loop14:
                while (true) {
                    int alt14 = 2;
                    int LA14_0 = input.LA(1);
                    if ((LA14_0 == COMMA)) {
                        alt14 = 1;
                    }

                    switch (alt14) {
                        case 1: // gramBinding.g:156:4: COMMA type t2= ID
                        {
                            match(input, COMMA, FOLLOW_COMMA_in_args_decl335);
                            pushFollow(FOLLOW_type_in_args_decl337);
                            type();
                            state._fsp--;

                            t2 = (Token) match(input, ID, FOLLOW_ID_in_args_decl341);

                            toTSL((t2 != null ? t2.getText() : null), 0);

                        }
                        break;

                        default:
                            break loop14;
                    }
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "args_decl"

    // $ANTLR start "access_mod"
    // gramBinding.g:160:1: access_mod : ( PRIVATE | PROTECTED | PUBLIC );
    public final void access_mod() throws RecognitionException {
        try {
            // gramBinding.g:160:11: ( PRIVATE | PROTECTED | PUBLIC )
            // gramBinding.g:
            {
                if ((input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC)) {
                    input.consume();
                    state.errorRecovery = false;
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    throw mse;
                }
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "access_mod"

    // $ANTLR start "type"
    // gramBinding.g:161:1: type : ( INT | DOUBLE );
    public final void type() throws RecognitionException {
        try {
            // gramBinding.g:161:5: ( INT | DOUBLE )
            // gramBinding.g:
            {
                if (input.LA(1) == DOUBLE || input.LA(1) == INT) {
                    input.consume();
                    state.errorRecovery = false;
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    throw mse;
                }
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "type"

    // Delegated rules
    public static final BitSet FOLLOW_class_def_in_start21 = new BitSet(new long[]{0x0000000000070042L});
    public static final BitSet FOLLOW_access_mod_in_class_def30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLASS_in_class_def34 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_class_def36 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_OP_CUR_BR_in_class_def40 = new BitSet(new long[]{0x0000000000072480L});
    public static final BitSet FOLLOW_member_in_class_def43 = new BitSet(new long[]{0x0000000000072480L});
    public static final BitSet FOLLOW_CL_CUR_BR_in_class_def47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_member54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_member58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_mod_in_attribute66 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_type_in_attribute70 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_attribute72 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMICOLON_in_attribute74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_mod_in_method84 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_type_in_method88 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_method90 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_OP_PARENT_in_method94 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_args_decl_in_method96 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CL_PARENT_in_method99 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_OP_CUR_BR_in_method101 = new BitSet(new long[]{0x0000000001003480L});
    public static final BitSet FOLLOW_sentence_in_method103 = new BitSet(new long[]{0x0000000001003480L});
    public static final BitSet FOLLOW_CL_CUR_BR_in_method106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_decl_in_sentence115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_sentence119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_sentence123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_local_decl130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_local_decl132 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_EQ_in_local_decl135 = new BitSet(new long[]{0x0000000000009030L});
    public static final BitSet FOLLOW_expr_in_local_decl137 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMICOLON_in_local_decl141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign150 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQ_in_assign152 = new BitSet(new long[]{0x0000000000009030L});
    public static final BitSet FOLLOW_expr_in_assign154 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assign156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_return_stmt165 = new BitSet(new long[]{0x0000000000009030L});
    public static final BitSet FOLLOW_expr_in_return_stmt167 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMICOLON_in_return_stmt169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr187 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_set_in_expr201 = new BitSet(new long[]{0x0000000000009030L});
    public static final BitSet FOLLOW_multExpr_in_expr213 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_atom_in_multExpr240 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_multExpr254 = new BitSet(new long[]{0x0000000000009030L});
    public static final BitSet FOLLOW_atom_in_multExpr260 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ID_in_atom283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CINT_in_atom293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CDOUBLE_in_atom303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PARENT_in_atom313 = new BitSet(new long[]{0x0000000000009030L});
    public static final BitSet FOLLOW_expr_in_atom315 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CL_PARENT_in_atom317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args_decl326 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_args_decl330 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_args_decl335 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_type_in_args_decl337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_args_decl341 = new BitSet(new long[]{0x0000000000000202L});
}
