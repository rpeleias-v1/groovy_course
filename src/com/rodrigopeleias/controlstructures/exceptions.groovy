package com.rodrigopeleias.controlstructures

// Exceptions

// example in Java - Checked Exceptions throws must be declared in method's signature

public void foo() throws Exception{
    throw  new Exception()
}

// in groovy, Exception's declaration is not mandatory
def fooGroovy() {
    // do stuff
    throw new Exception("Foo Exception")
}

List log = []

try {
    fooGroovy()
} catch (Exception e) {
    log << e.message
} finally {
    log << 'finally'
}

println log

// Java 7 introduces a multi catch syntax
try {
    // do stuff
} catch ( FileNotFoundException | NullPointerException e) {
    println e.class.name
    println e.message
}