const express = require('express');
const app = express();

// 1. Define the greeting constant
const greeting = 'Hello, there!';

// 2. Set up a GET route for the root URL ('/')
app.get('/', (req, res) => {
  res.send(greeting);
  });

  // 3. Start the server on port 3000
  app.listen(3000, () => {
    console.log('Server is running on port 3000');
    });
