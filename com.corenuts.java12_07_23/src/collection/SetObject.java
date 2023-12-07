package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetObject {
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.setId(1);
		obj1.setName("sai");
		
		Student obj2 = new Student();
		obj2.setId(2);
		obj2.setName("gopi");
		
		Student obj3 = new Student();
		obj3.setId(3);
		obj3.setName("sampath");
		
		Student obj4 = new Student();
		obj4.setId(1);
		obj4.setName("karthik");
		
		
		Student obj5 = new Student();
		obj5.setId(2);
		obj5.setName("kvs");
	 
	
//
//		Set<Student> s = new HashSet<Student>();
//		s.add(obj1);
//		s.add(obj2);
//		s.add(obj3);
//		s.add(obj4);
//		s.add(obj5);
//		for (Student student : s) {
//			System.out.println(student.id + " " + student.name);
//		}
		
		Set<Integer> s1 =new HashSet<>();
		
		Integer i1 =new Integer(1);
		Integer i2 =new Integer(2);
		Integer i3 =new Integer(3);
		Integer i4 =new Integer(1);
		Integer i5 =new Integer(2);
		
		s1.add(i1);
		s1.add(i2);
		s1.add(i3);
		s1.add(i4);
		s1.add(i5);
		for (Integer i9 : s1) {
			System.out.println(i9);
		}
		
	}

}
