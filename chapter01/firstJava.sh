#!/bin/bash

# firstJava.sh
# This script will create a new Java source file named 'firstJava.java',
# fill it with the typical "Hello World" code, compile the class, and run it.
#
# Author:   Michael K Schumacher
# Created:  27-10-2016
# Modified: 27-10-2016

touch FirstJava.java

code="public class FirstJava
{
    public static void main(String[] args)
    {
        System.out.println(\"Hello, World!\");
    }
}"

echo $code > FirstJava.java

javac FirstJava.java

java FirstJava
