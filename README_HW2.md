# Average Difference Array (Java)

This program reads a list of numeric values from a file, calculates the average, and creates a new array showing the difference of each value from that average. It also prints and sorts both arrays.

## 🔧 Features
- Reads data from a user-specified input file
- Calculates average of values
- Creates a second array showing the difference from the average
- Outputs both arrays (unsorted and sorted) to a user-specified file
- Prints all output with formatted decimal values (2 digits)

## 📂 Input Example (data.txt)
```
5.5 7.2 9.8 3.4 6.1 10.0 4.3 8.6 6.7 5.9
```

## 📄 Output Example (results.txt)
```
Here is the original array:
      5.50      7.20      9.80      3.40      6.10
     10.00      4.30      8.60      6.70      5.90

Average of original array: 6.75

Here is the new array (difference from average):
     -1.25      0.45      3.05     -3.35     -0.65
      3.25     -2.45      1.85     -0.05     -0.85

Average of new array: 0.00

Sorted original array:
      3.40      4.30      5.50      5.90      6.10
      6.70      7.20      8.60      9.80     10.00

Sorted difference array:
     -3.35     -2.45     -1.25     -0.85     -0.65
     -0.05      0.45      1.85      3.05      3.25
```

## ▶️ How to Run
1. Compile:
   ```
   javac Main.java
   ```

2. Run:
   ```
   java Main
   ```

3. Provide paths and number of values when prompted:
   ```
   Enter input file path: data.txt
   Enter output file path: results.txt
   Enter number of values to read: 10
   ```

## 👤 Author
Meiling You  
📧 Tiffanyyou1025@gmail.com  
GitHub: [MeilingYou](https://github.com/MeilingYou)
