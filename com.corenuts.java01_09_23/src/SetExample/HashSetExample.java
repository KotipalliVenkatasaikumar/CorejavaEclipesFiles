package SetExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		Set set = new TreeSet<>();
		try {
		set.add(null);
		set.add(null);
		}catch (Exception e) {
			System.out.println("null is not posible");
		}
		set.add(11);
		set.add(123);
		set.add(11);
		set.add(55);
		set.add(20);
		set.add(25);
		set.add(26);
		set.add(27);
		System.out.println(set.add(27));
		set.add(28);
	//	set.add(null);

		for (Object i : set) {
			System.out.println(i);
		}

	}

}
