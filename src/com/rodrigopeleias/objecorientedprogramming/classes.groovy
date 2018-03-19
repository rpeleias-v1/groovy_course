package com.rodrigopeleias.objecorientedprogramming

class Person { // by default, every class is Groovy are public

    // by default, properties are private
    // getter and setter are implicity declared inside the class
    String firstName, lastName

    def dob

    // private | protected | public
    protected String f1, f2, f3
    private Date createdOn = new Date()

    static welcomeMsg = 'HELLO'
    public static final String WELCOME_MSG = welcomeMsg

    // local variables
    def foo() {
        String msg = "Hello"
        String firstName = "Rodrigo"
        println "$msg, $firstName"
    }

}

println Person.welcomeMsg
println Person.WELCOME_MSG

def person = new Person()
println person.foo()

