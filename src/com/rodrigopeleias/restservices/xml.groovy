package com.rodrigopeleias.restservices

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter("sports.xml")
MarkupBuilder builder = new MarkupBuilder(writer)
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true
builder.doubleQuotes = true

builder.sports{
    sport(id:1) {
        name 'Baseball'
    }
    sport(id:2) {
        name 'BasketBall'
    }
    sport(id:3) {
        name 'Soccer'
    }
    sport(id:4) {
        name 'Hockey'
    }
}