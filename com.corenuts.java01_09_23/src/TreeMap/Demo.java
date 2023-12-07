package TreeMap;

public class Demo {
	public static int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public float div(int a, int b) {
		float c = a / b;
		System.out.println(c);
		return c;
	}

	public float percentage(int sum, int totalarks) {
		float c = (sum * 100) / totalarks;
		System.out.println(c);
		return c;

	}

	public String result(float Percentage) {

		if (Percentage >= 70) {
			return "distention";
		} else if (Percentage >= 60) {
			return "First Class";
		} else if (Percentage >= 50) {
			return "Second Class";
		} else if (Percentage >= 45) {
			return "Third Class";
		} else {
			return "fail";
		}

	}

	public static void main(String[] args) {
		add(10, 15);
		Demo d = new Demo();
		d.div(10, 5);
		float f = d.percentage(455, 600);
		String res = d.result(f);
		System.out.println(res);
	}

}
