package exception;

public class EligibleForVote {
	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("not eligible for vote");
		} else {
			System.out.println("eligible for vote");
		}
	}
	public static void main(String[] args) {
		try {
		validate(10);
		}
		catch ( ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("hello world");
		
		}
	}


