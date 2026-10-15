                          });

                            // Schedule a task to run after microtasks but before timers
                              setImmediate(() => {
                                  console.log("5. Notify customer (Immediate)");
                                      
                                          // Schedule a timer to run after 0ms
                                              setTimeout(() => {
                                                    console.log("4. Coffee ready after 0ms (Timeout)");
                                                        }, 0);
                                                          });

                                                            console.log("6. Customer waits");
                                                            }

                                                            module.exports = { coffeeShopQueue };
