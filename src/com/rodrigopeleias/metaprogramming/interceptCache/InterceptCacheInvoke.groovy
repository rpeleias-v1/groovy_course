package com.rodrigopeleias.metaprogramming.interceptCache

class Developer {

    List languages = []

    def methodMissing(String name, args) {

        println "${name}() method was called..."

        if (name.startsWith('write')) {
            String language = name.split("write")[1]

            if (languages.contains(language)) {
                def impl = { Object[] theArgs ->
                    println "I like to write code in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }
}

Developer rodrigo = new Developer()
rodrigo.languages << "Groovy"
rodrigo.languages << "Java"
    println rodrigo.metaClass.methods.size()
rodrigo.writeGroovy()
rodrigo.writeGroovy()
rodrigo.writeGroovy()
    println rodrigo.metaClass.methods.size()
rodrigo.writeJava()
rodrigo.writeJava()
println rodrigo.metaClass.methods.size()