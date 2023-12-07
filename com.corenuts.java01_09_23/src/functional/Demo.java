package functional;

public interface Demo {
	public int add(int a, int b ); 
	public int sub(int a, int b );
	default int multi(int a , int b) {
		return a*b;
		
	}

}
