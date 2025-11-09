/*Program: Lab3a
 * Name: Oliver Rivera
 * Date: September 25, 2023
 * Instructor: Sister Kristi Hays
 * Description: Selecting correct shirt sizes
 */

package week03;
import java.util.Scanner;

public class Lab3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This will create the scanner for the user input
		Scanner in = new Scanner(System.in);

		//Introduce program to user
		System.out.println("This program will help you decide the shirt size you need" + 
				"when your measurement is given in a whole number as inches. ");

		//Ask user for size in inches
		System.out.println("Please enter your chest size in inches: ");
		int chestSize = in.nextInt();

		//if, else if, and else statement for size table
		if(chestSize < 38) {
			System.out.println("With that measurement of " + chestSize + " needs to order a size S. ");	
		}

		else if (chestSize >= 38 && chestSize < 40) {
			System.out.println("With that measurement of " + chestSize + " needs to order a size M. ");	
		}

		else if (chestSize >= 40 && chestSize < 43) {
			System.out.println("With that measurement of " + chestSize + " needs to order a size L. ");
		}

		else if (chestSize >= 43 && chestSize < 46) {
			System.out.println("With that measurement of " + chestSize + " needs to order a size XL. ");
		}

		else {
			System.out.println("With that measurement of " + chestSize + " needs to order a size XXL. ");
		}// end of IF, ELSE IF, AND ELSE Statement

		in.close();

	}//End of Main method

}//End of Lab3a