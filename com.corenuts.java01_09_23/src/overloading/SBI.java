package overloading;

import java.io.IOException;

public class SBI extends RBI {
	protected int loan()  throws IOException{
		System.out.println("sbi loan");
		return 6;
	}

}
