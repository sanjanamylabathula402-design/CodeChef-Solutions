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