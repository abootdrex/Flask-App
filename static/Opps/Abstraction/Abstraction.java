//Code by Durgesh Malviya

package Abstraction;

//Abstraction 

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle....");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle....");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();
    }
}



//basic class called Shape. It has a method called draw()
//but it doesn't say how to draw. Then, we have created subclasses Circle and Rectangle
//which must provide their own way to draw. 
//This way, you keep the common behavior in Shape without getting into specifics.
