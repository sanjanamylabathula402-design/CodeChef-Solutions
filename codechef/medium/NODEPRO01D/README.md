# NODEPRO01D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### View and delete a note

Now we are on the last stage of our first project.

The last functionality we have to implement is viewing a single note and its content and an option to delete it.

#### Task:
- Complete the notes.js code to implement the functionality of viewing a particular note on /:title route. The titile name should not contain the.txt extension. And render the view-note.ejs to show the note on frontend.
- Complete the functionality of deleting the note on /:title/delete route. After deleting the note, go back to /notes route.
- Complete notes.ejs to link all the notes to their particular route and show its content.
- Complete the view-note.ejs to show the title as heading and content of the note. And add the route to delete the particular note.
#### Expected working:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T16:21:33.727Z  

```cpp

                                                                                    fs.readFile(filePath, 'utf8', (err, content) => {
                                                                                            if (err) {
                                                                                                        return res.status(404).send('Note not found');
                                                                                                                }
                                                                                                                        res.render('view-note', { title, content });
                                                                                                                            });
                                                                                                                            });

                                                                                                                            // POST /notes/:title/delete - Delete a note
                                                                                                                            router.post('/:title/delete', (req, res) => {
                                                                                                                                const { title } = req.params;
                                                                                                                                    const filePath = path.join(__dirname, '../notes', `${title}.txt`);

                                                                                                                                        fs.unlink(filePath, (err) => {
                                                                                                                                                if (err) {
                                                                                                                                                            return res.status(500).send('Error deleting note');
                                                                                                                                                                    }
                                                                                                                                                                            res.redirect('/notes');
                                                                                                                                                                                });
                                                                                                                                                                                });

                                                                                                                                                                                module.exports = router;
```

---

[View on CodeChef](https://www.codechef.com/problems/NODEPRO01D)