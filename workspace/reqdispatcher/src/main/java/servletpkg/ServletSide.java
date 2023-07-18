package servletpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletSide")
public class ServletSide extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
//		pw.println("<html><body>");
//		pw.println("Username is " + request.getParameter("username"));
//		pw.println("<br/>");
//		pw.println("Password is " + request.getParameter("password"));
//		pw.println("</html></body>");
		
		if( !request.getParameter("username").equals("Kyaw Pyae Sone") && !request.getParameter("password").equals("kps@007") ) {
			
			pw.println("Your Username or Password is wrong!!");
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/form.html");
			
			requestDispatcher.include(request, response);
		
		}else {
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Welcome");
		
			requestDispatcher.forward(request, response);
		}
	}

}
