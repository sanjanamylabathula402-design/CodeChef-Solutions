
const setMessage = (req, res, next) => {
    res.message = 'hello world';
        next();
        };
        
        const uppercaseMessage = (req, res, next) => {
            if (res.message) {
                    res.message = res.message.toUpperCase();
                        }
                            next();
                            };
                            
                            app.use(setMessage);
                            app.use(uppercaseMessage);
                            
                            app.get('/', (req, res) => {
                                res.send(res.message);
                                });
                                
                                app.listen(3000, () => {
                                    console.log('Server running on port 3000');
                                    });// write your code here
