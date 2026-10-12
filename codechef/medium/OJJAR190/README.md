# OJJAR190

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### About Section

Alright, let's move on to the next challenge!

 **Problem Description:** 

Your next task is to create the "About Me" section for your portfolio. This section is crucial for introducing yourself, sharing a bit about your passion for development, and highlighting your key skills. You'll also include a link to download your resume.

 **Note:** 

- The main container for this section should be a <section> element. It must have an id attribute set to about. It must have a className attribute set to about-section.
- The <div> element wrapping the resume link should have the className="about-actions".
- The resume link (<a> tag) should have two classes: btn and btn-primary.
- The <ul> element listing your skills should have the className="skills-list". Example - <ul className="skills-list"> <li>HTML5</li> <li>CSS3</li>... </ul>

 **Your app's "About" section should aim to look something like this (structure and elements):**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T06:53:06.550Z  

```cpp
                                                                                            <div className="about-actions">
                                                                                                    <a
                                                                                                              href="/your-name-resume.pdf" // Make sure this matches your PDF filename in /public
                                                                                                                        target="_blank"
                                                                                                                                  rel="noopener noreferrer"
                                                                                                                                            className="btn btn-primary" // Using a general btn class
                                                                                                                                                    >
                                                                                                                                                              View/Download Resume
                                                                                                                                                                      </a>
                                                                                                                                                                            </div>
                                                                                                                                                                                  <h3>Skills:</h3>
                                                                                                                                                                                        <ul className="skills-list">
                                                                                                                                                                                                <li>HTML5</li>
                                                                                                                                                                                                        <li>CSS3</li>
                                                                                                                                                                                                                <li>JavaScript (ES6+)</li>
                                                                                                                                                                                                                        <li>React</li>
                                                                                                                                                                                                                              </ul>
                                                                                                                                                                                                                                  </section>
                                                                                                                                                                                                                                    );
                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                    export default About;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR190)