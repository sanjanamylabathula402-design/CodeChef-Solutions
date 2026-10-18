
                                                                                    fs.readFile(filePath, 'utf8', (err, content) => {
                                                                                            if (err) {
                                                                                                        return res.status(404).send('Note not found');
                                                                                                                }
                                                                                                                        res.render('view-note', { title, content });
                                                                                                                            });
                                                                                                                            });

                                                                                                                            // POST /notes/:title/delete - Delete a note
                                                                                                                            router.post('/:title/delete', (req, res) => {
                                                                                                                                const { title } = req.params;
                                                                                                                                    const filePath = path.join(__dirname, '../notes', `${title}.txt`);

                                                                                                                                        fs.unlink(filePath, (err) => {
                                                                                                                                                if (err) {
                                                                                                                                                            return res.status(500).send('Error deleting note');
                                                                                                                                                                    }
                                                                                                                                                                            res.redirect('/notes');
                                                                                                                                                                                });
                                                                                                                                                                                });

                                                                                                                                                                                module.exports = router;