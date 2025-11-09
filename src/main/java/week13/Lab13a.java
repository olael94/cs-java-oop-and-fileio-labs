/*Program: Lab13a
 * Name: Oliver Rivera
 * Date: December 4, 2023
 * Instructor: Sister Kristi Hays
 * Description: Open a file, write data to it and close the file, Write Predicate Methods
 */

package week13;

import java.util.Scanner;
//import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.function.Predicate;

public class Lab13a {

	public static void main(String[] args) {

		String fileName = "Pwd.txt";
		//File inFile = new File(fileName);
		InputStream inFile = Lab13a.class.getResourceAsStream("/"+ fileName);		// Load file from the classpath (src/main/resources)
		Scanner file = null;

		try {
			//Open the Input File for Reading
			file = new Scanner(inFile);

			// Create PrintWriter objects for writing to validpwd.txt and invalidpwd.txt
			PrintWriter validWriter = new PrintWriter("data/" + "validpwd.txt");
			PrintWriter invalidWriter = new PrintWriter("data/" + "invalidpwd.txt");

			// Process each line in the input file
			while (file.hasNext()) {
				String password = file.nextLine();

				// Check if the password meets all criteria
				if (hasLength().test(password) && hasUpper().test(password) && hasLower().test(password) 
						&& hasNumber().test(password) && hasSpecial().test(password)) {
					// Write valid password to validpwd.txt
					validWriter.println(password);
				} 

				else {	
					// Write invalid password statement to invalidpwd.txt
					invalidWriter.println(String.format("%-15s Invalid password!  %s", password, getInvalidReason(password)));
				}//END of if and else Statement

			}//END of While Loop

			// Close the PrintWriter objects. This will also close the validpwd.txt and invalidpwd.txt files
			validWriter.close();
			invalidWriter.close();

		}//END of Try
		catch(Exception e) {
			System.out.printf("File not found. %s not found in current location. \n", fileName);
		}//END of Catch 
		finally {
			if (file != null) {
				// Close the input file
				file.close();
			}//END of if statement
		}//END of finally statement




	}//END of main() method


	/*text != null expression checks whether the reference variable text is not pointing to a null value.
	perform this check before attempting to use an object to prevent null pointer exceptions.*/



	/*hasLength(): Accepts a text variable as an argument and returns true if the text variable
	 * has at least 8 characters in length.
	 */
	public static Predicate<String> hasLength() {
		return text -> text != null && text.length() >= 8;
	}

	/*hasUpper(): Accepts a text variable as an argument and returns true if the text variable
	 * has as least one (1) upper case character and returns false if it does not.
	 */

	public static Predicate<String> hasUpper() {
		//
		return text -> text != null && !text.equals(text.toLowerCase());
	}

	/*hasLower(): Accepts a text variable as an argument and returns true if the text variable
	 * has as least one (1) lower case character and returns false if it does not.
	 */
	public static Predicate<String> hasLower() {
		return text -> text != null && !text.equals(text.toUpperCase());
	}

	/*hasNumber(): Accepts a text variable as an argument and returns true if the text variable 
	 * has as least one (1) number and returns false if it does not.
	 */
	public static Predicate<String> hasNumber() {
		return text -> text != null && text.matches(".*\\d.*");
	}

	/*hasSpecial(): Accepts a text variable as an argument and returns true if the text variable 
	 * has as least one (1) of the designated special characters and returns false if it does not.
	 * Special Character List: ['@','#','%','-','&','*']
	 */
	public static Predicate<String> hasSpecial() {
		return text -> text != null && text.matches(".*[@#%\\-&*].*");
	}

	//getInvalid Reason
	public static String getInvalidReason(String password) {

		String reasons = "";		//new StringBuilder();		//A builder stores temporarily the text. use builder if using .append otherwise use only String

		if (!hasLength().test(password)) {
			reasons = "Password must be at least 8 characters long."; //Use reasons.apend("") if you want to list all reasons
		}
		else if (!hasUpper().test(password)) {
			reasons = "Password must contain at least one upper case character.";
		}
		else if (!hasLower().test(password)) {
			reasons = "Password must contain at least one lower case character.";
		}
		else if (!hasNumber().test(password)) {
			reasons = "Password must contain at least one number.";
		}
		else if (!hasSpecial().test(password)) {
			reasons = "Password must contain at least one special character {@, #, %, -, &, *}.";
		}
		return reasons.toString();
	}		//END of getInvalidReason

}//END of Lab13a
