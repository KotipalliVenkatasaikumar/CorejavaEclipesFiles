package spring_value_required_annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String interestedCourse;
	private String hobby;

//	@Value("sampu")
	@Value("${student.name}")
	@Required
	public void setName(String name) {
		this.name = name;
	}

	@Required
//	@Value("java")
	@Value("${student.interestedCourse}")	
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

//	@Value("cricket")
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentDetails() {
		System.out.println("Student name " + name);
		System.out.println("Student intrested course " + interestedCourse);
		System.out.println("Student hobby  " + hobby);
	}

}
