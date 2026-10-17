                                                                                              }

                                                                                                if (error) {
                                                                                                    return <div className="container error-message">Error: {error}</div>;
                                                                                                      }

                                                                                                        return (
                                                                                                            <div className="container">
                                                                                                                  <h2>All Blog Posts</h2>
                                                                                                                        {blogs.length === 0 ? (
                                                                                                                                <p className="no-blogs">No blogs available yet. Be the first to create one!</p>
                                                                                                                                      ) : (
                                                                                                                                              <div className="blog-list">
                                                                                                                                                        {blogs.map((blog) => (
                                                                                                                                                                    <BlogCard key={blog._id} blog={blog} />
                                                                                                                                                                              ))}
                                                                                                                                                                                      </div>
                                                                                                                                                                                            )}
                                                                                                                                                                                                </div>
                                                                                                                                                                                                  );
                                                                                                                                                                                                  };

                                                                                                                                                                                                  export default Home;