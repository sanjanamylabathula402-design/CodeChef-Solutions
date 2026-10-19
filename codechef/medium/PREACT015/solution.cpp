      <div>
            {/* Heading for the user profile section */}
                  <h2>User Profile:</h2>
                        {/* Displaying the user's name from props */}
                              <p>Name: {props.name}</p>
                                    {/* Displaying the user's age from props */}
                                          <p>Age: {props.age}</p>
                                              </div>
                                                );
                                                }

                                                // App component: Renders multiple UserProfile components with different data
                                                function App() {
                                                  return (
                                                      <div>
                                                            {/* Passing different names and ages to the UserProfile component */}
                                                                  <UserProfile name="Alice" age={25} />
                                                                        <UserProfile name="Bob" age={30} />
                                                                            </div>
                                                                              );
                                                                              }

                                                                              export default App; // Exporting the App component for use in the application