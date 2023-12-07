package com.corenuts.odiw.players;

public interface Demo {
	int m1 (); 
	int m2();
	int m3();
	}
 class Demo2 implements Demo{
	 int a =10;
	 int b= 20;

	@Override
	public int m1() {
		int c= a+b;
		return c;
	}

	@Override
	public int m2() {
		int c = a-b;
		return c;
	}

	@Override
	public int m3() {
		int c= a*b;
		return c;
	}
public static void main(String[] args) {
		Demo2 d=new Demo2();
		System.out.println(d.m1());
		System.out.println(d.m2());
		System.out.println(d.m3());
	}
	 }