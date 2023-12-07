package inheritance;

public class Pattren {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		char ch = 'a';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j || (i + j) == 6) {
					if(ch=='e') {
						ch='f';
					}
					System.out.print(ch);
					ch++;
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
