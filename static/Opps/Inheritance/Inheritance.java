//Code by Durgesh Malviya


class SuperClassA {

	public void foo(){
		System.out.println("Super Class");
	}
	
}

class SubClassB extends SuperClassA{
		
	public void bar(){
		System.out.println("Sub Class ");
	}
	
}

public class Inheritance {
	public static void main(String args[]){
		SubClassB a = new SubClassB();
		
		a.foo();
		a.bar();
	}
}