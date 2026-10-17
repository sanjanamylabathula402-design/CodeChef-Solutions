import React from 'react';

const BlogCard = ({ blog }) => {
  return (
      <div className="blog-card">
            <h3>{blog.title}</h3>
                  <p className="blog-author">By: {blog.author?.username || 'Unknown'}</p>
                        <p className="blog-snippet">{blog.content.substring(0, 100)}...</p>
                            </div>
                              );
                              };

                              export default BlogCard;