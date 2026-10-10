# OJJAR69

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### GreetingCard Component

Create personalized greeting cards that show each person's name, age, greeting message, and  **favorite color**  using React components.

 **Steps to Follow:** 

- Show Favorite Color in Greeting Card Modify the GreetingCard component to display the person's favorite color in a new paragraph (<p> tag) below their age. Use the existing favoriteColor prop to display this information. Example format: <p> My favorite color is {favoriteColor}.</p>
- Render Cards for All People In the App component, display a GreetingCard for every person in the people array. Pass all required information (name, age, greeting message, favorite color) as props to each card. Use the map() method to loop through the people array.

 **At the end your app should look like this**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T05:45:53.123Z  

```cpp
                                                                      };
                                                            fontWeight: '600',
                                                                marginBottom: '20px',
                                                                    marginTop: '0',
                                    textAlign: 'left',
                                        fontFamily: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif",
                                            borderTop: `5px solid ${favoriteColor || '#ddd'}`,
                                              };

                                                const headingStyle = {
                                                    color: '#333',
                                                        fontSize: '22px',
                            margin: '20px',
                                width: '300px',
                padding: '30px',
                    borderRadius: '12px',
                        boxShadow: '0 6px 20px rgba(0, 0, 0, 0.1)',
        const cardStyle = {
            backgroundColor: '#fff',
      ];

      function GreetingCard({ name, age, greeting, favoriteColor }) {
  { name: 'Alice', age: 28, greeting: 'Hello World!', favoriteColor: 'coral' },
    { name: 'Bob', age: 25, greeting: 'Have a fantastic day, Bob!', favoriteColor: 'tomato' },
      { name: 'Charlie', age: 32, greeting: 'Greetings everyone!', favoriteColor: 'mediumseagreen' },
import React from 'react';

const people = [
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR69)