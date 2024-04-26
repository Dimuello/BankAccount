package com.example.bankaccount

fun main() {

    val myBankAccount = BankAccount("Dmytro", 500.0)

    myBankAccount.deposit(50.0)
    myBankAccount.withdraw(150.0)
    myBankAccount.deposit(600.0)

    myBankAccount.displayTransactionHistory()

    println("Your balance is: ${myBankAccount.balance}")

}