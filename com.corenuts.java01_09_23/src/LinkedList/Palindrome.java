package LinkedList;

public class Palindrome {
	
		public void pali() {
			int rev=0;
			int num=232;
			int temp=num;
			while(num>0) {
				rev=rev*10+(num%10);
				num=num/10;
			}
			
			if(temp==rev) {
				System.out.println(" palindrome");
			}
			else {
				System.out.println(" not paliondrome");
			}
		}
		
		public static void main(String[] args) {
			Palindrome palindrome=new Palindrome();
			palindrome.pali();
		}
	

}
