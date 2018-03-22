package com.rodrigopeleias.transformations.equalsAndHashCode

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(excludes = ["email"])
class EqualsPerson {

    String first, last, email

}
