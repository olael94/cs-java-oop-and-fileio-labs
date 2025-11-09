/*Program: Lab12a
 * Name: Oliver Rivera
 * Date: November 27, 2023
 * Instructor: Sister Kristi Hays
 * Description: Saving a Shopping List to Storage
 */

package week12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Lab12a {

	/* main() method displays a menu to the user and asks them to select a command.
		  The method will continue to display the menu to the user until they wish to quit by selecting 'Exit' from the menu.
		  The method also creates a new, empty shoppingList of type ArrayList<String>
		  Based on the user input, the appropriate method will be called to perform actions on the shoppingList.
		  Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
	 */
	public static void main(String[] args) {
		//Initialize variables
		Scanner sIn = new Scanner(System.in);						//Input Scanner for String
		ArrayList<String> shoppingList = new ArrayList<String>();	//ArrayList for shoppingList
		String choice;												//Holds user input of type String
		boolean done = false;										//Keeps program running until user wants to quit

		// Keep running the program until the user quits
		do{
			//Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Save List");
			System.out.println("6. Exit");
			System.out.print("Please enter a command: ");
			choice = sIn.nextLine(); 

			//Call the appropriate method for the choice selected.
			switch (choice) { 
			case "1":	//Add items to the Shopping List
				System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
				break;
			case "2":	//Delete items from the Shopping List
				System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
				break;
			case "3":	//Show the items in the Shopping List
				showItems(shoppingList);
				break;
			case "4":	//Sort the items in the Shopping List
				sortItems(shoppingList);
				break;
			case "5":	//Save List 
				saveList(sIn, shoppingList, "Shopping List.txt");				//ADDED IN CLASS This is where the file name will be selected for the saved file.
				break;
			case "6":	//Exit the program 
				System.out.println("\nGoodbye");
				done = true;
				break;
			default:	//Handles all input that is not between 1-5
				System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
			} //End of switch (choice) 
		}while(!done);  //Keep running the program until the user quits
	}//end of main()


	//////////////////////////////////////////////
	// STUDENTS, FILL IN THE METHOD STUBS BELOW://
	//  addItems()								//
	//	deleteItems()							//
	//	showItems()								//
	//	sortItems()								//
	//////////////////////////////////////////////


	//saveList() method to save objects to shopping list ADDED IN CLASS
	public static void saveList(Scanner sIn, ArrayList<String> shoppingList, String FILENAME) {
		String[] choices = {"Y", "y", "N", "n"};
		String confirmed = getChoice(sIn, "Are you sure you wish to overwrite the " + FILENAME 
				+ " file with your current list? (Y/N)", "Invalid. Please enter Y for yes and N for no", choices);

		if(confirmed.equalsIgnoreCase("Y")) {
			PrintWriter writer = null;		//import text
			try {
				// save file to data folder
				writer = new PrintWriter("data/"+FILENAME);
			}catch(FileNotFoundException e) {
				System.out.printf("File Error: Unable to create a file: %s\n", FILENAME);
			}//End of Try AND Catch

			for(String item : shoppingList) {
				writer.println(item);
			}//END of For Loop

			writer.flush();// to wipe information written on the writer
			writer.close();
			System.out.println("Shopping List was saved.");
		}

		else {
			System.out.println("Shopping list was not able to save. ");
		}//END of if and else Statements

	}//END of saveList() method


	//getChoice method
	public static String getChoice(Scanner sIn, String question, String warning, String[] validMenuChoices) {

		//Declare variables
		String choice;
		boolean valid = false;

		do {
			System.out.println(question);
			choice = sIn.nextLine();

			for(String s : validMenuChoices) {

				if(s.equals(choice)) {
					return choice;
				}//END of if statement
			}//END of For Loop
			System.out.println(warning);
		}while(!valid);

		return "";
	}//END of getChoice method



	/** addItems() method asks the user to enter an item to be stored in the shoppingList and then adds the item to the shoppingList ArrayList.
	 * The user may enter as many items as they want, hitting ENTER to stop entering items and return to main().
	 * Each time the user enters an item into the list, a message will be displayed showing the item entered in the following format:
	 *     '<item>' has been added to the Shopping List.  [Example:  'Eggs' has been added to the Shopping List.]
	 * Returns the number of items added to the shoppingList
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {//ADDED IN CLASS 11/06/2023
		String answer = "";
		boolean done = false;
		int count = 0;
		int colonIndex = -1;
		String item = "";
		String quantity = "";
		String whole = "";

		//PRIMARY Do-While Loop
		do {
			System.out.println("Add an item to the list format: item:qty (or just hit enter when done): ");
			answer = sIn.nextLine().trim();

			if (answer.equals("")) {
				done = true;  // user pressed Enter to stop
			} 
			else {
				colonIndex = answer.indexOf(':');

				if (colonIndex < 0) {
					System.out.println("Error! Use format item:qty (e.g., Milk:2).");
					continue;
				}

				item = answer.substring(0, colonIndex).trim();
				quantity = (colonIndex + 1 < answer.length()) ? answer.substring(colonIndex + 1).trim() : "";

				if (item.isEmpty() || quantity.isEmpty()) {
					System.out.println("Error! Both item and quantity are required (e.g., Bread:1).");
					continue;
				}

				// Ensure quantity is a whole number
				try {
					Integer.parseInt(quantity);
				} catch (NumberFormatException nfe) {
					System.out.println("Error! Quantity must be a number (e.g., Eggs:12).");
					continue;
				}

				whole = item + ":" + quantity;
				shoppingList.add(whole);
				System.out.println("\n'" + whole + "' has been added to the list!");
				count++;
			}

		}while(!done);//End of PRIMARY Do-While Loop


		return count;

	}//end of method addItems(ArrayList<String>)


	/** deleteItems() method asks the user to enter an item to be deleted from the shoppingList and then deletes the item from the shoppingList ArrayList.
	 * The user may delete as many items as they want, hitting ENTER to stop deleting items and return to main().
	 * Each time the user deletes an item from the list, a message will be displayed showing the item deleted in the following format:
	 *     '<item>' has been deleted to the Shopping List.  [Example:  'Peaches' has been deleted to the Shopping List.]
	 * If the user tries to delete an item not in the list, a message will be displayed indicating the error and showItems() will be called.
	 * Returns the number of items deleted from the shoppingList
	 */	
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {//ADDED IN CLASS 11/06/2023

		String answer = "";
		int count = 0;
		boolean done = false;

		do {
			System.out.println("Delete an item from the list or press 'Enter' when done: ");
			answer = sIn.nextLine();

			if(answer.equals("")) {
				done = true;
			}

			else if (shoppingList.contains(answer)) {
				shoppingList.remove(answer);
				count++;
				System.out.println("" + answer + "has been removed from the shopping list. ");
			}

			else {
				System.out.println("Invalid! " + answer + "is not an item on the list. ");
				System.out.println("The shopping list contains the following items: ");
				showItems(shoppingList);
			}//End of if, else if, and else statement


		}while(!done);

		return count;		

	}//end of method deleteItems(ArrayList<String>)


	/** showItems() method simply displays the contents of the shoppingList ArrayList in it's simplest form:
	 * Example output:
	 * 
	 * The Shopping List contains the following items:
	 * [item-1, item-2, item-n]
	 */	
	public static void showItems(ArrayList<String> shoppingList) {//ADDED IN CLASS

		System.out.println("------------------------------------");
		System.out.println("    Shopping List       ");
		System.out.println("------------------------------------");

		for(String item : shoppingList) {
			int index = item.indexOf(":");
			String first = item.substring(0, index);
			String second = item.substring(index + 1);

			System.out.printf("%20s%5s" + "\n" , first, second);
		}//End of For Loop

		System.out.println("------------------------------------");

	}//end of method showItems(ArrayList<String>)


	/** sortItems() method sorts the items in the shoppingList ArrayList, then calls showItems() to display the sorted list.
	 * Example output:
	 * The Shopping List has been sorted.
	 * 
	 * The Shopping List contains the following items:
	 * [item-1, item-2, item-n]
	 */	
	public static void sortItems(ArrayList<String> shoppingList) {//ADDED IN CLASS 11/06/2023

		Collections.sort(shoppingList);
		System.out.println("The Shopping List has been sorted. \n The Shopping List contains the following items: \n"
				+ shoppingList);


	}//end of method sortItems(ArrayList<String>)

}
