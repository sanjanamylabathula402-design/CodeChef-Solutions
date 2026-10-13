
          function App() {
            const [board, setBoard] = useState(getEmptyBoard);

              return (
                  <div className="container">
                        <h1>2048 Game</h1>
                              <div className="board">
                                      {board.map((row, rowIndex) => (
                                                <div className="row" key={rowIndex}>
                                                            {row.map((cell, cellIndex) => (
                                                                          <div className="cell" key={cellIndex}>
                                                                                          {cell !== 0 ? cell : ''}
                                                                                                        </div>
                                                                                                                    ))}
                                                                                                                              </div>
                                                                                                                                      ))}
                                                                                                                                            </div>
                                                                                                                                                </div>
                                                                                                                                                  );
                                                                                                                                                  }

                                                                                                                                                  export default App;