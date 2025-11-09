/*Program: Lab14a
 * Name: Oliver Rivera
 * Date: December 11, 2023
 * Instructor: Sister Kristi Hays
 * Description: Use a HashMap to store Key/Value pairs. Print out data from a HashMap in alphabetical order.
 */

package week14;

import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

public class Lab14a {

	public static void main(String[] args) {
		
		// Create a new HashMap to store the relationship between names and calling
		HashMap<String, String> calling = new HashMap<String, String>();                        //Result is a new
		
		// Populate the HashMap with names and their corresponding calling
		calling.put("Russell M Nelson", "Prophet");
		calling.put("Carl B Cook", "Seventy");
		calling.put("Jeffrey R Holland", "Apostle");
		calling.put("Dieter F Uchtdorf", "Apostle");
		calling.put("Patrick Kearon", "Apostle");
		calling.put("Ulisses Soares", "Apostle");
		calling.put("Gerard Causse", "Presiding Bishop");
		
		//To get the set of Keys from a HashMap, use the keySet() method:
		calling.keySet();
		
		//Create an ArrayList to Store the Keys from the HasMap
		ArrayList<String> callingKeys = new ArrayList<>(calling.keySet());
		
		//Sort the ArrayList in Alphabetical order
		Collections.sort(callingKeys);
		
		// Print the calling of specific General Authorities using printf statements
		for (String authorityName : callingKeys) {
			System.out.printf("%s has the calling of %s %n", authorityName, calling.get(authorityName));
		}//END of For Loop
		
	}//END of Main Method

}//END of Lab14a
