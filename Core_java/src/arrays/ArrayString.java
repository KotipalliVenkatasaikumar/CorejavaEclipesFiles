package arrays;

public class ArrayString {
	public static void main(String[] args) {
		
//	String[] str = new String[6];
//	str[0]="anu";
//	str[1]= "ramu";
//	str[2] = "sai";
//	str[3]= "java";
//	str[4]= "developer";
//	for(int i =0; i < str.length;i++) {
//		System.out.println(str[i] +" ");
		int [] a=new int[] {0,2,3,1,3};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i+1;j++) {
				if(a[i]==j) {
					break;
				}
					
				else {
					System.out.println(a[j]);
				}
			}
		}
	}
}
//}
//	
//
//}
