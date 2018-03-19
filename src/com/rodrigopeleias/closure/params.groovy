package com.rodrigopeleias.closure

// implicit parameter - it is the implicit parameter
def foo = {
    println it
}

foo('Rodrigo')

def noParams = { ->
    println "No params..."
}

noParams()

def sayHello = { first, last ->
    println "Hello, $first $last"
}

sayHello("Rodrigo", "Peleias")

// default values
def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}

greet("Rodrigo", "Hello")
greet("Rodrigo")

// var-arg
def concat = { String... args ->
    args.join('')
}

println concat('abc', 'def')
println concat('abc', 'def', '123', '456')

def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x + y }

someMethod(someClosure)