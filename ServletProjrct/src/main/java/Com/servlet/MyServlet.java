package Com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet
public class MyServlet extends HttpServlet{
	public void doGet (HttpServletRequest request , HttpServletResponse response ) throws IOException {
		
		PrintWriter out = response.getWriter();
//		out.println("Hello");
		
		//ServletContext
		
//		ServletContext context= getServletContext();
//		String str =context.getInitParameter("city");
//		out.println(str); 
		
//		//ServletConfig
//		ServletConfig config = getServletConfig();
//		String str1=config.getInitParameter("name");
//		out.println(str1);
		
		}
		
				
		
	}

