package com.mycompany.proyectocompilador.antlrG00;// $ANTLR 3.5.2 gramBinding.g 2024-12-02 10:27:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gramBindingLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__21=21;
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
	public static final int SEMICOLON=19;
	public static final int WS=20;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public gramBindingLexer() {} 
	public gramBindingLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public gramBindingLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "gramBinding.g"; }

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:2:7: ( '*' )
			// gramBinding.g:2:9: '*'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:3:7: ( '+' )
			// gramBinding.g:3:9: '+'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:4:7: ( '-' )
			// gramBinding.g:4:9: '-'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:5:7: ( 'return' )
			// gramBinding.g:5:9: 'return'
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
	// $ANTLR end "T__24"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:163:6: ( 'class' )
			// gramBinding.g:163:8: 'class'
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

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:164:8: ( 'private' )
			// gramBinding.g:164:10: 'private'
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

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:165:10: ( 'protected' )
			// gramBinding.g:165:12: 'protected'
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

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:166:7: ( 'public' )
			// gramBinding.g:166:9: 'public'
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:167:4: ( 'int' )
			// gramBinding.g:167:6: 'int'
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
			// gramBinding.g:168:7: ( 'double' )
			// gramBinding.g:168:9: 'double'
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

	// $ANTLR start "OP_CUR_BR"
	public final void mOP_CUR_BR() throws RecognitionException {
		try {
			int _type = OP_CUR_BR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:169:10: ( '{' )
			// gramBinding.g:169:12: '{'
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
			// gramBinding.g:170:10: ( '}' )
			// gramBinding.g:170:12: '}'
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

	// $ANTLR start "OP_PARENT"
	public final void mOP_PARENT() throws RecognitionException {
		try {
			int _type = OP_PARENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:171:10: ( '(' )
			// gramBinding.g:171:12: '('
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
			// gramBinding.g:172:10: ( ')' )
			// gramBinding.g:172:12: ')'
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

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:173:6: ( ',' )
			// gramBinding.g:173:8: ','
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
			// gramBinding.g:174:10: ( ';' )
			// gramBinding.g:174:12: ';'
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

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:175:3: ( '=' )
			// gramBinding.g:175:5: '='
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

	// $ANTLR start "CDOUBLE"
	public final void mCDOUBLE() throws RecognitionException {
		try {
			int _type = CDOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gramBinding.g:177:8: ( CINT '.' CINT )
			// gramBinding.g:177:10: CINT '.' CINT
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
			// gramBinding.g:178:5: ( ( '0' .. '9' )+ )
			// gramBinding.g:178:7: ( '0' .. '9' )+
			{
			// gramBinding.g:178:7: ( '0' .. '9' )+
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
					// gramBinding.g:
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
			// gramBinding.g:179:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// gramBinding.g:179:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// gramBinding.g:179:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// gramBinding.g:
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
			// gramBinding.g:180:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// gramBinding.g:180:5: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// gramBinding.g:180:5: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
					// gramBinding.g:
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
		// gramBinding.g:1:8: ( T__21 | T__22 | T__23 | T__24 | CLASS | PRIVATE | PROTECTED | PUBLIC | INT | DOUBLE | OP_CUR_BR | CL_CUR_BR | OP_PARENT | CL_PARENT | COMMA | SEMICOLON | EQ | CDOUBLE | CINT | ID | WS )
		int alt4=21;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// gramBinding.g:1:10: T__21
				{
				mT__21(); 

				}
				break;
			case 2 :
				// gramBinding.g:1:16: T__22
				{
				mT__22(); 

				}
				break;
			case 3 :
				// gramBinding.g:1:22: T__23
				{
				mT__23(); 

				}
				break;
			case 4 :
				// gramBinding.g:1:28: T__24
				{
				mT__24(); 

				}
				break;
			case 5 :
				// gramBinding.g:1:34: CLASS
				{
				mCLASS(); 

				}
				break;
			case 6 :
				// gramBinding.g:1:40: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 7 :
				// gramBinding.g:1:48: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 8 :
				// gramBinding.g:1:58: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 9 :
				// gramBinding.g:1:65: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// gramBinding.g:1:69: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 11 :
				// gramBinding.g:1:76: OP_CUR_BR
				{
				mOP_CUR_BR(); 

				}
				break;
			case 12 :
				// gramBinding.g:1:86: CL_CUR_BR
				{
				mCL_CUR_BR(); 

				}
				break;
			case 13 :
				// gramBinding.g:1:96: OP_PARENT
				{
				mOP_PARENT(); 

				}
				break;
			case 14 :
				// gramBinding.g:1:106: CL_PARENT
				{
				mCL_PARENT(); 

				}
				break;
			case 15 :
				// gramBinding.g:1:116: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 16 :
				// gramBinding.g:1:122: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// gramBinding.g:1:132: EQ
				{
				mEQ(); 

				}
				break;
			case 18 :
				// gramBinding.g:1:135: CDOUBLE
				{
				mCDOUBLE(); 

				}
				break;
			case 19 :
				// gramBinding.g:1:143: CINT
				{
				mCINT(); 

				}
				break;
			case 20 :
				// gramBinding.g:1:148: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// gramBinding.g:1:151: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\4\uffff\5\21\7\uffff\1\31\2\uffff\6\21\2\uffff\5\21\1\47\6\21\1\uffff"+
		"\2\21\1\60\4\21\1\65\1\uffff\2\21\1\70\1\71\1\uffff\1\72\1\21\3\uffff"+
		"\1\21\1\75\1\uffff";
	static final String DFA4_eofS =
		"\76\uffff";
	static final String DFA4_minS =
		"\1\11\3\uffff\1\145\1\154\1\162\1\156\1\157\7\uffff\1\56\2\uffff\1\164"+
		"\1\141\1\151\1\142\1\164\1\165\2\uffff\1\165\1\163\1\166\1\164\1\154\1"+
		"\60\1\142\1\162\1\163\1\141\1\145\1\151\1\uffff\1\154\1\156\1\60\1\164"+
		"\2\143\1\145\1\60\1\uffff\1\145\1\164\2\60\1\uffff\1\60\1\145\3\uffff"+
		"\1\144\1\60\1\uffff";
	static final String DFA4_maxS =
		"\1\175\3\uffff\1\145\1\154\1\165\1\156\1\157\7\uffff\1\71\2\uffff\1\164"+
		"\1\141\1\157\1\142\1\164\1\165\2\uffff\1\165\1\163\1\166\1\164\1\154\1"+
		"\172\1\142\1\162\1\163\1\141\1\145\1\151\1\uffff\1\154\1\156\1\172\1\164"+
		"\2\143\1\145\1\172\1\uffff\1\145\1\164\2\172\1\uffff\1\172\1\145\3\uffff"+
		"\1\144\1\172\1\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\5\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff"+
		"\1\24\1\25\6\uffff\1\23\1\22\14\uffff\1\11\10\uffff\1\5\4\uffff\1\4\2"+
		"\uffff\1\10\1\12\1\6\2\uffff\1\7";
	static final String DFA4_specialS =
		"\76\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\7\uffff\1\13\1\14\1\1\1\2\1\15\1\3\2"+
			"\uffff\12\20\1\uffff\1\16\1\uffff\1\17\3\uffff\32\21\4\uffff\1\21\1\uffff"+
			"\2\21\1\5\1\10\4\21\1\7\6\21\1\6\1\21\1\4\10\21\1\11\1\uffff\1\12",
			"",
			"",
			"",
			"\1\23",
			"\1\24",
			"\1\25\2\uffff\1\26",
			"\1\27",
			"\1\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\32\1\uffff\12\20",
			"",
			"",
			"\1\33",
			"\1\34",
			"\1\35\5\uffff\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"",
			"",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"",
			"\1\56",
			"\1\57",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"\1\66",
			"\1\67",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\73",
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
			return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | CLASS | PRIVATE | PROTECTED | PUBLIC | INT | DOUBLE | OP_CUR_BR | CL_CUR_BR | OP_PARENT | CL_PARENT | COMMA | SEMICOLON | EQ | CDOUBLE | CINT | ID | WS );";
		}
	}

}
