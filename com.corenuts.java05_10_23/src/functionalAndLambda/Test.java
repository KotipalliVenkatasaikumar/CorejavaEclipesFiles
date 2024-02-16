package functionalAndLambda;

public class Test implements Demo {

	@Override
	public void add(int a, int b) {

	}

	public static void main(String[] args) {

		Demo d = (a, b) -> System.out.println(a + b);
		d.add(10, 20);
		
		Demo d1 = (a, b) -> System.out.println(a - b + 20);
		d1.add(80, 20);
		
		Demo d2 = (a, b) -> {
			int c = a / b;
			System.out.println(c);
		};
		
		d2.add(20, 10);
		Demo.m1();
		Test test =new Test();
		test.m2();
		}
}
