# BXCERA14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Saving Favorite Songs to File
- Imagine you’re building a music app that lets users save their favorite songs. To achieve this, we’ll use basic file handling in Java to persist the list of songs between sessions.
- In the given code, a class named FavoriteSongsList manages a list of favorite songs using an ArrayList<String>. One method body is left incomplete. Your job is to complete that to ensure songs can be saved to a file named songs.txt.
- The main() method code simulates adding a few songs and saving them to a file.

 **Task** 
Implement the method `saveSongs()` which:

- Opens or creates a file named songs.txt.
- Writes each song from the list into the file, one per line. Use FileWriter for writing.
- While writing data to the file, use System.lineSeparator() instead of "\n" to ensure each task appears on a new line.
- If writing succeeds, prints: Songs saved to songs.txt

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:00:09.851Z  

```cpp
            File file = new File("songs.txt");
            FileWriter writer = new FileWriter(file);
            for (String song : songs) {
                writer.write(song + System.lineSeparator());
            }
            writer.close();
            System.out.println("Songs saved to songs.txt");
        } catch (Exception e) {
            System.out.println("An error occurred while saving songs.");
        }
    }
}

class Codechef {
    public static void main(String[] args) {
        FavoriteSongsList myMusic = new FavoriteSongsList();
        myMusic.addSong("Bohemian Rhapsody");
        myMusic.addSong("Imagine");
```

---

[View on CodeChef](https://www.codechef.com/problems/BXCERA14)