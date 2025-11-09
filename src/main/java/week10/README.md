# Week 10 Labs

Four labs focusing on file I/O operations, reading CSV files, and processing tabular data.

**Note:** All CSV files should be placed in `src/main/resources/` directory for the labs to access them properly.

## Required Data Files
- `Student Assignment Scores.csv` (for Lab10a, Lab10b, Lab10c)
- `Student Test Grades.csv` (for Lab10d)

## Labs

### Lab10a - Basic File Reading
Reads and displays raw data from a CSV file line by line.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week10.Lab10a"
```

**Example Output:**
```
Student Name,Lab1,Lab2,Lab3,Lab4,Lab5,Lab6
John Smith,100,95,0,88,92,100
Jane Doe,100,100,100,95,0,98
...
```

**Concepts:**
- File I/O with InputStream
- Loading files from classpath resources
- Scanner for file reading
- Try-catch for file not found exceptions
- Basic file iteration with hasNext() and nextLine()

---

### Lab10b - Formatted CSV Display
Reads CSV file and displays data in a formatted table with proper column alignment.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week10.Lab10b"
```

**Example Output:**
```
Student Name                    Lab1   Lab2   Lab3   Lab4   Lab5   Lab6
------------------------------------------------------------------------
John Smith                       100     95      0     88     92    100
Jane Doe                         100    100    100     95      0     98
Bob Johnson                       85     90     88     92     95     87
```

**Concepts:**
- String.split() for parsing CSV data
- printf() for formatted table output
- Column alignment with format specifiers (%-30s, %7s)
- Array indexing for column access
- Try-with-resources for automatic file closing
- Empty file validation

---

### Lab10c - Missing Assignment Finder
Analyzes CSV data to identify students with missing assignments (scores of 0).

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week10.Lab10c"
```

**Example Output:**
```
Student                 Assignment with 0
-------------------------------------
John Smith                            3
Jane Doe                              5
```

**Concepts:**
- Conditional data processing
- Iterating through array elements
- String comparison with .equals()
- Filtering data based on criteria
- Generating reports from file data

---

### Lab10d - Grade Calculator with Nested ArrayLists
Reads student test scores, stores them in a nested ArrayList structure, and converts numerical grades to letter grades.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week10.Lab10d"
```

**Example Output:**
```
------------------------------------------------------------
Student Name                  Test1     Test2     Test3
------------------------------------------------------------
John Smith                    A         A-        B+
Jane Doe                      A         A         A
Bob Johnson                   B         B+        B
Sarah Williams                A-        A         A-
```

**Concepts:**
- ArrayList<String[]> for storing tabular data
- Nested data structures
- Integer.parseInt() for string to int conversion
- Method design for grade calculation
- Multi-stage data processing (read, store, transform, display)
- Complex conditional logic for grade ranges

---

## Key Learning Outcomes
- Reading files from the classpath using InputStream
- CSV parsing with String.split()
- Try-with-resources for proper resource management
- Exception handling for file operations
- Formatted output with printf()
- Working with nested data structures (ArrayList of arrays)
- Data transformation and reporting
- Type conversion (String to Integer)
- Algorithm design for data analysis
- Building complete data processing pipelines