// write your code here
const path = require('path');

// 1. Construct the path using path.join()
const joinedPath = path.join('books', 'fiction', 'The_Great_Novel.pdf');

// 2. Convert to an absolute path using path.resolve()
const absolutePath = path.resolve(joinedPath);

// 3. Extract the directory, filename, change extension to .epub, and create a new path
const dirName = path.dirname(absolutePath);
const extName = path.extname(absolutePath);
const baseName = path.basename(absolutePath, extName);
const newFileName = baseName + '.epub';
const newAbsolutePath = path.join(dirName, newFileName);

// 4. Print both absolute paths to the console
console.log('Original Absolute Path:', absolutePath);
console.log('New Absolute Path:', newAbsolutePath);