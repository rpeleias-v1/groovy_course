package com.rodrigopeleias.metaprogramming

class MyEmployee {

    // catch all method called taht is not declared in the class
    def methodMissing(String name, def args) {

        if (name != 'someMethod') {
            throw new MissingMethodException()
        }
        println "Method Missing called on: $name"
        println "with arguments ${args}"
    }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1,2,3)
emp.someOtherMethod(1,2,3)