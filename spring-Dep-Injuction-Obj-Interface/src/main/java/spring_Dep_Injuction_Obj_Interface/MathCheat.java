package spring_Dep_Injuction_Obj_Interface;

public class MathCheat implements Cheat {

	public MathCheat() {
		System.out.println("constructor of MathCheat");
	}
	@Override
	public void cheat() {
		System.out.println("MathCheat started....");
		
	}
	
	
	
}
