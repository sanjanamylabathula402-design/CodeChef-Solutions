// update the function
export function App() { 
  const username = "Alex";  
  const currentYear = new Date().getFullYear();  
  
  return (
    <div>

welcome,{username}! Happy {currentYear}!

    </div>
  );
}

export default App;
