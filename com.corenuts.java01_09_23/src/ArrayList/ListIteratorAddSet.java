package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorAddSet {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("balu");
		list.add("sai");
		list.add("ramu");
		list.add("durga");
		list.add("vasu");

		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.equals("ramu")) {
				itr.remove();
			}
			if (s.equals("durga")) {
				itr.add("nani");
			}
			if (s.equals("sai")) {
				itr.set("kumar");
			}
		}
		System.out.println(list);
		
		System.out.println("nextIndex");
		while (itr.hasNext()) {
			int index = itr.nextIndex();
			String s = itr.next();
			System.out.println("name : " + s + " index :" + index);
		}

		System.out.println("previousIndex");
		
		
		while (itr.hasPrevious()) {
			int index = itr.previousIndex();
			String s = itr.previous();
			System.out.println("name :" + s + " index :" + index);

		}

	}

}
