package com.rodrigopeleias.transformations.sortable

SortablePerson p1 = new SortablePerson("Rodrigo", "Peleias")
SortablePerson p2 = new SortablePerson("Fabiola", "Peleias")
SortablePerson p3 = new SortablePerson("Pandora", "Peleias")
SortablePerson p4 = new SortablePerson("Ivam", "Peleias")
SortablePerson p5 = new SortablePerson("Cristina", "Peleias")
SortablePerson p6 = new SortablePerson("Denise", "Gasques")

def peleias = [p1,p2,p3,p4,p5,p6]

println peleias.toSorted()