                                                                                                              res.send(`${name}'s favorite color is ${color}`);
                                                                                                                  } else {
                                                                                                                          res.send(`Color for ${name} not found`);
                                                                                                                              }
                                                                                                                              });

                                                                                                                              if (require.main === module) {
                                                                                                                                  app.listen(port, () => {
                                                                                                                                          console.log(`Server running at http://localhost:${port}`);
                                                                                                                                              });
                                                                                                                                              }

                                                                                                                                              export default app;