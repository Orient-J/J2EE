package pkg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
@WebServlet("/Servlet1")
public class ServletFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		
		session.setAttribute("username", username);
		
		pw.println("Username is " + username + "<br/>");
		
		pw.println("<a href='Servlet2' target='_top'>To Second Servlet</a>");
		
	}

}
