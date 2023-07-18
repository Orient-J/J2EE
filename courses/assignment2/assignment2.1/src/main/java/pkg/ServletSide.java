package pkg;

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
//		pw.println("Username is " + request.getParameter("username") + "<br/>");
//		pw.println("Password is " + request.getParameter("password") + "<br/>");
//		pw.println("</html></body>");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if( username.equals("ucsy") && password.equals("ucsy123") ) {
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WelcomeUser");
			
			requestDispatcher.forward(request, response);
			
		}else {
			
			pw.println("<html><body>");
			pw.println("<script>");
			pw.println("window.alert('Your Username or Password is Wrong!!!')");
			pw.println("</script>");
			pw.println("</html></body>");
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
			
			requestDispatcher.include(request, response);
			
		}
	}

}
