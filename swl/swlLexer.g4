lexer grammar swlLexer;

channels { COMMENTS }

/********** TERMINALS *********/

BEGIN: 'begin';
END: 'end';
INPUT: 'input';
PRINT: 'print';
WHILE: 'while';
IF: 'if';
THEN: 'then';
ELSE: 'else';
ELIF: 'elif';
FOR: 'for';
VARIABLE: 'let';
ASSIGN: 'be';
TO: 'to';
DO: 'do';
BASIC_SEPARATOR: ',';

// comparisons
EQUAL: 'eq'; // ==
N_EQUAL: 'neq'; // !=
GT_EQUAL: 'gte'; // >=
LT_EQUAL: 'lte'; // <=
GT: 'gt'; // >
LT: 'lt'; // <

// logical operators
AND: 'and';
OR: 'or';
NOT: 'not';

// math operators
ADD: 'add'; // +
SUB: 'sub'; // +
MUL: 'mul'; // *
DIV: 'div'; // /

// conditional operators
RANGE: '..';

// parenthesis
OPEN_ROUND_BRACKET: '(';
CLOSED_ROUND_BRACKET: ')';

// literals
STRING : '"' (STR_ESCAPE | ~('\\'|'"'))* '"' ;
BOOL : 'true' | 'false' ;

ID        : [a-z]+ ;
NUMBER    : [0-9]+ ;
WS        : [ \n\r\t]+ -> skip;
ErrorChar : . ;

SINGLE_LINE_COMMENT : '#' .*? '\n' -> channel(COMMENTS) ;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> channel(COMMENTS) ;

fragment STR_ESCAPE : '\\' '\r'? '\n' ;