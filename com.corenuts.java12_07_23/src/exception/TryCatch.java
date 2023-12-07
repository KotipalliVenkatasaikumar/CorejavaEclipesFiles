package exception;

public class TryCatch {
	public static void main(String[] args) {
		TryCatch e = new TryCatch();
		e.division(10, 0);
	}

	public void division(int a, int b) {

		try {

			try {
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException | NullPointerException n) {
				System.out.println("cant divide by zero");
				System.out.println(n.getMessage());
			}

			String s = null;
			System.out.println(s.length());
		}

		catch (NullPointerException e) {
			System.out.println("dosent enter null value");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("normal flow of program");
		}

	}
}
