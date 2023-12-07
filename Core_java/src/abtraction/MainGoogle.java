package abtraction;

public class MainGoogle {
	public static void main(String[] args) {
		GoogleLoosCoup g;
		g = new Images();
		g.search();
		g = new News();	
		g.search();
		g = new Map();
		g.search();
		}

}
