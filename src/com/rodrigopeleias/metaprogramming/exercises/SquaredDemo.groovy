package com.rodrigopeleias.metaprogramming.exercises

// with metaClass, we can Modify all classes that want, including classe slike Wrappers
// but take care, BIG POWERS, BIG RESPONSIBILITIES! :)
Integer.metaClass.timesTwo = { delegate * 2 }

println 2.timesTwo()
println 4.timesTwo()
println 5.timesTwo()
println 10.timesTwo()