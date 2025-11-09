/*Program: FinalExam1
 * Name: Oliver Rivera
 * Date: December 11, 2023
 * Instructor: Sister Kristi Hays
 * Description: Total Adult Members in a Ward
 */

package week14;

import java.util.Scanner;

public class FinalExam1 {

	public static void main(String[] args) {

		// Create a Scanner object for user input
		Scanner sIn = new Scanner(System.in);		//Scanner for string Y or N feature
		Scanner nIn = new Scanner(System.in);		//Scanner for Numbers

		//Declare Variables
		String name = "";
		String wardName = "";
		int males = 0;
		int females = 0;
		int totalMembers = 0;


		//Ask the user for their name
		System.out.print("Please enter your name: ");
		name = sIn.next();
		System.out.print("\n\n");

		//Ask the user for their ward name
		System.out.print("Please enter the name of your Ward: ");
		wardName = sIn.next();
		System.out.print("\n\n");

		//Ask the user for number of adult males in the ward and perform an INPUT VALIDATION with the getValidInteger() method
		males = getValidInteger(nIn, "Please enter the approximate number of adult males in the ward: ");
		System.out.print("\n\n");

		//Ask the user for number of adult females in the ward and perform an INPUT VALIDATION with the getValidInteger() method
		females = getValidInteger(nIn, "Please enter the approximate number of adult females in the ward: ");
		System.out.print("\n\n");

		//Calculate the total of Adult members
		totalMembers = males + females;

		// Print the final sentence using formatted print statement
		System.out.printf("There are %d adult members in %s's %s ward.%n", totalMembers, name, wardName);
		
		//CLose both scanners for security
		sIn.close();
		nIn.close();


	}//END of Main Method

	//Method for NUMERIC INPUT VALIDATION
	public static int getValidInteger(Scanner nIn, String input) {
		int number = 0;
		boolean valid = false;

		do {
			System.out.print(input);
			if(nIn.hasNextInt()) {
				number = nIn.nextInt();
				valid = true;
			}
			else {
				System.out.println("Invalid response. Please enter a whole number.\n\n");
				valid = false;
				nIn.next();
			}//END of if and else Statement
		}while(!valid);

		return number;
	}//END of getValidInteger NUMERIC INPUT VALIDATION

}//END of FinalExam1
