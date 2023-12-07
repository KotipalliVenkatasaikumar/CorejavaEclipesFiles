package com.corenuts.odiw.players;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter gender");
		String gender=scan.next();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter state ");
		String state=scan1.next();
		if(gender.equals("female")) {
			if(state.equals("karnataka")) {
				System.out.println("eligible for travelling ");
							}
			else {
				System.out.println("not eligible");
			}
					}
		else {
			System.out.println("not allowed ");
		}
//		if(gender.equals("female") && state.equals("karnataka")) {
//			System.out.println("eligible");
//		}
//		else {
//			System.out.println("not eligible");
//		}
		
	}

}
