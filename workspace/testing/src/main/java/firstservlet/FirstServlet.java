package firstservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet{
//	private static final long serialVersionUID = 1L;
	
	
	ServletConfig config;
	
	public void init(ServletConfig config) {
		
		this.config = config;
		
		System.out.println("Server is initialized...");
	}
	
	public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.print("<html><body>");
		writer.print("<b>Hello Complex Servlet</>");
		writer.print("</html></body>");
	}
	
	public void destroy() {
		
		System.out.println("Servlet Is Destroyed!!!");
	}
	
	public ServletConfig getServletConfig() { return this.config; }
	
	public String getServletInfo() { return "owned by kyaw pyae sone"; }

}
