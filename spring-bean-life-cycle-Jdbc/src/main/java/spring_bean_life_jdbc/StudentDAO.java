package spring_bean_life_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {
	private String diver; // = "com.mysql.cj.jdbc.Driver";

	private String url; // "jdbc:mysql://localhost:3306/studentdetails";
	private String userName; // = "root";
	private String password; // "root";
	Connection con;

	public String getDiver() {
		return diver;
	}

	public void setDiver(String diver) {
		this.diver = diver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("inside the  custom init method");
		creatStudentDbConnection();

	}

	public void creatStudentDbConnection() throws ClassNotFoundException, SQLException {
		// load diver
		Class.forName(diver);
		// get a connection
		con = DriverManager.getConnection(url, userName, password);
		// execute query

	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from studentdetails.studentinfo");

		while (rs.next()) {
			int stuId = rs.getInt(1);
			String StuName = rs.getString(2);
			int StuClass = rs.getInt(3);
			int English = rs.getInt(4);
			int Telugu = rs.getInt(5);
			int maths = rs.getInt(6);
			String gender = rs.getString(7);
			String Dob = rs.getString(8);
			String Grade = rs.getString(9);
			String Addres = rs.getString(10);
			String Location = rs.getString(11);

			System.out.println(stuId + " " + StuName + " " + StuClass + " " + English + " " + Telugu + " " + maths + " "
					+ gender + " " + Dob + " " + Grade + " " + Addres + " " + Location);

		}
		con.close();

	}

	public void deleteStuddentRecord(int studentId) throws SQLException, ClassNotFoundException {
		// load diver
		Class.forName(diver);
		// get a connection
		Connection con = DriverManager.getConnection(url, userName, password);
		// execute query
		Statement stmt = con.createStatement();

		stmt.executeUpdate("delete from studentinfo where stuId=" + studentId);
		System.out.println("record deleted with id" + studentId);

	}

	public void closeConnection() {

		try {
			con.close();
			System.out.println("@PreDestroy is calling");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method is calling");
		closeConnection();
	}

}
