package collections;


import java.util.HashSet;

public class StudentHashset {
	public static void main(String[] args) {
		
		Student std=new Student(1);
		Student std1=new  Student(2);
		Student std3=new  Student(2);
		Student std4=new  Student(3);
//		Integer i = new Integer();
		
		
		HashSet<Student> s = new HashSet<Student>(); 
		s.add(std);
		s.add(std1);
		s.add(std3);
		s.add(std4);
		for (Student student : s) {
			System.out.println(student.id);
		}
		

		}
		
	}

