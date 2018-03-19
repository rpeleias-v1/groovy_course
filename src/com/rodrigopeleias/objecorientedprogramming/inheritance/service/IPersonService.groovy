package com.rodrigopeleias.objecorientedprogramming.inheritance.service

import com.rodrigopeleias.objecorientedprogramming.Person

interface IPersonService {

    Person find()
    List<Person> findAll()
}