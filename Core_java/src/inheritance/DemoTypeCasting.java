package inheritance;

class A {
	
	public void sleep() {
		System.out.println("sleep................");
	}
}

class B extends A {
	public void run() {
		System.out.println("run========================");
	}
}

public class DemoTypeCasting {
	
	public static void main(String[] args) {
		A a = new B(); //upcasting
		a.sleep();
		
//		B b = (B) new A(); //downcasting 
//		b.sleep();
//		b.run();
		
		B b = (B) a;
		b.run();
		
	}

}
