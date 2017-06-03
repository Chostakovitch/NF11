grammar Logo; 

@header {
  package logoparsing;
}

INT : '0' | [1-9][0-9]*;
NOM : [a-z]+;
WS : [ \t\r\n]+ -> skip ;


programme : 
(declaration)*
liste_instructions 
;
liste_instructions :
  (instruction)+   
;

declaration :
	'pour' NOM (':'NOM)* liste_instructions ('rends' exp)? 'fin'
;

instruction :
    'av' exp 								# av
  | 'td' exp 								# td
  | 'tg' exp								# tg
  | 'lc' 									# leve 
  | 'bc' 									# pose
  | 've' 									# clear
  | 're' exp 								# recule
  | 'fcc' exp 								# couleur
  | 'fpos' exp exp							# position
  | 'repete' exp '[' liste_instructions ']' # repete
  | 'donne' '"'NOM exp						# donne
  | 'si' expbool '[' liste_instructions ']' ('[' liste_instructions ']')? # si
  | 'tantque' expbool '[' liste_instructions ']' #tantque
  | NOM exp*								# appelprocedure
;  

exp:
	':'NOM									# var
  | 'hasard' exp							# hasard
  | exp ('*' | '/') exp 					# mul
  | exp ('+' | '-') exp 					# sum
  | INT										# int
  | 'loop'									# loop
  | '(' exp ')'								# parenthese
  | NOM '(' exp* ')'						# appelfonction
;

expbool:
	exp ('<' | '>' | '>=' |'<=' | '=' | '!=') exp	# cond
  | expbool 'ET' expbool							# et
  | expbool 'OU' expbool							# ou
;