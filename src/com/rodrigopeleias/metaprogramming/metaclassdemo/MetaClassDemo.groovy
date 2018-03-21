package com.rodrigopeleias.metaprogramming.metaclassdemo

//// Expando is very insteresting in Groovy
//Expando e = new Expando()
//e.name = 'Rodrigo'
//e.writeCode = { -> println "$name loves to write code..."}
//e.writeCode()

class Developer {

}

// per instance
// TAKE CARE WITH metaClass
Developer rodrigo = new Developer()
rodrigo.metaClass.name = 'Rodrigo'
rodrigo.metaClass.writeCode { -> println "$name loves to write code..."}
rodrigo.writeCode()

String.metaClass.shout = { -> toUpperCase() }
println "Rodrigo".shout()