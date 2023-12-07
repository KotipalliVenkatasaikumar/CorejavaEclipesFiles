package spring_Dep_Injuction_Obj_Interface;

public class JavaCheat implements Cheat {
	public JavaCheat() {
		System.out.println("constructor JavaCheat");
	}

	@Override
	public void cheat() {
		System.out.println("JavaCheat started......");
		
	}

}
