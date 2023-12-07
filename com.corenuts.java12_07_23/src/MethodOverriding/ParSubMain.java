package MethodOverriding;

public class ParSubMain {
	public static void main(String[] args) {
		SuperClass1 s=new SubClass1();
		try {
			s.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
