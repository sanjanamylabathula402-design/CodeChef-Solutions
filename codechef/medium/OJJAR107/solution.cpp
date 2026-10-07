        const handleKeyPress = (e) => {
              if (e.code === 'KeyL') {
                      // Functional update ensures access to the latest state value
                              setIsOn((prevIsOn) => !prevIsOn);
                                    }
                                        };

                                            window.addEventListener('keydown', handleKeyPress);
                                                return () => window.removeEventListener('keydown', handleKeyPress);
                                                  }, []);

                                                    return (
                                                        <div>
                                                              <button onClick={() => setIsOn((prevIsOn) => !prevIsOn)}>
                                                                      Toggle Light (Button)
                                                                            </button>
                                                                                  <p>Light is {isOn ? "ON 🌟" : "OFF 🌑"}</p>
                                                                                        <small>Press "L" key to toggle!</small>