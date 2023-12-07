package jdbcExample;

import java.sql.*;

public class StatementDemo {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement stat = null;
		ResultSet rs;
		String url = "jdbc:mysql://localhost:3306/kvs";
		String username = "root";
		String pass = "root";
//		String insert = "insert into farmerdetails values(3,'ravi',60000,'kkd')";
//		String update="update farmerdetails set farmerLocation='rjy' where farmerId=3";
//		String alter="alter table farmerdetails rename column farmerLoanl to farmerLoan";
		String read="select * from farmerdetails";
		String delete="delete from farmerdetails where farmerId=5";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, pass);
			stat = con.createStatement();
			stat.executeUpdate(delete);
			rs=stat.executeQuery(read);
			
			
			while(rs.next()) {
				int farmerId=rs.getInt("farmerId");
				String farmerName=rs.getString("farmerName");
				int farmerLoan=rs.getInt("farmerLoan");
				String farmerLocation=rs.getString("farmerLocation");
				System.out.println(farmerId+" ,"+farmerName+" ,"+farmerLoan+" ,"+farmerLocation );
			}
			
			System.out.println("inserted record");
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			con.close();
			stat.close();

		}
	}

}
