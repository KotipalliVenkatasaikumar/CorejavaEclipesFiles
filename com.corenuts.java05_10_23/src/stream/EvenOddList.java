package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class EvenOddList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(15);
		list.add(13);
		list.add(16);
		list.add(120);
		list.add(1);

		
//		lambda Expression
		
//		list.forEach((a)-> {
//			if(a%2==0) {
//				System.out.println(a);
//			}
//		});

	 Consumer<Integer> method = (a) -> { System.out.println(a); };
	 
	 list.forEach( method );
		for(Integer i:list) {
			if(i%2!=0) {
				System.out.println(i);
			}
	
	 
	
//	}
	 
//	 for(int i=1000;i>=1;i--) {
//		 int count=0;
//		 for(int j =1;j<=i;j++) {
//			 if(i%j==0) {
//				 count++;
//			 }
//			  }
//		 if(count==2) {
//			 System.out.println(i);
//		 }
//		 }
	
	}

}
}