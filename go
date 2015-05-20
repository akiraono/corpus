#!/bin/bash
mvn package
java -jar target/corpus-jar-with-dependencies.jar --input test1.txt
