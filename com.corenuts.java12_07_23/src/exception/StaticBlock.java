package exception;

public class StaticBlock {
	static int value1;
	static String clgName = "prgc";
	int value2;
	//Is used to initialize the static data member.
	//It is executed before the main method at the time of classloading.
	static {
		value1 = 67;
		System.out.println("The static block has been called.");
		
	}

	public static void Display() {
		System.out.println(clgName);
		
	}

	public static void main(String args[]) {
		System.out.println(StaticBlock.value1);
		StaticBlock.Display();
	}
}
