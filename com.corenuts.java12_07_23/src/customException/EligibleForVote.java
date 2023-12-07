package customException;

public class EligibleForVote {
	int age =20;

	EligibleForVote(int age) {
		this.age = age;
	}

	public void eligibleForVote() throws InvalidAgeException {
		if (age >= 18) {
			System.out.println("eligible for vote");
		} else {
			throw new InvalidAgeException("not eligible for vote");
		}

	}
}
