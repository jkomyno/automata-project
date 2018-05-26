// Generated from /home/jkomyno/antlr4/swl/swl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class swlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN=5, END=6, WHILE=7, IF=8, THEN=9, 
		ELSE=10, ELIF=11, VARIABLE=12, DEFINE=13, TO=14, DO=15, ADD=16, SUB=17, 
		MUL=18, DIV=19, EQUAL=20, N_EQUAL=21, GT_EQUAL=22, LT_EQUAL=23, GT=24, 
		LT=25, AND=26, OR=27, NOT=28, BOOL=29, ID=30, NUMBER=31, WS=32, ErrorChar=33;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_binaryLogicalOperator = 2, 
		RULE_unaryLogicalOperator = 3, RULE_comparisonOperator = 4, RULE_expression = 5, 
		RULE_assign = 6, RULE_input = 7, RULE_print = 8, RULE_add = 9, RULE_sub = 10, 
		RULE_mul = 11, RULE_div = 12, RULE_doPartialStatement = 13, RULE_whileStatement = 14;
	public static final String[] ruleNames = {
		"program", "statement", "binaryLogicalOperator", "unaryLogicalOperator", 
		"comparisonOperator", "expression", "assign", "input", "print", "add", 
		"sub", "mul", "div", "doPartialStatement", "whileStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'input'", "'print'", "'begin'", "'end'", "'while'", 
		"'if'", "'then'", "'else'", "'elif'", "'let'", "'be'", "'to'", "'do'", 
		"'add'", "'sub'", "'mul'", "'div'", "'is'", null, "'gte'", "'lte'", "'gt'", 
		"'lt'", "'and'", "'or'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "BEGIN", "END", "WHILE", "IF", "THEN", "ELSE", 
		"ELIF", "VARIABLE", "DEFINE", "TO", "DO", "ADD", "SUB", "MUL", "DIV", 
		"EQUAL", "N_EQUAL", "GT_EQUAL", "LT_EQUAL", "GT", "LT", "AND", "OR", "NOT", 
		"BOOL", "ID", "NUMBER", "WS", "ErrorChar"
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
	public String getGrammarFileName() { return "swl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public swlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(swlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(swlParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(BEGIN);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				statement();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << WHILE) | (1L << VARIABLE) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0) );
			setState(36);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				assign();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				add();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				sub();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				mul();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				div();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				print();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				input();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				whileStatement();
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

	public static class BinaryLogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(swlParser.AND, 0); }
		public TerminalNode OR() { return getToken(swlParser.OR, 0); }
		public BinaryLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLogicalOperator; }
	}

	public final BinaryLogicalOperatorContext binaryLogicalOperator() throws RecognitionException {
		BinaryLogicalOperatorContext _localctx = new BinaryLogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binaryLogicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnaryLogicalOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(swlParser.NOT, 0); }
		public UnaryLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryLogicalOperator; }
	}

	public final UnaryLogicalOperatorContext unaryLogicalOperator() throws RecognitionException {
		UnaryLogicalOperatorContext _localctx = new UnaryLogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryLogicalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(NOT);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(swlParser.EQUAL, 0); }
		public TerminalNode N_EQUAL() { return getToken(swlParser.N_EQUAL, 0); }
		public TerminalNode GT_EQUAL() { return getToken(swlParser.GT_EQUAL, 0); }
		public TerminalNode LT_EQUAL() { return getToken(swlParser.LT_EQUAL, 0); }
		public TerminalNode GT() { return getToken(swlParser.GT, 0); }
		public TerminalNode LT() { return getToken(swlParser.LT, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << N_EQUAL) | (1L << GT_EQUAL) | (1L << LT_EQUAL) | (1L << GT) | (1L << LT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<UnaryLogicalOperatorContext> unaryLogicalOperator() {
			return getRuleContexts(UnaryLogicalOperatorContext.class);
		}
		public UnaryLogicalOperatorContext unaryLogicalOperator(int i) {
			return getRuleContext(UnaryLogicalOperatorContext.class,i);
		}
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(swlParser.BOOL, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public BinaryLogicalOperatorContext binaryLogicalOperator() {
			return getRuleContext(BinaryLogicalOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(55);
				match(T__0);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(56);
					unaryLogicalOperator();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				expression(0);
				setState(63);
				match(T__1);
				}
				break;
			case ID:
				{
				setState(65);
				match(ID);
				}
				break;
			case NUMBER:
				{
				setState(66);
				match(NUMBER);
				}
				break;
			case BOOL:
				{
				setState(67);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(70);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(73);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
					case N_EQUAL:
					case GT_EQUAL:
					case LT_EQUAL:
					case GT:
					case LT:
						{
						setState(71);
						comparisonOperator();
						}
						break;
					case AND:
					case OR:
						{
						setState(72);
						binaryLogicalOperator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(75);
					expression(5);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(swlParser.VARIABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(swlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(swlParser.ID, i);
		}
		public TerminalNode DEFINE() { return getToken(swlParser.DEFINE, 0); }
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(VARIABLE);
			setState(83);
			match(ID);
			setState(84);
			match(DEFINE);
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__2);
			setState(88);
			match(ID);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__3);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(swlParser.ADD, 0); }
		public TerminalNode TO() { return getToken(swlParser.TO, 0); }
		public List<TerminalNode> ID() { return getTokens(swlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(swlParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ADD);
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			match(TO);
			setState(96);
			match(ID);
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

	public static class SubContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(swlParser.SUB, 0); }
		public TerminalNode TO() { return getToken(swlParser.TO, 0); }
		public List<TerminalNode> ID() { return getTokens(swlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(swlParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(SUB);
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(100);
			match(TO);
			setState(101);
			match(ID);
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

	public static class MulContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(swlParser.MUL, 0); }
		public TerminalNode TO() { return getToken(swlParser.TO, 0); }
		public List<TerminalNode> ID() { return getTokens(swlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(swlParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(MUL);
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(105);
			match(TO);
			setState(106);
			match(ID);
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(swlParser.DIV, 0); }
		public TerminalNode TO() { return getToken(swlParser.TO, 0); }
		public List<TerminalNode> ID() { return getTokens(swlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(swlParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DIV);
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			match(TO);
			setState(111);
			match(ID);
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

	public static class DoPartialStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(swlParser.DO, 0); }
		public DoPartialStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doPartialStatement; }
	}

	public final DoPartialStatementContext doPartialStatement() throws RecognitionException {
		DoPartialStatementContext _localctx = new DoPartialStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_doPartialStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(DO);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(swlParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoPartialStatementContext doPartialStatement() {
			return getRuleContext(DoPartialStatementContext.class,0);
		}
		public TerminalNode END() { return getToken(swlParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(WHILE);
			setState(116);
			expression(0);
			setState(117);
			doPartialStatement();
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << WHILE) | (1L << VARIABLE) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0) );
			setState(123);
			match(END);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r\2"+
		"\16\2$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7G\n\7\3\7\3\7\3\7\5\7L\n\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\6\20z\n\20\r\20\16\20{\3\20\3\20\3\20\2\3\f\21\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\34\35\3\2\26\33\3\2 !\2"+
		"\177\2 \3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f"+
		"F\3\2\2\2\16T\3\2\2\2\20Y\3\2\2\2\22\\\3\2\2\2\24_\3\2\2\2\26d\3\2\2\2"+
		"\30i\3\2\2\2\32n\3\2\2\2\34s\3\2\2\2\36u\3\2\2\2 \"\7\7\2\2!#\5\4\3\2"+
		"\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\b\2\2\'\3\3"+
		"\2\2\2(\61\5\16\b\2)\61\5\24\13\2*\61\5\26\f\2+\61\5\30\r\2,\61\5\32\16"+
		"\2-\61\5\22\n\2.\61\5\20\t\2/\61\5\36\20\2\60(\3\2\2\2\60)\3\2\2\2\60"+
		"*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2"+
		"\61\5\3\2\2\2\62\63\t\2\2\2\63\7\3\2\2\2\64\65\7\36\2\2\65\t\3\2\2\2\66"+
		"\67\t\3\2\2\67\13\3\2\2\289\b\7\1\29=\7\3\2\2:<\5\b\5\2;:\3\2\2\2<?\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\5\f\7\2AB\7\4\2\2BG\3"+
		"\2\2\2CG\7 \2\2DG\7!\2\2EG\7\37\2\2F8\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3"+
		"\2\2\2GQ\3\2\2\2HK\f\6\2\2IL\5\n\6\2JL\5\6\4\2KI\3\2\2\2KJ\3\2\2\2LM\3"+
		"\2\2\2MN\5\f\7\7NP\3\2\2\2OH\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\r"+
		"\3\2\2\2SQ\3\2\2\2TU\7\16\2\2UV\7 \2\2VW\7\17\2\2WX\t\4\2\2X\17\3\2\2"+
		"\2YZ\7\5\2\2Z[\7 \2\2[\21\3\2\2\2\\]\7\6\2\2]^\t\4\2\2^\23\3\2\2\2_`\7"+
		"\22\2\2`a\t\4\2\2ab\7\20\2\2bc\7 \2\2c\25\3\2\2\2de\7\23\2\2ef\t\4\2\2"+
		"fg\7\20\2\2gh\7 \2\2h\27\3\2\2\2ij\7\24\2\2jk\t\4\2\2kl\7\20\2\2lm\7 "+
		"\2\2m\31\3\2\2\2no\7\25\2\2op\t\4\2\2pq\7\20\2\2qr\7 \2\2r\33\3\2\2\2"+
		"st\7\21\2\2t\35\3\2\2\2uv\7\t\2\2vw\5\f\7\2wy\5\34\17\2xz\5\4\3\2yx\3"+
		"\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\b\2\2~\37\3\2\2\2\t"+
		"$\60=FKQ{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}