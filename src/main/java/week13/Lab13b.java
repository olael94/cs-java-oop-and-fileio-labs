package week13;

//import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab13b {

	public static void main(String[] args) {

		//This will locate the file name on the project folder. 
		String fileName = "Student Assignment Scores.csv";
		//File fileAssignment = new File(fileName);
		InputStream assignmentStream = Lab13b.class.getResourceAsStream("/" + fileName);
		Scanner assignmentScores = null;//Will read file not input answers

		String fileName2 = "Warning Letter to Student -.txt";
		//File fileWarning = new File(fileName2);
		InputStream warningStream    = Lab13b.class.getResourceAsStream("/" + fileName2);
		Scanner warningLetter = null;//Will read file not input answers
		
		String letter = null;

		try {
			//Open the Input File for Reading
			assignmentScores = new Scanner(assignmentStream);
			warningLetter = new Scanner(warningStream);

			//This will be printed to the console once.
			System.out.println("Creating letters for:\n");
			
			//Saving the entire letter
			warningLetter.useDelimiter("\\Z");
			letter = warningLetter.next();

			while(assignmentScores.hasNext()) {
				

				String row = assignmentScores.nextLine();
				String[] studentAssignments = row.split(",");

				//Check for missing assignments
				if(hasMissingAssignments(studentAssignments)) {
					//Extract student name from file
					String studentName = studentAssignments[0];

					// PRINT STUDENT NAME IN CONSOLE FOR EACH GENERATED LETTER
					System.out.println(studentName);

					//Create a PrintWriter for writing the warning letter. This will also define the file name for the personalized letter. 
					PrintWriter writer = new PrintWriter("data/" + "Warning Letter to Student - " + studentName + ".txt");
					
					//START WRITING THE WARNING LETTER
					// Write the first line with student name
					writer.println("Dear " + studentName + ",");
					writer.println(letter);
					writer.println("");

					// Write the list of missing assignments
					for (int i = 1; i < studentAssignments.length; i++) {
						if ("0".equals(studentAssignments[i])) {
							writer.println("Assignment " + i);
						}//END of if statement
					}//END of FOR loop

					//Close the PrintWriter. Finish Writing warning letter
					writer.close();

				}//END of if hasMissingAssignments statement

			}//End of While

		}//End of Try
		catch(Exception e) {
			System.out.printf("File not found. %s not found in current directory. \n ", fileName);
			System.out.printf("File not found. %s not found in current directory. \n ", fileName2);
		}//End of Catch

		finally {
			if (assignmentScores != null && warningLetter != null) {
				// Close the input file
				assignmentScores.close();
				warningLetter.close();
			}//END of if statement
		}//END of finally statement

	}//END of Main
	
	
	//hasMissingAssignments() method
	public static boolean hasMissingAssignments(String[] assignments) {
        for (int i = 1; i < assignments.length; i++) {
        	
            if ("0".equals(assignments[i])) {
                return true;
            }//END of if statement
            
        }//END of For loop
        return false;
    }//END of hasMissingAssignments() method
	

}//END of Lab13b
