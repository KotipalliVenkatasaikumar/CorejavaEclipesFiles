package exception;

public class AccesModifiers {
	static int x;
	static int y;

	void add(int a, int b) {
		x = a + b;
		y = x + b;
	}

	public static void main(String args[]) {
		AccesModifiers obj1 = new AccesModifiers();
		AccesModifiers obj2 = new AccesModifiers();
		int a = 2;
		obj1.add(a, a + 1);
		obj2.add(5, a);
		System.out.println(obj1.x + " " + obj2.y);
	}

}
