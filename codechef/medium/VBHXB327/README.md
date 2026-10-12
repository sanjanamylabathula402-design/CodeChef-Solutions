# VBHXB327

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Basic Navigation Bar

Okay, so very first we will build the navbar.
Your first task is to create a static navigation bar component for the blog application. This navbar will be purely presentational at this stage, displaying the application title and two navigation links: "Login" and "Create Account". It should be integrated into the main `App` component and should not have any dynamic behavior or logic related to authentication yet.

 **Objectives:** 

- Create a Navbar React component in src/components/Navbar.js.
- Implement the JSX structure for the navigation bar, including a brand link to the home page (/) and two static navigation links for "Login" and "Create Account".
- Apply basic styling in Navbar.css and ensure it is imported correctly. You can use the provided CSS or write your own styles, if you prefer.
 **Click to get the Navbar.css!** 

 **Your App should be look like this (Every text is link in this App)**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T09:10:27.448Z  

```cpp
                    text-decoration: none;
                      font-size: 1.5em;
                        font-weight: bold;
                        }

                        .navbar-right {
                          display: flex;
                            align-items: center;
                              gap: 15px;
                              }

                              .nav-link {
                                color:  white;
                                  text-decoration: none;
                                    padding: 8px 12px;
                                      border-radius: 4px;
                                        transition: background-color 0.3s ease;
                                        }

                                        .nav-link:hover {
                                          background-color:  #555;
                                          }
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB327)