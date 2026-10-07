        const handleMove = (e) => {
              setPosition({ x: e.clientX, y: e.clientY });
                  };

                      window.addEventListener("mousemove", handleMove);

                          // Cleanup function to remove event listener on unmount
                              return () => {
                                    window.removeEventListener("mousemove", handleMove);
                                        };
                                          }, []);

                                            return <div>Cursor at ({position.x}, {position.y})</div>;
                                            }

                                            export default function App() {
                                              return (
                                                  <div>