package frLoop;

public class Result {
	public static void main(String[] args) {
			ArthmaticCalc value = new ArthmaticCalc();
	//int a = 6;
		switch(value.e) {
			case 1:
				int a1 = value.add(5, 5, 5);
		System.out.println("ADDITION OF THREE VALUES : "   + a1);	
		break;
			case 2:
	    int a2 = value.sub(5, 5, 5); 
	    	    System.out.println("SUBTRACTION OF THREE VALUES : "   + a2);	
	    	    break;
			case 3:
	    int a3 = value.multification(5, 5, 5);
	    System.out.println("MULTIPLICATION OF THREE VALUES : "   + a3);	
	    break;
			case 4:
	    int a4 = value.division(5, 5, 5);
	    System.out.println("DIVISION OF THREE VALUES : "   + a4);	 
	    break;
			case 5:
	     int   a5 = value.moduler(5, 5, 5); 
	    System.out.println("MODULER OF THREE VALUES : "   + a5);	
	    break;
	    default :
	    	System.out.println("Enter vaild number");	
		    	
	
		}

}
}
