package com.rodrigopeleias.metaprogramming.exercises

ExerciseDeveloper developer = new ExerciseDeveloper(first: "Rodrigo", last: "Peleias", email: "rodrigo.peleias@gmail.com")
developer.writeCode("Groovy") // invokeMethod called
println developer.first // getProperty called
developer.languages = ["Groovy", "Java"] // setProperty called