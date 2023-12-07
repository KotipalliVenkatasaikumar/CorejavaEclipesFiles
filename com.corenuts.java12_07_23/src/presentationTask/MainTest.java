package presentationTask;

public class MainTest implements TastInterface1, TastInterface2 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		TastInterface2.super.display();
	}
	public static void main(String[] args) {
		MainTest m=new MainTest();
		m.display();
			}
	
	
	

}
