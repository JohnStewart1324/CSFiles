/*-------------------------------------------------------------------------
// AUTHOR: John Stewart
// FILENAME: Lab6.java
// SPECIFICATION: your own description of the program.
// FOR: CS 1400 - Lab #6
// TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab6
{
    public static void main(String[] args)
    {
        // ========== Declaring variables ==========

        // An integer for the array size.
        // -->
    	
    	int arraySize;

        // A double for the current element.
        // -->
    	double currentElement;

        // A scanner object for requesting input from System.in.
        // -->
    	Scanner scan = new Scanner(System.in);

        // ========== Request Array size from user ==========

        // Print this message "How many elements in the array: "
        // -->
    	
    	System.out.println("How many elements in the array: ");

        // Request an integer from the user using the Scanner object
        // and store the inputed value in the integer declared above.
        // -->

    	arraySize = scan.nextInt();
    	
        // ========== Declare the array ==========

        // Declare a new array of double values. 
        // The size of the array is equal to the size requested
        // -->

    	double array[] = new double[arraySize];

        // ========== Fill in the array ==========

        // Use a for loop to prompt the user for the content of the array
        // -->
            
    	for (int i = 0; i < arraySize; i++) {
    		System.out.println("Please enter the next value: ");
    		array[i] = scan.nextDouble();
    	}

        // ========== Display the array's elements backward ==========

        // Construct a for loop that runs backwards through the array,
        // starting at the last element and ending at the first.
        // -->
    	for (int j = arraySize-1; j >= 0; j--) {
    		System.out.print(array[j] + " ");
    	}

        // ========== Display the sum ==========

        // Call the method sumArray with the user's array and display the sum
        // end with a newline character.
        // -->
    	
    	System.out.print("\n" + sumArray(array) + "\n");

        //Close Scanner object 
        // -->
    	scan.close();
    } // end main

    
    //This method calculates and returns the sum of arr 
    //DO NOT print out any message in this method 
    public static double sumArray(double[] arr)
    {
    	int sum = 0;
    	for (int i = 0; i < arr.length; i++) {
    		sum += arr[i];
    	}
    	return sum;
    }
} // Close the Lab6 class.