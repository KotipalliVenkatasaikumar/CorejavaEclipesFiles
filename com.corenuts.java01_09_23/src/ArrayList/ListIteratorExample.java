package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("balu");
		list.add("sai");
		list.add("ramu");
		list.add("durga");
		list.add("vasu");
//		System.out.println(list);
		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			int nextIndex = itr.nextIndex();
			String name = itr.next();
			System.out.println("name: " + name + ", nextIndex: " + nextIndex);

		}

		System.out.println("********Previous***********  ");

		while (itr.hasPrevious()) {
			int previousIndex = itr.previousIndex();
			String name = itr.previous();
			System.out.println("name: " + name + ", Previous Index: " + previousIndex);
		}
//		System.out.println(itr.previousIndex());

	}

}
