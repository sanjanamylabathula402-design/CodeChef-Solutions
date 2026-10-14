app.use(express.json());

// Serve static files (like feedback.html) from the public directory
app.use(express.static(path.join(__dirname, 'public')));

app.post('/submit-feedback-form', (req, res) => {
  console.log('Form data received:');
    console.log(req.body);
      res.send('Feedback form data received!');
      });

      app.post('/submit-feedback-json', (req, res) => {
        console.log('JSON data received:');
          console.log(req.body);
            res.json({ message: 'Feedback JSON data received!' });
            });

            const PORT = 3000;
            app.listen(PORT, () => {
              console.log(`Server is running on port ${PORT}`);
              });

              module.exports = app;