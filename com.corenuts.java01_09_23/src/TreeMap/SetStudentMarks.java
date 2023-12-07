package TreeMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import ArrayList.StudentTreeMap;
import mapInterafce.StudentMarks;

public class SetStudentMarks {
	public static void main(String[] args) {

		StudentTreeMap std1 = new StudentTreeMap();
		std1.setStuId(1);
		std1.setStuName("sampath");
		std1.setStuClass("Bcom");
		std1.setSub1(75);
		std1.setSub2(85);
		std1.setSub3(56);
		std1.setSub4(60);
		StudentTreeMap std2 = new StudentTreeMap(2, "sai", "Bsc", 80, 75, 66, 63);
		StudentTreeMap std3 = new StudentTreeMap(3, "vasu", "Bsc", 56, 75, 60, 65);
		StudentTreeMap std4 = new StudentTreeMap(4, "raf", "ba", 80, 75, 66, 63);
		StudentTreeMap std5 = new StudentTreeMap(5, "kumar", "mpc", 50, 75, 46, 60);

		List<StudentTreeMap> list = new ArrayList<>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		list.add(std5);

//		Map<Integer, Float> map = new TreeMap<Integer, Float>();
//		for (StudentTreeMap itr : list) {
//			// System.out.println(itr);
//			float sum = itr.getSub1() + itr.getSub2() + itr.getSub3() + itr.getSub4();
//
//			float percentage = (sum * 100) / 400;
////	System.out.println("Student  " + itr.getStuName() +" got Total marks:" + sum + " With percentage: " + percentage);
//			itr.setTotalMarks(sum);
//			itr.setPercentage(percentage);
//			map.put(itr.getStuId(), itr.getPercentage());
////			System.out.println(itr); 
//			
//		}
//		System.out.println(map);
//		

//		for (StudentTreeMap stu : list) {
//			map.put(stu.getStuId(), stu.getPercentage());
//
//		}
//		System.out.println(map);

		Map<Integer, Float> map = processPercentages(list);
		System.out.println("processPercentages :" + map);
		Map<String, String> map1 = result(list);
		System.out.println("result :" + map1);
		Map<Integer, String> map3 = subject(list);
		System.out.println("subject :" + map3);

	}

	public static Map<Integer, Float> processPercentages(List<StudentTreeMap> list) {

		Map<Integer, Float> map = new TreeMap<>();
		for (StudentTreeMap student : list) {
			int sum = 0;

			// System.out.println(student);
			sum = student.getSub1() + student.getSub2() + student.getSub3() + student.getSub4();
			// System.out.println(sum);
			float percentage = (sum * 100) / 400;
			// System.out.println(percentage);
			student.setTotalMarks(sum);
			student.setPercentage(percentage);
			// System.out.println(student);
			map.put(student.getStuId(), student.getPercentage());
		}
		return map;
	}

	public static Map<String, String> result(List<StudentTreeMap> list) {
		Map<String, String> map1 = new TreeMap<>();
		for (StudentTreeMap student : list) {
			int sum = 0;

			// System.out.println(student);
			sum = student.getSub1() + student.getSub2() + student.getSub3() + student.getSub4();
			// System.out.println(sum);
			float percentage = (sum * 100) / 400;
			// System.out.println(percentage);
			student.setTotalMarks(sum);
			student.setPercentage(percentage);
			
			if (percentage >= 70) {
				map1.put(student.getStuName(), "distention");
			} else if (percentage >= 60) {
				map1.put(student.getStuName(), "first class");
			} else if (percentage >= 50) {
				map1.put(student.getStuName(), "second class");
			} else if (percentage >= 40) {
				map1.put(student.getStuName(), "PASS");
			} else {
				map1.put(student.getStuName(), "fail");
			}

		}
		return map1;
	}

	public static Map<Integer, String> subject(List<StudentTreeMap> list) {
		Map<Integer, String> map3 = new TreeMap<>();
		for (StudentTreeMap studentTreeMap : list) {
			map3.put(studentTreeMap.getStuId(), studentTreeMap.getStuClass());

		}

		return map3;
	}

}
