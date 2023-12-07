package gopiSir;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckUncheck {
	public void method1() throws FileNotFoundException {
		FileReader fileReader=new FileReader("C:\\\\Users\\\\Admin\\\\Desktop\\gopi.txt");
		System.out.println("file read");
	}
	public void method2 () throws ArithmeticException {
		System.out.println("ArithmeticException");
	}
	
}
