const express = require('express');
const app = express();
const PORT = 3000;

// Route handler for /hello
app.get('/hello', (req, res) => {
  res.send(req.url);
  });
  
  // Start the server
  app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
    });// write your code here.
