package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayAlpa {
	public static void main(String[] args) {
		List l =new ArrayList<>();
		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');
		l.add('e');
		l.add('f');
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	}

}
