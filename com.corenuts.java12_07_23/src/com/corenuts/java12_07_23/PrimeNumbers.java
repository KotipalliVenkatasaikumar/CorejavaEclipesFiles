package com.corenuts.java12_07_23;

public class PrimeNumbers {
	public static void main(String[] args) {

//		for (int i = 1; i <= 20; i++) {
//			int count = 0;
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.println(i);
//			}
//		}

//   prime number or not
		int a = 19;
		int count = 0;
		for (int i = 1; i <= a; i++) {

			if (a% i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime number ");
		} else {
			System.out.println("non prime ");
		}

//		 int num = 20; 1
//		 for (int i = 1; i <= num; i++) {
//		 int  count = 0;
//		   for (int j = 2; j <= i/2 ; j++) {
//		    if (i % j == 0) {
//		     count++;
//		     break;
//		    }
//		   }
//
//		   if (count == 0) {
//		    System.out.printlSn(i);
//		   }
//
//		  }
////		
//		int count;
//		for (int i = 1; i <= 100; i++) {
//			count=0;
//			for (int j = 1; j <= i/2; j++) {
//				if (i % j == 0) {
//					
//					count++;
//				}
//			}
//			if (count == 1) {
//				continue;
//			}
//			else {
//				System.out.println(i);
//			}
//		}

// check prime number or not	
//			    int num = 33, i = 2;
//			    boolean flag = false;
//			    while (i <= num / 2) {
//			      // condition for nonprime number
//			      if (num % i == 0) {
//			        flag = true;
//			        break;
//			      }
//
//			      ++i;
//			    }
//
//			    if (!flag)
//			      System.out.println(num + " is a prime number.");
//			    else
//			      System.out.println(num + " is not a prime number.");
	}

}
