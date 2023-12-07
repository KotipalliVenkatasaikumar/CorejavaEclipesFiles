package inheritance;

public class Execution {
			public static void main(String[] args) {
			Sample s1 = new Sample();
			System.out.println(s1.d);
			System.out.println(s1.ch);
			s1.wish();
			Demo d1 = new Demo();
			System.out.println(d1.d);
			System.out.println(d1.ch);
			d1.wish();
			System.out.println(d1.i);
			System.out.println(d1.s);
			d1.display();
			
			}
}

