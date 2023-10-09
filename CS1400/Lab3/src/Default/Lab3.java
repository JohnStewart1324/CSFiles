package Default;

/*-------------------------------------------------------------------------
//AUTHOR: John Stewart
//FILENAME: Lab3
//SPECIFICATION: calculates a total score with three given test scores to determine if a student passed a class
*/
//FOR: CS 1400- Lab3
//TIME SPENT: 1hr
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		
		int homeworkGrade = -1, midtermGrade = -1, finalGrade = -1;
		float totalGrade;
		String passed = "FAILED";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your homework grade: ");
		homeworkGrade = scan.nextInt();
		while(!(0 <= homeworkGrade && homeworkGrade <= 100)) {
		
				System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
				System.out.print("Enter your homework grade: ");
				homeworkGrade = scan.nextInt();
		}
		
		System.out.print("Enter your midterm grade: ");
		midtermGrade = scan.nextInt();
		while(!(0 <= midtermGrade && midtermGrade <= 100)) {
		
				System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100].");
				System.out.print("Enter your midterm grade: ");
				midtermGrade = scan.nextInt();
		}
		
		System.out.print("Enter your final grade: ");
		finalGrade = scan.nextInt();
		while(!(0 <= finalGrade && finalGrade <= 200)) {
			
			System.out.println("[ERR] Invalid input. A final grade should be in [0, 200].");
			System.out.print("Enter your final grade: ");
			finalGrade = scan.nextInt();
		}
		
		totalGrade = ((float)(homeworkGrade + midtermGrade + finalGrade)/4);
		
		System.out.printf("[INFO] Student's weighted total is %.2f", totalGrade);
		System.out.println("%");		
		if (totalGrade > 50) {
			passed = "PASSED";
		}
		
		System.out.print("[INFO] Student " + passed + " the class.");
		
		scan.close();
	}
}
