package overloading;

public class MethodOverloadig {
	

		public void display() {

			System.out.println("non per method");
		}

		public int display(int a, int b, int c) {
			int d = a + b + c;
			return d;
		}

		public int display(int  a, int b) {
			int d = a*b;
			return d;
		}

		public double display(double a, double b, double c) {
			double d= a + b + c;
			return d; 
		}

		public static void main(String[] args) {
			MethodOverloadig m = new MethodOverloadig();
			m.display();
			System.out.println(m.display(10, 10, 10));
			System.out.println(m.display(5, 5, 5));
			System.out.println(m.display(15, 15));
			System.out.println(m.display(2.0,23.2,50.3 ));

		}
	}


