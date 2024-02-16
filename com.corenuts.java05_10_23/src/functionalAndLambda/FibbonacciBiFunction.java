package functionalAndLambda;

import java.util.function.BiFunction;

public class FibbonacciBiFunction {
	public static void main(String[] args) {
		BiFunction<Integer, Integer,Integer> b1 =(a,b)-> {
			int sum=0;
			System.out.print(a+" "+b);
			
			for(int i=0;i<=10;i++) {
				sum=a+b;
				a=b;
				b=sum;
				System.out.print(" "+sum);
			}
			return a;
		};
		
		b1.apply(0,1);
	}

}
