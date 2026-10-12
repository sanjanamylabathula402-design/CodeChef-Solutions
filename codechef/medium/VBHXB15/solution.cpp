      setTimeout(() => {
        resolve("Coffee with milk: " + brewedCoffee);
      }, 500);
    });
  }
  
  grindBeans()
    .then((groundBeans) => {
      console.log("1. Beans ground:", groundBeans);
      return brewCoffee(groundBeans);
    })
    .then((brewedCoffee) => {
      console.log("2. Coffee brewed:", brewedCoffee);
      return addMilk(brewedCoffee);
    })
    .then((coffeeWithMilk) => {
      console.log("3. Final result:", coffeeWithMilk);
    })
    .catch((error) => {
      console.error("Error:", error);
    });
  
  console.log("Coffee brewing in progress...");