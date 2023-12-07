package Interface;

public class MainTest implements Test3 {

	@Override
	public void m1(int a, int b) {
	int c=a+b;
	System.out.println(c);
		
	}
	public static void main(String[] args) {
		MainTest m =new MainTest();
		 m.m1(10,10);
	}
	

}
