fs.readFile(inputFile, 'utf8', (err, data) => {
    if (err) {
            return console.error('Error reading file:', err);
                }

                    const fruits = data.split('\n').map(fruit => fruit.trim());
                        const filtered = fruits.filter(
                                fruit => !fruit.toLowerCase().startsWith('b')
                                    );

                                        const result = filtered.join('\n');

                                            console.log('Writing filtered fruits to filtered_fruits.txt...');

                                                fs.writeFile(outputFile, result, 'utf8', (err) => {
                                                        if (err) {
                                                                    return console.error('Error writing file:', err);
                                                                            }


console.log('Reading fruits.txt...');
const outputFile = path.resolve(__dirname, 'filtered_fruits.txt');
const inputFile = path.resolve(__dirname, 'fruits.txt');

const path = require('path');
const fs = require('fs');

                                                                                    console.log('Filtered fruits written successfully!');