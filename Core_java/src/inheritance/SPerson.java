package inheritance;

class SPerson extends SSystem {
	int c;
	SPerson() {
		super();
		System.out.println("sPerson");
	}
	SPerson(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	public void wish() {
		System.out.println("wish is in sPerson");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
				}
		}
	
	
		
	