# Week 04 Labs

Three labs focusing on input validation, loops (do-while), and building an interactive guessing game.

## Labs

### Lab4a - Numeric Input Validation
Validates user input to ensure a whole number is entered, then performs calculations on the validated number.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week04.Lab4a"
```

**Example:**
```
Please enter a whole number: 
abc
Error! Please enter a whole number: 
50
num1 = 50.
num2 = 1050.
num3 = 100.
```

**Concepts:**
- Do-while loops for input validation
- Scanner.hasNextInt() for type checking
- Boolean flags for loop control
- Basic arithmetic operations

---

### Lab4b - Non-Numeric Input Validation
Validates user input for yes/no responses using string comparison.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week04.Lab4b"
```

**Example:**
```
Do you like to code in Java?: 
maybe
Error! Please use Y for yes and N for no. 
Do you like to code in Java?: 
Y
That's Great! Me too 
```

**Concepts:**
- String validation with do-while loops
- .equalsIgnoreCase() for case-insensitive comparison
- Logical OR operator (||)
- Error handling with user-friendly messages

---

### Lab4c - Number Guessing Game
Interactive game where the computer generates a random number (1-100) and the user tries to guess it with feedback.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week04.Lab4c"
```

**Example:**
```
This program is a Guessing Game. 
The computer will generate a random number between 1 and 100. The user will try to guess the number. 
Let's get started! 

I'm thinking of a number between 1 and 100. 
What is your Guess? 
50
Your Guess is too high. Try again. 

What is your Guess? 
25
Your Guess is too low. Try again. 

What is your Guess? 
37
CORRECT! you guessed it in 3 tries! 

Would you like to play Again: 
no
```

**Concepts:**
- Random number generation with Math.random()
- Nested do-while loops for complex program flow
- Multiple validation layers (numeric and non-numeric)
- Game state management with boolean flags
- Counting iterations (guess counter)
- Multiple Scanner objects for different input types

---

## Key Learning Outcomes
- Implementing robust input validation
- Using do-while loops for user interaction
- Working with boolean flags for program control
- Handling both numeric and string validation
- Creating interactive programs with multiple states
- Random number generation and range manipulation