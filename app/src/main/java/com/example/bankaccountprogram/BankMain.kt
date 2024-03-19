package com.example.bankaccountprogram

fun main(){
   val SarahAccount = BankAccount("Sarah",0.0)
    println(SarahAccount.accountHolder)
    SarahAccount.deposit(100.0)
    SarahAccount.withdraw(10.0)
    SarahAccount.deposit(300.0)
    SarahAccount.displayTransactionHistory()
    println("${SarahAccount.accountHolder}'s transaction history and final balance ${SarahAccount.balance}")
}