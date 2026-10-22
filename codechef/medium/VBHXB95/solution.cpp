                                                                                }

                                                                                        const result = numerator / denominator;
                                                                                                res.send(`Result: ${result}`);
                                                                                                    } catch (err) {
                                                                                                            // Pass any error to the error handling middleware
                                                                                                                    next(err);
                                                                                                                        }
                                                                                                                        });

                                                                                                                        // Error handling middleware
                                                                                                                        app.use((err, req, res, next) => {
                                                                                                                            console.error(err.stack);
                                                                                                                                if (err.type === 'DIV_ZERO') {
                                                                                                                                        res.status(400).send('Cannot divide by zero.');
                                                                                                                                            } else {
                                                                                                                                                    res.status(500).send('Something went wrong.');
                                                                                                                                                        }
                                                                                                                                                        });

                                                                                                                                                        app.listen(port, () => {
                                                                                                                                                            console.log(`Server running at http://localhost:${port}`);
                                                                                                                                                            });