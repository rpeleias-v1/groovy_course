package com.rodrigopeleias.transformations.toString

import groovy.transform.ToString

@ToString(includeNames = true, excludes = ["email"])
class StringPerson {

    String first, last, email

}
