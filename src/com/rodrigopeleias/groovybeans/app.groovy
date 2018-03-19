package com.rodrigopeleias.groovybeans

Employee emp = new Employee(first: "Rodrigo", last: "Rodrigo Peleias", email: "rodrigo.peleias@gmail.com")

println emp

Employee emp2 = new Employee()
emp.first = "Rodrigo"
emp.last = "Peleias"
emp.email = "rodrigo.peleias@gmail.com"

println emp.email

DoubleBean db = new DoubleBean()
db.value = 100

println db.value
println db.@value