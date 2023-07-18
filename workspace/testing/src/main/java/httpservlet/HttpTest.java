package httpservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


/**
 * Servlet implementation class HttpTest
 */
@WebServlet("/HttpTest")
public class HttpTest extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<b>HttpServlet Hello</b>");
		out.print("</html></body>");
		
		out.close();
	}
}
