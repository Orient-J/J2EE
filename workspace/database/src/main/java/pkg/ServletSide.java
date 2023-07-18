package pkg;

import pkg.Database;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletSide")
public class ServletSide extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Database database;

	public ServletSide() {
		
		try {
			database = new Database();
			
			database.showData("users");
		
		}catch(Exception exception) {
			
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
