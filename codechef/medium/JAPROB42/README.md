# JAPROB42

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Word Counter - Last Step

In this component, we are implementing the final function of our project to display the results.
This function will show the total number of words in the text and the frequency of the user-specified word.

 **Task** 
Update the `displayResults()` function to show the following details:

- Total number of words in the input.txt file.
- Frequency of the user-specified word in the text.

 **Output Format:** 

```
Total Words: 39
Frequency of 'Java': 2

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:09:16.213Z  

```cpp

    public static void main(String[] args) {
        System.out.println("Welcome to the Word Counter!\n");

        String filepath = "/home/chef/workspace/input.txt";
        String text = readFile(filepath);

        if (text.equals("")) {
            return;
        }
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words =  countWordsRegex(text);
        int totalWords = words.size();

        System.out.print("Enter the word to search: ");
        String searchWord = scanner.nextLine();

        int wordFreq = wordFrequency(words, searchWord);
        displayResults(totalWords, searchWord, wordFreq);
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB42)