package functionalAndLambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class IsprimeOrNonPrime {
	public static void main(String[] args) {
		Consumer<Integer> con = (a) -> {
			int count = 0;
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println("prime");
			} else {
				System.out.println("non prime");
			}

		};
		con.accept(5);

		Predicate<Integer> pre = (a) -> {
			if (a % 2 == 0) {
				return true;
			}
			return false;

		};
		System.out.println(pre.test(20));

	}

}
