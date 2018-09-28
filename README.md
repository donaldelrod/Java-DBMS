# Programming Assignment 2 - Parser

The parser included in this zip will run as is, as it has already been compiled. If you wish to recompile it, use the following commands when in the root directory of the folder

//compiles the grammar
antlr4 pa2.g4 

//compiles the java program, including the main.java file
javac -cp "antlr-4.7.1-complete.jar" *.java 

//runs the program with input being redirected from commands.txt and output being redirected to output.txt
java -cp . main < commands.txt > output.txt

//to test specific grammar, use this with <grammar_rule> replaced with whatever rule you want to test
grun pa2 <grammar_rule> -tree

## Link to Development Log

https://github.tamu.edu/delrod19/315-P2-GiveUsA100/wiki/Development-Log