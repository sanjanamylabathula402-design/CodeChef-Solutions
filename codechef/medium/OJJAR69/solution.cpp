import React from 'react';

const people = [
  { name: 'Alice', age: 28, greeting: 'Hello World!', favoriteColor: 'coral' },
    { name: 'Bob', age: 25, greeting: 'Have a fantastic day, Bob!', favoriteColor: 'tomato' },
      { name: 'Charlie', age: 32, greeting: 'Greetings everyone!', favoriteColor: 'mediumseagreen' },
      ];

      function GreetingCard({ name, age, greeting, favoriteColor }) {
        const cardStyle = {
            backgroundColor: '#fff',
                padding: '30px',
                    borderRadius: '12px',
                        boxShadow: '0 6px 20px rgba(0, 0, 0, 0.1)',
                            margin: '20px',
                                width: '300px',
                                    textAlign: 'left',
                                        fontFamily: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif",
                                            borderTop: `5px solid ${favoriteColor || '#ddd'}`,
                                              };

                                                const headingStyle = {
                                                    color: '#333',
                                                        fontSize: '22px',
                                                            fontWeight: '600',
                                                                marginBottom: '20px',
                                                                    marginTop: '0',
                                                                      };