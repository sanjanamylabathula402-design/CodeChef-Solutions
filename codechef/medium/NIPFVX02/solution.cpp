// Simulated incoming data from req.body
const bookData = {
  name: "The Great Gatsby",
  price: 299,
  description: "A classic novel by F. Scott Fitzgerald",
  author: "F. Scott Fitzgerald",
  pages: 180
};

const tshirtData = {
  name: "Cool Coder Tee",
  price: 499,
  description: "A comfortable t-shirt for coders",
  color: "black",
  size: "L",
  material: "cotton"
};

console.log("\n=== SQL Approach ===");

// In SQL, we would typically use a main 'products' table for common fields,
// and additional tables for type-specific fields (joined via product_id).
const sqlProductTable = [
  {
    product_id: 1,
    name: bookData.name,
    price: bookData.price,
    description: bookData.description,