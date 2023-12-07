package SetExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStudentMarks {
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setStuId(1);
		std1.setStuName("sampath");
		std1.setStuClass("Bcom");
		std1.setSub1(75);
		std1.setSub2(85);
		std1.setSub3(56);
		std1.setSub4(60);
		Student std2 = new Student(2, "sai", "Bsc", 80, 75, 66, 63);
		Student std3 = new Student(3, "vasu", "Bsc", 56, 75, 60, 65);
		Student std4 = new Student(4, "raf", "ba", 80, 75, 66, 63);
		Student std5 = new Student(5, "kumar", "mpc", 50, 75, 46, 60);
		Student std6 = new Student(2, "sai", "Bsc", 80, 75, 66, 63);

		Set<Student> set = new TreeSet<>();
		set.add(std1);
		set.add(std2);
		set.add(std3);
		set.add(std4);
		set.add(std5);
		set.add(std6);
		//set.add(std6);
		
	
		

		for (Student itr : set) {
			// System.out.println(itr);
			float sum = itr.getSub1() + itr.getSub2() + itr.getSub3() + itr.getSub4();

			float percentage = (sum * 100) / 400;
//		System.out.println("Student  " + itr.getStuName() +" got Total marks:" + sum + " With percentage: " + percentage);
			itr.setTotalMarks(sum);
			itr.setPercentage(percentage);
			System.out.println(itr);
		}

	}

}
