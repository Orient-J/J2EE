package servletpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletSide")
public class ServletSide extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		pw.println("You Choose : " + request.getParameter("website"));
		pw.println("</html></body>");
		
//		Redirecting to wanted Website
		
//		switch(request.getParameter("website")) {
//		
//			case "google":
//				response.sendRedirect("https://www.google.com"); // URL must contain http
//			break;
//			
//			case "youtube":
//				response.sendRedirect("https://www.youtube.com");
//			break;
//			
//			case "map":
//				response.sendRedirect("https://maps.google.com");
//			break;
//			
//			case "chatgpt":
//				response.sendRedirect("https://openai.com/blog/chatgpt");
//			break;
//			
//			default :
//				response.sendRedirect("https://ucsy.edu.mm");
//		}
		
		
//		For Google Searching 
		
//		response.sendRedirect("https://www.google.com/search?q=" + request.getParameter("search"));
			
	}

}
