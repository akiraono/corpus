#!/bin/bash
mvn package
#java -jar target/corpus-jar-with-dependencies.jar --input KOGI20150530.txt --validate --display_invalid_only
java -jar target/corpus-jar-with-dependencies.jar --input KOGI20150530.txt --validate 
