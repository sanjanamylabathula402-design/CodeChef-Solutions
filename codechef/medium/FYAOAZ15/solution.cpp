const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;

// Middleware to parse form data
app.use(bodyParser.urlencoded({ extended: false }));

// Set EJS as the view engine
app.set('view engine', 'ejs');app.get('/name-age', (req, res) => {
        res.render('nameAgeForm');
        });
        // Route to handle form submission
        app.post('/submit-name-age', (req, res) => {
            // complete the route to take the input from FORM and send data back as greeting message
                
                });

app.listen(port, () => {
        console.log(`Server is running at http://localhost:${port}`);
        });
