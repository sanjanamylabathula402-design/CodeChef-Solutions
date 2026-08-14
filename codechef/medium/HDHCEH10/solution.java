// create your Car class here
class Car{
    String brand ;
    int model;
}
class Codechef{
    public static void main(String[] args) {
        // create a new_car object for the Car class  
       Car new_car =new Car();

        new_car.brand = "Toyota";
        new_car.model = 2021;
    
        System.out.println("The car is from "+ new_car.brand + " brand " + "and its model is "+ new_car.model);
    }

}