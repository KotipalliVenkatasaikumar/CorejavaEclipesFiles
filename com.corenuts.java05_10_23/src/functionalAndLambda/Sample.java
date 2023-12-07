package functionalAndLambda;

public class Sample {
	public static void m1(int num) {
		if (num <= 100) {
			System.out.println(num);
			m1(num + 1);
		}
	}

	public static void main(String[] args) {
		Sample.m1(1);
	}

}
