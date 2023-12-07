package pgminterface;

	public interface MultileveInheritance
	{
		
	public	String namesDemo = "kvs";
			public void Employee1();
		     public void Employee2();
		}
	interface MultileveInheritance1 extends MultileveInheritance
	{
		int variableName = 10;
		void Employee3();
		void Employee4();
	}

