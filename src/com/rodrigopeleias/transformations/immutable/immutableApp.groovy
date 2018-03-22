package com.rodrigopeleias.transformations.immutable

ImmutablePerson p = new ImmutablePerson(first: "Rodrigo", last: "Peleias")
println p.toString()

p.first = "Pandora"