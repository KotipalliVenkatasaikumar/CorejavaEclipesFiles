package jdbcExample;

import java.sql.*;

public class PrepareStatementDemo {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement stat = null;
		ResultSet rs;
//		String create="create table Employees ( employee_id int primary key,employee_name VARCHAR(50) NOT NULL , employee_salary int not null )";
		String read = "select *from Employees";
//		String update = "update Employees set employee_name='kumar' where employee_id=105 ";
//		String pkdelete="ALTER TABLE Employees DROP PRIMARY KEY"; 
//		String setpk= "ALTER TABLE Employees ADD PRIMARY KEY (employee_id)";
		String delete = "delete from Employees where employee_id=106";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kvs", "root", "root");
			stat = con.prepareStatement("insert into Employees values(?,?,?)");
//			stat.setInt(1, 106);
//			stat.setString(2, "ravi");
//			stat.setInt(3, 78923);

//			stat.executeUpdate();
			stat.executeUpdate(delete);
			System.out.println("created");
			rs = stat.executeQuery(read);
			while (rs.next()) {
				int employee_id = rs.getInt("employee_id");
				String employee_name = rs.getString("employee_name");
				int employee_salary = rs.getInt("employee_salary");
				System.out.println(employee_id + "," + employee_name + "," + employee_salary);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			stat.close();
		}
	}

}
