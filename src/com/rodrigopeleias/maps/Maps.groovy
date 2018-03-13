package com.rodrigopeleias.maps

def map = [:]
println map
println map.getClass().getName()

def person = [first:"Rodrigo", last: "Peleias", email: "rodrigo.peleias@gail.com"]
println person
println person.first
println person.last
println person.email

person.instagram = "@rpeleias"
println person.instagram

def emailKey = "EmailAddress"
def instagram = [username: '@rpeleias', (emailKey): "rodrigo.peleias@gmail.com"]
println instagram

println person.size()
println person.sort()

// looping through person
for (entry in person) {
    println entry
}

// looping through keys in map
for (key in person.keySet()) {
    println "$key: ${person[key]}"
}

// each | eachWithIndex - in closures section