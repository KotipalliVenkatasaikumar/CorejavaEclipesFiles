package com.corenuts.odiw.players;
public class Fibonacci {
	public static void main(String[] args) {
		int first=0;
		int second=1;
		System.out.println("Fibonacci Series:");
		System.out.println(first);
		System.out.println(second);
		int i=0;
		while(i<20) {
		int	sum=first+second;
		System.out.println(sum);
			first=second;
			second=sum;
				i=i+1;
	}
		
						}
		}


