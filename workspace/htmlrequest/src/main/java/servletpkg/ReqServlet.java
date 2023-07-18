package servletpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReqServlet")
public class ReqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body><ul>");
		pw.println("<li>"+ request.getParameter("username") +"</li>");
		pw.println("<li>"+ request.getParameter("email") +"</li>");
		pw.println("<li>"+ request.getParameter("password")+"</li>");
		pw.println("</html></body></ul>");
		
//		doGet(request, response);
	}

}
