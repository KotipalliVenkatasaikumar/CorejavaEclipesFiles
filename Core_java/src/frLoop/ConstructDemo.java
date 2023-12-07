package frLoop;

public class ConstructDemo {
	ConstructDemo( int i){
		System.out.println("parameterized constractor"+i);
			}
	
	ConstructDemo( int i, int j){
		System.out.println("parameterisfgdghffhngmgzed constractor"+i+j);
			}
	public static void main(String[] args) {
		//ConstructDemo d1 = new ConstructDemo(10);
		ConstructDemo d2 = new ConstructDemo(10,20);
		System.out.println("main method" );
		
		
	}

}
