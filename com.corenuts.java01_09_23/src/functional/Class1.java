package functional;

public class Class1 implements Demo {

	@Override
	public int add(int a, int b) {

		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		System.out.println(class1.multi(10, 30));
	}
}
