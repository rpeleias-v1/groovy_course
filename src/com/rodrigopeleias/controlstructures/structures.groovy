package com.rodrigopeleias.controlstructures

// if
if (true) {
    println "value is true"
}

// false | null | empty string | empty collections

if (false) {
    println "value is false"
}

String name = null
if (name) {
    println "name has a value"
}


String nonNullName = "Rodrigo Peleias"
if (nonNullName) {
    println "name has a value"
}

String emptyString = ""
if (emptyString.empty) {
    println "Empty name"
}

// if/else
def x = 5
if (x == 10) {
    println "x is 10"
} else {
    println "x is NOT 10"
}

// classic while
def i = 1
while( i <= 10 ) {
    println i
    i++
}

// for in list
def list = [1,2,3,4]
for ( num in list) {
    println num
}

// closure
def list2 = [1,2,3,4]
list2.each { println it }

// switch
def myNumber = 10

switch (myNumber) {
    case 1:
        println "number is 1"
        break
    case 2:
        println "number is 2"
        break
    default:
        println "we hit the default case"
}
