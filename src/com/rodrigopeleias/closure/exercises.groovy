package com.rodrigopeleias.closure

def myMethod(Closure c) {
    c()
}

def foo = {
    println "foo..."
}

myMethod(foo)

List names = ["Rodrigo", "Denise", "Fabiola", "Pandora"]
names.each { name ->
    println name
}

Map teams = [baseball:"Cleveland Indians", basketball:"Cleveland Cavs", soccer: "Corinthians"]
teams.each { k, v ->
    println "$k = $v"
}

def greet = { String greeting, String name ->
    println "$greeting, $name"
}

greet("Hello", "Rodrigo")
def sayHello = greet.curry("Hello")
sayHello("Denise")

