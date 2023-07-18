package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/ServletSide")
public class ServletSide extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
	
	private Statement statement;
	
	private ResultSet result ;

    public ServletSide() throws SQLException, ClassNotFoundException {
    	
    	try {
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	connection = DriverManager.getConnection("jdbc:mysql://localhost/userdb", "root", "root@password#007");
        	
        	statement = connection.createStatement();
        	
        	ResultSet result = statement.executeQuery("SELECT * FROM users;");
    	
    	}catch(Exception exception) {
    		
    		
    	}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><table border='1'>");
	
		pw.println("<tr>"
				+ "<th>ID</th>"
				+ "<th>fullname</th>"
				+ "<th>email</th>"
				+ "<th>password</th>"
				+ "</tr>");
		
		try {
			
			while( result.next() ) {
				
				pw.print("<tr>");
				pw.print("<td>"+ "id" +"</td>");
				pw.print("<td>"+ result.getString("fullname") +"</td>");
				pw.print("<td>"+ result.getString("email") +"</td>");
				pw.print("<td>"+ result.getString("password") +"</td>");
				pw.print("</tr>");
			}
		
		}catch(SQLException exception) {
			
			pw.println("<tr>"
					+ "<th>ID</th>"
					+ "<th>fullname</th>"
					+ "<th>email</th>"
					+ "<th>password</th>"
					+ "</tr>");
			
		}
		
		pw.println("</html><table>");
	}

}
