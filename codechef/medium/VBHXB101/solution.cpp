                            // Check name and message are strings and not empty
                                if (
                                        typeof name !== 'string' ||
                                                name.trim() === '' ||
                                                        typeof message !== 'string' ||
                                                                message.trim() === ''
                                                                    ) {
                                                                            return res.status(400).send('Name and message must be non-empty strings.');
                                                                                }

                                                                                    // Check if email is a string and contains "@"
                                                                                        if (typeof email !== 'string' || !email.includes('@')) {
                                                                                                return res.status(400).send('Invalid email format.');
                                                                                                    }

                                                                                                        console.log({ name, email, message });
                                                                                                            res.send('Data received successfully!');
                                                                                                            });

                                                                                                            const PORT = 3000;
                                                                                                            app.listen(PORT, () => {
                                                                                                                console.log(`Server is running on port ${PORT}`);
                                                                                                                });