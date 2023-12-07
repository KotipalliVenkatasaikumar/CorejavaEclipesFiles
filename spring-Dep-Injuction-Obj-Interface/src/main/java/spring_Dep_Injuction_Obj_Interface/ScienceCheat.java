package spring_Dep_Injuction_Obj_Interface;

public class ScienceCheat implements Cheat {
	public ScienceCheat() {
		System.out.println("constructor of ScienceCheat");
	}

	@Override
	public void cheat() {
		System.out.println("ScienceCheat started....");

	}

}
