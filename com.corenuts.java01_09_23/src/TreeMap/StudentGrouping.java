package TreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentGrouping {
	public static void main(String[] args) {

		List<StudentLoction> studlist = new ArrayList<StudentLoction>();

		studlist.add(new StudentLoction("1726", "John", "New York"));
		studlist.add(new StudentLoction("4321", "Max", "California"));
		studlist.add(new StudentLoction("2234", "Andrew", "Los Angeles"));
		studlist.add(new StudentLoction("5223", "Michael", "New York"));
		studlist.add(new StudentLoction("7765", "Sam", "California"));
		studlist.add(new StudentLoction("3442", "Mark", "New York"));

		Map<String, List<StudentLoction>> map = location(studlist);
		
		Map<String, Integer> map1 = count(studlist);

//		System.out.println(map);

	}

	public static Map<String, List<StudentLoction>> location(List<StudentLoction> stuojects) {

		Map<String, List<StudentLoction>> map = new HashMap<String, List<StudentLoction>>();

		for (StudentLoction student : stuojects) {
			String key = student.getStuLoction();
			if (map.containsKey(key)) {
				List<StudentLoction> list = map.get(key);
				list.add(student);
				map.put(key, list);

			} else {
				List<StudentLoction> list = new ArrayList<StudentLoction>();
				list.add(student);
				map.put(key, list);

			}
		}
		for (Map.Entry<String, List<StudentLoction>> ele : map.entrySet()) {
			System.out.println(ele.getKey());
			List<StudentLoction> list = ele.getValue();

			for (StudentLoction studentLoction : list) {
				System.out.println(studentLoction);
			}

		}
		return map;

	}

	public static Map<String, Integer> count(List<StudentLoction> stuojects) {

		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Integer value = 0;
		for (StudentLoction student : stuojects) {
			String key = student.getStuLoction();
			if (map1.containsKey(key)) {
				value = map1.get(key);
				value = value + 1;
				map1.put(key, value);

			} else {
				map1.put(key, 1);
			}
		}
		System.out.println(map1);
		return map1;

	}

}
