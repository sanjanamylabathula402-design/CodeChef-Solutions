var pagedb = db.articles.aggregate([

]);
  { title: "Schema Design", author: "Daisy", views: 280 },
  { title: "Transactions in MongoDB", author: "Eve", views: 600 },
  { title: "Sharding Deep Dive", author: "Frank", views: 150 }
    { $skip: 2 },
      { $limit: 3 }
      ]).toArray();

      printjson(pagedb);


// Store result in separate collection
db.paginatedArticles.insertMany(pagedb);
