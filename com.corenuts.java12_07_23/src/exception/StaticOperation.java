package exception;

public class StaticOperation {
	static String college = "jntuk";
	static int clgId = 20215;
	String name;
	int rollNo;

	StaticOperation(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void Display() {
		System.out.println(rollNo + " " + name + " " + clgId + " " + " " + college);
	}

	public static void main(String[] args) {
		StaticOperation s1 = new StaticOperation(1, "sai");
		StaticOperation s2 = new StaticOperation(2, "ramesh");
		s1.Display();
		s2.Display();
//		StaticOperation.clgId = 2010;

	}
}
