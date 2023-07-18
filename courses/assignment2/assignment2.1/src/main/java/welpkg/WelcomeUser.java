package welpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WelcomeUser")
public class WelcomeUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body "
				+ "style='"
				+ "background-color: black;"
				+ "color: white;"
				+ "height: 100vh;"
				+ "overflow: hidden'"
				+ ">");
		pw.println("<marquee style='line-height: 100vh; font-size: 3em'><b>Welcome User - </b>" + request.getParameter("username") + "<marquee>");
		pw.println("</html></body>");
	}

}
