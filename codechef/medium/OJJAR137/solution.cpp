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
