# OJJAR103

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Change the Background Color

You need to implement a background color changer that turns the page background to  **`lightblue`**  when the counter reaches $5$ or more. When the counter is less than $5,$ the background should return to its default color.

#### Steps to Complete:
- Use useEffect to detect changes in the count state
- When count >= 5, set document.body.style.backgroundColor to "lightblue"
- When count < 5, reset to default background (set to empty string "")
- Add the proper dependency array to ensure the effect runs when needed

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T07:15:26.328Z  

```cpp
                                                      <button onClick={() => setCount(count - 1)} style={{ marginLeft: "10px" }}>
                                                              Decrease Count
                                                                    </button>
                                                                          <button onClick={() => setCount(0)} style={{ marginLeft: "10px" }}>
                                                                                  Reset
                                                                                        </button>
                                                                                            </div>
                                                                                              );
                                                                                              }

                                                                                              export default App;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR103)