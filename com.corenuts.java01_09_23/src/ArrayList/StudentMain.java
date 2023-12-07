package ArrayList;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student(1, "sai", 23);
		Student s1 = new Student(2, "kvs", 24);
		Student s2 = new Student(3, "vasu", 25);
		Student s3 = new Student(4, "kumar", 20);
		Student s4 = new Student(5, "gopi", 21);
		Student s5 = new Student(6, "somu", 26);
		Student s6 = new Student(7, "balu", 27);
		Student s7=new Student();
		s7.setAge(12);
		s7.setId(7);
		s7.setName("kamal");

		List<Student> listItems = new ArrayList<>();
		listItems.add(s);
		listItems.add(s1);
		listItems.add(s2);
		listItems.add(s3);
		listItems.add(s4);
		listItems.add(s5);
     	listItems.add(0, s6);
     	listItems.add(s7);
     	System.out.println(listItems.size());
     	 
	//	listItems.remove(5); // delete the particular value
//		listItems.set(0, s6); // replace existing record

//		for (int i = 0; i < listItems.size(); i++) {
//			System.out.println(listItems.get(i));
//		}

//		for (int i = 0; i < l.size(); i++) {    // display age in age 
//			System.out.println(((Student) l.get(i)).age);
//		}
     	
     	
//     	int val =0;
//     	while(val<listItems.size()) {
//     		System.out.println(listItems.get(val));
//     		val++;
//     	}
     	
     	
//     	// for each loop 
//		for(Student o: listItems ) {
//			System.out.println(o);
//		}
		
	//	Iterator
		Iterator itr=listItems.iterator();
		while(itr.hasNext()) {
			System.out.println("student details:"+itr.next());
		}
     	
	}
}
		



