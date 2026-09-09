        // Exclude the _id field from output
        _id: 0
      }
    }
  ]).toArray();
  
  // Print the result
  printjson(result);
  db.results.insertMany(result);


  
