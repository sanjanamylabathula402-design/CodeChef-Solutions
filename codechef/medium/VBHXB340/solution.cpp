    const isOwner = currentUserId ? blog.author?._id === currentUserId || blog.author === currentUserId : true;

      return (
          <div className="blog-card">
                <h3>{blog.title}</h3>
                      <p className="blog-author">By: {blog.author?.username || 'Author'}</p>
                            <p className="blog-snippet">{blog.content.substring(0, 100)}...</p>
                                  
                                        {isOwner && (
                                                <div className="blog-actions">
                                                          <button 
                                                                      onClick={() => onDelete(blog._id)} 
                                                                                  className="delete-btn"
                                                                                            >
                                                                                                        Delete
                                                                                                                  </button>
                                                                                                                          </div>
                                                                                                                                )}
                                                                                                                                    </div>
                                                                                                                                      );
                                                                                                                                      };

                                                                                                                                      export default BlogCard;