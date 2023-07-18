package chapter6.test3;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class Database {
    
    private Connection connection;

    public Database() throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://localhost/userdb", "root","root@password#007");
    }

    public String insertData(String data[]) throws SQLException {

        PreparedStatement prep = connection.prepareStatement("INSERT INTO users(fullname, email, password) VALUES (?,?,?)");

        for( int idx = 0; idx < data.length; idx++ ) {

            prep.setString(idx + 1, data[idx]);
        }

        if( prep.executeUpdate() > 0 ) return "Insertion is successful"; else return "Insertion fail";
    }

    public String getData() throws SQLException{

        Statement statement = connection.createStatement();

        ResultSet result = statement.executeQuery("SELECT * FROM users");

        String content = "<tr><th>ID</th><th>Full Name</th><th>Email</th><th>Password</th></tr>";
        
        while( result.next() ) {


            content += 
            "<tr>" + 
                "<td>" + result.getInt("id") + "</td>" +
                "<td>" + result.getString("fullname") + "</td>" +
                "<td>" + result.getString("email") + "</td>" +
                "<td>" + result.getString("password") + "</td>" +
            "</td>"
            ;
            
        }

        return "<html><table border='1' >" + content + "</table></html>";
    }   
}
