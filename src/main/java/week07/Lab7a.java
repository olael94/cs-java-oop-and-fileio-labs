/*Program: Lab7a
 * Name: Oliver Rivera
 * Date: October 23, 2023
 * Instructor: Sister Kristi Hays
 * Description: To check eligibility
 */

package week07;
import java.util.Scanner;
import java.time.LocalDate;

public class Lab7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner checker = new Scanner(System.in);//Scanner for user input

		//Declare Variables
		String name;
		String age;
		boolean ageTrue = false;
		boolean gameRun = false;
		String ansW;

		System.out.println("This program will ask the user to enter a name and a birth year for a potential student. \n" 
				+ "The program will then determine what type of school, if any, the potential student is eligible to attend. \n");

		//PRIMARY Do-WHile Loop
		do {
			System.out.println("Please enter the name of a potential student: ");
			name = checker.nextLine();

			//Year Do-While Loop
			do {
				System.out.println("Please enter the year the potential student was born: ");
				age = checker.nextLine();

				try {
					Integer.parseInt(age);
					ageTrue = true;
				}

				catch(NumberFormatException e) {
					System.out.println("Error! Please enter a whole number for the year: ");
					ageTrue = false;
				}//End of Try and catch

			}while(!ageTrue);//End of Do-While Loop in line 32


			//Calling checkElegibility method
			checkEligibility(name, Integer.parseInt(age));

			//GameRUN Do-While Loop
			do {
				System.out.println("\nDo you want to play again: ");
				ansW = checker.nextLine();
				gameRun = ansW.equalsIgnoreCase("Y") || ansW.equalsIgnoreCase("N");
				if(!gameRun) {
					System.out.println("Error! Please use Y for yes or N for no. ");
				}//End of if statement of validation
			}while(!gameRun);//for the N for no will stop game.


		}while(ansW.equalsIgnoreCase("Y"));		


		checker.close();//Closes String Scanner
	}//End of Main Method

	//checkEligibility Method
	public static void checkEligibility(String name, Integer age) {

		//If and else if statement for age table with grades
		if(calculateAge(age) <= 4) {
			System.out.println(name + " is " + calculateAge(age) + " years old. " + name + " is not elegible to attend school. ");
		}
		else if(calculateAge(age) <= 11) {
			System.out.println(name + " is " + calculateAge(age) + " years old. " + name + " is elegible to attend Elementary School. ");
		}
		else if(calculateAge(age)<= 14) {
			System.out.println(name + " is " + calculateAge(age) + " years old. " + name + " is  elegible to attend Jr High School. ");
		}
		else if(calculateAge(age)<= 17) {
			System.out.println(name + " is " + calculateAge(age) + " years old. " + name + " is  elegible to attend High School. ");
		}
		else if (calculateAge(age)>= 18){
			System.out.println(name + " is " + calculateAge(age) + " years old. " + name + " is  elegible to attend College. yay! you made it!");
		}//End of if and else if statement

	}//End of checkEligibility method


	//calculateAge method
	public static Integer calculateAge(Integer x) {
		LocalDate rightNow = LocalDate.now();
		int thisYear = rightNow.getYear();
		int age = thisYear - x;

		return age;
	}//End of calculateAge method


}//End of Lab7a