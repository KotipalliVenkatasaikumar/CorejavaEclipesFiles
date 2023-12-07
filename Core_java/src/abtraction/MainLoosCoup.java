package abtraction;

public class MainLoosCoup {
	public static void main(String[] args) {
		LoosCoupTravel l;
		l = new Bike();
		l.travel();
		l = new LoosCoupCycle();
	    l.travel();
		
	}

}
