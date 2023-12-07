package arrays;

public class ForEach {
	public static void main(String[] args) {
//		int[] a = new int[4];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		
//		for(int i :a) {
//			System.out.println(i);
//		}
		        int[] arr = { 1, 5, 2, 8, 3 };
		        int sum = 0;

		        for (int i = 0; i < arr.length; i++) {
		            sum += arr[i];
		        }

		        System.out.println("Sum of all elements in the array: " + sum);
		        String str = "Hello World";
		        System.out.println(str.charAt(6));
		        
		        String str1 = "Java Programming";
		        System.out.println(str1.substring(5,12));


		    }
		}

