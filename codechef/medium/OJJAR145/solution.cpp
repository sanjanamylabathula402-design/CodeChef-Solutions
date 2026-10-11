import ProductDetails from './pages/ProductDetails.jsx'

export default function App() {
    const location = useLocation()
    const [slowNetwork, setSlowNetwork] = useState(false)

    return (
        <div className="app">
            <header>
                <h1>React Example (No Lazy Loading)</h1>
                <nav>
                    <Link to="/">Home</Link>
                    <Link to="/about">About</Link>
import About from './pages/About.jsx'
import Dashboard from './pages/Dashboard.jsx'

// ✅ Normal imports (all loaded upfront, no lazy loading)
import Home from './pages/Home.jsx'