# Week 13 Labs

Two labs focusing on advanced file processing, predicates for validation, and automated document generation.

**Note:** Input files should be placed in `src/main/resources/`. Output files are saved to the `data/` directory.

## Required Data Files
- `Pwd.txt` - List of passwords to validate (Lab13a)
- `Student Assignment Scores.csv` - Student assignment data (Lab13b)
- `Warning Letter to Student -.txt` - Template for warning letters (Lab13b)

## File Locations
- **Input:** `src/main/resources/` (Pwd.txt, Student Assignment Scores.csv, Warning Letter to Student -.txt)
- **Output:** `data/` (validpwd.txt, invalidpwd.txt, Warning Letter to Student - [Name].txt)

## Labs

### Lab13a - Password Validator with Predicates
Reads passwords from a file, validates them against multiple criteria using predicates, and writes valid/invalid passwords to separate output files.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week13.Lab13a"
```

**Password Criteria:**
- At least 8 characters long
- Contains at least one uppercase letter
- Contains at least one lowercase letter
- Contains at least one number
- Contains at least one special character (@, #, %, -, &, *)

**Output Files:**
- `data/validpwd.txt` - Contains all valid passwords
- `data/invalidpwd.txt` - Contains invalid passwords with specific reasons

**Example Output (invalidpwd.txt):**
```
pass123         Invalid password!  Password must be at least 8 characters long.
PASSWORD123@    Invalid password!  Password must contain at least one lower case character.
password        Invalid password!  Password must contain at least one number.
Password1       Invalid password!  Password must contain at least one special character {@, #, %, -, &, *}.
```

**Example Output (validpwd.txt):**
```
MyPass123@
Secure#Pass99
Valid&Word1
```

**Concepts:**
- Predicate functional interface
- Lambda expressions for validation
- Regular expressions (regex) for pattern matching
- Multiple file output (writing to different files)
- String validation methods (toLowerCase, toUpperCase)
- Modular validation with reusable predicates
- Test-driven validation logic

---

### Lab13b - Automated Warning Letter Generator
Reads student assignment data and a letter template, then automatically generates personalized warning letters for students with missing assignments.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week13.Lab13b"
```

**Example Console Output:**
```
Creating letters for:

John Smith
Jane Doe
Bob Johnson
```

**Example Generated Letter (Warning Letter to Student - John Smith.txt):**
```
Dear John Smith,

This letter is to inform you that you have missing assignments in your coursework. 
Please review the list below and submit the missing work as soon as possible.

Missing Assignments:

Assignment 3
Assignment 5

Please contact your instructor if you have any questions.

Sincerely,
The Teaching Staff
```

**Concepts:**
- Template-based document generation
- Scanner delimiter manipulation (useDelimiter("\\Z"))
- Dynamic file naming based on data
- CSV parsing for student records
- Automated report generation
- Conditional file creation (only for students with missing assignments)
- Multi-file input processing
- String interpolation for personalization

---

## Key Learning Outcomes
- Functional programming with Predicates
- Lambda expressions in Java
- Regular expressions for pattern matching
- Advanced file I/O (reading from multiple sources, writing to multiple destinations)
- Template-based text generation
- Automated document creation
- Data-driven programming
- Boolean logic with functional interfaces
- Scanner advanced features (delimiter control)
- Building real-world automation tools
- Separation of validation logic
- Modular, testable code design

## Predicate Pattern
This week introduces the Predicate functional interface pattern:
```java
public static Predicate<String> hasLength() {
    return text -> text != null && text.length() >= 8;
}

// Usage
if (hasLength().test(password)) {
    // Password has valid length
}
```

This pattern allows for:
- Reusable validation logic
- Easy testing of individual rules
- Combining multiple conditions
- Clean, readable validation code