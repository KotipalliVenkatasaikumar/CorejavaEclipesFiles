package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinOfList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(-1);
		list.add(55);
		list.add(78);
		list.add(500);
//		System.out.println(Collections.max(list));
//		System.out.println(Collections.min(list));
//		Collections.sort(list);
//		System.out.println(list);
//		list.lastIndexOf(list);
//		System.out.println(list);

		int max = list.get(0);
		int min = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
			if (list.get(i) < min) {
				min = list.get(i);

			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
