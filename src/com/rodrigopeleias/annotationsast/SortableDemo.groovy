package com.rodrigopeleias.annotationsast

import groovy.transform.Sortable
import groovy.transform.ToString
import javafx.util.converter.PercentageStringConverter

@Sortable
@ToString
class Person {
    String first
    String last
}

def p1 = new Person(first: "Rodrigo", last: "Peleias")
def p2 = new Person(first: "Denise", last: "Gasques")

def people = [p1, p2]
println people

def sorted = people.sort(false)
println sorted