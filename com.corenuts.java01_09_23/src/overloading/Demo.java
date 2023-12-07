package overloading;

public class Demo {
	static {
		System.out.println("static");
	}
	{
		System.out.println("block");
	}

	public void m1() {
		System.out.println("a");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
	}

}
