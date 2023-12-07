package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDublicates {
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		
		List<Integer> uniqueList = new ArrayList<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(1);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(1);
		myList.add(5);

		for (Integer items : myList) {
			if (!uniqueList.contains(items)) {
				uniqueList.add(items);
			}
		}

		System.out.println(uniqueList);

	}
}
