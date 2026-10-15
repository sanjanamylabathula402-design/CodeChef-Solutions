
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