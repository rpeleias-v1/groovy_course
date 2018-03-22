package com.rodrigopeleias.metaprogramming.exercises

Expando e = new Expando()

e.first = "Rodrigo"
e.last = "Peleias"
e.email = "rodrigo.peleias@gmail.com"

e.getFullName = {
    "$first $last"
}

println e.toString()
println e.getFullName()

@groovy.transform.ToString(includeNames = true)
class Person {
    String first, last
}

Person p = new Person(first: "Rodrigo", last: "Peleias")
p.metaClass.email = "rodrigo.peleias@gmail.com"
println p
println p.email