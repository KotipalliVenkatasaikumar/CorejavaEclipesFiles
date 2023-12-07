package inheritance;

public class SOrganization extends SSystem  {
	String s;
	SOrganization(int a, int b, String s) {
		super(a,b);
		this.s = s;
						}
	SOrganization(){
		System.out.println("sOrganization");
		
	}
		
	
	public void fly()
	{
		System.out.println("fly is in sOrganization ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
			
		}
	}
	
	


