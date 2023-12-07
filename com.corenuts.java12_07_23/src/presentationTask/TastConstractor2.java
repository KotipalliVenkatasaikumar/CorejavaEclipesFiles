package presentationTask;

public class TastConstractor2 extends TastConstractor1 {
	TastConstractor2() {
		System.err.println("non parameterized TastConstractor2");
	}

	TastConstractor2(String s) {
		
		System.out.println("child "+s);
	}

	public void m2() {
		System.out.println("TastConstractor2 method");
	}
}
