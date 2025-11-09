/*Program: Lab7b
 * Name: Oliver Rivera
 * Date: October 25, 2023
 * Instructor: Sister Kristi Hays
 * Description: T
 */

package week07;
import java.util.Scanner;
import java.lang.Math;

public class Lab7b {

	public static void main(String[] args) {

		Scanner txt = new Scanner(System.in);//Scanner for user input

		//Declare Variables
		String sAnswer;
		boolean sideAnswerTrue = false;
		boolean gameRun = false;//Play again feature
		String ansW;

		System.out.println("This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides. \n" 
				+ "\nThe program will ask the user which side they wish to calculate and the lengths of the other two sides. \n"
				+ "Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle) /n");

		//PRIMARY Do-While Loop
		do {
			do {
				System.out.println("\nWhich side of the triagnle do you wish to calculate? (a/b/c)");
				sAnswer = txt.nextLine();
				sideAnswerTrue = sAnswer.equalsIgnoreCase("A") || sAnswer.equalsIgnoreCase("B") || sAnswer.equalsIgnoreCase("C");
				if(!sideAnswerTrue) {
					System.out.println("Pleas enter either A, B, or C. ");
				}//End of if statement for validation.

			}while(!sideAnswerTrue);//End of Do-While Loop


			if (sAnswer.equalsIgnoreCase("A")) {
				calculateSideA();
			}
			if (sAnswer.equalsIgnoreCase("B")) {
				calculateSideB();
			}
			if (sAnswer.equalsIgnoreCase("C")) {
				calculateSideC();
			}

			//GameRun Do-While Loop
			do {
				System.out.println("Do you want to play again?: ");
				ansW = txt.nextLine();
				gameRun = ansW.equalsIgnoreCase("Y") || ansW.equalsIgnoreCase("N");

				if(!gameRun) {
					System.out.println("Error! Please use Y for yes and N for no");
				}//End of If statement
			}while(!gameRun);//End of GAMERUN Do-while Loop 


		}while(gameRun = ansW.equalsIgnoreCase("Y"));//End of PRIMARY Do-While Loop


		txt.close();//Closes String Scanner
	}//End of Main Method


	//getSideLength Method
	public static int getSideLength(String x) {
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);//for numbers

		//Declare variables
		boolean valid = false;
		int sideLength = 0;

		//Do-While Loop
		do {
			System.out.println("Please enter the lenght of side " + x + ":");
			if(!num.hasNextInt()) {
				System.out.println("Error! please enter a whole number: ");
			}//End of if statement.

			sideLength = num.nextInt();
			valid = true;
		}while(!valid);

		return sideLength;
	}//End of getSideLenght


	//calculateSideA method
	public static void calculateSideA() {
		int b = 0;
		int c = 0;
		double x = 0;

		//Calculate
		b = getSideLength("b");
		c = getSideLength("c");
		x = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));

		//Show results
		System.out.println("A right triangle with sides 'b' =" + b + " and 'c' (hypotenuse) = " 
				+ c + ", has a side 'a' which has a length of: " + x);
	}//End of calculateSideA method


	//calculateSideB method
	public static void calculateSideB() {
		int a = 0;
		int c = 0;
		double y = 0;

		//Calculate
		a = getSideLength("a");
		c = getSideLength("c");
		y = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));

		//Show results
		System.out.println("A right triangle with sides 'a' =" + a + " and 'c' (hypotenuse) = " 
				+ c + ", has a side 'b' which has a length of: " + y);
	}//End of calculateSideB method

	//calculateSideC method
	public static void calculateSideC() {
		int a = 0;
		int b = 0;
		double z = 0;

		//Calculate
		a = getSideLength("a");
		b = getSideLength("b");
		z = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		//Show results
		System.out.println("A right triangle with sides 'a' =" + a + " and 'b' = " 
				+ b + ", has a side 'c' (hypotenuse) which has a length of: " + z);
	}//End of calculateSideC method


}//End of Lab7b