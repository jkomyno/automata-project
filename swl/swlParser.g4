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
          
statement : define | assign | add | sub | mul | div | print | input | whileStatement | ifStatement ;

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

conditionalExpression : expression ;

define    : VARIABLE ID ASSIGN (NUMBER | ID) ;
assign    : ID ASSIGN (NUMBER | ID) ;
input     : INPUT ID ;
print     : PRINT (NUMBER | ID | STRING) ;
add       : ADD (NUMBER | ID) TO ID ;
sub       : SUB (NUMBER | ID) TO ID ;
mul       : MUL (NUMBER | ID) TO ID ;
div       : DIV (NUMBER | ID) TO ID ;

doPartialStatement : DO ;

conditionalPartialStatement : doPartialStatement statement+ ;
conditionalBodyPartial : conditionalExpression conditionalPartialStatement ;

whileStatement : WHILE conditionalBodyPartial END ;

elseIfPartialStatement : ELIF conditionalBodyPartial ;
elsePartialStatement : ELSE conditionalPartialStatement ;

ifStatement : IF conditionalBodyPartial elseIfPartialStatement* elsePartialStatement? END ;