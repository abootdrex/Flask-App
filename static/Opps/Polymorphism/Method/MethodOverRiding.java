package Polymorphism.Method;

class MethodOverRiding {
    public void displayInfo() {
      System.out.println("Common English Language");
    }
  }
  
  class Java extends MethodOverRiding {
    @Override
    public void displayInfo() {
      System.out.println("Java Programming Language");
    }
  }
  
  class Main {
    public static void main(String[] args) {
  

      Java j1 = new Java();
      j1.displayInfo();
  
      MethodOverRiding l1 = new MethodOverRiding();
      l1.displayInfo();
    }
  }