# Week 12 Labs

Two labs focusing on file writing (output) operations, building on the shopping list application with persistence.

**Note:** Shopping list files are saved to and loaded from the `data/` directory in your project root. You may need to create this directory manually if it doesn't exist.

## File Storage Location
- **Save location:** `data/Shopping List.txt` (relative to project root)
- The `data/` folder will be created at the same level as your `src/` and `pom.xml`
- Example path: `cs105-java-labs/data/Shopping List.txt`

## Labs

### Lab12a - Shopping List with Save Function
Extends the shopping list application to save the current list to a text file for later use.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week12.Lab12a"
```

**Example:**
```
1. Add Items
2. Delete Items
3. Show Items
4. Sort Items
5. Save List
6. Exit
Please enter a command: 1
Add an item to the list format: item:qty (or just hit enter when done): 
Milk:2
'Milk:2' has been added to the list!
Add an item to the list format: item:qty (or just hit enter when done): 
Eggs:12
'Eggs:12' has been added to the list!
Add an item to the list format: item:qty (or just hit enter when done): 

2 items have been added to your Shopping List.

Please enter a command: 5
Are you sure you wish to overwrite the Shopping List.txt file with your current list? (Y/N)
Y
Shopping List was saved.
```

**Concepts:**
- PrintWriter for file output
- Writing to text files
- File overwrite confirmation
- FileNotFoundException handling
- Flush and close file streams
- User confirmation dialogs
- File path specification

---

### Lab12b - Shopping List with Save and Open
Adds the ability to open (load) previously saved shopping lists from disk.

**Run:**
```bash
mvn exec:java -Dexec.mainClass="week12.Lab12b"
```

**Example:**
```
1. Add Items
2. Delete Items
3. Show Items
4. Sort Items
5. Save List
6. Open List
7. Exit
Please enter a command: 6
Are you sure you wish to overwrite the Shopping List.txt file with your current list? (Y/N)
Y
Shopping List overwritten from file: Shopping List.txt.

Please enter a command: 3
------------------------------------
    Shopping List       
------------------------------------
                Milk    2
                Eggs   12
              Bread    1
------------------------------------
```

**Concepts:**
- File input with Scanner
- Reading files line by line
- ArrayList.clear() before loading
- File existence checking
- Complete CRUD with persistence (Create, Read, Update, Delete, Save, Load)
- User data preservation
- Error handling for missing files

---

## Key Learning Outcomes
- Writing data to files with PrintWriter
- Reading data from files with Scanner and File objects
- File path management and directory structure
- Try-catch for file operations (FileNotFoundException)
- Resource management (flush, close)
- Data serialization (ArrayList to text file)
- File I/O best practices
- Building real-world applications with data persistence

## Common Issues and Solutions
**Issue:** File saves but can't find it
- **Solution:** Check your project root directory. The file should be at `cs105-java-labs/data/Shopping List.txt`