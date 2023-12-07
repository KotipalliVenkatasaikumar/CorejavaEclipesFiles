package com.corenuts.java12_07_23;

public class MethodExecution {
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.add(10, 20);
		m.add(2.3, 3.0, 2.3);
		m.add(5, 10, 20);
		m.add(10, 30, 40, 50);
		m.add(5.0d, 2.0d, 2.3d);
	}

}
