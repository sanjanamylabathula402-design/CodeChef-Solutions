
const server = http.createServer((req, res) => {
  const currentHour = new Date().getHours();
    let greeting = '';

      if (currentHour < 12) {
          greeting = 'Good morning!';
            } else if (currentHour >= 12 && currentHour <= 18) {
                greeting = 'Good afternoon!';
                  } else {
                      greeting = 'Good evening!';
                        }

                          res.writeHead(200, { 'Content-Type': 'text/plain' });
                            res.end(greeting);
                            });

                            const port = 3000;
                            server.listen(port, () => {
                              console.log(`Server running at http://localhost:${port}/`);
                              });

                              module.exports = server;