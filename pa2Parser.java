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
		RPAR=37, OPERATION=38, LITERAL=39, IDENTIFIER=40, UPDATEFRAG=41;
	public static final int
		RULE_type = 0, RULE_typedAttributeList = 1, RULE_integer = 2, RULE_operand = 3, 
		RULE_attributeList = 4, RULE_openCMD = 5, RULE_closeCMD = 6, RULE_showCMD = 7, 
		RULE_writeCMD = 8, RULE_deleteCMD = 9, RULE_exitCMD = 10, RULE_condition = 11, 
		RULE_conjunction = 12, RULE_comparison = 13, RULE_selection = 14, RULE_projection = 15, 
		RULE_atomicExpr = 16, RULE_renaming = 17, RULE_union = 18, RULE_difference = 19, 
		RULE_product = 20, RULE_expr = 21, RULE_insertCMD = 22, RULE_query = 23, 
		RULE_createCMD = 24, RULE_updateCMD = 25, RULE_command = 26, RULE_program = 27;
	public static final String[] ruleNames = {
		"type", "typedAttributeList", "integer", "operand", "attributeList", "openCMD", 
		"closeCMD", "showCMD", "writeCMD", "deleteCMD", "exitCMD", "condition", 
		"conjunction", "comparison", "selection", "projection", "atomicExpr", 
		"renaming", "union", "difference", "product", "expr", "insertCMD", "query", 
		"createCMD", "updateCMD", "command", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'+'", "'-'", "'*'", "'='", "'<-'", 
		"','", "';'", "'&&'", "'||'", "'OPEN'", "'CLOSE'", "'WRITE'", "'EXIT'", 
		"'SHOW'", "'CREATE'", "'TABLE'", "'PRIMARY'", "'FOREIGN'", "'KEY'", "'UPDATE'", 
		"'SET'", "'WHERE'", "'INTEGER'", "'VARCHAR'", "'RELATION'", "'INSERT'", 
		"'INTO'", "'DELETE'", "'VALUES'", "'FROM'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "DIGIT", "SELECT", "PROJECT", "RENAME", "PLUS", "MINUS", "PRODUCT", 
		"EQUAL", "LARROW", "COMMA", "SEMICOLON", "DOUBLEAND", "DOUBLEOR", "OPEN", 
		"CLOSE", "WRITE", "EXIT", "SHOW", "CREATE", "TABLE", "PRIMARY", "FOREIGN", 
		"KEY", "UPDATE", "SET", "WHERE", "INTEGER", "VARCHAR", "RELATION", "INSERT", 
		"INTO", "DELETE", "VALUES", "FROM", "LPAR", "RPAR", "OPERATION", "LITERAL", 
		"IDENTIFIER", "UPDATEFRAG"
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(pa2Parser.INTEGER, 0); }
		public TerminalNode VARCHAR() { return getToken(pa2Parser.VARCHAR, 0); }
		public TerminalNode LPAR() { return getToken(pa2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(pa2Parser.RPAR, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(pa2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(pa2Parser.DIGIT, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(INTEGER);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(57);
				match(VARCHAR);
				setState(58);
				match(LPAR);
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					match(DIGIT);
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(64);
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

	public static class TypedAttributeListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(pa2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pa2Parser.IDENTIFIER, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
		enterRule(_localctx, 2, RULE_typedAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IDENTIFIER);
			setState(68);
			type();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				match(IDENTIFIER);
				setState(71);
				type();
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
		enterRule(_localctx, 4, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				match(DIGIT);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class OperandContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public TerminalNode LITERAL() { return getToken(pa2Parser.LITERAL, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pa2Listener ) ((pa2Listener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operand);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				integer();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(IDENTIFIER);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(LITERAL);
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
		enterRule(_localctx, 8, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				match(IDENTIFIER);
				}
				}
				setState(94);
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
		enterRule(_localctx, 10, RULE_openCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(OPEN);
			setState(96);
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
		enterRule(_localctx, 12, RULE_closeCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CLOSE);
			setState(99);
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
		enterRule(_localctx, 14, RULE_showCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(SHOW);
			setState(102);
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
		enterRule(_localctx, 16, RULE_writeCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(WRITE);
			setState(105);
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
		enterRule(_localctx, 18, RULE_deleteCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(DELETE);
			setState(108);
			match(FROM);
			setState(109);
			match(IDENTIFIER);
			setState(110);
			match(WHERE);
			setState(111);
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
		enterRule(_localctx, 20, RULE_exitCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			conjunction();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLEOR) {
				{
				{
				setState(116);
				match(DOUBLEOR);
				setState(117);
				conjunction();
				}
				}
				setState(122);
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
		enterRule(_localctx, 24, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			comparison();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLEAND) {
				{
				{
				setState(124);
				match(DOUBLEAND);
				setState(125);
				comparison();
				}
				}
				setState(130);
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
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
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
		enterRule(_localctx, 26, RULE_comparison);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				operand();
				setState(132);
				match(OPERATION);
				setState(133);
				operand();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(135);
				match(LPAR);
				setState(136);
				condition();
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
		enterRule(_localctx, 28, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(SELECT);
			setState(142);
			match(LPAR);
			setState(143);
			condition();
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
		enterRule(_localctx, 30, RULE_projection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(PROJECT);
			setState(148);
			match(LPAR);
			setState(149);
			attributeList();
			setState(150);
			match(RPAR);
			setState(151);
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
		enterRule(_localctx, 32, RULE_atomicExpr);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(IDENTIFIER);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(154);
				match(LPAR);
				setState(155);
				expr();
				setState(156);
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
		enterRule(_localctx, 34, RULE_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(RENAME);
			setState(161);
			match(LPAR);
			setState(162);
			attributeList();
			setState(163);
			match(RPAR);
			setState(164);
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
		enterRule(_localctx, 36, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			atomicExpr();
			setState(167);
			match(PLUS);
			setState(168);
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
		enterRule(_localctx, 38, RULE_difference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			atomicExpr();
			setState(171);
			match(MINUS);
			setState(172);
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
		enterRule(_localctx, 40, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			atomicExpr();
			setState(175);
			match(PRODUCT);
			setState(176);
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
		enterRule(_localctx, 42, RULE_expr);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				atomicExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				selection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				projection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				renaming();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				union();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				difference();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
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
		public TerminalNode IDENTIFIER() { return getToken(pa2Parser.IDENTIFIER, 0); }
		public TerminalNode VALUES() { return getToken(pa2Parser.VALUES, 0); }
		public TerminalNode FROM() { return getToken(pa2Parser.FROM, 0); }
		public TerminalNode LPAR() { return getToken(pa2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(pa2Parser.RPAR, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public List<TerminalNode> LITERAL() { return getTokens(pa2Parser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(pa2Parser.LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pa2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pa2Parser.COMMA, i);
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
		enterRule(_localctx, 44, RULE_insertCMD);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(187);
				match(INSERT);
				setState(188);
				match(INTO);
				setState(189);
				match(IDENTIFIER);
				setState(190);
				match(VALUES);
				setState(191);
				match(FROM);
				setState(192);
				match(LPAR);
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(193);
					integer();
					}
					break;
				case LITERAL:
					{
					setState(194);
					match(LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(197);
					match(COMMA);
					setState(204);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DIGIT:
						{
						setState(199); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(198);
							match(DIGIT);
							}
							}
							setState(201); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==DIGIT );
						}
						break;
					case LITERAL:
						{
						setState(203);
						match(LITERAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(212);
				match(INSERT);
				setState(213);
				match(INTO);
				setState(214);
				match(IDENTIFIER);
				setState(215);
				match(VALUES);
				setState(216);
				match(FROM);
				setState(217);
				match(RELATION);
				setState(218);
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
		enterRule(_localctx, 46, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IDENTIFIER);
			setState(222);
			match(LARROW);
			setState(223);
			expr();
			setState(224);
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
		enterRule(_localctx, 48, RULE_createCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(CREATE);
			setState(227);
			match(TABLE);
			setState(228);
			match(IDENTIFIER);
			setState(229);
			match(LPAR);
			setState(230);
			typedAttributeList();
			setState(231);
			match(RPAR);
			setState(232);
			match(PRIMARY);
			setState(233);
			match(KEY);
			setState(234);
			match(LPAR);
			setState(235);
			attributeList();
			setState(236);
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
		enterRule(_localctx, 50, RULE_updateCMD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(UPDATE);
			setState(239);
			match(IDENTIFIER);
			setState(240);
			match(SET);
			setState(241);
			match(UPDATEFRAG);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				match(UPDATEFRAG);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(WHERE);
			setState(250);
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
		enterRule(_localctx, 52, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				{
				setState(252);
				openCMD();
				}
				break;
			case CLOSE:
				{
				setState(253);
				closeCMD();
				}
				break;
			case WRITE:
				{
				setState(254);
				writeCMD();
				}
				break;
			case SHOW:
				{
				setState(255);
				showCMD();
				}
				break;
			case EXIT:
				{
				setState(256);
				exitCMD();
				}
				break;
			case CREATE:
				{
				setState(257);
				createCMD();
				}
				break;
			case UPDATE:
				{
				setState(258);
				updateCMD();
				}
				break;
			case INSERT:
				{
				setState(259);
				insertCMD();
				}
				break;
			case DELETE:
				{
				setState(260);
				deleteCMD();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
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
		enterRule(_localctx, 54, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(265);
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
				setState(266);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\6\2?\n\2\r\2"+
		"\16\2@\3\2\5\2D\n\2\3\3\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\6"+
		"\4Q\n\4\r\4\16\4R\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`"+
		"\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\16\3\16\3"+
		"\16\7\16\u0081\n\16\f\16\16\16\u0084\13\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u008e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a1\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00bc\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c6\n\30\3\30\3\30\6\30\u00ca\n"+
		"\30\r\30\16\30\u00cb\3\30\5\30\u00cf\n\30\7\30\u00d1\n\30\f\30\16\30\u00d4"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00de\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u00f7\n\33\f\33\16\33\u00fa"+
		"\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0108\n\34\3\34\3\34\3\35\3\35\5\35\u010e\n\35\3\35\2\2\36\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\2\2\u0113\2C\3\2"+
		"\2\2\4E\3\2\2\2\6P\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\fa\3\2\2\2\16d\3\2\2"+
		"\2\20g\3\2\2\2\22j\3\2\2\2\24m\3\2\2\2\26s\3\2\2\2\30u\3\2\2\2\32}\3\2"+
		"\2\2\34\u008d\3\2\2\2\36\u008f\3\2\2\2 \u0095\3\2\2\2\"\u00a0\3\2\2\2"+
		"$\u00a2\3\2\2\2&\u00a8\3\2\2\2(\u00ac\3\2\2\2*\u00b0\3\2\2\2,\u00bb\3"+
		"\2\2\2.\u00dd\3\2\2\2\60\u00df\3\2\2\2\62\u00e4\3\2\2\2\64\u00f0\3\2\2"+
		"\2\66\u0107\3\2\2\28\u010d\3\2\2\2:D\7\36\2\2;<\7\37\2\2<>\7&\2\2=?\7"+
		"\4\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\7\'\2\2C:\3"+
		"\2\2\2C;\3\2\2\2D\3\3\2\2\2EF\7*\2\2FL\5\2\2\2GH\7\r\2\2HI\7*\2\2IK\5"+
		"\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OQ"+
		"\7\4\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\7\3\2\2\2TX\5\6\4\2"+
		"UX\7*\2\2VX\7)\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\t\3\2\2\2Y^\7*\2\2Z"+
		"[\7\r\2\2[]\7*\2\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\13\3\2\2"+
		"\2`^\3\2\2\2ab\7\21\2\2bc\7*\2\2c\r\3\2\2\2de\7\22\2\2ef\7*\2\2f\17\3"+
		"\2\2\2gh\7\25\2\2hi\5\"\22\2i\21\3\2\2\2jk\7\23\2\2kl\7*\2\2l\23\3\2\2"+
		"\2mn\7#\2\2no\7%\2\2op\7*\2\2pq\7\35\2\2qr\5\30\r\2r\25\3\2\2\2st\7\24"+
		"\2\2t\27\3\2\2\2uz\5\32\16\2vw\7\20\2\2wy\5\32\16\2xv\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{\31\3\2\2\2|z\3\2\2\2}\u0082\5\34\17\2~\177\7\17"+
		"\2\2\177\u0081\5\34\17\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\33\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\b\5\2\u0086\u0087\7(\2\2\u0087\u0088\5\b\5\2\u0088\u008e\3\2"+
		"\2\2\u0089\u008a\7&\2\2\u008a\u008b\5\30\r\2\u008b\u008c\7\'\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0089\3\2\2\2\u008e\35\3\2\2"+
		"\2\u008f\u0090\7\5\2\2\u0090\u0091\7&\2\2\u0091\u0092\5\30\r\2\u0092\u0093"+
		"\7\'\2\2\u0093\u0094\5\"\22\2\u0094\37\3\2\2\2\u0095\u0096\7\6\2\2\u0096"+
		"\u0097\7&\2\2\u0097\u0098\5\n\6\2\u0098\u0099\7\'\2\2\u0099\u009a\5\""+
		"\22\2\u009a!\3\2\2\2\u009b\u00a1\7*\2\2\u009c\u009d\7&\2\2\u009d\u009e"+
		"\5,\27\2\u009e\u009f\7\'\2\2\u009f\u00a1\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0"+
		"\u009c\3\2\2\2\u00a1#\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7&\2\2\u00a4"+
		"\u00a5\5\n\6\2\u00a5\u00a6\7\'\2\2\u00a6\u00a7\5\"\22\2\u00a7%\3\2\2\2"+
		"\u00a8\u00a9\5\"\22\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\5\"\22\2\u00ab\'"+
		"\3\2\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\5\"\22\2"+
		"\u00af)\3\2\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\7\n\2\2\u00b2\u00b3\5"+
		"\"\22\2\u00b3+\3\2\2\2\u00b4\u00bc\5\"\22\2\u00b5\u00bc\5\36\20\2\u00b6"+
		"\u00bc\5 \21\2\u00b7\u00bc\5$\23\2\u00b8\u00bc\5&\24\2\u00b9\u00bc\5("+
		"\25\2\u00ba\u00bc\5*\26\2\u00bb\u00b4\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb"+
		"\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc-\3\2\2\2\u00bd\u00be\7!\2\2\u00be\u00bf"+
		"\7\"\2\2\u00bf\u00c0\7*\2\2\u00c0\u00c1\7$\2\2\u00c1\u00c2\7%\2\2\u00c2"+
		"\u00c5\7&\2\2\u00c3\u00c6\5\6\4\2\u00c4\u00c6\7)\2\2\u00c5\u00c3\3\2\2"+
		"\2\u00c5\u00c4\3\2\2\2\u00c6\u00d2\3\2\2\2\u00c7\u00ce\7\r\2\2\u00c8\u00ca"+
		"\7\4\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\7)\2\2\u00ce\u00c9\3\2"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00de\7\'\2\2\u00d6\u00d7\7!\2\2\u00d7"+
		"\u00d8\7\"\2\2\u00d8\u00d9\7*\2\2\u00d9\u00da\7$\2\2\u00da\u00db\7%\2"+
		"\2\u00db\u00dc\7 \2\2\u00dc\u00de\5,\27\2\u00dd\u00bd\3\2\2\2\u00dd\u00d6"+
		"\3\2\2\2\u00de/\3\2\2\2\u00df\u00e0\7*\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2"+
		"\5,\27\2\u00e2\u00e3\7\16\2\2\u00e3\61\3\2\2\2\u00e4\u00e5\7\26\2\2\u00e5"+
		"\u00e6\7\27\2\2\u00e6\u00e7\7*\2\2\u00e7\u00e8\7&\2\2\u00e8\u00e9\5\4"+
		"\3\2\u00e9\u00ea\7\'\2\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec\7\32\2\2\u00ec"+
		"\u00ed\7&\2\2\u00ed\u00ee\5\n\6\2\u00ee\u00ef\7\'\2\2\u00ef\63\3\2\2\2"+
		"\u00f0\u00f1\7\33\2\2\u00f1\u00f2\7*\2\2\u00f2\u00f3\7\34\2\2\u00f3\u00f8"+
		"\7+\2\2\u00f4\u00f5\7\r\2\2\u00f5\u00f7\7+\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\35\2\2\u00fc\u00fd\5\30\r\2\u00fd"+
		"\65\3\2\2\2\u00fe\u0108\5\f\7\2\u00ff\u0108\5\16\b\2\u0100\u0108\5\22"+
		"\n\2\u0101\u0108\5\20\t\2\u0102\u0108\5\26\f\2\u0103\u0108\5\62\32\2\u0104"+
		"\u0108\5\64\33\2\u0105\u0108\5.\30\2\u0106\u0108\5\24\13\2\u0107\u00fe"+
		"\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0101\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\16\2\2\u010a"+
		"\67\3\2\2\2\u010b\u010e\5\60\31\2\u010c\u010e\5\66\34\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010c\3\2\2\2\u010e9\3\2\2\2\25@CLRW^z\u0082\u008d\u00a0"+
		"\u00bb\u00c5\u00cb\u00ce\u00d2\u00dd\u00f8\u0107\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}