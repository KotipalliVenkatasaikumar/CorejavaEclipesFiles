package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
	int a;

	public SetExamples() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SetExamples(int a) {
		super();
		this.a = a;
	}

	public static void main(String[] args) {
		SetExamples s8=new SetExamples();
		System.out.println(s8.hashCode());
			Set s=new HashSet();
//		System.out.println(s.hashCode());
		Set s1 =new HashSet<>();
		System.out.println(s1);
		
	
		
	}
}
