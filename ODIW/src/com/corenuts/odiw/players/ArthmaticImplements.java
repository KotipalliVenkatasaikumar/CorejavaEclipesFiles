package com.corenuts.odiw.players;

public class ArthmaticImplements implements ArthmaticOperations{
	
	@Override
	public int add(int a, int b) {
		int c= a+b;
//		System.out.println(c);
		return c;
		}

	@Override
	public int sub(int a, int b) {
		int c= a-b;
		return c;
	}

	@Override
	public int multi(int a, int b) {
		int c=a*b;
		return c;
	}

	@Override
	public double division(int a,int b) {
		double c=a/b;
		return c;
	}

	@Override
	public int module(int a, int b) {
		int c=a%b;
		return c;
	}

	@Override
	public void age(int a) {
		 int eligible =18;
		 if(a >eligible) {
			 System.out.println("you are eligible to vote");
						 }
		 
		 else {
			 System.out.println("you are not to eligible");
		
		}
	}
}
			



    
