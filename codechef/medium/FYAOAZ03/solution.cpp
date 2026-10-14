const express = require('express');
const app = express();
const path = require('path');

// Set EJS as the templating engine
app.set('view engine', 'ejs');

// Set the views directory
app.set('views', path.join(__dirname, 'views'));

// Define the route for the homepage
app.get('/', (req, res) => {
    res.render('index');
    });

    // Start the server on port 3000
    app.listen(3000, () => {
        console.log('Server is running on port 3000');
        });