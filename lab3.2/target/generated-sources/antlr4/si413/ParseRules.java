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
		TILDE=1, LB=2, RB=3, LP=4, RP=5, STROP=6, OP=7, BOOL=8, PRINT=9, INPUT=10, 
		REV=11, LIT=12, IF=13, THEN=14, ELSE=15, LOOP=16, TBOOL=17, TSTR=18, BID=19, 
		SID=20;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_strExpr = 2, RULE_boolExpr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "strExpr", "boolExpr"
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
			null, "TILDE", "LB", "RB", "LP", "RP", "STROP", "OP", "BOOL", "PRINT", 
			"INPUT", "REV", "LIT", "IF", "THEN", "ELSE", "LOOP", "TBOOL", "TSTR", 
			"BID", "SID"
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
	public static class RegularProgContext extends ProgContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public RegularProgContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterRegularProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitRegularProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitRegularProg(this);
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
	public static class EmptyStmtListContext extends ProgContext {
		public EmptyStmtListContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterEmptyStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitEmptyStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitEmptyStmtList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContextProgContext extends ProgContext {
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
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
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case IF:
			case LOOP:
			case BID:
			case SID:
				_localctx = new RegularProgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				stmt();
				setState(9);
				prog();
				}
				break;
			case LB:
				_localctx = new ContextProgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(LB);
				setState(12);
				prog();
				setState(13);
				match(RB);
				}
				break;
			case EOF:
				_localctx = new EmptyProgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(EOF);
				}
				break;
			case RB:
				_localctx = new EmptyStmtListContext(_localctx);
				enterOuterAlt(_localctx, 4);
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
	public static class BoolAssignStmtContext extends StmtContext {
		public TerminalNode BID() { return getToken(ParseRules.BID, 0); }
		public TerminalNode TILDE() { return getToken(ParseRules.TILDE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolPrintContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(ParseRules.PRINT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolPrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPrintContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(ParseRules.PRINT, 0); }
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public StringPrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStringPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStringPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStringPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStmtContext extends StmtContext {
		public TerminalNode IF() { return getToken(ParseRules.IF, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
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
		public List<TerminalNode> RB() { return getTokens(ParseRules.RB); }
		public TerminalNode RB(int i) {
			return getToken(ParseRules.RB, i);
		}
		public TerminalNode ELSE() { return getToken(ParseRules.ELSE, 0); }
		public IfElseStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StmtContext {
		public TerminalNode LOOP() { return getToken(ParseRules.LOOP, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public TerminalNode THEN() { return getToken(ParseRules.THEN, 0); }
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode RB() { return getToken(ParseRules.RB, 0); }
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAssignStmtContext extends StmtContext {
		public TerminalNode SID() { return getToken(ParseRules.SID, 0); }
		public TerminalNode TILDE() { return getToken(ParseRules.TILDE, 0); }
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public StringAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStringAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStringAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStringAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BoolPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(PRINT);
				setState(20);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new StringPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(PRINT);
				setState(22);
				strExpr(0);
				}
				break;
			case 3:
				_localctx = new BoolAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				match(BID);
				setState(24);
				match(TILDE);
				setState(25);
				boolExpr(0);
				}
				break;
			case 4:
				_localctx = new StringAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(SID);
				setState(27);
				match(TILDE);
				setState(28);
				strExpr(0);
				}
				break;
			case 5:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				match(IF);
				setState(30);
				match(LP);
				setState(31);
				boolExpr(0);
				setState(32);
				match(RP);
				setState(33);
				match(LB);
				setState(34);
				prog();
				setState(35);
				match(RB);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(36);
					match(ELSE);
					setState(37);
					match(LB);
					setState(38);
					prog();
					setState(39);
					match(RB);
					}
				}

				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				match(LOOP);
				setState(44);
				match(LP);
				setState(45);
				boolExpr(0);
				setState(46);
				match(RP);
				setState(47);
				match(THEN);
				setState(48);
				match(LB);
				setState(49);
				prog();
				setState(50);
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
	public static class StrExprContext extends ParserRuleContext {
		public StrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strExpr; }
	 
		public StrExprContext() { }
		public void copyFrom(StrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReorderStrExprContext extends StrExprContext {
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public ReorderStrExprContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterReorderStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitReorderStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitReorderStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputExprContext extends StrExprContext {
		public TerminalNode INPUT() { return getToken(ParseRules.INPUT, 0); }
		public InputExprContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterInputExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitInputExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitInputExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLitExprContext extends StrExprContext {
		public TerminalNode LIT() { return getToken(ParseRules.LIT, 0); }
		public StringLitExprContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStringLitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStringLitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStringLitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RevStrExprContext extends StrExprContext {
		public TerminalNode REV() { return getToken(ParseRules.REV, 0); }
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public RevStrExprContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterRevStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitRevStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitRevStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringBinOpExprContext extends StrExprContext {
		public List<StrExprContext> strExpr() {
			return getRuleContexts(StrExprContext.class);
		}
		public StrExprContext strExpr(int i) {
			return getRuleContext(StrExprContext.class,i);
		}
		public TerminalNode STROP() { return getToken(ParseRules.STROP, 0); }
		public StringBinOpExprContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStringBinOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStringBinOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStringBinOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringVarContext extends StrExprContext {
		public TerminalNode SID() { return getToken(ParseRules.SID, 0); }
		public StringVarContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStringVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStringVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStringVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrExprContext strExpr() throws RecognitionException {
		return strExpr(0);
	}

	private StrExprContext strExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StrExprContext _localctx = new StrExprContext(_ctx, _parentState);
		StrExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_strExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIT:
				{
				_localctx = new StringLitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(55);
				match(LIT);
				}
				break;
			case SID:
				{
				_localctx = new StringVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(SID);
				}
				break;
			case INPUT:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(INPUT);
				}
				break;
			case REV:
				{
				_localctx = new RevStrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(REV);
				setState(59);
				strExpr(2);
				}
				break;
			case LP:
				{
				_localctx = new ReorderStrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(LP);
				setState(61);
				strExpr(0);
				setState(62);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringBinOpExprContext(new StrExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_strExpr);
					setState(66);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(67);
					match(STROP);
					setState(68);
					strExpr(7);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitExprContext extends BoolExprContext {
		public TerminalNode BOOL() { return getToken(ParseRules.BOOL, 0); }
		public BoolLitExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolLitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolLitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolLitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReorderBoolExprContext extends BoolExprContext {
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public ReorderBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterReorderBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitReorderBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitReorderBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolNotExprContext extends BoolExprContext {
		public TerminalNode REV() { return getToken(ParseRules.REV, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolNotExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringCompareExprContext extends BoolExprContext {
		public List<StrExprContext> strExpr() {
			return getRuleContexts(StrExprContext.class);
		}
		public StrExprContext strExpr(int i) {
			return getRuleContext(StrExprContext.class,i);
		}
		public TerminalNode OP() { return getToken(ParseRules.OP, 0); }
		public StringCompareExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStringCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStringCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStringCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolBinOpExprContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode OP() { return getToken(ParseRules.OP, 0); }
		public BoolBinOpExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolBinOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolBinOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolBinOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolVarContext extends BoolExprContext {
		public TerminalNode BID() { return getToken(ParseRules.BID, 0); }
		public BoolVarContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new BoolLitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				match(BOOL);
				}
				break;
			case 2:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(BID);
				}
				break;
			case 3:
				{
				_localctx = new StringCompareExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				strExpr(0);
				setState(78);
				match(OP);
				setState(79);
				strExpr(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(REV);
				setState(82);
				boolExpr(2);
				}
				break;
			case 5:
				{
				_localctx = new ReorderBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(LP);
				setState(84);
				boolExpr(0);
				setState(85);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolBinOpExprContext(new BoolExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(89);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(90);
					match(OP);
					setState(91);
					boolExpr(5);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 2:
			return strExpr_sempred((StrExprContext)_localctx, predIndex);
		case 3:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean strExpr_sempred(StrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001*\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00015\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002F\b\u0002"+
		"\n\u0002\f\u0002I\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003X\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003]\b\u0003\n\u0003\f\u0003`\t\u0003"+
		"\u0001\u0003\u0000\u0002\u0004\u0006\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0000p\u0000\u0011\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000"+
		"\u0004@\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000\b\t\u0003"+
		"\u0002\u0001\u0000\t\n\u0003\u0000\u0000\u0000\n\u0012\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0005\u0002\u0000\u0000\f\r\u0003\u0000\u0000\u0000\r\u000e"+
		"\u0005\u0003\u0000\u0000\u000e\u0012\u0001\u0000\u0000\u0000\u000f\u0012"+
		"\u0005\u0000\u0000\u0001\u0010\u0012\u0001\u0000\u0000\u0000\u0011\b\u0001"+
		"\u0000\u0000\u0000\u0011\u000b\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0001\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0005\t\u0000\u0000\u00145\u0003\u0006"+
		"\u0003\u0000\u0015\u0016\u0005\t\u0000\u0000\u00165\u0003\u0004\u0002"+
		"\u0000\u0017\u0018\u0005\u0013\u0000\u0000\u0018\u0019\u0005\u0001\u0000"+
		"\u0000\u00195\u0003\u0006\u0003\u0000\u001a\u001b\u0005\u0014\u0000\u0000"+
		"\u001b\u001c\u0005\u0001\u0000\u0000\u001c5\u0003\u0004\u0002\u0000\u001d"+
		"\u001e\u0005\r\u0000\u0000\u001e\u001f\u0005\u0004\u0000\u0000\u001f "+
		"\u0003\u0006\u0003\u0000 !\u0005\u0005\u0000\u0000!\"\u0005\u0002\u0000"+
		"\u0000\"#\u0003\u0000\u0000\u0000#)\u0005\u0003\u0000\u0000$%\u0005\u000f"+
		"\u0000\u0000%&\u0005\u0002\u0000\u0000&\'\u0003\u0000\u0000\u0000\'(\u0005"+
		"\u0003\u0000\u0000(*\u0001\u0000\u0000\u0000)$\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*5\u0001\u0000\u0000\u0000+,\u0005\u0010\u0000"+
		"\u0000,-\u0005\u0004\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0005\u0005"+
		"\u0000\u0000/0\u0005\u000e\u0000\u000001\u0005\u0002\u0000\u000012\u0003"+
		"\u0000\u0000\u000023\u0005\u0003\u0000\u000035\u0001\u0000\u0000\u0000"+
		"4\u0013\u0001\u0000\u0000\u00004\u0015\u0001\u0000\u0000\u00004\u0017"+
		"\u0001\u0000\u0000\u00004\u001a\u0001\u0000\u0000\u00004\u001d\u0001\u0000"+
		"\u0000\u00004+\u0001\u0000\u0000\u00005\u0003\u0001\u0000\u0000\u0000"+
		"67\u0006\u0002\uffff\uffff\u00007A\u0005\f\u0000\u00008A\u0005\u0014\u0000"+
		"\u00009A\u0005\n\u0000\u0000:;\u0005\u000b\u0000\u0000;A\u0003\u0004\u0002"+
		"\u0002<=\u0005\u0004\u0000\u0000=>\u0003\u0004\u0002\u0000>?\u0005\u0005"+
		"\u0000\u0000?A\u0001\u0000\u0000\u0000@6\u0001\u0000\u0000\u0000@8\u0001"+
		"\u0000\u0000\u0000@9\u0001\u0000\u0000\u0000@:\u0001\u0000\u0000\u0000"+
		"@<\u0001\u0000\u0000\u0000AG\u0001\u0000\u0000\u0000BC\n\u0006\u0000\u0000"+
		"CD\u0005\u0006\u0000\u0000DF\u0003\u0004\u0002\u0007EB\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JK\u0006\u0003\uffff\uffff\u0000KX\u0005\b\u0000\u0000LX\u0005\u0013\u0000"+
		"\u0000MN\u0003\u0004\u0002\u0000NO\u0005\u0007\u0000\u0000OP\u0003\u0004"+
		"\u0002\u0000PX\u0001\u0000\u0000\u0000QR\u0005\u000b\u0000\u0000RX\u0003"+
		"\u0006\u0003\u0002ST\u0005\u0004\u0000\u0000TU\u0003\u0006\u0003\u0000"+
		"UV\u0005\u0005\u0000\u0000VX\u0001\u0000\u0000\u0000WJ\u0001\u0000\u0000"+
		"\u0000WL\u0001\u0000\u0000\u0000WM\u0001\u0000\u0000\u0000WQ\u0001\u0000"+
		"\u0000\u0000WS\u0001\u0000\u0000\u0000X^\u0001\u0000\u0000\u0000YZ\n\u0004"+
		"\u0000\u0000Z[\u0005\u0007\u0000\u0000[]\u0003\u0006\u0003\u0005\\Y\u0001"+
		"\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_\u0007\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000\u0007\u0011)4@GW^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}