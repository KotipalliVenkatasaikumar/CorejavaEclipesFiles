package springDependencyInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student kvs=context.getBean("student", Student.class);
//		System.err.println(kvs.toString());
		kvs.studentDisplay();
		
		Student sai=context.getBean("kvs", Student.class);
		sai.studentDisplay();
	}

}
 