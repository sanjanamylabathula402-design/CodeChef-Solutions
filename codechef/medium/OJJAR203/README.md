# OJJAR203

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Compressing Tiles to the Left

 **Goal:**  Implement the logic to slide all tiles in each row to the leftmost available positions, effectively "compressing" them and removing any empty spaces between them. You will create a `compress` function for this and then a basic `moveLeft` function that utilizes it.
 **The main rule for this project is:**  after every compression (that results from a `moveLeft` action and actually changes the board), you need to generate one random number (a new tile) on the grid.

 **What We Are Doing in This Chapter:**  We're taking the first major step towards enabling tile movement. When a user wants to move tiles (e.g., left), the first thing that needs to happen is for all existing tiles in each row to slide over, filling any empty spots to their left. For example, a row like `[0, 2, 0, 4]` should become `[2, 4, 0, 0]` after compression.
Following this compression, you must generate one random number (a new tile) on the grid.

for example you can write it like

```
let newBoard;
if (event.key === 'ArrowLeft') {
    newBoard = moveLeft(board);
}

```

 **Your App should be work like that at the end** 
 **How it works** : Press the left arrow ← and all tiles slide to the left.

 **Hints to write compress function** 

```
function compress(board) {
  let newBoard = board.map(row => {
    let newRow = row.filter(val => val !== 0);
    while (newRow.length < SIZE) newRow.push(0);
    return newRow;
  });
  return newBoard;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T14:04:18.669Z  

```cpp

                                                                                                                                                                              return (
                                                                                                                                                                                  <div className="container">
                                                                                                                                                                                        <h1>2048 Game</h1>
                                                                                                                                                                                              <div className="board">
                                                                                                                                                                                                      {board.map((row, rowIndex) => (
                                                                                                                                                                                                                <div className="row" key={rowIndex}>
                                                                                                                                                                                                                            {row.map((cell, cellIndex) => (
                                                                                                                                                                                                                                          <div 
                                                                                                                                                                                                                                                          className={`cell cell-${cell !== 0 ? 1 : 0}`} 
                                                                                                                                                                                                                                                                          key={cellIndex}
                                                                                                                                                                                                                                                                                        >
                                                                                                                                                                                                                                                                                                        {cell !== 0 ? cell : ''}
                                                                                                                                                                                                                                                                                                                      </div>
                                                                                                                                                                                                                                                                                                                                  ))}
                                                                                                                                                                                                                                                                                                                                            </div>
                                                                                                                                                                                                                                                                                                                                                    ))}
                                                                                                                                                                                                                                                                                                                                                          </div>
                                                                                                                                                                                                                                                                                                                                                              </div>
                                                                                                                                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                                export default App;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR203)