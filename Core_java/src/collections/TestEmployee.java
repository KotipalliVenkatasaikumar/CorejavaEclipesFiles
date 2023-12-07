package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
  ArrayList	arr	=new ArrayList();
  arr.add(10);
  arr.add("sai");
  arr.add(false);
  arr.add(2.3);
//  for(int i=0;i<arr.size();i++) {
//	  
//	  
//	  System.out.println(arr.get(i));
//  }
//  for(Object i: arr ) {
//	  System.out.println(i);
//	   }
  System.out.println("*******************");
 Iterator itr =arr.listIterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
	if (itr.next()=="sai") {
	
	}
	 
 }
  
	  
  }
  
}
 


