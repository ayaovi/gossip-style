BASE = ../gossip-style
BIN = bin
JUNIT = ../junit/junit-4.10.jar:../junit/hamcrest-core-2.2.jar
JAVAC = javac
JFLAGS = -d $(BIN) -sourcepath $(BIN):$(BASE) -cp $(BIN):$(JUNIT) -Xlint:deprecation

.SUFFIXES: .java .class

.java.class: 
	$(JAVAC) -d $(BIN) -sourcepath $(BIN):$(BASE) -cp $(BIN):$(JUNIT) -Xlint:deprecation test/ChannelTests.java

CLASSES = \
	test/ChannelTests.java

default: classes

classes: $(CLASSES:.java=.class)

run: 
	java -cp $(BIN)/test:$(JUNIT) org.junit.runner.JUnitCore ChannelTests

clean: 
	$(RM) -rf $(BIN)/*
