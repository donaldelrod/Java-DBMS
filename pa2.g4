/**
 * Define a grammar called pa2
 */

////////////////////////Parser Rules/////////////////////////
grammar pa2;

attributeList
	: ATTRIBUTENAME+;
	
condition
	: conjunction+ ;
	
conjunction
	: comparison+ ;
comparison
	: OPERAND OPERATION OPERAND ;//| (condition);
	
selection
	: SELECT (condition) atomicExpr ;
	
projection
	: PROJECT (attributeList) atomicExpr ;

atomicExpr
	: RELATIONNAME ;// | (expr) ;
	
renaming
	: RENAME (attributeList) atomicExpr ;

expr
	: atomicExpr | selection | projection | renaming | union | difference | product ;
	
union 
	: atomicExpr PLUS atomicExpr ;

difference
	: atomicExpr MINUS atomicExpr ;
	
product 
	:  atomicExpr PRODUCT atomicExpr ;
	
integer
	: DIGIT+ ;
	
query
	: RELATIONNAME LARROW expr ;
	
openCMD
	: OPEN RELATIONNAME ;
	
closeCMD
	: CLOSE RELATIONNAME ;

writeCMD
	: WRITE RELATIONNAME ;
	
exitCMD
	: EXIT ;
	
showCMD
	: SHOW atomicExpr ;
	
createCMD
	: CREATE TABLE RELATIONNAME LPAR TYPEDATTRIBUTELIST RPAR PRIMARY KEY LPAR attributeList RPAR;
	
updateCMD
	: UPDATE RELATIONNAME SET (ATTRIBUTENAME EQUAL LITERAL)+ WHERE condition ;
	
insertCMD
	: INSERT INTO RELATIONNAME VALUES FROM LPAR LITERAL+ RPAR | INSERT INTO RELATIONNAME VALUES FROM RELATION expr ;
	
deleteCMD
	: DELETE FROM RELATIONNAME WHERE condition ;
	
command
	: openCMD | closeCMD | writeCMD | showCMD | exitCMD | createCMD | updateCMD | insertCMD | deleteCMD ;
	
program
	: (query | command)* ;


///////////////////////Lexer Rules///////////////////////////
//skip spaces, tabs, newlines
WS 
	: [ \t\r\n]+ -> skip ; 


fragment OPERAND
	: ATTRIBUTENAME | LITERAL ;

//alphabet
fragment ALPHA
	: ('a' .. 'z') | ('A' .. 'Z') | '_' ;

//numbers
fragment DIGIT
	: ('0' .. '9') ;

fragment IDENTIFIER 
	: ALPHA | (ALPHA | DIGIT)* ;


fragment OPERATION
	: '==' | '!=' | '>' | '<' | '<=' | '>=';



fragment ATTRIBUTENAME
	: IDENTIFIER ;
	
fragment RELATIONNAME
	: IDENTIFIER ;

fragment LITERAL 
	: DIGIT;

SELECT 
	: 'select' ;

PROJECT
	: 'project' ;
	
RENAME
	: 'rename' ;

PLUS
	: '+' ;

MINUS
	: '-' ;

PRODUCT
	: '*' ;
	
EQUAL
	: '=' ;

LARROW
	: '<-' ;
	
OPEN
	: 'OPEN' ;

CLOSE
	: 'CLOSE' ;

WRITE
	: 'WRITE' ;

EXIT
	: 'EXIT' ;
	
SHOW
	: 'SHOW' ;

CREATE
	: 'CREATE' ;

TABLE
	: 'TABLE' ;

PRIMARY
	: 'PRIMARY' ;

FOREIGN
	: 'FOREIGN' ;

KEY
	: 'KEY' ;

UPDATE
	: 'UPDATE' ;

SET
	: 'SET' ;

WHERE
	: 'WHERE' ;

VARCHAR
	: 'VARCHAR' ;

INTEGER
	: 'INTEGER' ;

CHAR
	: 'CHAR' ;
	
DATE
	: 'DATE' ;
	
TIME
	: 'TIME' ;
	
LPAR
	: '(' ;
	
RPAR
	: ')' ;
	
TYPE
	: VARCHAR LPAR DIGIT+ RPAR | INTEGER | DATE | TIME | CHAR LPAR DIGIT+ RPAR ;
	
fragment TYPEDATTRIBUTE
	: ATTRIBUTENAME TYPE ;
	
TYPEDATTRIBUTELIST
	: TYPEDATTRIBUTE+ ;
	
RELATION
	: 'RELATION' ;
	
INSERT
	: 'INSERT' ;

INTO
	: 'INTO' ;

DELETE
	: 'DELETE' ;
	
VALUES
	: ' VALUES' ;

FROM
	: 'FROM' ;