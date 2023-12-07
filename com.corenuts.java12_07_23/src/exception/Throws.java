package exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Throws {
	public void method1() throws IOException {
		FileWriter fileWriter = new FileWriter("C:\\Users\\Admin\\Desktop\\kvs.txt");
		fileWriter.write("Exception Handling");
		System.out.println("file created");
		fileWriter.close();
	}

	public void method2() throws IOException {
		FileReader fileReader = new FileReader("C:\\Users\\Admin\\Desktop\\gopi.txt");
		method1();
	}

	public void method3(int a, int b) throws ArithmeticException, IOException {
		method2();
		int c = a / b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Throws e = new Throws();
//		try {
			try {
				e.method3(10, 5);
			} catch (ArithmeticException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//		} catch (ArithmeticException | IOException e1) {
//			e1.printStackTrace();
//		}
	}
}