package com.rodrigopeleias.objecorientedprogramming

@groovy.transform.ToString
class PersonM {

    String first, last

    // constructor
    PersonM(String fullName){
        List parts = fullName.split(' ')
        this.first = parts[0]
        this.last = parts[1]
    }

    public void foo(String a, String b) {
        // do stuff
    }

    String getFullName() {
        "$first $last"
    }

    def bar() {

    }

    static String doGoodWork() {
        println "Doing good work..."
    }

    List someMethod(List numbers = [1,2,3], Boolean canAccessAll = false) {

    }

    def concat(String... args) {
        println args.length
    }
}

//PersonM p = new PersonM(first: "Rodrigo", last: "Peleias")
//println p

//PersonM const = new PersonM("Rodrigo Peleias")
//println const
println PersonM.doGoodWork()

PersonM p = new PersonM("Rodrigo Peleias")
p.concat("a", "b", 'c', 'd')