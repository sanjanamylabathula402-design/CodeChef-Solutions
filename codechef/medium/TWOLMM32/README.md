# TWOLMM32

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Daily Gratitude Logger

In this task, you need to append a given string to a text file in both uppercase and lowercase formats. The file output.txt is already saved at the specified path

 **Steps to Follow:** 

- Open the file in append mode: Use FileWriter with the true flag to enable appending.
- Write the string in both uppercase and lowercase: Convert the string to uppercase and write it to the file. Move to a new line using write("\n"). Convert the string to lowercase and write it to the file.
- Handle exceptions: If an error occurs while writing to the file, print "An error occurred."

 **Expected Content of `output.txt`** 

```
THIS IS A SAMPLE LINE.
this is a sample line.

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:58:59.610Z  

```cpp

            // Convert string to uppercase and write it to the file
            writer.write(line.toUpperCase());
            writer.write("\n");  // Move to the next line

            // Convert string to lowercase and write it to the file
            writer.write(line.toLowerCase());
            writer.write("\n");  // Move to the next line

            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM32)