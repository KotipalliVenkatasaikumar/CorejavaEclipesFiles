package encapsulation;

public class MainSetGet {
	public static void main(String[] args) {
		SetGet s1 = new SetGet();
		s1.setId(12);
		s1.setname("virat");
		s1.setphmo(9949967497l);
		System.out.println(s1.getId());
		System.out.println(s1.getname());
		System.out.println(s1.getphno());  
		SetGet s2 = new SetGet();
		s2.setId(5);
		s2.setname("balu");
		s2.setphmo(9553366516l);
		System.out.println(s2.getId());
		System.out.println(s2.getname());
		System.out.println(s2.getphno());
				
		
	}

}
