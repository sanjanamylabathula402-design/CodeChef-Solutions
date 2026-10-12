    fetchUserData()
      .then(userData => {
  
  // Promise .then/.catch version
  function getUserDataPromise() {
    }
  }
      console.log("Async/Await → User data:", userData);
    } catch (error) {
      console.error("Async/Await → Error fetching user data:", error);
  async function getUserDataAsyncAwait() {
    try {
      const userData = await fetchUserData();
  
  // Async/Await version
      }, 50);
    });
  }
        } else {
          reject("Failed to fetch user data.");
        }
        if (success) {
          resolve({ id: 123, name: "John Doe" });
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        const success = Math.random() > 0.5;
// Simulated API function
async function fetchUserData() {