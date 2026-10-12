# VBHXB60

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Greeting Server

Create a Node.js HTTP server that greets the user with a personalized message. The server uses a  **hardcoded username** . If the username is a non-empty string, the server responds with a greeting like `"Hello, [USERNAME]!"`. If the username is empty or not set, the server responds with a generic greeting like `"Hello, Guest!"`.

### Tasks:
- Require the http module.
- Define a hardcoded variable named USERNAME at the top of the file and assign it a name (e.g., "Harry").
- Create an HTTP server using http.createServer().
- Inside the request handler function: Check if the USERNAME is a non-empty string (after trimming). If it is, use it to form a greeting like "Hello, Harry!". Otherwise, fall back to a default greeting "Hello, Guest!".
- Set the Content-Type header to text/plain to indicate plain text response.
- Write the greeting message to the response body using res.write().
- End the response using res.end().
- Make the server listen on port 3000 using server.listen().

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T10:37:08.262Z  

```cpp

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
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB60)