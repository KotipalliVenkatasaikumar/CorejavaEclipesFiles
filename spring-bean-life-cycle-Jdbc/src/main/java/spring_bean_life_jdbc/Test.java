package spring_bean_life_jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		StudentDAO dao=new StudentDAO();
//		dao.selectAllRows();                      // norama object creation
//		dao.deleteStuddentRecord(5);

		// apllication context

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO studentDAO = context.getBean("studentDao", StudentDAO.class);
		studentDAO.selectAllRows();

	}

}
