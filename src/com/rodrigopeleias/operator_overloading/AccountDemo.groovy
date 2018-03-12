package com.rodrigopeleias.operator_overloading

/**
 * Created by rodrigopeleias on 11/03/18.
 */
@groovy.transform.ToString
class BankAccount {

    BigDecimal balance = 0.0
    String type // checkings or savings

    BigDecimal deposit(BigDecimal amount) {
        balance += amount
    }

    BigDecimal withdraw(BigDecimal amount) {
        balance -= amount
    }

    BigDecimal plus(BankAccount account) {
        this.balance + account.balance
    }
}

BankAccount checking = new BankAccount(type: 'Checking')
checking.deposit(100.00)

BankAccount savings = new BankAccount(type: 'Savings')
savings.withdraw(50.00)

println checking
println savings
println checking + savings
