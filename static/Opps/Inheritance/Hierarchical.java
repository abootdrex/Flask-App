//Code by Durgesh Malviya

// Parent class
class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

// Child class 1 
class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking.");
    }
}

// Child class 2 
class Truck extends Vehicle {
    void load() {
        System.out.println("Truck is loading cargo.");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car myCar = new Car();               
        myCar.drive(); 
        myCar.honk();         
 
        Truck myTruck = new Truck();     
        myTruck.drive(); 
        myTruck.load(); 
    }
}
