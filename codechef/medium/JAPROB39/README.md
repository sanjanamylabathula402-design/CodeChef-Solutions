# JAPROB39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Word Counter - Split Method

In this component, we'll implement a method to count the number of words in a given text using Java’s `String.split()` method. Here we will splits a string into an array of substrings using a single space (" ") as the delimiter. While simple and intuitive, it only splits text at exact space characters, ignoring other whitespace (like tabs or multiple spaces) and punctuation.

 **How the `split()` Method Works** 

- The split(" ") method splits a string into an array of words using single space as the delimiter.
- The length of the resulting array gives the total word count.

 **Task** 
Complete the `countWordsSplit()` function:

- The function should split the input text into words using split(" ").
- It should return the total number of words in the text.

 **Drawback of split Method** 
The `split(" ")` method in Java has two key limitations: it fails to handle multiple spaces (resulting in empty strings) and doesn't account for punctuation, treating words like "Hello" and "Hello," differently. This drawback can be overcome using regular expressions, which we will discuss in the next component.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:08:07.252Z  

```cpp
    //----------------------------------------------------
    public static int countWordsSplit(String text) {
        String[] wordsArray = text.split(" ");
        int total_words = wordsArray.length;
        return total_words;
    }
    //----------------------------------------------------
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Word Counter!\n");

        String filepath = "input.txt";
        String text = readFile(filepath);

        if (text.equals("")) {
            return;
        }

        int totalWords =  countWordsSplit(text);

        System.out.println(totalWords);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB39)