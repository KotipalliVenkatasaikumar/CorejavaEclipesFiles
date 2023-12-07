 package Spring_Common_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

//		College college = context.getBean("collegeBean", College.class);
		College college = context.getBean("college", College.class);
		System.out.println("clg object" + college);
		college.test();

	}

}
