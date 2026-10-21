# VBHXB22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate File Processing with Error Handling

Let's practice how to handle errors in using different functions:

### Task:
- Complete the code to handle errors using async/await.
- Complete the code to handle errors using.then()/.catch().
- Complete the code to handle errors using callback function and print the result or error in the given way:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T16:20:24.387Z  

```cpp
                                                                                                                                                                                                                        .then(data => {
                                                                                                                                                                                                                                    console.log(`Promise: { city: '${data.city}', temp: '${data.temp}', condition: '${data.condition}' }`);
                                                                                                                                                                                                                                            })
                                                                                                                                                                                                                                                    .catch(error => {
                                                                                                                                                                                                                                                                console.log(`Promise Error: ${error}`);
                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                        // 4. Callback execution implementation
                                                                                                                                                                                                                                                                        function getWeatherCallback(city) {
                                                                                                                                                                                                                                                                            fetchWeatherWithCallback(city, (error, data) => {
                                                                                                                                                                                                                                                                                    if (error) {
                                                                                                                                                                                                                                                                                                console.log(`Callback Error: ${error}`);
                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                    console.log(`Callback: { city: '${data.city}', temp: '${data.temp}', condition: '${data.condition}' }`);
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                // Example calls matching the terminal output format
                                                                                                                                                                                                                                                                                                                                getWeatherAsync("Delhi");
                                                                                                                                                                                                                                                                                                                                getWeatherPromise("Mumbai");
                                                                                                                                                                                                                                                                                                                                getWeatherCallback("Bangalore");
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB22)