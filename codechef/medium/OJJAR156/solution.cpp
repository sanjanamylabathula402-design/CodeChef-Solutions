        <button className="child-button" onClick={onClick}>
              Increment Counter
                  </button>
                    );
                    });

                    function Parent() {
                      const [count, setCount] = useState(0);

                        // ✅ Memoized function to prevent re-creation on every render
                          const handleIncrement = useCallback(() => {
                              setCount((c) => c + 1);
                                }, []);

                                  return (
                                      <div className="parent-container">
                                            <p className="counter-text">Count: {count}</p>
                                                  <ChildButton onClick={handleIncrement} />
                                                      </div>
                                                        );
                                                        }

                                                        export default Parent;