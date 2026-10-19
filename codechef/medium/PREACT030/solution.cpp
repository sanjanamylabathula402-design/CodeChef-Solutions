                                                            ? "2px solid rgb(255, 0, 0)" 
                                                                      : "2px solid rgb(128, 128, 128)"
                                                                            }}
                                                                                >
                                                                                      <h3>{props.product.name}</h3>
                                                                                            <p>Price: ${props.product.price}</p>
                                                                                                  <button onClick={handleClick}>Select</button>
                                                                                                      </div>
                                                                                                        );
                                                                                                        }

                                                                                                        function App() {
                                                                                                          return (
                                                                                                              <div className="app-container">
                                                                                                                    <h1>Product List</h1>
                                                                                                                          {products.map((product) => (
                                                                                                                                  <ProductCard key={product.id} product={product} />
                                                                                                                                        ))}
                                                                                                                                            </div>
                                                                                                                                              );
                                                                                                                                              }

                                                                                                                                              export default App;