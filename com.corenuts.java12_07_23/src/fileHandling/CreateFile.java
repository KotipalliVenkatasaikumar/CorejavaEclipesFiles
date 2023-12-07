package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {

			fw = new FileWriter("C:\\Users\\Admin\\Desktop\\kvs.txt");
			for (int i = 1; i <= 10; i++) {
				fw.write("Welcome to javaTpoint.");

			}
			try {
				pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\kvs.txt");
				pw.write("namasthe");
			} catch (FileNotFoundException e) {
				System.out.println( "print write not found");
				try {
				throw new ArithmeticException("t");
				}
				catch(ArithmeticException e1) {
					System.out.println("hbjdnkf");
				}
			}

		} catch (Exception e) {
			System.out.println("we are unable to process your request");
		} finally {
			try {
				fw.close();
				pw.close();
			} catch (Exception e ) {
				// TODO Auto-generated catch block
				System.out.println("Exception Handling");
			}
		}

	}
}
