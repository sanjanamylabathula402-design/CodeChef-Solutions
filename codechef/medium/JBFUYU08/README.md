# JBFUYU08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Todo List CRUD API

Great job on understanding the basics of mapping CRUD operations to HTTP methods! Now it's time to put that knowledge into practice.

You are building the backend for a simple To-Do List application. You have already been provided with the basic Express server setup, a Mongoose connection, and a `Todo` model.

The `Todo` model has a very simple structure:

- description: A String describing the task.
- completed: A Boolean indicating if the task is done (defaults to false).

Your job is to complete the API by implementing the four core CRUD endpoints. You need to fill in the logic for each route to interact with the MongoDB database using Mongoose.

#### Task using Mongoose functions:
- POST /todos: Complete the code to save new data in databse.
- GET /todos: Complete the code to find all the todos.
- PUT /todos/:id: Complete the code to find and update the todo with the particular id.
- DELETE /todos/:id: Complete the code to delete the todo with the given id.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T07:59:39.397Z  

```cpp
                try {
                        const { description, completed } = req.body;
                                const newTodo = new Todo({ description, completed });
                                        await newTodo.save();
                                                res.status(201).json(newTodo);

            // 1. POST /todos : Save new data in database
            app.post('/todos', async (req, res) => {
        description: { type: String, required: true },
            completed: { type: Boolean, default: false }
            });

            const Todo = mongoose.model('Todo', todoSchema);
    // Define Todo Schema and Model
    const todoSchema = new mongoose.Schema({

// ✅ Your MongoDB URI inserted here (with database name at the end)
const MONGO_URI = 'mongodb+srv://satyatejaswi130_db_user:1234teju@cluster0.uzzrdq8.mongodb.net/todoDB?retryWrites=true&w=majority';

mongoose.connect(MONGO_URI)
  .then(() => console.log('Connected to MongoDB Atlas'))
    .catch(err => console.error('Connection error:', err));


const app = express();
app.use(express.json());
const express = require('express');
const mongoose = require('mongoose');
```

---

[View on CodeChef](https://www.codechef.com/problems/JBFUYU08)