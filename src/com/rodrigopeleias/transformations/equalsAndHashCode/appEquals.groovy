package com.rodrigopeleias.transformations.equalsAndHashCode

EqualsPerson p1 = new EqualsPerson(first: "Rodrigo", last: "Peleias", email: "rodrigo.peleias@gmail.com")
EqualsPerson p2 = new EqualsPerson(first: "Rodrigo", last: "Peleias", email: "rodrigo.peleias@hotmail.com")

assert p1 == p2