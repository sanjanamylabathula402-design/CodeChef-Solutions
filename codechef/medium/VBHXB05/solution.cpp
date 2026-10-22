// greeting.js
const hour = Number(
  new Date().toLocaleString("en-US", {
      timeZone: "Asia/Kolkata",
          hour: "numeric",
              hour12: false,
                })
                );
                console.log(hour);

                if (hour >= 12 && hour < 18) {
                  console.log("Good Afternoon!");
                  } else if (hour >= 18) {
                    console.log("Good Evening!");
                    } else {
                      console.log("Good Morning!");
                      }