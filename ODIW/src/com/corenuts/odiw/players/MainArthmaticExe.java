package com.corenuts.odiw.players;

public class MainArthmaticExe {
	public static void main(String[] args) {
		
	
	ArthmaticImplements a =new ArthmaticImplements();
	int sum =a.add(5, 5);
	int diference =a.sub(10,5 );
	int multi =a.multi(5, 5);
	double division =a.division(25 ,5);
	int moduler =a.module(10,3);
	a.age(25);
	System.out.println("sum of="+sum);
	System.out.println("diference="+diference);
	System.out.println("multification="+multi);
	System.out.println("division ="+division);
	System.out.println("moduler="+moduler);
// System.out.println(vote);
	}
	}
