package com.rodrigopeleias.transformations.immutable

import groovy.transform.Immutable
import groovy.transform.ToString

@ToString
@Immutable
class ImmutablePerson {

    String first, last, email
}


