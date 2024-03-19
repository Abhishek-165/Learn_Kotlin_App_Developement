package com.example.rockpaperscissors


fun main(){
    var computerChoice = "";
    var playerChoice = "";

    println("Rock,Paper and Scissors? Enter Your Choice")
    playerChoice = readln()
    val condition : Boolean = when{
        playerChoice == "Rock" -> true
        playerChoice == "Paper" -> true
        playerChoice == "Scissors"-> true
        else -> false
    }

  while(condition) {
      val randomNumber = (1..3).random()
      when (randomNumber) {
          1 -> {
              computerChoice = "Rock"
          }

          2 -> {
              computerChoice = "Paper"
          }

          3 -> {
              computerChoice = "Scissors"
          }
      }
      val winner = when {
          playerChoice == computerChoice -> "Tie"
          playerChoice == "Rock" && (computerChoice == "Paper" || computerChoice == "Scissors") -> "Player"
          playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
          playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
          else -> "Computer"

      }
      if (winner == "Tie") {
          println("It's a Tie")
      } else {
          println("Winner is $winner")
      }
      println("Rock,Paper, Scissors and Exit? Enter Your Choice")
      playerChoice = readln()
  }

}

fun execute(){

}