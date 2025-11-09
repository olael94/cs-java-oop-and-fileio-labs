# Week 14 Labs

Three labs covering final exam review topics and introducing HashMaps for key-value pair storage.

## Labs

### FinalExam1 - Ward Member Counter
Calculates the total number of adult members in a ward based on user input, demonstrating input validation and formatted output.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week14.FinalExam1"
```

**Example:**
```
Please enter your name: Oliver


Please enter the name of your Ward: Riverside


Please enter the approximate number of adult males in the ward: 120


Please enter the approximate number of adult females in the ward: 135


There are 255 adult members in Oliver's Riverside ward.
```

**Concepts:**
- Multiple Scanner objects for different input types
- Reusable input validation methods
- Printf for formatted output with multiple variables
- Simple arithmetic operations
- User-friendly prompts and output

---

### FinalExam2 - Number List Analyzer
Allows users to enter a list of numbers, then calculates their sum and identifies the largest number.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week14.FinalExam2"
```

**Example:**
```
In this program, you will ask the user to enter a list of numbers.
The program will then find the sum of the numbers and determine which of the numbers is the largest.

Please enter a number (or just hit enter to finish): 
15
Please enter a number (or just hit enter to finish): 
42
Please enter a number (or just hit enter to finish): 
8
Please enter a number (or just hit enter to finish): 
23
Please enter a number (or just hit enter to finish): 
67
Please enter a number (or just hit enter to finish): 

The sum of the list of numbers is: 155.
The largest number in the list is: 67.
```

**Concepts:**
- ArrayList operations (add, get, size)
- Dynamic input collection
- Aggregation methods (sum calculation)
- Finding maximum value in a collection
- Integer.parseInt() for string conversion
- ArrayList.clear() for resetting data
- Methods that process collections

---

### Lab14a - Church Leadership HashMap
Introduces HashMap data structure to store and display church leadership names and their callings in alphabetical order.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week14.Lab14a"
```

**Example Output:**
```
Carl B Cook has the calling of Seventy 
Dieter F Uchtdorf has the calling of Apostle 
Gerard Causse has the calling of Presiding Bishop 
Jeffrey R Holland has the calling of Apostle 
Patrick Kearon has the calling of Apostle 
Russell M Nelson has the calling of Prophet 
Ulisses Soares has the calling of Apostle 
```

**Concepts:**
- HashMap data structure (key-value pairs)
- HashMap.put() for adding entries
- HashMap.get() for retrieving values
- HashMap.keySet() to access all keys
- Converting Set to ArrayList for sorting
- Collections.sort() for alphabetical ordering
- Enhanced for loop for iteration
- Printing formatted output with printf

---

## Key Learning Outcomes
- Input validation patterns
- Working with multiple data types
- ArrayList manipulation and analysis
- Aggregate operations (sum, max)
- HashMap fundamentals:
    - Creating and populating HashMaps
    - Key-value pair relationships
    - Retrieving data by key
    - Iterating through HashMap entries
- Converting between collection types (Set to ArrayList)
- Sorting collections
- Printf formatting with multiple variables
- Building complete, user-friendly programs
- Code organization with helper methods

## HashMap Basics
HashMaps store data as key-value pairs, allowing fast lookups by key:
```java
// Create a HashMap
HashMap<String, String> map = new HashMap<>();

// Add entries
map.put("key", "value");

// Retrieve value by key
String value = map.get("key");

// Get all keys
Set<String> keys = map.keySet();

// Iterate through entries
for (String key : map.keySet()) {
    System.out.println(key + ": " + map.get(key));
}
```

This week introduces a crucial data structure for creating associations between data, commonly used for:
- Dictionaries/lookups
- Caching
- Counting occurrences
- Configuration storage