package Interface;

public class MainDemo implements Demo,Demo1{

	@Override
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}

	@Override
	public int sub(int a, int b) {
		int c=a-b;
		return c;
	}
	@Override
	public int multification(int a, int b) {
		int c= a*b;
		return c;
	}

	@Override
	public float division(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		MainDemo m=new MainDemo();
		int add=m.add(15, 50);
		int sub =m.sub(20, 10);
		int multi=m.multification(5,20);
		float division =m.division(50, 5);
		System.out.println("adition =" +add);
		System.out.println("sub =" +sub);
		System.out.println("multification =" + multi);
		System.out.println("division ="+division);
		System.out.println("final variable ="+Demo.a);
		 
		 System.out.println("final variable ="+Demo1.b);
		 
		System.out.println("static final variable= "+Demo.add1(55, 55));
			}

	
}
