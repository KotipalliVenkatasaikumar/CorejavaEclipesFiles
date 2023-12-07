package collections;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {                 
		String s1=obj1.toString();
		String s2=obj2.toString();
		int a = s1.length();
		int b = s2.length();
		  if(a<b)
          return-1;
        else if(a>b)
         return 1;
        else
           return s1.compareTo(s2);
		  
		  //another way
//		int c= (a>b)?1:(a<b)?-1:0;                           
//		if(c!=0) {
//			return c;
//		}
//		else {
//			return s1.compareTo(s2);
//		}
		
	
	//return s2.compareTo(s1); #both are descending order
//		return s1.compareTo(s2); 
	}

}
