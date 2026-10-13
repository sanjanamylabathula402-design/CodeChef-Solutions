    redisClient.set("cachedGreeting", freshValue);
    res.send(freshValue);
  });
});

module.exports = app;  // export app (NOT listen)
