# NODEPRO01A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Setting up frontend and server

Let's begin with first making our `server.js` which will be our main server file.

To get our server running we need some files to serve as frontend.

#### Task:
- Complete the serving of public folder for css.
- Complete the serving of frontend files from views folder.
- Set the / route as home route and serve the index.ejs file from views folder.
- Create a notes folder to which works as our database.
#### Expected output after the rendering:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T16:52:52.617Z  

```cpp
app.use(express.urlencoded({ extended: true }));

// Middleware to handle the public folder to serve css in static format
app.use(express.static('public'));

app.set('view engine', 'ejs');
// View to serve the frontend files from views folder
app.set('views', path.join(__dirname, 'views'));

// Routes to set / route to serve index file
app.get('/', (req, res) => {
  res.render('index');
  });

  // Create 'notes' folder if not exists
  const notesDir = path.join(__dirname, 'notes');
  if (!fs.existsSync(notesDir)) {
    fs.mkdirSync(notesDir);
```

---

[View on CodeChef](https://www.codechef.com/problems/NODEPRO01A)