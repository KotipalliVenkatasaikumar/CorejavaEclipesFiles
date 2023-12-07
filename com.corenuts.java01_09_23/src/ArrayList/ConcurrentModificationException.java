package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
public static void main(String[] args) {
	List<Integer> l =  new ArrayList<>();
	l.add(1);
	l.add(1);
	l.add(1);
	l.add(1);
	for(Integer i:l)
	{
//		l.remove(0);
		l.add(20);
		System.out.println("add");
		
	}
	
	Iterator<Integer> itr = l.iterator();
	while(itr.hasNext())
	{
		Integer i =(Integer) itr.next();
		
		if(i==4)
		{
			
		}
//		l.remove(0);
		itr.remove();
		//l.add(20);
		System.out.println("remove");
		
		
	}
}
}
