package com.rodrigopeleias.objecorientedprogramming.inheritance.service

import com.rodrigopeleias.objecorientedprogramming.Person

class PersonService implements IPersonService{

    @Override
    Person find() {
        Person p = new Person(firstName: "Rodrigo", lastName: "Peleias")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(firstName: "Rodrigo", lastName: "Peleias")
        Person p2 = new Person(firstName: "FAbiola", lastName: "Peleias")
        [p1,p2]
    }
}
