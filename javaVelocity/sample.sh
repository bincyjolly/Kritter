#!/bin/sh

CLASSPATH=

for f in target/*.jar; do
    CLASSPATH=${CLASSPATH}:$f;
done

for f in target/lib/*.jar; do
    CLASSPATH=${CLASSPATH}:$f;
done


MAIN_CLASS=com.kritter.Student

echo "java  -cp '$CLASSPATH' $MAIN_CLASS" 
eval "java  -cp '$CLASSPATH' $MAIN_CLASS" 
