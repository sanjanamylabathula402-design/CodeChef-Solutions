              console.log(`${seconds} seconds left`);
                  seconds--;
                    });

                      const intervalId = setInterval(() => {
                          if (seconds > 0) {
                                console.log(`${seconds} seconds left`);
                                      seconds--;
                                          }
                                            }, 1000);

                                              setTimeout(() => {
                                                  clearInterval(intervalId);
                                                      console.log("Countdown complete!");
                                                        }, 3000);
                                                        }

                                                        module.exports = { runCountdown };

                                                        if (require.main === module) {
                                                          runCountdown();
                                                          }
          setImmediate(() => {

        let seconds = 3;
