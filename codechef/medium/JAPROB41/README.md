# JAPROB41

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Word Counter - Counting Word Frequency

In this component, we'll implement a function to count the frequency of a specific word in the text present in the `input.txt` file. After extracting words using regular expressions, we will allow the user to enter a word, and our program will determine how many times it appears in the text.

 **Task** 
Complete the function `wordFrequency()` by counting the occurrences of the given word in the list of extracted words.

- Count the occurrences of the search word.
- Return the frequency of word and the search word.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:08:57.248Z  

```cpp

    public static void main(String[] args) {
        System.out.println("Welcome to the Word Counter!\n");

        String filepath = "/home/chef/workspace/input.txt";
        String text = readFile(filepath);

        if (text.startsWith("Error reading file")) {
            System.out.println(text);
            return;
        }
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words =  countWordsRegex(text);
        int totalWords = words.size();

        System.out.print("Enter the word to search: ");
        String searchWord = scanner.nextLine();

        int wordFreq = wordFrequency(words, searchWord);
        System.out.println(wordFreq);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB41)