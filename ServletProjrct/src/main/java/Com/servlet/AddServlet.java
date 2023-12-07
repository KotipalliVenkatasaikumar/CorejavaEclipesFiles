package Com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			int num1 = Integer.parseInt(request.getParameter("number1"));
			int num2 = Integer.parseInt(request.getParameter("number2"));
			int sum = num1 + num2;

//		//print the Response
//		PrintWriter out =response.getWriter();
//		out.println("result "+ sum);

			// Sending request object to another Servlet.

//		request.setAttribute("sum", sum );
//		RequestDispatcher rd=request.getRequestDispatcher("sq");
//		rd.forward(request, response);

			// sendRedirect

//		response.sendRedirect("sq?sum="+sum);  // URL Rewriting

			// HTTP session cookie

//		HttpSession session = request.getSession();
//		session.setAttribute("sum", sum);
//		response.sendRedirect("sq");

			// Cookies
			Cookie cookie = new Cookie("sds", sum + "");
			response.addCookie(cookie);
			response.sendRedirect("sq");
		} catch (Exception e) {
			PrintWriter out = response.getWriter();
			out.println("ENTER NUMBERS ONLY");

		}

	}
}
