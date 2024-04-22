package Polymorphism.Method;

public class MethodOverLoading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }
    
    // Method to concatenate three strings
    public String add(String a, String b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverLoading calc = new MethodOverLoading();

        // Different method calls based on the number and type of arguments
        System.out.println("Sum of 5 and 7: " + calc.add(5, 7));
        System.out.println("Sum of 3, 5, and 7: " + calc.add(3, 5, 7));
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
        System.out.println("Concatenation of 'Hello' and ' World': " + calc.add("Hello", " World"));
        System.out.println("Concatenation of 'Good', 'Morning', and '!' : " + calc.add("Good", "Morning", "!"));
    }
}
