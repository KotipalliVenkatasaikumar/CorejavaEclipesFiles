package springDependencyInjuction;

public class Student {
	
	
	private String StudentName;
	private int studentId;

	
	//setter injuction
	
	
//	public void setStudentName(String studentName) {
//		StudentName = studentName;
//	}
//
//	public void setStudentId(int studentId) {
//		this.studentId = studentId;
//	}
	
	//constructor injuction
	
	public Student(int studentId) {
		super();
		this.studentId = studentId;
	}

	
	public Student(String StudentName, int studentId) {
		super();
		this.StudentName = StudentName;
		this.studentId = studentId;
	}
	
	

	


	public void studentDisplay() {
		System.out.println("student Name is :" + StudentName + " and Id is :" + studentId);
	}



}
