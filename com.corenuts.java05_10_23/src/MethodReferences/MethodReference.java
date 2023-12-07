package MethodReferences;

public class MethodReference {
	public static void saySomething() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		Sayable s = MethodReference::saySomething;  // Static method references
		s.say();
	}

}
