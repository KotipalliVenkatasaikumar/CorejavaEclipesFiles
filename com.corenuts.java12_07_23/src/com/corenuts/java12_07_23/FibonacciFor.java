package com.corenuts.java12_07_23;

public class FibonacciFor {
	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*" +" " );
//			}
//			System.out.println(" ");
//		}
		
		int sum=0;
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<=10;i++) {
			 sum=first+second;
			 first=second;
			 second=sum;
			 System.out.println(sum);
			
		}
		
		
	}
	

}
