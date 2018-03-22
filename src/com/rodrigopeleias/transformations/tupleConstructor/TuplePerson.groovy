package com.rodrigopeleias.transformations.tupleConstructor

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class TuplePerson {
    
    String name, last, email
}
