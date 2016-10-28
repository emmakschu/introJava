#!/bin/bash

# firstJava.sh
# This script will create a new Java source file named 'firstJava.java',
# fill it with the typical "Hello World" code, compile the class, and run it.
#
# Author:   Michael K Schumacher
# Created:  27-10-2016
# Modified: 27-10-2016

# Create the file, if it doesn't already exist
touch FirstJava.java

# Write the code to a variable for simplicity
code="public class FirstJava
{
    public static void main(String[] args)
    {
        System.out.println(\"Hello, World!\");
    }
}"

# Push the code to overwrite FirstJava.java
echo $code > FirstJava.java

# Compile the program with the javac command
javac FirstJava.java

# Run the program with the java command
java FirstJava
