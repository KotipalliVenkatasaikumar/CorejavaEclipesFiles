package LinkedList;

public class Palindrome3 {
	public static void main(String[] args) {
		String input="sas";
	
		StringBuilder s=new StringBuilder(input);
		String s1=s.reverse()+"";
		if(s1.equals(input)) {
			System.err.println("palindrome");
		}
		else {
			System.err.println("not palindrome");
			
		}
	}

}
