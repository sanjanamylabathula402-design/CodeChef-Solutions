
const server = http.createServer((req, res) => {
  // Set the Content-Type header to text/plain
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    
      // Check if USERNAME is a non-empty string after trimming
        if (USERNAME && USERNAME.trim().length > 0) {
            res.write(`Hello, ${USERNAME.trim()}!`);
              } else {
                  res.write('Hello, Guest!');
                    }
                    
                      // End the response
                        res.end();
                        });
                        
                        // Make the server listen on port 3000
                        const port = 3000;
                        server.listen(port, () => {
                          console.log(`Server running at http://localhost:${port}/`);
                          });
                          
                          module.exports = server;// write your code here