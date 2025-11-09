# Week 03 Labs

Three labs practicing conditional logic with if/else statements and nested conditionals.

## Labs

### Lab3a - Shirt Size Selector
Determines the appropriate shirt size based on chest measurement in inches.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week03.Lab3a"
```

**Example:**
```
This program will help you decide the shirt size you need when your measurement is given in a whole number as inches. 
Please enter your chest size in inches: 
41
With that measurement of 41 needs to order a size L. 
```

**Concepts:**
- If/else if/else statements
- Comparison operators
- Range-based conditionals

---

### Lab3b - BMI Calculator
Calculates Body Mass Index and provides health classification based on standard BMI ranges.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week03.Lab3b"
```

**Example:**
```
In this program we will calculate your BMI (Body Mass Index.) 

Please enter your height in inches: 
70
Please enter your weight in pounds: 
180
Your BMI is: 25.82448979591837 Your BMI classification is: Overweight. 
```

**Concepts:**
- Unit conversion (pounds to kg, inches to meters)
- Math.pow() for exponentiation
- Double precision calculations
- Multi-range conditionals

---

### Lab3c - Church Class Assignment
Determines which Sunday class a church member should attend based on age and gender.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week03.Lab3c"
```

**Example:**
```
This program will ask a member's age and gender and determine which class they should attend on Sunday. 

Please enter memeber's age: 
15
Please enter member's Gender: 
Female
The member should attend Young Women's. 
```

**Concepts:**
- Nested if statements
- String comparison with .equalsIgnoreCase()
- Multiple Scanner objects
- Complex conditional logic

---

## Key Learning Outcomes
- Writing if/else if/else conditional statements
- Using comparison and logical operators (&&, ||)
- Nesting conditionals for complex decision-making
- Working with both numeric and string comparisons
- Mathematical operations and type conversion