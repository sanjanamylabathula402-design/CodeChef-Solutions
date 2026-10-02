const words = ["apple", "banana", "cherry", "watermelon", "kiwi"];

// complete the code 
const longestWord=words.reduce((longest,current)=>{ return current.length > longest.length ? current : longest;
});
console.log(longestWord);



