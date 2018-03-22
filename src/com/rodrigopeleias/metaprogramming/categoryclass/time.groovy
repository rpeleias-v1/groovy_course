package com.rodrigopeleias.metaprogramming.categoryclass

import groovy.time.TimeCategory

// built in Groovy Category's examples
use(TimeCategory) {
    println 1.minute.from.now
    println 10.hours.ago

    def someDate = new Date()
    println someDate - 3.months
}