package spring_dependency_injuction_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
//		MathCheat cheat=new MathCheat();
//		Student student =new Student();          //-> without using Spring
//		student.setMathCheat(cheat);
//		student.cheating();

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("xml loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();

		AnotherStudent student2 = context.getBean("anotherStudent", AnotherStudent.class);
		student2.startCheating();
	}

}
