// Generated from si413/ParseRules.g4 by ANTLR 4.13.1
package si413;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParseRules extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, LB=3, RB=4, LSB=5, RSB=6, END=7, SEP=8, RETURN=9, ASSIGN=10, 
		BOOLOP=11, STRCMP=12, STRREV=13, STROP=14, INPUT=15, IF=16, ELSE=17, WHILE=18, 
		FUNCTION=19, BOOLLIT=20, STRLIT=21, BOOLT=22, STRT=23, VOID=24, ID=25, 
		FUNC=26;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_paramlist = 2, RULE_arglist = 3, RULE_arg = 4, 
		RULE_exprlist = 5, RULE_exprliststuff = 6, RULE_funcexpr = 7, RULE_boolexpr = 8, 
		RULE_strexpr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "paramlist", "arglist", "arg", "exprlist", "exprliststuff", 
			"funcexpr", "boolexpr", "strexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "LB", "RB", "LSB", "RSB", "END", "SEP", "RETURN", "ASSIGN", 
			"BOOLOP", "STRCMP", "STRREV", "STROP", "INPUT", "IF", "ELSE", "WHILE", 
			"FUNCTION", "BOOLLIT", "STRLIT", "BOOLT", "STRT", "VOID", "ID", "FUNC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParseRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParseRules(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalProgContext extends ProgContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public NormalProgContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNormalProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNormalProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNormalProg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyProgContext extends ProgContext {
		public TerminalNode EOF() { return getToken(ParseRules.EOF, 0); }
		public EmptyProgContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterEmptyProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitEmptyProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitEmptyProg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContextProgContext extends ProgContext {
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public ContextProgContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterContextProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitContextProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitContextProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSB:
			case RETURN:
			case IF:
			case WHILE:
			case BOOLT:
			case STRT:
			case ID:
			case FUNC:
				_localctx = new NormalProgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				stmt();
				setState(21);
				prog();
				}
				break;
			case LB:
				_localctx = new ContextProgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(LB);
				setState(24);
				stmt();
				setState(25);
				prog();
				setState(26);
				match(RB);
				}
				break;
			case EOF:
				_localctx = new EmptyProgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStrContext extends StmtContext {
		public TerminalNode LSB() { return getToken(ParseRules.LSB, 0); }
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(ParseRules.RSB, 0); }
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public PrintStrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterPrintStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitPrintStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolVarAssignContext extends StmtContext {
		public TerminalNode BOOLT() { return getToken(ParseRules.BOOLT, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public BoolVarAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStrContext extends StmtContext {
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public ReturnStrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterReturnStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitReturnStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitReturnStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseContext extends StmtContext {
		public TerminalNode IF() { return getToken(ParseRules.IF, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public List<TerminalNode> RB() { return getTokens(ParseRules.RB); }
		public TerminalNode RB(int i) {
			return getToken(ParseRules.RB, i);
		}
		public List<TerminalNode> LB() { return getTokens(ParseRules.LB); }
		public TerminalNode LB(int i) {
			return getToken(ParseRules.LB, i);
		}
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ParseRules.ELSE, 0); }
		public IfElseContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnBoolContext extends StmtContext {
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public ReturnBoolContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterReturnBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitReturnBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitReturnBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncVarAssignContext extends StmtContext {
		public TerminalNode FUNC() { return getToken(ParseRules.FUNC, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public FuncexprContext funcexpr() {
			return getRuleContext(FuncexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public FuncVarAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFuncVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFuncVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFuncVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintBoolContext extends StmtContext {
		public TerminalNode LSB() { return getToken(ParseRules.LSB, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(ParseRules.RSB, 0); }
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public PrintBoolContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterPrintBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitPrintBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitPrintBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrVarAssignContext extends StmtContext {
		public TerminalNode STRT() { return getToken(ParseRules.STRT, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public StrVarAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(ParseRules.WHILE, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public WhileLoopContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolReassignContext extends StmtContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public BoolReassignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolReassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolReassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolReassign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrReassignContext extends StmtContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public StrReassignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrReassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrReassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrReassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BoolVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(BOOLT);
				setState(32);
				match(ID);
				setState(33);
				match(ASSIGN);
				setState(34);
				boolexpr(0);
				setState(35);
				match(END);
				}
				break;
			case 2:
				_localctx = new StrVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(STRT);
				setState(38);
				match(ID);
				setState(39);
				match(ASSIGN);
				setState(40);
				strexpr(0);
				setState(41);
				match(END);
				}
				break;
			case 3:
				_localctx = new FuncVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(FUNC);
				setState(44);
				match(ID);
				setState(45);
				match(ASSIGN);
				setState(46);
				funcexpr();
				setState(47);
				match(END);
				}
				break;
			case 4:
				_localctx = new BoolReassignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(ID);
				setState(50);
				match(ASSIGN);
				setState(51);
				boolexpr(0);
				setState(52);
				match(END);
				}
				break;
			case 5:
				_localctx = new StrReassignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(ID);
				setState(55);
				match(ASSIGN);
				setState(56);
				strexpr(0);
				setState(57);
				match(END);
				}
				break;
			case 6:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				match(LSB);
				setState(60);
				strexpr(0);
				setState(61);
				match(RSB);
				setState(62);
				match(END);
				}
				break;
			case 7:
				_localctx = new PrintBoolContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				match(LSB);
				setState(65);
				boolexpr(0);
				setState(66);
				match(RSB);
				setState(67);
				match(END);
				}
				break;
			case 8:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				match(WHILE);
				setState(70);
				match(LP);
				setState(71);
				boolexpr(0);
				setState(72);
				match(RP);
				setState(73);
				match(LB);
				setState(74);
				prog();
				setState(75);
				match(RB);
				}
				break;
			case 9:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				match(IF);
				setState(78);
				match(LP);
				setState(79);
				boolexpr(0);
				setState(80);
				match(RB);
				setState(81);
				match(LB);
				setState(82);
				prog();
				setState(83);
				match(RB);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(84);
					match(ELSE);
					setState(85);
					match(LB);
					setState(86);
					prog();
					setState(87);
					match(RB);
					}
				}

				}
				break;
			case 10:
				_localctx = new ReturnBoolContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
				match(RETURN);
				setState(92);
				boolexpr(0);
				setState(93);
				match(END);
				}
				break;
			case 11:
				_localctx = new ReturnStrContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				match(RETURN);
				setState(96);
				strexpr(0);
				setState(97);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamlistContext extends ParserRuleContext {
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
	 
		public ParamlistContext() { }
		public void copyFrom(ParamlistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyParamListContext extends ParamlistContext {
		public EmptyParamListContext(ParamlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterEmptyParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitEmptyParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitEmptyParamList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncParamsContext extends ParamlistContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public FuncParamsContext(ParamlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFuncParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFuncParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramlist);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLT:
			case STRT:
				_localctx = new FuncParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				arglist();
				}
				break;
			case RP:
				_localctx = new EmptyParamListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArglistContext extends ParserRuleContext {
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
	 
		public ArglistContext() { }
		public void copyFrom(ArglistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ArglistContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode SEP() { return getToken(ParseRules.SEP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ArgListContext(ArglistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastArgContext extends ArglistContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public LastArgContext(ArglistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterLastArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitLastArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitLastArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arglist);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ArgListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				arg();
				setState(106);
				match(SEP);
				setState(107);
				arglist();
				}
				break;
			case 2:
				_localctx = new LastArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				arg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParamContext extends ArgContext {
		public TerminalNode BOOLT() { return getToken(ParseRules.BOOLT, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public BoolParamContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrParamContext extends ArgContext {
		public TerminalNode STRT() { return getToken(ParseRules.STRT, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public StrParamContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arg);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLT:
				_localctx = new BoolParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(BOOLT);
				setState(113);
				match(ID);
				}
				break;
			case STRT:
				_localctx = new StrParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(STRT);
				setState(115);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlistContext extends ParserRuleContext {
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
	 
		public ExprlistContext() { }
		public void copyFrom(ExprlistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ExprlistContext {
		public ExprliststuffContext exprliststuff() {
			return getRuleContext(ExprliststuffContext.class,0);
		}
		public ExprListContext(ExprlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyExprListContext extends ExprlistContext {
		public EmptyExprListContext(ExprlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterEmptyExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitEmptyExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitEmptyExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprlist);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case STRREV:
			case INPUT:
			case BOOLLIT:
			case STRLIT:
			case ID:
				_localctx = new ExprListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				exprliststuff();
				}
				break;
			case RP:
			case RB:
				_localctx = new EmptyExprListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprliststuffContext extends ParserRuleContext {
		public ExprliststuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprliststuff; }
	 
		public ExprliststuffContext() { }
		public void copyFrom(ExprliststuffContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrArgMoreListContext extends ExprliststuffContext {
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public TerminalNode SEP() { return getToken(ParseRules.SEP, 0); }
		public ExprliststuffContext exprliststuff() {
			return getRuleContext(ExprliststuffContext.class,0);
		}
		public StrArgMoreListContext(ExprliststuffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrArgMoreList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrArgMoreList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrArgMoreList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastBoolArgContext extends ExprliststuffContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public LastBoolArgContext(ExprliststuffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterLastBoolArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitLastBoolArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitLastBoolArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastStrArgContext extends ExprliststuffContext {
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public LastStrArgContext(ExprliststuffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterLastStrArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitLastStrArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitLastStrArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolArgMoreListContext extends ExprliststuffContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode SEP() { return getToken(ParseRules.SEP, 0); }
		public ExprliststuffContext exprliststuff() {
			return getRuleContext(ExprliststuffContext.class,0);
		}
		public BoolArgMoreListContext(ExprliststuffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolArgMoreList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolArgMoreList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolArgMoreList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprliststuffContext exprliststuff() throws RecognitionException {
		ExprliststuffContext _localctx = new ExprliststuffContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprliststuff);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BoolArgMoreListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				boolexpr(0);
				setState(123);
				match(SEP);
				setState(124);
				exprliststuff();
				}
				break;
			case 2:
				_localctx = new StrArgMoreListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				strexpr(0);
				setState(127);
				match(SEP);
				setState(128);
				exprliststuff();
				}
				break;
			case 3:
				_localctx = new LastBoolArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				boolexpr(0);
				}
				break;
			case 4:
				_localctx = new LastStrArgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				strexpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncexprContext extends ParserRuleContext {
		public FuncexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcexpr; }
	 
		public FuncexprContext() { }
		public void copyFrom(FuncexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FirstOrderFuncContext extends FuncexprContext {
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public TerminalNode FUNCTION() { return getToken(ParseRules.FUNCTION, 0); }
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public FirstOrderFuncContext(FuncexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFirstOrderFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFirstOrderFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFirstOrderFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolFuncDefContext extends FuncexprContext {
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public TerminalNode BOOLT() { return getToken(ParseRules.BOOLT, 0); }
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public BoolFuncDefContext(FuncexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidFuncDefContext extends FuncexprContext {
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public TerminalNode VOID() { return getToken(ParseRules.VOID, 0); }
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public VoidFuncDefContext(FuncexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterVoidFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitVoidFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitVoidFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FirstOrderCallContext extends FuncexprContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public FirstOrderCallContext(FuncexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFirstOrderCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFirstOrderCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFirstOrderCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrFuncDefContext extends FuncexprContext {
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public TerminalNode STRT() { return getToken(ParseRules.STRT, 0); }
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public StrFuncDefContext(FuncexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncexprContext funcexpr() throws RecognitionException {
		FuncexprContext _localctx = new FuncexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcexpr);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FirstOrderCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(ID);
				setState(135);
				match(LP);
				setState(136);
				exprlist();
				setState(137);
				match(RB);
				}
				break;
			case 2:
				_localctx = new BoolFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(LP);
				setState(140);
				paramlist();
				setState(141);
				match(RP);
				setState(142);
				match(RETURN);
				setState(143);
				match(BOOLT);
				setState(144);
				match(LB);
				setState(145);
				prog();
				setState(146);
				match(RB);
				}
				break;
			case 3:
				_localctx = new StrFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(LP);
				setState(149);
				paramlist();
				setState(150);
				match(RP);
				setState(151);
				match(RETURN);
				setState(152);
				match(STRT);
				setState(153);
				match(LB);
				setState(154);
				prog();
				setState(155);
				match(RB);
				}
				break;
			case 4:
				_localctx = new VoidFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(LP);
				setState(158);
				paramlist();
				setState(159);
				match(RP);
				setState(160);
				match(RETURN);
				setState(161);
				match(VOID);
				setState(162);
				match(LB);
				setState(163);
				prog();
				setState(164);
				match(RB);
				}
				break;
			case 5:
				_localctx = new FirstOrderFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(LP);
				setState(167);
				paramlist();
				setState(168);
				match(RP);
				setState(169);
				match(RETURN);
				setState(170);
				match(FUNCTION);
				setState(171);
				match(LB);
				setState(172);
				prog();
				setState(173);
				match(RB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolexprContext extends ParserRuleContext {
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
	 
		public BoolexprContext() { }
		public void copyFrom(BoolexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolReorderContext extends BoolexprContext {
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public BoolReorderContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolReorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolReorder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolReorder(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolBinOpContext extends BoolexprContext {
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public TerminalNode BOOLOP() { return getToken(ParseRules.BOOLOP, 0); }
		public BoolBinOpContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrCmpContext extends BoolexprContext {
		public List<StrexprContext> strexpr() {
			return getRuleContexts(StrexprContext.class);
		}
		public StrexprContext strexpr(int i) {
			return getRuleContext(StrexprContext.class,i);
		}
		public TerminalNode STRCMP() { return getToken(ParseRules.STRCMP, 0); }
		public StrCmpContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolFuncCallContext extends BoolexprContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public BoolFuncCallContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetBoolVarContext extends BoolexprContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public GetBoolVarContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterGetBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitGetBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitGetBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitContext extends BoolexprContext {
		public TerminalNode BOOLLIT() { return getToken(ParseRules.BOOLLIT, 0); }
		public BoolLitContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new StrCmpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(178);
				strexpr(0);
				setState(179);
				match(STRCMP);
				setState(180);
				strexpr(0);
				}
				break;
			case 2:
				{
				_localctx = new BoolReorderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(LP);
				setState(183);
				boolexpr(0);
				setState(184);
				match(RB);
				}
				break;
			case 3:
				{
				_localctx = new BoolFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(ID);
				setState(187);
				match(LP);
				setState(188);
				exprlist();
				setState(189);
				match(RP);
				}
				break;
			case 4:
				{
				_localctx = new BoolLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(BOOLLIT);
				}
				break;
			case 5:
				{
				_localctx = new GetBoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolBinOpContext(new BoolexprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
					setState(195);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(196);
					match(BOOLOP);
					setState(197);
					boolexpr(7);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrexprContext extends ParserRuleContext {
		public StrexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strexpr; }
	 
		public StrexprContext() { }
		public void copyFrom(StrexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends StrexprContext {
		public TerminalNode INPUT() { return getToken(ParseRules.INPUT, 0); }
		public InputContext(StrexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetStrVarContext extends StrexprContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public GetStrVarContext(StrexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterGetStrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitGetStrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitGetStrVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrBinOpContext extends StrexprContext {
		public List<StrexprContext> strexpr() {
			return getRuleContexts(StrexprContext.class);
		}
		public StrexprContext strexpr(int i) {
			return getRuleContext(StrexprContext.class,i);
		}
		public TerminalNode STROP() { return getToken(ParseRules.STROP, 0); }
		public StrBinOpContext(StrexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrFuncCallContext extends StrexprContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public StrFuncCallContext(StrexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrReorderContext extends StrexprContext {
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public StrReorderContext(StrexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrReorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrReorder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrReorder(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RevStrContext extends StrexprContext {
		public TerminalNode STRREV() { return getToken(ParseRules.STRREV, 0); }
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public RevStrContext(StrexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterRevStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitRevStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitRevStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrLitContext extends StrexprContext {
		public TerminalNode STRLIT() { return getToken(ParseRules.STRLIT, 0); }
		public StrLitContext(StrexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrexprContext strexpr() throws RecognitionException {
		return strexpr(0);
	}

	private StrexprContext strexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StrexprContext _localctx = new StrexprContext(_ctx, _parentState);
		StrexprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_strexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new RevStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(204);
				match(STRREV);
				setState(205);
				strexpr(6);
				}
				break;
			case 2:
				{
				_localctx = new StrReorderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(LP);
				setState(207);
				strexpr(0);
				setState(208);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(INPUT);
				}
				break;
			case 4:
				{
				_localctx = new StrFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(ID);
				setState(212);
				match(LP);
				setState(213);
				exprlist();
				setState(214);
				match(RP);
				}
				break;
			case 5:
				{
				_localctx = new StrLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(STRLIT);
				}
				break;
			case 6:
				{
				_localctx = new GetStrVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StrBinOpContext(new StrexprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_strexpr);
					setState(220);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(221);
					match(STROP);
					setState(222);
					strexpr(8);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		case 9:
			return strexpr_sempred((StrexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean strexpr_sempred(StrexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00e5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u001e\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001Z\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001d\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003o\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005y\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0085\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00b0\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c2\b\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00c7\b\b\n\b\f\b\u00ca\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00db\b\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e0\b\t"+
		"\n\t\f\t\u00e3\t\t\u0001\t\u0000\u0002\u0010\u0012\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000\u00fd\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0002c\u0001\u0000\u0000\u0000\u0004g\u0001\u0000\u0000\u0000"+
		"\u0006n\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000\u0000\nx\u0001\u0000"+
		"\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u00af\u0001\u0000\u0000"+
		"\u0000\u0010\u00c1\u0001\u0000\u0000\u0000\u0012\u00da\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0003\u0000\u0000"+
		"\u0000\u0016\u001e\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0003\u0000"+
		"\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0003\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b\u001e\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0005\u0000\u0000\u0001\u001d\u0014\u0001\u0000\u0000"+
		"\u0000\u001d\u0017\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0005\u0016\u0000\u0000"+
		" !\u0005\u0019\u0000\u0000!\"\u0005\n\u0000\u0000\"#\u0003\u0010\b\u0000"+
		"#$\u0005\u0007\u0000\u0000$d\u0001\u0000\u0000\u0000%&\u0005\u0017\u0000"+
		"\u0000&\'\u0005\u0019\u0000\u0000\'(\u0005\n\u0000\u0000()\u0003\u0012"+
		"\t\u0000)*\u0005\u0007\u0000\u0000*d\u0001\u0000\u0000\u0000+,\u0005\u001a"+
		"\u0000\u0000,-\u0005\u0019\u0000\u0000-.\u0005\n\u0000\u0000./\u0003\u000e"+
		"\u0007\u0000/0\u0005\u0007\u0000\u00000d\u0001\u0000\u0000\u000012\u0005"+
		"\u0019\u0000\u000023\u0005\n\u0000\u000034\u0003\u0010\b\u000045\u0005"+
		"\u0007\u0000\u00005d\u0001\u0000\u0000\u000067\u0005\u0019\u0000\u0000"+
		"78\u0005\n\u0000\u000089\u0003\u0012\t\u00009:\u0005\u0007\u0000\u0000"+
		":d\u0001\u0000\u0000\u0000;<\u0005\u0005\u0000\u0000<=\u0003\u0012\t\u0000"+
		"=>\u0005\u0006\u0000\u0000>?\u0005\u0007\u0000\u0000?d\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0005\u0000\u0000AB\u0003\u0010\b\u0000BC\u0005\u0006\u0000"+
		"\u0000CD\u0005\u0007\u0000\u0000Dd\u0001\u0000\u0000\u0000EF\u0005\u0012"+
		"\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u0003\u0010\b\u0000HI\u0005\u0002"+
		"\u0000\u0000IJ\u0005\u0003\u0000\u0000JK\u0003\u0000\u0000\u0000KL\u0005"+
		"\u0004\u0000\u0000Ld\u0001\u0000\u0000\u0000MN\u0005\u0010\u0000\u0000"+
		"NO\u0005\u0001\u0000\u0000OP\u0003\u0010\b\u0000PQ\u0005\u0004\u0000\u0000"+
		"QR\u0005\u0003\u0000\u0000RS\u0003\u0000\u0000\u0000SY\u0005\u0004\u0000"+
		"\u0000TU\u0005\u0011\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u0003\u0000"+
		"\u0000\u0000WX\u0005\u0004\u0000\u0000XZ\u0001\u0000\u0000\u0000YT\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Zd\u0001\u0000\u0000\u0000"+
		"[\\\u0005\t\u0000\u0000\\]\u0003\u0010\b\u0000]^\u0005\u0007\u0000\u0000"+
		"^d\u0001\u0000\u0000\u0000_`\u0005\t\u0000\u0000`a\u0003\u0012\t\u0000"+
		"ab\u0005\u0007\u0000\u0000bd\u0001\u0000\u0000\u0000c\u001f\u0001\u0000"+
		"\u0000\u0000c%\u0001\u0000\u0000\u0000c+\u0001\u0000\u0000\u0000c1\u0001"+
		"\u0000\u0000\u0000c6\u0001\u0000\u0000\u0000c;\u0001\u0000\u0000\u0000"+
		"c@\u0001\u0000\u0000\u0000cE\u0001\u0000\u0000\u0000cM\u0001\u0000\u0000"+
		"\u0000c[\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000d\u0003\u0001"+
		"\u0000\u0000\u0000eh\u0003\u0006\u0003\u0000fh\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0005\u0001\u0000"+
		"\u0000\u0000ij\u0003\b\u0004\u0000jk\u0005\b\u0000\u0000kl\u0003\u0006"+
		"\u0003\u0000lo\u0001\u0000\u0000\u0000mo\u0003\b\u0004\u0000ni\u0001\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0007\u0001\u0000\u0000\u0000"+
		"pq\u0005\u0016\u0000\u0000qu\u0005\u0019\u0000\u0000rs\u0005\u0017\u0000"+
		"\u0000su\u0005\u0019\u0000\u0000tp\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000u\t\u0001\u0000\u0000\u0000vy\u0003\f\u0006\u0000wy\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"y\u000b\u0001\u0000\u0000\u0000z{\u0003\u0010\b\u0000{|\u0005\b\u0000"+
		"\u0000|}\u0003\f\u0006\u0000}\u0085\u0001\u0000\u0000\u0000~\u007f\u0003"+
		"\u0012\t\u0000\u007f\u0080\u0005\b\u0000\u0000\u0080\u0081\u0003\f\u0006"+
		"\u0000\u0081\u0085\u0001\u0000\u0000\u0000\u0082\u0085\u0003\u0010\b\u0000"+
		"\u0083\u0085\u0003\u0012\t\u0000\u0084z\u0001\u0000\u0000\u0000\u0084"+
		"~\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u0019\u0000\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0089\u0003"+
		"\n\u0005\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u00b0\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c\u008d\u0003\u0004"+
		"\u0002\u0000\u008d\u008e\u0005\u0002\u0000\u0000\u008e\u008f\u0005\t\u0000"+
		"\u0000\u008f\u0090\u0005\u0016\u0000\u0000\u0090\u0091\u0005\u0003\u0000"+
		"\u0000\u0091\u0092\u0003\u0000\u0000\u0000\u0092\u0093\u0005\u0004\u0000"+
		"\u0000\u0093\u00b0\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0001\u0000"+
		"\u0000\u0095\u0096\u0003\u0004\u0002\u0000\u0096\u0097\u0005\u0002\u0000"+
		"\u0000\u0097\u0098\u0005\t\u0000\u0000\u0098\u0099\u0005\u0017\u0000\u0000"+
		"\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0003\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u0004\u0000\u0000\u009c\u00b0\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0003\u0004\u0002\u0000"+
		"\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a1\u0005\t\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0018\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3"+
		"\u00a4\u0003\u0000\u0000\u0000\u00a4\u00a5\u0005\u0004\u0000\u0000\u00a5"+
		"\u00b0\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0001\u0000\u0000\u00a7"+
		"\u00a8\u0003\u0004\u0002\u0000\u00a8\u00a9\u0005\u0002\u0000\u0000\u00a9"+
		"\u00aa\u0005\t\u0000\u0000\u00aa\u00ab\u0005\u0013\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0003\u0000\u0000\u00ac\u00ad\u0003\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0004\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u0086"+
		"\u0001\u0000\u0000\u0000\u00af\u008b\u0001\u0000\u0000\u0000\u00af\u0094"+
		"\u0001\u0000\u0000\u0000\u00af\u009d\u0001\u0000\u0000\u0000\u00af\u00a6"+
		"\u0001\u0000\u0000\u0000\u00b0\u000f\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0006\b\uffff\uffff\u0000\u00b2\u00b3\u0003\u0012\t\u0000\u00b3\u00b4"+
		"\u0005\f\u0000\u0000\u00b4\u00b5\u0003\u0012\t\u0000\u00b5\u00c2\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u0001\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0010\b\u0000\u00b8\u00b9\u0005\u0004\u0000\u0000\u00b9\u00c2\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0019\u0000\u0000\u00bb\u00bc\u0005\u0001"+
		"\u0000\u0000\u00bc\u00bd\u0003\n\u0005\u0000\u00bd\u00be\u0005\u0002\u0000"+
		"\u0000\u00be\u00c2\u0001\u0000\u0000\u0000\u00bf\u00c2\u0005\u0014\u0000"+
		"\u0000\u00c0\u00c2\u0005\u0019\u0000\u0000\u00c1\u00b1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b6\u0001\u0000\u0000\u0000\u00c1\u00ba\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c8\u0001\u0000\u0000\u0000\u00c3\u00c4\n\u0006\u0000\u0000"+
		"\u00c4\u00c5\u0005\u000b\u0000\u0000\u00c5\u00c7\u0003\u0010\b\u0007\u00c6"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u0011\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0006\t\uffff\uffff\u0000\u00cc\u00cd\u0005\r\u0000\u0000\u00cd"+
		"\u00db\u0003\u0012\t\u0006\u00ce\u00cf\u0005\u0001\u0000\u0000\u00cf\u00d0"+
		"\u0003\u0012\t\u0000\u00d0\u00d1\u0005\u0002\u0000\u0000\u00d1\u00db\u0001"+
		"\u0000\u0000\u0000\u00d2\u00db\u0005\u000f\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0019\u0000\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5\u00d6\u0003"+
		"\n\u0005\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000\u00d7\u00db\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0005\u0015\u0000\u0000\u00d9\u00db\u0005\u0019"+
		"\u0000\u0000\u00da\u00cb\u0001\u0000\u0000\u0000\u00da\u00ce\u0001\u0000"+
		"\u0000\u0000\u00da\u00d2\u0001\u0000\u0000\u0000\u00da\u00d3\u0001\u0000"+
		"\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00e1\u0001\u0000\u0000\u0000\u00dc\u00dd\n\u0007\u0000"+
		"\u0000\u00dd\u00de\u0005\u000e\u0000\u0000\u00de\u00e0\u0003\u0012\t\b"+
		"\u00df\u00dc\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u0013\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\r\u001dYcgntx\u0084\u00af\u00c1\u00c8\u00da\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}