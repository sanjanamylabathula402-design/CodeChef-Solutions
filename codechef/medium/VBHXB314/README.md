# VBHXB314

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem

 **Product API with Versioning :** 

You are building a Product Store API where different versions of the API return different sets of products. The goal is to demonstrate API versioning using three common strategies:

- URL Versioning – Clients request a specific version directly in the URL.

Example: `/api/v1/products` or `/api/v2/products`

- Query Parameter Versioning – Clients specify the version as a query parameter.

Example: `/api/products?version=1` or `/api/products?version=2`

- Header Versioning – Clients specify the version in the request headers.

Example: `/api/products-header` with header `API-Version: 1` or `API-Version: 2`

🎯  **Task** :

Implement an Express.js server that:

- Returns fruits in version 1 and gadgets in version 2 for URL versioning.
- Returns dummy product data depending on the query parameter version.
- Returns header-specific products when version is passed in the request header.

Note : Run backend first : server.js

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T18:25:53.408Z  

```cpp
// 1. URL Versioning
app.get('/api/v1/products', (req, res) => {
const headerVersion2Data = { version: '2.0', items: ['Enterprise Item 1', 'Enterprise Item 2'] };

  res.json({ version: 'v1', products: fruits });
  });

  app.get('/api/v2/products', (req, res) => {
    res.json({ version: 'v2', products: gadgets });
    });

    // 2. Query Parameter Versioning (e.g., /api/products?version=1 or ?version=2)
    app.get('/api/products', (req, res) => {
      const version = req.query.version;

        if (version === '1') {
            return res.json({ version: '1', products: queryVersion1Data });
              } else if (version === '2') {
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB314)