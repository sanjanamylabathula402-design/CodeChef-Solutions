
                            // Validate name
                                if (typeof name !== 'string' || name.trim() === '') {
                                        return res.status(400).send('Name must be a non-empty string.');
                                            }

                                                // Validate price
                                                    if (typeof price !== 'number' || price <= 0) {
                                                            return res.status(400).send('Price must be a number greater than 0.');
                                                                }

                                                                    // Validate quantity
                                                                        if (!Number.isInteger(quantity) || quantity < 0) {
                                                                                return res.status(400).send('Quantity must be an integer greater than or equal to 0.');
                                                                                    }

                                                                                        console.log('Product received:', { name, price, quantity });
                                                                                            res.send('Product added successfully!');
                                                                                            });

                                                                                            app.listen(8080, () => {
                                                                                                console.log('Server listening on port 8080');
                                                                                                });