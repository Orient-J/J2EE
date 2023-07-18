package generic;

//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;

import javax.servlet.GenericServlet;
import javax.servlet.*;
import java.io.*;

/**
 * Servlet implementation class ServletGeneric
 */
//@WebServlet("/ServletGeneric")
public class ServletGeneric extends GenericServlet {
//	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html");
		
		PrintWriter output = response.getWriter();
		
		output.write("<html><body>");
		output.write("<b>Hello From Generic Servlet</b>");
		output.write("</html></body>");
	}
}
