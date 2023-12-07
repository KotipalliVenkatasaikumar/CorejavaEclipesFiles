package exception;

public class ThrowExample {
	public void votingAge(int a){
	  if(a<18) {
		throw new AgeNotAllowedException("Not Eligible");
	  }
	  else {
		  System.out.println("eligible");
	  }
	}

	public static void main(String[] args) {
		ThrowExample t = new ThrowExample();
			t.votingAge(10);
	}
}
