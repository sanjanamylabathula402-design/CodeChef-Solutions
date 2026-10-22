<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>All Notes</title>
            </head>
            <body>
                <h1>All Notes</h1>
                    <ul>
                            <% if (notes && notes.length > 0) { %>
                                        <% notes.forEach(note => { %>
                                                        <li>
                                                                            <%= note.replace('.txt', '') %>
                                                                                            </li>
                                                                                                        <% }) %>
                                                                                                                <% } else { %>
                                                                                                                            <p>No notes found.</p>
                                                                                                                                    <% } %>
                                                                                                                                        </ul>
                                                                                                                                        </body>
                                                                                                                                        </html>