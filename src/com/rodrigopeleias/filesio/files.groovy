package com.rodrigopeleias.filesio

// creates a new file
def file = new File( 'dummy.txt')
file.write("This is some text\n")

// new File('dummy.txt').text = "..."

file.append("I am some more text... \n")

List lines = file.readLines()
lines.each { line ->
    println line
}

// list all files in a directory
String directory = "/Users/rodrigopeleias/Desenvolvimento/projetos"
new File(directory).eachFile { fileDir ->
    if ( fileDir.isFile()) {
        println fileDir.name
    }
}

new File('.').eachFile { fileDir2 ->
    if (fileDir2.name.endsWith('.groovy')) {
        println file.name
    }
}