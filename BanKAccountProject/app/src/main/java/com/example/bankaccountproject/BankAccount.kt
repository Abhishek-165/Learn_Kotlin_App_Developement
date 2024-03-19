package com.example.bankaccountproject

class BankAccount(var accountHolder : String,var balance: Double ) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount : Double){
        balance += amount
        transactionHistory.add("$accountHolder deposits $amount")
    }
    fun withdraw(amount: Double){
        balance-=amount
        transactionHistory.add("$accountHolder withdraws $amount")
    }

    fun showTransactionHistory(){
       for (item in transactionHistory){
           println(item)
       }
    }
}