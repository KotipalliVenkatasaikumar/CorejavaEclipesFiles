package typeConversion;

public class Car extends Vehicle {
	final int a=20;
	public static void main(String[] args) {
//		short x = 10;
//		x = (short) (x * 5);
//		System.out.print(x);

//		int i;
//		for (i = 1; i < 6; i++) {
//			if (i > 3)
//				continue;
//		}
//		System.out.println(i);
		Car c=new Car();
		c.vehicle1();
		c.vehicle2();
		c.m1();
	
		System.out.println(c.a);
}
	
	
		public static void vehicle1()
		{
			System.out.println("sai");
		}
		
		public  void vehicle2() {
			
			System.out.println("class car");
			
		}
		 public void m2() {
	    	  System.out.println("ddfgj");
	      }
	}

