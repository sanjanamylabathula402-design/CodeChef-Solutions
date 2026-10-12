# VBHXB16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate Ice Cream Making

Let's simulate making ice cream using Promises! We'll break the process into asynchronous steps and chain them together.

Here's the scenario:

- Get Ingredients: This asynchronous function simulates gathering the ice cream ingredients. It will resolve with the string "Ingredients acquired".
- Mix Ingredients: This asynchronous function will take the ingredients as input and simulate mixing them. It will resolve with the string "Ingredients mixed".
- Freeze Mixture: This asynchronous function will take the mixed ingredients as input and simulate freezing the ice cream. It will resolve with the string "Ice cream frozen!".
- Add Toppings: This asynchronous function will take the frozen ice cream as input and simulate adding the toppings. It will resolve with the string "Ice cream with toppings!".

We'll use `setTimeout` to simulate the time each step takes.

### Task:

Your task is to write the promise chain that executes these functions in the correct order.

Remember to use `.then()` to chain the promises and `.catch()` to handle any errors. Also, include `console.log` statements in each `.then()` block to print the result of each step, similar to the coffee example. Finally, add one `console.log("Ice cream making in progress...")` statement before your chain.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T10:28:25.135Z  

```cpp
    });
  }
console.log("Ice cream making in progress...");

getIngredients()
  .then((result) => {
      console.log(result);
          return mixIngredients(result);
            })
              .then((result) => {
                  console.log(result);
                      return freezeMixture(result);
                        })
                          .then((result) => {
                              console.log(result);
                                  return addToppings(result);
                                    })
                                      .then((result) => {
                                          console.log(result);
                                            })
                                              .catch((error) => {
                                                  console.error("Error making ice cream:", error);
                                                    });
// Your code starts here: Create the Promise chain that calls these functions in order.
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB16)