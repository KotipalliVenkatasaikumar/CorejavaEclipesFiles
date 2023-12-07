package frLoop;
import java.util.*;
public class Scan360 {
	public static void main(String[] args) {
		//creating scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int number1 = scan.nextInt();
		System.out.println("Enter 2st number");
		int number2= scan.nextInt();
		System.out.println("Enter 3st number");
		int number3= scan.nextInt();
		int number4= scan.nextInt();
	//	int number1 = 5;
	//	int number2 = 5;
	//	int number3 = 5;
		
		//by creating object  
		ArthmaticCalc kumar = new ArthmaticCalc();
		switch (number4) {
		case 1: 
				int value1 = kumar.add(number1, number2, number3);
			System.out.println("ADDITION VALUE : " + value1); 
			break;
		case 2:
		int value2 = kumar.sub(number1, number2, number3);
		System.out.println( "SUBTRACTION VALUE  : " + value2);
		break;
		case 3:
		int value3 = kumar.multification(number1, number2, number3);
		System.out.println("MULTIFICATION VALUE : " + value3);
		break;
		case 4:
		int value4 = kumar.division(number1, number2, number3);
		System.out.println("DIVISION VALUE :" + value4);
		break;
		case 5:
		int value5 = kumar.moduler(number1, number2, number3);
		System.out.println("MODULER VALUE :" + value5);
		break;
		default:
			System.out.println("enter a valid number" );
		}
}
}
