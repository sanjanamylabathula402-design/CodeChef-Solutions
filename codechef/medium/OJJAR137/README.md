# OJJAR137

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Build Your Own Mini Netflix Navigator

Imagine you are building a mini version of Netflix called FunFlix. But here’s the catch: instead of showing everything on one page, you want users to browse different pages smoothly without refreshing the browser.\

 **Your task is to set up browser routing so users can move around the app like this:** 

- Home component should be rendered when / endpoint is hit.
- Movies component should be rendered when /movies endpoint is hit.
- Series component should be rendered when /series endpoint is hit.
- About component should be rendered when /about endpoint is hit.
- Also complete internal css in Home.jsx(Centering a div using flexbox)

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T14:36:51.482Z  

```cpp
  return (
      <div style={{ display: 'flex', flexDirection: 'column', minHeight: '100vh', width: '100%' }}>
            <nav style={{ display: 'flex', justifyContent: 'center', gap: '20px', padding: '20px' }}>
                    <NavLink to="/">Home</NavLink>
                            <NavLink to="/movies">Movies</NavLink>
                                    <NavLink to="/series">Series</NavLink>
                                            <NavLink to="/about">About</NavLink>
                                                  </nav>

                                                        <main style={{ display: 'flex', flex: 1, justifyContent: 'center', alignItems: 'center', width: '100%' }}>
                                                                <Routes>
                                                                          <Route path="/" element={<Home />} />
                                                                                    <Route path="/movies" element={<Movies />} />
                                                                                              <Route path="/series" element={<Series />} />
                                                                                                        <Route path="/about" element={<About />} />
                                                                                                                </Routes>
                                                                                                                      </main>
                                                                                                                          </div>
                                                                                                                            );

function App() {
import Movies from './pages/Movies';
import Series from './pages/Series';
import About from './pages/About';
import Home from './pages/Home';
import { Routes, Route, NavLink } from 'react-router-dom';
                                                                                                                            }

```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR137)