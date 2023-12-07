package com.corenuts.jdbc;

import java.sql.*;

public class Jdbc {
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		String jdbcUrl = "jdbc:mysql://localhost:3306/kvs";
		String username = "root";
		String password = "root";
		String insert = "insert into student values(?,?,?)";
		String sel = "select * from student";
		String update = "update student set StudentName='veru' where idStudent=101 ";
		String delete = "delete from student where idStudent=555";
		Connection con = null;
//		Statement stat = null;
		PreparedStatement stat = null;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("asdfghjk");
			con = DriverManager.getConnection(jdbcUrl, username, password);
//			stat = con.createStatement();
			stat = con.prepareStatement(delete);
//			stat.setInt(1, 555);
//			stat.setString(2, "kumar");
//			stat.setString(3, "96");
			stat.executeUpdate();
//			con.commit(); 
//			stat.execute(insert);
			System.out.println("data inserted");
			rs = stat.executeQuery(sel);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + " " + rs.getString(3));
			}

			// Now you have a connection to your MySQL database.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
			stat.close();

		}
	}
}
