                                                                          }, []);

                                                                            return (
                                                                                <div>
                                                                                      <h2>Window Size Tracker</h2>
                                                                                            <p>Width: {windowSize.width}px</p>
                                                                                                  <p>Height: {windowSize.height}px</p>
                                                                                                      </div>
                                                                                                        );
                                                                                                        }

                                                                                                        export default function App() {
                                                                                                          const [showTracker, setShowTracker] = useState(true);

                                                                                                            return (
                                                                                                                <div>
                                                                                                                      <button onClick={() => setShowTracker(!showTracker)}>
                                                                                                                              Toggle Window Tracker
                                                                                                                                    </button>
                                                                                                                                          {showTracker && <WindowTracker />}
                                                                                                                                              </div>
                                                                                                                                                );
                                                                                                                                                }