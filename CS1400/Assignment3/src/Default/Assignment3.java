
/*
//AUTHOR: John Stewart
//FILENAME: Assignment3.Java
//SPECIFICATION: Prompts the user with various options to get data on the similarities and differences between two strings
//FOR: CS 1400 - ASSIGNMENT #3
//TIME SPENT: 1.5 hrs
//*/

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String commandOption = "x";
		String strings[] = getStrings(scan);
		
		System.out.println("Command Options\n"
				+ "a: find if the lengths of the strings are equal\n"
				+ "b: find if the two strings are the same\n"
				+ "c: find which string is lexically larger\n"
				+ "d: print the first character of each string\n"
				+ "e: concatenate the two strings\n"
				+ "f: print both strings in uppercase\n"
				+ "q: quit this program\n");
		
		while (!commandOption.equals("q")) {
			commandOption = getCommandOption(scan);
			switch (commandOption) {
			case "a":
				
				if (compareLengths(strings)) {
					System.out.println("The lengths are the same.\n");
				} else {
					System.out.println("The lengths are not the same.\n");
				}
				break;
			case "b":
				
				if (compareStrings(strings)) {
					System.out.println("The two strings are the same.\n");
				} else {
					System.out.println("The two strings are not the same.\n");
				}
				
				break;
			case "c":
				
				if (compareLexicalLength(strings) == 0) {
					System.out.println("The second string is lexically larger.\n");
				} else if (compareLexicalLength(strings) == 1){
					System.out.println("The first string is lexically larger.\n");
				} else {
					System.out.println("The two strings are the same.\n");
				}
				
				break;
			case "d":
				System.out.println("The first character of the first string is " + getFirstLetters(strings, 0));
				System.out.println("The first character of the second string is " + getFirstLetters(strings, 1) + "\n");
				break;
			case "e":
				System.out.println("The concatenation of two strings is \"" + getConcatenation(strings) + "\"\n");
				break;
			case "f":
				System.out.println("The first string using upper case letters: " + setUppercase(strings, 0));
				System.out.println("The second string using upper case letters: " + setUppercase(strings, 1) + "\n");
				break;
			}	
		}
		System.out.println("Goodbye!");
		
		scan.close();
	}
	
	public static String[] getStrings(Scanner scan) {
		String strings[] = new String[2];
		
		System.out.println("Please enter a string: ");
		strings[0] = scan.next();
		System.out.println("Please enter another string: \n");
		strings[1] = scan.next();
		
		return strings;
	}
	
	public static String getCommandOption(Scanner scan) {
		String choice = "x";

		while (!choice.equals("a") && !choice.equals("b") && !choice.equals("c") && !choice.equals("d") && !choice.equals("e") && !choice.equals("f") && !choice.equals("q")) {
			System.out.println("Please, enter an option from the menu: ");
			choice = scan.next();
			if (!choice.equals("a") && !choice.equals("b") && !choice.equals("c") && !choice.equals("d") && !choice.equals("e") && !choice.equals("f") && !choice.equals("q")) {
				System.out.println("Invalid option\n");
			}
		}

		return choice;
	}
	
	public static boolean compareLengths(String[] strings) {
		if (strings[0].length() == strings[1].length()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean compareStrings(String[] strings) {
		if (strings[0].equals(strings[1])) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static int compareLexicalLength(String[] strings) {
		if (strings[0].compareTo(strings[1]) < 0) {
			return 0;
		} else if (strings[0].compareTo(strings[1]) > 0){
			return 1;
		} else {
			return 2;
		}
		
	}
	
	
	public static char getFirstLetters(String[] strings, int stringNum) {
		
			return strings[stringNum].charAt(0);
		
	}
	
	public static String getConcatenation(String[] strings) {
		
		return strings[0] + strings[1];
	
	}
	public static String setUppercase(String[] strings, int stringNum) {
		if (stringNum == 0) {
			return strings[0].toUpperCase();
		} else {
			return strings[1].toUpperCase();
		}
		
	
	}
}