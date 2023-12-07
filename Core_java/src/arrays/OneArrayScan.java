package arrays;

import java.util.*;
public class OneArrayScan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the Element at index"+i);
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Elements are "+a[i]);
		}
	}
	

}
