package com.rodrigopeleias.listexercises

enum Days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY, FRIDAY, SATURDAY
}

def dayRange = Days.SUNDAY..Days.SATURDAY

for ( day in dayRange) {
    println day
}

// using closures
dayRange.each { day ->
    println day
}

println dayRange.size()
println dayRange.contains(Days.WEDNESDAY)
println dayRange.from
println dayRange.to