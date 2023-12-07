package polymorphism;

public class RbiFinal {
	public static void main(String[] args) {
//		RBI r =new RBI();
//	System.out.println(r.loan());
		RBI r1 = new HDFC();
		System.out.println(r1.loan());
		RBI r2 = new SBI();
//		System.out.println(r2.loan());
//		HDFC  H = (HDFC)r1;
//	System.out.println(H.loan());
//	System.out.println(H.icic());
		SBI s = (SBI) r2;
		System.out.println(s.loan());
		System.out.println(s.icic());

	}

}
