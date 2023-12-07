package exceptionhandling;

import java.util.Scanner;

public class EligibiltyForVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		try {
			if (age < 18) {
				throw new Exception("condidate are not eligible to vote.");
			} else {
				System.out.println("condidate are eligible to vote.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
