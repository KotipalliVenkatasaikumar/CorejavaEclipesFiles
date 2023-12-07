package customException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VotingMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter age");
		try {
			int age = scan.nextInt();
			EligibleForVote v = new EligibleForVote(age);
			try {
				v.eligibleForVote();
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}

	}

}
