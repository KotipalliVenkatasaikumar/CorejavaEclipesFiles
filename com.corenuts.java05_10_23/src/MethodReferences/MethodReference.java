package MethodReferences;

public class MethodReference {
	public  void saySomething() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		MethodReference methodReference=new MethodReference();
		Sayable s = methodReference::saySomething;  // Static method references
		//instance reference
		s.say();
	}

}
