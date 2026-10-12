const fs = require('fs');

const initialFilePath = 'file.txt';
const renamedFilePath = 'newFile.txt';

try {
    fs.unlinkSync(renamedFilePath);
    console.log('File deleted successfully!');
} catch (err) {
    console.error('Error deleting file:', err);
}