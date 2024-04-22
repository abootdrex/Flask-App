//Code by Durgesh Malviya

// Data abstraction

package Abstraction;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class DataAb {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
    }
}
// Vehicle is an abstract class with an abstract method start()
//The Car class extends the Vehicle class and provides an implementation for the start() method.
//Here the Vehicle class abstracts the concept of starting a vehicle without providing 
//implementation details.