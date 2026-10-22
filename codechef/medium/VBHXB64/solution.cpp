
                        if (!productId) {
                            res.statusCode = 400;
                                res.end('Error: Product ID is required');
                                  } else if (productId === '123') {
                                      res.end('Product ID: 123, Name: Example Product, Price: $25');
                                        } else if (productId === '456') {
                                            // CHECK: copy the exact text from your original file (price may differ)
                                                res.end('Product ID: 456, Name: Another Product, Price: $50');
                                                  } else {
                                                      res.statusCode = 404;
                                                          res.end('Not Found');
                                                            }
                                                            });

                                                            module.exports = server;

                                                            if (require.main === module) {
                                                              // CHECK: use the port from your original file if it was different
                                                                server.listen(3000, () => {
                                                                    console.log('Server running on port 3000');
                                                                      });
                                                                      }