/*Program: Lab8a
 * Name: Oliver Rivera
 * Date: October 30, 2023
 * Instructor: Sister Kristi Hays
 * Description: Passing an ArrayList to sumValues()
 */

package week08;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nIn = new Scanner(System.in);//For user Input.
		Scanner sInt1 = new Scanner(System.in);//Scanner for getValidYN() method

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		//Declare variables
		String answer = "";
		int num = 0;
		String playAgain = "Y";

		//Primary While Loop
		while(playAgain.equalsIgnoreCase("Y")) {
			boolean loopC = true;
			numbers.clear();

			//Introduce the program 
			System.out.println("This program will ask the user for a list of numbers " 
					+ " and those numbers to find a total.");

			//Number While Loop
			while(loopC) {
				System.out.println("Please enter a number or hit enter when done. ");
				answer = nIn.nextLine();

				if(answer.equals("")) {
					loopC = false;
				}

				else {
					try {
						num = Integer.parseInt(answer);
						numbers.add(num);
					}catch(Exception e) {
						System.out.println("Error! Please enter a whole number: ");
					}//End of Try and Catch
				}//End of If and else Statement

			}//End of Number While Loop

			System.out.println("Array Index - Item");


			for(int i = 0; i < numbers.size(); i++) {
				System.out.println(i + "                               " + numbers.get(i));
			}//End of for loop


			System.out.println("There are " + numbers.size() + " items in the ArrayList.");
			System.out.println("The sum total in the ArrayList is " + sumValues(numbers));

			//playAgain message
			playAgain = getValidYN(sInt1, "Would you like to play again?: ", "Error! Please use Y for yes and N for no. \n");
		}//END of PRIMARY While Loop

		System.out.println("thank you for Playing. ");

		nIn.close();//Close Scanner 
		sInt1.close();//Close Scanner


	}//End of Main method




	//Beginning getValidYN() method
	public static String getValidYN(Scanner sInt1, String question, String warning) {
		boolean valid = false;
		String finalAnswer = "";
		System.out.println(question);
		String answer1 = sInt1.next();

		do {
			if(answer1.equalsIgnoreCase("Y")) {
				finalAnswer = answer1;
				valid = true;
			}
			else if(answer1.equalsIgnoreCase("N")) {
				finalAnswer = answer1;
				valid = true;
			}
			else {
				System.out.println(warning);
				answer1 = sInt1.next();
			}//End of If, else if, and else statement
		}while(!valid);

		return finalAnswer;
	}//End of getValidYN() Method




	//Beginning of sumValues() method
	public static int sumValues(ArrayList<Integer> numbers) {

		//Declare variables
		int totalValue = 0;

		for(int i = 0; i < numbers.size(); i++) {
			totalValue = totalValue + numbers.get(i);
		}//End of For Loop

		return totalValue;
	}//End of sumValues() method


}//End of Lab8a