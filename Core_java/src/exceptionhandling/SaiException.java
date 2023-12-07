package exceptionhandling;

public class SaiException extends Exception {
	
public static void m1() throws SaiException{
	throw new SaiException();
	}
public static void m2()  throws SaiException
{
	m1();
	}
public static void main(String[] args) {
	System.out.println("Hello");
	try
	{
		m2();
		}
	catch(SaiException s) 
	{
		System.out.println("Exception handling");
	}
	System.out.println("Bye ");
}
}
