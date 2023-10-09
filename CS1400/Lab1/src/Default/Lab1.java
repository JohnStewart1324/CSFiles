/*-------------------------------------------------------------------------
// AUTHOR: John Stewart
// FILENAME: Lab1.Java
// SPECIFICATION: Finds the average of three given test scores
// FOR: CS 1400- Lab #1
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/
package Default;
// All imports have to be included outside the public class
// import the Scanner class from the java.util library
//-->

import java.util.Scanner;

// class name should match the file name
public class Lab1{
	// we must have a main method to run the program
	public static void main(String[] args) {

		// create a Scanner object to get input from the keyboard
		//-->
		
		Scanner getScore = new Scanner(System.in);

		// declare three integer variables to hold the test scores  
		//-->
		
		int score1, score2, score3;
		
		// declare one integer constant to hold the number of tests  
		//-->
		
		final int NUM_TESTS = 3;
		
		// declare one double variable to hold the average  
		//-->
		
		double avgScore;

		// Get the Input
		//-->
		
		System.out.print("Enter the score on the first test: ");
		score1 = getScore.nextInt();
		System.out.print("Enter the score on the second test: ");
		score2 = getScore.nextInt();
		System.out.print("Enter the score on the third test: ");
		score3 = getScore.nextInt();
		
		// Calculate the average
		//-->
		
		avgScore = (score1 + score2 + score3) /(double) NUM_TESTS;

		// Display Results
		//-->
		
		System.out.print("Your average score is: " + avgScore);
		
		// Close your Scanner object
		//-->
		
		getScore.close();
		
	}//end main method
}//end Lab1 class
