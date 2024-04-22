package Abstraction;

//Code by Durgesh Malviya

// Process abstraction
interface Printer {
    void print(String document);
}

class SimplePrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}

public class ProcessAb {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.print("Hello.pdf");
    }
}
// we have a Printer interface with a method print().
//The SimplePrinter class implements this interface and provides an implementation for the print() method.
//By using the Printer interface, we abstract the printing process
//allowing different implementations of printers to be used interchangeably without affecting the client code.