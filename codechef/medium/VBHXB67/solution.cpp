                const filePath = path.join(__dirname, 'public', 'message.txt');
                    
                        fs.readFile(filePath, 'utf8', (err, data) => {
                              if (err) {
                                      res.writeHead(500, { 'Content-Type': 'text/plain' });
                                              res.end('Internal Server Error');
                                                    } else {
                                                            res.writeHead(200, { 'Content-Type': 'text/plain' });
                                                                    res.end(data);
                                                                          }
                                                                              });
                                                                                } else {
                                                                                    res.writeHead(404, { 'Content-Type': 'text/plain' });
                                                                                        res.end('Not Found');
                                                                                          }
                                                                                          });

                                                                                          const port = 3000;
                                                                                          server.listen(port, () => {
                                                                                            console.log(`Server running at http://localhost:${port}/`);
                                                                                            });

                                                                                            module.exports = server;