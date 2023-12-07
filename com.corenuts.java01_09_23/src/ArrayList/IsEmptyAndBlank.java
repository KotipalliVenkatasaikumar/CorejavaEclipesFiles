package ArrayList;

public class IsEmptyAndBlank {
	public static void main(String[] args) {
		String s = null;
		System.out.println(s.isEmpty()); // count the spaces also characters
		System.out.println(s.isBlank()); // trim the spaces
		
		
		if (!s.isEmpty()) {
			System.out.println("true");
					}
		else {
			System.out.println("false");
		}
		if(!s.isBlank()) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		
		
			System.out.println("not empty");
			
		}
		
		
	

	}


