db.products.insertMany([
    {
        name: "Galaxy S24",
        category: "Electronics",
        specs: { 
            ram: "8GB", 
            storage: "256GB" 
        }
    },
    {
        name: "Gaming Credits",
        value: 50,
        currency: "USD",
        redeemable: true
    }
]);

// 3. Verification