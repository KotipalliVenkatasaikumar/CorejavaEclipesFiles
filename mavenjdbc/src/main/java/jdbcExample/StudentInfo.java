package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentInfo {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
//		String table = "create table studentdetails.StudentInfo(" + "StuId int primary key ,"
//				+ "StuName varchar(40) not null," + "StuClass int not null," + "Telugu int not null, "
//				+ "English int not null," + " Maths int not null)";
//		String insert = "insert into studentdetails.studentinfo values(?,?,?,?,?,?,?,?,?,?,?)";
//		String groupby = "SELECT * from StudentInfo where English in (select max(English) from StudentInfo) ";
		String gender = "SELECT gender ,COUNT(*) AS count FROM studentinfo GROUP BY gender;";
		String read = "selecct * from studentinfo";
		String grade = "SELECT Grade ,COUNT(*) AS count FROM studentinfo GROUP BY Grade;";
		String sum = "select StuId, StuName , English+Telugu+maths as sum  from studentdetails.studentinfo";
		String percentage = "select StuId, StuName , English+Telugu+maths  as sum, ((English+Telugu+maths)/300)*100 as percentage  from studentdetails.studentinfo order by percentage,Dob desc  ";
		String sumOfFirst = "SELECT StuId, StuName, English + Telugu + Maths AS total_sum FROM studentdetails.studentinfo ORDER BY total_sum DESC LIMIT 1";
		String sumOffirst2 = "SELECT StuId, StuName,  English + Telugu + Maths AS total_sum FROM studentdetails.studentinfo WHERE English + Telugu + Maths = (SELECT max(English + Telugu + Maths) FROM studentdetails.studentinfo)";
        String maxMaleFemale="SELECT StuId, StuName, gender, (English + Telugu + Maths) as total_marks FROM studentdetails.studentinfo WHERE (English + Telugu + Maths) IN (SELECT MAX(English + Telugu + Maths) as max_Sal FROM studentdetails.studentinfo GROUP BY gender)"
        		; 
//		String read = "select * from StudentInfo ";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "root");
			stat = con.prepareStatement(maxMaleFemale);
//			stat.setInt(1, 6);
//			stat.setString(2, "Varshini");
//			stat.setInt(3, 10);
//			stat.setInt(4, 88);
//			stat.setInt(5, 75);
//			stat.setInt(6, 90);
//			stat.setString(7, "F" );
//			stat.setString(8, "2000/08/24");
//			stat.setString(9, "A");
//			stat.setString(10, "Dno:2/a-158, Bangalore");
//			stat.setString(11, "Karnataka");

//			stat.executeUpdate();
			rs = stat.executeQuery();
			while (rs.next()) {
//				
//				int count =rs.getInt("count");

//				System.out.println(rs.getString("StuId") + " :" + rs.getString("StuName") + " " + rs.getInt("sum"));
//				System.out.println(rs.getString("StuId")+" :"+ rs.getString("StuName") + " "+ rs.getInt("sum") +" :"+ rs.getInt("percentage"));
                System.out.println(rs.getInt("StuId")+ " :" + rs.getString("stuName")+ " "+ rs.getString("gender") +" :" + rs.getInt("total_marks"));  
			}

			System.out.println("craeted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
