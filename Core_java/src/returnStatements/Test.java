package returnStatements;


//Access modifiers
public  class Test {
		
	public static void m1()
	{
		final int a =10;
		
		
		System.out.println("Print M1");
	}
	
	public void m2()
	{
		System.out.println("Print M2");
	}
	
	private static void m3()
	{
		System.out.println("Print M3");
	}
	private void m4()
	{
		System.out.println("print m4");
	}
	protected static void m5()
	{
		System.out.println("print m5");
	}
	protected void m6()
	{
		System.out.println("print m6");
	}

	final public  void m7()
	{
		System.out.println("Print M7");
	}
	
	
	
	public static void main(String[] args) {
		
		
		m1();
		Test t1=new Test();
		t1.m2();
		m3();
		t1.m4();
		m5();
		t1.m6();
		t1.m7();
		
	}
}
