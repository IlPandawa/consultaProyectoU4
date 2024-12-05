package com.mycompany.proyectocompilador.antlrG00;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AOptimizadorLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public AOptimizadorLexer() {} 
	public AOptimizadorLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public AOptimizadorLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return ".\\AOptimizador.g"; }

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:2:7: ( '*' )
			// .\\AOptimizador.g:2:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:3:7: ( '+' )
			// .\\AOptimizador.g:3:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:4:7: ( '-' )
			// .\\AOptimizador.g:4:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "OP_PARENT"
	public final void mOP_PARENT() throws RecognitionException {
		try {
			int _type = OP_PARENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:148:10: ( '(' )
			// .\\AOptimizador.g:148:12: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_PARENT"

	// $ANTLR start "CL_PARENT"
	public final void mCL_PARENT() throws RecognitionException {
		try {
			int _type = CL_PARENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:149:10: ( ')' )
			// .\\AOptimizador.g:149:12: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL_PARENT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:150:3: ( '=' )
			// .\\AOptimizador.g:150:5: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "OP_CUR_BR"
	public final void mOP_CUR_BR() throws RecognitionException {
		try {
			int _type = OP_CUR_BR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:151:10: ( '{' )
			// .\\AOptimizador.g:151:12: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_CUR_BR"

	// $ANTLR start "CL_CUR_BR"
	public final void mCL_CUR_BR() throws RecognitionException {
		try {
			int _type = CL_CUR_BR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:152:10: ( '}' )
			// .\\AOptimizador.g:152:12: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL_CUR_BR"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:153:8: ( 'private' )
			// .\\AOptimizador.g:153:10: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:154:7: ( 'public' )
			// .\\AOptimizador.g:154:9: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:155:10: ( 'protected' )
			// .\\AOptimizador.g:155:12: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:156:6: ( 'class' )
			// .\\AOptimizador.g:156:8: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:157:6: ( ',' )
			// .\\AOptimizador.g:157:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:158:10: ( ';' )
			// .\\AOptimizador.g:158:12: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:159:4: ( 'int' )
			// .\\AOptimizador.g:159:6: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:160:7: ( 'double' )
			// .\\AOptimizador.g:160:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:161:7: ( 'return' )
			// .\\AOptimizador.g:161:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "CDOUBLE"
	public final void mCDOUBLE() throws RecognitionException {
		try {
			int _type = CDOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:162:8: ( CINT '.' CINT )
			// .\\AOptimizador.g:162:10: CINT '.' CINT
			{
			mCINT(); 

			match('.'); 
			mCINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CDOUBLE"

	// $ANTLR start "CINT"
	public final void mCINT() throws RecognitionException {
		try {
			int _type = CINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:163:5: ( ( '0' .. '9' )+ )
			// .\\AOptimizador.g:163:7: ( '0' .. '9' )+
			{
			// .\\AOptimizador.g:163:7: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\AOptimizador.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CINT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\AOptimizador.g:164:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// .\\AOptimizador.g:164:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// .\\AOptimizador.g:164:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// .\\AOptimizador.g:
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
					break loop2;
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
			// .\\AOptimizador.g:165:3: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// .\\AOptimizador.g:165:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// .\\AOptimizador.g:165:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// .\\AOptimizador.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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
		// .\\AOptimizador.g:1:8: ( T__22 | T__23 | T__24 | OP_PARENT | CL_PARENT | EQ | OP_CUR_BR | CL_CUR_BR | PRIVATE | PUBLIC | PROTECTED | CLASS | COMMA | SEMICOLON | INT | DOUBLE | RETURN | CDOUBLE | CINT | ID | WS )
		int alt4=21;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// .\\AOptimizador.g:1:10: T__22
				{
				mT__22(); 

				}
				break;
			case 2 :
				// .\\AOptimizador.g:1:16: T__23
				{
				mT__23(); 

				}
				break;
			case 3 :
				// .\\AOptimizador.g:1:22: T__24
				{
				mT__24(); 

				}
				break;
			case 4 :
				// .\\AOptimizador.g:1:28: OP_PARENT
				{
				mOP_PARENT(); 

				}
				break;
			case 5 :
				// .\\AOptimizador.g:1:38: CL_PARENT
				{
				mCL_PARENT(); 

				}
				break;
			case 6 :
				// .\\AOptimizador.g:1:48: EQ
				{
				mEQ(); 

				}
				break;
			case 7 :
				// .\\AOptimizador.g:1:51: OP_CUR_BR
				{
				mOP_CUR_BR(); 

				}
				break;
			case 8 :
				// .\\AOptimizador.g:1:61: CL_CUR_BR
				{
				mCL_CUR_BR(); 

				}
				break;
			case 9 :
				// .\\AOptimizador.g:1:71: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 10 :
				// .\\AOptimizador.g:1:79: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 11 :
				// .\\AOptimizador.g:1:86: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 12 :
				// .\\AOptimizador.g:1:96: CLASS
				{
				mCLASS(); 

				}
				break;
			case 13 :
				// .\\AOptimizador.g:1:102: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 14 :
				// .\\AOptimizador.g:1:108: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 15 :
				// .\\AOptimizador.g:1:118: INT
				{
				mINT(); 

				}
				break;
			case 16 :
				// .\\AOptimizador.g:1:122: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 17 :
				// .\\AOptimizador.g:1:129: RETURN
				{
				mRETURN(); 

				}
				break;
			case 18 :
				// .\\AOptimizador.g:1:136: CDOUBLE
				{
				mCDOUBLE(); 

				}
				break;
			case 19 :
				// .\\AOptimizador.g:1:144: CINT
				{
				mCINT(); 

				}
				break;
			case 20 :
				// .\\AOptimizador.g:1:149: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// .\\AOptimizador.g:1:152: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\11\uffff\2\21\2\uffff\3\21\1\31\2\uffff\6\21\2\uffff\4\21\1\46\6\21\1"+
		"\uffff\5\21\1\62\4\21\1\67\1\uffff\1\70\1\71\1\72\1\21\4\uffff\1\21\1"+
		"\75\1\uffff";
	static final String DFA4_eofS =
		"\76\uffff";
	static final String DFA4_minS =
		"\1\11\10\uffff\1\162\1\154\2\uffff\1\156\1\157\1\145\1\56\2\uffff\1\151"+
		"\1\142\1\141\1\164\1\165\1\164\2\uffff\1\166\1\164\1\154\1\163\1\60\1"+
		"\142\1\165\1\141\1\145\1\151\1\163\1\uffff\1\154\1\162\1\164\2\143\1\60"+
		"\1\145\1\156\1\145\1\164\1\60\1\uffff\3\60\1\145\4\uffff\1\144\1\60\1"+
		"\uffff";
	static final String DFA4_maxS =
		"\1\175\10\uffff\1\165\1\154\2\uffff\1\156\1\157\1\145\1\71\2\uffff\1\157"+
		"\1\142\1\141\1\164\1\165\1\164\2\uffff\1\166\1\164\1\154\1\163\1\172\1"+
		"\142\1\165\1\141\1\145\1\151\1\163\1\uffff\1\154\1\162\1\164\2\143\1\172"+
		"\1\145\1\156\1\145\1\164\1\172\1\uffff\3\172\1\145\4\uffff\1\144\1\172"+
		"\1\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\15\1\16\4\uffff\1"+
		"\24\1\25\6\uffff\1\23\1\22\13\uffff\1\17\13\uffff\1\14\4\uffff\1\12\1"+
		"\20\1\21\1\11\2\uffff\1\13";
	static final String DFA4_specialS =
		"\76\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\7\uffff\1\4\1\5\1\1\1\2\1\13\1\3\2\uffff"+
			"\12\20\1\uffff\1\14\1\uffff\1\6\3\uffff\32\21\4\uffff\1\21\1\uffff\2"+
			"\21\1\12\1\16\4\21\1\15\6\21\1\11\1\21\1\17\10\21\1\7\1\uffff\1\10",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\23\2\uffff\1\24",
			"\1\25",
			"",
			"",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\32\1\uffff\12\20",
			"",
			"",
			"\1\33\5\uffff\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"",
			"",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\73",
			"",
			"",
			"",
			"",
			"\1\74",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__22 | T__23 | T__24 | OP_PARENT | CL_PARENT | EQ | OP_CUR_BR | CL_CUR_BR | PRIVATE | PUBLIC | PROTECTED | CLASS | COMMA | SEMICOLON | INT | DOUBLE | RETURN | CDOUBLE | CINT | ID | WS );";
		}
	}

}
