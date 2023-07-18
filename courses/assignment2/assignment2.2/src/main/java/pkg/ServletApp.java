package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
//		pw.println("Roll No : " + request.getParameter("roll"));
//		pw.println("Name : " + request.getParameter("name"));
//		pw.println("Email : " + request.getParameter("email"));
//		pw.println("Major : " + request.getParameter("major"));
//		pw.println("Phone number : " + request.getParameter("phone"));
		
			
			pw.println("<table border='1' style='width: 1000px'>");
				
				pw.println("<tr>");
				
					pw.println("<th>Roll NO</th>");
					pw.println("<th>Name</th>");
					pw.println("<th>Email</th>");
					pw.println("<th>Major</th>");
					pw.println("<th>Phone Number</th>");
					
				pw.println("</tr>");
				
				pw.println("<tr>");
				
					pw.println("<td>"+ request.getParameter("roll") +"</td>");
					pw.println("<td>" + request.getParameter("name") +"</td>");
					pw.println("<td>" + request.getParameter("email") +"</td>");
					pw.println("<td>" + setMajor(request.getParameter("major")) +"</td>");
					pw.println("<td>" + request.getParameter("phone") +"</td>");
					
				pw.println("</tr>");
			
			pw.println("<table>");
		
		pw.println("</html></body>");
	}

	private String setMajor(String major) {
		
		String subject;
		
		switch(major.toLowerCase()) {
		
			case "se":
				subject = "Software Engineering";
			break;
			
			case "ke":
				subject = "Knowledge Engineering";
			break;
			
			case "bis":
				subject = "Business Infomration System";
			break;
			
			case "csf":
				subject = "Cyber Security Forensis";
			break;
			
			case "hpc":
				subject = "High Perfomance Computing";
			break;
			
			case "es":
				subject = "Embedded System";
			break;
			
			case "net":
				subject = "Networking";
			break;
			
			default :
				subject = "-";
		}
		
		return subject;
	}
}
