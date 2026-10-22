# NODEPRO01C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### View all notes

In this part we will deal with viewing of all the notes that we have made.

We are working on `/notes` route.

#### Task:
- Complete the notes.js to view all the notes present in the notes folder.
- Complete the notes.ejs to traverse all the notes present in the folder and remove the.txt extension while showing the name of the note on the frontend.
### APIs Notes:
Endpoint	Method	Description
`/notes/`	GET	Returns all saved notes
#### Expected working of the backend:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T16:46:18.307Z  

```cpp
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>All Notes</title>
            </head>
            <body>
                <h1>All Notes</h1>
                    <ul>
                            <% if (notes && notes.length > 0) { %>
                                        <% notes.forEach(note => { %>
                                                        <li>
                                                                            <%= note.replace('.txt', '') %>
                                                                                            </li>
                                                                                                        <% }) %>
                                                                                                                <% } else { %>
                                                                                                                            <p>No notes found.</p>
                                                                                                                                    <% } %>
                                                                                                                                        </ul>
                                                                                                                                        </body>
                                                                                                                                        </html>
```

---

[View on CodeChef](https://www.codechef.com/problems/NODEPRO01C)