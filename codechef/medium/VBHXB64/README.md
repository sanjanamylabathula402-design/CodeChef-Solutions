# VBHXB64

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Product Details Server

You are tasked with creating a simple server that provides product details based on the product ID provided in the URL.

Here's the scenario:

We want our server to respond with different product details based on the URL.

- If the user visits /product?id=123, the server should respond with "Product ID: 123, Name: Example Product, Price: $25".
- If the user visits /product?id=456, the server should respond with "Product ID: 456, Name: Another Product, Price: $50".
- If the user visits just /product, or /product?id=, the server should respond with "Error: Product ID is required".
- If the user visits any other path, the server should respond with a 404 "Not Found" error.

The product details are hardcoded within the server.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T03:54:03.848Z  

```cpp

                        if (!productId) {
                            res.statusCode = 400;
                                res.end('Error: Product ID is required');
                                  } else if (productId === '123') {
                                      res.end('Product ID: 123, Name: Example Product, Price: $25');
                                        } else if (productId === '456') {
                                            // CHECK: copy the exact text from your original file (price may differ)
                                                res.end('Product ID: 456, Name: Another Product, Price: $50');
                                                  } else {
                                                      res.statusCode = 404;
                                                          res.end('Not Found');
                                                            }
                                                            });

                                                            module.exports = server;

                                                            if (require.main === module) {
                                                              // CHECK: use the port from your original file if it was different
                                                                server.listen(3000, () => {
                                                                    console.log('Server running on port 3000');
                                                                      });
                                                                      }
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB64)