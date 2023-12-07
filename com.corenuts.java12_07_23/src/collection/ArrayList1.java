package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("sai");
		l.add("kvs");
		l.add("kumar");
		l.add("raf");
		l.add("balu");

//		System.out.println(l);
		
		
//		for (Object object : l) {
//		System.out.println(object);
//	}
//	for(int i=0;i<l.size();i++) {
//		System.out.println(l.get(i));
//	}
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			}
	

}
