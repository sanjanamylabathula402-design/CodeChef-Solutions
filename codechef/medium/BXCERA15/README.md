# BXCERA15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Loading Favorite Songs from File
- Imagine you’re developing a music app that lets users view their favorite songs saved from earlier sessions. To make this possible, you'll use basic file reading in Java to load the list of songs from a file and display them to the user.
- In the given code, the FavoriteSongsList class manages a list of favorite songs using an ArrayList<String>. One method body, loadSongs(), is left incomplete. Your task is to complete the logic to read song names from a file and load them into the list.
- When the object is created, the app should automatically load any previously saved songs from a file named songs.txt. These songs should then be printed in order.

 **Task** 
Complete the loadSongs() method so that it:

- Opens the file songs.txt for reading.
- Reads each line (each representing a song title) and adds it to the internal songs list.
- Closes the file once reading is complete.
- Prints: "Songs loaded from songs.txt" if the file exists and songs were read.

 **Notes:** 

- Use the Scanner class for reading from the file.
- Make sure to use a loop like while (scanner.hasNextLine()) to read all lines.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:01:38.456Z  

```cpp
            }
        }
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create a FavoriteSongsList object
        FavoriteSongsList newMusic = new FavoriteSongsList();
        
        newMusic.printSongs();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BXCERA15)