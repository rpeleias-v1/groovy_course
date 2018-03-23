package com.rodrigopeleias.restservices

import groovy.json.JsonSlurper

//def books = '''
//    {
//    "books": {
//        "currentBook": {
//            "title": "The 4 Hour Work Week",
//            "author": {
//                "first": "Timothy",
//                "last": "Ferisss",
//                "twitter": "@tferriss"
//            },
//            "related": [
//                "The 4 Hout Body",
//                "The 4 hout chef"
//            ]
//        },
//        "nextBook": {
//            "title": "The 4 Hour Work Week",
//            "author": {
//                "first": "Timothy",
//                "last": "Ferisss",
//                "twitter": "@tferriss"
//            },
//            "related": [
//                "The 4 Hout Body",
//                "The 4 hout chef"
//            ]
//        }
//    }
//}
//'''
//
//JsonSlurper slurper = new JsonSlurper()
//def json = slurper.parseText(books)
//
//println json.books.nextBook.title
//println json.getClass().getName()

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File('books.json'))

println json.books.currentBook
println json.books.currentBook.title
println json.books.currentBook.author
println json.books.currentBook.related