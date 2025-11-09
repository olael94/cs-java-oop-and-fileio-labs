# Week 05 Labs

Three labs practicing for loops, combining validation with iteration, and building practical calculation tools.

## Labs

### Lab5a - Numbers Divisible by X
Displays all numbers within a given range that are divisible by a test number.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week05.Lab5a"
```

**Example:**
```
This program will take three numbers and display each one of them 

Please enter the starting number: 
10
Please enter your ending number: 
50
Please enter your test number: 
7
Here are the numbers between 10 and 50 that are divisible by 7: 

14
21
28
35
42
49
Would You like to play again? 
N
```

**Concepts:**
- For loops with variable ranges
- Modulo operator (%) for divisibility testing
- Multiple numeric input validations
- Repeat functionality with play-again feature

---

### Lab5b - Improved Interest Calculator
Creates a monthly savings plan showing balance growth over time with compound interest, displayed in a formatted table.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week05.Lab5b"
```

**Example:**
```
This program will help you create a savings plan, making a monthly deposit with a specific interest rate, and the number of months you plan on saving. 

Please enter the amount you wish to deposit each month: 
200
Please enter your interest rate: 
5
Please enter the number of months in which you wish to save: 
6

The following table will show the balance pertaining to the information you have given 

Month		Balance

Month 1:	$200.83
Month 2:	$402.50
Month 3:	$605.01
Month 4:	$808.37
Month 5:	$1,012.58
Month 6:	$1,217.63

Interest Earned: $17.633333333333304

Do you wish to perform another calculation?: 
N
Thank you. Have a nice day. 
```

**Concepts:**
- For loops for iterative calculations
- Compound interest formula implementation
- Printf for formatted decimal output
- Table formatting with tabs (\t)
- Accumulation patterns in loops
- Working with double precision for financial calculations

---

### Lab5i - Number Multiplier
Multiplies each number in a given range by a specified multiplier and displays the results.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week05.Lab5i"
```

**Example:**
```
This program will ask you for three numbers: 
  *A starting number 
  *An ending number 
  *A multiplier 
The program will multiply each number between the starting number and ending number by the multiplier.

Please enter the starting number: 
5
Please enter the ending number: 
10
Please enter the multiplier: 
3
Multipling 5 by 3 results in: 15
Multipling 6 by 3 results in: 18
Multipling 7 by 3 results in: 21
Multipling 8 by 3 results in: 24
Multipling 9 by 3 results in: 27
Multipling 10 by 3 results in: 30

Would you like to play again? 
N
Thank you. Have a nice day. 
```

**Concepts:**
- For loops with user-defined ranges
- Basic arithmetic in loops
- Clear output formatting
- Multiple input validation blocks
- Program flow control with boolean flags

---

## Key Learning Outcomes
- Implementing for loops with dynamic ranges
- Combining loops with input validation
- Formatting output with printf and escape sequences
- Working with financial calculations and compound interest
- Creating reusable program structures with play-again functionality
- Managing multiple validation states in complex programs