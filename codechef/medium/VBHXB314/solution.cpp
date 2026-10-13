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