package exceptionhandling;

public class Example {
	public static void main(String[] args) {
		int a = 50;
		int b = 0;
		int c =10;
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Handled");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException handled");
				}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled ");
		}
		

		
	}

}
