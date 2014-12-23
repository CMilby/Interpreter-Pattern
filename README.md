Interpreter Pattern
=====
Implementation of the [Interpreter Pattern](http://en.wikipedia.org/wiki/Interpreter_pattern) outlined by the "Gang of Four"
Evaluation of Grammar
----
> expression ::= <command> | <sequence> | <repetition>  
> sequence ::= <expression> '\n' <expression>  
> command ::= <fly> | <swim> | <quack> | <left> | <right>  
> repetition ::= for <variable> <variable>.<command>  
> variable ::= [A-Z,a-z]+  

Use
----
The pattern was implemented as a compiler for an extremely basic language. The only data type is a Duck and it's constructor takes a String "name" as a paramter. From there basic "for" loops are supported as well as the command highlighted in the grammar evaluation section. 

