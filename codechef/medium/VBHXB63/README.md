# VBHXB63

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Personalized Greeting Route

Let's create a simple server that greets the user by name, if a name is provided in the URL as a query parameter. If no name is provided, it should give a generic greeting. This exercise will solidify your understanding of URL parsing and basic routing in Node.js.

Here's the scenario:

We want our server to respond differently based on the URL.

- If the user visits /greet?name=Alice, the server should respond with "Hello, Alice!".
- If the user visits just /greet, or /greet?name=, the server should respond with "Hello, Guest!".
- If the user visits any other path, the server should respond with a 404 "Not Found" error.

In this example:

- We parse the URL using url.parse(req.url, true).
- We extract the path and the name query parameter from the parsed URL.
- If the path is /greet, we check if a name query parameter exists.
- If a name is provided, we create a personalized greeting. Otherwise, we use a generic greeting.
- We send the appropriate greeting back to the user.
- If the path is not /greet, we send a 404 "Not Found" error.
#### Task:

Complete the code to check if the path is `/greet` or not.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T16:28:49.930Z  

```cpp

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
    const pathname = parsedUrl.pathname;
      const query = parsedUrl.query;

        // Check if the path is /greet
          if (pathname === '/greet') {
              const name = query.name;
                  if (name) {
                        res.writeHead(200, { 'Content-Type': 'text/plain' });
                              res.end(`Hello, ${name}!`);
                                  } else {
                                        res.writeHead(200, { 'Content-Type': 'text/plain' });
                                              res.end('Hello, Guest!');
                                                  }
                                                    } else {
                                                        res.writeHead(404, { 'Content-Type': 'text/plain' });
                                                            res.end('404 Not Found');
                                                              }
                                                              });

                                                              server.listen(3000);
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB63)