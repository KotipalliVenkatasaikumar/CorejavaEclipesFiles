package frLoop;

public class OverloadEx {
	int disp (int x) {
		return x;
			}
	double disp (double y) {
		return y;
			}
	public static void main(String[] args) {
		OverloadEx s1 = new OverloadEx();
		System.out.println("value of x : " + s1.disp(5));
		System.out.println("value of y : " + s1.disp(2.3));
	}
	
}
			 
	