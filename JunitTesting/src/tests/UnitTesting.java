package tests;

public class UnitTesting {

	public int add(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		UnitTesting testing =new UnitTesting();
		int sum =testing.add(0,1) ;
		if(sum !=1 ) {
			System.out.println("faiiled");
		}else {
			System.out.println(sum);
		}

//		boolean x = true;
//		if (!x) {
//			System.out.println("The value of x is false");
//		} else {
//			System.out.println("The value of x is true");
//		}
	}

}
