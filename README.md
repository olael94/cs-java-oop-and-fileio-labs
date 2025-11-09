# CS105 Java Labs

A collection of Java programming labs from my CS105 coursework at Ensign College, demonstrating progression from basic syntax to advanced data structures and file operations.

[![Java](https://img.shields.io/badge/Java-21-orange)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue)](https://maven.apache.org/)

## About

**Course:** CS105 - Introduction to Programming (Java)  
**Institution:** Ensign College  
**Instructor:** Sister Kristi Hays  
**Semester:** Fall 2023

This repository contains 14 weeks of lab assignments covering core Java concepts, from "Hello World" to HashMaps and file I/O.

## Repository Structure
```
cs105-java-labs/
├── src/main/java/week01-14/  # Weekly lab folders with individual READMEs
├── src/main/resources/       # Input data files (CSV, TXT)
├── data/                     # Output files directory
└── pom.xml                   # Maven configuration
```

## Weekly Topics

| Week | Topic | Key Concepts |
|------|-------|--------------|
| 01 | [Foundations](src/main/java/week01/README.md) | Basic syntax, printing |
| 02 | [Variables & Input](src/main/java/week02/README.md) | Scanner, calculations |
| 03 | [Conditionals](src/main/java/week03/README.md) | If/else, nested logic |
| 04 | [Loops & Validation](src/main/java/week04/README.md) | Do-while, input validation |
| 05 | [Iteration](src/main/java/week05/README.md) | For loops, formatted output |
| 06 | [Methods](src/main/java/week06/README.md) | Parameters, return values |
| 07 | [Advanced Methods](src/main/java/week07/README.md) | Exception handling, date/time |
| 08 | [ArrayLists](src/main/java/week08/README.md) | Dynamic collections |
| 09 | [Menu Systems](src/main/java/week09/README.md) | Switch statements, string parsing |
| 10 | [File Input](src/main/java/week10/README.md) | Reading CSV files |
| 11 | [Debugging](src/main/java/week11/README.md) | Error identification, testing |
| 12 | [File Output](src/main/java/week12/README.md) | Writing files, persistence |
| 13 | [Automation](src/main/java/week13/README.md) | Predicates, lambdas, templates |
| 14 | [Data Structures](src/main/java/week14/README.md) | HashMaps, key-value pairs |

## Quick Start

**Prerequisites:** JDK 21+, Maven 3.x
```bash
# Clone and build
git clone https://github.com/yourusername/cs105-java-labs.git
cd cs105-java-labs
mvn clean compile

# Run a lab
mvn exec:java -Dexec.mainClass="week01.Lab1b"
```

## Key Skills Demonstrated

- Core Java programming (variables, loops, conditionals, methods)
- Data structures (Arrays, ArrayLists, HashMaps)
- File I/O and CSV parsing
- Exception handling and input validation
- Functional programming (Predicates, lambdas)
- Algorithm design and debugging
- Menu-driven applications

## Notes

- Input files are in `src/main/resources/`
- Output files save to `data/` (create directory if needed)
- Each week folder contains a detailed README with examples

## Contact

**Oliver Rivera**  
GitHub: [@olael94](https://github.com/olael94)

---

⭐ Star this repo if you find it helpful!
