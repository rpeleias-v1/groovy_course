package com.rodrigopeleias.builders.exercises

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()

builder.books {
    book(isbn: '1234-5678-91011') {
        title("Groovy in Action 2nd Edition")
        author("Dierk Koeing")
        price("50.58")
    }
    book(isbn: '1234-5678-91011') {
        title("Making Java Groovy")
        author("Ken Kousen")
        price("33.96")
    }
}