# VBHXB282

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Redis- Example

Here’s a  **worked example**  with  **two routes** :

- /without-cache: Always recomputes and sends a fresh response.
- /with-cache: Uses Redis (mock) to cache the computed value and return it if available.

 **How this works** 

- Hit /without-cache multiple times → response will always change (timestamp updates).
- Hit /with-cache multiple times → first request is "Fresh:", later requests come from Redis (From cache:) with the same value until you restart or reset the cache.

This makes the benefit of caching  **visible instantly**.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T18:16:19.239Z  

```cpp
    redisClient.set("cachedGreeting", freshValue);
    res.send(freshValue);
  });
});

module.exports = app;  // export app (NOT listen)

```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB282)