package com.rodrigopeleias.transformations.builder

BuilderDeveloper rodrigo = BuilderDeveloper
        .builder()
        .firstName("Rodrigo")
        .lastName("Peleias")
        .middleInitial("D")
        .email("rodrigo.peleias@gmail.com")
        .hireDate(new Date())
        .languages(["Java", "Groovy"])
        .build()

println rodrigo