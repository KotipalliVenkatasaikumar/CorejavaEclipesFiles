package functionalAndLambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class IsprimeOrNonPrime {
	public static void main(String[] args) {
		Consumer<Integer> con = (a) -> {
//			int count = 0;
			boolean b=true;
			for (int i = 2; i < a/2; i++) {
				if (a % i == 0) {
//					count++;
					b=false;
					break;
				}

			}
			if(b) {
				System.err.println("prime");
			}
			else {
				System.err.println("non prime");
			}
//			System.err.println(count);
//			if (count == 2) {
//				System.out.println("prime");
//			} else {
//				System.out.println("non prime");
//			}

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
