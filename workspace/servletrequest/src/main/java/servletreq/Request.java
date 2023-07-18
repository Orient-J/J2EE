package servletreq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReqServlet")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Request() {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		response.getWriter().append("Served at: ").append(request.getContextPath());

    	response.setContentType("text/html");
    	
    	PrintWriter pw = response.getWriter();
    	
    	String name = request.getParameter("username");
    	
    	pw.println("hello , " + name );
    	
    	pw.close();
    }

}
