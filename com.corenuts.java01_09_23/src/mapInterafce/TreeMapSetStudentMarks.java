package mapInterafce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapSetStudentMarks {
	public static void main(String[] args) {
		StudentMarks std1 = new StudentMarks();
		std1.setStuId(1);
		std1.setStuName("sampath");
	
		
		StudentMarks std2 = new StudentMarks(2, "sai");
		StudentMarks std3 = new StudentMarks(3, "vasu");
		StudentMarks std4 = new StudentMarks(4, "raf");
		StudentMarks std5 = new StudentMarks(5, "kumar");
		
		
		List<StudentMarks> list = new ArrayList<>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		list.add(std5);
		
		Map<Integer,String > map =new TreeMap(); 
		for(StudentMarks itr: list) {
			map.put(itr.getStuId(), itr.getStuName());
			
						}
		System.out.println(map);
		Set s=  map.entrySet();
		System.out.println(s);
		
		
		
		
		
 
//		for (TreeStudent itr : list) {
//			//System.out.println(itr);
//		float sum=	itr.getSub1()+ itr.getSub2() + itr.getSub3()+itr.getSub4();
//		
//		float percentage = (sum*100) / 400;
//	//	System.out.println("Student  " + itr.getStuName() +" got Total marks:" + sum + " With percentage: " + percentage);
//		itr.setTotalMarks(sum);
//		itr.setPercentage(percentage);
//		System.out.println(itr);
		}
	}


