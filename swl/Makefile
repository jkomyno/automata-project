SHELL := /bin/bash
CXX=g++
CXXFLAGS=-std=c++11 -I $(HOME)/antlr4/include
LDFLAGS=-lantlr4-runtime -L $(HOME)/antlr4/lib
DEPS=swlLexer.h swlParser.h
TDEPS=swlParserBaseListener.h MyListener.h
OBJS=swlParser.o swlLexer.o
SCOBJS=syncheck.o
TOBJS=translate.o MyListener.o
ANTLRS=swlParserBaseListener.h \
        swlLexer.cpp \
        swlLexer.tokens \
        swlParser.cpp \
        swlLexer.h \
        swlParserListener.cpp \
        swlParser.h \
        swlParserBaseListener.cpp \
        swl.interp \
        swlLexer.interp \
        swlParserListener.h \
        swl.tokens
GRAMMAR_LEXER=swlLexer.g4
GRAMMAR_PARSER=swlParser.g4

.PHONY: examples

all: | cleanall grammar syncheck translate

example:
	./translate ./examples/example.swl | tee >($(CXX) -o ./examples/example -xc++ -)

fibonacci:
	./translate ./examples/fibonacci.swl | tee >($(CXX) -o ./examples/fibonacci -xc++ -)

tree:
	./translate ./examples/christmasTree.swl | tee >($(CXX) -o ./examples/christmasTree -xc++ -)

setup:
	source ../setup.sh

examples: example fibonacci tree

grammar:
	antlr4 -Dlanguage=Cpp $(GRAMMAR_LEXER) $(GRAMMAR_PARSER)

syncheck: $(SCOBJS) $(OBJS) $(DEPS)
	$(CXX) -o syncheck $(SCOBJS) $(OBJS) $(LDFLAGS)

translate: $(TOBJS) $(OBJS) $(TDEPS) $(DEPS) 
	$(CXX) -o translate $(TOBJS) $(OBJS) $(LDFLAGS)	

%.o: %.c $(DEPS)
	$(CXX) -c -o $@ $< $(CXXFLAGS)
	
clean:
	rm -f $(OBJS) $(TOBJS) $(SCOBJS) *.interp *.tokens syncheck translate

distclean:
	rm -f $(ANTLRS) examples/example examples/fibonacci examples/christmasTree

cleanall: clean distclean
