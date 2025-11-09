/* Program: Lab10a
 * Name: Oliver Rivera
 * Date: November 13, 2023
 * Instructor: Sister Kristi Hays
 * Description: Reading Data from Text Files - Missing Assignments
 */

package week10;

//import java.io.File;
import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class Lab10a {

	public static void main(String[] args) {

		//This will locate the file name on the project folder. 
		String fileName = "Student Assignment Scores.csv";
//		File inFile = new File(fileName);
        InputStream inFile = Lab10a.class.getResourceAsStream("/"+ fileName);		// Load file from the classpath (src/main/resources)
		Scanner file = null;//Will read file not input answers

		try {
			file = new Scanner(inFile);
		}//End of Try
		catch(Exception e) {
			System.out.printf("File not found. %s not found in current directory. \n ", fileName);
		}//End of Catch


		while(file.hasNext()) {
			String row = file.nextLine();
			System.out.println(row);
		}//End of While

		file.close();//Close scanner that reads the file. 

	}// End of Main Method

}//End of Lab10a