                                                                            {/* STEP 1: Product details display */}
                                                                                  <h3>{props.product.name}</h3>
                                                                                        <p>Price: ${props.product.price}</p>
                                                                                              <button onClick={handleClick}>Select</button>
                                                                                                  </div>
                                                                                                    );
                                                                                                    }

                                                                                                    function App() {
                                                                                                      return (
                                                                                                          <div className="app">
                                                                                                                <h1>Product List</h1>
                                                                                                                      <div className="product-list">
                                                                                                                              {/* STEP 4: Render all product cards using .map() */}
                                                                                                                                      {products.map((product) => (
                                                                                                                                                <ProductCard key={product.id} product={product} />
                                                                                                                                                        ))}
                                                                                                                                                              </div>