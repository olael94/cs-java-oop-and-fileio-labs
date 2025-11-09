/* Program: Lab11b
 * Name: Oliver Rivera
 * Date: November 25, 2023
 * Instructor: Sister Kristi Hays
 * Description: Using Switch Statements
 */

package week11;

import java.util.Scanner;

public class Lab11b {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		do {
			//Introduce the program to the user
			System.out.print("\nThis program will show the name of an apostle based on the order they were called with President Nelson as #1 \n" 
					+ "Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): ");
			String input = userInput.nextLine();

			//This if statement exits the program when no string input was received and enter pressed.
			if (input.isEmpty()) {
				System.out.println("\n\nProgram Done.");
				break;
			}

			try {

				//This will read the string input from the user an convert it to integer to be usable for the different cases. 
				int apostleNumber = Integer.parseInt(input);

				//This will initialize the variable were apostle names will be stored at depending current case. 
				String apostleName = null;

				switch (apostleNumber) {

				case 1:
					apostleName = "Russell M. Nelson";
					break;

				case 2:
					apostleName = "Dallin H. Oaks";
					break;

				case 3:
					apostleName = "Jeffrey R. Holland";
					break;

				case 4:
					apostleName = "Henry B. Eyring";
					break;

				case 5:
					apostleName = "Dieter F. Uchtdorf";
					break;

				case 6:
					apostleName = "David A. Bednar";
					break;

				case 7:
					apostleName = "Quentin L. Cook";
					break;

				case 8:
					apostleName = "D Todd Christofferson";
					break;

				case 9:
					apostleName = "Neil L. Andersen";
					break;

				case 10:
					apostleName = "Ronald A. Rasband";
					break;

				case 11:
					apostleName = "Gary E. Stevenson";
					break;

				case 12:
					apostleName = "Dale G. Renlund";
					break;

				case 13:
					apostleName = "Gerrit W. Gong";
					break;

				case 14:
					apostleName = "Ulisses Soares";
					break;

				case 15:
					apostleName = "Vacancy will be filled next General Conference";
					break;

					//This will be printed when a number outside the case scope 1-15 was input
				default:
					apostleName = "Invalid input. No apostle found for the given number.";

				}//END of Switch Statements	

				
				//Print statement
				System.out.println("\n\nNumber " + apostleNumber + " is: " + apostleName);

			//The following will make sure an integer was input by the user.
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid number.");
			}//END of Catch Code Block


		}while(true);  //END of Do-While Loop Starting Line: 19

		//Close Scanner
		userInput.close();

	}//END of Main Method

}//END of Lab11b
