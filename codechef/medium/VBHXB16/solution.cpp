    });
  }
console.log("Ice cream making in progress...");

getIngredients()
  .then((result) => {
      console.log(result);
          return mixIngredients(result);
            })
              .then((result) => {
                  console.log(result);
                      return freezeMixture(result);
                        })
                          .then((result) => {
                              console.log(result);
                                  return addToppings(result);
                                    })
                                      .then((result) => {
                                          console.log(result);
                                            })
                                              .catch((error) => {
                                                  console.error("Error making ice cream:", error);
                                                    });
// Your code starts here: Create the Promise chain that calls these functions in order.