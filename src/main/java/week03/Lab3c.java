/*Program: Lab3a
 * Name: Oliver Rivera
 * Date: September 27, 2023
 * Instructor: Sister Kristi Hays
 * Description: Determine Class by Age and Gender
 */

package week03;
import java.util.Scanner;

public class Lab3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This will create the scanner for the Age = in, and for Gender = in1
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);

		//Introduce program to user
		System.out.println("This program will ask a member's age and gender and determine which class they should attend on Sunday. \n" );

		//Ask user for their Age
		System.out.println("Please enter memeber's age: ");
		int myAge = in.nextInt();

		//Ask user for their gender
		System.out.println("Please enter member's Gender: ");
		String myGender = in1.nextLine();



		//if, else if, and else statement for Gender, Age Table

		if (myAge >= 18) {
			if (myGender.equalsIgnoreCase("Male"))
				System.out.println("The member should attend Priesthood. ");
			if (myGender.equalsIgnoreCase("Female"))
				System.out.println("The member should attend Relief Society. ");
		}

		else if (myAge >= 12) {
			if (myGender.equalsIgnoreCase("Male"))
				System.out.println("The member should attend Young Men's. ");
			if (myGender.equalsIgnoreCase("Female"))
				System.out.println("The member should attend Young Women's. ");
		}

		else if (myAge >= 3) {
			System.out.println("The member should attend Primary. ");	
		}

		else if (myAge >= 1) {
			System.out.println("The member should attend Nursery. ");	
		}

		else {
			System.out.println("The member should attend Babe in Arms. ");	
		}// end of IF, ELSE IF, AND ELSE Statement

		in.close();
		in1.close();


	}//End of Main method

}//End of Lab3c