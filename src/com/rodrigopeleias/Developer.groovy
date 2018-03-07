package com.rodrigopeleias

/**
 * Created by rodrigopeleias on 06/03/18.
 */
@groovy.transform.ToString()
class Developer {

    String first
    String last
    def langages = []

    void work() {
        println "$first $last is working..."
    }

}
