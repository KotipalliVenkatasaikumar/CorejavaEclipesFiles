package mapInterafce;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample  {
	public static void main(String[] args) {
		Map map = new TreeMap<>();
		map.put("sai", 121);
		map.put("kvs", 120);
		map.put("gopi", 121);
		map.put("kkr", 126);
		map.put("vasu", 121);

		map.put("sai", 99);
		System.out.println(map);

		System.out.println("********keyset*****************");

		Set s = map.keySet();
		for(Object  i: s) {
			System.out.println(i);
			
		}
		System.out.println(s);
		System.out.println("***************values*********");
		Collection c = map.values();
		System.out.println(c);

		System.out.println("*****************EntrySet******************");
		Set s1 = map.entrySet();
//		System.out.println(s1);

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


