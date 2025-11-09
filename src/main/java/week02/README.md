# Week 02 Labs

Three labs focusing on user input with Scanner, variables, and basic calculations.

## Labs

### Lab2a - Interactive Questionnaire
Prompts the user with personal questions and responds with friendly messages.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week02.Lab2a"
```

**Example:**
```
What is your name? 
Oliver
Hello Oliver It is nice to meet you. 

Where are you from? 
Utah
Great! Utah Sounds like a fun place to visit. 

What is your favorite dessert? 
Cheesecake
I hope you like coding JavaScript as much as you like to eat Cheesecake
```

**Concepts:**
- Scanner for user input
- String variables and concatenation
- Interactive console programs

---

### Lab2b - Shape Area Calculator
Calculates areas of a square and rectangle based on user-provided dimensions.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week02.Lab2b"
```

**Example:**
```
Please enter the width of the square: 
5
Please enter the width of the rectangle: 
8
Please enter the height of the rectangle: 
3
The area of the square with a width of 5 is 25.
The area of the rectangle with a width of 8 and a height of 3 is 24.
```

**Concepts:**
- Integer input with Scanner
- Mathematical operations
- Formatted output with multiple variables

---

### Lab2c - Savings Account Calculator
Computes the ending balance of a savings account after 6 months with monthly deposits and compound interest.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week02.Lab2c"
```

**Example:**
```
Please enter the amount to be deposited each month: 
100
Please enter the annual interest rate percent: 
5
The ending balance after 6 months is: $615.20203
```

**Concepts:**
- Float variables for decimal calculations
- Percentage to decimal conversion
- Compound interest calculations
- Step-by-step accumulation logic

---

## Key Learning Outcomes
- Working with Scanner for different data types (String, int, float)
- Variable declaration and manipulation
- User interaction and output formatting
- Basic mathematical operations and formulas