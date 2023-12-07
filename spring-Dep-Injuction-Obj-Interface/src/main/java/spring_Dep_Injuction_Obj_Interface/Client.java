package spring_Dep_Injuction_Obj_Interface;

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

	
	}

}
