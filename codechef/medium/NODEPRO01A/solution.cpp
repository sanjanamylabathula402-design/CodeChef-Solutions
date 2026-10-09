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