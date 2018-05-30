parser grammar swlParser;

options {
  tokenVocab = swlLexer;
}

@parser::header {
/*
 * Developed in May 2018 @UNIPD by:
 * - Brian Federico
 * - Schiabel Alberto
 */
}

/********* PARSER *********/

program   : BEGIN statement+ END;
          
statement :
    declare
  | define
  | assign
  | add
  | sub
  | mul
  | div
  | print
  | input
  | whileStatement
  | ifStatement
  | forRangeStatement;

binaryLogicalOperator : AND | OR ;

unaryLogicalOperator : NOT ;

comparisonOperator :
    EQUAL
  | N_EQUAL
  | GT_EQUAL
  | LT_EQUAL
  | GT
  | LT
  ;

openRoundBracket: OPEN_ROUND_BRACKET;
closedRoundBracket: CLOSED_ROUND_BRACKET;

expression :
  // () to avoid mutually left exclusive
    unaryLogicalOperator* openRoundBracket expression closedRoundBracket
  |  expression (comparisonOperator|binaryLogicalOperator) expression
  | ID
  | NUMBER
  | BOOL
  ;

numberOrIdPartial : (NUMBER | ID) ;

conditionalExpression : expression ;

printArg: STRING | numberOrIdPartial ;
printVariadic : BASIC_SEPARATOR printArg ;

declare		: DECLARE ID ;
define    : VARIABLE ID ASSIGN numberOrIdPartial ;
assign    : ID ASSIGN numberOrIdPartial ;
input     : INPUT ID ;
print     : PRINT printArg printVariadic*;
add       : ADD numberOrIdPartial TO ID ;
sub       : SUB numberOrIdPartial TO ID ;
mul       : MUL numberOrIdPartial TO ID ;
div       : DIV numberOrIdPartial TO ID ;

doPartialStatement : DO ;

conditionalPartialStatement : doPartialStatement statement+ ;
conditionalBodyPartial : conditionalExpression conditionalPartialStatement ;

whileStatement : WHILE conditionalBodyPartial END ;

elseIfPartialStatement : ELIF conditionalBodyPartial ;
elsePartialStatement : ELSE conditionalPartialStatement ;

ifStatement : IF conditionalBodyPartial elseIfPartialStatement* elsePartialStatement? END ;

rangeIncrementPartial : BASIC_SEPARATOR NUMBER;
range : numberOrIdPartial RANGE numberOrIdPartial rangeIncrementPartial?;

forDeclaration : FOR ID ASSIGN ;
forRangeStatement : forDeclaration range conditionalPartialStatement END ;
