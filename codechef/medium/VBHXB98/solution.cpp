
// Middleware to parse URL-encoded form data and JSON data
app.use(express.urlencoded({ extended: false }));
app.use(express.json());

// Route to handle HTML form feedback submissions
app.post('/submit-feedback-form', (req, res) => {
    console.log('Form data received:');
        console.log(req.body);
            res.send('Feedback form data received!');
            });

            // Route to handle JSON feedback submissions
            app.post('/submit-feedback-json', (req, res) => {
                console.log('JSON data received:');
                    console.log(req.body);
                        res.json({ message: 'Feedback JSON data received!' });
                        });

                        const PORT = 3000;
                        app.listen(PORT, () => {
                            console.log(`Server listening on port ${PORT}`);
                            });