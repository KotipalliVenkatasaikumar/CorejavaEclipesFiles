package inheritance;

public class MFinal {
	public static void main(String[] args) {
		SPerson p = new SPerson(10,20,30);
	//	System.out.println(p.a);
	//	System.out.println(p.b);
	//	System.out.println(p.c);
				p.wish();
		
		SOrganization o = new SOrganization(10,20,"king");
			System.out.println(o.s);
			System.out.println(o.a);
			o.fly();
		
		
			
					}
}