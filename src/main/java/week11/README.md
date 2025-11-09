# Week 11 Labs

Two labs focusing on debugging techniques and advanced switch statement usage.

## Labs

### Lab11a - Debugging Math Games
A debugging exercise featuring a menu-driven math games application. The lab contains intentional bugs that need to be identified and fixed using debugging tools and techniques.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week11.Lab11a"
```

**Example:**
```
This program will give the user the opportunity to try several different math games.
Select a math game from the menu to play.

1: Find the Sum
2: Find the Average
3: Find the Biggest
4: Exit
Please enter a command: 1

You will enter a series of numbers (either whole or decimal) and we will find the sum.

Please enter a number (or just hit enter to finish): 10
Please enter a number (or just hit enter to finish): 20
Please enter a number (or just hit enter to finish): 30
Please enter a number (or just hit enter to finish): 

Number      Running Total
10.00           10.00
20.00           30.00
30.00           60.00
-----------------------
The sum is: 60.00
```

**Bugs Fixed:**
1. Missing `break` in switch case 4 (Exit option)
2. `result` variable not assigned in `biggestNumber()` call
3. Loop condition in `sumNumbers()` excluded last element
4. Format specifier error in `avgNumbers()` (used %d instead of %f for doubles)
5. Printf formatting issues in `biggestNumber()`

**Concepts:**
- Using debugger tools (breakpoints, step through, watch variables)
- Identifying logic errors
- Format specifier debugging (printf)
- Switch statement flow control
- ArrayList iteration bugs
- Variable assignment tracking

---

### Lab11b - Apostle Lookup with Switch
Interactive program that displays apostle names based on their order of calling using comprehensive switch statements.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week11.Lab11b"
```

**Example:**
```
This program will show the name of an apostle based on the order they were called with President Nelson as #1 
Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): 1

Number 1 is: Russell M. Nelson

This program will show the name of an apostle based on the order they were called with President Nelson as #1 
Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): 7

Number 7 is: Quentin L. Cook

This program will show the name of an apostle based on the order they were called with President Nelson as #1 
Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): 20

Number 20 is: Invalid input. No apostle found for the given number.

This program will show the name of an apostle based on the order they were called with President Nelson as #1 
Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): 

Program Done.
```

**Concepts:**
- Extended switch statements with 15+ cases
- Integer.parseInt() for string to int conversion
- Try-catch for NumberFormatException
- Graceful exit with empty input check
- Default case for invalid input handling
- Infinite loop with break condition
- User-friendly error messages

---

## Key Learning Outcomes
- Debugging techniques and tools
- Identifying common programming errors:
    - Missing break statements
    - Off-by-one errors in loops
    - Format specifier mismatches
    - Unassigned variable results
- Switch statement best practices
- Input validation with try-catch
- Printf formatting and debugging
- Exception handling strategies
- Building robust user interfaces
- Loop control with break statements
- Testing and quality assurance mindset