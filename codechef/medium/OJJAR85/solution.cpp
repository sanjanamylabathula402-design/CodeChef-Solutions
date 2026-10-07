              };

                return (
                    <div className="container">
                          <h2>useState Form Value Demo</h2>
                                <input
                                        type="text"
                                                value={value}
                                                        onChange={(e) => setValue(e.target.value)}
                                                                placeholder="Type something..."
                                                                        className="input-field"
                                                                              />

                                                                                    <div className="display-container">
                                                                                            <p>Live Display: {value}</p>
                                                                                                  </div>

                                                                                                        <button onClick={generateRandomString} className="btn">