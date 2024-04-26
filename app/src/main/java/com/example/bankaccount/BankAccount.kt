package com.example.bankaccount

class BankAccount(val accountHolder: String, var balance: Double) {

    private val transactionsHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        println("Deposited $amount")
    }
    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        } else {
            println("You haven't enough money on your balance")
        }
    }
    fun displayTransactionHistory() {
        for (transaction in transactionsHistory) {
            println(transaction)
        }
    }

}