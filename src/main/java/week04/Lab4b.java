/*Program: Lab4b
 * Name: Oliver Rivera
 * Date: October 4, 2023
 * Instructor: Sister Kristi Hays
 * Description: Non-numeric Input Validation
 */

package week04;
import java.util.Scanner;

public class Lab4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Use Scanner for getting Input from user
		Scanner sIn = new Scanner(System.in);                    

		//Variables
		String answerString = "";
		boolean valid = false;

		//primary do while loop
		do {
			System.out.println("Dou you like to code in Java?: ");
			answerString = sIn.nextLine();

			//input validation using if and else statement
			if(answerString.equalsIgnoreCase("Y") || answerString.equalsIgnoreCase("N")) {
				valid = true;
			}

			else {
				System.out.println("Error! Please use Y for yes and N for no. ");
			}//End of if and else statement for 1st part validation

		}while(!valid);//End of do while not true situation


		//Second part of input validation
		if(answerString.equalsIgnoreCase("Y")) {
			System.out.println("That's Great! Me too ");
		}

		else {
			System.out.println("That's ok! There are many wonderful things to do. ");
		}//End of if and else statement for 2nd part of input validation

		sIn.close();//close the string scanner

	}//End of main method

}//End of Lab4b
