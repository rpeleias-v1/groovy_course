package com.rodrigopeleias.transformations.canonical

CanonicalPerson p1 = new CanonicalPerson("Rodrigo", "Peleias", "rpeleias@hotmail.com")
CanonicalPerson p2 = new CanonicalPerson("Rodrigo", "Peleias", "rpeleias@hotmail.com")

assert p1 == p2
println p1.toString()