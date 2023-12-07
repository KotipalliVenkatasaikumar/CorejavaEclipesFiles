package gopiSir;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowThorowsExceptions {
	
	public void method1() throws IOException  {
	
		FileWriter  fileWriter =new FileWriter("C:\\\\Users9\\\\Admin\\\\Desktop\\ram.txt");
			        fileWriter.write("checking");
			        fileWriter.close();
			        System.out.println("hello world");
			        	}

	public void method2() throws StringIndexOutOfBoundsException, IOException {
		System.out.println("kvs");
		method1();
	}

	public static void main(String[] args){
		ThrowThorowsExceptions t =new ThrowThorowsExceptions();
	
			try {
				t.method1();
			} catch (IOException e) {
				e.printStackTrace();
			}
		try {
			t.method2();
		} catch (StringIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
