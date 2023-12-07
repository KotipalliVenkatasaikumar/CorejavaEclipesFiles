package arrays;

public class TwoDArrayForloop {
	public static void main(String[] args) {
		int a[][]=new int[][] {{10,20},{30,40},{50,60,}};
		for(int[] i :a) {
			for(int j : i)
			{
				System.out.println(j);
			}
		}
	}

}
