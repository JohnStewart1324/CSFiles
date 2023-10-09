package Default;
/*-------------------------------------------------------------
// AUTHOR: John Stewart
// FILENAME: Lab4.java
// SPECIFICATION: Prompts user to pick between pyramid, row, and inverted diamond, then it draws the chosen shape
// FOR: CS 1400- Lab #4
// TIME SPENT: 
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        final char SIDE_SYMB = '-';
        final char MID_SYMB = '*';
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        char choice = ' ';
        int numSymbols = -1, sideWidth = -1, midWidth = -1;
        boolean inverted = true;

        do {
            displayMenu();
            inputStr = scanner.next();
            if (inputStr.length() > 0) {
                choice = inputStr.charAt(0);
            }

            switch (choice) {
            case 'r':
                System.out.println("Width of the sides: ");
                sideWidth = scanner.nextInt();
                System.out.println("Width of the middle: ");
                midWidth = scanner.nextInt();

                System.out.println();
                System.out.print(buildRow(SIDE_SYMB, sideWidth, MID_SYMB, midWidth));

                break;
            case 'p':
                System.out.println("Number of symbols on the lowest layer: ");
                numSymbols = scanner.nextInt(); 

                System.out.println();
                System.out.print(buildPyramid(SIDE_SYMB, MID_SYMB, numSymbols, !inverted));

                break;
            case 'd':
            	System.out.println("Number of symbols on the middle layer: ");
                numSymbols = scanner.nextInt(); 

                System.out.println();
                System.out.print(buildPyramid(SIDE_SYMB, MID_SYMB, numSymbols, inverted));
                break;
            case 'q':
                System.out.println("Bye");
                break;
                
            default:
                System.out.println("Please choose a valid option from the menu.");
                break;
            }
            System.out.println();
        } while (choice != 'q');
        
        scanner.close();

    } // End of main
    
    
    /**
     * Build a row of symbols (pattern) with the given parameters. 
     *
     * For example, -----*****----- can be built by the parameters
     *
     * sideWidth = 5, midWidth = 5, sideSymb = '-', midSymb = '*'
     * 
     * @param sideSymb  A char to be repeated on both sides
     * @param sideWidth Number of symbols on each side
     * @param midSymb   A char to be repeated in the middle
     * @param midWidth  Number of symbols in the middle
     * @return          A String of a row of the designed pattern end with \n
     */
    private static String buildRow(
        char sideSymb, int sideWidth, char midSymb, int midWidth) {

        String result = "";
        String side = "";
        String middle = "";
        // YOUR CODE HERE
        for(int i = 0; i < sideWidth; i++) {
        	side += sideSymb;
        }
        
        for(int i = 0; i < midWidth; i++) {
        	middle += midSymb;
        }
       
        result = side + middle + side;

        return result;
    }  // End of buildRow

    /**
     * Build a pyramid pattern with the given parameters.
     *
     * For example, the following pattern
     *
     *  -----*-----
     *  ----***----
     *  ---*****---
     *  --*******--
     *  -*********-
     *  ***********
     *
     * can be built by sideSymb = '-', midSymb = '*', numSymbols = 11
     *
     * When ptnHeight is not an odd integer, replace it by the closest
     * even integer below. For example, if numSymbols is 10, use 9 instead.
     * 
     * When ptnHeight is 0, return an empty String.
     * 
     * @param  sideSymb   A char to be repeated on both sides
     * @param  midSymb    A char to be repeated in the middle
     * @param  numSymbols The number of symbols on the lowest layer
     * @return            A String of the pyramid pattern.
     */
    private static String buildPyramid(
        char sideSymb, char midSymb, int numSymbols, boolean inverted) {

        String result = "";
        int sideWidth = numSymbols/2;
        int midWidth = 1;

        // YOUR CODE HERE
        
        if (numSymbols == 0) {
        	return result;
        }
        
        
        if (numSymbols % 2 == 0) {
        	numSymbols -= 1;
        	sideWidth -= 1;
        }
        
        // Make a loop to iterate the pyramid's levels
        if (!inverted) {
        	for (int i = 0; i < numSymbols/2+1; i++) {
            	System.out.println(buildRow(sideSymb, sideWidth, midSymb, midWidth));
            	sideWidth -= 1;
            	midWidth += 2;
            }
        } else {
        	for (int i = 0; i < numSymbols/2+1; i++) {
            	System.out.println(buildRow('*', sideWidth, ' ', midWidth));
            	sideWidth -= 1;
            	midWidth += 2;
            }
        	sideWidth += 1;
        	midWidth -= 2;
        	for (int i = 0; i < numSymbols/2; i++) {
        		sideWidth += 1;
            	midWidth -= 2;
            	System.out.println(buildRow('*', sideWidth, ' ', midWidth));
            }
        }
        

       return result;
  }

    
    /**
     * Display the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one pattern from the list");
        System.out.println("r) Row");
        System.out.println("p) Pyramid");
        System.out.println("d) Shallow Pyramid");
        System.out.println("q) Quit");
    }  // End of displayMenu

}  // End of Lab 4 class
