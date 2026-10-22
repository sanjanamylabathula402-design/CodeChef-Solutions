const express = require('express');
const path = require('path');
const app = express();
const PORT = 3000;

// Serve static files from the 'public' directory using absolute path
app.use(express.static(path.join(__dirname, 'public')));

// Start the server on port 3000
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
    });