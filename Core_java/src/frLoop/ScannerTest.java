package frLoop;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//String no1 = 
	//	System.out.println(no1);
		
		System.out.println("enter 1st number");
		int number1 = sc.nextInt();
		System.out.println("enter 2nd number");
		int number2 =  sc.nextInt();
		
		
		Arthmatic s1 = new Arthmatic();
		
		
	int r=	s1.add(number1,number2);
		System.out.println(r);
		int k= s1.multification(number1, number2); 
		System.out.println(k);
		
		
	}
	

}
