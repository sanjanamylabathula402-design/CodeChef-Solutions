      <>
            {/* Application title */}
                  <h1>My React App</h1>

                        {/* Conditional rendering using logical AND (&&) and ternary operator */}
                              {isLoggedIn && isPremiumUser ? (
                                      <p>Welcome to Premium Content! 🎉</p>
                                            ) : (
                                                    <p>Please log in and upgrade to premium...</p>
                                                          )}
                                                              </>
                                                                );
                                                                }

                                                                // App component: Manages state and renders the WelcomeMessage component
                                                                export default function App() {
                                                                  const isLoggedIn = true; // Change these values to test different scenarios
                                                                    const isPremiumUser = false; // Change these values to test different scenarios