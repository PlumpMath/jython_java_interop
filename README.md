# Python-Java Interop Example

## Overview

Example from 
[Jython Book v1.0, Chapter 10: Jython and Java Integration](http://www.jython.org/jythonbook/en/1.0/JythonAndJavaIntegration.html).  
The example is from the section *More Efficient Version of Loosely Coupled Object
Factory*, and shows a Python class implementing a Java interface.  That Python
class is then instantiated in Java and several of its methods are called.

## Prerequisites

You will need Maven 3.x installed.  On OS X with Homebrew, this can be installed 
with:

```
brew install maven
```

You will likely also need to add the following environment variable to your `.bash_profile`:

```
export MAVEN_HOME=/usr/local/Cellar/maven/3.2.X
```

replacing `X` with the proper version number.

## Building

Build the Jar with Maven:

```
mvn package
```

This will produce the file
`target/jython_java_integration-1.0.0-SNAPSHOT-jar-with-dependencies.jar`,
which is an executable, "fat" Jar with all dependencies (including Jython)
within it.

## Running

Since the Jar is executable, simply run it with Java:

```
java -jar target/jython_java_integration-1.0.0-SNAPSHOT-jar-with-dependencies.jar
```
