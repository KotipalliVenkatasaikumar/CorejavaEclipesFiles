package objectclass;

public class ToStringOver {
	String name;
	ToStringOver(String name)
	{
		this.name= name;
		}
//	public String tostring()
//    {
//	return name;
//	}
	 public static void main(String[] args) {
		 ToStringOver ref = new ToStringOver("sai");
		 System.out.println(ref);
		 ToStringOver ref2 = new ToStringOver("kvs");
		 System.out.println(ref2);
		System.out.println(ref2.name);
		System.out.println(ref.name);
		 
	 }
}