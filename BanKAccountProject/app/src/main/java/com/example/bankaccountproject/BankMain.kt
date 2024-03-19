import com.example.bankaccountproject.BankAccount

fun main(){


    val bankAccount = BankAccount("Abhishek", 100.0)

    bankAccount.deposit(200.60)
    bankAccount.deposit(200.60)
    bankAccount.withdraw(80.60)
    bankAccount.deposit(700.60)
    bankAccount.withdraw(900.60)


    bankAccount.showTransactionHistory()

    println("Total Balance is ${bankAccount.balance}")


}