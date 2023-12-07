package encapsulation;

abstract class Abstract {
	abstract void m1();
	abstract void m2();
	}
class Sample extends Abstract{
	
	void m1()
	{
		System.out.println("m1 is in sample class ");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 is in sample class");
		
	}
	
	
}










