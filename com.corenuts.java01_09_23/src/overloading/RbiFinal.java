package overloading;

public class RbiFinal {
	public static void main(String[] args) throws Exception {
		RBI r = new RBI();
		    r.loan();
		    System.out.println(r.icic());
		RBI r1 =new SBI();
		    System.out.println(r1.loan());
	    RBI r2 =new HDFC();
	        System.out.println(r2.loan());
	        
	}

}
