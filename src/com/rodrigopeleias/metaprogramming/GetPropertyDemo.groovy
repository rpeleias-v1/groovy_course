package com.rodrigopeleias.metaprogramming

class PropertyDemo {

    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    // override the getter method
    def getProperty(String name) {
        println "getPropery() called with argument $name"

        if (metaClass.hasProperty(this, name)) {
            metaClass.getProperty(this, name) // implicit call
        }
        else {
            println "Let' do something fun with this property"
            return "party time..."
        }
    }
}

def pd = new PropertyDemo()
println pd.prop1
println pd.prop2
println pd.prop3
println pd.prop4