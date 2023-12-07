package frLoop;

public class Test {
	public static void main(String[] args) {
		Arthmatic s1 = new Arthmatic();
	//	System.out.println(s1.a);
	//	System.out.println(s1.b);
				s1.message(); 
		s1.newmessage();
		
		
		
	int s2 =s1.add(12,10);
	System.out.println(s2);	
	int s3 = s1.sub(5,5); 
	System.out.println(s3);
	int s4 = s1.multification(2, 5); 
	System.out.println(s4);
	int s5 = s1.division(2, 6);
	System.out.println(s5);
	int s6 = s1.module(6, 18);
	System.out.println(s6); 
		}

}
