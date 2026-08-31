# POLMDB09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Design a Library Management System

A library wants to store information about Books. Currently, they have a messy system where the book details and the publisher details are separate. You need to combine them into a single, efficient MongoDB document.

 **Task** 
Write a script in `index.js` to insert a document into a collection named `books`. The document must represent a book titled  **"The Go Programming Language"**.

1. **Top-level fields** 

- title: "The Go Programming Language"
- isbn: "978-0134190440"
- authors: An array containing: "Alan A. A. Donovan" "Brian W. Kernighan"

2. **Nested document field** 

- Create a field named publisher.
- Inside publisher, nest two fields: name: "Addison-Wesley" year: 2015

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T08:49:40.173Z  

```cpp
});

const result = db.books.findOne({ title: "The Go Programming Language" });

print("Successfully inserted book:");
printjson(result);
        name: "Addison-Wesley",
        year: 2015
    }
db = connect('mongodb://localhost:27017/library_db');

db.books.insertOne({
    title: "The Go Programming Language",
    isbn: "978-0134190440",
    authors: ["Alan A. A. Donovan", "Brian W. Kernighan"],
    publisher: {
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB09)