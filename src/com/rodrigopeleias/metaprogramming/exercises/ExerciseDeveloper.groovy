package com.rodrigopeleias.metaprogramming.exercises

class ExerciseDeveloper {

    String first
    String last
    String email
    List languages

    ExerciseDeveloper() {
    }

    def invokeMethod(String name, Object args) {
        println "invokeMethod() called with args $args"
    }

    def getProperty(String name) {
        println "getProperty called..."
        metaClass.getProperty(this, name)
    }

    void setProperty(String property, Object newValue) {
        println "setProperty() called with $property and newValue $newValue"
        metaClass.setProperty(this,property,newValue)
    }
}