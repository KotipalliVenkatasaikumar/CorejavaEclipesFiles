package spring_dependency_injuction_object;

public class Student {
	private int id;
	private MathCheat mathCheat;

	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.matchCheat();
		System.out.println("hey my id is :" +id +" take and do whatever you to do..");
	}

	
	
//	
//	private int id;
//	private ScienceCheat scienceCheat;
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setScienceCheat(ScienceCheat scienceCheat) {
//		this.scienceCheat = scienceCheat;
//	}
//
//	public void setCheat(ScienceCheat scienceCheat) {
//		this.scienceCheat = scienceCheat;
//	}
//
//	public void cheating() {
//		scienceCheat.scienceCheat();
//		System.out.println("hey my id is :" + id + " take and do whatever you to do..");
//	}

}
