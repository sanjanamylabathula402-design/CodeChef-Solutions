                                                                                                                {/* Button to increase the temperature */}
                                                                                                                        <button onClick={() => setTemperature(temperature + 1)}>Increase</button>
                                                                                                                                
                                                                                                                                        {/* Button to decrease the temperature */}
                                                                                                                                                <button onClick={() => setTemperature(temperature - 1)}>Decrease</button>
                                                                                                                                                        
                                                                                                                                                                {/* Button to convert unit */}
                                                                                                                                                                        <button onClick={convertTemperature}>
                                                                                                                                                                                  Convert to {unit === "C" ? "Fahrenheit" : "Celsius"}
                                                                                                                                                                                          </button>
                                                                                                                                                                                                </div>
                                                                                                                                                                                                    </div>
                                                                                                                                                                                                      );
                                                                                                                                                                                                      }

                                                                                                                                                                                                      export default Temperature;