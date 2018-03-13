package com.rodrigopeleias.regularexpressions

import java.util.regex.*

// Java Sample Pattern

Pattern pattern = Pattern.compile("a\\\\b")
println pattern
println pattern.class

// What patterns will look in Groovy
String slashy = /a\b/
String url = $/http://rodrigopeleias.com/blog/$

println slashy.class

def groovyPattern = ~/a\b/
println groovyPattern.class

// Find / Match

def text = "Being a Cleveland Sports Fan is no way to go through life"
def newPattern = ~/Cleveland Sports Fan/
def matcher = text ==~ newPattern

def finder = text =~ newPattern
println finder
println finder.size()
println matcher

def newText = "Cleveland Sports Fan"
def newMatcher = newText ==~ newPattern

println newMatcher

if ( newMatcher ) {
    // do something
}

text = text.replaceFirst(newPattern, "Buffalo")
println text