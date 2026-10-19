
    return (
        <button
              onClick={() => {
                      // TODO: Step 5 - Set this tab as active when clicked
                              setActiveTab(label);
                                    }}
                                          style={{
                                                  padding: '10px 20px',
                                                          cursor: 'pointer',
                                                                  backgroundColor: isActive ? '#333' : '#eee',
                                                                          color: isActive ? '#fff' : '#000',
                                                                                  border: 'none',
                                                                                          borderRadius: '5px',
                                                                                                  fontWeight: isActive ? 'bold' : 'normal',
                                                                                                        }}
                                                                                                            >
                                                                                                                  {label}
                                                                                                                      </button>
                                                                                                                        );
                                                                                                                        };

                                                                                                                        export default Tab;