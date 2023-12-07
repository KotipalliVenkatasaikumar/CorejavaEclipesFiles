package strings;
import java.util.*;
public class Task {
	public static void main(String[] args) {
		int count = 0;
		String str = "venkata saikumar";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter charector");
		 char c1 = scan.next().charAt(0) ;
	//	char c1 = 'a';
			for(int i =0; i< str.length(); i++) 
		{
			char c2 =str.charAt(i);
			if(c2==c1)
			{
				count++;
			}
					}
		System.out.println(count);
				
		
		
	}

}
