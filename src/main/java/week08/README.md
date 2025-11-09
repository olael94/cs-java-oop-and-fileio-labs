# Week 08 Labs

Two labs introducing ArrayLists, demonstrating dynamic collections and list manipulation operations.

## Labs

### Lab8a - ArrayList Sum Calculator
Allows users to enter multiple numbers into an ArrayList and calculates their sum.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week08.Lab8a"
```

**Example:**
```
This program will ask the user for a list of numbers  and those numbers to find a total.
Please enter a number or hit enter when done. 
10
Please enter a number or hit enter when done. 
25
Please enter a number or hit enter when done. 
15
Please enter a number or hit enter when done. 

Array Index - Item
0                               10
1                               25
2                               15
There are 3 items in the ArrayList.
The sum total in the ArrayList is 50
Would you like to play again?: 
N
thank you for Playing. 
```

**Concepts:**
- ArrayList creation and initialization
- ArrayList.add() for adding elements
- ArrayList.get() for accessing elements
- ArrayList.size() for getting length
- ArrayList.clear() for resetting
- Passing ArrayLists to methods
- Dynamic input (enter key to finish)
- Exception handling with Integer.parseInt()

---

### Lab8b - ArrayList Duplicate Finder
Extends Lab8a by adding functionality to identify and display duplicate numbers in the list.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week08.Lab8b"
```

**Example:**
```
This program will ask the user for a list of numbers  and those numbers to find a total. 

Please enter a number (or hit enter when done): 
5
Please enter a number (or hit enter when done): 
10
Please enter a number (or hit enter when done): 
5
Please enter a number (or hit enter when done): 
20
Please enter a number (or hit enter when done): 
10
Please enter a number (or hit enter when done): 

Array Index - Item
0                               5
1                               10
2                               5
3                               20
4                               10
There are 5 items in the ArrayList.
The sum total in the ArrayList is 50
The following numbers were duplicated in the ArrayList: [5, 10]

Would you like to play again?: 
N
thank you for Playing. 
```

**Concepts:**
- ArrayList manipulation and searching
- ArrayList.contains() for checking existence
- ArrayList.subList() for creating views
- Returning ArrayLists from methods
- Nested loops for duplicate detection
- Avoiding duplicate entries in results
- Advanced ArrayList operations

---

## Key Learning Outcomes
- Understanding dynamic collections vs arrays
- Working with generic types (ArrayList\<Integer\>)
- ArrayList methods: add(), get(), size(), clear(), contains()
- Passing collections as method parameters
- Returning collections from methods
- Algorithm design for duplicate detection
- Try-catch for robust user input handling
- Building on previous code (Lab8b extends Lab8a functionality)