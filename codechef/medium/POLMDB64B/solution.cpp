    }
  },
  {
    $unwind: "$customerDetails"
  },
  {
    $match: {
      "customerDetails.city": "Bangalore"
    }
  }
]).forEach(doc => printjson(doc));

