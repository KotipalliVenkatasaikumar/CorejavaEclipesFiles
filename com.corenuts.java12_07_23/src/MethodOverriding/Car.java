package MethodOverriding;

import java.io.FileNotFoundException;

public class Car extends Vehicle {

	@Override
	protected Car speed(Object o) throws FileNotFoundException, ArithmeticException {
		return new Car();
	}
	public static void main(String[] args) {
		
	}

}
