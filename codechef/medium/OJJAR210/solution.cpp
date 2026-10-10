                                    <div className={styles.container}>
                                          <h1>Animated Counter</h1>
                                                
                                                      <div className={styles.counterBox}>
                                                              {/* Only render the fling message if an increment has happened */}
                                                                      {animKey > 0 && (
                                                                                <div key={animKey} className={styles.flingMessage}>
                                                                                            {`+${lastIncrement}`}
                                                                                                      </div>
                                                                                                              )}
                                                                                                                      <div className={styles.countValue}>{count}</div>
                                                                                                                            </div>

                                                                                                                                  <div className={styles.buttonGroup}>
                                                                                                                                          <button onClick={() => handleIncrement(1)}>+1</button>
                                                                                                                                                  <button onClick={() => handleIncrement(5)}>+5</button>
                                                                                                                                                          <button onClick={() => handleIncrement(10)}>+10</button>
                                                                                                                                                                </div>
                                                                                                                                                                    </div>
                                                                                                                                                                      );
                                                                                                                                                                      }

                                                                                                                                                                      export default CounterApp;