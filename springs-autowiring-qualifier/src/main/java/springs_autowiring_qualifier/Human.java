package springs_autowiring_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
    @Autowired
   @Qualifier("octpousHeart")
	private Heart heart;

	public Human() {

	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name of the animal is: " + heart.getNameOfAnimal() + " no of heart present :"
					+ heart.getNoOfHeart());

		} else {
			System.out.println("you are dead");
		}
	}

}
