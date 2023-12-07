package mapInterafce;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		Map map = new LinkedHashMap<>();
		map.put("sai", 121);
		map.put("kvs", 120);
		map.put("gopi", 121);
		map.put("kkr", 126);
		map.put("kamal", 121);

		map.put("sai", 99);
		System.out.println(map);

		System.out.println("********keyset*****************");

		Set s = map.keySet();
		System.out.println(s);
		System.out.println("***************values*********");
		Collection c = map.values();
		System.out.println(c);

		System.out.println("*****************EntrySet******************");
		Set s1 = map.entrySet();
		System.out.println(s1);
         
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());
			if (m1.getKey().equals("gopi")) {
				m1.setValue(5000);
			} 
			System.out.println(map);
				}
		System.out.println(map.isEmpty());
		System.out.println(map.size());
	}
	

}
