# OJJAR65

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Props in React

We have already created a greeting card in the last lesson! Now, we will use  **components and props**  to make the solution more efficient and reusable.

#### Your Task:
- Create a reusable component <GreetingCard /> that takes name, age, and greeting as props.
- Use instances of <GreetingCard /> inside the App component with values for name, age, and greeting.
- Make sure not change the messages.

 **Note - Make sure to take the** `styles` **and** `jsx` **from the App component.** 
Once you're done, submit your solution and check it's correct not.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T05:16:04.018Z  

```cpp
                                                          <p>I am {age} years old.</p>
                                                              </div>
                                                                );
                                                                }

                                                                export default function App() {
                                                                  return (
                                                                      <div>
                                                                            <GreetingCard greeting="Welcome!" name="Alice" age={25} />
                                                                                </div>
                                                                                  );
                                                                                  
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR65)