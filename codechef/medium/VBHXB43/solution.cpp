const fs = require('fs');
const path = require('path');

// Hardcoded file name
const initialFileName = 'example.txt';
const organizedFileName = 'organized_file.txt';

const initialFilePath = path.resolve(__dirname, initialFileName);
const organizedFilePath = path.resolve(__dirname, organizedFileName);
if (!fs.existsSync(initialFilePath)) {
      fs.writeFileSync(initialFilePath, '');
              console.log(`Created new file: ${initialFileName}`);
                      }
                              // 2. Append the text "File organized!" to the file
                                      fs.appendFileSync(initialFilePath, 'File organized!');
                                              console.log(`Appended "File organized!" to ${initialFileName}`);
                                                      // 3. Rename the file to organized_file.txt
                                                              fs.renameSync(initialFilePath, organizedFilePath);
                                                                      console.log(`File renamed to ${organizedFileName}`);
