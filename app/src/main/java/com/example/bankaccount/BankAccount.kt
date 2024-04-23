package com.example.bankaccount

class BankAccount(val accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        } else {
            println("")
        }
    }

}