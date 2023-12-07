package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SetMarksOfStudent {
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
 
		for (StudentTreeMap itr : list) {
			//System.out.println(itr);
		float sum=	itr.getSub1()+ itr.getSub2() + itr.getSub3()+itr.getSub4();
		
		float percentage = (sum*100) / 400;
		System.out.println("Student  " + itr.getStuName() +" got Total marks:" + sum + " With percentage: " + percentage);
		itr.setTotalMarks(sum);
		itr.setPercentage(percentage);
//		System.out.println(itr);
		}
		

	}

}
