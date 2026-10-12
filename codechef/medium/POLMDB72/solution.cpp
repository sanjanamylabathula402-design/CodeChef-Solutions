
            // 2. Setup the Reviews
            db.reviews.insertMany([ 
              { productId: 1, rating: 5, comment: "Amazing!" }, 
                { productId: 1, rating: 4, comment: "Good quality" }, 
                  { productId: 1, rating: 3, comment: "Average" } 
                  ]);

                  // --- YOUR TASK PART B ---
                  // A new review with rating = 5 arrives.
                  db.reviews.insertOne({ productId: 1, rating: 5, comment: "Excellent!" });

                  // Recalculate the new values and update the product document.
                  // New average = (5 + 4 + 3 + 5) / 4 = 4.25
                  db.products.updateOne(
                    { _id: 1 },
                      { 
                          $set: { 
                                avgRating: 4.25, 
                                      reviewCount: 4 
                                          } 
                                            }
                                            );