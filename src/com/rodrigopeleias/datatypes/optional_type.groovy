package com.rodrigopeleias.datatypes

//groovy will decide which type is declared variable and value
def x = 10
println x.getClass().getName()

x = "Rodrigo"
println x.getClass().getName()

// explicit convertions - casting

def myFloat =(float) 1.0
println myFloat.class

// GDK methods

assert 2 == 2.5.toInteger()
assert 2 == 2.5 as Integer
assert 2 == (int) 2.5 // cast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()

20.times {
    print '-'
}

1.upto(10) { num ->
     println num
}

10.downto(1) { num ->
    println num
}

0.step(1,0.1) { num ->
    println num
}