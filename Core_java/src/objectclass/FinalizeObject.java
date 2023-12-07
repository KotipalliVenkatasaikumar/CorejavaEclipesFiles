package objectclass;

public class FinalizeObject {
	public static void main(String[] args) {
		FinalizeObject f = new FinalizeObject();
		f = null;
		System.out.println(f);
		FinalizeObject obj1 = new FinalizeObject();
		FinalizeObject obj2 = new FinalizeObject();
	
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2 );
		if(obj1==obj2) {
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equals");
		}
		obj1 =  obj2;
		System.out.println(obj1);
		System.out.println(obj2);
	} 

}
