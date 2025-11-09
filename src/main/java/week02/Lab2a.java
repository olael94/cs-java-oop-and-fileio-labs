/*Program: Lab2a
 * Name: Oliver Rivera
 * Date: September 18, 2023
 * Instructor: Sister Kristi Hays
 * Description: Hello World Revised
 */

package week02;
import java.util.Scanner;

public class Lab2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);//for responses

		//Ask the user's name
		System.out.println("What is your name? ");
		String name = in.nextLine();// This will allow the user to write their name on the screen
		System.out.println("Hello " + name + " It is nice to meet you. \n");// use\n to generate a space after print line

		//Ask the user's location
		System.out.println("Where are you from? ");
		String location = in.nextLine();// This will allow the user to write their location
		System.out.println("Great! " + location + " Sounds like a fun place to visit. \n");// use\n to generate a space after print line

		//Ask the user's favorite dessert
		System.out.println("What is your favorite dessert? ");
		String dessert = in.nextLine();// This will allow the user to write their location
		System.out.println("I hope you like coding JavaScript as much as you like to eat " + dessert);// use\n to generate a space after print line
		System.out.println();

		//Ask the user's hobbies
		System.out.println("What are your some of your hobbies? ");
		String hobbies = in.nextLine();// This will allow the user to write their location
		System.out.println("I hope you can remember the good feelings you have while " + hobbies + " so they can motivate you to continue your coding journey \n");// use\n to generate a space after print line

		//Ask the user's favorite movie
		System.out.println("What is your favorite movie? ");
		String movie = in.nextLine();// This will allow the user to write their location
		System.out.println(movie + " Sounds like a movie you can watch on a rainy day while eating popcorn and chilling at home \n");// use\n to generate a space after print line

		in.close();

	}// End of Main method

}//End of Lab2a
