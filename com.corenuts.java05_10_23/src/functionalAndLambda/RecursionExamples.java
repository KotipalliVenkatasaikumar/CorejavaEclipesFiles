package functionalAndLambda;

public class RecursionExamples {
	static void m1() {
		System.out.println("sai");
		m1();
	}

	static int count = 0;

	static void p() {
		count++;
		if (count <= 5) {
			System.out.println("hello " + count);
			p();
		}
	}

	public static void main(String[] args) {
		m1();
		p();

	}

}
