/*Program: FinalExam2
 * Name: Oliver Rivera
 * Date: December 11, 2023
 * Instructor: Sister Kristi Hays
 * Description: Sum List of numbers and finding the largest
 */

package week14;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {
		
		// Create a Scanner object for user input
		Scanner nIn = new Scanner(System.in);//For user Input.

		// Create an ArrayList to store the entered numbers
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		//Declare variables
		String answer = "";
		int num = 0;

		//This sets the values for the number repetition
		boolean loopC = true;
		numbers.clear();

		//Introduce the program 
		System.out.println("In this program, you will ask the user to enter a list of numbers.\n" 
				+ "The program will then find the sum of the numbers and determine which of the numbers is the largest.\n");

		//Number Input While Loop
		while(loopC) {
			System.out.println("Please enter a number (or just hit enter to finish): ");
			answer = nIn.nextLine();

			if(answer.equals("")) {
				loopC = false;
			}

			else {
				num = Integer.parseInt(answer);
				numbers.add(num);
			}//End of If and else Statement

		}//End of Number While Loop

		//Display the results
		System.out.println("The sum of the list of numbers is: " + addNumbers(numbers) + ".");
		System.out.println("The largest number in the list is: " + largestNumber(numbers) + ".");

		//Close Scanner
		nIn.close();


	}//END of Main Method

	
	
	//Beginning of addNumbers() method Calculate the sum of the numbers in the ArrayList
	public static int addNumbers(ArrayList<Integer> numbers) {

		/*//This will verify that the List is not empty
		if(numbers.isEmpty()) {
			throw new IllegalArgumentException("The list is empty");
		}//END of throw if statement*/

		//Declare variables
		int totalValue = 0;

		//Iterate thru all numbers and add them together
		for(int i = 0; i < numbers.size(); i++) {
			totalValue = totalValue + numbers.get(i);
		}//End of For Loop

		return totalValue;
	}//End of addNumbers() method

	
	
	//Beginning of largestNumber() method Find the largest number in the ArrayList
	public static int largestNumber(ArrayList<Integer> numbers) {

		/*//This will verify that the list is not empty
		if(numbers.isEmpty()) {
			throw new IllegalArgumentException("The list is empty");
		}//END of throw if statement*/

		//Start getting information from The ArrayList starting from index 0
		int largestNumber = numbers.get(0);
		
		//Loop thru the numbers in the ArrayList and find the largest
		for(int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);
			if(num > largestNumber) {
				largestNumber = num;
			}//END of if Statement
		}//END of For Loop

		return largestNumber;

	}//END of largetNumber()

}//END of FinalExam2
