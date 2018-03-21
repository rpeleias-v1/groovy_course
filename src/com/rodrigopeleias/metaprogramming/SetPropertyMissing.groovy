package com.rodrigopeleias.metaprogramming

class POGO {

    String property

    void setProperty(String name, Object value) {
        this.@"$name" = 'overriden'
    }
}

def pogo = new POGO()
pogo.property = 'a'

assert pogo.property == 'overriden'