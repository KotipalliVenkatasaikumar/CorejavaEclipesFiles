package ArrayList;

public class Palindrome {
	public static void main(String[] args) {
		String s= "121";
		String temp="";
		for(int i=0;i<s.length();i++) {
			temp=s.charAt(i)+temp;
			
		}
		if(s.equals(temp)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
	}

}
