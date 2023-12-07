package objectclass;

public class Finalizeobject2 {
	int x = 10;
	public static void main(String[] args) {
		System.out.println("main starts");
		Finalizeobject2 f1 = new Finalizeobject2();
		System.out.println(f1.x);
		f1 = null;
		System.gc();
		System.out.println("main ends");
		}
	protected void finalize() throws Throwable
	{
		System.out.println("object destroyed successfully");
	}
	
	
}
