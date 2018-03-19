package com.rodrigopeleias.closure

def writer = {
    append 'Rodrigo'
    append 'lives in São Paulo'
}


def append(String s) {
    println "append() called with argument of $s"
}

StringBuffer sb = new StringBuffer()
// writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb // delegating the response of append method to StringBuffer class
writer()