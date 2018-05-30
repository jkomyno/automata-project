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

setup:
	source ../setup.sh

examples:
	./translate ./examples/example.swl | $(CXX) -o ./examples/example -xc++ - && \
	./translate ./examples/fibonacci.swl | $(CXX) -o ./examples/fibonacci -xc++ - && \
  ./translate ./examples/christmasTree.swl | $(CXX) -o ./examples/christmasTree -xc++ -

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
	rm -f $(ANTLRS) examples/example examples/fibonacci

cleanall: clean distclean
