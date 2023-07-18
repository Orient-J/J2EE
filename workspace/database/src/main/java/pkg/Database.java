package pkg;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	
	private Connection connection;
	private Statement statement;
	private ResultSet result;
	
	public Database() throws SQLException, ClassNotFoundException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost/userdb", "root", "root@password#007");
		
		statement = connection.createStatement();
	}
	
	public void showData(String table) throws SQLException, ClassNotFoundException {
		
		result = statement.executeQuery("SELECT * FROM " + table + " ;");
		
		while( result.next() ) {
			
			System.out.print(result.getInt("id"));
			System.out.print(result.getString("fullname"));
			System.out.println("");
			
		}
	}
}