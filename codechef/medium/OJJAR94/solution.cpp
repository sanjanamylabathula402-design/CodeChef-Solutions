  return <input value={value} onChange={onChange} />;
  }

  // Parent Component: Holds the shared state
  function App() {
    const [sharedText, setSharedText] = useState('');

      const handleTextChange = (event) => {
          setSharedText(event.target.value);
            };

              return (
                  <div>
                        <h2>Type in either box:</h2>
                              <TextInput value={sharedText} onChange={handleTextChange} />
                                    <br />
                                          <TextInput value={sharedText} onChange={handleTextChange} />
                                                <p>Current Shared Text: {sharedText}</p>