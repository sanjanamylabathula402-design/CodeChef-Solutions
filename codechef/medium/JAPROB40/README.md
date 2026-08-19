# JAPROB40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Word Counter - Regex Method
### New Concept Alert

Regular expressions (regex) are powerful tools for searching, matching, and manipulating text patterns. In Java, the `java.util.regex` package (with classes like `Pattern` and `Matcher`) provides support for regular expressions. Unlike simple string methods like `.split()`, regex allows us to extract words while handling punctuation.

 **How the Regex Matching Works:** 

```
Matcher matcher = Pattern.compile("\\b\\w+\\b").matcher(text);
while (matcher.find()) {
   words.add(matcher.group());
}

```

- Pattern Setup:

`Pattern.compile("\\b\\w+\\b")` creates a regex pattern that matches:

- \\b → Word boundaries (start/end of words).
- \\w+ → One or more word characters (letters, numbers, underscores).
- Finding Matches:

The `while(matcher.find())` loop:

- Scans through the text to find all sequences that match the pattern.
- Each match (matcher.group()) is a valid word.
- Adds each matched word to the words list.

This method effectively extracts words from a sentence while ignoring punctuation marks like commas, periods, or exclamation points.

### Task

Your task is to complete the `countWordsRegex()` function that:

- Use the regular expression to break the input text into words.
- Count the total number of words in the text.
- Return the total word count.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:08:33.211Z  

```cpp
        Matcher matcher = Pattern.compile("\\b\\w+\\b").matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        int total_words = words.size();
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

        int total_words =  countWordsRegex(text);
        System.out.println(total_words);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB40)