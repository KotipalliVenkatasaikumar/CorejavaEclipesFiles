package Spring_Common_Annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	@Override
	public void teah() {
		System.out.println("i am your math teacher ");
		System.out.println("my name is sampath");

	}

}
