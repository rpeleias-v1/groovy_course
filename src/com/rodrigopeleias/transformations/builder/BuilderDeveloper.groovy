package com.rodrigopeleias.transformations.builder

import groovy.transform.ToString
import groovy.transform.builder.Builder

@Builder
@ToString(includeNames = true)
class BuilderDeveloper {

    String firstName, lastName, middleInitial, email
    Date hireDate
    List languages
}
