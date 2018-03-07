package com.rodrigopeleias.annotationsast

import groovy.transform.Canonical

//ads equals, hashCode and Tuple Constructors
@Canonical
class Canonicalcustomer {
    String first, last
    int age
    Date since
    Collection favItems
}
