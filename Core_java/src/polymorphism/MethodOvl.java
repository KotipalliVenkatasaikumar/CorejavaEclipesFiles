package polymorphism;

public class MethodOvl {

	public void display() {

		System.out.println("non per mrthod");
	}

	public int display(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	public int display(int a, int b) {
		return a * b;
	}

	public double display(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MethodOvl m = new MethodOvl();
		m.display();
		System.out.println(m.display(10, 10, 10));
		System.out.println(m.display(5, 5, 5));
		System.out.println(m.display(15, 15));
		System.out.println(m.display(2.0,23.2,50.3 ));

	}
}
