      <AuthProvider>
            <Router>
                    <Navbar />
                            <div className="main-content">
                                      <Routes>
                                                  <Route path="/" element={<Home />} />
                                                              <Route path="/login" element={<Login />} />
                                                                          <Route path="/register" element={<Register />} />
                                                                                      
                                                                                                  {/* Protected Routes */}
                                                                                                              <Route element={<PrivateRoute />}>
                                                                                                                            <Route path="/create" element={<CreateBlog />} />
                                                                                                                                          <Route path="/my-blogs" element={<MyBlogs />} />
                                                                                                                                                        <Route path="/edit/:id" element={<EditBlog />} />
                                                                                                                                                                    </Route>
                                                                                                                                                                              </Routes>
                                                                                                                                                                                      </div>
                                                                                                                                                                                            </Router>
                                                                                                                                                                                                </AuthProvider>
                                                                                                                                                                                                  );
                                                                                                                                                                                                  }

                                                                                                                                                                                                  export default App;