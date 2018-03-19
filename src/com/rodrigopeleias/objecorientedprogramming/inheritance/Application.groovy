package com.rodrigopeleias.objecorientedprogramming.inheritance

import com.rodrigopeleias.objecorientedprogramming.inheritance.domain.IPhone
import com.rodrigopeleias.objecorientedprogramming.inheritance.service.IPersonService
import com.rodrigopeleias.objecorientedprogramming.inheritance.service.PersonService
import com.rodrigopeleias.objecorientedprogramming.traits.Bird

IPhone phone = new IPhone(name: "IPhone", appStore: "Apple Store", os: "ios")
println phone

IPersonService personService = new PersonService()

println personService.find()


Bird b = new Bird()
assert b.fly() == "Fly"
assert b.speak() == "I'm speaking"