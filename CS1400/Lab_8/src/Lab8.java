/*-------------------------------------------------------------------------
// AUTHOR: John Stewart
// FILENAME: Lab8.java
// SPECIFICATION: uses classes and subclasses to create a cat object with certain provided data
// FOR: CS1400 - Lab #8
// TIME SPENT: <1hr
//----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Cat cat;
		
		System.out.println("What is the cat's name: ");
		String catName = input.nextLine();			
		System.out.println("Is " + catName + " a vegetarian cat: ");
		boolean vegCat = input.nextBoolean();
		input.nextLine();
		System.out.println("What kind of food does " + catName + " like: ");
		String catFood = input.nextLine();
		System.out.println("What is " + catName + " color: ");
		String color = input.nextLine();
		System.out.println("How many whiskers does " + catName + " have: ");
		int numWhiskers = input.nextInt();
		System.out.println("What is the avg speed of " + catName + ": ");
		double speed = input.nextDouble();
		
		if (speed > 0) {
		   cat = new Cat(catName, vegCat, catFood, color, numWhiskers, speed);
		} else { 
		   cat = new Cat(catName, vegCat, catFood, color, numWhiskers);
		   cat.setSpeed(20);
		}   
		
		System.out.println("");
		
		String veg = cat.isVeg()?" is a ":" is not a ";
		
		System.out.println(cat.getName() + " is the cat's name.");
		System.out.println(cat.getName() + veg + "vegetarian cat.");
		System.out.println(cat.getName() + " is a cat that eats " + cat.getFood() + ".");
		System.out.println(cat.getName() + " is a(n) " + cat.getColor() + " cat.");
		System.out.println(cat.getName() + " is a cat that has " + cat.getNumWhiskers() + " whiskers.");
		System.out.println(cat.getName() + " is a cat that runs " + cat.getSpeed() + " mph.");
		
		System.out.println("");
		System.out.println("*******************************************************************");
		System.out.println("");
			
		input.close();
		
	}

}