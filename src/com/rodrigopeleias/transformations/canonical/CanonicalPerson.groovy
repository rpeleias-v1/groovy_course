package com.rodrigopeleias.transformations.canonical

import groovy.transform.Canonical

//Canonical annotation is a combination of toString
//equalsAndHashCode and TupleConstructor annotations
@Canonical
class CanonicalPerson {

    String first,last, email
}


