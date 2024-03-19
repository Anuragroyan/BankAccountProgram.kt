package com.example.bankaccountprogram

class BankAccount (val accountHolder: String, var balance: Double){
   private val Transaction_History = mutableListOf<String>()
   fun deposit(amount: Double){
       balance += amount
       Transaction_History.add("$accountHolder's deposit $$amount")
   }
   fun withdraw(amount: Double){
       if(amount<=balance){
           balance -= amount
           Transaction_History.add("$accountHolder's withdraw $$amount")
       }else{
           Transaction_History.add("You don't have enough fund to withdraw $$amount")
       }
   }
   fun displayTransactionHistory(){
      println("Transaction history of $accountHolder")
       for(transaction in Transaction_History){
           println(transaction)
       }
   }
}