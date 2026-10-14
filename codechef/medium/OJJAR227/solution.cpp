                                                                                                                                                                                                      }}
                                                                                                                                                                                                            />
                                                                                                                                                                                                                </div>
                                                                                                                                                                                                                  );
                                                                                                                                                                                                                  }

                                                                                                                                                                                                                  export default CountdownTimer;
                                                                                                                                    <h2>Time Left: {timeLeft}s</h2>
                                                                                                                                          <TimerControls
                                                                                                                                                  isRunning={isRunning}
                                                                                                                                                          onStart={() => setIsRunning(true)}
                                                                                                                                                                  onPause={() => setIsRunning(false)}
                                                                                                                                                                          onReset={() => {
                                                                                                                                                                                    setIsRunning(false);
                                                                                                                                                                                              setTimeLeft(10);
                                                                                                                          return (
                                                                                                                              <div className="timer">