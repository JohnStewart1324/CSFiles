package Default;
/*-------------------------------------------------------------------------
// AUTHOR: John Stewart
// FILENAME: Assignment1
// SPECIFICATION: Calculates various conversion ratios of given throw distances for javelin throws input by the user
 * 				  and displays them in a table format.
 */
// FOR: CS 1400- Assignment #1
// TIME SPENT: 45 minutes
//-----------------------------------------------------------*/

// All imports have to be outside class
	import java.util.Scanner;
	
// class name should match the file name
public class Assignment1
{
	// we must have a main method to run the program
   public static void main (String[] args)
   {

   		// declare variables of different types
	   
     	String name;
     	double throwOne[] = new double[5];
     	double throwTwo[] = new double[5];
     	double throwThree[] = new double[5];
     	Scanner scan = new Scanner(System.in);
     	
		// get the user data
     	
     	System.out.print("Enter the competitor's name: ");
     	name = scan.nextLine();
     	System.out.println("\n\t\tOlympic Javelin Throws");
     	System.out.printf("\tEnter the distances, in meters, for %s\n\n", name);
     	System.out.print("Enter the distance for throw 1: ");
     	throwOne[0] = scan.nextDouble();
     	System.out.print("Enter the distance for throw 2: ");
     	throwTwo[0] = scan.nextDouble();
     	System.out.print("Enter the distance for throw 3: ");
     	throwThree[0] = scan.nextDouble();
     	
		// calculate conversions
     
		throwOne[1] = throwOne[0] * 1.093;
		throwTwo[1] = throwTwo[0] * 1.093;
		throwThree[1] = throwThree[0] * 1.093;
		
		throwOne[2] = throwOne[1] * 3;
		throwTwo[2] = throwTwo[1] * 3;
		throwThree[2] = throwThree[1] * 3;
		
		throwOne[3] = throwOne[0] * 100;
		throwTwo[3] = throwTwo[0] * 100;
		throwThree[3] = throwThree[0] * 100;
		
		throwOne[4] = throwOne[2] * 12;
		throwTwo[4] = throwTwo[2] * 12;
		throwThree[4] = throwThree[2] * 12;
		// output
		System.out.printf("\n%-10s %-10s %-10s %-10s\n", "Yards", "Feet", "Inches", "Cm"); 
		
     	System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n", throwOne[1], throwOne[2], throwOne[4], throwOne[3]); 
     	System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n", throwTwo[1], throwTwo[2], throwTwo[4], throwOne[3]);
     	System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n", throwThree[1], throwThree[2], throwThree[4], throwThree[3]); 
		
		// close Scanner
     	scan.close();
   }
}
