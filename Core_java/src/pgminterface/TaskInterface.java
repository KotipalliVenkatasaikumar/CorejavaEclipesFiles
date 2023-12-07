package pgminterface;

public interface  TaskInterface {
	void Test1();
	void Test2();
	}
interface TaskInterface1 {
	void Test3();
	void Test4();
}
interface TaskInterface2 extends TaskInterface, TaskInterface1
{
	void Test5();
	void Test6();
}
 class  TaskInterface3 implements  TaskInterface2{

	@Override
	public void Test1() {
		System.out.println("Test1 is in TaskInterface3 ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Test2() {
		// TODO Auto-generated method stub
		System.out.println("Test2 is in TaskInterface3 ");
		
	}

	@Override
	public void Test3() {
		// TODO Auto-generated method stub
		System.out.println("Test3 is in TaskInterface3 ");
	}

	@Override
	public void Test4() {
		// TODO Auto-generated method stub
		System.out.println("Test4 is in TaskInterface3 ");
		
	}

	@Override
	public void Test5() {
		// TODO Auto-generated method stub
		System.out.println("Test5 is in TaskInterface3 ");
	}

	@Override
	public void Test6() {
		// TODO Auto-generated method stub
		System.out.println("Test6 is in TaskInterface3 ");
		
	}
	 
 }
