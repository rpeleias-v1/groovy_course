package com.rodrigopeleias.closure

/**
 * Created by rodrigopeleias on 13/03/18.
 */
class ScopeDemos {

    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }
}

def demo = new ScopeDemos()
demo.outerClosure()