package mapInterafce;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Sample {
	public static void main(String[] args) {
		Map <String,Integer>map = new TreeMap<>();
		map.put("sai", 121);
		map.put("kvs", 120);
		map.put("gopi", 121);
		map.put("kkr", 126);
		map.put("vasu", 121);

		Set s = map.keySet();
		

//		System.out.println(map.get("kvs"));

		int sum = 0;
		int sum1=0; 

		for (Object i : s) {

			System.out.println(i + " = " + map.get(i));
			Integer values = (Integer) map.get(i);
			sum += values;
		}
		System.out.println("sum of :" + sum);

	}
}
