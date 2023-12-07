package arrays;

public class Examples {
	public static void main(String[] args) {
	    int[] a = {5, 2, 15, 30,20, 25};
	    int max = 0;
	    int maxIndex = 0;

	    for (int i = 0; i < a.length; i++) {
	        if (a[i] > max) {
	            max = a[i];
	            maxIndex = i;
	        }
	    }

	    System.out.println("Maximum number is: " + max);
	    System.out.println("Its index is: " + maxIndex);
	}

}



