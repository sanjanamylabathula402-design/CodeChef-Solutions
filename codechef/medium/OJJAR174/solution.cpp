
                                                                                                                                <p>
                                                                                                                                        Button trying to override type (should remain type="button"):
                                                                                                                                              </p>
                                                                                                                                                    <Button
                                                                                                                                                            className="btn-secondary"
                                                                                                                                                                    type="submit"
                                                                                                                                                                            onClick={() => alert("Secondary clicked!")}
                                                                                                                                                                                  >
                                                                                                                                                                                          Secondary (Still a Button)
                                                                                                                                                                                                </Button>

                                                                                                                                                                                                      <p>
                                                                                                                                                                                                              Disabled Button (should have "btn" class and be disabled):
                                                                                                                                                                                                                    </p>
                                                                                                                                                                                                                          <Button disabled>
                                                                                                                                                                                                                                  Disabled Button
                                                                                                                                                                                                                                        </Button>
                                                                                                                                                                                                                                            </div>
                                                                                                                                                                                                                                              );
                                                                                                                                                                                                                                              }

                                                                                                                                                                                                                                              export default App;