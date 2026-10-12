import { Link } from 'react-router-dom';
import './Navbar.css';

const Navbar = () => {
  return (
      <nav className="navbar">
            <div className="navbar-brand">
                    <Link to="/">MERN Blog</Link>
                          </div>
                                <div className="navbar-links">
                                        <Link to="/login">Login</Link>
                                                <Link to="/register">Create Account</Link>
                                                      </div>
                                                          </nav>
                                                            );
                                                            };

                                                            export default Navbar;