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
