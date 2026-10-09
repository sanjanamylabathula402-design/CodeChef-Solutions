# TJEKQL12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Time Logger Middleware

Let's build a "Time Logger Middleware". This middleware will log the time of each incoming request to your Express application. This can be helpful for debugging or monitoring the performance of your application.

#### Task:

You need to create an Express application with two routes: `/`. You'll also create a custom middleware called `timeLogger` that does the following:

- For each incoming request, it should: Get the current date and time using new Date(). Log the route and the current time to the console in the format: Route: [route], Time: [time]. Call next() to pass control to the next middleware or route handler.
#### Expected output:
#### Note:

The server should run on port 3000.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T03:20:41.756Z  

```cpp
const app = express();
const port = 3000;

// Custom middleware: timeLogger
const timeLogger = (req, res, next) => {
  const route = req.path;
    const time = new Date();

      console.log(`Route: ${route}, Time: ${time}`);

        next();
        };

        app.use(timeLogger);

        // Routes
        app.get('/', (req, res) => {
          res.send('Home Page');
          });

          app.listen(port, () => {
            console.log(`Server listening on port ${port}`);
            });

```

---

[View on CodeChef](https://www.codechef.com/problems/TJEKQL12)