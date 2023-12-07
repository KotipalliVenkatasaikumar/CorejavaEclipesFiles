package collections;

import java.util.HashSet;

public class Hassetdemo {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(1);
		HashSet<Integer> h2 = new HashSet<>();
		h2.add(1);
		h2.add(2);
		h2.addAll(h);
		for (Integer integer : h2) {
			System.out.println(integer);			
		}
	


}
}
