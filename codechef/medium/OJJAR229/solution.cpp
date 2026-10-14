                                                    <h1>📈 Crypto Dashboard</h1>
                                                          <p>Updates every 5 seconds...</p>
                                                                <table style={{ margin: "0 auto", borderCollapse: "collapse", width: "50%" }}>
                                                                        <thead>
                                                                                  <tr style={{ borderBottom: "2px solid #ccc" }}>
                                                                                              <th style={{ padding: "10px" }}>Name</th>
                                                                                                          <th style={{ padding: "10px" }}>Price</th>
                                                                                                                    </tr>
                                                                                                                            </thead>
                                                                                                                                    <tbody>
                                                                                                                                              {cryptoData.map((coin, index) => (
                                                                                                                                                          <tr key={index} style={{ borderBottom: "1px solid #eee" }}>
                                                                                                                                                                        <td style={{ padding: "10px" }}>{coin.name}</td>
                                                                                                                                                                                      <td style={{ padding: "10px" }}>{coin.price}</td>
                                                                                                                                                                                                  </tr>
                                                                                                                                                                                                            ))}
                                                                                                                                                                                                                    </tbody>
                                                                                                                                                                                                                          </table>
                                                                                                                                                                                                                              </div>
                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                export default App;