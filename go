#!/bin/bash
mvn package
java -jar target/corpus-jar-with-dependencies.jar --input SUGU0001.txt --validate
