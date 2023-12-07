package typeConversion;

import java.util.Scanner;

public class DoubleToString {
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a double value:");
	      Double d = sc.nextDouble();
	      String result =  d.toString(); //""+d;
	      System.out.println("The result is: "+result);
	      System.out.println(sc);
	   }
	}


