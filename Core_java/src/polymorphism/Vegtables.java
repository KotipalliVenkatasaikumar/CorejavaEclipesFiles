package polymorphism;

public class Vegtables {
	public static void main(String[] args) {
		Cabbage c = new Cabbage();
		c.Cabbage("super", 30);
	//	System.out.println(cabbage);
		c.califlower("good", 50);
		UpCost u = new Cabbage();
		u.califlower("avg", 20);
		Cabbage c1 = (Cabbage)u;
		c1.Cabbage("nice", 55);
		c1.califlower("medium", 20);
	}

}
