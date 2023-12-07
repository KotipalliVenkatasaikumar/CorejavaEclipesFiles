package MethodReferences;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {

//		int n = 10;
//		int m = 20;
		BiConsumer<Integer, Integer> con =(a,b)-> {
		for (int i = a; i <= b; i++) {
			  System.out.println("***********tables********"+ i);
			for (int j = 1; j <= 20; j++) {
				
				System.out.println(i + "*" + j + "=" + j * i);
				
			}
		}
		};
		con.accept(10,20);
//		for (int i = 1; i <= 20; i++) {
//			System.out.println("19" + "*" + i + "=" + i * 19);
//		}
	}

}
