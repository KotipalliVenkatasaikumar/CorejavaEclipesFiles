package collections;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap m =new HashMap();
		
		m.put("sai",90);
		m.put("kvs",70);
		m.put("kumar",85);
		System.out.println(m);
		System.out.println(m.put("sai",80));
		System.out.println(m);
	}

}
