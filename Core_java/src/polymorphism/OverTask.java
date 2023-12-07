package polymorphism;

public class OverTask {
	public void m1() {
		System.out.println("non par mrthod");
	}
	public void m1(String i,int a, String x) {
		System.out.println(i+a+x);
		System.out.println(" sai, 10, kvs ");
							}
	public void m1(int a,double b,boolean c)
	{
		System.out.println("500,15.7,false");
		}
	public void m1(String n, int a, int b) {
		System.out.println("hema, 5, 2"); 
	}

		public static void main(String[]args)	{
			OverTask o = new OverTask();
		o.m1();
		o.m1("sai",10,"kvs");
		o.m1(500,15.7, false);
		o.m1("hema",5,2);
		
			
			
			
		}
		
	
		
	
}
