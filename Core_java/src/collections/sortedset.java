package collections;

import java.util.TreeSet;

public class sortedset {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(60);
		System.out.println(t.add(70));
		for( Object a:t) {
			System.out.println(a);
		}
	//	System.out.println(t);
		
		
	}
	}
