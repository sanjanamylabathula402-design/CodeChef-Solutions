const express = require('express');
const app = express();
const PORT = 3000;

// 1. Root route
app.get('/', (req, res) => {
  res.send('Welcome to our services page!');
  });

  // 2. Web development route
  app.get('/web', (req, res) => {
    res.send('We specialize in Web Development.');
    });

    // 3. Mobile app development route
    app.get('/mobile', (req, res) => {
      res.send('We also offer Mobile App Development.');
      });

      app.listen(PORT, () => {
        console.log(`Server is running on port ${PORT}`);
        });