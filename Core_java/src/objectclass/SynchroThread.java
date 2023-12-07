package objectclass;

public class SynchroThread {
int x = 10;
public static void main(String[] args) throws InterruptedException
{
	System.out.println("main starts");
	SynchroThread s = new SynchroThread();
	System.out.println(s.x);
	s = null;
	System.gc();
//	Thread.sleep(2000);
	System.out.println("main ends");
		}
protected void finalize() throws Throwable
{
	System.out.println("object destroyed succussfully");
}
	
}
