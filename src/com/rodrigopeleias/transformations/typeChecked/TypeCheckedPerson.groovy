package com.rodrigopeleias.transformations.typeChecked

import groovy.transform.TypeChecked

// annotation to add compile time checking
@TypeChecked
class TypeCheckedPerson {

    String firstName
    String lastName

    String getFullName() {
        "$firstName $lastName"
    }
}
