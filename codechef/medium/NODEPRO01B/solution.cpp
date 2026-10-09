  });

  // POST /notes/add - Create new note file
  router.post('/add', (req, res) => {
    const { title, content } = req.body;

      // Check missing fields
        if (!title || !content) {
            return res.send('Missing fields');
              }

                // Save as [title].txt in the notes directory
                  const filePath = path.join(__dirname, '../notes', `${title}.txt`);

                    fs.writeFile(filePath, content, (err) => {
                        if (err) {
                              return res.status(500).send('Error saving note');
                                  }
                                      res.send('Note saved');
                                        });
                                        });

                                        module.exports = router;
