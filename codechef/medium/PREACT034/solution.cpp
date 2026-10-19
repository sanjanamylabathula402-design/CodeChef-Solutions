                                                    };

                                                      return (
                                                          <div className={styles.wrapper}>
                                                                <h1>Temperature Converter</h1>
                                                                      <div className={styles.display}>
                                                                              {temperature.toFixed(2)}
                                                                                      <span>°{unit}</span>
                                                                                            </div>
                                                                                                  <div className={styles.controls}>
                                                                                                          <button onClick={() => setTemperature((prev) => prev + 1)}>
                                                                                                                    Increase
                                                                                                                            </button>
                                                                                                                                    <button onClick={() => setTemperature((prev) => prev - 1)}>
                                                                                                                                              Decrease
                                                                                                                                                      </button>
                                                                                                                                                              <button onClick={convertTemperature}>
                                                                                                                                                                        Convert to {unit === "C" ? "Fahrenheit" : "Celsius"}
                                                                                                                                                                                </button>
                                                                                                                                                                                      </div>
                                                                                                                                                                                          </div>
                                                                                                                                                                                            );
                                                                                                                                                                                            }