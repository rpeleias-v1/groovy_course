package com.rodrigopeleias.restservices

import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {
    currentBook {
        title 'The 4 Hour Work Week'
        isbn: '123-456-789'
        author( first: 'Timothy', last: 'Ferisss', twitter: '@tferriss')
        related 'The 4 Hout Body', 'The 4 hout chef'
    }

    nextBook {
        title 'The 4 Hour Work Week'
        isbn: '123-456-789'
        author( first: 'Timothy', last: 'Ferisss', twitter: '@tferriss')
        related 'The 4 Hout Body', 'The 4 hout chef'
    }
}

println builder.toString()
println builder.toPrettyString()

new File('books.json').write(builder.toPrettyString())