package objectclass;

public class EqualsComparision {
public static void main(String[] args) {
	EqualsComparision e1 = new EqualsComparision();
	EqualsComparision e2 = new EqualsComparision();
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e1));
	System.out.println("=====String class====");
	String obj1 = new String("java");
	String obj2 = new String("java");
	System.out.println(obj1.equals(obj2));
	String obj3 = new String("java");
	String obj4 = new String("Java");
	System.out.println(obj3.equals(obj4));
}
}
