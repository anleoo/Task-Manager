/* global use, db */
// MongoDB Playground
// Use Ctrl+Space inside a snippet or a string literal to trigger completions.

const database = 'taskmanager';
const collection = 'task';

// Connect to the "admin" database
db = db.getSiblingDB('admin');

// Create a new user for the "taskmanager" database with readWrite permissions
db.createUser({
  user: "taskuser",
  pwd: "task",
  roles: [
    {
      role: "readWrite",
      db: "taskmanager"
    }
  ]
});


// Create a new database.
use(database);

// Create a new collection.()
db.createCollection(collection);

//Create init tasks
db.tasks.insertMany([ 
    { title: "Task 1", description: "This is task 1", completed: false },
    { title: "Task 2", description: "This is task 2", completed: false }
  ]);

