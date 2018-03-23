package com.rodrigopeleias.builders

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true

builder.sports{
    sport(id:1) {
        name 'Baseball'
    }
    sport(id: 2) {
        name 'BasketBall'
    }
    sport(id: 3) {
        name 'Soccer'
    }
    sport(id: 4) {
        name 'Hockey'
    }
    sport(id: null, foo: '') {
        name ''
    }
}