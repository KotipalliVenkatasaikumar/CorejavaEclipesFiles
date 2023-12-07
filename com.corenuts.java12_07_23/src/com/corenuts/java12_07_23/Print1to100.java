package com.corenuts.java12_07_23;

public class Print1to100 {

	public static void main(String[] args) {
		int start;
		start=20;
		int end;
		end= 40;
		int a=10;
		int b=20;
		int c=30;
		
		
		 int startNum=1;
		 int endNum=40;
		 int jstart=1; 
//		int count=0;	 
		 
		 int fibstart=0;
		 int fibend=30;
		 int fibsum=0; 
		 int value1=0;
		 int value2=1;
		
		 
		 
		 int x=18;
		 int y=8;
		 
		 int num1=1;
		int num2=1;
		int num3=1;
		 
		Print1to100 p; 
		p= new Print1to100();
//		p.printNumbers(start,end);
//		p.evenNum(start,end);
//		p.oddNum(start,end);
//		p.add(a, b, c);
//		p.primeNum(startNum, endNum,jstart);
//		p.fibonacci(fibstart, fibend, fibsum, value1, value2);
        p.multiply(x,y);
		p.multiply(num1, num2, num3);
	}
	
	
	public void printNumbers(int start,int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}

	public void evenNum( int start,int end) {
		for (int i = start; i < end; i++) {
			if(i%2==0) {
			System.out.println("even=" + i);
			}
		}
	}

	public void oddNum(int start,int end) {
		for (int i = start; i < end; i = i++) {
			if(i%2!=0) {
			System.out.println("odd=" + i);
			}
			
		}
			
	}
	public void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
					
	}
	public void primeNum(int startNum,int endNum, int jstart) {
		for(int i=startNum;i<=endNum;i++) {
			int count=0;
			for(int j= jstart;j<=i;j++) {
				if(i%j==0) {
					count++;
			}
			}
			if(count==2) {
				System.out.println(i); 
				
			}
		}
		
	}
	public void fibonacci(int start,int end,int sum, int value1,int value2) {

		System.out.println(value1);
		System.out.println(value2);
		for(int i=start;i<=end;i++) {
			 sum=value1+value2;
			 value1=value2;
			 value2=sum;
			 System.out.println(sum);
		
	}
}
	public void multiply(int x,int y) {
		int z=x*y;
		System.out.println(z);
	}
	public void multiply(int num1,int num2,int num3 ) { 
		int sum=num1*num2*num3;
		System.out.println(sum);
	}
	
}