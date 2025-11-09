# Week 09 Labs

Three labs focusing on menu-driven programs, ArrayList manipulation, and advanced validation with arrays.

## Labs

### Lab9a - Shopping List (Part 1)
Interactive shopping list manager with add, delete, show, and sort functionality.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week09.Lab9a"
```

**Example:**
```
1. Add Items
2. Delete Items
3. Show Items
4. Sort Items
5. Exit
Please enter a command: 1
Add an item to the list or hit 'Enter' when done: 
Milk
 has been added to the Shopping List. 
Add an item to the list or hit 'Enter' when done: 
Eggs
 has been added to the Shopping List. 
Add an item to the list or hit 'Enter' when done: 

2 items have been added to your Shopping List.

1. Add Items
2. Delete Items
3. Show Items
4. Sort Items
5. Exit
Please enter a command: 3
The Shopping List contains the following items: 
[Milk, Eggs]

Please enter a command: 5
Goodbye
```

**Concepts:**
- Menu-driven programs with switch statements
- ArrayList CRUD operations (Create, Read, Update, Delete)
- Collections.sort() for sorting
- Method organization for specific tasks
- User input loops until completion

---

### Lab9b - Shopping List (Part 2)
Enhanced shopping list with item:quantity format and improved display formatting.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week09.Lab9b"
```

**Example:**
```
1. Add Items
2. Delete Items
3. Show Items
4. Sort Items
5. Exit
Please enter a command: 1
Add an item to the list (format: item:quantity, e.g., Milk:2). Press Enter when done:
Milk:2
'Milk:2' has been added to the list!
Add an item to the list (format: item:quantity, e.g., Milk:2). Press Enter when done:
Eggs:12
'Eggs:12' has been added to the list!
Add an item to the list (format: item:quantity, e.g., Milk:2). Press Enter when done:

2 items have been added to your Shopping List.

Please enter a command: 3
------------------------------------
    Shopping List       
------------------------------------
                Milk    2
                Eggs   12
------------------------------------
```

**Concepts:**
- String parsing with indexOf() and substring()
- Formatted output with printf()
- Enhanced for loops (for-each)
- String manipulation and trimming
- Table formatting for better UX

---

### Lab9i - Advanced Validation Utilities
Demonstrates flexible validation methods that accept arrays for range/option validation.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week09.Lab9i"
```

**Example:**
```
Please enter your age: 
25
The whole number your entered was: 25

Now we will test your whole number in a math equation...
In a decade, you will be: 10 + 25 = 35.

Please enter a number between 3 and 18 that represents the number of credit hours you are taking: 
20
Invalid response. You can only take between 3 and 18 credit hours per semester.
Please enter a number between 3 and 18 that represents the number of credit hours you are taking: 
15
The whole number your entered was: 15

Now we will test your whole number in a math equation...
Adding a 3 credit hour class to your schedule would cause your current credit load to be: 3 + 15 = 18.

Please enter the current price for a gallon of gasoline: 
3.89
The float your entered was: 3.89

Now we will test your floating-point number in a math equation...
If the price of gasoline goes up by another $0.50, the price for a gallon of gasoline will then be: 0.50 + 3.89 = $4.39.

Please choose either Chocolate, Vanilla, Strawberry, Pistachio, or Rocky Road: 
Mint
Invalid response. Only 'Chocolate', 'Vanilla', Strawberry, 'Pistachio, and 'Rocky Road' are acceptable answers.
Please choose either Chocolate, Vanilla, Strawberry, Pistachio, or Rocky Road: 
Chocolate
You chose: Chocolate

Would you like to play again? (Y/N): 
N
```

**Concepts:**
- Arrays as method parameters for validation rules
- Flexible validation (with or without ranges)
- Generic validation methods for different types
- Range checking with conditional logic
- Iterating through arrays for string validation
- Building reusable validation library

---

## Key Learning Outcomes
- Creating menu-driven applications
- Switch statements for command processing
- ArrayList manipulation and iteration
- Collections framework usage
- String parsing and manipulation (indexOf, substring)
- Arrays as method parameters
- Flexible method design with optional constraints
- Formatted output with printf()
- Building reusable utility methods
- User experience considerations (formatted tables, clear messages)