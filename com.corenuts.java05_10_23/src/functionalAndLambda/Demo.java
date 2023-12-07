package functionalAndLambda;

public interface Demo {
	void add(int a, int b);
	
	
    static void m1() {
    	System.out.println("pradeep");
    }
    default void m2() {
    	System.out.println("sampath");
    }
}
