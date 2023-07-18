package servletpakcage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletApp() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		pw.println("<i>This Run Servlet</i>");
		pw.println("</html></body>");
	}

}
