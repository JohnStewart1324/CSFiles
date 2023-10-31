package Default;
/*
//AUTHOR: John Stewart
//FILENAME: Assignment4.java
//SPECIFICATION: DESCRIPTION OF THIS PROGRAM
//FOR: CS 1400 - ASSIGNMENT #4
//TIME SPENT: 2 hrs
//*/

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput = 100, count = 0;
		int inputList[] = new int[userInput];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		do {
			System.out.println("Enter a positive integer. Enter -1 to quit.");
			userInput = scan.nextInt();
			if (userInput == -1) {
				
				continue;
			} else {
				inputList[count] = userInput;
			}
			if (isPrime(userInput)) {
				System.out.println("The number " + userInput + " is a prime number.\n");
			} else {
				System.out.println("The number " + userInput + " is not a prime number.\n");
			}
			if (min > userInput) {
				min = userInput;
			}
			if (max < userInput) {
				max = userInput;
			}
			count++;
			sum+=userInput;
		} while (userInput != -1);
		
		System.out.println("\nThe maximum positive number is: " + maxNum(inputList, count));
		System.out.println("The minimum positive number is: " + minNum(inputList));
		System.out.println("The sum is: " + findSum(inputList));
		System.out.println("The count of number(s) is: " + count);
		System.out.printf("The average is: %.2f", average(inputList, count));
		
		scan.close();
	}
	
	public static Boolean isPrime(int userInput) {
		if(userInput == 2) {
			return true;
		}
		
		for (int i = 2; i < userInput; i++) {
			if (userInput % i == 0 && i != userInput) {
				return false;
			}
		}
		
		if(userInput == 1) {
			return false;
		}
		
		return true;
	}
	public static int maxNum(int inputList[], int count) {
		int largestNum = inputList[0];
		for (int i = 0; i < count; i++) {
			if (largestNum < inputList[i]) {
				largestNum = inputList[i];
			}
		}
		return largestNum;
	}
	public static int minNum(int inputList[]) {
		int smallestNum = inputList[0];
		for (int j = 1; j < inputList.length; j++) {
			if (smallestNum > inputList[j]) {
				smallestNum = inputList[j];
			}
		}
		return smallestNum;
	}
	public static int findSum(int inputList[]) {
		int sum = 0;
		for (int k = 0; k < inputList.length; k++) {
			sum += inputList[k];
		}
		return sum;
	}
	public static double average(int inputList[], int count) {
		double sum = 0;
		for (int k = 0; k < inputList.length; k++) {
			sum += inputList[k];
		}
		return sum/count;
	}
}
