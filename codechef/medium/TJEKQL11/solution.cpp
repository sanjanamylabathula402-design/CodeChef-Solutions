          }

            routeCounts[route]++;

              console.log(`Route: ${route}, Count: ${routeCounts[route]}`);

                next();
                };

                app.use(requestCounter);

                // Routes
                app.get('/', (req, res) => {
                  res.send('Home Page');
                  });

                  app.get('/about', (req, res) => {
                    res.send('About Page');
                    });

                    app.listen(port, () => {
                      console.log(`Server listening on port ${port}`);
                      });
