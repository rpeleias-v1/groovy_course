package com.rodrigopeleias.filesio

String dir = '/Users/rodrigopeleias/Desenvolvimento'
List hidden = []
new File(dir).eachFile { file ->
    if(file.isDirectory()) {
        println file.name
    }

    if (file.isHidden()) {
        hidden << file.name
    }
}

println hidden

new File(dir).eachDir { subfolder ->
    println subfolder
}

def devDir = new File(dir)
println devDir.directorySize()

new File('dummy').mkdir()
new File('foo/bar/joo').mkdirs()

new File('dummy').deleteDir()