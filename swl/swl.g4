grammar swl;

/********** TERMINALS *********/

BEGIN: 'begin';
END: 'end';
WHILE: 'while';
IF: 'if';
THEN: 'then';
ELSE: 'else';
ELIF: 'elif';
VARIABLE: 'let';
DEFINE: 'be';
TO: 'to';
DO: 'do';

// math operators
ADD: 'add'; // +
SUB: 'sub'; // +
MUL: 'mul'; // *
DIV: 'div'; // /

// comparisons
EQUAL: 'is'; // ==
N_EQUAL: 'not'; // !=
GT_EQUAL: 'gte'; // >=
LT_EQUAL: 'lte'; // <=
GT: 'gt'; // >
LT: 'lt'; // <

// logical operators
AND: 'and';
OR: 'or';
NOT: 'not';

BOOL : 'true' | 'false';
ID        : [a-z]+ ;
NUMBER    : [0-9]+ ;
WS        : [ \n\t]+ -> skip;
ErrorChar : . ;

/********* PARSER *********/

program   : BEGIN statement+ END;
          
statement : assign | add | sub | mul | div | print | input | whileStatement /*| ifStatement*/ ;

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

expression :
    // () to avoid mutually left exclusive
    '(' unaryLogicalOperator* expression ')'
  |  expression (comparisonOperator|binaryLogicalOperator) expression
  | ID
  | NUMBER
  | BOOL
  ;

assign    : VARIABLE ID DEFINE (NUMBER | ID) ;
input     : 'input' ID ;
print     : 'print' (NUMBER | ID) ;
add       : ADD (NUMBER | ID) TO ID ;
sub       : SUB (NUMBER | ID) TO ID ;
mul       : MUL (NUMBER | ID) TO ID ;
div       : DIV (NUMBER | ID) TO ID ;

doPartialStatement : DO ;

whileStatement : WHILE expression doPartialStatement statement+ END ;