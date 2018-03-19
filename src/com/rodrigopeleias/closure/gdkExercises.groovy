package com.rodrigopeleias.closure

List people = [
        [name: 'Jane', city: "New York City"],
        [name: 'John', city: "Cleveland"],
        [name: 'Mary', city: "New York City"],
        [name: 'Dan', city: "Cleveland"],
        [name: 'Tom', city: "New York City"],
        [name: 'Frank', city: "Cleveland"],
        [name: 'Jason', city: "New York City"]
]

// find | findAll
println people.find { person -> person.city == "Cleveland" }
println people.findAll { person -> person.city == "Cleveland" }

// any | every
println people.any { person -> person.city == "Cleveland" }
println people.every { person -> person.city == "Cleveland" }
println people.every { person -> person.name.size() >= 3}

// groupBy
def peopleByCity = people.groupBy { person -> person.city }
println peopleByCity

def newYorkers = peopleByCity["New York City"]
def clevelanders = peopleByCity.Cleveland

clevelanders.each {
    println it
}

newYorkers.each { println it}