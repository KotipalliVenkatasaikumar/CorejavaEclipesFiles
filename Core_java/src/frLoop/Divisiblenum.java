package frLoop;

public class Divisiblenum {
	public static void main(String[] args) {
		int a = 9;
			int b = 25;
			a++;
			int count = 0;
			while(a < 25)
			{
				if(a % 3==0 && a % 7==0)
				{
					count++;
									}
				a++;
			}
			System.out.println("divisible count"   + count);

	}

}
