package Interface;

public interface Demo {
	public static final int a = 20;

	public abstract int add(int a, int b);

	public abstract int sub(int a, int b);

	public static int add1(int a, int b) {
		int c = a + b;
		return c;
	}

}
