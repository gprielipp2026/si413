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
		BOOLOP=11, STRCMP=12, NOT=13, STROP=14, INPUT=15, IF=16, ELSE=17, WHILE=18, 
		FUNCTION=19, BOOLLIT=20, STRLIT=21, BOOLT=22, STRT=23, VOID=24, ID=25;
	public static final int
		RULE_prog = 0, RULE_stmtList = 1, RULE_stmt = 2, RULE_paramlist = 3, RULE_arglist = 4, 
		RULE_arg = 5, RULE_exprlist = 6, RULE_exprliststuff = 7, RULE_funcexpr = 8, 
		RULE_boolexpr = 9, RULE_strexpr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmtList", "stmt", "paramlist", "arglist", "arg", "exprlist", 
			"exprliststuff", "funcexpr", "boolexpr", "strexpr"
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
			"BOOLOP", "STRCMP", "NOT", "STROP", "INPUT", "IF", "ELSE", "WHILE", "FUNCTION", 
			"BOOLLIT", "STRLIT", "BOOLT", "STRT", "VOID", "ID"
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
	public static class FullProgContext extends ProgContext {
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParseRules.EOF, 0); }
		public FullProgContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFullProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFullProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFullProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			_localctx = new FullProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			stmtList();
			setState(23);
			match(EOF);
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
	public static class StmtListContext extends ParserRuleContext {
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
	 
		public StmtListContext() { }
		public void copyFrom(StmtListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalProgContext extends StmtListContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public NormalProgContext(StmtListContext ctx) { copyFrom(ctx); }
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
	public static class EmptyProgContext extends StmtListContext {
		public EmptyProgContext(StmtListContext ctx) { copyFrom(ctx); }
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

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmtList);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new NormalProgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				stmt();
				setState(26);
				match(END);
				setState(27);
				stmtList();
				}
				break;
			case 2:
				_localctx = new EmptyProgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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
	public static class FunctionCallStmtContext extends StmtContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public FunctionCallStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStrContext extends StmtContext {
		public TerminalNode LSB() { return getToken(ParseRules.LSB, 0); }
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(ParseRules.RSB, 0); }
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
	public static class IfElseContext extends StmtContext {
		public TerminalNode IF() { return getToken(ParseRules.IF, 0); }
		public TerminalNode LP() { return getToken(ParseRules.LP, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
		public List<TerminalNode> LB() { return getTokens(ParseRules.LB); }
		public TerminalNode LB(int i) {
			return getToken(ParseRules.LB, i);
		}
		public List<StmtListContext> stmtList() {
			return getRuleContexts(StmtListContext.class);
		}
		public StmtListContext stmtList(int i) {
			return getRuleContext(StmtListContext.class,i);
		}
		public List<TerminalNode> RB() { return getTokens(ParseRules.RB); }
		public TerminalNode RB(int i) {
			return getToken(ParseRules.RB, i);
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
	public static class FuncVarAssignContext extends StmtContext {
		public TerminalNode FUNCTION() { return getToken(ParseRules.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public FuncexprContext funcexpr() {
			return getRuleContext(FuncexprContext.class,0);
		}
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
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
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
		enterRule(_localctx, 4, RULE_stmt);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BoolVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(BOOLT);
				setState(33);
				match(ID);
				setState(34);
				match(ASSIGN);
				setState(35);
				boolexpr(0);
				}
				break;
			case 2:
				_localctx = new StrVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(STRT);
				setState(37);
				match(ID);
				setState(38);
				match(ASSIGN);
				setState(39);
				strexpr(0);
				}
				break;
			case 3:
				_localctx = new FuncVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(FUNCTION);
				setState(41);
				match(ID);
				setState(42);
				match(ASSIGN);
				setState(43);
				funcexpr();
				}
				break;
			case 4:
				_localctx = new BoolReassignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(ID);
				setState(45);
				match(ASSIGN);
				setState(46);
				boolexpr(0);
				}
				break;
			case 5:
				_localctx = new StrReassignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(ID);
				setState(48);
				match(ASSIGN);
				setState(49);
				strexpr(0);
				}
				break;
			case 6:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(LSB);
				setState(51);
				strexpr(0);
				setState(52);
				match(RSB);
				}
				break;
			case 7:
				_localctx = new PrintBoolContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(LSB);
				setState(55);
				boolexpr(0);
				setState(56);
				match(RSB);
				}
				break;
			case 8:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				match(WHILE);
				setState(59);
				match(LP);
				setState(60);
				boolexpr(0);
				setState(61);
				match(RP);
				setState(62);
				match(LB);
				setState(63);
				stmtList();
				setState(64);
				match(RB);
				}
				break;
			case 9:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				match(IF);
				setState(67);
				match(LP);
				setState(68);
				boolexpr(0);
				setState(69);
				match(RP);
				setState(70);
				match(LB);
				setState(71);
				stmtList();
				setState(72);
				match(RB);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(73);
					match(ELSE);
					setState(74);
					match(LB);
					setState(75);
					stmtList();
					setState(76);
					match(RB);
					}
				}

				}
				break;
			case 10:
				_localctx = new FunctionCallStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(80);
				match(ID);
				setState(81);
				match(LP);
				setState(82);
				exprlist();
				setState(83);
				match(RP);
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
		enterRule(_localctx, 6, RULE_paramlist);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLT:
			case STRT:
				_localctx = new FuncParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
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
		enterRule(_localctx, 8, RULE_arglist);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ArgListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				arg();
				setState(92);
				match(SEP);
				setState(93);
				arglist();
				}
				break;
			case 2:
				_localctx = new LastArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
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
		enterRule(_localctx, 10, RULE_arg);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLT:
				_localctx = new BoolParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(BOOLT);
				setState(99);
				match(ID);
				}
				break;
			case STRT:
				_localctx = new StrParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(STRT);
				setState(101);
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
		enterRule(_localctx, 12, RULE_exprlist);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case NOT:
			case INPUT:
			case BOOLLIT:
			case STRLIT:
			case ID:
				_localctx = new ExprListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				exprliststuff();
				}
				break;
			case RP:
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
		enterRule(_localctx, 14, RULE_exprliststuff);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BoolArgMoreListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				boolexpr(0);
				setState(109);
				match(SEP);
				setState(110);
				exprliststuff();
				}
				break;
			case 2:
				_localctx = new StrArgMoreListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				strexpr(0);
				setState(113);
				match(SEP);
				setState(114);
				exprliststuff();
				}
				break;
			case 3:
				_localctx = new LastBoolArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				boolexpr(0);
				}
				break;
			case 4:
				_localctx = new LastStrArgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
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
		public List<TerminalNode> RETURN() { return getTokens(ParseRules.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(ParseRules.RETURN, i);
		}
		public List<TerminalNode> FUNCTION() { return getTokens(ParseRules.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(ParseRules.FUNCTION, i);
		}
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public FuncexprContext funcexpr() {
			return getRuleContext(FuncexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
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
		public List<TerminalNode> RETURN() { return getTokens(ParseRules.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(ParseRules.RETURN, i);
		}
		public List<TerminalNode> BOOLT() { return getTokens(ParseRules.BOOLT); }
		public TerminalNode BOOLT(int i) {
			return getToken(ParseRules.BOOLT, i);
		}
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
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
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
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
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
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
	public static class FunctionVarNameContext extends FuncexprContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public FunctionVarNameContext(FuncexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFunctionVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFunctionVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFunctionVarName(this);
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
		public List<TerminalNode> RETURN() { return getTokens(ParseRules.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(ParseRules.RETURN, i);
		}
		public List<TerminalNode> STRT() { return getTokens(ParseRules.STRT); }
		public TerminalNode STRT(int i) {
			return getToken(ParseRules.STRT, i);
		}
		public TerminalNode LB() { return getToken(ParseRules.LB, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public StrexprContext strexpr() {
			return getRuleContext(StrexprContext.class,0);
		}
		public TerminalNode END() { return getToken(ParseRules.END, 0); }
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
		enterRule(_localctx, 16, RULE_funcexpr);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FirstOrderCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ID);
				setState(121);
				match(LP);
				setState(122);
				exprlist();
				setState(123);
				match(RP);
				}
				break;
			case 2:
				_localctx = new BoolFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(LP);
				setState(126);
				paramlist();
				setState(127);
				match(RP);
				setState(128);
				match(RETURN);
				setState(129);
				match(BOOLT);
				setState(130);
				match(LB);
				setState(131);
				stmtList();
				setState(132);
				match(BOOLT);
				setState(133);
				match(RETURN);
				setState(134);
				boolexpr(0);
				setState(135);
				match(END);
				setState(136);
				match(RB);
				}
				break;
			case 3:
				_localctx = new StrFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(LP);
				setState(139);
				paramlist();
				setState(140);
				match(RP);
				setState(141);
				match(RETURN);
				setState(142);
				match(STRT);
				setState(143);
				match(LB);
				setState(144);
				stmtList();
				setState(145);
				match(STRT);
				setState(146);
				match(RETURN);
				setState(147);
				strexpr(0);
				setState(148);
				match(END);
				setState(149);
				match(RB);
				}
				break;
			case 4:
				_localctx = new VoidFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(LP);
				setState(152);
				paramlist();
				setState(153);
				match(RP);
				setState(154);
				match(RETURN);
				setState(155);
				match(VOID);
				setState(156);
				match(LB);
				setState(157);
				stmtList();
				setState(158);
				match(RB);
				}
				break;
			case 5:
				_localctx = new FirstOrderFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(LP);
				setState(161);
				paramlist();
				setState(162);
				match(RP);
				setState(163);
				match(RETURN);
				setState(164);
				match(FUNCTION);
				setState(165);
				match(LB);
				setState(166);
				stmtList();
				setState(167);
				match(FUNCTION);
				setState(168);
				match(RETURN);
				setState(169);
				funcexpr();
				setState(170);
				match(END);
				setState(171);
				match(RB);
				}
				break;
			case 6:
				_localctx = new FunctionVarNameContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(ID);
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
		public TerminalNode RP() { return getToken(ParseRules.RP, 0); }
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
	public static class NotBoolExprContext extends BoolexprContext {
		public TerminalNode NOT() { return getToken(ParseRules.NOT, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public NotBoolExprContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNotBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNotBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNotBoolExpr(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new StrCmpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				strexpr(0);
				setState(178);
				match(STRCMP);
				setState(179);
				strexpr(0);
				}
				break;
			case 2:
				{
				_localctx = new BoolReorderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(LP);
				setState(182);
				boolexpr(0);
				setState(183);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new BoolFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(ID);
				setState(186);
				match(LP);
				setState(187);
				exprlist();
				setState(188);
				match(RP);
				}
				break;
			case 4:
				{
				_localctx = new NotBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(NOT);
				setState(191);
				boolexpr(3);
				}
				break;
			case 5:
				{
				_localctx = new BoolLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(BOOLLIT);
				}
				break;
			case 6:
				{
				_localctx = new GetBoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
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
					setState(196);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(197);
					match(BOOLOP);
					setState(198);
					boolexpr(8);
					}
					} 
				}
				setState(203);
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
		public TerminalNode NOT() { return getToken(ParseRules.NOT, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_strexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new RevStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(205);
				match(NOT);
				setState(206);
				strexpr(6);
				}
				break;
			case 2:
				{
				_localctx = new StrReorderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(LP);
				setState(208);
				strexpr(0);
				setState(209);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(INPUT);
				}
				break;
			case 4:
				{
				_localctx = new StrFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(ID);
				setState(213);
				match(LP);
				setState(214);
				exprlist();
				setState(215);
				match(RP);
				}
				break;
			case 5:
				{
				_localctx = new StrLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(STRLIT);
				}
				break;
			case 6:
				{
				_localctx = new GetStrVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
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
					setState(221);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(222);
					match(STROP);
					setState(223);
					strexpr(8);
					}
					} 
				}
				setState(228);
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
		case 9:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		case 10:
			return strexpr_sempred((StrexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
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
		"\u0004\u0001\u0019\u00e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002O\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002V\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Z\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004a\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005g\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006k\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007w\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00af\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00c3\b\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c8\b\t"+
		"\n\t\f\t\u00cb\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00dc\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e1\b\n\n\n\f\n\u00e4\t"+
		"\n\u0001\n\u0000\u0002\u0012\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0000\u0000\u00fd\u0000\u0016\u0001\u0000\u0000"+
		"\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000"+
		"\u0006Y\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000\u0000\nf\u0001\u0000"+
		"\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000"+
		"\u0010\u00ae\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000\u0000\u0000"+
		"\u0014\u00db\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000"+
		"\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001b\u0005\u0007\u0000\u0000"+
		"\u001b\u001c\u0003\u0002\u0001\u0000\u001c\u001f\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000"+
		"\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0003\u0001\u0000\u0000\u0000"+
		" !\u0005\u0016\u0000\u0000!\"\u0005\u0019\u0000\u0000\"#\u0005\n\u0000"+
		"\u0000#V\u0003\u0012\t\u0000$%\u0005\u0017\u0000\u0000%&\u0005\u0019\u0000"+
		"\u0000&\'\u0005\n\u0000\u0000\'V\u0003\u0014\n\u0000()\u0005\u0013\u0000"+
		"\u0000)*\u0005\u0019\u0000\u0000*+\u0005\n\u0000\u0000+V\u0003\u0010\b"+
		"\u0000,-\u0005\u0019\u0000\u0000-.\u0005\n\u0000\u0000.V\u0003\u0012\t"+
		"\u0000/0\u0005\u0019\u0000\u000001\u0005\n\u0000\u00001V\u0003\u0014\n"+
		"\u000023\u0005\u0005\u0000\u000034\u0003\u0014\n\u000045\u0005\u0006\u0000"+
		"\u00005V\u0001\u0000\u0000\u000067\u0005\u0005\u0000\u000078\u0003\u0012"+
		"\t\u000089\u0005\u0006\u0000\u00009V\u0001\u0000\u0000\u0000:;\u0005\u0012"+
		"\u0000\u0000;<\u0005\u0001\u0000\u0000<=\u0003\u0012\t\u0000=>\u0005\u0002"+
		"\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0003\u0002\u0001\u0000@A\u0005"+
		"\u0004\u0000\u0000AV\u0001\u0000\u0000\u0000BC\u0005\u0010\u0000\u0000"+
		"CD\u0005\u0001\u0000\u0000DE\u0003\u0012\t\u0000EF\u0005\u0002\u0000\u0000"+
		"FG\u0005\u0003\u0000\u0000GH\u0003\u0002\u0001\u0000HN\u0005\u0004\u0000"+
		"\u0000IJ\u0005\u0011\u0000\u0000JK\u0005\u0003\u0000\u0000KL\u0003\u0002"+
		"\u0001\u0000LM\u0005\u0004\u0000\u0000MO\u0001\u0000\u0000\u0000NI\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OV\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u0019\u0000\u0000QR\u0005\u0001\u0000\u0000RS\u0003\f\u0006\u0000"+
		"ST\u0005\u0002\u0000\u0000TV\u0001\u0000\u0000\u0000U \u0001\u0000\u0000"+
		"\u0000U$\u0001\u0000\u0000\u0000U(\u0001\u0000\u0000\u0000U,\u0001\u0000"+
		"\u0000\u0000U/\u0001\u0000\u0000\u0000U2\u0001\u0000\u0000\u0000U6\u0001"+
		"\u0000\u0000\u0000U:\u0001\u0000\u0000\u0000UB\u0001\u0000\u0000\u0000"+
		"UP\u0001\u0000\u0000\u0000V\u0005\u0001\u0000\u0000\u0000WZ\u0003\b\u0004"+
		"\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z\u0007\u0001\u0000\u0000\u0000[\\\u0003\n\u0005\u0000\\]"+
		"\u0005\b\u0000\u0000]^\u0003\b\u0004\u0000^a\u0001\u0000\u0000\u0000_"+
		"a\u0003\n\u0005\u0000`[\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"a\t\u0001\u0000\u0000\u0000bc\u0005\u0016\u0000\u0000cg\u0005\u0019\u0000"+
		"\u0000de\u0005\u0017\u0000\u0000eg\u0005\u0019\u0000\u0000fb\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000"+
		"hk\u0003\u000e\u0007\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\r\u0001\u0000\u0000\u0000lm\u0003\u0012"+
		"\t\u0000mn\u0005\b\u0000\u0000no\u0003\u000e\u0007\u0000ow\u0001\u0000"+
		"\u0000\u0000pq\u0003\u0014\n\u0000qr\u0005\b\u0000\u0000rs\u0003\u000e"+
		"\u0007\u0000sw\u0001\u0000\u0000\u0000tw\u0003\u0012\t\u0000uw\u0003\u0014"+
		"\n\u0000vl\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vu\u0001\u0000\u0000\u0000w\u000f\u0001\u0000\u0000\u0000"+
		"xy\u0005\u0019\u0000\u0000yz\u0005\u0001\u0000\u0000z{\u0003\f\u0006\u0000"+
		"{|\u0005\u0002\u0000\u0000|\u00af\u0001\u0000\u0000\u0000}~\u0005\u0001"+
		"\u0000\u0000~\u007f\u0003\u0006\u0003\u0000\u007f\u0080\u0005\u0002\u0000"+
		"\u0000\u0080\u0081\u0005\t\u0000\u0000\u0081\u0082\u0005\u0016\u0000\u0000"+
		"\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0084\u0003\u0002\u0001\u0000"+
		"\u0084\u0085\u0005\u0016\u0000\u0000\u0085\u0086\u0005\t\u0000\u0000\u0086"+
		"\u0087\u0003\u0012\t\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0089"+
		"\u0005\u0004\u0000\u0000\u0089\u00af\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u0001\u0000\u0000\u008b\u008c\u0003\u0006\u0003\u0000\u008c\u008d"+
		"\u0005\u0002\u0000\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u008f\u0005"+
		"\u0017\u0000\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0091\u0003"+
		"\u0002\u0001\u0000\u0091\u0092\u0005\u0017\u0000\u0000\u0092\u0093\u0005"+
		"\t\u0000\u0000\u0093\u0094\u0003\u0014\n\u0000\u0094\u0095\u0005\u0007"+
		"\u0000\u0000\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u00af\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0001\u0000\u0000\u0098\u0099\u0003\u0006"+
		"\u0003\u0000\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u009b\u0005\t\u0000"+
		"\u0000\u009b\u009c\u0005\u0018\u0000\u0000\u009c\u009d\u0005\u0003\u0000"+
		"\u0000\u009d\u009e\u0003\u0002\u0001\u0000\u009e\u009f\u0005\u0004\u0000"+
		"\u0000\u009f\u00af\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0001\u0000"+
		"\u0000\u00a1\u00a2\u0003\u0006\u0003\u0000\u00a2\u00a3\u0005\u0002\u0000"+
		"\u0000\u00a3\u00a4\u0005\t\u0000\u0000\u00a4\u00a5\u0005\u0013\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0003\u0000\u0000\u00a6\u00a7\u0003\u0002\u0001\u0000"+
		"\u00a7\u00a8\u0005\u0013\u0000\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9"+
		"\u00aa\u0003\u0010\b\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0004\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0005\u0019\u0000\u0000\u00aex\u0001\u0000\u0000\u0000\u00ae}\u0001\u0000"+
		"\u0000\u0000\u00ae\u008a\u0001\u0000\u0000\u0000\u00ae\u0097\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a0\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u0011\u0001\u0000\u0000\u0000\u00b0\u00b1\u0006\t\uffff"+
		"\uffff\u0000\u00b1\u00b2\u0003\u0014\n\u0000\u00b2\u00b3\u0005\f\u0000"+
		"\u0000\u00b3\u00b4\u0003\u0014\n\u0000\u00b4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0001\u0000\u0000\u00b6\u00b7\u0003\u0012\t\u0000\u00b7"+
		"\u00b8\u0005\u0002\u0000\u0000\u00b8\u00c3\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\u0019\u0000\u0000\u00ba\u00bb\u0005\u0001\u0000\u0000\u00bb"+
		"\u00bc\u0003\f\u0006\u0000\u00bc\u00bd\u0005\u0002\u0000\u0000\u00bd\u00c3"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\r\u0000\u0000\u00bf\u00c3\u0003"+
		"\u0012\t\u0003\u00c0\u00c3\u0005\u0014\u0000\u0000\u00c1\u00c3\u0005\u0019"+
		"\u0000\u0000\u00c2\u00b0\u0001\u0000\u0000\u0000\u00c2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00c2\u00b9\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c9\u0001\u0000\u0000\u0000\u00c4\u00c5\n\u0007\u0000"+
		"\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000\u00c6\u00c8\u0003\u0012\t\b"+
		"\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0006\n\uffff\uffff\u0000\u00cd\u00ce\u0005\r\u0000\u0000"+
		"\u00ce\u00dc\u0003\u0014\n\u0006\u00cf\u00d0\u0005\u0001\u0000\u0000\u00d0"+
		"\u00d1\u0003\u0014\n\u0000\u00d1\u00d2\u0005\u0002\u0000\u0000\u00d2\u00dc"+
		"\u0001\u0000\u0000\u0000\u00d3\u00dc\u0005\u000f\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0019\u0000\u0000\u00d5\u00d6\u0005\u0001\u0000\u0000\u00d6\u00d7"+
		"\u0003\f\u0006\u0000\u00d7\u00d8\u0005\u0002\u0000\u0000\u00d8\u00dc\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0005\u0015\u0000\u0000\u00da\u00dc\u0005"+
		"\u0019\u0000\u0000\u00db\u00cc\u0001\u0000\u0000\u0000\u00db\u00cf\u0001"+
		"\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00d4\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e2\u0001\u0000\u0000\u0000\u00dd\u00de\n\u0007"+
		"\u0000\u0000\u00de\u00df\u0005\u000e\u0000\u0000\u00df\u00e1\u0003\u0014"+
		"\n\b\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u0015\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\r\u001eNUY`fjv\u00ae\u00c2\u00c9\u00db\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}