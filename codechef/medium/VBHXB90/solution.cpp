    const route = req.path;
        if (!routeCounts[route]) {
                routeCounts[route] = 0;
                    }
                        routeCounts[route]++;
                            console.log(`Route: ${route}, Count: ${routeCounts[route]}`);
                                next();
                                };

                                app.use(requestCounter);

                                app.get('/', (req, res) => {
                                    res.send('Home Page');
                                    });

                                    // Complete the code for about route
                                    app.get('/about', (req, res) => {
                                        res.send('About Page');
                                        });

                                        app.listen(port, () => {
                                            console.log(`Server running on port ${port}`);
                                            });