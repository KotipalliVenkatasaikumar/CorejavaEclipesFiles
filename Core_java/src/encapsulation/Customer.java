package encapsulation;

public class Customer {
	private String AcName;
	private long AcNO=50353940439l; 
	private String PanNo;
	private long Phno;
	static int count =0;
	Customer(String AcName,String PanNo,long Phno){
		this.AcName=AcName;
		this.PanNo=PanNo;
		this.Phno=Phno;
	//	this.AcNO=50353940439l;
		AcNO=AcNO+  ++count;
	}
	public String getAcName()
	{
		return AcName;
	}
	public String getPanNo() {
		return PanNo;
	}
		public long getPhno()
	{
		return Phno;
	}
	public long getAcNo()
	{
		return AcNO;
	}

	
	
	

}
