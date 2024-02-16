
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class Crud
 */
@WebServlet("/Crud")
public class Crud extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

//		System.out.println("successfully " + operationName);

//		out.println(operationName);
//		out.println(id);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
			String operationName = request.getParameter("operation");
			
			PrintWriter out = response.getWriter();
			if (operationName.equalsIgnoreCase("insert")) {
				int stuid = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name");
				String fname = request.getParameter("fname");
				String address = request.getParameter("address");
				String country = request.getParameter("country");

				String insert = "insert into register values(?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(1, stuid);
				ps.setString(2, name);
				ps.setString(3, fname);
				ps.setString(4, address);
				ps.setString(5, country);
				
				int i = ps.executeUpdate();
				if (i > 0) {
					out.print("you are succesfully register ");
				} else {
					out.print("Enter valid id");
				}

			} else if (operationName.equalsIgnoreCase("delete")) {

				int id = Integer.parseInt(request.getParameter("id"));
				String delete = "DELETE FROM register WHERE id = ?";
				PreparedStatement ps = con.prepareStatement(delete);
				ps.setInt(1, id);
				int rowsAffected = ps.executeUpdate();

				if (rowsAffected > 0) {
					out.println("deleted successfully" + rowsAffected);
				} else {
					out.println("enter correct number ");
				}

			} else if (operationName.equalsIgnoreCase("view")) {
				int id = Integer.parseInt(request.getParameter("id"));
				String view = "select * from register where id=?";
				PreparedStatement ps = con.prepareStatement(view);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					String result = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
							+ " " + rs.getString(5);
					out.print(result);
				}

			} else if (operationName.equalsIgnoreCase("update")) {

				String update = "update register set name=?,f_name=?,address=?,country=? where id=?";

				int stuid = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name");
				String fname = request.getParameter("fname");
				String address = request.getParameter("address");
				String country = request.getParameter("country");

				PreparedStatement ps = con.prepareStatement(update);

				ps.setString(1, name);
				ps.setString(2, fname);
				ps.setString(3, address);
				ps.setString(4, country);
				ps.setInt(5, stuid);

				int rowsAffected = ps.executeUpdate();
				System.out.println(rowsAffected);

				if (rowsAffected > 0) {
					out.println("updated successfully" + rowsAffected);
				} else {
					out.println("enter correct number ");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}
}
