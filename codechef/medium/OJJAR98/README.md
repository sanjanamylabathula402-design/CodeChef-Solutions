# OJJAR98

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Rules of Hooks
#### Task: Fix the Hook Usage

In our IDE you are given a component that violates the Rules of Hooks. Identify the mistake and correct the code.

Once done, submit your solution to verify correctness.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T07:09:38.208Z  

```cpp
                                                  <label htmlFor={`${uniqueId}-name`}>Name:</label>
                                                          <input
                                                                    id={`${uniqueId}-name`}
                                                                              type="text"
                                                                                        value={name}
                                                                                                  onChange={(e) => setName(e.target.value)}
                                                                                                          />
                                                                                                                </div>
                                                                                                                      <div>
                                                                                                                              <label htmlFor={`${uniqueId}-email`}>Email:</label>
                                                                                                                                      <input
                                                                                                                                                id={`${uniqueId}-email`}
                                                                                                                                                          type="email"
                                                                                                                                                                    value={email}
                                                                                                                                                                              onChange={(e) => setEmail(e.target.value)}
                                                                                                                                                                                      />
                                                                                                                                                                                            </div>
                                                                                                                                                                                                  <button type="submit">Submit</button>
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR98)