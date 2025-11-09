# Week 06 Labs

Five labs introducing methods (functions) with parameters and return values, demonstrating code reusability and modular programming.

## Labs

### Lab6a - Largest Number Finder
Determines which of three numbers is the largest using a custom method.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week06.Lab6a"
```

**Example:**
```
This program will ask for three whole numbers and determine which one is the largest. 

Please enter the first number: 
45
Please enter the second number: 
82
Please enter the third number: 
31
The largest of the three numbers is: 82

Would you like to play again (Y/N)? 
N
Thank you. Have a nice day. 
```

**Concepts:**
- Creating methods with multiple parameters
- Return values (int)
- Comparison logic in methods
- Method calls from main

---

### Lab6b - Exponent Calculator
Calculates base raised to an exponent using a for loop (without Math.pow).

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week06.Lab6b"
```

**Example:**
```
This program will calculate the exponent to the base

Please enter the base number: 
2
Please enter the exponent number: 
5
Results of 2 to the power of 5 is 32
Do you wish to play again? 
N
Thank you. Have a nice day. 
```

**Concepts:**
- For loops for repeated multiplication
- Accumulator pattern (temp variable)
- Mathematical operations without library methods
- Power/exponent calculations

---

### Lab6c - Number Range Checker
Tests whether a number falls between two other numbers using a boolean method.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week06.Lab6c"
```

**Example:**
```
This program will take three numbers and see if the middle of the three numbers resides between the other two numbers. 

Please enter your low number: 
10
Please enter a test number to see if it belongs in between your low number and your high number: 
25
Please enter your high number: 
50
25 Does lie between the number: 10 and 50.
Do you wish to play again? 
N
Thank you. Have a nice day. 
```

**Concepts:**
- Boolean return values
- Methods that return true/false
- Range checking logic
- Using method results in conditionals

---

### Lab6d - Penny Doubling Calculator
Calculates how many days it takes to become a millionaire by doubling pennies each day.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week06.Lab6d"
```

**Example:**
```
This program will ask the user to enter the amount of pennies. 
It will then calculate how many days it will take to become a millionare by doubling the amount they have each day. 

Please enter the number of pennies you want to start with: 
1

Day		Pennies
-------------------------
0		        1
1		        2
2		        4
3		        8
...
26		 67108864
27		134217728
-------------------------

By starting with 1 pennies and doubling the amount you have each day, it would 
only take 27 days to become a millionare!!! 

Do you wish to play again? (Y/N) 
N
Goodbye. 
```

**Concepts:**
- Void methods (no return value)
- Table formatting with String.format()
- Exponential growth demonstration
- Do-while loops in methods
- Working with large numbers

---

### Lab6e - String Reverser
Reverses user input string using both for loop and while loop implementations.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week06.Lab6e"
```

**Example:**
```
This program will ask the user to enter something and then print out a reversed version of the user's input 
Please enter something: 
Hello World
Using the for loop: The reverse of 'userInput' is: dlroW olleH
Using the while loop: The reverse of 'userInput' is: dlroW olleH

Do you wish to play again? (Y/N) 
N
Goodbye. 
```

**Concepts:**
- String methods returning String
- StringBuilder for efficient string manipulation
- String.length() and charAt() methods
- Comparing for loop vs while loop implementations
- Working backwards through strings

---

## Key Learning Outcomes
- Creating and calling custom methods
- Understanding parameters and return values
- Using different return types (int, boolean, String, void)
- Method signatures and documentation
- Code reusability and modularity
- StringBuilder for string manipulation
- Separating logic into testable units