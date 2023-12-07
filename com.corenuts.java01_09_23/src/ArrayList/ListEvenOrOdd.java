package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEvenOrOdd {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
		System.out.println(list);

		Iterator<Integer> itr = list.iterator();
		int sum1 = 0;
		int sum2 = 0;
		while (itr.hasNext()) {
			Integer integer = itr.next();
			if (integer % 2 == 0) {
				System.out.println("even numbers :" + integer);
				sum1 = sum1 + integer;

			}

			else {
				System.out.println("odd numbers :" + integer);
				sum2 = sum2 + integer;
			}
		}
		System.out.println("even :" + sum1);
		System.out.println("odd :" + sum2);
	}

}
