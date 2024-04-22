//Code by Durgesh Malviya

package Polymorphism;

class Offer {
    public void render() {
      System.out.println("20% Discount on Axis Card");
    }
  }
  
  class Cred extends Offer {
  
    
    public void render() {
      System.out.println(" No Discount...");
    }
  }
  
  class Axis extends Offer {
  
    
    public void render() {
      System.out.println("10% Discount on Axis Card");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      
      
      Cred c1 = new Cred();
      c1.render();
  
      Axis a1 = new Axis();
      a1.render();
    }
  }