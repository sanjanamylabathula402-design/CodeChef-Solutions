                                                            console.log(breadResult);

                                                              const fillingResult = await addFilling();
                                                                console.log(fillingResult);

                                                                  const wrapResult = await wrapSandwich();
                                                                    console.log(wrapResult);

                                                                      return "Sandwich is ready to eat!";
                                                                      }

                                                                      prepareSandwich().then(result => console.log(result));