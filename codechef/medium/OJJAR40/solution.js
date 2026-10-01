const users = [
  { name: 'Alice', age: 25 },
  { name: 'Bob', age: 30 },
  { name: 'Charlie', age: 22 }
];


// Complete the code below.
// formated log
// console.log(`Hello, ${user.name}! You are ${user.age} years old.`);

users.forEach(user=>{
    console.log(`Hello, ${user.name}! you are ${user.age} years old.`
    );
});
