package inheritance;

public class MMainexec {
public static void main(String[] args) {
	System.out.println("mEmployee");
	MEmployee e = new MEmployee();
	e.working();
	e.learning();
	e.teaching();
	System.out.println("mStudent class");
	MStudent s = new MStudent();
	s.learning();
	s.teaching();
	System.out.println("teaching class");
	MFaculty f = new MFaculty();
	f.teaching();
	
	
	System.out.println("========================================");
	
	MFaculty faculty = new MStudent(); //upcasting
	System.out.println(faculty);
	
	MStudent student = (MStudent) new MFaculty(); //downcasting   //class cast Exception
	System.out.println(student);
	
	
	MStudent student1 = (MStudent) faculty;
	System.out.println(student1);
	
	
	
	
	
}
}
