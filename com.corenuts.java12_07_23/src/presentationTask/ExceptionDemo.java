package presentationTask;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int a=10/0;
			String s=null;
			System.out.println(s.length());
		}
		
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		
		catch(Exception e) {
			System.out.println("excception handled");
		}
		
		System.out.println(10+20);

	}

}
