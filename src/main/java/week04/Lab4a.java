/*Program: Lab4a
 * Name: Oliver Rivera
 * Date: October 2, 2023
 * Instructor: Sister Kristi Hays
 * Description: Input Validation
 */

package week04;

import java.util.Scanner;

public class Lab4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This will create the scanner for the Age = in, and for Gender = in1
		Scanner in = new Scanner(System.in);

		//Declare variables
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		boolean valid = false;

		//primary do while loop
		do {//Helps with validation of number

			//Ask the user to input a number
			System.out.println("Please enter a whole number: ");
			if(in.hasNextInt()) {
				num1 = in.nextInt();
				valid = true;
			}

			else {
				valid = false;
				System.out.println("Error! Please enter a whole number: ");
				in.nextLine();
			}//End of if and else statement
		}while(!valid);

		// Calculate the first number given
		num2 = (num1 + 1000);
		num3 = (num1 * 2);

		//Print the results
		System.out.println("num1 = " + num1 + ".\num2 = " + num2 + ".\num3 = " + num3 + ".");

		//How to Close Scanner
		in.close();

	}//End of Main Method

}//End of Lab4a