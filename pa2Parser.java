// Generated from pa2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pa2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DIGIT=2, SELECT=3, PROJECT=4, RENAME=5, PLUS=6, MINUS=7, PRODUCT=8, 
		EQUAL=9, LARROW=10, COMMA=11, SEMICOLON=12, DOUBLEAND=13, DOUBLEOR=14, 
		OPEN=15, CLOSE=16, WRITE=17, EXIT=18, SHOW=19, CREATE=20, TABLE=21, PRIMARY=22, 
		FOREIGN=23, KEY=24, UPDATE=25, SET=26, WHERE=27, INTEGER=28, VARCHAR=29, 
		RELATION=30, INSERT=31, INTO=32, DELETE=33, VALUES=34, FROM=35, LPAR=36, 
		RPAR=37, OPERATION=38, LITERAL=39, IDENTIFIER=40, TYPE=41, OPERAND=42, 
		UPDATEFRAG=43;
	public static final int
		RULE_typedAttributeList = 0, RULE_integer = 1, RULE_attributeList = 2, 
		RULE_openCMD = 3, RULE_closeCMD = 4, RULE_showCMD = 5, RULE_writeCMD = 6, 
		RULE_deleteCMD = 7, RULE_exitCMD = 8, RULE_condition = 9, RULE_conjunction = 10, 
		RULE_comparison = 11, RULE_selection = 12, RULE_projection = 13, RULE_atomicExpr = 14, 
		RULE_renaming = 15, RULE_union = 16, RULE_difference = 17, RULE_product = 18, 
		RULE_expr = 19, RULE_insertCMD = 20, RULE_query = 21, RULE_createCMD = 22, 
		RULE_updateCMD = 23, RULE_command = 24, RULE_program = 25;
	public static final String[] ruleNames = {
		"typedAttributeList", "integer", "attributeList", "openCMD", "closeCMD", 
		"showCMD", "writeCMD", "deleteCMD", "exitCMD", "condition", "conjunction", 
		"comparison", "selection", "projection", "atomicExpr", "renaming", "union", 
		"difference", "product", "expr", "insertCMD", "query", "createCMD", "updateCMD", 
		"command", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'+'", "'-'", "'*'", "'='", "'<-'", 
		"','", "';'", "'&&'", "'||'", "'OPEN'", "'CLOSE'", "'WRITE'", "'EXIT'", 
		"'SHOW'", "'CREATE'", "'TABLE'", "'PRIMARY'", "'FOREIGN'", "'KEY'", "'UPDATE'", 
		"'SET'", "'WHERE'", "'INTEGER'", "'VARCHAR'", "'RELATION'", "'INSERT'", 
		"'INTO'", "'DELETE'", "'VALUES'", "'FROM'", "'('", "')'", null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "DIGIT", "SELECT", "PROJECT", "RENAME", "PLUS", "MINUS", "PRODUCT", 
		"EQUAL", "LARROW", "COMMA", "SEMICOLON", "DOUBLEAND", "DOUBLEOR", "OPEN", 
		"CLOSE", "WRITE", "EXIT", "SHOW", "CREATE", "TABLE", "PRIMARY", "FOREIGN", 
		"KEY", "UPDATE", "SET", "WHERE", "INTEGER", "VARCHAR", "RELATION", "INSERT", 
		"INTO", "DELETE", "VALUES", "FROM", "LPAR", "RPAR", "OPERATION", "LITERAL", 
		"IDENTIFIER", "TYPE", "OPERAND", "UPDATEFRAG"
	};
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
	public String getGrammarFileName() { return "pa2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pa2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypedAttributeListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(pa2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pa2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(pa2Parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(pa2Parser.TYPE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pa2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pa2Parser.COMMA, i);
		}
		public TypedAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterTypedAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitTypedAttributeList(this);
		}
	}

	public final TypedAttributeListContext typedAttributeList() throws RecognitionException {
		TypedAttributeListContext _localctx = new TypedAttributeListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_typedAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(IDENTIFIER);
			setState(53);
			match(TYPE);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(54);
				match(COMMA);
				setState(55);
				match(IDENTIFIER);
				setState(56);
				match(TYPE);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(pa2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(pa2Parser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DIGIT);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(63);
				match(DIGIT);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AttributeListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(pa2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pa2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pa2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pa2Parser.COMMA, i);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitAttributeList(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDENTIFIER);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(70);
				match(COMMA);
				setState(71);
				match(IDENTIFIER);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class OpenCMDContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(pa2Parser.OPEN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public OpenCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterOpenCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitOpenCMD(this);
		}
	}

	public final OpenCMDContext openCMD() throws RecognitionException {
		OpenCMDContext _localctx = new OpenCMDContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_openCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(OPEN);
			setState(78);
			match(IDENTIFIER);
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

	public static class CloseCMDContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(pa2Parser.CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public CloseCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterCloseCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitCloseCMD(this);
		}
	}

	public final CloseCMDContext closeCMD() throws RecognitionException {
		CloseCMDContext _localctx = new CloseCMDContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_closeCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(CLOSE);
			setState(81);
			match(IDENTIFIER);
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

	public static class ShowCMDContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(pa2Parser.SHOW, 0); }
		public AtomicExprContext atomicExpr() {
			return getRuleContext(AtomicExprContext.class,0);
		}
		public ShowCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterShowCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitShowCMD(this);
		}
	}

	public final ShowCMDContext showCMD() throws RecognitionException {
		ShowCMDContext _localctx = new ShowCMDContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(SHOW);
			setState(84);
			atomicExpr();
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

	public static class WriteCMDContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(pa2Parser.WRITE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public WriteCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterWriteCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitWriteCMD(this);
		}
	}

	public final WriteCMDContext writeCMD() throws RecognitionException {
		WriteCMDContext _localctx = new WriteCMDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_writeCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(WRITE);
			setState(87);
			match(IDENTIFIER);
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

	public static class DeleteCMDContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(pa2Parser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(pa2Parser.FROM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public TerminalNode WHERE() { return getToken(pa2Parser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DeleteCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterDeleteCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitDeleteCMD(this);
		}
	}

	public final DeleteCMDContext deleteCMD() throws RecognitionException {
		DeleteCMDContext _localctx = new DeleteCMDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deleteCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(DELETE);
			setState(90);
			match(FROM);
			setState(91);
			match(IDENTIFIER);
			setState(92);
			match(WHERE);
			setState(93);
			condition();
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

	public static class ExitCMDContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(pa2Parser.EXIT, 0); }
		public ExitCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterExitCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitExitCMD(this);
		}
	}

	public final ExitCMDContext exitCMD() throws RecognitionException {
		ExitCMDContext _localctx = new ExitCMDContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exitCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(EXIT);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> DOUBLEOR() { return getTokens(pa2Parser.DOUBLEOR); }
		public TerminalNode DOUBLEOR(int i) {
			return getToken(pa2Parser.DOUBLEOR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			conjunction();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLEOR) {
				{
				{
				setState(98);
				match(DOUBLEOR);
				setState(99);
				conjunction();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> DOUBLEAND() { return getTokens(pa2Parser.DOUBLEAND); }
		public TerminalNode DOUBLEAND(int i) {
			return getToken(pa2Parser.DOUBLEAND, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			comparison();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLEAND) {
				{
				{
				setState(106);
				match(DOUBLEAND);
				setState(107);
				comparison();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<TerminalNode> OPERAND() { return getTokens(pa2Parser.OPERAND); }
		public TerminalNode OPERAND(int i) {
			return getToken(pa2Parser.OPERAND, i);
		}
		public TerminalNode OPERATION() { return getToken(pa2Parser.OPERATION, 0); }
		public TerminalNode LPAR() { return getToken(pa2Parser.LPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pa2Parser.RPAR, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(OPERAND);
				setState(114);
				match(OPERATION);
				setState(115);
				match(OPERAND);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(116);
				match(LPAR);
				setState(117);
				condition();
				setState(118);
				match(RPAR);
				}
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

	public static class SelectionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(pa2Parser.SELECT, 0); }
		public TerminalNode LPAR() { return getToken(pa2Parser.LPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pa2Parser.RPAR, 0); }
		public AtomicExprContext atomicExpr() {
			return getRuleContext(AtomicExprContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(SELECT);
			setState(123);
			match(LPAR);
			setState(124);
			condition();
			setState(125);
			match(RPAR);
			setState(126);
			atomicExpr();
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

	public static class ProjectionContext extends ParserRuleContext {
		public TerminalNode PROJECT() { return getToken(pa2Parser.PROJECT, 0); }
		public TerminalNode LPAR() { return getToken(pa2Parser.LPAR, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pa2Parser.RPAR, 0); }
		public AtomicExprContext atomicExpr() {
			return getRuleContext(AtomicExprContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitProjection(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_projection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(PROJECT);
			setState(129);
			match(LPAR);
			setState(130);
			attributeList();
			setState(131);
			match(RPAR);
			setState(132);
			atomicExpr();
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

	public static class AtomicExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(pa2Parser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pa2Parser.RPAR, 0); }
		public AtomicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterAtomicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitAtomicExpr(this);
		}
	}

	public final AtomicExprContext atomicExpr() throws RecognitionException {
		AtomicExprContext _localctx = new AtomicExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomicExpr);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(IDENTIFIER);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(135);
				match(LPAR);
				setState(136);
				expr();
				setState(137);
				match(RPAR);
				}
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

	public static class RenamingContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(pa2Parser.RENAME, 0); }
		public TerminalNode LPAR() { return getToken(pa2Parser.LPAR, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pa2Parser.RPAR, 0); }
		public AtomicExprContext atomicExpr() {
			return getRuleContext(AtomicExprContext.class,0);
		}
		public RenamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterRenaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitRenaming(this);
		}
	}

	public final RenamingContext renaming() throws RecognitionException {
		RenamingContext _localctx = new RenamingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(RENAME);
			setState(142);
			match(LPAR);
			setState(143);
			attributeList();
			setState(144);
			match(RPAR);
			setState(145);
			atomicExpr();
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

	public static class UnionContext extends ParserRuleContext {
		public List<AtomicExprContext> atomicExpr() {
			return getRuleContexts(AtomicExprContext.class);
		}
		public AtomicExprContext atomicExpr(int i) {
			return getRuleContext(AtomicExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(pa2Parser.PLUS, 0); }
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitUnion(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			atomicExpr();
			setState(148);
			match(PLUS);
			setState(149);
			atomicExpr();
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

	public static class DifferenceContext extends ParserRuleContext {
		public List<AtomicExprContext> atomicExpr() {
			return getRuleContexts(AtomicExprContext.class);
		}
		public AtomicExprContext atomicExpr(int i) {
			return getRuleContext(AtomicExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(pa2Parser.MINUS, 0); }
		public DifferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitDifference(this);
		}
	}

	public final DifferenceContext difference() throws RecognitionException {
		DifferenceContext _localctx = new DifferenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_difference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			atomicExpr();
			setState(152);
			match(MINUS);
			setState(153);
			atomicExpr();
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

	public static class ProductContext extends ParserRuleContext {
		public List<AtomicExprContext> atomicExpr() {
			return getRuleContexts(AtomicExprContext.class);
		}
		public AtomicExprContext atomicExpr(int i) {
			return getRuleContext(AtomicExprContext.class,i);
		}
		public TerminalNode PRODUCT() { return getToken(pa2Parser.PRODUCT, 0); }
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			atomicExpr();
			setState(156);
			match(PRODUCT);
			setState(157);
			atomicExpr();
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

	public static class ExprContext extends ParserRuleContext {
		public AtomicExprContext atomicExpr() {
			return getRuleContext(AtomicExprContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public RenamingContext renaming() {
			return getRuleContext(RenamingContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public DifferenceContext difference() {
			return getRuleContext(DifferenceContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				atomicExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				selection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				projection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				renaming();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				union();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				difference();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				product();
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

	public static class InsertCMDContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(pa2Parser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(pa2Parser.INTO, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(pa2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pa2Parser.IDENTIFIER, i);
		}
		public TerminalNode VALUES() { return getToken(pa2Parser.VALUES, 0); }
		public TerminalNode FROM() { return getToken(pa2Parser.FROM, 0); }
		public TerminalNode LPAR() { return getToken(pa2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(pa2Parser.RPAR, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(pa2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pa2Parser.COMMA, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(pa2Parser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(pa2Parser.LITERAL, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(pa2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(pa2Parser.DIGIT, i);
		}
		public TerminalNode RELATION() { return getToken(pa2Parser.RELATION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InsertCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterInsertCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitInsertCMD(this);
		}
	}

	public final InsertCMDContext insertCMD() throws RecognitionException {
		InsertCMDContext _localctx = new InsertCMDContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_insertCMD);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(168);
				match(INSERT);
				setState(169);
				match(INTO);
				setState(170);
				match(IDENTIFIER);
				setState(171);
				match(VALUES);
				setState(172);
				match(FROM);
				setState(173);
				match(LPAR);
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(174);
					integer();
					}
					break;
				case LITERAL:
					{
					{
					setState(175);
					match(LITERAL);
					setState(176);
					match(IDENTIFIER);
					setState(177);
					match(LITERAL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					match(COMMA);
					setState(189);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DIGIT:
						{
						setState(182); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(181);
							match(DIGIT);
							}
							}
							setState(184); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==DIGIT );
						}
						break;
					case LITERAL:
						{
						{
						setState(186);
						match(LITERAL);
						setState(187);
						match(IDENTIFIER);
						setState(188);
						match(LITERAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(197);
				match(INSERT);
				setState(198);
				match(INTO);
				setState(199);
				match(IDENTIFIER);
				setState(200);
				match(VALUES);
				setState(201);
				match(FROM);
				setState(202);
				match(RELATION);
				setState(203);
				expr();
				}
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public TerminalNode LARROW() { return getToken(pa2Parser.LARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(pa2Parser.SEMICOLON, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IDENTIFIER);
			setState(207);
			match(LARROW);
			setState(208);
			expr();
			setState(209);
			match(SEMICOLON);
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

	public static class CreateCMDContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(pa2Parser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(pa2Parser.TABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public List<TerminalNode> LPAR() { return getTokens(pa2Parser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(pa2Parser.LPAR, i);
		}
		public TypedAttributeListContext typedAttributeList() {
			return getRuleContext(TypedAttributeListContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(pa2Parser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(pa2Parser.RPAR, i);
		}
		public TerminalNode PRIMARY() { return getToken(pa2Parser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(pa2Parser.KEY, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public CreateCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterCreateCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitCreateCMD(this);
		}
	}

	public final CreateCMDContext createCMD() throws RecognitionException {
		CreateCMDContext _localctx = new CreateCMDContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_createCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CREATE);
			setState(212);
			match(TABLE);
			setState(213);
			match(IDENTIFIER);
			setState(214);
			match(LPAR);
			setState(215);
			typedAttributeList();
			setState(216);
			match(RPAR);
			setState(217);
			match(PRIMARY);
			setState(218);
			match(KEY);
			setState(219);
			match(LPAR);
			setState(220);
			attributeList();
			setState(221);
			match(RPAR);
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

	public static class UpdateCMDContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(pa2Parser.UPDATE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public TerminalNode SET() { return getToken(pa2Parser.SET, 0); }
		public List<TerminalNode> UPDATEFRAG() { return getTokens(pa2Parser.UPDATEFRAG); }
		public TerminalNode UPDATEFRAG(int i) {
			return getToken(pa2Parser.UPDATEFRAG, i);
		}
		public TerminalNode WHERE() { return getToken(pa2Parser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(pa2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pa2Parser.COMMA, i);
		}
		public UpdateCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterUpdateCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitUpdateCMD(this);
		}
	}

	public final UpdateCMDContext updateCMD() throws RecognitionException {
		UpdateCMDContext _localctx = new UpdateCMDContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_updateCMD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(UPDATE);
			setState(224);
			match(IDENTIFIER);
			setState(225);
			match(SET);
			setState(226);
			match(UPDATEFRAG);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				match(UPDATEFRAG);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(WHERE);
			setState(235);
			condition();
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(pa2Parser.SEMICOLON, 0); }
		public OpenCMDContext openCMD() {
			return getRuleContext(OpenCMDContext.class,0);
		}
		public CloseCMDContext closeCMD() {
			return getRuleContext(CloseCMDContext.class,0);
		}
		public WriteCMDContext writeCMD() {
			return getRuleContext(WriteCMDContext.class,0);
		}
		public ShowCMDContext showCMD() {
			return getRuleContext(ShowCMDContext.class,0);
		}
		public ExitCMDContext exitCMD() {
			return getRuleContext(ExitCMDContext.class,0);
		}
		public CreateCMDContext createCMD() {
			return getRuleContext(CreateCMDContext.class,0);
		}
		public UpdateCMDContext updateCMD() {
			return getRuleContext(UpdateCMDContext.class,0);
		}
		public InsertCMDContext insertCMD() {
			return getRuleContext(InsertCMDContext.class,0);
		}
		public DeleteCMDContext deleteCMD() {
			return getRuleContext(DeleteCMDContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				{
				setState(237);
				openCMD();
				}
				break;
			case CLOSE:
				{
				setState(238);
				closeCMD();
				}
				break;
			case WRITE:
				{
				setState(239);
				writeCMD();
				}
				break;
			case SHOW:
				{
				setState(240);
				showCMD();
				}
				break;
			case EXIT:
				{
				setState(241);
				exitCMD();
				}
				break;
			case CREATE:
				{
				setState(242);
				createCMD();
				}
				break;
			case UPDATE:
				{
				setState(243);
				updateCMD();
				}
				break;
			case INSERT:
				{
				setState(244);
				insertCMD();
				}
				break;
			case DELETE:
				{
				setState(245);
				deleteCMD();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
			match(SEMICOLON);
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

	public static class ProgramContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(250);
				query();
				}
				break;
			case OPEN:
			case CLOSE:
			case WRITE:
			case EXIT:
			case SHOW:
			case CREATE:
			case UPDATE:
			case INSERT:
			case DELETE:
				{
				setState(251);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3\3"+
		"\3\7\3C\n\3\f\3\16\3F\13\3\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\f\3\f\3\f\7\fo\n\f\f"+
		"\f\16\fr\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u008e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00a9\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b5"+
		"\n\26\3\26\3\26\6\26\u00b9\n\26\r\26\16\26\u00ba\3\26\3\26\3\26\5\26\u00c0"+
		"\n\26\7\26\u00c2\n\26\f\26\16\26\u00c5\13\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00cf\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u00e8\n\31\f\31\16\31\u00eb\13\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f9\n\32\3\32\3\32\3\33\3\33"+
		"\5\33\u00ff\n\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\2\2\2\u0102\2\66\3\2\2\2\4@\3\2\2\2\6G\3\2\2\2\bO\3\2"+
		"\2\2\nR\3\2\2\2\fU\3\2\2\2\16X\3\2\2\2\20[\3\2\2\2\22a\3\2\2\2\24c\3\2"+
		"\2\2\26k\3\2\2\2\30z\3\2\2\2\32|\3\2\2\2\34\u0082\3\2\2\2\36\u008d\3\2"+
		"\2\2 \u008f\3\2\2\2\"\u0095\3\2\2\2$\u0099\3\2\2\2&\u009d\3\2\2\2(\u00a8"+
		"\3\2\2\2*\u00ce\3\2\2\2,\u00d0\3\2\2\2.\u00d5\3\2\2\2\60\u00e1\3\2\2\2"+
		"\62\u00f8\3\2\2\2\64\u00fe\3\2\2\2\66\67\7*\2\2\67=\7+\2\289\7\r\2\29"+
		":\7*\2\2:<\7+\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?"+
		"=\3\2\2\2@D\7\4\2\2AC\7\4\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"E\5\3\2\2\2FD\3\2\2\2GL\7*\2\2HI\7\r\2\2IK\7*\2\2JH\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NL\3\2\2\2OP\7\21\2\2PQ\7*\2\2Q\t\3\2\2"+
		"\2RS\7\22\2\2ST\7*\2\2T\13\3\2\2\2UV\7\25\2\2VW\5\36\20\2W\r\3\2\2\2X"+
		"Y\7\23\2\2YZ\7*\2\2Z\17\3\2\2\2[\\\7#\2\2\\]\7%\2\2]^\7*\2\2^_\7\35\2"+
		"\2_`\5\24\13\2`\21\3\2\2\2ab\7\24\2\2b\23\3\2\2\2ch\5\26\f\2de\7\20\2"+
		"\2eg\5\26\f\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\25\3\2\2\2jh\3"+
		"\2\2\2kp\5\30\r\2lm\7\17\2\2mo\5\30\r\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2q\27\3\2\2\2rp\3\2\2\2st\7,\2\2tu\7(\2\2u{\7,\2\2vw\7&\2\2w"+
		"x\5\24\13\2xy\7\'\2\2y{\3\2\2\2zs\3\2\2\2zv\3\2\2\2{\31\3\2\2\2|}\7\5"+
		"\2\2}~\7&\2\2~\177\5\24\13\2\177\u0080\7\'\2\2\u0080\u0081\5\36\20\2\u0081"+
		"\33\3\2\2\2\u0082\u0083\7\6\2\2\u0083\u0084\7&\2\2\u0084\u0085\5\6\4\2"+
		"\u0085\u0086\7\'\2\2\u0086\u0087\5\36\20\2\u0087\35\3\2\2\2\u0088\u008e"+
		"\7*\2\2\u0089\u008a\7&\2\2\u008a\u008b\5(\25\2\u008b\u008c\7\'\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008e\37\3\2\2"+
		"\2\u008f\u0090\7\7\2\2\u0090\u0091\7&\2\2\u0091\u0092\5\6\4\2\u0092\u0093"+
		"\7\'\2\2\u0093\u0094\5\36\20\2\u0094!\3\2\2\2\u0095\u0096\5\36\20\2\u0096"+
		"\u0097\7\b\2\2\u0097\u0098\5\36\20\2\u0098#\3\2\2\2\u0099\u009a\5\36\20"+
		"\2\u009a\u009b\7\t\2\2\u009b\u009c\5\36\20\2\u009c%\3\2\2\2\u009d\u009e"+
		"\5\36\20\2\u009e\u009f\7\n\2\2\u009f\u00a0\5\36\20\2\u00a0\'\3\2\2\2\u00a1"+
		"\u00a9\5\36\20\2\u00a2\u00a9\5\32\16\2\u00a3\u00a9\5\34\17\2\u00a4\u00a9"+
		"\5 \21\2\u00a5\u00a9\5\"\22\2\u00a6\u00a9\5$\23\2\u00a7\u00a9\5&\24\2"+
		"\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4"+
		"\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		")\3\2\2\2\u00aa\u00ab\7!\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7*\2\2\u00ad"+
		"\u00ae\7$\2\2\u00ae\u00af\7%\2\2\u00af\u00b4\7&\2\2\u00b0\u00b5\5\4\3"+
		"\2\u00b1\u00b2\7)\2\2\u00b2\u00b3\7*\2\2\u00b3\u00b5\7)\2\2\u00b4\u00b0"+
		"\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00c3\3\2\2\2\u00b6\u00bf\7\r\2\2\u00b7"+
		"\u00b9\7\4\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd\7)\2\2\u00bd"+
		"\u00be\7*\2\2\u00be\u00c0\7)\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00bc\3\2\2"+
		"\2\u00c0\u00c2\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00cf\7\'\2\2\u00c7\u00c8\7!\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\7*\2"+
		"\2\u00ca\u00cb\7$\2\2\u00cb\u00cc\7%\2\2\u00cc\u00cd\7 \2\2\u00cd\u00cf"+
		"\5(\25\2\u00ce\u00aa\3\2\2\2\u00ce\u00c7\3\2\2\2\u00cf+\3\2\2\2\u00d0"+
		"\u00d1\7*\2\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\7\16"+
		"\2\2\u00d4-\3\2\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\7\27\2\2\u00d7\u00d8"+
		"\7*\2\2\u00d8\u00d9\7&\2\2\u00d9\u00da\5\2\2\2\u00da\u00db\7\'\2\2\u00db"+
		"\u00dc\7\30\2\2\u00dc\u00dd\7\32\2\2\u00dd\u00de\7&\2\2\u00de\u00df\5"+
		"\6\4\2\u00df\u00e0\7\'\2\2\u00e0/\3\2\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3"+
		"\7*\2\2\u00e3\u00e4\7\34\2\2\u00e4\u00e9\7-\2\2\u00e5\u00e6\7\r\2\2\u00e6"+
		"\u00e8\7-\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ed\7\35\2\2\u00ed\u00ee\5\24\13\2\u00ee\61\3\2\2\2\u00ef\u00f9\5\b"+
		"\5\2\u00f0\u00f9\5\n\6\2\u00f1\u00f9\5\16\b\2\u00f2\u00f9\5\f\7\2\u00f3"+
		"\u00f9\5\22\n\2\u00f4\u00f9\5.\30\2\u00f5\u00f9\5\60\31\2\u00f6\u00f9"+
		"\5*\26\2\u00f7\u00f9\5\20\t\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2\2\2"+
		"\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4"+
		"\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7\16\2\2\u00fb\63\3\2\2\2\u00fc\u00ff\5,\27"+
		"\2\u00fd\u00ff\5\62\32\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\65\3\2\2\2\22=DLhpz\u008d\u00a8\u00b4\u00ba\u00bf\u00c3\u00ce\u00e9\u00f8"+
		"\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}