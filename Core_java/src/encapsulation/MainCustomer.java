package encapsulation;

public class MainCustomer {
	public static void main(String[] args) {
		Customer c = new Customer("krishna","HXTPK4323K",9949967497l);
		
           System.out.println(c.getAcName());		
           System.out.println(c.getPanNo());
           System.out.println(c.getPhno());
           System.out.println(c.getAcNo());
           System.out.println(c.count);
           Customer c1 = new Customer("venkat","ABCD12372K",9553366516l);
           System.out.println(c1.getAcName());		
           System.out.println(c1.getPanNo());
           System.out.println(c1.getPhno());
           System.out.println(c1.getAcNo());
           System.out.println(c1.count);
       	}
	

}
