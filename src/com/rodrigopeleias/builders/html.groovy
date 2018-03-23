package com.rodrigopeleias.builders

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('about.html')
MarkupBuilder builder = new MarkupBuilder(writer)

List courses = [
    [id: 1, name: 'Apache Groovy'],
    [id: 2, name: 'Spring Boot']
]

builder.html {
    head {
        titla 'About Rodrigo Peleias'
        description 'This is about my page'
        keywords 'Rodrigo Peleias, Groovy, Java, Spring'
    }
    body {
        h1 'About me'
        p 'This is a bunch of tst about me...'
        section {
            h2 'course'
            tr {
                th 'id'
                th 'name'
            }
            courses.each { course ->
                tr {
                    td course.id
                    td course.name
                }
            }
        }
    }
}