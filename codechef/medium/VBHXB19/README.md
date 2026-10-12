# VBHXB19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Recipe Preparation

Let's simulate preparing a sandwich using `async/await`. We'll create three asynchronous functions: `prepareBread`, `addFilling`, and `wrapSandwich`. Each function will simulate a step in the sandwich-making process and will take a certain amount of time. The `prepareSandwich` function will then use `async/await` to orchestrate these steps and return a complete sandwich.

### Task:

Your task is to create an `async` function called `prepareSandwich` that uses `await` to call `prepareBread`, `addFilling`, and `wrapSandwich` in sequence.
The `prepareSandwich` function should then return a message `Sandwich is ready to eat!` indicating that the sandwich is ready.
Now complete the following `prepareSandwich` function using `async/await`.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T10:30:55.511Z  

```cpp
                                                            console.log(breadResult);

                                                              const fillingResult = await addFilling();
                                                                console.log(fillingResult);

                                                                  const wrapResult = await wrapSandwich();
                                                                    console.log(wrapResult);

                                                                      return "Sandwich is ready to eat!";
                                                                      }

                                                                      prepareSandwich().then(result => console.log(result));
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB19)