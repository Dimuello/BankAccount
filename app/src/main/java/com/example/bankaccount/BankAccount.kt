package com.example.bankaccount

class BankAccount(val accountHolder: String, var balance: Double) {

    private val transactionsHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        println("You deposited: $$amount")
    }
    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("You withdrew: $$amount")
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