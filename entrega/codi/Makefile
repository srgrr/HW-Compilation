TARGET =	hw_compilation

ROOT = $(PWD)
SRCDIR = $(ROOT)/src
LIBDIR = $(ROOT)/libs
CLASSDIR = $(ROOT)/classes
MAIN = $(SRCDIR)/classes
PARSER = $(SRCDIR)/parser
SEMANTICS = $(SRCDIR)/semantics
TRANSLATION = $(SRCDIR)/translator
# Directories
ROOT =		$(PWD)
SRCDIR = 	$(ROOT)/src
LIBDIR =	$(ROOT)/libs
CLASSDIR = 	$(ROOT)/classes
MAIN =		$(SRCDIR)/$(TARGET)
PARSER =	$(SRCDIR)/parser
INTERP =	$(SRCDIR)/interp
JAVADOC =	$(ROOT)/javadoc
BIN =		$(ROOT)/bin

# Executable
EXEC = 		$(BIN)/$(TARGET)
JARFILE =	$(BIN)/$(TARGET).jar
MANIFEST=	$(BIN)/$(TARGET)_Manifest.txt

# Libraries and Classpath
LIB_ANTLR =	$(LIBDIR)/antlr-3.4-complete.jar
LIB_CLI =	$(LIBDIR)/commons-cli-1.2.jar
CLASSPATH=	$(LIB_ANTLR):$(LIB_CLI)
JARPATH=	"$(LIB_ANTLR) $(LIB_CLI)"


# Distribution (tar) file
DATE= 		$(shell date +"%d%b%y")
DISTRIB=	$(TARGET)_$(DATE).tgz

# Classpath


# Flags
JFLAGS =	-classpath $(CLASSPATH) -d $(CLASSDIR) -encoding ISO-8859-1
DOCFLAGS =	-classpath $(CLASSPATH) -d $(JAVADOC) -private

# Source files
GRAMMAR = 		$(PARSER)/$(TARGET).g

MAIN_SRC =		$(MAIN)/$(TARGET).java

PARSER_SRC =	$(PARSER)/$(TARGET)Lexer.java \
				$(PARSER)/$(TARGET)Parser.java

SEMANTICS_SRC = $(SEMANTICS)/TreeTraverser.java \
				$(SEMANTICS)/HWCompilationTree.java \
				$(SEMANTICS)/HWCompilationTreeAdaptor.java

TRANSLATION_SRC = $(TRANSLATION)/Translator.java


ALL_SRC = $(MAIN_SRC) $(PARSER_SRC) $(SEMANTICS_SRC) $(TRANSLATION_SRC)

TEST_PARSER_SRC = 	tests/prova_sintaxi/prova_sintaxi.java \
				  	$(PARSER_SRC)

TEST_PARSER_EXEC = $(BIN)/prova_sintaxi
TEST_PARSER_JARFILE = $(BIN)/prova_sintaxi.jar
TEST_PARSER_MANIFEST = $(BIN)/prova_sintaxi_Manifest.txt
TEST_PARSER_JARPATH  = $(LIB_ANTLR)

TEST_GRAPH_SRC = tests/prova_graf/prova_graf.java \
				 $(PARSER_SRC) \
				 $(SEMANTICS_SRC)

TEST_GRAPH_EXEC = $(BIN)/prova_graf
TEST_GRAPH_JARFILE = $(BIN)/prova_graf.jar
TEST_GRAPH_MANIFEST = $(BIN)/prova_graf_Manifest.txt
TEST_GRAPH_JARPATH  = $(LIB_ANTLR)


all: compile exec

test_syntax: compile_test_syntax exec_test_syntax

test_graph: compile_test_graph exec_test_graph

compile_test_syntax:
	java -jar $(LIB_ANTLR) -o $(PARSER) $(GRAMMAR)
	if [ ! -e $(CLASSDIR) ]; then\
	  mkdir $(CLASSDIR);\
	fi
	javac $(JFLAGS) $(TEST_PARSER_SRC)

exec_test_syntax:
	if [ ! -e $(BIN) ]; then\
	  mkdir $(BIN);\
	fi
	echo "Main-Class: prova_sintaxi.prova_sintaxi" > $(TEST_PARSER_MANIFEST)
	echo "Class-Path: $(TEST_PARSER_JARPATH)" >> $(TEST_PARSER_MANIFEST)
	cd $(CLASSDIR); jar -cmf $(TEST_PARSER_MANIFEST) $(TEST_PARSER_JARFILE) *
	printf "#!/bin/sh\n\n" > $(TEST_PARSER_EXEC)
	printf 'exec java -enableassertions -jar $(TEST_PARSER_JARFILE) "$$@"' >> $(TEST_PARSER_EXEC)
	chmod a+x $(TEST_PARSER_EXEC)

compile_test_graph:
	java -jar $(LIB_ANTLR) -o $(PARSER) $(GRAMMAR)
	if [ ! -e $(CLASSDIR) ]; then\
	  mkdir $(CLASSDIR);\
	fi
	javac $(JFLAGS) $(TEST_GRAPH_SRC)

exec_test_graph:
	if [ ! -e $(BIN) ]; then\
	  mkdir $(BIN);\
	fi
	echo "Main-Class: prova_graf.prova_graf" > $(TEST_GRAPH_MANIFEST)
	echo "Class-Path: $(TEST_GRAPH_JARPATH)" >> $(TEST_GRAPH_MANIFEST)
	cd $(CLASSDIR); jar -cmf $(TEST_GRAPH_MANIFEST) $(TEST_GRAPH_JARFILE) *
	printf "#!/bin/sh\n\n" > $(TEST_GRAPH_EXEC)
	printf 'exec java -enableassertions -jar $(TEST_GRAPH_JARFILE) "$$@"' >> $(TEST_GRAPH_EXEC)
	chmod a+x $(TEST_GRAPH_EXEC)



compile:
	java -jar $(LIB_ANTLR) -o $(PARSER) $(GRAMMAR)
	if [ ! -e $(CLASSDIR) ]; then\
	  mkdir $(CLASSDIR);\
	fi
	javac $(JFLAGS) $(ALL_SRC)

exec:
	if [ ! -e $(BIN) ]; then\
	  mkdir $(BIN);\
	fi
	echo "Main-Class: hw_compilation.hw_compilation" > $(MANIFEST)
	echo "Class-Path: $(JARPATH)" >> $(MANIFEST)
	cd $(CLASSDIR); jar -cmf $(MANIFEST) $(JARFILE) *
	printf "#!/bin/sh\n\n" > $(TEST_PARSER_EXEC)
	printf 'exec java -enableassertions -jar $(JARFILE) "$$@"' >> $(EXEC)
	chmod a+x $(EXEC)
