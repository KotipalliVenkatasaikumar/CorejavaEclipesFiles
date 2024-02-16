package Com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//		int sum = (int) request.getAttribute("sum");
//		sum = sum * sum;
//		PrintWriter out = response.getWriter();
//		out.println("Result of " + sum);

		// sendRedirect
//		System.out.println("sq calling");
//		int sum = Integer.parseInt(request.getParameter("sum"));
//		sum = sum * sum;
//		PrintWriter out = response.getWriter();
//		out.println("Result of " + sum);

		// Http Session cookie
//		HttpSession session = request.getSession();
//		int sum = (int) session.getAttribute("sum");
//		sum = sum * sum;
//		PrintWriter out = response.getWriter();
//		out.println("Result of " + sum);
//		System.out.println("sq calling");

		// cookies
		int sum = 0;
		Cookie cookie[] = request.getCookies();
		for (Cookie cookie2 : cookie) {
			if (cookie2.getName().equals("sds")) {
				sum = Integer.parseInt(cookie2.getValue());
			}
		}
		sum = sum * sum;
		PrintWriter out = response.getWriter();
		String html1 = "<html> <title>My output  here</title>\r\n";
		html1 = html1 + "<b>Result of " + sum + "</b>";

		html1 = html1 + " </html>";

		out.println(html1);

		System.out.println("sq calling");
		
		
		
	}

}
