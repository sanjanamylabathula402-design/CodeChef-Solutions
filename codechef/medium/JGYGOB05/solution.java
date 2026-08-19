class Laptop {
    void laptopInfo() {
        System.out.println("This is a general laptop");
    }
}

class GamingLaptop extends Laptop {
    void gamingFeatures() {
        System.out.println("Gaming Laptop has high-end graphics");
    }
}

class BusinessLaptop extends Laptop {
    void businessFeatures() {
        System.out.println("Business Laptop has long battery life");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an object of GamingLaptop
        GamingLaptop gaming = new GamingLaptop();
        gaming.laptopInfo();
        gaming.gamingFeatures();

        // Create an object of BusinessLaptop
        BusinessLaptop business = new BusinessLaptop();
        business.laptopInfo();
        business.businessFeatures();
    }
}
