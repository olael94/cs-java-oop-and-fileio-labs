# Week 07 Labs

Four labs focusing on advanced methods, exception handling, date/time manipulation, and reusable validation utilities.

## Labs

### Lab7a - School Eligibility Checker
Determines what type of school a person is eligible to attend based on their birth year.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week07.Lab7a"
```

**Example:**
```
This program will ask the user to enter a name and a birth year for a potential student. 
The program will then determine what type of school, if any, the potential student is eligible to attend. 

Please enter the name of a potential student: 
Sarah
Please enter the year the potential student was born: 
2010
Sarah is 14 years old. Sarah is elegible to attend Jr High School. 

Do you want to play again: 
N
```

**Concepts:**
- LocalDate for current date operations
- Try-catch blocks for exception handling
- Integer.parseInt() for string to int conversion
- Method chaining (calling methods from methods)
- Age calculation from birth year

---

### Lab7b - Pythagorean Theorem Calculator
Calculates the length of any side of a right triangle given the other two sides using the Pythagorean Theorem.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week07.Lab7b"
```

**Example:**
```
This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides. 

The program will ask the user which side they wish to calculate and the lengths of the other two sides. 
Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle)

Which side of the triagnle do you wish to calculate? (a/b/c)
a
Please enter the lenght of side b:
3
Please enter the lenght of side c:
5
A right triangle with sides 'b' =3 and 'c' (hypotenuse) = 5, has a side 'a' which has a length of: 4.0

Do you want to play again?: 
N
```

**Concepts:**
- Math.sqrt() and Math.pow() for calculations
- Multiple specialized calculation methods
- Reusable input method (getSideLength)
- Conditional method calling based on user choice
- Working with doubles for decimal precision

---

### Lab7i - Input Validation Utilities
Demonstrates reusable validation methods for integers, doubles, and Y/N responses using exception handling.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week07.Lab7i"
```

**Example:**
```
Please enter a whole number: 
abc
Invalid response. Only whole numbers are acceptable.
Please enter a whole number: 
42
The whole number your entered was: 42.

Now we will test your whole number in a math equation...
Adding 10 to your whole number would be: 10 + 42 = 52.

Please enter a decimal-point number: 
3.14
The float your entered was: 3.140000.

Now we will test your floating-point number in a math equation...
Adding 10 to your float would be: 10 + 3.140000 = 13.140000.

Would you like to play again? (Y/N): 
N
```

**Concepts:**
- Try-catch with InputMismatchException
- Generic validation methods with custom messages
- Method parameters for flexibility
- Printf for formatted output
- Building a reusable validation library

---

### usingDateTimeFormatter - Date/Time Formatting Demo
Demonstrates how to format dates and times using Java's DateTimeFormatter class.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week07.usingDateTimeFormatter"
```

**Example:**
```
Before formatting: 2023-10-25T14:30:45.123456
After formatting: 25-10-2023 14:30:45
```

**Concepts:**
- LocalDateTime for current date/time
- DateTimeFormatter for custom formatting
- Pattern strings for date/time display
- Formatting dates for different locales/requirements

---

## Key Learning Outcomes
- Exception handling with try-catch blocks
- Working with Java's date/time API (LocalDate, LocalDateTime)
- Creating reusable utility methods
- InputMismatchException and NumberFormatException
- Method parameters for customizable behavior
- Mathematical operations with Math library
- Building validation frameworks
- Date/time formatting patterns