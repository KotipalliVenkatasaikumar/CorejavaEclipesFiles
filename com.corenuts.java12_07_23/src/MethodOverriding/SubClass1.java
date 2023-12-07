package MethodOverriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass1 extends SuperClass1{
	

		// SubClass declaring an exception
		// which are not a child exception of RuntimeException
		void method() throws NullPointerException {

			// Exception is not a child exception
			// of the RuntimeException
			// So the compiler will give an error

			System.out.println("SubClass");
		}

}
