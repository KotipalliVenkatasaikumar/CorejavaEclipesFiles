package exceptionhandling;

public class ExceptionHandling {
	public static void m1() throws InterruptedException{
		Thread.sleep(2000);
			}
	public static void m2() throws InterruptedException
	{
		m1();
	}
	public static void m3() throws InterruptedException{
		m2();
	}
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			m3();
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception handling");
		}
		System.out.println("bye");
	}
	

}
