package functionalAndLambda;

import java.util.ArrayList;
import java.util.List;

public class ListLambda {
	public static void m1(int a) {
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
	}

	public static void main(String[] args) {
		m1(2);
		List<String> list = new ArrayList<>();
		list.add("sai");
		list.add("kumar");
		list.add("pradeep");
		list.add("vasu");

		list.forEach((n) -> System.out.println(n));

	}

}
