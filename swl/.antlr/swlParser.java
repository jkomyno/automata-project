// Generated from /home/jkomyno/antlr4/swl/swlParser.g4 by ANTLR 4.7.1

/*
 * Developed in May 2018 @UNIPD by:
 * - Brian Federico
 * - Schiabel Alberto
 */

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
		BEGIN=1, END=2, INPUT=3, PRINT=4, WHILE=5, IF=6, THEN=7, ELSE=8, ELIF=9, 
		FOR=10, VARIABLE=11, ASSIGN=12, TO=13, DO=14, BASIC_SEPARATOR=15, EQUAL=16, 
		N_EQUAL=17, GT_EQUAL=18, LT_EQUAL=19, GT=20, LT=21, AND=22, OR=23, NOT=24, 
		ADD=25, SUB=26, MUL=27, DIV=28, RANGE=29, OPEN_ROUND_BRACKET=30, CLOSED_ROUND_BRACKET=31, 
		STRING=32, BOOL=33, ID=34, NUMBER=35, WS=36, ErrorChar=37, SINGLE_LINE_COMMENT=38, 
		MULTI_LINE_COMMENT=39;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_binaryLogicalOperator = 2, 
		RULE_unaryLogicalOperator = 3, RULE_comparisonOperator = 4, RULE_openRoundBracket = 5, 
		RULE_closedRoundBracket = 6, RULE_expression = 7, RULE_numberOrIdPartial = 8, 
		RULE_conditionalExpression = 9, RULE_printArg = 10, RULE_printVariadic = 11, 
		RULE_define = 12, RULE_assign = 13, RULE_input = 14, RULE_print = 15, 
		RULE_add = 16, RULE_sub = 17, RULE_mul = 18, RULE_div = 19, RULE_doPartialStatement = 20, 
		RULE_conditionalPartialStatement = 21, RULE_conditionalBodyPartial = 22, 
		RULE_whileStatement = 23, RULE_elseIfPartialStatement = 24, RULE_elsePartialStatement = 25, 
		RULE_ifStatement = 26, RULE_rangeIncrementPartial = 27, RULE_range = 28, 
		RULE_forDeclaration = 29, RULE_forRangeStatement = 30;
	public static final String[] ruleNames = {
		"program", "statement", "binaryLogicalOperator", "unaryLogicalOperator", 
		"comparisonOperator", "openRoundBracket", "closedRoundBracket", "expression", 
		"numberOrIdPartial", "conditionalExpression", "printArg", "printVariadic", 
		"define", "assign", "input", "print", "add", "sub", "mul", "div", "doPartialStatement", 
		"conditionalPartialStatement", "conditionalBodyPartial", "whileStatement", 
		"elseIfPartialStatement", "elsePartialStatement", "ifStatement", "rangeIncrementPartial", 
		"range", "forDeclaration", "forRangeStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'input'", "'print'", "'while'", "'if'", "'then'", 
		"'else'", "'elif'", "'for'", "'let'", "'be'", "'to'", "'do'", "','", "'eq'", 
		"'neq'", "'gte'", "'lte'", "'gt'", "'lt'", "'and'", "'or'", "'not'", "'add'", 
		"'sub'", "'mul'", "'div'", "'..'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "INPUT", "PRINT", "WHILE", "IF", "THEN", "ELSE", 
		"ELIF", "FOR", "VARIABLE", "ASSIGN", "TO", "DO", "BASIC_SEPARATOR", "EQUAL", 
		"N_EQUAL", "GT_EQUAL", "LT_EQUAL", "GT", "LT", "AND", "OR", "NOT", "ADD", 
		"SUB", "MUL", "DIV", "RANGE", "OPEN_ROUND_BRACKET", "CLOSED_ROUND_BRACKET", 
		"STRING", "BOOL", "ID", "NUMBER", "WS", "ErrorChar", "SINGLE_LINE_COMMENT", 
		"MULTI_LINE_COMMENT"
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
	public String getGrammarFileName() { return "swlParser.g4"; }

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
			setState(62);
			match(BEGIN);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << VARIABLE) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << ID))) != 0) );
			setState(68);
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
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForRangeStatementContext forRangeStatement() {
			return getRuleContext(ForRangeStatementContext.class,0);
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				define();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				assign();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				add();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				sub();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				mul();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				div();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				print();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				input();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				whileStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
				forRangeStatement();
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
			setState(83);
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
			setState(85);
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
			setState(87);
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

	public static class OpenRoundBracketContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(swlParser.OPEN_ROUND_BRACKET, 0); }
		public OpenRoundBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openRoundBracket; }
	}

	public final OpenRoundBracketContext openRoundBracket() throws RecognitionException {
		OpenRoundBracketContext _localctx = new OpenRoundBracketContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_openRoundBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(OPEN_ROUND_BRACKET);
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

	public static class ClosedRoundBracketContext extends ParserRuleContext {
		public TerminalNode CLOSED_ROUND_BRACKET() { return getToken(swlParser.CLOSED_ROUND_BRACKET, 0); }
		public ClosedRoundBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedRoundBracket; }
	}

	public final ClosedRoundBracketContext closedRoundBracket() throws RecognitionException {
		ClosedRoundBracketContext _localctx = new ClosedRoundBracketContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_closedRoundBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CLOSED_ROUND_BRACKET);
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
		public OpenRoundBracketContext openRoundBracket() {
			return getRuleContext(OpenRoundBracketContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ClosedRoundBracketContext closedRoundBracket() {
			return getRuleContext(ClosedRoundBracketContext.class,0);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case OPEN_ROUND_BRACKET:
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(94);
					unaryLogicalOperator();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				openRoundBracket();
				setState(101);
				expression(0);
				setState(102);
				closedRoundBracket();
				}
				break;
			case ID:
				{
				setState(104);
				match(ID);
				}
				break;
			case NUMBER:
				{
				setState(105);
				match(NUMBER);
				}
				break;
			case BOOL:
				{
				setState(106);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
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
					setState(109);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(112);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
					case N_EQUAL:
					case GT_EQUAL:
					case LT_EQUAL:
					case GT:
					case LT:
						{
						setState(110);
						comparisonOperator();
						}
						break;
					case AND:
					case OR:
						{
						setState(111);
						binaryLogicalOperator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(114);
					expression(5);
					}
					} 
				}
				setState(120);
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

	public static class NumberOrIdPartialContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public NumberOrIdPartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberOrIdPartial; }
	}

	public final NumberOrIdPartialContext numberOrIdPartial() throws RecognitionException {
		NumberOrIdPartialContext _localctx = new NumberOrIdPartialContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numberOrIdPartial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expression(0);
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

	public static class PrintArgContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(swlParser.STRING, 0); }
		public NumberOrIdPartialContext numberOrIdPartial() {
			return getRuleContext(NumberOrIdPartialContext.class,0);
		}
		public PrintArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArg; }
	}

	public final PrintArgContext printArg() throws RecognitionException {
		PrintArgContext _localctx = new PrintArgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printArg);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(STRING);
				}
				break;
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				numberOrIdPartial();
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

	public static class PrintVariadicContext extends ParserRuleContext {
		public TerminalNode BASIC_SEPARATOR() { return getToken(swlParser.BASIC_SEPARATOR, 0); }
		public PrintArgContext printArg() {
			return getRuleContext(PrintArgContext.class,0);
		}
		public PrintVariadicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printVariadic; }
	}

	public final PrintVariadicContext printVariadic() throws RecognitionException {
		PrintVariadicContext _localctx = new PrintVariadicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printVariadic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(BASIC_SEPARATOR);
			setState(130);
			printArg();
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

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(swlParser.VARIABLE, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(swlParser.ASSIGN, 0); }
		public NumberOrIdPartialContext numberOrIdPartial() {
			return getRuleContext(NumberOrIdPartialContext.class,0);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(VARIABLE);
			setState(133);
			match(ID);
			setState(134);
			match(ASSIGN);
			setState(135);
			numberOrIdPartial();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(swlParser.ASSIGN, 0); }
		public NumberOrIdPartialContext numberOrIdPartial() {
			return getRuleContext(NumberOrIdPartialContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(138);
			match(ASSIGN);
			setState(139);
			numberOrIdPartial();
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
		public TerminalNode INPUT() { return getToken(swlParser.INPUT, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(INPUT);
			setState(142);
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
		public TerminalNode PRINT() { return getToken(swlParser.PRINT, 0); }
		public PrintArgContext printArg() {
			return getRuleContext(PrintArgContext.class,0);
		}
		public List<PrintVariadicContext> printVariadic() {
			return getRuleContexts(PrintVariadicContext.class);
		}
		public PrintVariadicContext printVariadic(int i) {
			return getRuleContext(PrintVariadicContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(PRINT);
			setState(145);
			printArg();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BASIC_SEPARATOR) {
				{
				{
				setState(146);
				printVariadic();
				}
				}
				setState(151);
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(swlParser.ADD, 0); }
		public NumberOrIdPartialContext numberOrIdPartial() {
			return getRuleContext(NumberOrIdPartialContext.class,0);
		}
		public TerminalNode TO() { return getToken(swlParser.TO, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ADD);
			setState(153);
			numberOrIdPartial();
			setState(154);
			match(TO);
			setState(155);
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
		public NumberOrIdPartialContext numberOrIdPartial() {
			return getRuleContext(NumberOrIdPartialContext.class,0);
		}
		public TerminalNode TO() { return getToken(swlParser.TO, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(SUB);
			setState(158);
			numberOrIdPartial();
			setState(159);
			match(TO);
			setState(160);
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
		public NumberOrIdPartialContext numberOrIdPartial() {
			return getRuleContext(NumberOrIdPartialContext.class,0);
		}
		public TerminalNode TO() { return getToken(swlParser.TO, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(MUL);
			setState(163);
			numberOrIdPartial();
			setState(164);
			match(TO);
			setState(165);
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
		public NumberOrIdPartialContext numberOrIdPartial() {
			return getRuleContext(NumberOrIdPartialContext.class,0);
		}
		public TerminalNode TO() { return getToken(swlParser.TO, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(DIV);
			setState(168);
			numberOrIdPartial();
			setState(169);
			match(TO);
			setState(170);
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
		enterRule(_localctx, 40, RULE_doPartialStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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

	public static class ConditionalPartialStatementContext extends ParserRuleContext {
		public DoPartialStatementContext doPartialStatement() {
			return getRuleContext(DoPartialStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionalPartialStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalPartialStatement; }
	}

	public final ConditionalPartialStatementContext conditionalPartialStatement() throws RecognitionException {
		ConditionalPartialStatementContext _localctx = new ConditionalPartialStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionalPartialStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			doPartialStatement();
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << VARIABLE) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << ID))) != 0) );
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

	public static class ConditionalBodyPartialContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalPartialStatementContext conditionalPartialStatement() {
			return getRuleContext(ConditionalPartialStatementContext.class,0);
		}
		public ConditionalBodyPartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBodyPartial; }
	}

	public final ConditionalBodyPartialContext conditionalBodyPartial() throws RecognitionException {
		ConditionalBodyPartialContext _localctx = new ConditionalBodyPartialContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditionalBodyPartial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			conditionalExpression();
			setState(181);
			conditionalPartialStatement();
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
		public ConditionalBodyPartialContext conditionalBodyPartial() {
			return getRuleContext(ConditionalBodyPartialContext.class,0);
		}
		public TerminalNode END() { return getToken(swlParser.END, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(WHILE);
			setState(184);
			conditionalBodyPartial();
			setState(185);
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

	public static class ElseIfPartialStatementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(swlParser.ELIF, 0); }
		public ConditionalBodyPartialContext conditionalBodyPartial() {
			return getRuleContext(ConditionalBodyPartialContext.class,0);
		}
		public ElseIfPartialStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfPartialStatement; }
	}

	public final ElseIfPartialStatementContext elseIfPartialStatement() throws RecognitionException {
		ElseIfPartialStatementContext _localctx = new ElseIfPartialStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseIfPartialStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ELIF);
			setState(188);
			conditionalBodyPartial();
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

	public static class ElsePartialStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(swlParser.ELSE, 0); }
		public ConditionalPartialStatementContext conditionalPartialStatement() {
			return getRuleContext(ConditionalPartialStatementContext.class,0);
		}
		public ElsePartialStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePartialStatement; }
	}

	public final ElsePartialStatementContext elsePartialStatement() throws RecognitionException {
		ElsePartialStatementContext _localctx = new ElsePartialStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elsePartialStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ELSE);
			setState(191);
			conditionalPartialStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(swlParser.IF, 0); }
		public ConditionalBodyPartialContext conditionalBodyPartial() {
			return getRuleContext(ConditionalBodyPartialContext.class,0);
		}
		public TerminalNode END() { return getToken(swlParser.END, 0); }
		public List<ElseIfPartialStatementContext> elseIfPartialStatement() {
			return getRuleContexts(ElseIfPartialStatementContext.class);
		}
		public ElseIfPartialStatementContext elseIfPartialStatement(int i) {
			return getRuleContext(ElseIfPartialStatementContext.class,i);
		}
		public ElsePartialStatementContext elsePartialStatement() {
			return getRuleContext(ElsePartialStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IF);
			setState(194);
			conditionalBodyPartial();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(195);
				elseIfPartialStatement();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(201);
				elsePartialStatement();
				}
			}

			setState(204);
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

	public static class RangeIncrementPartialContext extends ParserRuleContext {
		public TerminalNode BASIC_SEPARATOR() { return getToken(swlParser.BASIC_SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(swlParser.NUMBER, 0); }
		public RangeIncrementPartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeIncrementPartial; }
	}

	public final RangeIncrementPartialContext rangeIncrementPartial() throws RecognitionException {
		RangeIncrementPartialContext _localctx = new RangeIncrementPartialContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rangeIncrementPartial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(BASIC_SEPARATOR);
			setState(207);
			match(NUMBER);
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

	public static class RangeContext extends ParserRuleContext {
		public List<NumberOrIdPartialContext> numberOrIdPartial() {
			return getRuleContexts(NumberOrIdPartialContext.class);
		}
		public NumberOrIdPartialContext numberOrIdPartial(int i) {
			return getRuleContext(NumberOrIdPartialContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(swlParser.RANGE, 0); }
		public RangeIncrementPartialContext rangeIncrementPartial() {
			return getRuleContext(RangeIncrementPartialContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			numberOrIdPartial();
			setState(210);
			match(RANGE);
			setState(211);
			numberOrIdPartial();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_SEPARATOR) {
				{
				setState(212);
				rangeIncrementPartial();
				}
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

	public static class ForDeclarationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(swlParser.FOR, 0); }
		public TerminalNode ID() { return getToken(swlParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(swlParser.ASSIGN, 0); }
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(FOR);
			setState(216);
			match(ID);
			setState(217);
			match(ASSIGN);
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

	public static class ForRangeStatementContext extends ParserRuleContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ConditionalPartialStatementContext conditionalPartialStatement() {
			return getRuleContext(ConditionalPartialStatementContext.class,0);
		}
		public TerminalNode END() { return getToken(swlParser.END, 0); }
		public ForRangeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeStatement; }
	}

	public final ForRangeStatementContext forRangeStatement() throws RecognitionException {
		ForRangeStatementContext _localctx = new ForRangeStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forRangeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			forDeclaration();
			setState(220);
			range();
			setState(221);
			conditionalPartialStatement();
			setState(222);
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\6\2C\n\2\r\2\16\2D\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3T\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\tb\n"+
		"\t\f\t\16\te\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\t\3\t\3\t\5\t"+
		"s\n\t\3\t\3\t\7\tw\n\t\f\t\16\tz\13\t\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u0082"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u0096\n\21\f\21\16\21\u0099\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\6\27\u00b3\n\27\r\27\16\27\u00b4"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\7\34\u00c7\n\34\f\34\16\34\u00ca\13\34\3\34\5\34\u00cd\n\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u00d8\n\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \2\3\20!\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>\2\5\3\2\30\31\3\2\22\27\3\2$%\2\u00da"+
		"\2@\3\2\2\2\4S\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\f[\3\2\2\2\16"+
		"]\3\2\2\2\20m\3\2\2\2\22{\3\2\2\2\24}\3\2\2\2\26\u0081\3\2\2\2\30\u0083"+
		"\3\2\2\2\32\u0086\3\2\2\2\34\u008b\3\2\2\2\36\u008f\3\2\2\2 \u0092\3\2"+
		"\2\2\"\u009a\3\2\2\2$\u009f\3\2\2\2&\u00a4\3\2\2\2(\u00a9\3\2\2\2*\u00ae"+
		"\3\2\2\2,\u00b0\3\2\2\2.\u00b6\3\2\2\2\60\u00b9\3\2\2\2\62\u00bd\3\2\2"+
		"\2\64\u00c0\3\2\2\2\66\u00c3\3\2\2\28\u00d0\3\2\2\2:\u00d3\3\2\2\2<\u00d9"+
		"\3\2\2\2>\u00dd\3\2\2\2@B\7\3\2\2AC\5\4\3\2BA\3\2\2\2CD\3\2\2\2DB\3\2"+
		"\2\2DE\3\2\2\2EF\3\2\2\2FG\7\4\2\2G\3\3\2\2\2HT\5\32\16\2IT\5\34\17\2"+
		"JT\5\"\22\2KT\5$\23\2LT\5&\24\2MT\5(\25\2NT\5 \21\2OT\5\36\20\2PT\5\60"+
		"\31\2QT\5\66\34\2RT\5> \2SH\3\2\2\2SI\3\2\2\2SJ\3\2\2\2SK\3\2\2\2SL\3"+
		"\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\5"+
		"\3\2\2\2UV\t\2\2\2V\7\3\2\2\2WX\7\32\2\2X\t\3\2\2\2YZ\t\3\2\2Z\13\3\2"+
		"\2\2[\\\7 \2\2\\\r\3\2\2\2]^\7!\2\2^\17\3\2\2\2_c\b\t\1\2`b\5\b\5\2a`"+
		"\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\5\f\7\2g"+
		"h\5\20\t\2hi\5\16\b\2in\3\2\2\2jn\7$\2\2kn\7%\2\2ln\7#\2\2m_\3\2\2\2m"+
		"j\3\2\2\2mk\3\2\2\2ml\3\2\2\2nx\3\2\2\2or\f\6\2\2ps\5\n\6\2qs\5\6\4\2"+
		"rp\3\2\2\2rq\3\2\2\2st\3\2\2\2tu\5\20\t\7uw\3\2\2\2vo\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{|\t\4\2\2|\23\3\2\2\2}~\5"+
		"\20\t\2~\25\3\2\2\2\177\u0082\7\"\2\2\u0080\u0082\5\22\n\2\u0081\177\3"+
		"\2\2\2\u0081\u0080\3\2\2\2\u0082\27\3\2\2\2\u0083\u0084\7\21\2\2\u0084"+
		"\u0085\5\26\f\2\u0085\31\3\2\2\2\u0086\u0087\7\r\2\2\u0087\u0088\7$\2"+
		"\2\u0088\u0089\7\16\2\2\u0089\u008a\5\22\n\2\u008a\33\3\2\2\2\u008b\u008c"+
		"\7$\2\2\u008c\u008d\7\16\2\2\u008d\u008e\5\22\n\2\u008e\35\3\2\2\2\u008f"+
		"\u0090\7\5\2\2\u0090\u0091\7$\2\2\u0091\37\3\2\2\2\u0092\u0093\7\6\2\2"+
		"\u0093\u0097\5\26\f\2\u0094\u0096\5\30\r\2\u0095\u0094\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098!\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7\33\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7"+
		"\17\2\2\u009d\u009e\7$\2\2\u009e#\3\2\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a1"+
		"\5\22\n\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\7$\2\2\u00a3%\3\2\2\2\u00a4"+
		"\u00a5\7\35\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7\17\2\2\u00a7\u00a8"+
		"\7$\2\2\u00a8\'\3\2\2\2\u00a9\u00aa\7\36\2\2\u00aa\u00ab\5\22\n\2\u00ab"+
		"\u00ac\7\17\2\2\u00ac\u00ad\7$\2\2\u00ad)\3\2\2\2\u00ae\u00af\7\20\2\2"+
		"\u00af+\3\2\2\2\u00b0\u00b2\5*\26\2\u00b1\u00b3\5\4\3\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"-\3\2\2\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\5,\27\2\u00b8/\3\2\2\2\u00b9"+
		"\u00ba\7\7\2\2\u00ba\u00bb\5.\30\2\u00bb\u00bc\7\4\2\2\u00bc\61\3\2\2"+
		"\2\u00bd\u00be\7\13\2\2\u00be\u00bf\5.\30\2\u00bf\63\3\2\2\2\u00c0\u00c1"+
		"\7\n\2\2\u00c1\u00c2\5,\27\2\u00c2\65\3\2\2\2\u00c3\u00c4\7\b\2\2\u00c4"+
		"\u00c8\5.\30\2\u00c5\u00c7\5\62\32\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cd\5\64\33\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\4\2\2\u00cf\67\3\2\2\2\u00d0"+
		"\u00d1\7\21\2\2\u00d1\u00d2\7%\2\2\u00d29\3\2\2\2\u00d3\u00d4\5\22\n\2"+
		"\u00d4\u00d5\7\37\2\2\u00d5\u00d7\5\22\n\2\u00d6\u00d8\58\35\2\u00d7\u00d6"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8;\3\2\2\2\u00d9\u00da\7\f\2\2\u00da"+
		"\u00db\7$\2\2\u00db\u00dc\7\16\2\2\u00dc=\3\2\2\2\u00dd\u00de\5<\37\2"+
		"\u00de\u00df\5:\36\2\u00df\u00e0\5,\27\2\u00e0\u00e1\7\4\2\2\u00e1?\3"+
		"\2\2\2\16DScmrx\u0081\u0097\u00b4\u00c8\u00cc\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}