JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
CLASSDIR = assignment2
LIBS = ../libs/junit-4.13.jar:../libs/hamcrest-core-1.3.jar

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
   Driver.java \
   Game.java \
   GameConfiguration.java \
   GuessHistory.java \
   GuessVerification.java \
   Response.java \
   SecretCodeGenerator.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm -rf $(CLASSDIR)
	
run:
	javac -d "." -classpath $(LIBS):$(CLASSDIR) $(CLASSES)
	java $(CLASSDIR).Driver
	
format: 
	astyle *.java
	$(RM) *.orig
test: 
	javac -d "." -classpath $(LIBS):$(CLASSDIR) $(CLASSES)
	java -classpath $(LIBS):. org.junit.runner.JUnitCore $(CLASSDIR).SampleTest
