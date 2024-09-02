/*-------------------------------------------------------------------------
// AUTHOR: John Stewart
// FILENAME: Lab9.java
// SPECIFICATION:
// FOR: CS1400 - Lab #9
// TIME SPENT: how long it took you to complete the assignment
//----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {


		
		//declaring variables
		String choice, str;
		char command;

		Scanner keyboard = new Scanner(System.in);

		do
		{

			// ask a user a word/sentence or q to quit
			System.out.println("Do you want to check if a word/sentence is a palindrome (y/n): ");
			choice = keyboard.nextLine().toLowerCase();
			command = choice.charAt(0);

			switch (command){
				case 'y': 
					System.out.println("Please enter a word/sentence: ");
					str = keyboard.nextLine();
					if(Palindrome.isPalindrome(str))
						System.out.println(str + " is a palindrome\n");
					else
						System.out.println(str + " is not a palindrome\n");
					break;

				case 'n': 
					System.out.println("Bye!");
					break;
				default:
					System.out.println("Invalid input!");
			}

		} while (command != 'n');

		keyboard.close();

	} //end of the main method

} //end of the class
