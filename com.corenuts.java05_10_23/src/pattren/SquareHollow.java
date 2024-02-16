package pattren;

public class SquareHollow {
//	public static void printPattern(int n) {
//		int i, j;
//		// outer loop to handle number of rows
//		for (i = 0; i < n; i++) {
//			// inner loop to handle number of columns
//			for (j = 0; j < n; j++) {
//				// star will print only when it is in first
//				// row or last row or first column or last
//				// column
//				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
//					System.out.print("*");
//				}
//				// otherwise print space only.
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}

	// Driver Function
	public static void main(String args[]) {
		int n = 6;
		//printPattern(n);
		number(5);
	}

	public static void number(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
		System.out.println();
		
		int value1=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(value1+" ");
				value1++;
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}if(count==2) {
				System.out.println(i);
			}
		}
		
		int value=13;
		int count=0;
		for(int i=1;i<=value;i++) {
			
			if(value%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("prime" +value);
			}else {
				System.out.println("non" +value);
			}
		}
		
	
}
