package com.corenuts.java12_07_23;

public class FacultyInheritance {
	String sub = "java";

	public void teaching() {
		System.out.println("teaching java");
	}
}

class Student extends FacultyInheritance {
	public void learning() {
		System.out.println("learning java");
	}

}

class MEmployee extends Student {
	String job = "software engineer";

	public void working() {
		System.out.println("software enginner");
	}
}
