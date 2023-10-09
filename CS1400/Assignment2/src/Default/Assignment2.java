
/*
//AUTHOR: John Stewart
//FILENAME: Assignment2.java
//SPECIFICATION: plays a game of rock paper scissors with two players and winText = s the winner or decides if there isn't one
//FOR: CS 1400 - ASSIGNMENT #2
//TIME SPENT: 40 Minutes
//*/

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String choiceOne;
		String choiceTwo;
		String winText = "It is a tie.";
		
		System.out.println("Player 1: Choose rock, scissors, or paper: ");
		choiceOne = scan.nextLine();
		System.out.println("Player 2: Choose rock, scissors, or paper: ");
		choiceTwo = scan.nextLine();
		
		if (choiceOne.equals("rock") || choiceOne.equals("ROCK")) {
			if (choiceTwo.equals("rock") || choiceTwo.equals("ROCK")) {
				winText = "It is a tie.";
			} else if (choiceTwo.equals("paper") || choiceTwo.equals("PAPER")) {
				winText =  "Player 2 wins.";
			} else if (choiceTwo.equals("scissors") || choiceTwo.equals("SCISSORS")) {
				winText =  "Player 1 wins.";
			}
			
		} else if (choiceOne.equals("paper") || choiceOne.equals("PAPER")) {
			if (choiceTwo.equals("paper") || choiceTwo.equals("PAPER")) {
				winText =  "It is a tie.";
			} else if (choiceTwo.equals("scissors") || choiceTwo.equals("SCISSORS")) {
				winText =  "Player 2 wins.";
			} else if (choiceTwo.equals("rock") || choiceTwo.equals("ROCK")) {
				winText =  "Player 1 wins.";
			}
			
		} else if (choiceOne.equals("scissors") || choiceOne.equals("SCISSORS")) {
			if (choiceTwo.equals("scissors") || choiceTwo.equals("SCISSORS")) {
				winText =  "It is a tie.";
			} else if (choiceTwo.equals("rock") || choiceTwo.equals("ROCK")) {
				winText =  "Player 2 wins.";
			} else if (choiceTwo.equals("paper") || choiceTwo.equals("PAPER")) {
				winText =  "Player 1 wins.";
			}
		} else {
			winText =  "Wrong choice!";
		}
		
		System.out.println(winText);
		scan.close();
	}
}

