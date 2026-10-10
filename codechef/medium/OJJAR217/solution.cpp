                                                          }
                                                            }
                                                            }

                                                            function App() {
                                                              const [state, dispatch] = useReducer(myReducer, { count: 0 });

                                                                return (
                                                                    <div style={{ textAlign: 'center', marginTop: '50px' }}>
                                                                          <h1>Counter App</h1>
                                                                                <h2>Count: {state.count}</h2>
                                                                                      <div>
                                                                                              <button onClick={() => dispatch({ type: 'DECREMENT' })}>-</button>
                                                                                                      <button onClick={() => dispatch({ type: 'RESET' })} style={{ margin: '0 10px' }}>
                                                                                                                Reset
                                                                                                                        </button>
                                                                                                                                <button onClick={() => dispatch({ type: 'INCREMENT' })}>+</button>
                                                                                                                                      </div>
                                                                                                                                          </div>
                                                                                                                                            );
                                                                                                                                            }

                                                                                                                                            export default App;