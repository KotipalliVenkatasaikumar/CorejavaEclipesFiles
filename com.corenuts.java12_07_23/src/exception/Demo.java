package exception;

public class Demo {
	public static void main(String args[]) {
		try {
			int a[]= {1,2,3,4};
			System.out.println(a[7]);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("indidn");		}
		catch (Exception e) {
			System.out.println("Exception");		}
		finally {
			System.out.println("finally");
		}
	}

}
