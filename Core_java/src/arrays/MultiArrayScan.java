package arrays;

import java.util.*; 
public class MultiArrayScan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int row =sc.nextInt();
		System.out.println("Enter the col size");
		int col = sc.nextInt();
		int a[][] = new int [row][col];
		System.out.println("Eter the values");
		for(int i = 0; i < row; i++)
		{
			for(int j =0; j< col;j++)
			{
				a[i][j]=sc.nextInt();
			}
					}
		System.out.println("Array values are");
		for(int i = 0; i < row; i++)
		{
			for(int j =0; j< col;j++)
			{
				System.out.println(a[i][j]);
			}
					} 
							} 
	
	

}
