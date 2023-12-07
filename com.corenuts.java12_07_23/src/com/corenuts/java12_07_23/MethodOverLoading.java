package com.corenuts.java12_07_23;

public class MethodOverLoading {
	public void add(int a, int b) {
		int d = a + b;
		System.out.println(d);
	}

	public void add(int a, int b, int c) {
		int z = a + b + c;
		System.out.println(z);
	}

	public void add(int a, int b, int c, int d) {
		int z = a + b + c + d;
		System.out.println(z);
	}

	public void add(float a, float b, float c) {
		float z = a + b + c;
		System.out.println(z);
	}

	public void add(double a, double b, double c) {
		double d = a + b + c;
		System.out.println(d);

	}

}
