# BXCERA10C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reading Product Data from a CSV File
- In this worked example, we demonstrate how to read product information from a structured CSV (Comma-Separated Values) file and reconstruct it into custom Java objects using FileReader and BufferedReader.
- The program defines a Product class containing three common attributes: name (product name) price (in double) quantity (in int)
- The main() method opens a file named products.csv, which is expected to store product data in a tabular format with a header followed by one product per line. The program reads each line, parses the values using the split() method, and creates corresponding Product objects.
- An ArrayList<Product> is used to collect all the reconstructed products from the file. Finally, the program prints the list of products to the console in a readable format using the toString() method. This example focuses on reading object data from a CSV file and rebuilding it into Java objects.

 **When executed, the program will show:** 

```
Successfully read from products.csv  
Product{name='Laptop', price=1200.0, quantity=5}  
Product{name='Mouse', price=25.0, quantity=50}  
Product{name='Keyboard', price=75.0, quantity=20}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:03:13.748Z  

```cpp
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.File;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
```

---

[View on CodeChef](https://www.codechef.com/problems/BXCERA10C)