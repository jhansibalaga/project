package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class userdb {
	private static final String Driver ="com.mysql.cj.jdbc.Driver";
	private static final String username ="root";
	private static final String password="root";
	private static final String url ="jdbc:mysql://localhost:3306/facebook";	
	private static Connection conn = null;
	
	public static Connection getconn() {
		try {
			
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
         
}
