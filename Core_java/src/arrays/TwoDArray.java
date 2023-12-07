package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] a=new int[2][2];
		a[0][0]=26;
		a[0][1]=45;
		a[1][0]=25;
		a[1][1]=56;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.println(a[0][0]);
			}
			
		}
	}
}
