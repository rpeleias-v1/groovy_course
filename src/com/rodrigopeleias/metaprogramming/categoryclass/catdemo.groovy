package com.rodrigopeleias.metaprogramming.categoryclass

//String.metaClass.shout = { -> toUpperCase() }

//println "Hello, World!".shout()

// usage of a Category class
// it is valid only inside the use block!!
use(StringCategory) {
    println "Hello, World!".shout()
}