package com.rodrigopeleias.strings

// Java ::

char c = 'c'
println c.class

String str = "this is a string"
println str.class

// Groovy - everything, implicitly, is a String

def c2 = 'c'
println c2.class

def str2 = 'this is a string'
println str.class

// string interpolation


// in java
String name = "Rodrigo"
String msg = "Hello "+ name + "..."
println msg

// in groovy - interpolation
String msg2 = "Hello ${name}"
println msg

// in groovy - in single quote, interpolation not works
String msg3 = 'Hello, ${name} '
println msg3

// expression evaluation with interpolation
String msg4 = "We can evaluate expressions here: ${1 + 1}"
println msg4

// multiline strings
def aLargeMsg = '''
I am 
Rodrigo Peleias,
A Software Engineer'''

println aLargeMsg

// dollar slashy
// helpful do escape bars
def folder = $/C:\ groovy\rodrigo\foo\bar/$
println folder

