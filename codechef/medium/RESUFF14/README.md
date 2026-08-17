# RESUFF14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Grade Calculator with Honors

A hotel reservation system checks if a  **guest has a valid booking**  and assigns a room based on their selection. Complete the program by filling in the missing parts to ensure the correct functionality.

 **Input:** 
Take input for bookingStatus of type boolean and roomType of type String.

### Sample 1:
Input
Output

```
true
Luxury
```

```
Welcome to your Luxury Suite!  
Reservation check completed.

```

### Sample 2:
Input
Output

```
true
Standard
```

```
Welcome to your Standard Room!
Reservation check completed.
```

### Sample 3:
Input
Output

```
false
Luxury
```

```
Booking not found. Please check your details.
Reservation check completed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:03:08.808Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        boolean bookingStatus = sc.nextBoolean();
        String roomType = sc.next();

        // Outer if condition checks if the booking is valid
        if (bookingStatus == true) {
            // Nested if condition checks the type of room
            if (roomType.equals("Luxury")) {
                System.out.println("Welcome to your Luxury Suite!");
            } else {
                System.out.println("Welcome to your Standard Room!");
            }
        } else {
            System.out.println("Booking not found. Please check your details.");
        }

        // Indicating that the reservation check is completed
        System.out.println("Reservation check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF14)