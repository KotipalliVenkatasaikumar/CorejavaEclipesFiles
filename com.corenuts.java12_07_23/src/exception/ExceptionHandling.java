package exception;

import strings.ArthmaticOperations;

public class ExceptionHandling {

	public static void division(int a, int b) {
		try {

			float result = a / b;
			System.out.println(result);

			int x = 1000;
			int y = 2;
			int z = x / y;
			System.out.println(z);
			String s = "sai";
			System.out.println(s.charAt(2));
			int[] arr = new int[5];
			System.out.println(arr[4]);
			String s1=null;
			System.out.println(s1.length());

		} catch (ArithmeticException e) {
			System.out.println("cant divide by zero");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}

	   	catch (Exception e) {
			System.out.println("Exception");
		} 
		catch (Throwable e) {
			System.out.println("sashanala grandham");
		} 
		finally {
			System.out.println("gopi sir");
		}

	}

	public static void main(String[] args) {
		ExceptionHandling.division(100, 2);

	}
}
