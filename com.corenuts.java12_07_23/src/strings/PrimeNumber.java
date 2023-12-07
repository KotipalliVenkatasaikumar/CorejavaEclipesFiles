package strings;

public class PrimeNumber {
	public static void main(String[] args) {
		int count;
		String prime = " ";
		String nonprime = " ";
		for (int i = 1; i <= 20; i++) {
			count = 0;
			for (int j = 1; j <= i ; j++) {
				if (i % j == 0) {

					count++;
				}
			}
			if (count ==2 ) {
//				System.out.println(i);

				prime = prime + i + ",";
			} else {
//				System.out.println(i);
				nonprime = nonprime + i + ",";
			}
		}
		System.out.print("prime "+prime);
		System.out.println();
		System.out.print("nonprime "+nonprime);
	}
}
