package encapsulation;

public class OnlineAct {
	private String emailId;
	private String password;
	private String conformpassward;
	public void AcctDtails(String emailId,String Password, String conformpassword)
	{
		this.emailId= emailId;
		if(Password.length()>=8)
		{
			this.password= password;
			
			if(conformpassword.equals(password));
			{
				this.conformpassward =conformpassward;
				System.out.println("account created succesfully");
			}
			
				
			
		}
			else
			{
						System.err.println("password Must Contain 8 Characters" );
			}
		}
		
				
			
					
}
	
	


