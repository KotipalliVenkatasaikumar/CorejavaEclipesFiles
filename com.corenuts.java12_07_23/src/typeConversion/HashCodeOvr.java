package typeConversion;

public class HashCodeOvr {
	int id;
	String name;

	public String toString() {
	return name;
	}

	public int hashcode() {
		return id;
	}

	public static void main(String[] args) {
		HashCodeOvr s = new HashCodeOvr();
		s.name = "ravi";
		s.id = 101;
		System.out.println(s);
		int hashcode = s.hashcode();
		System.out.println(hashcode);
	}

}
