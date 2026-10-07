                                                                                              export default function App() {
                                                                                                const [show, setShow] = useState(true);

                                                                                                  return (
                                                                                                      <div>
                                                                                                            <button onClick={() => setShow((prev) => !prev)}>
                                                                                                                    Toggle Window Tracker
                                                                                                                          </button>
                                                                                                                                {show && <WindowTracker />}
                                                                                                                                    </div>
                                                                                                                                      );
                                                                                                                                      }