package Spring_Common_Annotations;

import org.springframework.stereotype.Component;

@Component
public class TeluguTeacher implements Teacher {

	@Override
	public void teah() {
		System.out.println("i am your Telugu teacher ");
		System.out.println("my name is kohli");

	}

}
