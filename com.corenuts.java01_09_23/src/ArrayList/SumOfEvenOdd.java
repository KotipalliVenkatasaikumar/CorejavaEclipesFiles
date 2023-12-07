package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(12);
		list.add(14);
		list.add(13);
		list.add(15);
		Collections.sort(list);

		System.out.println(list);
		int evenSum = 0;
		int oddSum = 0;
		for (Integer item : list) {
			if (item % 2 == 0) {
				System.out.println("even :" + item);
				evenSum = evenSum + item;
			} else {
				System.out.println("odd :" + item);
				oddSum = oddSum + item;

			}
		}
		System.out.println("sum of even:" + evenSum);
		System.out.println("sum of odd:" + oddSum);

		System.out.println("maximum number");
		System.out.println(Collections.max(list));
		System.out.println("minimum number");
		System.out.println(Collections.min(list));

	}

}
