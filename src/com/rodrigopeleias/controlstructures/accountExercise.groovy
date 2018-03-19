package com.rodrigopeleias.controlstructures

/**
 * Created by rodrigopeleias on 18/03/18.
 */
class Account {

    BigDecimal balance = BigDecimal.ZERO

    def deposit(BigDecimal amount) {
        if (amount < 0) {
            throw new Exception("Value is a negative value!")
        }
        balance += amount
    }

    def deposit(List amounts) {
        amounts.each {
            deposit(it)
        }
    }
}

Account checking = new Account()
checking.deposit(10)
println checking.balance

try {
    checking.deposit(-1)
} catch (Exception e) {
    println e.message
}

println checking.balance

checking.deposit([1,5,20,50])
println checking.balance

