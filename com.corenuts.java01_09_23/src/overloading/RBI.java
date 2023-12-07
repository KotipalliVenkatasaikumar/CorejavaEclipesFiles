package overloading;

import java.io.IOException;

public class RBI {
	 int loan() throws Exception {
		System.out.println("rbi");
		return 0;
	}

	 int icic() throws IOException {
		return 5;
	}

}
