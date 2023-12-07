package com.corenuts.java12_07_23;

public class StaticArthoperation {
	public static int add(int a, int b) {
		int c= a+b;
		System.out.println(c);
		return c;
		}

	public static int sub(int a, int b) {
		int c= a-b;
		return c;
	}

	public static int multi(int a, int b) {
		int c=a*b;
		return c;
	}

	public static double division(int a,int b) {
		double c=a/b;
		return c;
	}

	public static int module(int a, int b) {
		int c=a%b;
		return c;
	}

	public static void age(int a) {
		 int eligible =18;
		 if(a >eligible) {
			 System.out.println("you are eligible to vote");
						 }
		 
		 else {
			 System.out.println("you are not to eligible");
		
		}

}
}

